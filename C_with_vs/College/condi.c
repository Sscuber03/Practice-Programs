#include<stdio.h>

int main()
{
    int a=97;
    if(a>100)
    {
        printf("a is greater than 100\n");// \n represents new line character
    }
    else if(a>95)
    {
        printf("95<a<100\n");
    }
    else if(a>90)
    {
        printf("90<a<95\n");
    }
    else
    {
        printf("a is less than 90\n");
    }
    return 0;
}