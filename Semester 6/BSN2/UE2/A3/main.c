#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>

int main(void) {
    char file[] = "text.txt";
    printf("%s %s\n", "oeffne Datei", file );
    int fd = open(file, O_RDONLY);
    if (fd<=0) {
        return -1;
    }
    printf("%s  %d\n", "file descriptor", fd);
    printf("%s\n","sleeping now");
    sleep(60);

    close(fd);

    return 0;
}