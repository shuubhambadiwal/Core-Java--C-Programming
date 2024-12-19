#include <stdio.h>

int main() {
    char name;
    float income, tax, netIncome;

    printf("Enter your name (initial only): ");
    scanf(" %c", &name);

    printf("Enter your income: ");
    scanf("%f", &income);

    if (income <= 10000) {
        tax = 0;
    } else if (income <= 30000) {
        tax = (income / 100) * 10;
    } else if (income <= 50000) {
        tax =  (income / 100) * 20;
    } else {
        tax = (income / 100) *30; 
    }

    netIncome = income - tax;

    printf("\n--- Tax Details ---\n");
    printf("Name: %c\n", name);
    printf("Income: %f\n", income);
    printf("Tax: %f\n", tax);
    printf("Net Income: %f\n", netIncome);

    return 0;
}
