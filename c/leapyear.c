//checks if inputed year is leap year or not
#include <stdio.h>
int main() {
	int year;
	printf("Enter a year: ");
	scanf("%d", &year);

	if (year % 400 == 0) {
		printf("%d is a leap year", year);
	}
   
	else if (year%4==0){
		if(year%100!=0){
			printf("leap year");
		}
		else {
			printf("Not leap year");
		}
	}
	
	else {
		printf("Not leap year");
	}

	return 0;
}
