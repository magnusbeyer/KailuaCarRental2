import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private List<Car> cars = new ArrayList<>();

    public CarDAO() {
        cars.add(new Car(1, "Toyota", "Corolla", "Petrol", "ABC123", "2018-05", 50000, "Family"));
        cars.add(new Car(2, "BMW", "X5", "Diesel", "XYZ456", "2019-07", 30000, "Luxury"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public Car getCarByID(int carID) {
        for (Car car : cars) {
            if (car.getCarID() == carID) {
                return car;
            }
        }
        return null;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void updateCar(Car car) {
        Car existingCar = getCarByID(car.getCarID());
        if (existingCar != null) {
            existingCar.setOdometer(car.getOdometer());
        }
    }
}
