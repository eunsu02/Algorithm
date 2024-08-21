n=int(input())

#plan[i][0] 소요 시간 , plan[i][1] 받는 돈
plan = [list(map(int,input().split())) for i in range(n)]

dp=[0 for i in range(n+1)]

for i in range(n-1,-1,-1):
    if i+plan[i][0]>n:
        dp[i]=dp[i+1]
    else:
        #dp[i+1] == 일을 안하는 것, plan[i][1]+dp[i+plan[i][0]] = 일을 해서 보수를 받음+ i일 이후 받을 수 있는 돈
        dp[i]=max(dp[i+1],plan[i][1]+dp[i+plan[i][0]])
        
print(dp[0])