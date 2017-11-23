#!/usr/bin/env python


import sys



def res (r, n):
    if len(r) == 1:
        return r[0]
    l = len(r)
    for i in range(0, len(r)/2, 1):
        if r[i] == r[i+1]:
            del r[i+1]
        else:
            if n%2:
                r[i] = 0
                del r[i+1]
            else:
                r[i] = 1
                del r[i+1]
    return res(r,n -1)

def test (n,l,i,low,high, score):
    if (i == 0):
            return test(n,l,i+1,low-1,high+1,score + l[low]%2) + test(n,l,i+1,low-1,high+1,score + l[high]%2)
    if (high >= n): high = 0
    if (i == n):
        return [int (score > 0)]
    #even
    if i%2 == 0:
        return test(n,l,i+1,low-1,high,score + l[low]%2) + test(n,l,i+1,low,high+1,score + l[high]%2)
    #odd
    else:
        return test(n,l,i+1,low-1,high,score - int(l[low]%2)) + test(n,l,i+1,low,high+1,score - int(l[high]%2))


with open(sys.argv[1], 'r') as f:
    contents = f.read()


n = int(contents.split("\n")[0])
l =  map(int, contents.split("\n")[1].split(' '))



for i in range(n):
    results = test (n,l,0,i,i, 0);
    w = res(results, n+1)
    print w
