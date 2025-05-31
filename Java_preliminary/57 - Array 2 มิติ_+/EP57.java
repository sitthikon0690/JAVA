public class EP57 {
    public static void main(String[] args) {
        String[][] fruits = {
            {"มะละกอ0","มะม่วง0","แต่งโม0"},
        {"มะละกอ1","มะม่วง1","แต่งโม1"},
        {"มะละกอ2","มะม่วง2","แต่งโม2"}
        };
        System.out.println(fruits[1][1]);
        
        //เปลี่ยน
        fruits[1][1] = "sss";
        System.out.println(fruits[1][1]);
    }
}
