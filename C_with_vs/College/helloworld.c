#include<stdio.h>

int main()
{
    printf("Hello World!\n");
    int i=10;//4 bytes
    printf("Value of i is %d\n",i);
    float fl=10.062315;//only six digit after decimal point, the only limitation of float,4 bytes
    printf("Value of fl is %.2f\n",fl);
    double d=10.062315116321;//sixteen digit after decimal point,8 bytes
    printf("Value of d is %.7f\n",d);
    char ch='a';
    printf("Value of ch is %c\n",ch);
    return 0;
}