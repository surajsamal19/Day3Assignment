import java.util.Scanner;
public class VowelConsonant{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter you word for vowel and consoant:");
String word = input.nextLine();
switch(word){
case consonant:
System.out.println("The sord is consonant");
break;
case vowel:
System.out.println("The word is vowel");
break;
default:
System.out.println(" Plss choose your word");
}
}
}