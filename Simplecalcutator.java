import java.util.*;
class Allmaths
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);

    System.out.println("****simple****");
    System.out.println("+:Addition");
    System.out.println("-:Subtration");
    System.out.println("*:muliplication");
    System.out.println("/:Quotient");
    System.out.println("%:Reminder");

     int a,b,result;
     char ch;

   System.out.println("Enter the value of a and b");
   a=sc.nextInt();
   b=sc.nextInt();

   System.out.println("Enter the choice");
   ch=sc.next().charAt(0);

  Switch(ch);
    {
      case "+"=result=a+b:
              System.out.println("Addition of two numbers="+result);
              break;
     case "-"=result=a-b:
              System.out.println("substract of two numbers="+result);
              break;
     case "*"=result=a*b:
              System.out.println("multiplication of two numbers="+result);
              break;
     case "/"=result=a/b:
              System.out.println("quotient of two numbers="+result);
              break;
    case "%"=result=a%b:
              System.out.println("reminder of two numbers="+result);
              break;
            default:
                 System.out.println("invalid choice");
       }
}
    

