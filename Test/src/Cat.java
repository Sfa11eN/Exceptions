public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void check() {
        System.out.println(name + " " + age);
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void  setAge(int age) {
        this.age=age;
    }

}
