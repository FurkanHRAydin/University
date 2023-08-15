#include<iostream>
#include"ShoppingCart.h"

int main(void) {
       ShoppingCart sc;
       sc.add(CartItem {"Hundefutter", 6, 3.20});
       sc.add(CartItem {"Kekse", 4, 1.59});
       sc.add(CartItem {"Milch", 1, 0.69});
       sc.add(CartItem {"Erdbeermarmelade", 3, 2.19});

       std::cout << sc.toString() << std::endl;

       int* arr = sc.getItemIds();

       for(int i = 0; i<sc.getNumberOfItems(); ++i) {
           std::cout << arr[i] << " " << sc.getItem(i).getName() << std::endl;
       }
}