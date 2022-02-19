#include<stdio.h>

int main()
{
    int a = 10, b = 20, c = 30;

    if(a>=10)
    {
        if(a>=20)
        {
            printf("20");
        }
        else
        {
            printf("Lesser than 20");
        }
    }
    printf("\n");
    printf("%d",(a>=10));
    printf("\n");
    printf("%d",(a>=20));
    printf("\n");
}