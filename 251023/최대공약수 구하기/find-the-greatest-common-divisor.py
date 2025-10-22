n, m = map(int, input().split())

def gcd(n,m):
    tmp = 0
    while(m != 0 ):
        tmp = n % m
        n = m
        m = tmp
    return n

print(gcd(n,m))