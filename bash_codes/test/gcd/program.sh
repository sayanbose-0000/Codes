li=2
total_line_no=$(wc -l testcase.txt | cut -d " " -f1)

echo "A...B...Expected...Output...Pass/Fail"
while [ $li -le $total_line_no ]
do
  a=$(head -n $li testcase.txt | tail -n 1 | cut -d " " -f1)
  b=$(head -n $li testcase.txt | tail -n 1 | cut -d " " -f2)
  expected=$(head -n $li testcase.txt | tail -n 1 | cut -d " " -f3)
  output=$(bash gcd.sh $a $b)

  echo -n "$a $b $expected $output"

  if [ $expected -eq $output ]
  then
    echo -n " ----> Passed"
  else
    echo -n " ----> Failed"
  fi

  li=$((li + 1))


  printf "\n"
done