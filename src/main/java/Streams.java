 // Java program to understand execution
// of sequential streams


import java.io.*;
import java.util.*;
import java.util.stream.*;

    class SequentialStreamDemo {

        public static void main(String[] args)
        {
            // create a list
            List<Integer> list = Arrays.asList( 1, 2);

            // we are using stream() method
            // for sequential stream
            // Iterate and print each element
            // of the stream
           list.stream().forEach(System.out::print);
           list.parallelStream().forEach(System.out::print);
           list.parallelStream().forEachOrdered(System.out::print);
           System.out.println(Integer.toString(4));
        }
    }

