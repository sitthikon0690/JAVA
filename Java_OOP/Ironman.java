public class Ironman extends SuperHero13 implements SkillHero13,Nation13 {
    private String skill;
    public void skill(String skill){
        this.skill=skill;
        System.out.println(this.skill);
    }
    public void moving(String moving){

    }
    public void weapon(String weapon){
        System.out.println("weapon = "+weapon);
    }
    public void setNation(String nation){
        System.out.println("nation = "+nation);
    }
}
