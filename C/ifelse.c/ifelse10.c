// Q)write a c program input character and check character is z,x,c,v,b,n,m : lower line
// 	otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'z' || alpha == 'x' || alpha == 'c' || alpha == 'v' || alpha == 'b' || alpha == 'n' || alpha == 'm') {
        printf("z,x,c,v,b,n,m");
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
