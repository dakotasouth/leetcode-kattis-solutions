dom = [11,4,3,20,10,14,0,0]
ndom = [11,4,3,2,10,0,0,0]
cards = ['A','K','Q','J','T','9','8','7']
line = input().split()
n = int(line[0])
b = line[1]

total = 0
for i in range(n*4):
    hand = [*input()]
    if (hand[1] == b):
        total += dom[cards.index(hand[0])]
    else:
        total += ndom[cards.index(hand[0])]

print(total)