abstract public class SuperHero {
    private String name;
    private String age;

    public void setname(String name){
        this.name=name;
    }
    public void setage(String age){
        this.age=age;
    }
    public abstract void skill(String skill);

    public void displayHero(){
        System.out.println("name = "+this.name+"\nage = "+this.age);
    }
    
}
