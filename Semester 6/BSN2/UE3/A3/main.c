#include <stdio.h>
#include <errno.h>
#include <string.h>

int main() {
    for(int i = 1; i <= 99; i++) {
        errno = i;
        perror("Fehlercode");
    }

    int err;
    for(int i = 1; i <= 99; i++) {
         err = i;
        fprintf(stderr, "Fehler: %s\n", strerror(err));
    }

    return 0;
}
