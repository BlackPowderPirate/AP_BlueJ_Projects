
public class HourlyEmployee extends Employee
{
    double wage, hours;
    
    public HourlyEmployee(String name, double wagePerHour)
    {
        this.name = name;
        wage = wagePerHour;
        
        benefits = true;
        fullTime = true;
    }
    
    public void addHoursWorked(double newHours) {
        hours = newHours;
        totalHours+=newHours;
    }
    
    public double calculatePaycheck() {
        return hours*wage;
    }
    
    public double displayPaycheck() {
        return hours*wage;
    }
    
    public void printDetails() {
        System.out.println();
        System.out.println("Employee name: "+ name);
        System.out.println("Hourly Employee");
        System.out.println("Hourly Pay: "+ wage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Full Time: "+fullTime+" Benfits: " + benefits);
    }
}
