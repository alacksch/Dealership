public class Car extends Vehicle {
    private String carColor;
    private int horsePower;
    private int cylinders;
    private int CC;

    public Car(String name, int price, int stock, String carColor, int horsePower, int cylinders, int CC) {
        super(name, price, stock);
        this.carColor = carColor;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
        this.CC = CC;
    }

    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public int getCC() {
        return CC;
    }
    public void setCC(int CC) {
        this.CC = CC;
    }
}