#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n; 
    int k; 
    int b;
    int totalPrice =0 ;
    scanf("%i %i", &n, &k);
    int *ar = malloc(sizeof(int) * n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       scanf("%i",&ar[ar_i]);
       totalPrice =totalPrice + ar[ar_i]; 
    }
    scanf("%i",&b);
    int notPay = totalPrice /2;
    int price = (totalPrice - ar[k]) /2;
    
    if(b == price){
        printf("Bon Appetit");
    }
    else{
        printf("%d",notPay-price);
    }
    
    return 0;
}
