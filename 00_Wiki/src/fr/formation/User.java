package fr.formation;

public class User
{
	// Constructors
	public User ()
	{
		_type = EType.GUEST;
	}
	
	public User (String firstName, String lastName, String userName, EType type)
	{
		_firstName = firstName;
		_lastName = lastName;
		_userName = userName;
		_type = type;
	}
	
	// Getters & Setters
	public String firstName () { return _firstName; }
	public void setFirstName (String firstName) { _firstName = firstName; }

	public String lastName () { return _lastName; }
	public void setLastName (String lastName)	{ _lastName = lastName; }

	public String userName () {	return _userName; }
	public void setUserName (String userName) { _userName = userName; }
	
	public EType type () {	return _type; }
	public void setType (EType type) { _type = type; }

	// Properties
	private String _firstName;
	private String _lastName;
	private String _userName;
	private EType _type;
}
