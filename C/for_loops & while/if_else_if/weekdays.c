// week days :
// 1:sund 
// 2:monday

// otherwise:input is not matched 

#include<stdio.h>

int main () {
    int num;
    printf("Enter the number value");
    scanf("%d",&num);
    if(num == 1){
        printf("Sunday");
    } else if (num == 2) {
      printf("Sunday");
    } else {
      printf("Input is not matched ");
    }
    return 0;
}