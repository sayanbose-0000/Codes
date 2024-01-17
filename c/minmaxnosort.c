//maximum and minumum elements (no sorting)
#include<stdio.h>
#include<limits.h>
int main (){
  int n;
  printf("Enter no of elements in the array: ");
  scanf("%d",&n);
  int a[n];
  
  for (int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }

  int h=INT_MIN,k=INT_MAX;
  for (int i=0;i<n;i++){
    if (a[i]>h){    //max
      h=a[i];
    }
    if (a[i]<k){    //min
      k=a[i];
    }
  }
  printf("Maximum element is %d\n", h);
  printf("Mimimum element is %d\n", k);
  
  return 0;
  }
