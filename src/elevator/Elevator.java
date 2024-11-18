/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elevator;

public class Elevator {
    private String movingDirection;
    private boolean isMoving;
    private int currentFloor;
    private int elevatorNumber;

    // Constructor
    public Elevator(int elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
        this.currentFloor = 0; // Start at ground floor
        this.isMoving = false;
        this.movingDirection = "None";
    }

    // Method to stop the elevator
    public void stop() {
        isMoving = false;
        movingDirection = "None";
        System.out.println("Elevator " + elevatorNumber + " stopped at floor " + currentFloor + ".");
    }

    // Method to move the elevator up
    public void moveUp(int topFloor) {
        if (currentFloor < topFloor) {
            movingDirection = "Up";
            isMoving = true;
            currentFloor++;
            System.out.println("Elevator " + elevatorNumber + " moving up to floor " + currentFloor + ".");
        } else {
            System.out.println("Elevator " + elevatorNumber + " is already at the top floor.");
        }
    }

    // Method to move the elevator down
    public void moveDown(int bottomFloor) {
        if (currentFloor > bottomFloor) {
            movingDirection = "Down";
            isMoving = true;
            currentFloor--;
            System.out.println("Elevator " + elevatorNumber + " moving down to floor " + currentFloor + ".");
        } else {
            System.out.println("Elevator " + elevatorNumber + " is already at the ground floor.");
        }
    }
}

class Button {
    private boolean isIlluminated;
    private int floor;
    private boolean isInsideElevator;

    // Constructor
    public Button(int floor, boolean isInsideElevator) {
        this.floor = floor;
        this.isInsideElevator = isInsideElevator;
        this.isIlluminated = false; // Button starts unilluminated
    }

    // Method to press the button
    public void press() {
        isIlluminated = true;
        System.out.println("Button for floor " + floor + " pressed. Illuminating button.");
    }

    // Method to cancel the button press
    public void cancel() {
        isIlluminated = false;
        System.out.println("Button for floor " + floor + " cancelled. Turning off illumination.");
    }

    // Getter for isIlluminated
    public boolean isIlluminated() {
        return isIlluminated;
    }

    // Getter for floor
    public int getFloor() {
        return floor;
    }

    // Getter for isInsideElevator
    public boolean isInsideElevator() {
        return isInsideElevator;
    }
}

class Floor {
    private int floorNumber;
    private String upButton;
    private String downButton;

    // Constructor
    public Floor(int floorNumber, String upButton, String downButton) {
        this.floorNumber = floorNumber;
        this.upButton = upButton;
        this.downButton = downButton;
    }

    // Method to request the elevator
    public void requestElevator(String direction) {
        if (direction.equalsIgnoreCase("up")) {
            System.out.println("Requesting elevator to go up from floor " + floorNumber + ".");
        } else if (direction.equalsIgnoreCase("down")) {
            System.out.println("Requesting elevator to go down from floor " + floorNumber + ".");
        } else {
            System.out.println("Invalid direction for elevator request.");
        }
    }

    // Getter for floorNumber
    public int getFloorNumber() {
        return floorNumber;
    }

    // Getter for upButton
    public String getUpButton() {
        return upButton;
    }

    // Getter for downButton
    public String getDownButton() {
        return downButton;
    }
    public static void main(String[] args) {
        // Create an Elevator
        Elevator elevator = new Elevator(1);

        // Create Floors
        Floor firstFloor = new Floor(1, "Up", "Down");
        Floor secondFloor = new Floor(2, "Up", "Down");

        // Create Buttons
        Button button1 = new Button(1, true); // Inside the elevator
        Button button2 = new Button(2, false); // Outside the elevator

        // Test Elevator Movement
        elevator.moveUp(10);
        elevator.moveDown(0);
        elevator.stop();

        // Test Button Press
        button1.press();
        button2.cancel();

        // Request Elevator
        firstFloor.requestElevator("up");
        secondFloor.requestElevator("down");
    }
}

