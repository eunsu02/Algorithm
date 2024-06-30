# 예제 3-1과 다르게, 화단위가 500원, 400원, 100원이 된다면?

n = 800
coin_type = [500, 400, 100]
total_count = 0
count = 0

for coin in coin_type:
    count = n // coin
    if count == 0:
        continue
    total_count += count
    n %= coin
