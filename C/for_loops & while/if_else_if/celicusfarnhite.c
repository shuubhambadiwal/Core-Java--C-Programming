// °C = (°F − 32) ÷ (9/5)
// F = C * 9/5 = 32

#include<stdio.h>

int main() {
    char a;
    printf("Which conversion you want C to F or F to C. Please type F for C to F and C for F to C.");
    scanf("%c",&a);
    if (a == 'C'){
        int f;
        printf("Enter the value of the F");
        scanf("%d",&f);
        int res = (f - 32) / (9/5);
        printf("The value of C is %d", res);
    } else if (a == 'F') {
        int c;
        printf("Enter the value of the C");
        scanf("%d",&c);
        int res2 = c * (9/5) + 32;
        printf("The value of F is %d", res2);
    } else {
        printf("Input is not matched");
    }
    return 0;
}