#modify 22 to 222 in the tuple (11,[22,33],44,55)

def main():
    tup=(11,[22,33],44,55)
    tup[1][0]=222
    print(tup)
main()