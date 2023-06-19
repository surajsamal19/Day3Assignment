import java.util.Scanner;
public class CharacterVowelConsonant{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your charcter");
char ch = input.next().charAt(0);
switch(Character.toLowerCase(ch)){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(ch+ "is a vowel");
break;
default:
System.out.println(ch+ "is not a vowel");
break;
}
}
}
