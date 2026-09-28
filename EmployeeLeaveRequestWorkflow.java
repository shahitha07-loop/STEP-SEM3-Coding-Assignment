public class EmployeeLeaveRequestWorkflow {

    static abstract class Employee {
        String name;

        Employee(String n) {
            name = n;
        }
    }

    static class FullTimeEmployee extends Employee {
        FullTimeEmployee(String n) {
            super(n);
        }
    }

    static class LeaveRequest {
        String status = "Pending";

        void approve() {
            if (status.equals("Pending"))
                status = "Approved";
        }

        void reject() {
            if (status.equals("Pending"))
                status = "Rejected";
        }
    }

    public static void main(String[] args) {

        FullTimeEmployee john = new FullTimeEmployee("John");

        LeaveRequest lr = new LeaveRequest();

        System.out.println("Leave submitted for " + john.name);
        System.out.println("Status: " + lr.status);

        lr.approve();

        System.out.println("Status: " + lr.status);

        if (lr.status.equals("Approved"))
            System.out.println("Cannot change to Pending");
    }
}