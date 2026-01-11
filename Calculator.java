import java.util.Scanner;
public class Calculator
{
public static void main(String[]args)
{
Scanner n = new Scanner(System.in);
System.out.println("Enter your first input : ");
int i = n.nextInt(); 
System.out.println("Enter your second input : ");
int j = n.nextInt();
int sum = i+j;
int sub = i-j;
int mod = i%j;
int mul = i*j;
int div = i/j;
System.out.println("your sum is : "+ sum);
System.out.println("your sub is : "+ sub);
System.out.println("your mod is : "+ mod);
System.out.println("your mul is : "+ mul);
System.out.println("your div is : "+ div);
}
}


