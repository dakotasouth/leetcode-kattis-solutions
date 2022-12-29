row, col = input().split()
grid = []
for i in range(int(row)):
    grid.append([*input()])

smashes = [0,0,0,0,0]

for r in range(int(row)-1):
    for c in range(int(col)-1):
        q1 = grid[r][c]
        q2 = grid[r][c+1]
        q3 = grid[r+1][c]
        q4 = grid[r+1][c+1]

        total = 0
        if q1 == '#' or q2 == '#' or q3== '#' or q4 == '#':
            continue
        if q1 == 'X':
            total += 1
        if q2 == 'X':
            total += 1
        if q3 == 'X':
            total += 1
        if q4 == 'X':
            total += 1
        smashes[total] += 1
        
for i in smashes:
    print(i)  
