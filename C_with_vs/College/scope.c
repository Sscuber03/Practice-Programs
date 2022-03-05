#include<stdio.h>

int sum;//Globally initialized variable will have value as 0, not any garbage value

//int  0
//char  '\0'
//folat 0
//double 0
//pointer NULL

int addition(int a,int b)//parameter list
{
    sum = a+b;
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
    printf("%d", sum);
    return 0;
}