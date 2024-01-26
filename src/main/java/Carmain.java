import java.util.Scanner;

public class Carmain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Car car = new Car();
        System.out.println("how?");
        int orderCount = read.nextInt();

        car.moveOrder(orderCount);
        System.out.println("car"+car.getPositon()+"moved.");

    }
}
