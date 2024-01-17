//matrix multiply
#include<stdio.h>
int main (){
	int m,n,p;
	
	
	printf("Enter no of rows and columns of 1st mat: ");
	scanf("%d%d",&m,&n);
	
	printf("Row no of 2nd mat is %d.Enter column no of 2nd mat: ",n);
	scanf("%d",&p);
	
	int a[m][n],b[n][p],c[m][p];
	
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){	//taking input of matrix a
			scanf("%d",&a[i][j]);
		}
	}
	
	for (int i=0;i<n;i++){
		for (int j=0;j<p;j++){	//taking input of matrix b
			scanf("%d",&b[i][j]);
		}
	}
	
	
	//a[m][n],b[n][p]->c[m][p], n is common
	int sum;
	for (int i=0;i<m;i++){
		for (int j=0;j<p;j++){	//c matrix
			sum=0;
			for (int k=0;k<n;k++){
				sum=sum+a[i][k]*b[k][j];
			}
			c[i][j]=sum;
		}
	}
	
	
	for (int i=0;i<m;i++){
		for (int j=0;j<p;j++){	
			printf("%d ",c[i][j]);
		}
		printf("\n");
	}
	
}