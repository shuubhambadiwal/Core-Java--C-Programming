// Q)write a c program input character and check character is a,s,d,f,g,h,j,k,l : mid line
// 	otherwise :input is not matched 

// a,s,d,f,g,h,j,k,l
#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'a' || alpha == 's' || alpha == 'd' || alpha == 'f' || alpha == 'g' || alpha == 'h' || alpha == 'j' || alpha == 'k' || alpha == 'l') {
        printf("a,s,d,f,g,h,j,k,l");
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
