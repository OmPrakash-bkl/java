import java.io.*;
import java.lang.*;
import java.util.Scanner;
class simple
{
public static void main(String args[])
{
Float p,n,r,si; //variable declaration
System.out.println("Enter the Principle of Amount, no.of years, Rate of Interest one by one"); //printing message for user to enter the details
Scanner sc=new Scanner(System.in); //creating the object to get the inputs
p=sc.nextFloat();
n=sc.nextFloat();
r=sc.nextFloat();
si=(p*n*r)/100; //calculating the si
System.out.println("Simple Interest(SI) = "+si); //displaying the result
}
}
