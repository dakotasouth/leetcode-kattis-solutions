arr = []
for i in range(5):
    if 'FBI' in input():
        arr.append(i+1)
if len(arr) == 0:
    print('HE GOT AWAY!')
else:
    for i in arr:
        print(i, end=' ')