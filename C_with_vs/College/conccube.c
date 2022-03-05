#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    int as = (2*n)-1;
    for(int i=0;i<as;i++)
    {
        for(int j=0;j<as;j++)
        {
            if(abs(i - as/2) > abs(j - as/2))
                printf("%d " , abs(i-as/2)+1);
            else
                printf("%d " , abs(j-as/2)+1);
        }
        printf("\n");
    }
}