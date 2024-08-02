a=$1
b=$2

gcd () {
  a=$1
  b=$2
  i=1
  res=0

  while [ $i -le $a -a $i -le $b ]
  do
    if [ $((a % i)) -eq 0 -a $((b % i)) -eq 0 ]
    then
      res=$i
    fi
    i=$((i+1))
  done

  echo "$res"
}

lcm () {
  a=$1
  b=$2
  gcd=$3
  
  res=$(((a * b) / gcd))
  echo $res
}

gcd_val=$(gcd $a $b)
lcm_val=$(lcm $a $b $gcd_val)

echo "Lcm is $lcm_val and gcd is $gcd_val"