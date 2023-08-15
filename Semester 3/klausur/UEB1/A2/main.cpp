#include "Person.h"

int main(void) {
    Person personen[] {{"Furkan Aydin", 2000}, {"Aland Mohammed", 2000}};
    for (auto &x : personen) {
        x.print();
    }
    return 0;
}