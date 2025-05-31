
public class EP70 {
    public static void main(String[] args) {
        sum(5,2,5,4,8,8);
    }
    static void sum(int...number){
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println(sum);
    }
}
