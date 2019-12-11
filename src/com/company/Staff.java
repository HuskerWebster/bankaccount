package com.company;

import java.util.Date;

public class Staff extends Person {

    private int staffID;
    private static int numberOfStaff = 0;

    public Staff(String name, Date dob) {
        super(name, dob);
        this.staffID = numberOfStaff++;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public static int getNumberOfStaff() {
        return numberOfStaff;
    }

    @Override
    public String toString() {
        return " " + super.toString() + " " + staffID;
    }
}