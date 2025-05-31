class EP44{
    public static void main(String[] args) {
        //ทำก่อนรอบหนึ่ง ถ้าเงื่อนไขเป็นจริงกลับไปทำซ้ำเลื่อยๆ
        int count=1;
        do{
            System.out.println(count++);
        }while(count<5);
        count=1;
        do{
            System.out.println(count++);
        }while(count==0);
    }
}