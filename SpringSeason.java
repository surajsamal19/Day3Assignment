import java.util.Scanner;
public class SpringSeason{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your  month");
int m = input.nextInt();
System.out.println("Enter your day");
int d = input.nextInt();
boolean isTrue = (m == 3 &7 d>= 20 && d <= 31) || (m == 4 && d >= 1 && d<=30) || (m == 5 && d>=1 && d <= 31) || (m == 6 && d>= 1 && d<= 20);
System.out.println(isTrue); 