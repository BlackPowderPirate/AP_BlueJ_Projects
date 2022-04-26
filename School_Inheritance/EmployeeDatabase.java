import java.util.ArrayList;
import java.text.DecimalFormat;

public class EmployeeDatabase
{
    ArrayList<Employee> employees = new ArrayList<Employee>();
    DecimalFormat df = new DecimalFormat("##.##");


    public EmployeeDatabase()
    {
        for (int i = 1; i <= 2; i++) {
            employees.add(new HourlyEmployee("Semi-Productive: " + i, 14+(i*2)));
            employees.add(new SalariedEmployee("Over Paided Asset " + i, 40000+(i*10000)));            
            employees.add(new PartTimeEmployee("Sould Be Intern "+ i, 9+i));
        }
        
        for (Employee employee: employees)
            employee.printDetails();
        
        for (int i = 0; i < employees.size(); i++) {
            if (i%3 == 0 || i%3 == 2) {
                HourlyEmployee temp = (HourlyEmployee)employees.get(i);
                temp.addHoursWorked(5+i);
                temp.calculatePaycheck();
            }
            else employees.get(i).calculatePaycheck();
        }
        
        for (Employee employee: employees)
            System.out.println(employee.displayPaycheck());
    }

}
