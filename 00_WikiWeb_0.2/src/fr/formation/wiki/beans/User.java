package fr.formation.wiki.beans;

public class User
{
    // Constructors
    public User ()
    {
        id = 0;
        userName = "Guest";
        type = TypeUser.GUEST;
    }

    // Getters & Setters
    public int getId () { return id; }
    public void setId (int id) { this.id = id; }
    
    public String getUserName () {	return userName; }
    public void setUserName (String userName) { this.userName = userName; }

    public TypeUser getType () { return type; }
    public void setType (TypeUser type) { this.type = type; }

    // Properties
    private int id;
    private String userName;
    private TypeUser type;
}
