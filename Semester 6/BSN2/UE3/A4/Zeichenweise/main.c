#include <stdio.h>
#include <unistd.h>

int main(void) {

    FILE *input =  fopen("input.txt", "r");
    FILE *output =  fopen("output.txt", "w");

    int zeichen;
    if((zeichen=fgetc(input)) == EOF) {
        printf("%s", "Ein Fehler beim lesen aufgetreten");
        return -1;
    }
    while(zeichen != EOF) {  // Liest bei Zeilenende 0Bytes oder EOF 

        if( fputc(zeichen, output) == EOF) {
            printf("%s", "Ein Fehler beim schreiben aufgetreten");
            return -1;
        }
        zeichen = fgetc(input);
    }

    fclose(input);
    fclose(output);
}