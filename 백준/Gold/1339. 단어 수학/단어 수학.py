import sys

input = sys.stdin.readline

word_list = []
ans = 0
dic = {}

# 0번
n = int(input())
for _ in range(n):
    word_list.append(input().rstrip())

for i in word_list:
    cnt = len(i)
    for j in i:
        if j not in dic:
            dic[j] = 10 ** (cnt - 1)
        else:
            dic[j] += 10 ** (cnt - 1)
        cnt -= 1

values_lst = list(dic.values())
values_lst.sort(reverse=True)


num = 9
for i in values_lst:
    ans += i * num
    num -= 1

print(ans)
