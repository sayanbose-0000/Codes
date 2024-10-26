#buuble sorting using recursion
def bubbleSort(li,n):
    if (n==1):
        return 

    for i in range(0,n-1):
        if (li[i]>li[i+1]):
            li[i],li[i+1]=li[i+1],li[i] #swapping can be done like this in python

    bubbleSort(li,n-1)

def main():
    ele=input("Enter ele: ").split()
    li=list(map(int,ele))

    bubbleSort(li,len(li))
    print(li)

main()