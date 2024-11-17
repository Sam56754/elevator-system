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
        this.currentFloor = 0;  // Assume ground floor initially
        this.isMoving = false;
        this.movingDirection = "None";
    }

    public void stop() {
        isMoving = false;
        System.out.println("Elevator " + elevatorNumber + " stopped.");
    }

    public void moveUp() {
        movingDirection = "Up";
        isMoving = true;
        currentFloor++;
        System.out.println("Elevator " + elevatorNumber + " moving up to floor " + currentFloor);
    }

    public void moveDown() {
        movingDirection = "Down";
        isMoving = true;
        currentFloor--;
        System.out.println("Elevator " + elevatorNumber + " moving down to floor " + currentFloor);
    }

    public void closeDoor() {
        System.out.println("Elevator " + elevatorNumber + " doors closing.");
    }

    public void openDoor() {
        System.out.println("Elevator " + elevatorNumber + " doors opening.");
    }

    // Getters and Setters for the fields if needed
}
