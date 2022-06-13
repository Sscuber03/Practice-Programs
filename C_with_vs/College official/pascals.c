//pascals triabgle using 2d array
#include <stdio.h>
int main()
{
    int i,j,n,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    int a[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(j==0||j==i)
            {
                a[i][j]=1;
            }
            else
            {
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }
    }
    for(i=0;i<n;i++)
    {
        for(k=n;k>=i;k--)
        {
            printf(" ");
        }
        for(j=0;j<=i;j++)
        {
            if(a[i][j]<10)
            {
                printf("%d  ",a[i][j]);
            }
            else
            {
                printf("%d ",a[i][j]);
            }
        }
        printf("\n");
    }
    return 0;
}