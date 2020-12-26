import java.io.*;
import java.lang.*;
import java.util.Scanner;
class simpleif
{
public static void main(String[] args)
{
int i,x; //variable declaration
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers to check the number is even or not");
i=sc.nextInt(); //Getting input from user
x=i%2;
if(x==0) //checking condition
{
System.out.println("Entered number is even");
}
else
{
System.out.println("Entered number is odd");
}
}
}