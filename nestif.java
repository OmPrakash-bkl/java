import java.io.*;
import java.lang.*;
import java.util.Scanner;
class nestif
{
public static void main(String[] args)
{
int age; 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age to check eligible or not for to get driving license");
age=sc.nextInt();
   if(age>18) //checking the condition for license
    {
    System.out.println("your are eligible, you can get");
    }
    else
    
        if(age>16) //checking the condition for learner license
        {
       System.out.println("you are not eligible, but you can get the learner license");
        }
       else
        {
       System.out.println("you are not eligible");
        }
   
}
}