#!/bin/bash


kotlinc $1 -include-runtime -d hello.jar
java -jar hello.jar