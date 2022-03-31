
public class MSStudent extends Student
{
    String team;
    int MCAscore8;
    
    public MSStudent(String name,String address,String gender)
    {
        super(name, address, gender);
        grade = 1;
    }

    public MSStudent(String name,String address,String gender, int grade)
    {
        super(name, address, gender);
        this.grade = grade;
    }
    
    public String team() {
        return team;
    }
    
    public void team(String newTeam) {
        team = newTeam;
    }
    
    public int MCAscore8() {
        return MCAscore8;
    }
    
    public void MCAscore8(int newMCAscore8) {
        MCAscore8 = newMCAscore8;
    }
}
