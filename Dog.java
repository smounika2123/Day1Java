class Animal {
    String color="RED";
    Integer height=6;
    Integer weight =30;
    void sound(){
        System.out.println("Bow bow");
    }
    void behaviour()
    {
        System.out.println("security");
    }
}
class Dog{
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.color);
        System.out.println(obj.height);
        System.out.println(obj.weight);
        obj.sound();
        obj.behaviour();
    }
}