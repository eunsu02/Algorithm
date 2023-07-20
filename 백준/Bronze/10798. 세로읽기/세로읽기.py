words=list()
for i in range(5):
    word=input()
    words.append(word)
for i in range(15):
    for j in range(5):
        if len(words[j])>=i+1:
            print(words[j][i],end='')