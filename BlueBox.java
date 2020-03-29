package Revision;

public class BlueBox {

    public static void main(String[] args) {

        Box defaultBox = new Box();
        System.out.println(defaultBox.compute());

        Box smallBox = new Box(5, 5, 2);
        System.out.println(smallBox.compute());
    }
}
