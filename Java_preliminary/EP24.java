class EP24 {
    public static void main(String[] args) {
        // AND & => และ
        // OR || => หรือ
        // NOT ! => ไม่ (ตรงกันข้าม)
        int a=10,b=20;
        boolean c= (a==b);
        System.out.println(c);
        System.out.println((5>6)&&(1>2));
        System.out.println((5>6)&(1>2));
        System.out.println((5>6)||(1>2));
        System.out.println((5>6)|(1>2));
        System.out.println(!(5>6));  
    }
}
