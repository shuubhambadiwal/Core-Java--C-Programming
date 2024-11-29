// Q)write a c program input character 'w':
// 		two number 
// 		swap number with third variable  
// 		otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'w') {
     int a = 15;
    int b = 23;
    int c;
    printf("The value of a is : %d \n",a);
    printf("The value of b is : %d \n",b);
    c = a;
    a = b;
    b = c;
    printf("The value of swap a is : %d \n",a);
    printf("The value of swap b is : %d \n",b);
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
