n,d=map(int,input().split())
short=[]
for i in range(n):
    short.append(list(map(int,input().split())))
short.sort()
dp=[i for i in range(d+1)]

for start, dest, length in short:
    for i in range(1, d+1):
        if dest == i:
            dp[i] = min(dp[i], dp[start]+length)
        else:
            dp[i] = min(dp[i], dp[i-1]+1)

print(dp[d])