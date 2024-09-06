echo -n "Enter array: "
read -a nums

n=${#nums[@]}

for ((i=0; i<n-1; i++)) {
  for ((j=0; j<n-i-1; j++)) {
    if [ ${nums[j]} -gt ${nums[j+1]} ]
    then
      temp=${nums[j]}
      nums[j]=${nums[j+1]}
      nums[j+1]=$temp
    fi
    temp=${nums[j]}
  }
}

echo ${nums[@]}