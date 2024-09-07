a=$1
b=$2

i=1
gcd=0

while [ $i -le $a -a $i -le $b ]
do
  if [ $(($a % i)) -eq 0 -a $(($b % i)) -eq 0 ]
  then
    gcd=$i
  fi
  i=$((i + 1))
done

echo $gcd