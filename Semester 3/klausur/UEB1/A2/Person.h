#ifndef PERSON_H
#define PERSON_H
#include <string>

using std::string;

class Person {
    private:
        string Namen;
        int Geburtsjahr;
    public:
        Person();
        Person(string Namen, int Geburtsjahr);
        void print();
};
#endif