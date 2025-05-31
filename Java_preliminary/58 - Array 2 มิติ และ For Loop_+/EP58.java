public class EP58 {
    public static void main(String[] args) {
        String[][] fruits = {
        {"มะละกอ0","มะม่วง0","แต่งโม0"},
        {"มะละกอ1","มะม่วง1","แต่งโม1"},
        {"มะละกอ2","มะม่วง2"}
        };
        System.out.println(fruits.length);
        for(int row = 0 ;row<fruits.length;row++){
            for(int column = 0 ;column<fruits[row].length;column++){
                System.out.println(fruits[row][column]);

            }
        }
        //ไม่ได้
        // for(String item : fruits){
        //     System.out.println(item);
        // }
    }
}
