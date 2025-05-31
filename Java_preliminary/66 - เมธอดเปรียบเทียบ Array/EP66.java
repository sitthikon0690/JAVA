public class EP66 {
    public static void main(String[] args) {
        int []number = {10,1,5,12,14};
        int []number2 = {10,1,5,12,14};
        int []number3 = {1,1,5,12,14};
        System.out.println(compareArray(number, number2));
        System.out.println(compareArray(number, number3));
    }
    static boolean compareArray(int[] a,int[] b){
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
