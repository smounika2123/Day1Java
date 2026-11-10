import java.util.Scanner;
class Biggest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a + " is big");
        }
        if(a<b && a<c)
        {
            System.out.println(a + " is small");
        }
        if(b>a && b>c)
        {
            System.out.println(b + " is big");
        }
        if(b<a && b<c)
        {
            System.out.println(b + " is small");
        }
        if(c>a && c>b)
        {
            System.out.println(c + " is big");
        }
        if(c<a && c<b)
        {
            System.out.println(c +" is small");
        }

    }
    
}
