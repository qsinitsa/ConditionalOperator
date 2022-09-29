public class Task3 {
    public static void main(String[] args) {
        int seats = 5;
        if (seats < 60){
            System.out.println("Есть сидячее свободное место");
        }
        else if (seats < 102 && seats >= 60 ){
            System.out.println("Есть только стоячие места");
        }
        else {
            System.out.println("Свободных мест нет");
        }
    }
}
