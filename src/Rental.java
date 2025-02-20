public class Rental {
    private int rentalID;
    private int customerID;
    private String fromDate;
    private String toDate;
    private int maxKm;
    private int startKm;
    private String registrationNumber;

    public Rental(int rentalID, int customerID, String fromDate, String toDate, int maxKm, int startKm, String registrationNumber) {
        this.rentalID = rentalID;
        this.customerID = customerID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.maxKm = maxKm;
        this.startKm = startKm;
        this.registrationNumber = registrationNumber;
    }

    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getStartKm() {
        return startKm;
    }

    public void setStartKm(int startKm) {
        this.startKm = startKm;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Rental [RentalID=" + rentalID + ", CustomerID=" + customerID + ", FromDate=" + fromDate + ", ToDate=" + toDate +
                ", MaxKm=" + maxKm + ", StartKm=" + startKm + ", RegistrationNumber=" + registrationNumber + "]";
    }
}
