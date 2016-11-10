package fr.formation.garage;

public class Person
{
    private String fName;
    private String lName;
    private int age;
    private String scope;
    
    public Person ()
    {
        fName = "";
        lName = "";
        age = 0;
        scope = "";
    }
    
    public String getfName ()
    {
        return fName;
    }
    public void setfName (String fName)
    {
        this.fName = fName;
    }
    
    public String getlName ()
    {
        return lName;
    }
    public void setlName (String lName)
    {
        this.lName = lName;
    }
    
    public int getAge ()
    {
        return age;
    }
    public void setAge (int age)
    {
        this.age = age;
    }
    
    public String getScope ()
    {
        return scope;
    }
    public void setScope (String scope)
    {
        this.scope = scope;
    }
}
