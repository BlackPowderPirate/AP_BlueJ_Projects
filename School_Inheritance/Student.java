
public abstract class Student
{
    String gender, name, address;
    int grade, studentID;
    
    public Student(String name, String address, String gender) {
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    
    public String name() {
        return name;
    }
    
    public void name(String newName) {
        name = newName;
    }
    
    public int grade() {
        return grade;
    }
    
    public void grade(int newGrade) {
        grade = newGrade;
    }
    
    public void increaseGrade() {
        grade++;
    }
    
    public String address() {
        return address;
    }
    
    public void address(String newAddress) {
        address = newAddress;
    }
    
    public String gender() {
        return gender;
    }
    
    public void gender(String genderBender) {
        gender = genderBender;
    }
    
    public int studentID() {
        return studentID;
    }
}
