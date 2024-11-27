// swap number with third variable 

#include <stdio.h>

int main()
{   int a = 15;
    int b = 23;
    int c;
    printf("The value of a is : %d \n",a);
    printf("The value of b is : %d \n",b);
    c = a;
    a = b;
    b = c;
    printf("The value of swap a is : %d \n",a);
    printf("The value of swap b is : %d \n",b);
    return 0;
}
