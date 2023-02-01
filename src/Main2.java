import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", 13000);
        Car car2 = new Car("Tesla", 9000);
        Car car3 = new Car("Porsche", 11000);

        Car[] carArray = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
