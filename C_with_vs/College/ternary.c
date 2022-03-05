#include<stdio.h>

int main()
{
    int i = 0 , j = 2 , k = 5;
    i = j > k ? 1 : 0; // for j=0 in the checking part, i will get the value of 0
    printf("%d\n", i);

    int f = 9;
    if(f = 9)//gives true as anything apart from 0 is true, if f was given 0, it should print false
    {
        printf("True");
    }
    else
    {
        printf("False");
    }

    return 0;
}