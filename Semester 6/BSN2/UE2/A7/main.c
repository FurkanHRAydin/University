#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>

#define BUFFER_SIZE 4096

int main() {
    int fd = open("example.txt", O_RDONLY);
    if (fd == -1) {
        perror("Fehler beim Öffnen der Datei");
        exit(EXIT_FAILURE);
    }

    char buffer[BUFFER_SIZE];
    ssize_t bytesRead = read(fd, buffer, BUFFER_SIZE);
    while (bytesRead > 0) {
        if (write(STDOUT_FILENO, buffer, bytesRead) != bytesRead) {
            perror("Fehler beim Schreiben auf die Standardausgabe");
            close(fd);
            exit(EXIT_FAILURE);
        }
        bytesRead = read(fd, buffer, BUFFER_SIZE);
    }

    if (bytesRead == -1) {
        perror("Fehler beim Lesen der Datei");
        close(fd);
        exit(EXIT_FAILURE);
    }

    close(fd);
    return 0;
}
