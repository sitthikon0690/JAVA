public class Main2 {
    public static void main(String[] args) {
        Employee2 e1=new Employee2(); //สร้าง Oject
        // กรณีเป็น public
        // e1.id="1";
        // e1.name="TPH";
        // e1.salary=30000.0;
        // System.out.println("ID = "+e1.id);
        // System.out.println("Name = "+e1.name);
        // System.out.println("Salary = "+e1.salary);

        // กรณีเป็น private
        e1.setID("1");
        e1.setName("TPH");
    }
}
