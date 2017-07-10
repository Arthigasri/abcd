# abcd
import java.io.*;
import java.util.*;
public class Vowelsreverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String b;
    String a;
    String reverse="";
    System.out.println("Enter the string");
    b=sc.nextLine();
    int len=b.length();
    for(int i=len-1;i>-1;i--)
    {
      reverse=reverse+b.charAt(i);
    }
    System.out.println("The reversed String is: "+reverse);
    a=b.replaceAll("[aeiouAEIOU]","");
    System.out.println("The String after removing vowels : "+a);
  }
}
