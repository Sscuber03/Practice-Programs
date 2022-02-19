#include<stdio.h>

int main()
{
    int age = 0;
    ok: // Label name
    printf("Enter your age : ");
    scanf("%d",&age);
    if(age >= 18)
    {
        goto ok;//rewinding a program until and unless some condition is true
        printf("You are eligible for Voting");
    }
    else
        goto notok;
    notok: // Label name
        printf("You are not eligible for Voting");
}