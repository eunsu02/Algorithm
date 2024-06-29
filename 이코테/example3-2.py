# 큰 수의 법칙

import time

n, m, k = map(int, input().split())
numbers = list(map(int, input().split()))

numbers.sort()
first = numbers[-1]
second = numbers[-2]

result = 0
repeat = 0

start_time = time.time()
while True:
    if m == 0:
        break
    if m < k:
        result += first * m
        break
    else:
        result += first * k + second
        m -= k + 1

print(result)
print("직접 작성한 코드 수행 시간 : ", time.time() - start_time)


# 교재 답안
start_time = time.time()
while True:
    for i in range(k):
        if m == 0:
            break
        result += first
        m -= 1
    if m == 0:
        break
    result += second
    m -= 1
print(result)
print("교재 답안 코드 수행 시간 : ", time.time() - start_time)
