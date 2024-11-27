//  1.6*(12-2)/2+7.8-1.5 
#include <stdio.h>
int main()
{
    float num1 = 1.6;
    int num2 = 12;
    int num3 = 2;
    float num4 = 7.8;
    float num5 = 1.5;
    float res  = num1*(num2 - num3)/num3 + num4 - num5;
    printf("%f", res);
    return 0;
}
