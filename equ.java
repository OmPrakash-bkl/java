import java.io.*;
import java.lang.*;
import java.util.Scanner;
class equ
{
public static void main(String[] args)
{
String s1=new String("Java"); //object string 
String s2="Java"; //literal string
if(s1==s2)
{
System.out.println("Two strings are equals");
}
else
{
System.out.println("Two strings are not equals");
}
if(s1.equals(s2))
System.out.println("Two strings are equals");
else
System.out.println("Two strings are not equals");
}
}