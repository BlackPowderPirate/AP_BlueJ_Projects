
public class ESStudent extends Student
{
    String teacher;
    int MCAscore3, MCAscore5;
    
    public ESStudent(String name,String address,String gender)
    {
        super(name, address, gender);
        grade = 1;
    }

    public ESStudent(String name,String address,String gender, int grade)
    {
        super(name, address, gender);
        this.grade = grade;
    }
    
    public String teacher() {
        return teacher;
    }
    
    public void teacher(String newTeacher) {
        teacher = newTeacher;
    }
    
    public int MCAscore5 () {
        return MCAscore5;
    }
    
    public void MCAscore5(int newMCAscore5) {
        MCAscore5 = newMCAscore5;
    }
}
