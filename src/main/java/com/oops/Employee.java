package com.oops;

public abstract class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    protected Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public abstract void work();

    private int leaveBalance;
    public void applyLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
            System.out.println("Leave applied for " + days + " days.");
        } else {
            System.out.println("Insufficient leave balance.");
        }
    }

    public void addLeave(int days) {
        leaveBalance += days;
        System.out.println("Leave added: " + days + " days.");
    }
    public int getLeaveBalance() {
        return leaveBalance;
    }
    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
    public abstract void attendTraining();
    public abstract void attendMeeting();
    public abstract void submitReport();
    public abstract void givePresentation();
    public abstract void conductTraining();
    public abstract void manageProject();

    public abstract void handleClient();
    public abstract void mentorJunior();
    public abstract void participateInTeamBuilding();
    public abstract void performQualityCheck();
    public abstract void handleFeedback();
}
