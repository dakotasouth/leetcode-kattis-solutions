line = [*input()]
wspc = 0
lcs = 0
upp = 0
sym = 0
for i in line:
    if i == '_':
        wspc += 1
    elif ord(i) > 64 and ord(i) < 91:
        upp += 1
    elif ord(i) > 96 and ord(i) < 123:
        lcs +=1
    else:
        sym += 1

print(wspc / len(line))
print(lcs / len(line))
print(upp / len(line))
print(sym / len(line))