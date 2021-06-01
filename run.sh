#!/bin/bash

SHELL_FOLDER=$(cd "$(dirname "$0")";pwd)

echo $SHELL_FOLDER


kt_file=$*

kotlinc $kt_file -include-runtime -classpath ${SHELL_FOLDER}/src -d hello.jar 
java -jar hello.jar