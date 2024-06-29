import time

n = 1260  # 1260원을 돌려받아야한다고 가정한다.

coin_type = [500, 100, 10]

count = 0

start_time = time.time()
for coin in coin_type:
    count += int(n / coin)
    n -= coin * int(n / coin)
    if n <= 0:
        break
print(count)
print("첫번째 시도 걸린 시간 : ", time.time() - start_time)

count = 0
n = 1260

start_time = time.time()
for coin in coin_type:
    count += n // coin  # //로 몫을 구할 수 있다.
    n %= coin  # %로 나머지를 구할 수 있다.

print(count)
print("두번째 시도 걸린 시간 : ", time.time() - start_time)
