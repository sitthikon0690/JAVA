

class Employee5 {
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
}
