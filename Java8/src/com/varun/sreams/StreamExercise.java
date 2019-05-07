package com.varun.sreams;

import java.util.Arrays;
import java.util.List;
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
        
       List<String> list = generateTestData();
       Supplier<Stream<String>> supp = ()->list.stream();
       
       supp.get().forEach(p->System.out.print(p+"|"));
       System.out.println();
       supp.get().forEach(p->System.out.print(p+"|"));
       
       System.out.println(supp.get().count());
 }
	
public static List<String> generateTestData(){
	List<String> list = Arrays.asList("varun","arindam","vinita","pradyot","kanchan");
	return list;
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
