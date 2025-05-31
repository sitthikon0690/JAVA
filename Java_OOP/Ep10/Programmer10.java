public class Programmer10 {
    //overloading method
    //คือ ชื่อ metthod เหมือนกัน แต่พารามิเตอร์และการทำงานต่างกัน
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
}
