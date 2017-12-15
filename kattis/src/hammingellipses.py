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


hd = hm (f,g)

#need to draw it out 

