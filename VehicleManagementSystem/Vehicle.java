package projects.VehicleManagementSystem;

public class Vehicle {
    String brandName;
    int year;
    String model;
    public Vehicle(String brandName,int year,String model){
        this.brandName=brandName;
        this.year=year;
        this.model=model;
    }
    public void carStart(){
        System.out.println("Car engine on->");
    }
    public void CarOff(){
        System.out.println("Car Engine off =>");
    }
    public void Accelerate(){
        System.out.println("Car is Moving ==>>");
    }
    public void Brake(){
        System.out.println("Car Stopped==");
    }
}
