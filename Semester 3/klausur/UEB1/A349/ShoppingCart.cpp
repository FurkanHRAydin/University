#include "ShoppingCart.h"

using namespace std;

ShoppingCart::ShoppingCart() {
    items = vector<CartItem>{};
}

void ShoppingCart::add(CartItem const &c) {
    items.push_back(c);
}

double ShoppingCart::getTotalCost() {
    double sum = 0;
    for(auto &x : items) {
        sum += x.getCost();
    }
    return sum;
}

int ShoppingCart::getNumberOfItems() {
    return items.size();
}

CartItem ShoppingCart::getItem(int i) {
    return items.at(i);
}

string ShoppingCart::toString() {
    ostringstream os;
    for (auto &x : items) {
        os << x.toString() << endl;
    }
    os << setw(7) << left << "Summe :";
    os << setw(40) << right << getTotalCost();
    return os.str();
}
int* ShoppingCart::getItemIds() {
    int* arr {new int[items.size()]};
    for(int i = 0; i<items.size(); i++) {
        arr[i] = items.at(i).getItemId();
    }
    return arr;
}
