// Q) Write a c program input number and check number is even or odd ?

// even :number divide by 2

// odd :number does not divide by 2 


#include <stdio.h>
int main()
{
    int num;
    printf("Enter the number value");
    scanf("%d", &num);
    if( num % 2 == 0) {
        printf("The Number is even");
    } 
    else {
        printf("The Number is odd");
    }
    return 0;
}
