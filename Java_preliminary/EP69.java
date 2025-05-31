public class EP69 {
    public static void main(String[] args) {
        int[]numberA={10,20,30,40};
        System.out.println(searchnumber(numberA, 20));
        String[]fruit={"apple","lemon","banana"};
        System.out.println(searchstring(fruit,"apple"));
    }
    static int searchnumber(int[] arr, int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number) return i;
        }
        return -1;
    }
    static int searchstring(String[] arr, String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(name)) return i; // == ก็ได้
        }
        return -1;
    }
}
