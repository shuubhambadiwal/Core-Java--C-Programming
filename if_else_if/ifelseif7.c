#include<stdio.h>

int main (){
    char alpha;
    printf("Enter the character");
    scanf("%c",&alpha);
    if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ){
        printf("The chacrcter is vowel");
    } else if (alpha != 'a' && alpha != 'e' && alpha != 'i' && alpha != 'o' && alpha != 'u' ) {
        printf("The chacrcter is consonents");
    }
    return 0;
}