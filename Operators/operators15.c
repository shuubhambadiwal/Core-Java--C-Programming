//  8.9*1.67-(6.21-5.6)+7.8-34 +157

#include <stdio.h>

int main()

{
    float num1 =  8.9;
    float num2 = 1.67;
    float num3 = 6.21;
    float num4 = 5.6;
    float num5 = 7.8;
    int num6 = 34;
    int num7 = 157;
    
    float res  = num1 * num2 - (num3 - num4) + num5 - num6 + num7;
    
    printf("%f", res);

    return 0;
}
