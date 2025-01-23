# Write a shell script which receives any number of filenames as command line
# argument. The shell script should check whether every argument supplies are a file or a
# directory.

# i) If it is a directory then it should be appropriately reported.
# ii) if it is a file name then name of the file as well as the no. of lines, words present in it should
# be reported.
# iii) Check the file permission for the group. If group has no write permission then gives the write
# permission or vice versa.
# b) Write a C program where parent process send a number to child process using PIPE and
# child process compute the Fibonacci series upto that number.

filestat() {
  file=$1

  lines=$(wc -l $file | cut -d " " -f 1)
  words=$(wc -w $file | cut -d " " -f 1)

  echo "$lines lines and $words words"
}

changeMod() {
  file=$1

  perm=$(ls -l $file | cut -d " " -f 1)
  echo "Before: $perm"

  groupwrite=${perm:5:1}
  echo "Group read: $groupwrite"

  if [ "$groupwrite" == "w" ]; then
    chmod g-w $file
    echo "Removed write permission"
  else
    chmod g+w $file
    echo "Added write permission"
  fi

  permNew=$(ls -l $file | cut -d " " -f 1)
  echo "After: $permNew"
}

file=($@)

n=${#file[@]}
i=0

while (( $i < $n)); do
  currFile=${file[$i]}
  
  echo -n "$currFile --> "

  if [ -f $currFile ]; then
    echo "File"
    filestat $currFile
    changeMod $currFile

  elif [ -d $currFile ]; then
    echo "Folder"

  else
    echo "Doesn't exist"

  fi

  echo "---------------"
  
  i=$((i + 1))
done