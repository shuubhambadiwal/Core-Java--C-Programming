#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if(alpha >= 'A' && alpha <= 'Z') {
        printf("Upper Case");
    } 
    else if (alpha >= 'a' && alpha <= 'z') {
        printf("Lower Case");
    } else {
        printf("Input not matched");
    }
    return 0;
}
