class Employee4 {
        //Attribute
        private String id;
        private String name;
        private Double salary;

        //Constructor
        //ทำงานทันทีที่เริ่มสร้าง Object สามารถมีได้มากกกว่า1 ชื่อ methodต้องเหมือนชื่อคลาส
        public Employee4(){
            this.id="Default";
            this.name="Default";
            this.salary=00.0;
        }
        public Employee4(String id, String name, Double salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
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
            System.out.println("ID = "+this.id);
            System.out.println("Name = "+this.name);
            System.out.println("Salary = "+this.salary);
            
        }
}
