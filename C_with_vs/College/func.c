#include<stdio.h>

void printingFunc();

int main()
{
    /*
        Function provide modularity
        Function provide reusability
    */
    printingFunc();
    printf("\n");
    printingFunc();
    return 0;
}

void printingFunc()
{
    printf(" Hello");
    printf(" World");
    printf(" Hello");
    printf(" World");
}