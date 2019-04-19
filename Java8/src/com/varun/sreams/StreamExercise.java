package com.varun.sreams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExercise {
	public static void main(String[] args) {
        System.out.println("QuickCheck 2.0");
        
        Stream<String> input = testData();
        
        // collect the input stream as (aslj|ojsf|klajsd|kj|klajsdkl)
        // and print the size at the same time
        // CONDITIONS -
        // do not collect the stream in anything else than what's asked
        // i.e. no intermediate collection
        //System.out.println(input.count());
        //Stream.concat(Stream.of("("), input);
        Supplier<Stream<String>> supp=()->input;
        //System.out.println(supp.get().count());
        
        Stream<String> newStream=Stream.concat(Stream.of("("), supp.get());
        newStream=Stream.concat(newStream, Stream.of(")"));
        
        newStream.forEach(p->System.out.print(p+"|"));
        		
        
        
        
        
        
 }

 private static Stream<String> testData() {
        
        Random random = new Random();
        final int count = random.nextInt(30) + 20;
        
        return random
                     .ints(count, 2, 10)
                     .mapToObj(length -> string(length));
 }
 
 private static String string(int length) {
        final char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] forString = new char[length];
        
        Random random = new Random();
        for (int index = 0; index < length; index++) {
               forString[index] = letters[random.nextInt(letters.length)];
        }
        
        return new String(forString);
 }

}
