public class EP65 {
    public static void main(String[] args) {
        int []number = {10,1,5,12,14};
        int max=maxN(number);
        System.out.println("ตำแหน่ง index "+max);
        System.out.println("ตำแหน่ง index "+maxN(number));
    }
    static int maxN(int[] arr){
        int position_maxv=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>position_maxv) {
                position_maxv=arr[i];
                position_maxv=i;
            }
        }
        return position_maxv;
    }
}
