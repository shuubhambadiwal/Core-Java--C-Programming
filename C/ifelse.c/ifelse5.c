// Q)write a c program input character : a 
// Apple 
//Ootherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'a') {
        printf("Apple");
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}


