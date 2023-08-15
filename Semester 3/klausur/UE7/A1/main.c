#include <stdio.h>

void print(void) {
    printf("Hallo\n");
}

void times(int n, void (*func) (void)) {
    for(int i=0; i<n; i++) {
        print();
    }
}

void print2(int i) {
    printf("%d\n", i);
}

void times2(int n, void (*func) (int)) {
    for(int i=0; i<n; i++) {
        print2(i);
    }
}


int main(void) {
    
    times(3, &print);
    times2(3, &print2);


    return 0;
}
