public class PalindromeNumber{
public static void main(String args[]){
int num = 12021 , temp, rev =0, rem;
for(int i = 0; i<= num.length(); i--){
temp = num;
rem = temp % 10;
rev = rev *10 + rem;
temp /= 10;
}
if(num == rev){
System.out.println("The reverse number is :" +rev);
}
else{
System.out.println("The number is no reverse");
}
}
}
