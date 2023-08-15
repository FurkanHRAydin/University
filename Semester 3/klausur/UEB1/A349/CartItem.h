#include <string>
#include<vector>
#include <sstream>
#include <iomanip>
#ifndef CARTITEM_H
#define CARTITEM_H

using std::string;

class CartItem {
    private:
        string name;
        int anzahl;
        double einzelpreis;
        static int last_id;
        const int itemId;
    public:
        CartItem(string name, int anzahl, double einzelpreis);
        double getCost();
        string getName();
        int getAnzahl();
        double getEinzelpreis();
        void setName(string name);
        void setAnzahl(int anzahl);
        void setEinzelpreis(double einzelpreis);
        string toString();
        int getItemId();
};
#endif
