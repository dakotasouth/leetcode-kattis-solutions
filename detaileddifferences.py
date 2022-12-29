for i in range(int(input())):
    a = input()
    print(a)
    b = input()
    print(b)
    for i in range(len(a)):
        if(a[i] == b[i]):
            print('.',end="")
        else:
            print('*',end="")
    print()
    print()
