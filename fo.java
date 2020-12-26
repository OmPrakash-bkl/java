import java.io.*;
import java.lang.*;
import java.util.Scanner;
class fo
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5,6,7,8,9};
int e;
System.out.println("Even numbers");
for(int i=0;i<=9;i++)
{
e=a[i]%2;
if(e==0)
{
System.out.println(a[i]);
}
}
}
}