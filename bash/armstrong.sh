#!/usr/bin/bash

echo -n "Enter a number: "
read num
saved_num=$num
res=0
count=0

while [ $num -gt 0 ]
do
  num=$((num / 10))
  count=$((count + 1))
done

num=$saved_num

while [ $num -gt 0 ]
do
  p=$((num % 10))
  pow_res=$(echo "$p^$count" | bc)
  res=$((res + pow_res))
  num=$((num / 10))
done

if [ $saved_num -eq $res ]
then
  echo "Armstrong number"
else
  echo "Not Armstrong number"
fi