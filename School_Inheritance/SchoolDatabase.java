import java.util.ArrayList;
import java.text.DecimalFormat;

public class SchoolDatabase
{
    ArrayList<Student> students = new ArrayList<Student>();
    DecimalFormat df = new DecimalFormat("##.##");
    
    public SchoolDatabase()
    {
        for (int i = 1; i <= 2; i++) {
            students.add(new ESStudent("Small guy " +i, "Street " + i, "male"));
            students.add(new MSStudent("Medium guy " +i, "Road " + i, "male"));            
            students.add(new HSStudent("Big guy " +i, "Highway " + i, "male"));
            students.add(new ESStudent("New Small guy " +i, "Street " + i, "male", (2+i)));
            students.add(new MSStudent("New Medium guy " +i, "Road " + i, "male", (7+i)));            
            students.add(new HSStudent("New Big guy " +i, "Highway " + i, "male", (10+i)));
        }
        
        System.out.println(students.get(0).grade());
        System.out.println(students.get(2).grade());
        students.get(0).increaseGrade();
        students.get(2).increaseGrade();
        System.out.println(students.get(0).grade());
        System.out.println(students.get(2).grade());
        
        System.out.println(students.get(0).name());
        System.out.println(students.get(2).name());
        students.get(0).name("White Whale");
        students.get(2).name("Captain Ahab");
        System.out.println(students.get(0).name());
        System.out.println(students.get(2).name());
        
        HSStudent temp = (HSStudent)students.get(2);
        temp.updateGPA(3.2, 4);
        System.out.println(temp.credits());
        System.out.println(temp.GPA());
        temp.updateGPA(3.6, 4);
        System.out.println(temp.credits());
        System.out.println(df.format(temp.GPA()));
        temp.updateGPA(4, 3);
        System.out.println(temp.credits());
        System.out.println(df.format(temp.GPA()));
    }

}
