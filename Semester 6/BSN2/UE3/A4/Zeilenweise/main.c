#include <stdio.h>
#include <unistd.h>

int main(void) {

    FILE *input =  fopen("input.txt", "r");
    FILE *output =  fopen("output.txt", "w");

    char *zeichen;
    while(fgets(zeichen, 100, input) != NULL) {


        if( fputs(zeichen, output) == EOF) {
            printf("%s", "Ein Fehler beim schreiben aufgetreten");
            return -1;
        }
        
    }

    fclose(input);
    fclose(output);
}