abstract class Employee11 {
        //Attribute
        private String id;
        private String name;
        private Double salary;

        //Static คือ กำหนดให้สามารถเรียกใช้ได้โดยไม่ต้องสร้าง Object
        //Static Attribue 
        static int minSalary=10000;

        //Static method
        static void service() {
            System.out.println("Static method");
        } 



        //Default Constructor
        //ทำงานทันทีที่เริ่มสร้าง Object สามารถมีได้มากกกว่า1 
        public Employee11(){
            System.out.println("Employee");
        }
            //Constructor
        public Employee11(String name, Double salary){
            this.name=name;
            this.salary=salary;
            displayEmployee();
        }


        //Method
        public void setID(String id){
            this.id=id;
            //id(ข้างนอก),id(ข้างในหรือที่ส่งเข้ามา)
        }
        public void setName(String name){
            this.name=name;
        }
        public void setSalary(Double salary){
            this.salary=salary;
        }

        public void displayEmployee() {
            System.out.println("Name = "+this.name);
            System.out.println("Salary = "+this.salary);
            
        }

        public String getName(){
            return this.name;
        }
        public double getSalary(){
            return this.salary;
        }

        //abstract
        public abstract void bonus();
        
        public void bonus2(){
            System.out.println("bonus 30%");
        }
}
