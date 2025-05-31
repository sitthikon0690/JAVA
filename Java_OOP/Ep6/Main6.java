public class Main6 {
    public static void main(String[] args) {
        Programmer6 p1=new Programmer6();//Salary ใช้Constructorคลาสแม่
        p1.setID("1");
        p1.setName("dd");
        p1.displayEmployee();

        // Programmer6 p2=new Programmer6("1","dd",300.0);
        // p2.displayEmployee(); ไม่ได้

        Programmer6_2 p2_1=new Programmer6_2();

    }
}
