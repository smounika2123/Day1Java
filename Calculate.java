import java.util.Scanner;
class Add
{
    Add(int a,int b)
    {
        int res= a+b;
        System.out.println(res);
    }
}
class Sub
{
    Sub(int a,int b)
    {
    int res1=a-b;
    System.out.println(res1);
}
}
class Mul
{
    Mul(int a,int b)
    {
    int res2=a*b;
    System.out.println(res2);
}
}
class Div
{
    Div(int a,int b)
    {
    int res3=a/b;
    System.out.println(res3);
}
}
class Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
       Add ad=new Add(a,b);
       Sub sub=new Sub(a,b);
       Mul mu=new Mul(a,b);
       Div di=new Div(a,b);
     }
 }
