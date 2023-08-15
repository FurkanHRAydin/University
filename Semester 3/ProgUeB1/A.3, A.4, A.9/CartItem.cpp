#include "CartItem.h"
#include <string>
#include <iomanip>
#include <sstream>


using namespace std;

int CartItem::last_id = 0; //static variable wird hier das erste mal initalsiert, ist "CartItem" global

CartItem::CartItem(string artikelname, int anzahl, double preis) {
    itemId = ++last_id;
    this->artikelname = artikelname;
    this->anzahl = anzahl;
    this->preis = preis;
}

double CartItem::getCost() {
    return anzahl * preis;
}

string CartItem::getName() {
    return artikelname;
}

int CartItem::getAnzahl() {
    return anzahl;
}

double CartItem::getPreis() {
    return preis;
}

void CartItem::setName(string artikelname) {
    this->artikelname = artikelname;
}

void CartItem::setAnzahl(int anzahl) {
    this->anzahl = anzahl;
}

void CartItem::setPreis(double preis) {
    this->preis = preis;
}

string CartItem::toString() {
    ostringstream os;
    os << setw(2) << left << getAnzahl();

    os << " x ";

    os << setw(30) << left << getName();

    os << setw(6) << left << getPreis();

    os << setw(6) << right << getCost();

    return os.str();
}
int CartItem::getItemId() {
    return itemId;
}
