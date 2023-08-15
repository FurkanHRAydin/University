#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <string.h>

int main(void) {
    char file[] = "text.txt";
    int fd = open(file, O_RDONLY);

    int curr_pos = lseek(fd, 0, SEEK_END);
    printf("%s %d", "AKtuelle Position des zugrifsszeiger", curr_pos);
    close(fd);
}