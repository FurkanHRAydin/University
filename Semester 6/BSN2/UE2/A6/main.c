#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>

int main() {
    int fd = open("datei.txt", O_RDWR | O_CREAT | O_EXCL, 0644);
    if (fd == -1) {
        perror("Fehler beim Öffnen der Datei");
        exit(1);
    }

    ssize_t bytes_written = write(fd, "Hallo", 5);
    if (bytes_written == -1) {
        perror("Fehler beim Schreiben in die Datei");
        close(fd);
        exit(1);
    }

    close(fd);

    return 0;
}
