#include<stdio.h>

int addition(int a,int b)//parameter list
{
    return a+b;
}

int main()
{
    int c = addition(2,3);
    int d = addition(4,91);
    printf("%d", c);
    printf("\n");
    printf("%d", d);
    printf("\n");
    return 0;
}