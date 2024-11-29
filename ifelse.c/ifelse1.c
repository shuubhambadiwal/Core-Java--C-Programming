// Q)write a c program input number and check number is greater than 10 or not ? 

#include <stdio.h>
int main()
{
    int num;
    printf("Enter the number value");
    scanf("%d", &num);
    if( num > 10) {
        printf("The Number is greater than 10");
    } 
    else {
        printf("The Number is smaller than 10");
    }
    return 0;
}
