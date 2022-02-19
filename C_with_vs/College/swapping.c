#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter the value of a :\n");
    scanf("%d",&a);
    printf("Enter the value of b :\n");
    scanf("%d",&b);
    printf("Before swapping: \n");
    printf("a = %d , b = %d \n",a,b);
    int temp;
    temp=a;
    a=b;
    b=temp;

    //without using third variable
    // a=a+b;
    // b=a-b;
    // a=a-b;

    //a=a+b-(b=a);

    // a=a*b;
    // b=a/b;
    // a=a/b;

    //a=a*b/(b=a);

    

    printf("a = %d , b = %d \n",a,b);
}