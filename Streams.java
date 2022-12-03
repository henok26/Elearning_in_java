public class Streams {
    String name;
        int number_of_students;
        int number_of_teachers;
    public void internshipArea(String position)
    {
System.out.println(position);
    }

    public static void main(String[] args) {
        
        
        Streams stream1=new Streams();
        Streams stream2=new Streams();
        Streams stream3=new Streams();
        Streams stream4=new Streams();
        stream1.internshipArea("Tele,Banks,Brodcast centers");
        stream1.name="computerEngineering";
        stream2.name="powerEngineering";
        stream3.name="controlEngineering";
        stream4.name="communication_Engineering";
        System.out.println("streams_under_electricalAndComputerEnginering_stream_are\n");
        System.out.println(stream1.name);
        System.out.println(stream2.name);
        System.out.println(stream3.name);
        System.out.println(stream4.name);
        
    }
    
}
