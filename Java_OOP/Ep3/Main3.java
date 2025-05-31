public class Main3 {
    public static void main(String[] args) {
        Employee3 e1=new Employee3(); //สร้าง Oject
        e1.setID("1");
        e1.setName("TPH");
        e1.setSalary(30000.0);
        e1.displayEmployee();
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        Employee3 e2=new Employee3(); //สร้าง Oject
        e2.setID("2");
        e2.setName("TPH2");
        e2.setSalary(30002.0);
        e2.displayEmployee();
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
    }
}
