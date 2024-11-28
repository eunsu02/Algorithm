import sys
from itertools import combinations

input = sys.stdin.readline

n, m = map(int, input().split())
city = list(list(map(int, input().split())) for _ in range(n))
result = 999999
house = []
chick = []

for i in range(n):
    for j in range(n):
        if city[i][j] == 1:
            house.append([i, j])
        elif city[i][j] == 2:
            chick.append([i, j])

for chi in combinations(chick, m):
    total = 0
    for h in house:
        temp = 999
        for j in range(m):
            temp = min(temp, abs(h[0] - chi[j][0]) + abs(h[1] - chi[j][1]))
        total += temp
    result = min(result, total)

print(result)
