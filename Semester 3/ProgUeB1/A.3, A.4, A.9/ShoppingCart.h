#include <vector>
#include <string>
#include "CartItem.h"
#ifndef SHOPPINGCART_H
#define SHOPPINGCART_H

using std::vector;
using std::string;

class ShoppingCart {
    private:
        vector<CartItem> items;
    public:
        ShoppingCart();
        void add(CartItem c);
        double getTotalCost();
        int getNumbersOfItemns();
        CartItem getItem(int i); 
        string toString();
        int* getItemIds();
};
#endif
