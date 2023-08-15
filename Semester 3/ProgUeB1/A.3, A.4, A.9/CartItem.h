#include <string>
#ifndef CARTITEM_H
#define CARTITEM_H

using std::string;

class CartItem {
    private:
        static int last_id;
        int itemId;
        string artikelname;
        int anzahl;
        double preis; //preis pro einheit
    public:
        CartItem(string artikelname, int anzahl, double);
        double getCost();
        string getName();
        int getAnzahl();
        double getPreis();
        void setName(string name);
        void setAnzahl(int anzahl);
        void setPreis(double preis);
        string toString();
        int getItemId();
};
#endif
