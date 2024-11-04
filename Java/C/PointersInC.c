#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function  
    
    int sum = *a + *b;
    int diff = abs(*a - *b);
    
    // Update the values pointed to by a and b
    *a = sum;
    *b = diff;
}

int main() {
    int x, y;
    scanf("%d\n%d", &x, &y); // Read two integers
    update(&x, &y); // Pass the addresses of x and y to the update function
    printf("%d\n%d", x, y); // Print the updated values
    return 0;
}
      

