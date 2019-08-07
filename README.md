# clj-maze

A Clojre program that recursively traverses a maze and finds the shortest path out.

The maze itself is inside the maze.txt file.

The format is simple:

Paths with "x" are blocked and the ones with "0" are not. 

The start position is at "*".

A full maze looks like this:

xxxxxx
0x000x
x*0x0x
xxxx00
00000x
xxxx0x

# Running the program


    $ lein run
