// write a c program input character:
// 	a =>apple 
// 	b =>ball
// 	c =>cat
// 	d =>dog 
// 	otherwise :input is not matched 

#include <stdio.h>

int main(){
    
    char alpha;
    printf("Enter the Charcter value ");
    scanf("%c", &alpha);
    if (alpha == 'a') {
        printf("Apple");
    } else if (alpha == 'b') {
        printf("Ball");
    } else if (alpha == 'c') {
        printf("Cat");
    } else if (alpha == 'd') {
        printf("Dog");
    } else {
        printf("Input is Not Matched");
    }
    return 0;
}