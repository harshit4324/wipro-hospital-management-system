import java.util.Scanner;


interface HospitalStaff {
    void displayInformation();
}

class Employee implements HospitalStaff {
    protected String name;
    protected int employeeId;
    protected String department;

    public Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, int employeeId, String department, String specialization) {
        super(name, employeeId, department);
        this.specialization = specialization;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Employee {
    private int yearsOfExperience;

    public Nurse(String name, int employeeId, String department, int yearsOfExperience) {
        super(name, employeeId, department);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding a Doctor:");
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Doctor's Employee ID: ");
        int doctorId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Doctor's Department: ");
        String doctorDept = scanner.nextLine();
        System.out.print("Enter Doctor's Specialization: ");
        String doctorSpecialization = scanner.nextLine();

        Doctor doctor = new Doctor(doctorName, doctorId, doctorDept, doctorSpecialization);

        
        System.out.println("\nAdding a Nurse:");
        System.out.print("Enter Nurse's Name: ");
        String nurseName = scanner.nextLine();
        System.out.print("Enter Nurse's Employee ID: ");
        int nurseId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Nurse's Department: ");
        String nurseDept = scanner.nextLine();
        System.out.print("Enter Nurse's Years of Experience: ");
        int nurseExperience = scanner.nextInt();
        scanner.nextLine(); 

        Nurse nurse = new Nurse(nurseName, nurseId, nurseDept, nurseExperience);

        scanner.close();

       
        System.out.println("\nHospital Staff Information:");
        System.out.println("\nDoctor:");
        doctor.displayInformation();
        System.out.println("\nNurse:");
        nurse.displayInformation();
    }
}
