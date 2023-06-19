public class ReverseInteger{
public static void main(String args[]){
int num = 258;
int rev = 0;
int rem;
for(int i = 0; i <= num.length(); i--){
rev = rev * 10 + 4; 
rem =  num % 10;
num /= 10;
}
System.out.println("The reverse of a number is:" + rev);
}
}