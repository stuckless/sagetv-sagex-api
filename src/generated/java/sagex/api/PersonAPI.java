package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PersonAPI.html'>PersonAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class PersonAPI {
/**
Returns true if the passed in Person has an image associated with them

Parameters:
Person- the Person object
Returns:
true if the passed in Person has an image associated with them, false otherwise
Since:
8.0
 */
public static boolean HasPersonImage (Object Person) {
  Object o = sagex.SageAPI.call("HasPersonImage", new Object[] {Person});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the passed in Person has an image associated with them

Parameters:
Person- the Person object
Returns:
true if the passed in Person has an image associated with them, false otherwise
Since:
8.0
 */
public static boolean HasPersonImage (UIContext _uicontext,Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "HasPersonImage", new Object[] {Person});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the image for the specified person

Parameters:
Person- the Person object
Thumb- true if a thumbnail is desired, false if a full size image is desired
Returns:
a MetaImage object representing the requested image, null if one does not exist
Since:
8.0
 */
public static Object GetPersonImage (Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetPersonImage", new Object[] {Person,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image for the specified person

Parameters:
Person- the Person object
Thumb- true if a thumbnail is desired, false if a full size image is desired
Returns:
a MetaImage object representing the requested image, null if one does not exist
Since:
8.0
 */
public static Object GetPersonImage (UIContext _uicontext,Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonImage", new Object[] {Person,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the image URL for the specified person

Parameters:
Person- the Person object
Thumb- true if a thumbnail is desired, false if a full size image is desired
Returns:
a URL representing the requested image, null if one does not exist
Since:
8.0
 */
public static java.lang.String GetPersonImageURL (Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetPersonImageURL", new Object[] {Person,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image URL for the specified person

Parameters:
Person- the Person object
Thumb- true if a thumbnail is desired, false if a full size image is desired
Returns:
a URL representing the requested image, null if one does not exist
Since:
8.0
 */
public static java.lang.String GetPersonImageURL (UIContext _uicontext,Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonImageURL", new Object[] {Person,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String representing the birthdate of the specified person, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the birthdate of the specified person, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonDateOfBirth (Object Person) {
  Object o = sagex.SageAPI.call("GetPersonDateOfBirth", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String representing the birthdate of the specified person, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the birthdate of the specified person, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonDateOfBirth (UIContext _uicontext,Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonDateOfBirth", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String representing the date of the specified person's death, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the date of the specified person's death, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonDateOfDeath (Object Person) {
  Object o = sagex.SageAPI.call("GetPersonDateOfDeath", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String representing the date of the specified person's death, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the date of the specified person's death, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonDateOfDeath (UIContext _uicontext,Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonDateOfDeath", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String representing the birthplace of the specified person, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the birthplace of the specified person, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonBirthplace (Object Person) {
  Object o = sagex.SageAPI.call("GetPersonBirthplace", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String representing the birthplace of the specified person, empty string if unknown

Parameters:
Person- the Person object
Returns:
a String representing the birthplace of the specified person, empty string if unknown
Since:
8.0
 */
public static java.lang.String GetPersonBirthplace (UIContext _uicontext,Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonBirthplace", new Object[] {Person});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the unique ID used to identify this Person. Can get used later on a call toGetPersonForID()


Parameters:
Person- the Person object
Returns:
the unique ID used to identify this Person
Since:
8.1
 */
public static int GetPersonID (Object Person) {
  Object o = sagex.SageAPI.call("GetPersonID", new Object[] {Person});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the unique ID used to identify this Person. Can get used later on a call toGetPersonForID()


Parameters:
Person- the Person object
Returns:
the unique ID used to identify this Person
Since:
8.1
 */
public static int GetPersonID (UIContext _uicontext,Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonID", new Object[] {Person});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the Person object that corresponds to the passed in ID. The ID should have been obtained from a call toGetPersonID()


Parameters:
PersonID- the Person id
Returns:
the Person object that corresponds to the passed in ID
Since:
8.1
 */
public static Object GetPersonForID (int PersonID) {
  Object o = sagex.SageAPI.call("GetPersonForID", new Object[] {PersonID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Person object that corresponds to the passed in ID. The ID should have been obtained from a call toGetPersonID()


Parameters:
PersonID- the Person id
Returns:
the Person object that corresponds to the passed in ID
Since:
8.1
 */
public static Object GetPersonForID (UIContext _uicontext,int PersonID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPersonForID", new Object[] {PersonID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the specified object is a Person object. No automatic type conversion will be performed on the argument.

Parameters:
Object- the object to test to see if it is a Person object
Returns:
true if the argument is a Person object, false otherwise
Since:
9.0
 */
public static boolean IsPersonObject (java.lang.Object Object) {
  Object o = sagex.SageAPI.call("IsPersonObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified object is a Person object. No automatic type conversion will be performed on the argument.

Parameters:
Object- the object to test to see if it is a Person object
Returns:
true if the argument is a Person object, false otherwise
Since:
9.0
 */
public static boolean IsPersonObject (UIContext _uicontext,java.lang.Object Object) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPersonObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

}
