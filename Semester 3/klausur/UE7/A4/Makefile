main: liste1ende.o liste1endetest.o
	gcc -pedantic-errors -Wall -std=c99 -o main liste1ende.o liste1endetest.o

liste1ende.o: liste1ende.c liste1ende.h
	gcc -c -pedantic-errors -Wall -std=c99 liste1ende.c

liste1endetest.o: liste1endetest.c liste1ende.h
	gcc -c -pedantic-errors -Wall -std=c99 liste1endetest.c

clean:
	rm liste1ende.o liste1endetest.o main