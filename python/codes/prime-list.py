#check if each number is prime in a given list of numbers. Return True if all are prime. Otherwise return false
def allPrime(li,n):
    count=0
    for i in range(0,n):
        for j in range(2,int(li[i]/2)):
            if li[i]%j==0:
                count=count+1
                break
    return count
def main():
    li=list()

    n=int(input("Enter size: "))
    for i in range(0,n):
        li.append(int(input()))

    count=allPrime(li,n)
    if(count==n):
        print("True")
    else:
        print("False")
main()