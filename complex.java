import java.io.*;
import java.lang.*;
import java.util.Scanner;
class complex
{
public static void main(String args[])
{
int r1,r2,i1,i2,r,i; //variable declaration
Scanner sc=new Scanner(System.in); //object creation for geting the inputs
System.out.println("Enter the real numbers of 2 complex numbers"); //printing the message for the user to enter the inputs
r1=sc.nextInt();
r2=sc.nextInt(); //getting inputs
System.out.println("Enter the imaginary numbers of 2 complex numbers"); //printing the message for the user to enter the inputs
i1=sc.nextInt();
i2=sc.nextInt(); //getting inputs
r=r1+r2;
i=i1+i2; //adding the numbers
System.out.println("The addition of the 2 complex number is "+r+"+i"+i); //printing the result with message
}
}