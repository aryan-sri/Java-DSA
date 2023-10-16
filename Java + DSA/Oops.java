 class Student
{
    private String name;
    private int reg;
    Student(String name,int reg)
    {
        this.name = name;
        this.reg = reg;
    }
    public String getName()
    {
        return name;
    }
    public int getReg()
    {
        return reg;
    }
    public void study()
    {
        System.out.println(name+ "is studying");
    }
}
 class CollegeStudents extends Student
{
    private String major;
    CollegeStudents(String name , int reg, String major)
    {
        super(name, reg);
    }
    @Override
    public void study()
    {
            System.out.println(getName() +"is Studing" + major);
    }
}
public class Oops
{
    public static void main(String[] args) {
        Student student1 = new Student("Aryan", 212);
        CollegeStudents student2 = new CollegeStudents("Bob", 23, "Computer ");
        
    }
}

