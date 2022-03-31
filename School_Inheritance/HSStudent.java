
public class HSStudent extends Student
{
    int ACTscore, APclasses, MCAscore11, credits;
    double GPA;
    
    public HSStudent(String name,String address,String gender)
    {
        super(name, address, gender);
        grade = 9;
    }

    public HSStudent(String name,String address,String gender, int grade)
    {
        super(name, address, gender);
        this.grade = grade;
    }
    
    public double GPA() {
        return GPA;
    }
    
    public void updateGPA(double newGPA, int newCredits) {
        GPA = ((newCredits*newGPA)+(credits*GPA))/(newCredits+credits);
        increaseCredits(newCredits);
    } 
    
    public int ACTscore() {
        return ACTscore;
    }
    
    public void ACTscore(int newACTscore) {
        ACTscore = newACTscore;
    } 
    
    public int APclasses() {
        return APclasses;
    }
    
    public void APclasses(int newAPclasses) {
        APclasses = newAPclasses;
    } 
    
    public int MCAscore11() {
        return MCAscore11;
    }
    
    public void MCAscore11(int newMCAscore11) {
        MCAscore11 = newMCAscore11;
    } 
    
    public int credits() {
        return credits;
    }
    
    public void increaseCredits(int newCredits) {
        credits+=newCredits;
    } 
}
