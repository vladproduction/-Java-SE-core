package vladproduction.com.ch04;


public class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }
}



