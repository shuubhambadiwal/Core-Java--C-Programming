// Q) Write a c program input number and check number is greater than 67 or not ? 

#include <stdio.h>
int main()
{
    int num;
    printf("Enter the number value");
    scanf("%d", &num);
    if( num > 67) {
        printf("The Number is greater than 67");
    } 
    else {
        printf("The Number is smaller than 67");
    }
    return 0;
}


