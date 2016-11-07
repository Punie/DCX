package fr.formation.wiki;

public class User
{
    // Constructors
    public User ()
    {
        _userName = "Guest";
        _type = TypeUser.GUEST;
    }

    public User (String userName, String firstName, String lastName, TypeUser type)
    {
        _userName = userName;
        _firstName = firstName;
        _lastName = lastName;
        _type = type;
    }

    // Getters & Setters
    public int id () { return _id; }
    public void setId (int id) { _id = id; }
    
    public String userName () {	return _userName; }
    public void setUserName (String userName) { _userName = userName; }

    public String firstName () { return _firstName; }
    public void setFirstName (String firstName) { _firstName = firstName; }

    public String lastName () { return _lastName; }
    public void setLastName (String lastName)	{ _lastName = lastName; }

    public TypeUser type () { return _type; }
    public void setType (TypeUser type) { _type = type; }

    // toString () - for testing purposes
    @Override
    public String toString ()
    {
        if (_firstName == null || _lastName == null)
            return _userName + " - " + _type;

        return _userName + " (" + _firstName + " " + _lastName + ") - " + _type;
    }

    // Properties
    private int _id;
    private String _userName;
    private String _firstName;
    private String _lastName;
    private TypeUser _type;
}
