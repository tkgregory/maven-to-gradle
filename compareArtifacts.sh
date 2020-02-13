#!/bin/sh
MAVEN=target/maven-to-gradle-0.0.1-SNAPSHOT.jar
GRADLE=build/libs/maven-to-gradle-0.0.1-SNAPSHOT.jar

ls -l --block-size=M $MAVEN  | awk '{print $9, $5}'
ls -l --block-size=M $GRADLE  | awk '{print $9, $5}'