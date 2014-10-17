

all:
	javac Gray.java

run: all
	java Gray

.PHONY: clean

clean:
	rm -f *.class
