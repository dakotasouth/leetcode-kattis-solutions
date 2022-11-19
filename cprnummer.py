cpr = [*input()]

valid = [4,3,2,7,6,5,0,4,3,2,1]
total = 0
for i in range(len(cpr)):
    if i == 6:
        continue
    total += int(cpr[i]) * int(valid[i])

if total % 11 == 0:
    print(1)
else:
    print(0)