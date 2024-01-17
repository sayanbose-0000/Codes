//calculate sum of an array and also its average

#include<stdio.h>

int main (){
    
	int n;
    
	printf("Enter size of array: ");
    
	scanf("%d",&n);
    
	int a[n];

    
	for (int i=0;i<n;i++){         //input of array 
        
		scanf("%d",&a[i]);

	}   
   
	float sum=0;
 
   
	for (int i=0;i<n;i++){    //calculates sum
        
		sum=sum+a[i];
    
	}

    
	printf("The sum is %.2f\n",sum);
    
	printf("The average is %.2f", sum/n);
    
    
	return 0;

}
