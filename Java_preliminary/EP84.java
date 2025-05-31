class EP84{
    public static void main(String[] args) {
        //expression ? valueForTrue : valueForFalse ;
        int n = -2;
        String name = "Mateo";
        System.out.println(n < 0 ? "n is a negative number." : "n is a positive number.");
        System.out.println(name.length() <= 5 ? "Your name is accepted." : "Your name is too long." );
    }
}