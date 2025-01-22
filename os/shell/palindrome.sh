# Write a shell script to find out palindrome numbers from a list of numbers (Numbers
# should be taken as command line argument)

palindrome() {
  num=$1

  temp=$num
  rev=0

  while ((temp != 0)); do
    a=$((temp % 10))
    rev=$((rev * 10 + a))
    temp=$((temp / 10))
  done
  
  if [ $rev -eq $num ]; then
    printf "%d " "$num"
  fi
}

arr=($@)

n=${#arr[@]}

echo -n "Results is: "

for ((i=0; i<n; i++)); do
  palindrome ${arr[i]}
done