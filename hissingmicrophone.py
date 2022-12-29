line = [*input()]
hiss = False

for i in range(len(line)-1):
    if(line[i] == 's' and line[i+1] == 's'):
        hiss = True

if hiss:
    print('hiss')
else:
    print('no hiss')