c=int(input())
cnt=0
for i in range(0,c):
    n=list(map(int,input().split()))
    sum=0
    for j in range(1,n[0]+1):
        sum=sum+n[j]
    for k in range(1,n[0]+1):
        if n[k]>(sum/n[0]):
            cnt+=1
    print("%0.3f"%(cnt/n[0]*100)+"%")
    sum=0
    cnt=0