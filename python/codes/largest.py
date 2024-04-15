n=int(input("Enter no. of numbers you want to add: "))
array=[]

print("Enter the elements")
for i in range(0,n):
    x=int(input())
    array.append(x)

b=array[0]

for i in range(0,n):
    if b<=array[i]:
        b=array[i]

print("Largest Number is",b)