public class EP55 {
    public static void main(String[] args) {
        int[]number={5,7,8,9,1,2};
        int count = number.length;
        System.out.println(count);
        for(int i=0;i<count;i++){
            System.out.println(i);
        }
        
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
        System.out.println("===================");
        for(int i=1;i<=number.length;i++){
            System.out.println(number[i]);
        }
    }
}
