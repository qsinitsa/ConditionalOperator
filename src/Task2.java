public class Task2 {
    public static void main(String[] args) {
        int age = 21;
        if (age >= 7 && age < 18){
            System.out.println("Вы ходите в школу");
        }
        else if (age >= 18 && age <= 24){
            System.out.println("Вы учитесь в интституте");
        }
        else {
            System.out.println("Вы ходите на работу");
        }
    }
}
