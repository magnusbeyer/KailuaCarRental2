public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String zip;
    private String city;
    private String mobilePhone;
    private String phone;
    private String email;
    private String driverLicenceNumber;
    private String driverSinceDate;  // Driver since date (First driving license date)

    // Constructor
    public Customer(int customerID, String name, String address, String zip, String city,
                    String mobilePhone, String phone, String email, String driverLicenceNumber,
                    String driverSinceDate) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.email = email;
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverSinceDate = driverSinceDate;  // Initialize driverSinceDate
    }

    // Getters and setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public String getDriverSinceDate() {
        return driverSinceDate;  // Getter for driverSinceDate
    }

    public void setDriverSinceDate(String driverSinceDate) {
        this.driverSinceDate = driverSinceDate;  // Setter for driverSinceDate
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerID + ", Name=" + name + ", Address=" + address + ", Zip=" + zip + ", City=" + city +
                ", MobilePhone=" + mobilePhone + ", Phone=" + phone + ", Email=" + email + ", DriverLicence=" + driverLicenceNumber +
                ", DriverSince=" + driverSinceDate + "]";
    }
}
