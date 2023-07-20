a,b=input().split()
b=int(b)
alist=list()
sum=0
for i in range(len(a)):
    if a[i].isalpha():
        alist.append(ord(a[i])-55)
    else:
        alist.append(int(a[i]))
for i in range(len(a)):
    sum+=(b**(len(a)-(i+1)))*alist[i]
print(sum)