import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringMethods{
    public static void main(String args[]){

        String sname1="Hello world";
        String sname2="Welcome to Java";
               byte  bytes[]= sname1.getBytes(); // This method returns byte array and Convert string to bytes
                System.out.println(Arrays.toString(bytes)); //[72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]
      // System.out.println( sname1.getBytes(StandardCharsets.UTF_8));
        byte[] bytes1=sname1.getBytes(StandardCharsets.UTF_8);//Encodes the string into bytes using UTF-8
        System.out.println(Arrays.toString(bytes1));//[72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]

        sname1.toLowerCase(Locale.ROOT);
        //System.out.println(sname1.toLowerCase(Locale.ROOT));//hello world
        System.out.println(sname1.toLowerCase());//hello world
        System.out.println(sname1.toUpperCase());//HELLO WORLD
        System.out.println(sname1.charAt(7));//o
        System.out.println((sname1.equals(sname2)));//false
        System.out.println(sname1.length());//Retrieve size of the String output is 11
        System.out.println(sname1.substring(2,4));//11
        System.out.println(sname1.trim());//Remove the space before and after the string output is Hello world
        System.out.println(sname1.indent(4));//   Hello world
        String parts[]=sname1.split(" ");//This method to divide a string into an array of substrings based on a specified delimiter.
        System.out.println(parts[0]);//Hello
        System.out.println(parts[1]);//world
        System.out.println(sname1.contains("world"));//True
        System.out.println(sname1.replace('H','J'));//Jello world
        System.out.println(sname1.equalsIgnoreCase("Hello WORLD"));//True
        System.out.println(sname1.replaceAll("Hello","Welcome"));//Welcome world






    }
}