package projects.VehicleManagementSystem;
import java.util.Scanner;
public class Car extends Vehicle {
    Scanner sc=new Scanner(System.in);
    String FuelType="Petrol Engine";
    public Car(String brandName,int year,String model){
        super(brandName,year,model);
    }
    public String getInfo(){
        String Door=NoOfDoor();
        return "BrandName:"+this.brandName+"\nModel Year:"+this.year+"\nModelName:"+this.model+"\n"
                +Door+"\n"+"FeulType:"+FuelType;
    }
    public String NoOfDoor(){
        int Doors=4;
       return "No of Doors:"+Doors;
    }

    public void PlayMusic(){
        System.out.println("Who's Music You Want:?");
        System.out.println("For ilaiyaRaja -> press 1\n For ARR-> press 2\n For Deva-> press 3");
        System.out.println("Enter you Choice: ");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("ilaiya nila playing..");
        }
        else if(choice==2){
            System.out.println("pudhu vellai mazhai playing...");
        }
        else{
            System.out.println("meenamma playing...");
        }
    }
}
