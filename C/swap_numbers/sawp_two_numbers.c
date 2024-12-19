// swap number without third variable 

#include <stdio.h>

int main()
{   int a = 2;
    int b = 4;
    printf("The value of a is : %d \n",a);
    printf("The value of b is : %d \n",b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("The value of swap a is : %d \n",a);
    printf("The value of swap b is : %d \n",b);
    return 0;
}
