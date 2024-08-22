n,t=map(int,input().split())
dp=[0]*(t+1)
for i in range(n):
    time,score=map(int,input().split())
    for j in range(t,time-1,-1):
        dp[j]=max(dp[j],dp[j-time]+score)
print(dp[t])