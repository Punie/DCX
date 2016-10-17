package fr.formation;

public class User
{
	// Constructors
	public User ()
	{
		
	}
	
	public User (String firstName, String lastName, String userName)
	{
		_firstName = firstName;
		_lastName = lastName;
		_userName = userName;
	}
	
	// Getters & Setters
	public String firstName () { return _firstName; }
	public void setFirstName (String firstName) { _firstName = firstName; }

	public String lastName () { return _lastName; }
	public void setLastName (String lastName)	{ _lastName = lastName; }

	public String userName () {	return _userName; }
	public void setUserName (String userName) { _userName = userName; }

	// toString () - for testing purposes
	@Override
	public String toString ()
	{
		if (_firstName == null || _lastName == null)
			return _userName;
		
		return _userName + " (" + _firstName + " " + _lastName + ")";
	}
	
	// Properties
	private String _firstName;
	private String _lastName;
	private String _userName;
}
