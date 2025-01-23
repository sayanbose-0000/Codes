# Write a shell script to take student records (Roll, Name, Marks) as a input file and
# insert n number of new records to the file as sorted by their marks.

echo -n "Enter no of people: " 
read n

for ((i = 1; i <= n; i++)) {
  echo "Enter data $i (roll name marks): "
  read data
  echo "$data" >> file.txt
}

# -k3 sorts by col 3, -n performs numberic sort, -o is where output will be stored
sort -n -k3 file.txt -o file.txt