ls > filelist.txt

li=1
totalFiles=$(wc -l filelist.txt | cut -d " " -f 1)

store=0
while (($li <= $totalFiles)); do
  name=$(head -n $li filelist.txt | tail -n 1  | cut -d " " -f 1)
  size=$(wc -c $name | cut -d " " -f 1)
  if (($store < $size)); then
    store=$size
  fi

  li=$((li + 1))
done

echo "Largest file is: $store"