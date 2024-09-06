line_no=$(wc -l < testcase.txt)

ls > filelist.txt

for file in $(cat filelist.txt)
do
  printf "\n"
  echo "----- Executing $file -----"

  if [[ "$file" != *.sh ]]
  then
    echo "$file is Incompatible (no *.sh extension)"
    continue
  fi

  if [[ "$file" == program.sh ]]
  then
    echo "$file is an the driver file"
    continue
  fi

  l=2 
  while [ $l -le $line_no ]
  do
    a=$(head -n $l testcase.txt | tail -n 1 | cut -d " " -f 1)
    b=$(head -n $l testcase.txt | tail -n 1 | cut -d " " -f 2)
    e=$(head -n $l testcase.txt | tail -n 1 | cut -d " " -f 3)
    
    o=$(sh $file $a $b)
    echo -n "gcd($a, $b) -> $e | $o"

    if [ "$e" == "$o" ]
    then
      echo " ----> Passed"
    else
      echo " ----> Failed"
    fi

    l=$((l+1))
  done
done
