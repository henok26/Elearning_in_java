

public class Procedural_employe  {
    
    public static int wage(int salary,int working_hours,int over_time)
    {
        return over_time*working_hours*salary;
    }
    public static void main(String[] args) {
        int salary=50000;
    int working_hours=23;
    int over_time=21;
        wage(over_time,working_hours,salary);
        
    }
    
}
