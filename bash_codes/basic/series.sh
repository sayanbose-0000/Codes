#!/bin/bash
# f(x,n) = 1 + x^2/2! + x^4/4! + ...
factorial() {
  n=$1
  f=1
  for ((i=1; i<=n; i++)) {
    f=$((f*i))
  }
  echo $f
}

echo -n "Enter x: "
read x

echo -n "Enter n: "
read n

i=0
j=1
sum=0

while [ $j -le $n ]
do
  num=$(echo "$x^$i" | bc)
  den=$(factorial $i)
  temp=$(echo "scale=5; $num / $den" | bc)
  sum=$(echo "scale=5; $sum + $temp" | bc)

  i=$((i+2))
  j=$((j+1))
done

echo "Sum of series is: $sum"