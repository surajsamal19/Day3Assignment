import java.util.Scanner;
public class QuadracticProblem{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your first number");
double a = input.nextInt();
System.out.println("Enter your Second number");
double b = input.nextInt();
System.out.println("Enter your third number");
double c = input.nextInt();
double delta  = b*b - 4*a*c;
double root1 = (-b + Math.sqrt(delta)/(2*a));
double root2 = (-b - Math.sqrt(delta)/(2*a));
System.out.println("The root1 of first delta is:" +root1);
System.out.println("The root2 of first delat is:" +root2);
}
}

 
