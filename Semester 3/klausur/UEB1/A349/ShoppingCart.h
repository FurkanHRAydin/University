#include"CartItem.h"
#ifndef SHOPPGINCART_H
#define SHOPPGINCART_H

using std::vector;
using std::string;

class ShoppingCart {
    public:
        ShoppingCart();
        void add(CartItem const &c);
        double getTotalCost();
        int getNumberOfItems();
        CartItem getItem(int i);
        string toString();
        int* getItemIds();
    private:
        vector<CartItem> items;
};
#endif
