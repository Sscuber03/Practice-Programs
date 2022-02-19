#include<stdio.h>

int main()
{
    int a,n;
    int sum=0;
    printf("Enter the number to be added /n");
    scanf("%d",&a);
    printf("Enter the number of times to be added /n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        sum+=a;
    }
    // for(;n>0;n--)
    // {
    //     sum+=a;
    // }
    // while(n>0)
    // {
    //     sum+=a;
    //     n--;
    // }
    // do
    // {
    //     sum+=a;
    //     n--;
    // }while(n>0);
    printf("The sum is : %d/n",sum);
    return 0;
}