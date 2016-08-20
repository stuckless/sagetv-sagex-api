package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/SystemMessageAPI.html'>SystemMessageAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class SystemMessageAPI {
/**
Gets the global alert level in the system.

Returns:
a value from 0-3; with 0=No Alert, 1=Info Alert, 2=Warning Alert, 3=Error Alert
Since:
6.6
 */
public static int GetSystemAlertLevel () {
  Object o = sagex.SageAPI.call("GetSystemAlertLevel", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the global alert level in the system.

Returns:
a value from 0-3; with 0=No Alert, 1=Info Alert, 2=Warning Alert, 3=Error Alert
Since:
6.6
 */
public static int GetSystemAlertLevel (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemAlertLevel", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the list of SystemMessage objects currently in the queue.

Returns:
an array of SystemMessage objects currently in the queue
Since:
6.6
 */
public static Object[] GetSystemMessages () {
  return (Object[]) sagex.SageAPI.call("GetSystemMessages", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the list of SystemMessage objects currently in the queue.

Returns:
an array of SystemMessage objects currently in the queue
Since:
6.6
 */
public static Object[] GetSystemMessages (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetSystemMessages", (Object[])null);
}

/**
Resets the global alert level in the system back to zero.

Since:
6.6
 */
public static void ResetSystemAlertLevel () {
   sagex.SageAPI.call("ResetSystemAlertLevel", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Resets the global alert level in the system back to zero.

Since:
6.6
 */
public static void ResetSystemAlertLevel (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ResetSystemAlertLevel", (Object[])null);
}

/**
Deletes all the SystemMessages from the queue. This will not have any effect on the global alert level.

Since:
6.6
 */
public static void DeleteAllSystemMessages () {
   sagex.SageAPI.call("DeleteAllSystemMessages", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Deletes all the SystemMessages from the queue. This will not have any effect on the global alert level.

Since:
6.6
 */
public static void DeleteAllSystemMessages (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DeleteAllSystemMessages", (Object[])null);
}

/**
Deletes the specified SystemMessage from the queue. This will not have any effect on the global alert level.

Parameters:
message- the SystemMessage object to delete
Since:
6.6
 */
public static void DeleteSystemMessage (Object message) {
   sagex.SageAPI.call("DeleteSystemMessage", new Object[] {message});
}

/**
 * UI Context Aware Call<br>
Deletes the specified SystemMessage from the queue. This will not have any effect on the global alert level.

Parameters:
message- the SystemMessage object to delete
Since:
6.6
 */
public static void DeleteSystemMessage (UIContext _uicontext,Object message) {
   sagex.SageAPI.call(_uicontext, "DeleteSystemMessage", new Object[] {message});
}

/**
Gets the 'message string' associated with this SystemMessage. This is the same result as converting the object to a String.

Parameters:
message- the SystemMessage object to get the 'message string' for
Returns:
the 'message string' for the specified SystemMessage
Since:
6.6
 */
public static java.lang.String GetSystemMessageString (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageString", new Object[] {message});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the 'message string' associated with this SystemMessage. This is the same result as converting the object to a String.

Parameters:
message- the SystemMessage object to get the 'message string' for
Returns:
the 'message string' for the specified SystemMessage
Since:
6.6
 */
public static java.lang.String GetSystemMessageString (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageString", new Object[] {message});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the time when this SystemMessage was first posted.

Parameters:
message- the SystemMessage object to get the time of
Returns:
the time for the specified SystemMessage
Since:
6.6
 */
public static long GetSystemMessageTime (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageTime", new Object[] {message});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the time when this SystemMessage was first posted.

Parameters:
message- the SystemMessage object to get the time of
Returns:
the time for the specified SystemMessage
Since:
6.6
 */
public static long GetSystemMessageTime (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageTime", new Object[] {message});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the time when this SystemMessage was last posted. For messages that did not repeat this will be the same as
 GetSystemMessageTime. For messages that repeated; this will be the time of the last repeating occurence.

Parameters:
message- the SystemMessage object to get the end time of
Returns:
the end time for the specified SystemMessage
Since:
6.6
 */
public static long GetSystemMessageEndTime (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageEndTime", new Object[] {message});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the time when this SystemMessage was last posted. For messages that did not repeat this will be the same as
 GetSystemMessageTime. For messages that repeated; this will be the time of the last repeating occurence.

Parameters:
message- the SystemMessage object to get the end time of
Returns:
the end time for the specified SystemMessage
Since:
6.6
 */
public static long GetSystemMessageEndTime (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageEndTime", new Object[] {message});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the number of times this message was repeated. For a message that repeated once (i.e. it had 2 occurences), this
 method will return 2.

Parameters:
message- the SystemMessage object to get the repeat count for
Returns:
the repeat count for the specified SystemMessage
Since:
6.6
 */
public static int GetSystemMessageRepeatCount (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageRepeatCount", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the number of times this message was repeated. For a message that repeated once (i.e. it had 2 occurences), this
 method will return 2.

Parameters:
message- the SystemMessage object to get the repeat count for
Returns:
the repeat count for the specified SystemMessage
Since:
6.6
 */
public static int GetSystemMessageRepeatCount (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageRepeatCount", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns a localized string which represents the type of SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the type of
Returns:
the type for the specified SystemMessage
Since:
6.6
 */
public static java.lang.String GetSystemMessageTypeName (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageTypeName", new Object[] {message});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a localized string which represents the type of SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the type of
Returns:
the type for the specified SystemMessage
Since:
6.6
 */
public static java.lang.String GetSystemMessageTypeName (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageTypeName", new Object[] {message});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns an integer which represents the type of SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the type of
Returns:
the type for the specified SystemMessage
Since:
6.6
 */
public static int GetSystemMessageTypeCode (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageTypeCode", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns an integer which represents the type of SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the type of
Returns:
the type for the specified SystemMessage
Since:
6.6
 */
public static int GetSystemMessageTypeCode (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageTypeCode", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the alert level for the SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the alert level of
Returns:
a value from 0-3; with 0=No Alert, 1=Info Alert, 2=Warning Alert, 3=Error Alert
Since:
6.6
 */
public static int GetSystemMessageLevel (Object message) {
  Object o = sagex.SageAPI.call("GetSystemMessageLevel", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the alert level for the SystemMessage that was specified.

Parameters:
message- the SystemMessage object to get the alert level of
Returns:
a value from 0-3; with 0=No Alert, 1=Info Alert, 2=Warning Alert, 3=Error Alert
Since:
6.6
 */
public static int GetSystemMessageLevel (UIContext _uicontext,Object message) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageLevel", new Object[] {message});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the SystemMessage variable property associated with the specified SystemMessage. Depending
 upon the type of message; different variables will be assigned that can be used to do further analysis/processing
 on the message or to guide the user through resolution steps.

Parameters:
message- the SystemMessage object to lookup the variable in
VarName- the name of the variable to lookup in this SystemMessage (string based values)
Returns:
a String that corresponds to the requested variable or null if it does not exist
Since:
6.6
 */
public static java.lang.String GetSystemMessageVariable (Object message, java.lang.String VarName) {
  Object o = sagex.SageAPI.call("GetSystemMessageVariable", new Object[] {message,VarName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the SystemMessage variable property associated with the specified SystemMessage. Depending
 upon the type of message; different variables will be assigned that can be used to do further analysis/processing
 on the message or to guide the user through resolution steps.

Parameters:
message- the SystemMessage object to lookup the variable in
VarName- the name of the variable to lookup in this SystemMessage (string based values)
Returns:
a String that corresponds to the requested variable or null if it does not exist
Since:
6.6
 */
public static java.lang.String GetSystemMessageVariable (UIContext _uicontext,Object message, java.lang.String VarName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSystemMessageVariable", new Object[] {message,VarName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Creates a new SystemMessage and posts it to the message queue.
 Predefined message codes of interest for posting messages are:SOFTWARE_UPDATE_MSG = 1202STORAGE_MONITOR_MSG = 1203GENERAL_MSG = 1204You may also use other user-defined message codes which should be greater than 9999. To give those messages a 'type name' which
 will be visible by the user; you can defined a message variable with the name 'typename' and then that will be displayed.

Parameters:
MessageCode- the integer code that specifies the type of message
MessageLevel- the integer code specifying the level of the message; 0=Status(does not raise global level),1=Info, 2=Warning, 3=Error
MessageString- a localized message string that explains what the message is in detail
MessageVariables- a java.util.Properties object which has name-value pairs that represent variables corresponding to the details of this message
Since:
6.6
 */
public static void PostSystemMessage (int MessageCode, int MessageLevel, java.lang.String MessageString, java.util.Properties MessageVariables) {
   sagex.SageAPI.call("PostSystemMessage", new Object[] {MessageCode,MessageLevel,MessageString,MessageVariables});
}

/**
 * UI Context Aware Call<br>
Creates a new SystemMessage and posts it to the message queue.
 Predefined message codes of interest for posting messages are:SOFTWARE_UPDATE_MSG = 1202STORAGE_MONITOR_MSG = 1203GENERAL_MSG = 1204You may also use other user-defined message codes which should be greater than 9999. To give those messages a 'type name' which
 will be visible by the user; you can defined a message variable with the name 'typename' and then that will be displayed.

Parameters:
MessageCode- the integer code that specifies the type of message
MessageLevel- the integer code specifying the level of the message; 0=Status(does not raise global level),1=Info, 2=Warning, 3=Error
MessageString- a localized message string that explains what the message is in detail
MessageVariables- a java.util.Properties object which has name-value pairs that represent variables corresponding to the details of this message
Since:
6.6
 */
public static void PostSystemMessage (UIContext _uicontext,int MessageCode, int MessageLevel, java.lang.String MessageString, java.util.Properties MessageVariables) {
   sagex.SageAPI.call(_uicontext, "PostSystemMessage", new Object[] {MessageCode,MessageLevel,MessageString,MessageVariables});
}

/**
Returns true if the passed in argument is a SystemMessage object

Parameters:
SystemMessage- the object to test to see if it is a SystemMessage object
Returns:
true if the passed in argument is a SystemMessage object, false otherwise
Since:
7.0
 */
public static boolean IsSystemMessageObject (java.lang.Object SystemMessage) {
  Object o = sagex.SageAPI.call("IsSystemMessageObject", new Object[] {SystemMessage});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the passed in argument is a SystemMessage object

Parameters:
SystemMessage- the object to test to see if it is a SystemMessage object
Returns:
true if the passed in argument is a SystemMessage object, false otherwise
Since:
7.0
 */
public static boolean IsSystemMessageObject (UIContext _uicontext,java.lang.Object SystemMessage) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSystemMessageObject", new Object[] {SystemMessage});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the names of the variables associated with the specified SystemMessage. Depending
 upon the type of message; different variables will be assigned that can be used to do further analysis/processing
 on the message or to guide the user through resolution steps. The actual values can be retrieved with
 GetSystemMessageVariable.

Parameters:
message- the SystemMessage object to get the variable names of
Returns:
a String array with all the names of the variables for the specified SystemMessage
Since:
7.0
 */
public static java.lang.String[] GetSystemMessageVariableNames (Object message) {
  return (java.lang.String[]) sagex.SageAPI.call("GetSystemMessageVariableNames", new Object[] {message});
}

/**
 * UI Context Aware Call<br>
Returns the names of the variables associated with the specified SystemMessage. Depending
 upon the type of message; different variables will be assigned that can be used to do further analysis/processing
 on the message or to guide the user through resolution steps. The actual values can be retrieved with
 GetSystemMessageVariable.

Parameters:
message- the SystemMessage object to get the variable names of
Returns:
a String array with all the names of the variables for the specified SystemMessage
Since:
7.0
 */
public static java.lang.String[] GetSystemMessageVariableNames (UIContext _uicontext,Object message) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSystemMessageVariableNames", new Object[] {message});
}

}
