public class First {
    String name;
    int age;

    public First(int age,String name){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        First f = new First(21,"Devika");
        System.out.println(f.age);
        System.out.println(f.name);
    }
}