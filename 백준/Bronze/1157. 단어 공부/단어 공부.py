w=input().upper()
w_set=list(set(w))
count=[]
for i in w_set:
    count.append(w.count(i))

if count.count(max(count))>1:
    print("?")
else:
    print(w_set[count.index(max(count))])