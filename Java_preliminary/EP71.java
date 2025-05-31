public class EP71 {
    public static void main(String[] args) {
        connectSever(120);
    }
    private static void connectSever(int ping){
        System.out.println("ping"+ping);
        if(ping>100) return;
        System.out.println("connect");
    }
}
