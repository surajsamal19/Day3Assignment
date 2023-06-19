import java.util.Scanner;
public class DistanceProgramm{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
double euclideanDistance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
System.out.println("The euclidean distance is:" +euclideanDistance);
}
}