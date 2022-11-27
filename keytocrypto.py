cipher = [*input()]
key = [*input()]

key = key[:len(cipher)]
alphabet = [chr(i) for i in range(65, 91)]

for i in range(len(cipher)):
    diff = alphabet.index(cipher[i]) - alphabet.index(key[i])
    if diff < 0:
        diff += 26
    key.append(alphabet[diff])
    print(alphabet[diff], end="")
