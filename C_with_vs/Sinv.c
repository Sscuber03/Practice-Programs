#include<stdio.h>
#include<conio.h>
#include<math.h>
int main()
{
    int i,n;
    float x,sum,t;
    printf("Enter value of x: ");
    scanf("%f", &x);
    printf("Enter value of n: ");
    scanf("%d", &n);
    x=x*(3.141592/180);
    sum=x;
    t=x;
    for(int i=1;i<=n;i++)
    {
        t=((t*(-1)*x*x)/((2*i)*(2*i+1)));
        sum+=t;
    }
    printf(" The value of the Sin(%f) = %.4f" ,x,sum);
    getch();
    return 0;
}