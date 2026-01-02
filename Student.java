public class Student { // Student class is representing a student entity
    private int id;
    private String name;
    private String f_name;
    private String m_name;
    private double percentage;
    //constructor
    public Student( int id,  String name, String f_name,String m_name, double percentage) {

        this.id = id;
        this.name =  name;
        this.f_name = f_name;
        this.m_name = m_name;
        this.percentage = percentage;

    }
    //methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getF_name(){
        return f_name;
    }

    public String getM_name(){
        return m_name;
    }
    public double getPercentage(){
        return percentage;
    }

    // setter to make changes

    public void setName(String name){
        this.name = name ;
    }

    public void setF_name(String f_name ){
        this.f_name = f_name;
    }

    public void setM_name(String m_name ){
        this.m_name = m_name;
    }

    public void setPercentage(double percentage){
        this.percentage = percentage;
    }

    @Override
    public String toString(){

        return "ID: " + id + "\n" + "NAME: " + name + "\n" + "FATHER NAME: " + f_name + "\n" + "MOTHER NAME: " +  m_name + "\n" + "PERCENTAGE: " + percentage ;

    }








}



