#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int function(int i)
{
    if(i==0)
    {
        printf("Basecondition satisfied!\n");
        return 0;
    }
    i++;
    function(i);
    printf("%d\n",i);
    printf("Hello world\n");
}

int main()
{
    //When a function calls itself, it is called recursion.
    function(-4);
    return 0;
}