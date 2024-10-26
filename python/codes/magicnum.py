def inpt():
    n=int(input("Enter a number : "))
    return n

def checkmagic(n,s):
    while (n!=0):
        d=n%10
        s=s+d
        n=n//10
    if (s!=1):
        if(s%10!=s):
            return checkmagic(s,0)  #recursion
        else:
            return -1
    if (s==1):
        return s

def main():
    x=inpt()
    m=x
    res=checkmagic(m,0)
    if res==1:
        print("It is a magic number.")
    else:
        print("It is NOT a magic number.")

main()