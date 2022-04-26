
public class PartTimeEmployee extends HourlyEmployee
{

    public PartTimeEmployee(String name, int wagePerHour)
    {
        super(name, wagePerHour);
        
        fullTime = false;
        benefits = false;
    }
    
    public void printDetails() {
        System.out.println();
        System.out.println("Employee name: "+ name);
        System.out.println("Part-Time Employee");
        System.out.println("Hourly Pay: "+ wage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Full Time: "+fullTime+" Benfits: " + benefits);
    }
}
