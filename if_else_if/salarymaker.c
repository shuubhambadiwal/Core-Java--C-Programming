
#include <stdio.h>

int main() {
    
    float salary, allowedSalary;
    int holidays;
    char name, address, bankDetails;

    printf("Enter your full salary: ");
    scanf("%f", &salary);

    printf("Enter the number of holidays you took: ");
    scanf("%d", &holidays);

    printf("Enter your name: ");
    scanf(" %c", &name);

    printf("Enter your address: ");
    scanf(" %c", &address);

    printf("Enter your bank details: ");
    scanf(" %c", &bankDetails);

    if (holidays == 1) {
        allowedSalary = salary; 
    } else if (holidays >= 2 && holidays <= 5) {
        allowedSalary = salary * 0.95; 
    } else if (holidays >= 6 && holidays <= 14) {
        allowedSalary = salary * 0.90; 
    } else if (holidays == 15) {
        allowedSalary = salary * 0.50; 
    } else {
        allowedSalary = 0;
    }

    printf("\n--- Salary Allotment Details ---\n");
    printf("Name: %c\n", name);
    printf("Address: %c\n", address);
    printf("Bank Details: %c\n", bankDetails);
    printf("Total Salary: %f\n", salary);
    printf("Holidays Taken: %d\n", holidays);
    printf("Allowed Salary: %f\n", allowedSalary);

    return 0;
}


