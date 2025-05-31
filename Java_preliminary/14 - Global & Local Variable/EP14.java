class EP14 {
    //14 - Global & Local Variable
    public static void main(String[] args) {
        int a=10;//Global Variable 
        {
            int b=20;//Local Variable
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println(a);
        //System.out.println(b);
    }
    
}
