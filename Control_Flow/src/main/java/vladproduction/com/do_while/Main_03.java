package vladproduction.com.do_while;

public class Main_03 {

    public static void main(String[] args) {
        System.out.println("While loop: Starting...");
        int number = 2;
        while(number < 2){
                System.out.println(number);
                number = number + 1;
        }
        System.out.println("While loop: Done.");
        System.out.println("Do While loop: Starting...");
        int number2 = 2;
        do{
            System.out.println(number2);
            number2 = number2 + 1;
        }while(number2 < 2);
        System.out.println("Do while loop: Done.");
    }
}
