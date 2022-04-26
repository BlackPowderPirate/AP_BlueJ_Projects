
public class SalariedEmployee extends Employee
{
    double salary;
    
    public SalariedEmployee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        
        benefits = true;
        fullTime = true;
    }
    
    public double calculatePaycheck() {
        addHoursWorked();
        return salary/52;
    }
    
    public void addHoursWorked() {
        totalHours+=40;
    }
    
    public double displayPaycheck() {
        return salary/52;
    }
    
    public void printDetails() {
        System.out.println();
        System.out.println("Employee name: "+ name);
        System.out.println("Salaried Employee");
        System.out.println("Annual Salary: "+ salary);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Full Time: "+fullTime+" Benfits: " + benefits);
    }
}
