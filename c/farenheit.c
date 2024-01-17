//converts celcius to fahrenheit
#include<stdio.h>
int main (){
    float cel,far;
    printf("Enter temperature in fahrenheit ");
    scanf("%f",&far);
    cel=(5.0/9)*(far-32);   //5.0 (and not 5) is given because 5/9=0 whereas 5.0/9!=0(~0.56) ie, so that float is returned on divison
    printf("The temperature in celsius is %.2f ",cel);
return 0;
}
