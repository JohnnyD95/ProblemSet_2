package edu.monmouth.ProblemSet2; //8a

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        CampusVehicle vehicle1 = new CampusVehicle(); //8b

       
        System.out.println("Vehicle 1 Default Values:"); 
        System.out.println(vehicle1.getId());
        System.out.println(vehicle1.getLocation());
        System.out.println(vehicle1.isAvailable()); //8c

       
        vehicle1.setId("MU1001");
        vehicle1.setLocation("Parking Lot");
        vehicle1.setAvailable(true); //8d

      
        System.out.println("Vehicle 1 Updated Values:");
        System.out.println(vehicle1.getId());
        System.out.println(vehicle1.getLocation());
        System.out.println(vehicle1.isAvailable()); //8e

     
        vehicle1.checkOut();
        System.out.println("After checkout:");
        System.out.println(vehicle1.isAvailable()); //8f

    
        vehicle1.returnVehicle();
        System.out.println("After return:");
        System.out.println(vehicle1.isAvailable()); //8f
        

        
        CampusVehicle vehicle2 = new CampusVehicle("MU2002", "Spruce Hall", true);//8g

        
        System.out.println("Vehicle 2 Initial Values:");
        System.out.println(vehicle2.getId());
        System.out.println(vehicle2.getLocation());
        System.out.println(vehicle2.isAvailable()); //8h

        
        vehicle2.setId("MU1090");
        vehicle2.setLocation("library");
        vehicle2.setAvailable(true); //8i

        
        System.out.println("Vehicle 2 Updated Values:");
        System.out.println(vehicle2.getId());
        System.out.println(vehicle2.getLocation());
        System.out.println(vehicle2.isAvailable()); //8j

        
        vehicle2.checkOut();
        System.out.println("Vehicle 2 after Checkout:");
        System.out.println(vehicle2.isAvailable()); //8k

        vehicle2.returnVehicle();
        System.out.println("Vehicle 2 After Return:");
        System.out.println(vehicle2.isAvailable()); //8k
        
        
        CampusVehicle vehicle3 = new CampusVehicle(null, null, true);

        System.out.println("Vehicle 3 - Null Values:");
        System.out.println(vehicle3.getId());
        System.out.println(vehicle3.getLocation());
        System.out.println(vehicle3.isAvailable());

        
        CampusVehicle vehicle4 = new CampusVehicle(" ", " ", true);

        System.out.println("Vehicle 4 - Empty Strings:");
        System.out.println(vehicle4.getId());
        System.out.println(vehicle4.getLocation());
        System.out.println(vehicle4.isAvailable());

       
        CampusVehicle vehicle5 = new CampusVehicle("MU1", "Gym", false);

        System.out.println("Vehicle 5 - Invalid Values:");
        System.out.println(vehicle5.getId());
        System.out.println(vehicle5.getLocation());
        System.out.println(vehicle5.isAvailable());

        
        CampusVehicle vehicle6 = new CampusVehicle("MU123456789101112", "Cafeteria", true);

        System.out.println("Vehicle 6 - Invalid Values:");
        System.out.println(vehicle6.getId());
        System.out.println(vehicle6.getLocation());
        System.out.println(vehicle6.isAvailable());


	}

}
