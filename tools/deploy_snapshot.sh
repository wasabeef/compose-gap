#!/bin/bash

# TODO: Modify these
REPOSITORY="lcdsmao/kotlin-anroid-template"
REF="refs/heads/master"

set -e

VERSION_NAME=$(grep VERSION_NAME gradle.properties)

if [[ ! "$VERSION_NAME" =~ "SNAPSHOT" ]]; then
  echo "Skipping snapshot deployment: wrong version name '$VERSION_NAME'."
elif [[ "$GITHUB_REPOSITORY" != "$REPOSITORY" ]]; then
  echo "Skipping snapshot deployment: wrong repository. Expected '$REPOSITORY' but was '$GITHUB_REPOSITORY'."
elif [[ "$GITHUB_EVENT_NAME" != "push" ]]; then
  echo "Skipping snapshot deployment: was '$GITHUB_EVENT_NAME'."
elif [[ "$GITHUB_REF" != "$REF" ]]; then
  echo "Skipping snapshot deployment: wrong ref. Expected '$REF' but was '$GITHUB_REF'."
else
  echo "Deploying..."
  ./gradlew clean publish --no-daemon --no-parallel -PmavenCentralUsername="$MAVEN_USERNAME" -PmavenCentralPassword="$MAVEN_PASSWORD"
  echo "Deployed!"
fi
