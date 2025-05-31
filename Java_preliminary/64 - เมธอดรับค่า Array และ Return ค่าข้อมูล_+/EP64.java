public class EP64 {
    public static void main(String[] args) {
        int []number = {10,1,5,12,14};
        int max=maxN(number);
        System.out.println(max);
        System.out.println(maxN(number));
    }
    static int maxN(int[] arr){
        int maxv=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxv) maxv=arr[i];
        }
        return maxv;
    }
}
