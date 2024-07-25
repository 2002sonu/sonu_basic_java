#include <stdio.h>
#include<math.h>
int main() {
   #include<stdio.h>
   #include<math.h>
   int principle,time;
   float rate,Compound_interest,amount;
   
   printf("Enter Principle:");
   scanf("%d", &principle);
   printf("Enter time :");
   scanf("%d" ,&time);
   printf("Enter rate:");
   scanf("%f", &rate);
   
  amount=principle*pow((1+rate/100),time);
  Compound_interest=amount-principle;
  printf(" Compound_interest=%f\n", Compound_interest);
    return 0;
}