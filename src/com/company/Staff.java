package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {

    private int staffID;
    private static int numberOfStaff = 0;
    private Role role;
    private static ArrayList<Staff> staffs = new ArrayList<Staff>();



    public Staff(String name, Date dob, Role role) {
        super(name, dob);
        this.role = role;
        this.staffID = numberOfStaff++;
        staffs.add(this);
    }

    public Role getRole() { return role;}

    public void setRole(Role role) {this.role = role; }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public static int getNumberOfStaff() {
        return numberOfStaff;
    }

    public static ArrayList<Staff> getStaff() {return staffs;}

    public static void removeStaff (Staff staff)
    {
        staffs.remove(staff);
    }


    @Override
    public String toString() {
        return " " + super.toString() + " " + staffID + " Role: " + role.toString();
    }
}