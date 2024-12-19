// Q)write a c program input character 's':
// 		two number 
// 		swap number without third variable  
// 		otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 's') {
        int a = 15;
        int b = 23;
    printf("The value of a is : %d \n",a);
    printf("The value of b is : %d \n",b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("The value of swap a is : %d \n",a);
    printf("The value of swap b is : %d \n",b);

    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
