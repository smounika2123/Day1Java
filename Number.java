import java.util.Scanner;
class Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,result;
            System.out.println("Enter 3 numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            result=a+b-c;
            System.out.println("Result=" +result);
        }
    
}
