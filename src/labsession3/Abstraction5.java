/*Billing System
Abstract class Bill:
Abstract method generateBill()
Subclasses:
ElectricityBill
WaterBill
Each subclass should implement bill generation logic.*/

package labsession3;
abstract class Bill {
    abstract void generateBill();
}

class ElectricityBill extends Bill {
    int units;
    double rate = 7.5;
    ElectricityBill(String name, int id, int units) {
        this.units = units;
    }

    void generateBill() {
        System.out.println("electricity bill ");
        System.out.println((units * rate));
    }
}

class WaterBill extends Bill {
    int liters;
    double rate = 0.5;
    WaterBill(String name, int id, int liters) { 
        this.liters = liters;
    }

    void generateBill() {
        System.out.println("water bill");
        System.out.println((liters * rate));
    }
}

public class Abstraction5 {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill("Sindhu", 101, 120);
        WaterBill wb = new WaterBill("Sindhu", 101, 800);

        eb.generateBill();
        wb.generateBill();
    }
}
