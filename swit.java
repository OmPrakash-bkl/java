import java.io.*;
import java.lang.*;
import java.util.Scanner;
class swit
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the any ome number from 1 - 5");
a=sc.nextInt();
switch(a) 
{
case 1: 
System.out.println("Entered number is one");
break;
case 2:
System.out.println("Entered number is two");
break;
case 3:
System.out.println("Entered number is three");
break;
case 4:
System.out.println("Entered number is four");
break;
case 5:
System.out.println("Entered number is five");
break;
default:
System.out.println("Invaild number");
break;
}   
}
}