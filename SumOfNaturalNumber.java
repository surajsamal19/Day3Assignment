import java.util.Scanner;
public class SumOfNaturalNumber{
public static void main(String args[]){
System.out.println("Enter your number for n natural number ");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int sum =0;
for(int i = 0; i<=num ; i++){
sum += i;
System.out.println("The number of  n natural number" +sum);
}
}
}
