#! /usr/bin/env bash

for var in "$@"
do
    input="$var"
    replace="html"
    rb=""
    pandoc --quiet -V lang=en --mathjax -c style.css -s "$input" -o "${input/md/$replace}"
done
