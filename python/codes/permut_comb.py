#write a python program to show the permutation and combination of an inputted list
import itertools

n=int(input("Enter the number of elements in the list: "))
arr=[]
for i in range(0,n):
    arr.append(int(input("Enter: ")))
print(list(itertools.permutations(arr)),end="\n")
r=int(input("Enter r: "))
print(list(itertools.combinations(arr,r)))