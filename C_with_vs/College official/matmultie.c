#include<stdio.h>
#include<stdlib.h>

void matmul(int ma[10][10], int mb[10][10], int r, int c, int cc)
{
    int res[10][10];
    int i,j,k;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            res[i][j]=0;
            for(k=0;k<cc;k++)
            {
                res[i][j] += (ma[i][k] * mb[k][j]);
            }
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d ", res[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int a[10][10], b[10][10], r1,c1,r2,c2,i,j;
    printf("Enter the Order of the First matrix: \n");
    scanf("%d %d", &r1, &c1);
    printf("Enter the Order of the Second matrix: \n");
    scanf("%d %d", &r2, &c2);
    if(c1!=r2)
    {
        printf("Inputed order of matrix is invalid!");
        exit(10);
    }
    printf("Enter the elements of the first matrix: \n");
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            scanf(" %d", &a[i][j]);
        }
    }
    printf("Enter the elements of the second matrix: \n");
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            scanf(" %d", &b[i][j]);
        }
    }
    matmul(a,b,r1,c2,c1);
    return 0;
}