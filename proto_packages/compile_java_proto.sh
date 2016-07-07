#!/usr/bin/env bash
rm -rf ./compiled_java
mkdir ./compiled_java
protoc --java_out=./compiled_java BI.proto

