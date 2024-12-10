// Q)write a c program input character and check character is vowel and consonant ? 

// vowel :a,e,i,o,u
// consoant :

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
        printf("Enterd char is Vowel");
    } 
    else {
        printf("Enterd char is Consonants");
    }
    return 0;
}

