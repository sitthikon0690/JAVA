class Employee3 {
        //Attribute
        private String id;
        private String name;
        private Double salary;

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

        public String getName(){
            return this.name;
        }
        public double getSalary(){
            return this.salary;
        }
}
