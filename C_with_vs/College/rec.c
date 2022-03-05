#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int function(int i)
{
    if(i==0)
    {
        return 0;
    }
    printf("%d\n", i);
    function(--i);
}

int main()
{
    //When a function calls itself, it is called recursion.
    function(10);
    return 0;
}