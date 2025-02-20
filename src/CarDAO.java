import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private List<Car> cars = new ArrayList<>();

    public CarDAO() {
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
