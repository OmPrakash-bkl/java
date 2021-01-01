import java.lang.*;
import java.io.*;
import java.util.Scanner;
class s
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("checking the string methods benefits");
String s1=new String("It's Me Prakash"); //declaring the string as not empty
String s2=""; //declaring the string as empty
System.out.println(s1.length()); //counting the length

System.out.println(s1.isBlank()); //checking the string is empty or not. if it's empty means it throws true as value otherwise false

System.out.println(s1.isEmpty());

System.out.println(s2.length()); //counting the length

System.out.println(s2.isBlank()); /*checking the string is empty or not. in this method empty space is also have a value,*/
                                     /*so if it will contain  atleast one empty space, it will throw the false as value.*/
System.out.println(s2.isEmpty());

}
}