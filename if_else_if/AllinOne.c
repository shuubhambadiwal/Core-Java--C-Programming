// Write a c program input character :
// 	m :
// 		month 
// 	w :
// 		week days 
// 	k :
// 		keyboard lines 
// 	e :
// 		electricity bill 
// 	s :
// 		salary 
// 	r :
// 		marksheet 
// 	t :
// 		tax calculator 
// 	otherwise :input is not matched 

#include<stdio.h>

int main(){
    char a;
    printf("Enter the charcter value");
    scanf("%c", &a);
    if(a=='w'){
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
    } else if (a=='m') {
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
    } else if (a=='e') {

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
    printf("Units Consumed: %f\n", units);
    printf("Amount: %f\n", amount);
    printf("Discount: %f\n", discount * 100);
    printf("Total Payable Amount: %f\n", totalPayable);

    } else if (a=='k'){
    char a;
    printf("Enter the charcter value");
    scanf("%c", &a);
    if ( a == 'q' || a == 'w' || a == 'e' || a == 'r' || a == 't' || a == 'y' || a == 'u' || a == 'i' || a == 'o' || a == 'p') {
        printf("Upperline");
    }
    else if ( a == 'a' || a == 's' || a == 'd' || a == 'f' || a == 'g' || a == 'h' || a == 'j' || a == 'k' || a == 'l') {
        printf("Midline");
    }
    else if ( a == 'z' || a == 'x' || a == 'c' || a == 'v' || a == 'b' || a == 'n' || a == 'm') {
        printf("Lowerline");
    }
    } else if (a=='s') {
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

    } else if (a=='m'){

    int subject1, subject2, subject3, total;
    float percentage;
    char grade;

    printf("Enter marks for subject 1 (out of 100): ");
    scanf("%d", &subject1);

    printf("Enter marks for subject 2 (out of 100): ");
    scanf("%d", &subject2);

    printf("Enter marks for subject 3 (out of 100): ");
    scanf("%d", &subject3);

    if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 || subject3 < 0 || subject3 > 100) {
        printf("Invalid marks entered. Please enter marks between 0 and 100.\n");
        return 0;
    }

    total = subject1 + subject2 + subject3;
    percentage = total / 3.0;

    if (percentage < 25) {
        grade = 'F';
    } else if (percentage < 45) {
        grade = 'E';
    } else if (percentage < 50) {
        grade = 'D';
    } else if (percentage < 60) {
        grade = 'C';
    } else if (percentage < 80) {
        grade = 'B';
    } else {
        grade = 'A';
    }
    printf("\nTotal Marks: %d/300\n", total);
    printf("Percentage: %.2f%%\n", percentage);
    printf("Grade: %c\n", grade);

    } else if (a=='t'){

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

    } else {
        printf("Input is not matched ");
    }
    return 0;
}





















