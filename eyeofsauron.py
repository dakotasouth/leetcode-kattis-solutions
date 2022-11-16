list = list(input().split("()"))
if len(list[0]) != len(list[1]):
    print("fix")
else:
    print("correct")