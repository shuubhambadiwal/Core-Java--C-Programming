// Q)write a c program input character and check character is q,w,e,r,t,y,u,i,o,p : upper line
// 	otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'q' || alpha == 'w' || alpha == 'e' || alpha == 'r' || alpha == 't' || alpha == 'y' || alpha == 'u' || alpha == 'i' || alpha == 'o' || alpha =='p') {
        printf("q,w,e,r,t,y,u,i,o,p");
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}


