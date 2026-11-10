class Smartphone{
    String model="Vivo";
    String os="Andriod";
    Integer storage=120;
    void takePhoto()
    {
        System.out.println("Click! photo captured..");
    }
    void browseInternet()
    {
        System.out.println("Loading Website...");
    } 
}
class Phone {
    public static void main(String[] args) {
        Smartphone obj=new Smartphone();
        System.out.println(obj.model);
        System.out.println(obj.os);
        System.out.println(obj.storage);
        obj.takePhoto();
        obj.browseInternet();
    }
    }
