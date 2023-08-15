#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>

int main() {
    int fd = open("test.txt", O_RDWR | O_APPEND);
    if (fd == -1) {
        perror("Fehler beim Öffnen der Datei");
        exit(EXIT_FAILURE);
    }

    // Springe an den Anfang der Datei
    off_t pos = lseek(fd, 0, SEEK_SET);
    if (pos == -1) {
        perror("Fehler beim Setzen des Dateizeigers");
        close(fd);
        exit(EXIT_FAILURE);
    }

    // Schreibe "Hallo" an den Anfang der Datei
    if (write(fd, "Hallo", 5) == -1) {
        perror("Fehler beim Schreiben in die Datei");
        close(fd);
        exit(EXIT_FAILURE);
    }

    // Gib die aktuelle Position des Zugriffszeigers aus
    pos = lseek(fd, 0, SEEK_CUR);
    if (pos == -1) {
        perror("Fehler beim Setzen des Dateizeigers");
        close(fd);
        exit(EXIT_FAILURE);
    }
    printf("Aktuelle Position des Zugriffszeigers: %ld\n", pos);

    // Schließe die Datei
    if (close(fd) == -1) {
        perror("Fehler beim Schließen der Datei");
        exit(EXIT_FAILURE);
    }

    return 0;
}
