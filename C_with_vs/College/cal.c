#include<stdio.h>

int main()
{
    int a,b;
    int ch;
    int c=0;
    printf("Enter two numbers to perform task on\n");
    scanf("%d%d",&a,&b);
    printf("Enter 1 to add,2 to subtract,3 to multiply\n");
    scanf("%d",&ch);
    switch (ch)
    {
    case 1:
        printf("The sum of two numbers is %d",a+b);
        break;
    case 2:
        int res = a-b;
        if(res < 0)
        {
            res = res * -1;
        }
        printf("The absolute difference of the numbers are %d",res);
        break;
    case 3:
        printf("The product of the numbers is %d",a*b);
        break;    
    default:
        printf("Wrong choice!");
        break;
    }
}