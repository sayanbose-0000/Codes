# Calculate gcd and lcm of a number

a=$1
b=$2

i=1
hcf=0
while (( i <= $a && i <= $b )); do
  if (( a % i == 0 && b % i == 0 )); then
    hcf=$i
  fi
  i=$((i + 1))
done

echo $hcf
