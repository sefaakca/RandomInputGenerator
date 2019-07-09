#!/bin/bash

file_name=$(basename "$2")
output_file="$file_name"_scenario.json

#for file in ./bin/*;do
#	echo "$(basename "$file")"
#done

java -jar ABIAnalyser.jar "$1" "$2" "$3" "$4" "$output_file"

if [-s "$output)file"]
then
  echo "scenario file created"
else
  echo "scenario file not created"
  exit
fi
