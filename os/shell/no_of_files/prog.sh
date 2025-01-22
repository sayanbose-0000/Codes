ls > filelist.txt

count=0

for file in $(cat filelist.txt); do
  count=$((count + 1))
done

printf "\n" >> filelist.txt
echo "Total files $count" >> filelist.txt
