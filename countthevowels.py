vowels = ['a','e','i','o','u']
line = [*input()]
total = 0
for i in line:
    if i.lower() in vowels:
        total += 1

print(total)