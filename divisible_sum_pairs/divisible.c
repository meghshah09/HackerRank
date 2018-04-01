#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int divisibleSumPairs(int n, int k, int ar_size, int* ar) {
    // Complete this function
    int sum=0;
    int count =0;
    for(int i =0; i<n;i++){
        sum = ar[i];
        for(int j=i+1;j<n;j++){
            int a = ar[j];
                sum = sum + a;
            if(k == sum){
                //printf("%d %d\n",i,j);
                //printf("Equal %d\n",sum);
                count++;
            }
            else if(sum%k==0){
                count++;
            }
            sum = ar[i];
        }
    }
return count;
}

int main() {
    int n; 
    int k; 
    scanf("%i %i", &n, &k);
    int *ar = malloc(sizeof(int) * n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       scanf("%i",&ar[ar_i]);
    }
    int result = divisibleSumPairs(n, k, n, ar);
    printf("%d\n", result);
    return 0;
}