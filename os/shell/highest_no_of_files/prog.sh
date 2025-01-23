$(ls dir1  > "dir1Count.txt")
$(ls dir2  > "dir2Count.txt")

li1=0
totalLi1=$(wc -l dir1Count.txt | cut -d " " -f 1)

while (($li1 < $totalLi1)); do
  li1=$((li1 + 1))
done

li2=0
totalLi2=$(wc -l dir2Count.txt | cut -d " " -f 1)

while (($li2 < $totalLi2)); do
  li2=$((li2 + 1))
done

if (($li1 < $li2)); then
  echo "Dir 2 contains more files"

else 
  echo "Dir 1 contains more files"
fi
