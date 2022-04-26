
public abstract class Employee
{
    String name;
    double weeklySalary, yearDateSalary, totalHours;
    boolean fullTime, benefits;
    
    public String name() {
        return name;
    }
    
    public void name(String newName) {
        name = newName;
    }
    
    public void setBenefits(boolean newBenfits) {
        benefits = newBenfits;
    }
    
    public void setFullTime(boolean newFullTime) {
        fullTime = newFullTime;
        if (fullTime) setBenefits(fullTime);
    }
    
    public abstract double calculatePaycheck();
    
    public double displayPaycheck() {
        return -1;
    };
    
    public abstract void printDetails();
}
