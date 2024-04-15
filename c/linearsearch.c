//linear search
#include<stdio.h>
int main (){
  int n;
  printf("Enter array size: ");
  scanf("%d", &n);
  int a[n];

  for (int i=0;i<n;i++){    //inputs array
    scanf("%d",&a[i]);
  }

  int search;
  printf("Enter element to be searched: ");
  scanf("%d",&search);

  for (int i=0;i<n;i++){      //seaches the element
    if (search==a[i]){
        printf("Element found at position %d\n", i);
    }
  }
  
  return 0;
  }
