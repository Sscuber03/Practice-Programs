#include<stdio.h>
#include<conio.h>
#include<math.h>
 
int main() {
    int i, n;
    float x, sum, total;

    printf(" Enter x : ");
    scanf("%f",&x);

    printf(" Enter n : ");
    scanf("%d",&n);

    x=x*3.1415/180;
    total=x;
    sum=x;

    for(int i=1;i<=n;i++)
    {
        total=(total*(-1)*x*x)/((2*i)*(2*i+1));
        sum=sum+total;
    }

    printf(" The value of Sin(%f) = %.4f",x,sum);
    getch();
    return 0;
}
