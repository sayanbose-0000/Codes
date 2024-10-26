echo -n "Enter arr: "
read -a num

n=${#num[*]}

for ((i=0; i < n-1; i++)) {
  for ((j=0; j < n-i-1; j++)) {
    if [[ ${num[j+1]} -lt ${num[j]} ]]
    then
      temp=${num[j]}
      num[j]=${num[j+1]}
      num[j+1]=$temp
    fi
  }
}

echo "Sorted: ${num[*]}"