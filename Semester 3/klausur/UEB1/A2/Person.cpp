#include <iostream>
#include "Person.h"

Person::Person() {
    Namen = "";
    Geburtsjahr = 0;
}

Person::Person(string Namen, int Geburtsjahr) {
    this->Namen = Namen;
    this->Geburtsjahr = Geburtsjahr;
}

void Person::print() {
    std::cout << Namen << " ist " << Geburtsjahr << " geboren." << std::endl; 
}