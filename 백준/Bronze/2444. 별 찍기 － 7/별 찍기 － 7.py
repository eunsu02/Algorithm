from copy import copy
a=int(input())
b=copy(a)
for i in range (1,a+1):
    print(" "*(a-i)+"*"*(2*i-1))
for j in range(1,b):
    print(" "*j+"*"*(2*(b-j)-1))