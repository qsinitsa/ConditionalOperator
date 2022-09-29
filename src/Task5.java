public class Task5 {
    public static void main(String[] args) {
        int age = 18;
        if (age < 5){
            System.out.println("Вам нельзя кататься на атракционрах");
        }
        else if (age >= 5 && age < 14){
            System.out.println("Можно кататься только со взрослым");
        }
        else {
            System.out.println("Можно кататься без сопровождения");
        }
    }
}
