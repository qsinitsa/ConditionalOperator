public class Task4 {
    public static void main(String[] args) {
        int age = 24;
        if (age <= 6 && age >=2){
            System.out.println("Вам нужно ходить в детский сад");
        }
        else if (age > 6 && age <= 18){
            System.out.println("Вам нужно ходить в школу");
        }
        else if (age > 18 && age <= 24){
            System.out.println("Вам нужно ходить в институт");
        }
        else if (age > 24){
            System.out.println("Вам нужно ходить на работу");
        }
    }
}
