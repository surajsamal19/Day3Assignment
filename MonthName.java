import java.util.Scanner;
public class MonthName{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("enter your month");
int monthNumber = input.nextInt();
String monthName;
switch (monthNumber){
case 1:
monthName = "JANUARY";
break;
case 2:
monthName = "FEBRUARY";
break;
case 3:
monthName = "MARCH";
break;
case 4:
monthName = "APRIL";
break;
case 5:
monthName = "MAY";
break;
case 6:
monthName = "JUNE";
break;
case 7:
monthName = "JULY";
break;
case 8:
monthName = "AUGUST";
break;
case 9:
monthName = "SEPTEMBER";
break;
case 10:
monthName = "OCTOBER";
break;
case 11:
monthName = "NOVEMBER";
break;
case 12:
monthName = "DECEMBER";
break;
default:
monthName = "Invalid Month number";
break;
}
System.out.println("Month Name :" + monthName);
}
} 