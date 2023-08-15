#include <iostream>

int* createArray(int n) {
    int* numbers {new int[n]};
    return numbers;
}

void releaseArray(int* &arr) {
    delete[] arr;
    arr = nullptr;
}

int main(void) {
    int* arr {createArray(5)};
    for(int i = 0; i<5; i++) {
        arr[i] = i;
        std::cout << arr[i] <<std::endl;
    }
    releaseArray(arr);


    return 0;
}