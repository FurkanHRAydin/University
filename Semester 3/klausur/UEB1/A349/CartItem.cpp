#include "CartItem.h"

using namespace std;

int CartItem::last_id = 0;

CartItem::CartItem(string name, int anzahl, double einzelpreis) 
    : itemId {++last_id} {
    setName(name);
    setAnzahl(anzahl);
    setEinzelpreis(einzelpreis);
}

void CartItem::setName(string name) {
    this->name = name;
}

void CartItem::setAnzahl(int anzahl) {
    this->anzahl = anzahl;
}

void CartItem::setEinzelpreis(double einzelpreis) {
    this->einzelpreis = einzelpreis;
}

string CartItem::getName() {
    return name;
}

int CartItem::getAnzahl() {
    return anzahl;
}

double CartItem::getEinzelpreis() {
    return einzelpreis;
}

double CartItem::getCost() {
    return einzelpreis*anzahl;
}

string CartItem::toString() {
    ostringstream os;
    os << setw(2) << left << getAnzahl(); 
    os << " x ";
    os << setw(30) << left << getName();
    os << setw(6) << left << getAnzahl();
    os << setw(6) << right << getCost();

    return os.str(); 
}
int CartItem::getItemId() {
    return itemId;
}


