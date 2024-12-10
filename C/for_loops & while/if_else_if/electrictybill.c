#include <stdio.h>

int main() {
    float units, amount, discount, totalPayable;
    char name;

    printf("Enter your name (initial only): ");
    scanf(" %c", &name);

    printf("Enter the number of units consumed: ");
    scanf("%f", &units);

    amount = units * 10;

    if (units >= 1 && units <= 10) {
        discount = 0.10; 
    } else if (units >= 11 && units <= 20) {
        discount = 0.15; 
    } else if (units >= 21 && units <= 40) {
        discount = 0.30; 
    } else if (units >= 50) {
        discount = 0.50; 
    } else {
        discount = 0.0; 
    }

    totalPayable = amount - (amount * discount);

    printf("\n--- Electricity Bill ---\n");
    printf("Name: %c\n", name);
    printf("Units Consumed: %.2f\n", units);
    printf("Amount: %.2f\n", amount);
    printf("Discount: %.2f%%\n", discount * 100);
    printf("Total Payable Amount: %.2f\n", totalPayable);

    return 0;
}
