# THIS DIDN'T RUN

main() {
  ls > filelist.txt

  totalLinesFileList=$(wc -l filelist.txt | cut -d " " -f 1)
  currLineFilesList=1

  while (( $currLineFilesList <= $totalLinesFileList )); do
    prog=$(head -n $currLineFilesList filelist.txt | tail -n 1)


    currLineTestCase=2
    totalLinesTestCase=$(wc -l testcase.txt | cut -d " " -f 1)

    while (( $currLineTestCase <= $totalLinesTestCase )); do
      a=$(head -n $currLineTestCase testcase.txt | tail -n 1 | cut -d " " -f 1)
      b=$(head -n $currLineTestCase testcase.txt | tail -n 1 | cut -d " " -f 2)
      e=$(head -n $currLineTestCase testcase.txt | tail -n 1 | cut -d " " -f 3)

      o=$(sh $prog $a $b)

      echo "<<------------------ $prog ------------------>>"

      echo  "$a $b $e (expected) | $a $b $o (real)"
      if  [ "$o" = "$e" ]; then
        echo "Pass"
      else
        echo "Fail"
      fi

      echo "<<------------------ $prog ------------------>>"

      printf "\n"
      printf "\n"

      currLineTestCase=$((currLineTestCase + 1))
    done

    currLineFilesList=$((currLineFilesList + 1))
  done
}

main