package tuan3XeMay;

public class Vehicle {

    private String owner;
    private String type;
    private double value;
    private int engineCapacity;
    
    public Vehicle() {
    	value =0.0;
    	engineCapacity = 0;
    }

    public Vehicle(String owner, String type, double value, int engineCapacity) {
        this.owner = owner;
        this.type = type;
        this.value = value;
        this.engineCapacity = engineCapacity;
    }

    // Getter methods
    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    // Setter methods
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        if (value > 0) { // Kiểm tra hợp lệ
            this.value = value;
        } else {
            System.out.println("Trị giá xe phải lớn hơn 0.");
        }
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity > 0) { // Kiểm tra hợp lệ
            this.engineCapacity = engineCapacity;
        } else {
            System.out.println("Dung tích xy lanh phải lớn hơn 0.");
        }
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return value * 0.01;
        } else if (engineCapacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }

    public void displayInfo() {
        System.out.printf("%-20s %-15s %-10d %-15.2f %-15.2f%n", 
                          owner, type, engineCapacity, value, calculateTax());
    }
}
