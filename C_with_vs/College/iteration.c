#include<stdio.h>

int main()
{
    /*hello,this is a multiline comment,
    so nothing is executed in these lines*/
    int n;
    int i;//counter variable
    printf("Enter the number of times to run the loop : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)// Syntax; for(initialization;condition;increment/decrement)
    {
        printf("Value of i is : %d\n",i);
    }
    return 0;
}