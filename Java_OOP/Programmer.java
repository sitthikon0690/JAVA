public class Programmer extends Employee{
    //overloading method
    public void skill(){
        System.out.println("NO Skill");
    }
    public void skill(String language){
        System.out.println("Skill ="+language);
    }
    public void skill(String ...language){
        for(int i=0;i<language.length;i++){
            System.out.println("Skill ="+language[i]);
        }
    }

    //overriding method
    public void bonus(){
        System.out.println("bonus 20%");
    }
}
