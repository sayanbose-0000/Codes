# Calculate gcd and lcm of a number

hcf() {
  a=$1
  b=$2

  i=1
  count=0
  while (( i <= $a && i <= $b )); do
    if (( a % i == 0 && b % i == 0 )); then
      count=$i
    fi
    i=$((i + 1))
  done

  echo $count
}

lcm() {
  a=$1
  b=$2
  hcf=$3

  val=$(( (a * b) / hcf ))

  echo $val
}

main() {
  echo -n "Enter a: "
  read a

  echo -n "Enter b: "
  read b

  hcf=$(hcf $a $b)
  echo "hcf of $a and $b is $hcf"

  lcm=$(lcm $a $b $hcf)
  echo "lcm of $a and $b is $lcm"
}

main