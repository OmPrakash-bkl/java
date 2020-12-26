import java.io.*;
import java.lang.*;
import java.util.Scanner;
class and
{
public static void main(String[] args)
{
int u,p,db1,db2;
db1=007;
db2=1234;
Scanner sc=new Scanner(System.in);
System.out.println("enter the userid and password");
u=sc.nextInt();
p=sc.nextInt();
if(u==db1 & p==db2) /*use can use instead of & by &&, |, ||*/
{
System.out.println("Welcome, Thanks for login");
}
else
{
System.out.println("Sorry, your userid or password is wrong!!");
}
}
}