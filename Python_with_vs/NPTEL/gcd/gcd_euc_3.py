def gcd(m,n):
    
    if m < n: # Assume m >=n
        (m,n) = (n,m)
        
    if(m%n) == 0:
        return(n)
    else:
        return(gcd(n,m%n)) # m%n < n, always!

print (gcd(101,2))
