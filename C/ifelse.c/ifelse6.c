// Q)write a c program input character :b 
// 					ball 

// 			otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'b') {
        printf("Ball");
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
