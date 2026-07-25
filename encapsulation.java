class Student {
    //private data members
    private int id;
    private String name;
    //setter method
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    //getter method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
    public class encapsulation{
        public static void main(String[] args){
        Student s=new Student();
        s.setId(987);
        s.setName("jithin");
        System.out.println("ID:"+s.getId());
        System.out.println("Name:"+s.getName());
        }
    }
    
