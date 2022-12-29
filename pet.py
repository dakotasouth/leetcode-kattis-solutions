ans = [-1,-1]

for i in range(5):
    arr = list(input().split())
    for j in range(len(arr)):
        arr[j] = int(arr[j])

    if sum(arr) > ans[1]:
        ans[0] = i+1
        ans[1] = sum(arr)
    
print(ans[0], ans[1])