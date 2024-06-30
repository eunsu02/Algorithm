# 숫자 카드 게임

n, m = map(int, input().split())
min_list = []

for i in range(n):
    num = list(map(int, input().split()))
    min_list.append(min(num))

print(max(min_list))
