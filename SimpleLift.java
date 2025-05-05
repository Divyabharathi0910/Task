package intern;

import java.util.Scanner;

public class SimpleLift implements Lift {
	    private int currentFloor;

	    public SimpleLift() {
	        this.currentFloor = 0;
	    }

	    public void goToFloor(int floor) {
	        System.out.println("Moving from floor " + currentFloor + " to floor " + floor);
	        currentFloor = floor;
	        System.out.println("Arrived at floor " + currentFloor);
	    }

	    public int getCurrentFloor() {
	        return currentFloor;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Lift lift = new SimpleLift(); 

	        while (true) {
	            System.out.println("\n1. Go to Floor");
	            System.out.println("2. Show Current Floor");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter floor number: ");
	                int floor = scanner.nextInt();
	                lift.goToFloor(floor);
	            } else if (choice == 2) {
	                System.out.println("Current floor: " + lift.getCurrentFloor());
	            } else if (choice == 3) {
	                System.out.println("Exiting the lift . ");
	                break;
	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        
	    }
	}



