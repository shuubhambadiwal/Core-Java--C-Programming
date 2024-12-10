#include <stdio.h>

int main(){
    int num;
    printf("Enter the num value ");
    scanf("%d", &num);
    if (num == 1) {
        printf("January");
    } else if (num ==2) {
        printf("Febrary");
    } else {
        printf("Input Not Matched");
    }
    return 0;
}



