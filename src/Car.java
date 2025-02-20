public class Car {
    private int carID;
    private String brand;
    private String model;
    private String fuelType;
    private String registrationNumber;
    private String firstRegistration;
    private int odometer;
    private String category;

    // Constructor
    public Car(int carID, String brand, String model, String fuelType, String registrationNumber,
               String firstRegistration, int odometer, String category) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.firstRegistration = firstRegistration;
        this.odometer = odometer;
        this.category = category;
    }

    // Getters and setters
    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFirstRegistration() {
        return firstRegistration;
    }

    public void setFirstRegistration(String firstRegistration) {
        this.firstRegistration = firstRegistration;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Car [ID=" + carID + ", Brand=" + brand + ", Model=" + model + ", Fuel=" + fuelType +
                ", Registration=" + registrationNumber + ", First Registration=" + firstRegistration +
                ", Odometer=" + odometer + " km, Category=" + category + "]";
    }
}
