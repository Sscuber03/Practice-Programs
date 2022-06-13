#include <stdio.h>
#include <stdlib.h>

void matmul(int **a, int **b, int r,int c, int cc)
{
    int **res, z, i, j, k;
    res=(int**)malloc(r*sizeof(int*));
    for(z=0;z<c;z++)
    {
        res[z]=(int*)malloc(c*sizeof(int));
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            res[i][j]=0;
            for(k=0;k<cc;k++)
            {
                res[i][j] += (a[i][k] * b[k][j]);
            }
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d ",res[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int **m1, **m2, i, j, k, r1, c1, r2, c2;
    printf("Enter the Order of the First matrix: \n");
    scanf("%d %d", &r1, &c1);
    printf("Enter the Order of the Second matrix: \n");
    scanf("%d %d", &r2, &c2);
    if(c1!=r2)
    {
        printf("Inputed order of matrix is invalid!");
        exit(10);
    }
    m1=(int**)malloc(r1*sizeof(int*));
    m2=(int**)malloc(r2*sizeof(int*));
    for(i=0;i<r1;i++)
    {
        m1[i]=(int*)malloc(c1*sizeof(int));
    }
    for(j=0;j<r2;j++)
    {
        m2[j]=(int*)malloc(c2*sizeof(int));
    }
    printf("Enter the elements of the first matrix: \n");
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            scanf(" %d", &m1[i][j]);
        }
    }
    printf("Enter the elements of the second matrix: \n");
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            scanf(" %d", &m2[i][j]);
        }
    }
    matmul(m1,m2,r1,c2,c1);
    return 0;
}