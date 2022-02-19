#include<stdio.h>

int main()
{
    char a='q';
    while(a=='q')
    {
        printf("Going on!\n");
        printf("Enter your choice : ");
        scanf(" %c",&a);
    }
    printf("Good bye!!");
}