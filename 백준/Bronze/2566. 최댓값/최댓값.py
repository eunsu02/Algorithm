numbers=[]
maxnum=0
location=[0,0]
for _ in range(9):
    numbers.append(list(map(int,input().split())))

for i in range(9):
    for j in range(9):
        if  numbers[i][j] >= maxnum:
            maxnum=numbers[i][j]
            location[0]=i+1
            location[1]=j+1
print(maxnum)
print(location[0],location[1])
