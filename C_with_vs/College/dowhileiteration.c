#include<stdio.h>

int main()
{
    int i=0;
    do
    {
        printf("Going on!\n");
        i++;
    }while(i<=10);
    //do while is different for while as it will be executed at least once, even if the condition is false

    //the above do while loop to a while loop

    // int i=0;
    // printf("Going on!");
    // while(i<=10)
    // {
    //     printf("Going on!");
    //     i++;
    // }

    return 0;
}