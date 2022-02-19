#include<stdio.h>

int main()
{
    int i=1;//initializing
    int n;
    printf("Enter the number till which to loop : ");
    scanf("%d",&n);
    while(i<=n)//condition
    {
        printf("Value of i is : %d\n",i);
        i++;//increment
    }
    // while(1) is called infinite loop condition

    // the above while loop to a do while loop

    // int i=1;
    // if(i<=n)
    // {
    //     do
    //     {
    //         printf("Value of i is : %d\n",i);
    //         i++;
    //     } while (i<=n);  
    // }

    return 0;
}