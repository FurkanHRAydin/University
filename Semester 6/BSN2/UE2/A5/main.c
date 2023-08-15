#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <string.h>

int main(void) {
    char file[] = "text.txt";
    printf("%s %s\n", "oeffne Datei", file );
    int fd = open(file, O_RDWR | O_SYNC); // muss read and write seinb sonnst geht nicht 
    if (fd<=0) {
        return -1;
    }
    printf("%s  %d\n", "file descriptor", fd);

    char text[] = "Hallo";
    printf("%s  %s\n", "schreibe in die Datei 30000 Hallo", file);

    for(int i=0; i<30000; ++i) {
        int byteswritten = write(fd, text, strlen(text));

        if (byteswritten != strlen(text)) {
            return -1;
        }
    }

    return 0;
}