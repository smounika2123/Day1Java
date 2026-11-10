class Car{
    String color;
    void speed(int num){
        System.out.println("Speed...."+ num);
    }
}
class Main4 {
    public static void main(String[] args) {
        Car bmw=new Car();
        Car RR=new Car();
        Car telsa=new Car();
        Car ferari=new Car();

        bmw.color="RED";
        RR.color="Blue";
        telsa.color="Black";
        ferari.color="White";

        System.out.println(bmw.color);
        System.out.println(RR.color);
        System.out.println(telsa.color);
        System.out.println(ferari.color);
         
        bmw.speed(200);
        RR.speed(300);
        telsa.speed(400);
        ferari.speed( 500);
    }
}
