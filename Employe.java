class Employee{
    String name="Vijaya";
    Integer Id=30221;
    Float salary= 45000.0f;
    void work()
    {
        System.out.println("writing code");
    }
    void getBonus()
    {
        System.out.println("Employees bonus from company");
    }
}
class Employe {
    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println(obj.name);
        System.out.println(obj.Id);
        System.out.println(obj.salary);
        obj.work();
        obj.getBonus();
    }
}
