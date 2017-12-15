#!/usr/bin/env python

import sys


def hm (f, g): 
    n = 0
    for i in range(0, len(f)):
        if (f[i] != g[i]): n+=1
    return n

def he (f, g, p): 
    n = 0
    for i in range(0, len(f)):
        if (f[i] != p[i]): n+=1
        if (g[i] != p[i]): n+=1
    return n

data = sys.stdin.readline()

f = str(int(sys.stdin.readline()))
g = str(int(sys.stdin.readline()))

q, n, d = (int (d) for d in data.split())


diff = hm (f,g)
sim = n - diff

# sim = 2x diff only, posible positions 
# n - 1, 1 0x 

# diff 1x or 2x, n-2 2x, and 2 1x 

print diff 
print sim 


if (d > n): 
    print 0 
    sys.exit()
elif (diff > n):
    print 0 
    sys.exit()

#calc number of evens and odds needed
#single = 2x 
#double = 1x 

#single = n - 2 
#double = n -1 









