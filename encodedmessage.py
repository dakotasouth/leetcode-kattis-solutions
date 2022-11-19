import math
for i in range(int(input())):
    string = input()
    size = int(math.sqrt(len(string)))
    square = [string[i:i+size] for i in range(0, len(string), size)]
    ans = ''
    for x in reversed(range(size)):
        for y in range(size):
            ans += square[y][x]
    print(ans)