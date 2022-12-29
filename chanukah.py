for i in range(int(input())):
    inp = input().split()
    k = int(inp[0])
    n = int(inp[1])
    print(k, int((n*(n+1)) / 2 + n))