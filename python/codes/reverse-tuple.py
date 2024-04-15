#write the code to reverse a tuple
def revTuple(tup):
    tup=list(tup)
    tup=tup[::-1]
    tup=tuple(tup)
    return tup

def main():
    ele=input("Enter ele: ").split()
    tup=tuple(map(int,ele))
    x=revTuple(tup)
    print(x)
main()