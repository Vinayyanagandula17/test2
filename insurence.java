import java.util.Scanner;
class mca
{
public static void main(String args[])
{
String health;//="excellent";
int age; //=26;
String location;//="city";
String gender;//="male";
double premium=0;
double policy_amount=0;//=55000;
Scanner s=new Scanner(System.in);
System.out.println("enter you health condition either excellent or poor:");
health=s.next();
System.out.println("enter your age:");
age=s.nextInt();
System.out.println("enter your location either city or village :");
location=s.next();
System.out.println("enter your gender eitrer male or female:");
gender=s.next();
if((health.equals("excellent"))&&(age>25&&age<35)&&(location.equals("city"))&&(gender.equals("male"))&&(policy_amount<200000))
{
System.out.println("you can insurence");
System.out.println("maximum amount you can insure is 10000");
System.out.println("rate of your premium is 4 rupees per thousand");
premium=(4.0/1000)*policy_amount;
System.out.println("premium amount for your policy_amount="+premium);
}
else if((health.equals("excellent"))&&(age>25&&age<35)&&(location.equals("city"))&&(gender.equals("female"))&&(policy_amount<100000))
{
System.out.println("you can insurence");
System.out.println("maximum amount you can insure is 10000");
System.out.println("rate of your premium is 3 rupees per thousand");
premium=(3.0/1000)*policy_amount;
System.out.println("premium amount for your policy_amount="+premium);
}
else if((health.equals("poor"))&&(age>25&&age<35)&&(location.equals("village"))&&(gender.equals("male"))&&(policy_amount<100000))
{
System.out.println("you can insurence");
System.out.println("maximum amount you can insure is 10000");
System.out.println("rate of your premium is 6 rupees per thousand");
premium=(6.0/1000)*policy_amount;
System.out.println("premium amount for your policy_amount="+premium);
}
else
{
System.out.println("sorry you can not insure the premium");
}
}
}