package fr.formation;

public enum EType
{
	GUEST,			// Not logged in, can only read content
	CONTRIBUTOR,	// Logged in, can post comments
	AUTHOR,			// Can submit articles
	MODERATOR,		// Can modify or publish articles
	ADMIN			// Can do it all !
}
