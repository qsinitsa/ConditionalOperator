public class Task6 {
    public static void main(String[] args) {
        int one = 155;
        int two = 213;
        int three = 7;
        int max;
        if (one > two){
            max = one;
        }
        else max = two;
        if(max < three){
            max = three;
        }
        System.out.println(max);
    }
}
