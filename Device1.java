class Laptop {
    String brand="LENOVO";
    Integer ramsize=120;
    Float price=35000.0f;
    void bootUp()
    {
        System.out.println("Laptop is starting...");
    }
}

class Device1 {
    public static void main(String[] args) {
        Laptop lenv=new Laptop();
        System.out.println(lenv.brand);
        System.out.println(lenv.ramsize);
        System.out.println(lenv.price);
        lenv.bootUp();

    }

}
    
