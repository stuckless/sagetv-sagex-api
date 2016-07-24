package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 5:40 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/UserRecordAPI.html'>UserRecordAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class UserRecordAPI {
/**
Creates a new UserRecord object in the database under the specified data 'Store' and with the
 specified 'Key'. If a UserRecord already exists with that Store/Key combination, it will be returned instead.

Parameters:
Store- the data store name to add the user record to
Key- the unique key to use for indexing this record
Returns:
the newly created UserRecord object, or if one already exists with this Store/Key combination, that is returned, null is returned if any parameters are null or the empty string
Since:
7.0
 */
public static Object AddUserRecord (java.lang.String Store, java.lang.String Key) {
  Object o = sagex.SageAPI.call("AddUserRecord", new Object[] {Store,Key});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Creates a new UserRecord object in the database under the specified data 'Store' and with the
 specified 'Key'. If a UserRecord already exists with that Store/Key combination, it will be returned instead.

Parameters:
Store- the data store name to add the user record to
Key- the unique key to use for indexing this record
Returns:
the newly created UserRecord object, or if one already exists with this Store/Key combination, that is returned, null is returned if any parameters are null or the empty string
Since:
7.0
 */
public static Object AddUserRecord (UIContext _uicontext,java.lang.String Store, java.lang.String Key) {
  Object o = sagex.SageAPI.call(_uicontext, "AddUserRecord", new Object[] {Store,Key});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets the Value from the specified Name that's stored in the given UserRecord object.

Parameters:
UserRecord- the UserRecord object
Name- the name to retrieve the corresponding value for from the specified UserRecord object, must not be null or the empty String
Returns:
the Value from the specified Name that's stored in the given UserRecord object., null will be returned if the Name has no defined value
Since:
7.0
 */
public static java.lang.String GetUserRecordData (Object UserRecord, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetUserRecordData", new Object[] {UserRecord,Name});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the Value from the specified Name that's stored in the given UserRecord object.

Parameters:
UserRecord- the UserRecord object
Name- the name to retrieve the corresponding value for from the specified UserRecord object, must not be null or the empty String
Returns:
the Value from the specified Name that's stored in the given UserRecord object., null will be returned if the Name has no defined value
Since:
7.0
 */
public static java.lang.String GetUserRecordData (UIContext _uicontext,Object UserRecord, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetUserRecordData", new Object[] {UserRecord,Name});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the Value for the specified Name that's stored in the given UserRecord object

Parameters:
UserRecord- the UserRecord object
Name- the Name to set the corresponding Value for in the specified UserRecord object, must not be null or the empty String
Value- the Value to set, use null to clear the existing setting for the specified Name
Since:
7.0
 */
public static void SetUserRecordData (Object UserRecord, java.lang.String Name, java.lang.String Value) {
   sagex.SageAPI.call("SetUserRecordData", new Object[] {UserRecord,Name,Value});
}

/**
 * UI Context Aware Call<br/>
Sets the Value for the specified Name that's stored in the given UserRecord object

Parameters:
UserRecord- the UserRecord object
Name- the Name to set the corresponding Value for in the specified UserRecord object, must not be null or the empty String
Value- the Value to set, use null to clear the existing setting for the specified Name
Since:
7.0
 */
public static void SetUserRecordData (UIContext _uicontext,Object UserRecord, java.lang.String Name, java.lang.String Value) {
   sagex.SageAPI.call(_uicontext, "SetUserRecordData", new Object[] {UserRecord,Name,Value});
}

/**
Gets an existing UserRecord object in the database under the specified data 'Store' and with the
 specified 'Key'.

Parameters:
Store- the data store name to retrieve the UserRecord from
Key- the unique key that was used when creating the UserRecord
Returns:
the requested UserRecord object, or null if no matching record was found
Since:
7.0
 */
public static Object GetUserRecord (java.lang.String Store, java.lang.String Key) {
  Object o = sagex.SageAPI.call("GetUserRecord", new Object[] {Store,Key});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets an existing UserRecord object in the database under the specified data 'Store' and with the
 specified 'Key'.

Parameters:
Store- the data store name to retrieve the UserRecord from
Key- the unique key that was used when creating the UserRecord
Returns:
the requested UserRecord object, or null if no matching record was found
Since:
7.0
 */
public static Object GetUserRecord (UIContext _uicontext,java.lang.String Store, java.lang.String Key) {
  Object o = sagex.SageAPI.call(_uicontext, "GetUserRecord", new Object[] {Store,Key});
  if (o!=null) return (Object) o;
  return null;
}

/**
Deletes the specified UserRecord object from the database.

Parameters:
UserRecord- the UserRecord object to remove from the database
Returns:
true if the specified UserRecord was removed from the database, false if it no longer exists in the database
Since:
7.0
 */
public static boolean DeleteUserRecord (Object UserRecord) {
  Object o = sagex.SageAPI.call("DeleteUserRecord", new Object[] {UserRecord});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Deletes the specified UserRecord object from the database.

Parameters:
UserRecord- the UserRecord object to remove from the database
Returns:
true if the specified UserRecord was removed from the database, false if it no longer exists in the database
Since:
7.0
 */
public static boolean DeleteUserRecord (UIContext _uicontext,Object UserRecord) {
  Object o = sagex.SageAPI.call(_uicontext, "DeleteUserRecord", new Object[] {UserRecord});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets all existing UserRecord objects that exist under the specified data Store.

Parameters:
Store- the data store name to retrieve the UserRecords from
Returns:
an array of all UserRecord objects in the database under the specified Store
Since:
7.0
 */
public static Object[] GetAllUserRecords (java.lang.String Store) {
  return (Object[]) sagex.SageAPI.call("GetAllUserRecords", new Object[] {Store});
}

/**
 * UI Context Aware Call<br/>
Gets all existing UserRecord objects that exist under the specified data Store.

Parameters:
Store- the data store name to retrieve the UserRecords from
Returns:
an array of all UserRecord objects in the database under the specified Store
Since:
7.0
 */
public static Object[] GetAllUserRecords (UIContext _uicontext,java.lang.String Store) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllUserRecords", new Object[] {Store});
}

/**
Gets all existing Stores that UserRecord objects have been created under in the database.

Returns:
an array of all the Store names that exist for UserRecords in the database
Since:
7.0
 */
public static java.lang.String[] GetAllUserStores () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllUserStores", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Gets all existing Stores that UserRecord objects have been created under in the database.

Returns:
an array of all the Store names that exist for UserRecords in the database
Since:
7.0
 */
public static java.lang.String[] GetAllUserStores (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllUserStores", (Object[])null);
}

/**
Deletes the all the UserRecords from the database under the specified Store.

Parameters:
Store- the Store name that should have all corresponding UserRecords deleted
Since:
7.0
 */
public static void DeleteAllUserRecords (java.lang.String Store) {
   sagex.SageAPI.call("DeleteAllUserRecords", new Object[] {Store});
}

/**
 * UI Context Aware Call<br/>
Deletes the all the UserRecords from the database under the specified Store.

Parameters:
Store- the Store name that should have all corresponding UserRecords deleted
Since:
7.0
 */
public static void DeleteAllUserRecords (UIContext _uicontext,java.lang.String Store) {
   sagex.SageAPI.call(_uicontext, "DeleteAllUserRecords", new Object[] {Store});
}

/**
Returns true if the passed in argument is a UserRecord object

Parameters:
UserRecord- the object to test to see if it is a UserRecord object
Returns:
true if the passed in argument is a UserRecord object, false otherwise
Since:
7.0
 */
public static boolean IsUserRecordObject (java.lang.Object UserRecord) {
  Object o = sagex.SageAPI.call("IsUserRecordObject", new Object[] {UserRecord});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the passed in argument is a UserRecord object

Parameters:
UserRecord- the object to test to see if it is a UserRecord object
Returns:
true if the passed in argument is a UserRecord object, false otherwise
Since:
7.0
 */
public static boolean IsUserRecordObject (UIContext _uicontext,java.lang.Object UserRecord) {
  Object o = sagex.SageAPI.call(_uicontext, "IsUserRecordObject", new Object[] {UserRecord});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets a list of all the 'Name' values used in name-value pairs in this UserRecord object

Parameters:
UserRecord- the UserRecord object to get the list of Names stored in
Returns:
an array of all the names used to store data within this UserRecord object
Since:
7.0
 */
public static java.lang.String[] GetUserRecordNames (Object UserRecord) {
  return (java.lang.String[]) sagex.SageAPI.call("GetUserRecordNames", new Object[] {UserRecord});
}

/**
 * UI Context Aware Call<br/>
Gets a list of all the 'Name' values used in name-value pairs in this UserRecord object

Parameters:
UserRecord- the UserRecord object to get the list of Names stored in
Returns:
an array of all the names used to store data within this UserRecord object
Since:
7.0
 */
public static java.lang.String[] GetUserRecordNames (UIContext _uicontext,Object UserRecord) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetUserRecordNames", new Object[] {UserRecord});
}

}
