package projects.VehicleManagementSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Car maruti=new Car("Maruti",2025,"mz23-100");
        Scanner sc=new Scanner(System.in);
        int option=0;
        while(option!=7){
            System.out.println("\n1.Start | 2.accelerate | 3.brake | 4.off | 5.play music | 6.Car info | 7.exit");
            System.out.println("Select your option:");
            option=sc.nextInt();
            switch (option){
                case 1:
                    maruti.carStart();
                    break;
                case 2:
                    maruti.Accelerate();
                    break;
                case 3:
                    maruti.Brake();
                    break;
                case 4 :
                    maruti.CarOff();
                    break;
                case 5:
                    maruti.PlayMusic();
                    break;
                case 6:
                    System.out.println(maruti.getInfo());
                    break;
                case 7:
                    break;
            }


        }

    }
}
