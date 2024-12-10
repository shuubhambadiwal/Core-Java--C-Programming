// Q)write a c program input number and check number is divisible by 5 or not ? 

#include <stdio.h>
int main()
{
    int num;
    printf("Enter the number value");
    scanf("%d", &num);
    if( num % 5 == 0) {
        printf("The Number is divisible by 5");
    } 
    else {
        printf("The Number is not divisible by 5");
    }
    return 0;
}
