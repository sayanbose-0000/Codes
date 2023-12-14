import numpy as np

def main():
    arr1=input("Enter first array: ").split()
    arr1=list(map(int,arr1))
    arr1=np.array(arr1)
    arr1=arr1.reshape(3,3)
    print(arr1)

    arr2=input("Enter second array: ").split()
    arr2=list(map(int,arr2))
    arr2=np.array(arr2)
    arr2=arr2.reshape(3,3)
    print(arr2)

    arr3=np.matmul(arr1, arr2)

main()