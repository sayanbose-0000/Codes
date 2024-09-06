#!/usr/bin/bash

echo -n "Enter year: "
read year # -n used previously takes input in same line and not next line

if [ $((year % 400)) -eq 0 -o  $((year % 4)) -eq 0 -a $((year % 100)) -ne 0 ]
then
  echo "$year is a leap year"
else
  echo "$year is not a leap year"
fi