#include<stdio.h>
#include<stdlib.h>
#include<math.h>//header file 

int main()
{
    int i = -10 , e = 2 , d = 10;
    float rad = 1.43;
    double d1 = 3.0 , d2 = 4.0;
    printf("%f\n" , pow(d1,d2));//returns d1 raised to the power d2, always takes and returns double value.
    printf("%f\n" , log(d));
    printf("%f\n" , sin(rad));
    printf("%f\n" , cos(rad));
    printf("%d\n" , abs(i));
    printf("%d\n" , rand()%6+1);
    return 0;
}