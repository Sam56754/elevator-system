/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author silver
 */
public class Elevator {
    private String movingDirection;
    private boolean isMoving;
    private int currentFloor;
    private int elevatorNumber;

    public Elevator(int elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
        this.currentFloor = 0; 
        this.isMoving = false;
        this.movingDirection = "None";
    }

    public void stop() {
        isMoving = false;
        movingDirection = "None";
        System.out.println("Elevator " + elevatorNumber + " stopped at floor " + currentFloor + ".");
    }

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

    public void closeDoor() {
        System.out.println("Elevator " + elevatorNumber + " doors closing.");
    }

    public void openDoor() {
        System.out.println("Elevator " + elevatorNumber + " doors opening.");
    }

   
    public String getMovingDirection() {
        return movingDirection;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(int elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }
    public static void main(String[] args) {
    // Create an elevator object
    Elevator elevator1 = new Elevator(1);
    
    // Open doors, move elevator, and close doors
    elevator1.openDoor();
    elevator1.moveUp(10);  // Move elevator to floor 10
    elevator1.moveDown(5);    
    elevator1.stop();     
    elevator1.closeDoor();  
}
}