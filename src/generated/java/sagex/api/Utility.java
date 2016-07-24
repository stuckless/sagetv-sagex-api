package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 5:40 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/Utility.html'>Utility</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class Utility {
/**
Gets the value for the specified key out of a map. Useful for analyzing data from aGroupByMethod ()
call.

Parameters:
Grouping- the map to get the value from
Key- the key to use for retrieving the value
Returns:
the value for the specified key in the specified map
 */
public static java.lang.Object GetSubgroup (java.util.Map Grouping, java.lang.Object Key) {
  Object o = sagex.SageAPI.call("GetSubgroup", new Object[] {Grouping,Key});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the value for the specified key out of a map. Useful for analyzing data from aGroupByMethod ()
call.

Parameters:
Grouping- the map to get the value from
Key- the key to use for retrieving the value
Returns:
the value for the specified key in the specified map
 */
public static java.lang.Object GetSubgroup (UIContext _uicontext,java.util.Map Grouping, java.lang.Object Key) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSubgroup", new Object[] {Grouping,Key});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Executes the specified keystroke in either the SageTV event system or by emulation in the operating system

Parameters:
Character- the keystroke to perform, can contain Ctrl, Shift, Alt and combinations thereof with the specified key name
System- if true then an operating system keystroke should be emulated, if false then keep the keystroke within SageTV
 */
public static void Keystroke (java.lang.String Character, boolean System) {
   sagex.SageAPI.call("Keystroke", new Object[] {Character,System});
}

/**
 * UI Context Aware Call<br/>
Executes the specified keystroke in either the SageTV event system or by emulation in the operating system

Parameters:
Character- the keystroke to perform, can contain Ctrl, Shift, Alt and combinations thereof with the specified key name
System- if true then an operating system keystroke should be emulated, if false then keep the keystroke within SageTV
 */
public static void Keystroke (UIContext _uicontext,java.lang.String Character, boolean System) {
   sagex.SageAPI.call(_uicontext, "Keystroke", new Object[] {Character,System});
}

/**
Returns the size of the specified data.

Parameters:
Data- the object to get the data size of
Returns:
for a Collection or Map, the size of it; for an array, the length; for a string, the length, otherwise 0 is returned
 */
public static int Size (java.lang.Object Data) {
  Object o = sagex.SageAPI.call("Size", new Object[] {Data});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the size of the specified data.

Parameters:
Data- the object to get the data size of
Returns:
for a Collection or Map, the size of it; for an array, the length; for a string, the length, otherwise 0 is returned
 */
public static int Size (UIContext _uicontext,java.lang.Object Data) {
  Object o = sagex.SageAPI.call(_uicontext, "Size", new Object[] {Data});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns true if the argument is null, zero, an empty string or a failed image load

Parameters:
Data- the object to test
Returns:
true if the argument is null, zero, an empty string or a failed image load
Since:
7.0
 */
public static boolean IsEmpty (java.lang.Object Data) {
  Object o = sagex.SageAPI.call("IsEmpty", new Object[] {Data});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the argument is null, zero, an empty string or a failed image load

Parameters:
Data- the object to test
Returns:
true if the argument is null, zero, an empty string or a failed image load
Since:
7.0
 */
public static boolean IsEmpty (UIContext _uicontext,java.lang.Object Data) {
  Object o = sagex.SageAPI.call(_uicontext, "IsEmpty", new Object[] {Data});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a formatted date string for the specified Date.

Parameters:
Format- null if SageTV's default date format should be used, otherwise use a formatting string as specified in java.text.SimpleDateFormat
Date- either a java.util.Date object or a long which corresponds to the date
Returns:
the date formatted string
 */
public static java.lang.String DateFormat (java.lang.String Format, java.lang.Object Date) {
  Object o = sagex.SageAPI.call("DateFormat", new Object[] {Format,Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted date string for the specified Date.

Parameters:
Format- null if SageTV's default date format should be used, otherwise use a formatting string as specified in java.text.SimpleDateFormat
Date- either a java.util.Date object or a long which corresponds to the date
Returns:
the date formatted string
 */
public static java.lang.String DateFormat (UIContext _uicontext,java.lang.String Format, java.lang.Object Date) {
  Object o = sagex.SageAPI.call(_uicontext, "DateFormat", new Object[] {Format,Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted numeric string for the specified number.

Parameters:
Format- a formatting string as specified in java.text.DecimalFormat
Number- the floating point number to format
Returns:
the formatted numeric string
 */
public static java.lang.String NumberFormat (java.lang.String Format, float Number) {
  Object o = sagex.SageAPI.call("NumberFormat", new Object[] {Format,Number});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted numeric string for the specified number.

Parameters:
Format- a formatting string as specified in java.text.DecimalFormat
Number- the floating point number to format
Returns:
the formatted numeric string
 */
public static java.lang.String NumberFormat (UIContext _uicontext,java.lang.String Format, float Number) {
  Object o = sagex.SageAPI.call(_uicontext, "NumberFormat", new Object[] {Format,Number});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted duration String for a period of time in milliseconds. The formatting string
 uses the % character for escapement (%% is not supported, you cannot display the % symbol in a duration string).
 The 'd', 'h', 'm' and 's' characters can be used to indicate days, hours, minutes and seconds respectively.
 Any format character may be prefixed by the 'r' character to indicate it is a required field.For example, the format string %rh:%m for 20 minutes would return 0:20 and for the string $h:%m it would return 20
 If there's characters before a field value then that value will be zero padded, i.e. 65 minutes for %h:%m would be 1:05


Parameters:
Format- the duration format string, or null to use SageTV's default duration formatting
Duration- the duration to print out in milliseconds
Returns:
the formatted duration string
 */
public static java.lang.String DurFormat (java.lang.String Format, long Duration) {
  Object o = sagex.SageAPI.call("DurFormat", new Object[] {Format,Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted duration String for a period of time in milliseconds. The formatting string
 uses the % character for escapement (%% is not supported, you cannot display the % symbol in a duration string).
 The 'd', 'h', 'm' and 's' characters can be used to indicate days, hours, minutes and seconds respectively.
 Any format character may be prefixed by the 'r' character to indicate it is a required field.For example, the format string %rh:%m for 20 minutes would return 0:20 and for the string $h:%m it would return 20
 If there's characters before a field value then that value will be zero padded, i.e. 65 minutes for %h:%m would be 1:05


Parameters:
Format- the duration format string, or null to use SageTV's default duration formatting
Duration- the duration to print out in milliseconds
Returns:
the formatted duration string
 */
public static java.lang.String DurFormat (UIContext _uicontext,java.lang.String Format, long Duration) {
  Object o = sagex.SageAPI.call(_uicontext, "DurFormat", new Object[] {Format,Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a length 2 Long object array which can be used for specifying a time span in a table. The first element
 will be the StartTime and the second will be the EndTime

Parameters:
StartTime- the long value which specifies the start value of the time span
EndTime- the long value which specifies the end value of the time span
Returns:
an array which represents this time span
 */
public static java.lang.Long[] CreateTimeSpan (long StartTime, long EndTime) {
  return (java.lang.Long[]) sagex.SageAPI.call("CreateTimeSpan", new Object[] {StartTime,EndTime});
}

/**
 * UI Context Aware Call<br/>
Returns a length 2 Long object array which can be used for specifying a time span in a table. The first element
 will be the StartTime and the second will be the EndTime

Parameters:
StartTime- the long value which specifies the start value of the time span
EndTime- the long value which specifies the end value of the time span
Returns:
an array which represents this time span
 */
public static java.lang.Long[] CreateTimeSpan (UIContext _uicontext,long StartTime, long EndTime) {
  return (java.lang.Long[]) sagex.SageAPI.call(_uicontext, "CreateTimeSpan", new Object[] {StartTime,EndTime});
}

/**
Returns the element at the specified index in this data; works for arrays and java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List or array object to get the element from
Index- the 0-based index of the element to retrieve
Returns:
the element at the specified index or null if there is no such element
 */
public static java.lang.Object GetElement (java.lang.Object Data, int Index) {
  Object o = sagex.SageAPI.call("GetElement", new Object[] {Data,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the element at the specified index in this data; works for arrays and java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List or array object to get the element from
Index- the 0-based index of the element to retrieve
Returns:
the element at the specified index or null if there is no such element
 */
public static java.lang.Object GetElement (UIContext _uicontext,java.lang.Object Data, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetElement", new Object[] {Data,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Sets the element at the specified index in this data; works for arrays and java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List or array object to set the element for
Index- the 0-based index of the element to set
Value- the value to set
Returns:
the Value parameters is returned
 */
public static java.lang.Object SetElement (java.lang.Object Data, int Index, java.lang.Object Value) {
  Object o = sagex.SageAPI.call("SetElement", new Object[] {Data,Index,Value});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Sets the element at the specified index in this data; works for arrays and java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List or array object to set the element for
Index- the 0-based index of the element to set
Value- the value to set
Returns:
the Value parameters is returned
 */
public static java.lang.Object SetElement (UIContext _uicontext,java.lang.Object Data, int Index, java.lang.Object Value) {
  Object o = sagex.SageAPI.call(_uicontext, "SetElement", new Object[] {Data,Index,Value});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Removes the element at the specified index in this data; works java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List object to remove the element from
Index- the 0-based index of the element to remove
Returns:
the element at the specified index or null if there is no such element
 */
public static java.lang.Object RemoveElementAtIndex (java.util.List Data, int Index) {
  Object o = sagex.SageAPI.call("RemoveElementAtIndex", new Object[] {Data,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Removes the element at the specified index in this data; works java.util.List implementations (i.e. Vector, etc.)

Parameters:
Data- the java.util.List object to remove the element from
Index- the 0-based index of the element to remove
Returns:
the element at the specified index or null if there is no such element
 */
public static java.lang.Object RemoveElementAtIndex (UIContext _uicontext,java.util.List Data, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "RemoveElementAtIndex", new Object[] {Data,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Removes the element at with the specified value from this data. Works for java.util.Collection or java.util.Map implementations.
 If the value appears multiple times in the data (for Collections) only the first occurrence is removed.

Parameters:
Data- the java.util.Collection or java.util.Map object to remove the element from; for maps it removes based on key
Value- the value to remove from the data
Returns:
for java.util.Collections true if the element exists and was removed, false otherwise; for java.util.Maps it returns the value that the specified key corresponded to
 */
public static java.lang.Object RemoveElement (java.lang.Object Data, java.lang.Object Value) {
  Object o = sagex.SageAPI.call("RemoveElement", new Object[] {Data,Value});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Removes the element at with the specified value from this data. Works for java.util.Collection or java.util.Map implementations.
 If the value appears multiple times in the data (for Collections) only the first occurrence is removed.

Parameters:
Data- the java.util.Collection or java.util.Map object to remove the element from; for maps it removes based on key
Value- the value to remove from the data
Returns:
for java.util.Collections true if the element exists and was removed, false otherwise; for java.util.Maps it returns the value that the specified key corresponded to
 */
public static java.lang.Object RemoveElement (UIContext _uicontext,java.lang.Object Data, java.lang.Object Value) {
  Object o = sagex.SageAPI.call(_uicontext, "RemoveElement", new Object[] {Data,Value});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Add the element with the specified value to this data. Works for java.util.Collection implementations.

Parameters:
Data- the java.util.Collection object to add the element to
Value- the value to add to the data
Returns:
for java.util.Collections true if the data changed as a result of the call (i.e. the add succeded and was not redundant), false otherwise
Since:
7.0
 */
public static boolean AddElement (java.util.Collection Data, java.lang.Object Value) {
  Object o = sagex.SageAPI.call("AddElement", new Object[] {Data,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Add the element with the specified value to this data. Works for java.util.Collection implementations.

Parameters:
Data- the java.util.Collection object to add the element to
Value- the value to add to the data
Returns:
for java.util.Collections true if the data changed as a result of the call (i.e. the add succeded and was not redundant), false otherwise
Since:
7.0
 */
public static boolean AddElement (UIContext _uicontext,java.util.Collection Data, java.lang.Object Value) {
  Object o = sagex.SageAPI.call(_uicontext, "AddElement", new Object[] {Data,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the index in the data that the specified element is found at. If there are multiple occurrences of this element
 only the first index is returned. This works for arrays and java.util.List implementations.

Parameters:
Data- the java.util.List or array to look in
Element- the value to search the data for
Returns:
the 0-based index of the specified element in the data, or -1 if it does not exist
 */
public static int FindElementIndex (java.lang.Object Data, java.lang.Object Element) {
  Object o = sagex.SageAPI.call("FindElementIndex", new Object[] {Data,Element});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the index in the data that the specified element is found at. If there are multiple occurrences of this element
 only the first index is returned. This works for arrays and java.util.List implementations.

Parameters:
Data- the java.util.List or array to look in
Element- the value to search the data for
Returns:
the 0-based index of the specified element in the data, or -1 if it does not exist
 */
public static int FindElementIndex (UIContext _uicontext,java.lang.Object Data, java.lang.Object Element) {
  Object o = sagex.SageAPI.call(_uicontext, "FindElementIndex", new Object[] {Data,Element});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Searches a sorted list of data to find the index that the specified criteria exists at; or if it doesn't exist
 in the data it will use the index that would be the appropriate insertion point for the criteria in the data
 in order to maintain sort order. The element at that index is what is returned

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array
Criteria- the object to compare the elements to; this must implement java.lang.Comparable
Method- the method name to execute on each element to get the value to compare; use null to compare the elements themselves
Returns:
the element at the comparative insertion point
 */
public static java.lang.Object FindComparativeElement (java.lang.Object Data, java.lang.Comparable Criteria, java.lang.String Method) {
  Object o = sagex.SageAPI.call("FindComparativeElement", new Object[] {Data,Criteria,Method});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches a sorted list of data to find the index that the specified criteria exists at; or if it doesn't exist
 in the data it will use the index that would be the appropriate insertion point for the criteria in the data
 in order to maintain sort order. The element at that index is what is returned

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array
Criteria- the object to compare the elements to; this must implement java.lang.Comparable
Method- the method name to execute on each element to get the value to compare; use null to compare the elements themselves
Returns:
the element at the comparative insertion point
 */
public static java.lang.Object FindComparativeElement (UIContext _uicontext,java.lang.Object Data, java.lang.Comparable Criteria, java.lang.String Method) {
  Object o = sagex.SageAPI.call(_uicontext, "FindComparativeElement", new Object[] {Data,Criteria,Method});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns the substring from a specified string. Same as java.lang.String.substring(int startIndex, int endIndex)

Parameters:
String- the string to get the substring of
StartIndex- the 0-based index that the substring starts at
EndIndex- the 0-based index that the substring ends at or -1 if the substring goes to the end of the string
Returns:
the substring from the specified string
 */
public static java.lang.String Substring (java.lang.String String, int StartIndex, int EndIndex) {
  Object o = sagex.SageAPI.call("Substring", new Object[] {String,StartIndex,EndIndex});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the substring from a specified string. Same as java.lang.String.substring(int startIndex, int endIndex)

Parameters:
String- the string to get the substring of
StartIndex- the 0-based index that the substring starts at
EndIndex- the 0-based index that the substring ends at or -1 if the substring goes to the end of the string
Returns:
the substring from the specified string
 */
public static java.lang.String Substring (UIContext _uicontext,java.lang.String String, int StartIndex, int EndIndex) {
  Object o = sagex.SageAPI.call(_uicontext, "Substring", new Object[] {String,StartIndex,EndIndex});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the substring from a specified string. The substring will start at the beginning of the string and end
 EndIndex characters before the end of the string. Same as Substring(String, 0, Size(String) - EndOffset).

Parameters:
String- the string to get the substring of
EndOffset- the number of characters from the end of the string to terminate the substring (0 implies return the entire string)
Returns:
the substring from the specified string
Since:
7.0
 */
public static java.lang.String SubstringBegin (java.lang.String String, int EndOffset) {
  Object o = sagex.SageAPI.call("SubstringBegin", new Object[] {String,EndOffset});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the substring from a specified string. The substring will start at the beginning of the string and end
 EndIndex characters before the end of the string. Same as Substring(String, 0, Size(String) - EndOffset).

Parameters:
String- the string to get the substring of
EndOffset- the number of characters from the end of the string to terminate the substring (0 implies return the entire string)
Returns:
the substring from the specified string
Since:
7.0
 */
public static java.lang.String SubstringBegin (UIContext _uicontext,java.lang.String String, int EndOffset) {
  Object o = sagex.SageAPI.call(_uicontext, "SubstringBegin", new Object[] {String,EndOffset});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Rounds a floating point number to an integral value. For Doubles a Long is returned, for Floats an Integer is returned

Parameters:
Number- the number to round
Returns:
the rounded value
 */
public static java.lang.Object Round (java.lang.Object Number) {
  Object o = sagex.SageAPI.call("Round", new Object[] {Number});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Rounds a floating point number to an integral value. For Doubles a Long is returned, for Floats an Integer is returned

Parameters:
Number- the number to round
Returns:
the rounded value
 */
public static java.lang.Object Round (UIContext _uicontext,java.lang.Object Number) {
  Object o = sagex.SageAPI.call(_uicontext, "Round", new Object[] {Number});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns the current time; see java.lang.System.currentTimeMillis() for the explanation of the units.

Returns:
the current time
 */
public static long Time () {
  Object o = sagex.SageAPI.call("Time", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the current time; see java.lang.System.currentTimeMillis() for the explanation of the units.

Returns:
the current time
 */
public static long Time (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "Time", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns a string that represents the current time.

Returns:
a string that represents the current time.
 */
public static java.lang.String PrintCurrentTime () {
  Object o = sagex.SageAPI.call("PrintCurrentTime", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a string that represents the current time.

Returns:
a string that represents the current time.
 */
public static java.lang.String PrintCurrentTime (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintCurrentTime", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted date string using the java.text.DateFormat.MEDIUM formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDate (long Date) {
  Object o = sagex.SageAPI.call("PrintDate", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted date string using the java.text.DateFormat.MEDIUM formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDate (UIContext _uicontext,long Date) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDate", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted date string using SageTV's default detailed date formatting

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateLong (long Date) {
  Object o = sagex.SageAPI.call("PrintDateLong", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted date string using SageTV's default detailed date formatting

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateLong (UIContext _uicontext,long Date) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDateLong", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted date string using the java.text.DateFormat.SHORT formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateShort (long Date) {
  Object o = sagex.SageAPI.call("PrintDateShort", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted date string using the java.text.DateFormat.SHORT formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateShort (UIContext _uicontext,long Date) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDateShort", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted date string using the java.text.DateFormat.FULL formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateFull (long Date) {
  Object o = sagex.SageAPI.call("PrintDateFull", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted date string using the java.text.DateFormat.FULL formatting technique

Parameters:
Date- the date value to format
Returns:
a formatted date string
 */
public static java.lang.String PrintDateFull (UIContext _uicontext,long Date) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDateFull", new Object[] {Date});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted time string using the java.text.DateFormat.MEDIUM formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTime (long Time) {
  Object o = sagex.SageAPI.call("PrintTime", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted time string using the java.text.DateFormat.MEDIUM formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTime (UIContext _uicontext,long Time) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintTime", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted time string using the java.text.DateFormat.LONG formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeLong (long Time) {
  Object o = sagex.SageAPI.call("PrintTimeLong", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted time string using the java.text.DateFormat.LONG formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeLong (UIContext _uicontext,long Time) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintTimeLong", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted time string using the java.text.DateFormat.SHORT formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeShort (long Time) {
  Object o = sagex.SageAPI.call("PrintTimeShort", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted time string using the java.text.DateFormat.SHORT formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeShort (UIContext _uicontext,long Time) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintTimeShort", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted time string using the java.text.DateFormat.FULL formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeFull (long Time) {
  Object o = sagex.SageAPI.call("PrintTimeFull", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted time string using the java.text.DateFormat.FULL formatting technique

Parameters:
Time- the time value to format
Returns:
a formatted time string
 */
public static java.lang.String PrintTimeFull (UIContext _uicontext,long Time) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintTimeFull", new Object[] {Time});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted duration string according to SageTV's verbose duration formating, minutes is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDuration (long Duration) {
  Object o = sagex.SageAPI.call("PrintDuration", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted duration string according to SageTV's verbose duration formating, minutes is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDuration (UIContext _uicontext,long Duration) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDuration", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted duration string according to SageTV's default duration formating, seconds is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDurationWithSeconds (long Duration) {
  Object o = sagex.SageAPI.call("PrintDurationWithSeconds", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted duration string according to SageTV's default duration formating, seconds is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDurationWithSeconds (UIContext _uicontext,long Duration) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDurationWithSeconds", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a formatted duration string according to SageTV's concise duration formating, minutes is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDurationShort (long Duration) {
  Object o = sagex.SageAPI.call("PrintDurationShort", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a formatted duration string according to SageTV's concise duration formating, minutes is the most detailed resolution of this format

Parameters:
Duration- the duration in milliseconds to print
Returns:
the formatted duration string
 */
public static java.lang.String PrintDurationShort (UIContext _uicontext,long Duration) {
  Object o = sagex.SageAPI.call(_uicontext, "PrintDurationShort", new Object[] {Duration});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the amount of disk free space in bytes at the specified path

Parameters:
DrivePath- the path string of a disk to get the free space of
Returns:
the free space on the specified disk in bytes
 */
public static long GetDiskFreeSpace (java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call("GetDiskFreeSpace", new Object[] {DrivePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the amount of disk free space in bytes at the specified path

Parameters:
DrivePath- the path string of a disk to get the free space of
Returns:
the free space on the specified disk in bytes
 */
public static long GetDiskFreeSpace (UIContext _uicontext,java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDiskFreeSpace", new Object[] {DrivePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the amount of total disk space in bytes at the specified path

Parameters:
DrivePath- the path string of a disk to get the total space of
Returns:
the total space on the specified disk in bytes
 */
public static long GetDiskTotalSpace (java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call("GetDiskTotalSpace", new Object[] {DrivePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the amount of total disk space in bytes at the specified path

Parameters:
DrivePath- the path string of a disk to get the total space of
Returns:
the total space on the specified disk in bytes
 */
public static long GetDiskTotalSpace (UIContext _uicontext,java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDiskTotalSpace", new Object[] {DrivePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the name of the filesystem type at the specified path

Parameters:
DrivePath- the path string of a disk to get the filesystem type for
Returns:
the name of the filesystem type at the specified path
 */
public static java.lang.String GetFileSystemType (java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call("GetFileSystemType", new Object[] {DrivePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the name of the filesystem type at the specified path

Parameters:
DrivePath- the path string of a disk to get the filesystem type for
Returns:
the name of the filesystem type at the specified path
 */
public static java.lang.String GetFileSystemType (UIContext _uicontext,java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileSystemType", new Object[] {DrivePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a list of the Windows registry names which exist under the specified root  key (Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Returns:
the names stored in the registry under the specified key
 */
public static java.lang.String[] GetWindowsRegistryNames (java.lang.String Root, java.lang.String Key) {
  return (java.lang.String[]) sagex.SageAPI.call("GetWindowsRegistryNames", new Object[] {Root,Key});
}

/**
 * UI Context Aware Call<br/>
Returns a list of the Windows registry names which exist under the specified root  key (Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Returns:
the names stored in the registry under the specified key
 */
public static java.lang.String[] GetWindowsRegistryNames (UIContext _uicontext,java.lang.String Root, java.lang.String Key) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetWindowsRegistryNames", new Object[] {Root,Key});
}

/**
Returns a DWORD value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to retrieve
Returns:
the value of the specified registry setting as a DWORD
 */
public static int GetWindowsRegistryDWORDValue (java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetWindowsRegistryDWORDValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns a DWORD value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to retrieve
Returns:
the value of the specified registry setting as a DWORD
 */
public static int GetWindowsRegistryDWORDValue (UIContext _uicontext,java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWindowsRegistryDWORDValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns a string value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to retrieve
Returns:
the value of the specified registry setting as a string
 */
public static int GetWindowsRegistryStringValue (java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetWindowsRegistryStringValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns a string value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to retrieve
Returns:
the value of the specified registry setting as a string
 */
public static int GetWindowsRegistryStringValue (UIContext _uicontext,java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWindowsRegistryStringValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Removes a value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to remove
Returns:
true if the specified setting was removed, false otherwise
 */
public static boolean RemoveWindowsRegistryValue (java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call("RemoveWindowsRegistryValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Removes a value from the Windows registry for the specified root, key and name(Windows only)
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to look in
Key- the key path in the registry hive
Name- the name of the registry value to remove
Returns:
true if the specified setting was removed, false otherwise
 */
public static boolean RemoveWindowsRegistryValue (UIContext _uicontext,java.lang.String Root, java.lang.String Key, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "RemoveWindowsRegistryValue", new Object[] {Root,Key,Name});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets a DWORD value in the Windows registry for the specified root, key and name(Windows only)
 The name will be created if it doesn't already exist.
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to use
Key- the key path in the registry hive
Name- the name of the registry value to set
Value- the value of the specified registry setting as a DWORD
Returns:
true if the operation was successful, false otherwise
 */
public static boolean SetWindowsRegistryDWORDValue (java.lang.String Root, java.lang.String Key, java.lang.String Name, int Value) {
  Object o = sagex.SageAPI.call("SetWindowsRegistryDWORDValue", new Object[] {Root,Key,Name,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Sets a DWORD value in the Windows registry for the specified root, key and name(Windows only)
 The name will be created if it doesn't already exist.
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to use
Key- the key path in the registry hive
Name- the name of the registry value to set
Value- the value of the specified registry setting as a DWORD
Returns:
true if the operation was successful, false otherwise
 */
public static boolean SetWindowsRegistryDWORDValue (UIContext _uicontext,java.lang.String Root, java.lang.String Key, java.lang.String Name, int Value) {
  Object o = sagex.SageAPI.call(_uicontext, "SetWindowsRegistryDWORDValue", new Object[] {Root,Key,Name,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets a string value in the Windows registry for the specified root, key and name(Windows only)
 The name will be created if it doesn't already exist.
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to use
Key- the key path in the registry hive
Name- the name of the registry value to set
Value- the value of the specified registry setting as a string
Returns:
true if the operation was successful, false otherwise
 */
public static boolean SetWindowsRegistryStringValue (java.lang.String Root, java.lang.String Key, java.lang.String Name, java.lang.String Value) {
  Object o = sagex.SageAPI.call("SetWindowsRegistryStringValue", new Object[] {Root,Key,Name,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Sets a string value in the Windows registry for the specified root, key and name(Windows only)
 The name will be created if it doesn't already exist.
 Acceptable values for the Root are: "HKCR", "HKEY_CLASSES_ROOT", "HKCC", "HKEY_CURRENT_CONFIG", "HKCU",
 "HKEY_CURRENT_USER", "HKU", "HKEY_USERS", "HKLM" or "HKEY_LOCAL_MACHINE" (HKLM is the default if nothing matches)

Parameters:
Root- the registry hive to use
Key- the key path in the registry hive
Name- the name of the registry value to set
Value- the value of the specified registry setting as a string
Returns:
true if the operation was successful, false otherwise
 */
public static boolean SetWindowsRegistryStringValue (UIContext _uicontext,java.lang.String Root, java.lang.String Key, java.lang.String Name, java.lang.String Value) {
  Object o = sagex.SageAPI.call(_uicontext, "SetWindowsRegistryStringValue", new Object[] {Root,Key,Name,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Plays the specified sound file (used for sound effects, don't use for music playback)

Parameters:
SoundFile- the path of the sound resource to play back
 */
public static void PlaySound (java.lang.String SoundFile) {
   sagex.SageAPI.call("PlaySound", new Object[] {SoundFile});
}

/**
 * UI Context Aware Call<br/>
Plays the specified sound file (used for sound effects, don't use for music playback)

Parameters:
SoundFile- the path of the sound resource to play back
 */
public static void PlaySound (UIContext _uicontext,java.lang.String SoundFile) {
   sagex.SageAPI.call(_uicontext, "PlaySound", new Object[] {SoundFile});
}

/**
Returns the second argument if the first argument is true, otherwise the third argument is returned. All 3 arguments
 will be evaluated in all cases. This does NOT have a short-circuit which prevents evaluation of the third argument if the first is true.

Parameters:
Condition- the value to test to see if it is true
True- the value to return if the Condition is true
False- the value to return if the Condition is not true
Returns:
the appropriate value based on the condition
 */
public static java.lang.Object If (boolean Condition, java.lang.Object True, java.lang.Object False) {
  Object o = sagex.SageAPI.call("If", new Object[] {Condition,True,False});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the second argument if the first argument is true, otherwise the third argument is returned. All 3 arguments
 will be evaluated in all cases. This does NOT have a short-circuit which prevents evaluation of the third argument if the first is true.

Parameters:
Condition- the value to test to see if it is true
True- the value to return if the Condition is true
False- the value to return if the Condition is not true
Returns:
the appropriate value based on the condition
 */
public static java.lang.Object If (UIContext _uicontext,boolean Condition, java.lang.Object True, java.lang.Object False) {
  Object o = sagex.SageAPI.call(_uicontext, "If", new Object[] {Condition,True,False});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns the file name from the specified file path; this just returns the filename without any path information.

Parameters:
FilePath- the filepath to get the filename for
Returns:
the filename from the specified file path
 */
public static java.lang.String GetFileNameFromPath (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetFileNameFromPath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the file name from the specified file path; this just returns the filename without any path information.

Parameters:
FilePath- the filepath to get the filename for
Returns:
the filename from the specified file path
 */
public static java.lang.String GetFileNameFromPath (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileNameFromPath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the full path name from the specified file path..

Parameters:
FilePath- the filepath to get the full path from
Returns:
the full path from the specified file path
Since:
7.0
 */
public static java.lang.String GetAbsoluteFilePath (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetAbsoluteFilePath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the full path name from the specified file path..

Parameters:
FilePath- the filepath to get the full path from
Returns:
the full path from the specified file path
Since:
7.0
 */
public static java.lang.String GetAbsoluteFilePath (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAbsoluteFilePath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the file name extension from the specified file path (not including the '.')

Parameters:
FilePath- the file path to get the extension of
Returns:
the extension from the specified file path
Since:
6.4
 */
public static java.lang.String GetFileExtensionFromPath (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("GetFileExtensionFromPath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the file name extension from the specified file path (not including the '.')

Parameters:
FilePath- the file path to get the extension of
Returns:
the extension from the specified file path
Since:
6.4
 */
public static java.lang.String GetFileExtensionFromPath (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileExtensionFromPath", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Causes the currently executing thread to sleep for the specified amount of time in milliseconds.

Parameters:
Time- the amount of time to sleep this thread for in milliseconds
 */
public static void Wait (long Time) {
   sagex.SageAPI.call("Wait", new Object[] {Time});
}

/**
 * UI Context Aware Call<br/>
Causes the currently executing thread to sleep for the specified amount of time in milliseconds.

Parameters:
Time- the amount of time to sleep this thread for in milliseconds
 */
public static void Wait (UIContext _uicontext,long Time) {
   sagex.SageAPI.call(_uicontext, "Wait", new Object[] {Time});
}

/**
Returns the maximum of the two arguments; the type of the returned argument will be the same as the highest precision argument

Parameters:
Value1- one of the values
Value2- the other value
Returns:
the maximum of the passed in values
 */
public static java.lang.Number Max (java.lang.Number Value1, java.lang.Number Value2) {
  Object o = sagex.SageAPI.call("Max", new Object[] {Value1,Value2});
  if (o!=null) return (java.lang.Number) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the maximum of the two arguments; the type of the returned argument will be the same as the highest precision argument

Parameters:
Value1- one of the values
Value2- the other value
Returns:
the maximum of the passed in values
 */
public static java.lang.Number Max (UIContext _uicontext,java.lang.Number Value1, java.lang.Number Value2) {
  Object o = sagex.SageAPI.call(_uicontext, "Max", new Object[] {Value1,Value2});
  if (o!=null) return (java.lang.Number) o;
  return null;
}

/**
Returns the minimum of the two arguments; the type of the returned argument will be the same as the highest precision argument

Parameters:
Value1- one of the values
Value2- the other value
Returns:
the minimum of the passed in values
 */
public static java.lang.Number Min (java.lang.Number Value1, java.lang.Number Value2) {
  Object o = sagex.SageAPI.call("Min", new Object[] {Value1,Value2});
  if (o!=null) return (java.lang.Number) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the minimum of the two arguments; the type of the returned argument will be the same as the highest precision argument

Parameters:
Value1- one of the values
Value2- the other value
Returns:
the minimum of the passed in values
 */
public static java.lang.Number Min (UIContext _uicontext,java.lang.Number Value1, java.lang.Number Value2) {
  Object o = sagex.SageAPI.call(_uicontext, "Min", new Object[] {Value1,Value2});
  if (o!=null) return (java.lang.Number) o;
  return null;
}

/**
Executes a new process on the system

Parameters:
CommandString- the command to execute (i.e. C:\windows\notepad.exe or ifconfig)
Arguments- the arguments to pass to the command that is executed, if it's a java.util.Collection or array then each element is an argument, otherwise it is considered a single argument; use null for no arguments
WorkingDirectory- the directory to execute the process from or null to execute it from the current working directory
ConsoleApp- if true then SageTV will consume the stdout and stderr output from the process that is launched; if false it will not
Returns:
the java.lang.Process object that represents the launched process
 */
public static java.lang.Process ExecuteProcess (java.lang.String CommandString, java.lang.Object Arguments, java.io.File WorkingDirectory, boolean ConsoleApp) {
  Object o = sagex.SageAPI.call("ExecuteProcess", new Object[] {CommandString,Arguments,WorkingDirectory,ConsoleApp});
  if (o!=null) return (java.lang.Process) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Executes a new process on the system

Parameters:
CommandString- the command to execute (i.e. C:\windows\notepad.exe or ifconfig)
Arguments- the arguments to pass to the command that is executed, if it's a java.util.Collection or array then each element is an argument, otherwise it is considered a single argument; use null for no arguments
WorkingDirectory- the directory to execute the process from or null to execute it from the current working directory
ConsoleApp- if true then SageTV will consume the stdout and stderr output from the process that is launched; if false it will not
Returns:
the java.lang.Process object that represents the launched process
 */
public static java.lang.Process ExecuteProcess (UIContext _uicontext,java.lang.String CommandString, java.lang.Object Arguments, java.io.File WorkingDirectory, boolean ConsoleApp) {
  Object o = sagex.SageAPI.call(_uicontext, "ExecuteProcess", new Object[] {CommandString,Arguments,WorkingDirectory,ConsoleApp});
  if (o!=null) return (java.lang.Process) o;
  return null;
}

/**
Executes a new process on the system and returns as a String the output of the process

Parameters:
CommandString- the command to execute (i.e. C:\windows\notepad.exe or ifconfig)
Arguments- the arguments to pass to the command that is executed, if it's a java.util.Collection or array then each element is an argument, otherwise it is considered a single argument; use null for no arguments
WorkingDirectory- the directory to execute the process from or null to execute it from the current working directory
ReturnStdout- if true then SageTV will return the data from stdout as part of the return value
ReturnStderr- if true then SageTV will return the data from stderr as part of the return value
Returns:
a String which contains the data from stdout/stderr (depending upon the arguments), null if there was a failure
Since:
6.0
 */
public static java.lang.String ExecuteProcessReturnOutput (java.lang.String CommandString, java.lang.Object Arguments, java.io.File WorkingDirectory, boolean ReturnStdout, boolean ReturnStderr) {
  Object o = sagex.SageAPI.call("ExecuteProcessReturnOutput", new Object[] {CommandString,Arguments,WorkingDirectory,ReturnStdout,ReturnStderr});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Executes a new process on the system and returns as a String the output of the process

Parameters:
CommandString- the command to execute (i.e. C:\windows\notepad.exe or ifconfig)
Arguments- the arguments to pass to the command that is executed, if it's a java.util.Collection or array then each element is an argument, otherwise it is considered a single argument; use null for no arguments
WorkingDirectory- the directory to execute the process from or null to execute it from the current working directory
ReturnStdout- if true then SageTV will return the data from stdout as part of the return value
ReturnStderr- if true then SageTV will return the data from stderr as part of the return value
Returns:
a String which contains the data from stdout/stderr (depending upon the arguments), null if there was a failure
Since:
6.0
 */
public static java.lang.String ExecuteProcessReturnOutput (UIContext _uicontext,java.lang.String CommandString, java.lang.Object Arguments, java.io.File WorkingDirectory, boolean ReturnStdout, boolean ReturnStderr) {
  Object o = sagex.SageAPI.call(_uicontext, "ExecuteProcessReturnOutput", new Object[] {CommandString,Arguments,WorkingDirectory,ReturnStdout,ReturnStderr});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a MetaImage object that refers to the specified image file. Used for passing images into Widgets.

Parameters:
FilePath- the file path of the image to load
Returns:
the loaded image object
 */
public static Object LoadImageFile (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("LoadImageFile", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a MetaImage object that refers to the specified image file. Used for passing images into Widgets.

Parameters:
FilePath- the file path of the image to load
Returns:
the loaded image object
 */
public static Object LoadImageFile (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "LoadImageFile", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a MetaImage object that refers to a specified image resource. This can be used to load images from URLs, JAR resources or the file system.It also has a secondary purpose where you can pass it a MetaImage and then it will load that image into
 the current image cache so it will render as fast as possible in the next drawing cycle. Good for preloading
 the next image in a slideshow. If a MetaImage is passed in; this call will not return until that image is loaded into the cache.


Parameters:
Resource- if this is a MetaImage then the image is loaded into the cache, otherwise its converted to a string and then a MetaImage is returned for that resource
Returns:
the MetaImage that refers to the passed specified resource, if a MetaImage was passed in then the same object is returned
 */
public static Object LoadImage (java.lang.Object Resource) {
  Object o = sagex.SageAPI.call("LoadImage", new Object[] {Resource});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a MetaImage object that refers to a specified image resource. This can be used to load images from URLs, JAR resources or the file system.It also has a secondary purpose where you can pass it a MetaImage and then it will load that image into
 the current image cache so it will render as fast as possible in the next drawing cycle. Good for preloading
 the next image in a slideshow. If a MetaImage is passed in; this call will not return until that image is loaded into the cache.


Parameters:
Resource- if this is a MetaImage then the image is loaded into the cache, otherwise its converted to a string and then a MetaImage is returned for that resource
Returns:
the MetaImage that refers to the passed specified resource, if a MetaImage was passed in then the same object is returned
 */
public static Object LoadImage (UIContext _uicontext,java.lang.Object Resource) {
  Object o = sagex.SageAPI.call(_uicontext, "LoadImage", new Object[] {Resource});
  if (o!=null) return (Object) o;
  return null;
}

/**
Saves a MetaImage object to a file using the specified image size. The supported formats are JPG and PNG. The format is determined by the file extension, which must be either .jpg or .png.
 Use zero for the width and height to save it at the original image size.
 NOTE: This call is a NOOP on embedded platforms

Parameters:
MetaImage- the MetaImage object that should be saved to the specified file
File- the file to save the image to
Width- the width to use in the saved image file
Height- the height to use in the saved image file
Returns:
returns true on success or false on failure
Since:
7.1
 */
public static boolean SaveImageToFile (Object MetaImage, java.io.File File, int Width, int Height) {
  Object o = sagex.SageAPI.call("SaveImageToFile", new Object[] {MetaImage,File,Width,Height});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Saves a MetaImage object to a file using the specified image size. The supported formats are JPG and PNG. The format is determined by the file extension, which must be either .jpg or .png.
 Use zero for the width and height to save it at the original image size.
 NOTE: This call is a NOOP on embedded platforms

Parameters:
MetaImage- the MetaImage object that should be saved to the specified file
File- the file to save the image to
Width- the width to use in the saved image file
Height- the height to use in the saved image file
Returns:
returns true on success or false on failure
Since:
7.1
 */
public static boolean SaveImageToFile (UIContext _uicontext,Object MetaImage, java.io.File File, int Width, int Height) {
  Object o = sagex.SageAPI.call(_uicontext, "SaveImageToFile", new Object[] {MetaImage,File,Width,Height});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the file path that a MetaImage was loaded from. Since not all MetaImage objects come from file paths, this will return null for any non-file based images.

Parameters:
MetaImage- the MetaImage to get the file path for
Returns:
the file path for the specified MetaImage, or null if it wasn't loaded from a file path
Since:
7.1
 */
public static java.io.File GetMetaImageSourceFile (Object MetaImage) {
  Object o = sagex.SageAPI.call("GetMetaImageSourceFile", new Object[] {MetaImage});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the file path that a MetaImage was loaded from. Since not all MetaImage objects come from file paths, this will return null for any non-file based images.

Parameters:
MetaImage- the MetaImage to get the file path for
Returns:
the file path for the specified MetaImage, or null if it wasn't loaded from a file path
Since:
7.1
 */
public static java.io.File GetMetaImageSourceFile (UIContext _uicontext,Object MetaImage) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMetaImageSourceFile", new Object[] {MetaImage});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns the aspect ratio of an image as a floating point number of width/height, zero if the image was a failed load or has not been loaded yet

Parameters:
MetaImage- the MetaImage to get the aspec for
Returns:
the aspect ratio of the image as a floating point number of width/height, zero if the image was a failed load or has not been loaded yet
Since:
8.0
 */
public static float GetMetaImageAspectRatio (Object MetaImage) {
  Object o = sagex.SageAPI.call("GetMetaImageAspectRatio", new Object[] {MetaImage});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br/>
Returns the aspect ratio of an image as a floating point number of width/height, zero if the image was a failed load or has not been loaded yet

Parameters:
MetaImage- the MetaImage to get the aspec for
Returns:
the aspect ratio of the image as a floating point number of width/height, zero if the image was a failed load or has not been loaded yet
Since:
8.0
 */
public static float GetMetaImageAspectRatio (UIContext _uicontext,Object MetaImage) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMetaImageAspectRatio", new Object[] {MetaImage});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns true if the argument is a MetaImage object.

Parameters:
MetaImage- the Object to test
Returns:
true if the argument is a MetaImage object, false otherwise
Since:
7.1
 */
public static boolean IsMetaImage (java.lang.Object MetaImage) {
  Object o = sagex.SageAPI.call("IsMetaImage", new Object[] {MetaImage});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the argument is a MetaImage object.

Parameters:
MetaImage- the Object to test
Returns:
true if the argument is a MetaImage object, false otherwise
Since:
7.1
 */
public static boolean IsMetaImage (UIContext _uicontext,java.lang.Object MetaImage) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMetaImage", new Object[] {MetaImage});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a byte array which is the contents of the MetaImage source's data (i.e. compressed image data)

Parameters:
MetaImage- the MetaImage to get the compressed byte data for
Returns:
a byte array which is the contents of the MetaImage source's data (i.e. compressed image data), null if it cannot load the data or the argument is not a MetaImage
Since:
8.1
 */
public static byte[] GetMetaImageBytes (Object MetaImage) {
  return (byte[]) sagex.SageAPI.call("GetMetaImageBytes", new Object[] {MetaImage});
}

/**
 * UI Context Aware Call<br/>
Returns a byte array which is the contents of the MetaImage source's data (i.e. compressed image data)

Parameters:
MetaImage- the MetaImage to get the compressed byte data for
Returns:
a byte array which is the contents of the MetaImage source's data (i.e. compressed image data), null if it cannot load the data or the argument is not a MetaImage
Since:
8.1
 */
public static byte[] GetMetaImageBytes (UIContext _uicontext,Object MetaImage) {
  return (byte[]) sagex.SageAPI.call(_uicontext, "GetMetaImageBytes", new Object[] {MetaImage});
}

/**
Returns a java.awt.image.BufferedImage object. This can be used to load images from URLs, JAR resources or the file system.


Parameters:
Resource- if this is a MetaImage then the buffered image is taken from that, otherwise its converted to a string and then the image is loaded from that path
Returns:
a newly allocated java.awt.image.BufferedImage corresponding to the specified resource
Since:
4.1
 */
public static java.awt.image.BufferedImage GetImageAsBufferedImage (java.lang.Object Resource) {
  Object o = sagex.SageAPI.call("GetImageAsBufferedImage", new Object[] {Resource});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a java.awt.image.BufferedImage object. This can be used to load images from URLs, JAR resources or the file system.


Parameters:
Resource- if this is a MetaImage then the buffered image is taken from that, otherwise its converted to a string and then the image is loaded from that path
Returns:
a newly allocated java.awt.image.BufferedImage corresponding to the specified resource
Since:
4.1
 */
public static java.awt.image.BufferedImage GetImageAsBufferedImage (UIContext _uicontext,java.lang.Object Resource) {
  Object o = sagex.SageAPI.call(_uicontext, "GetImageAsBufferedImage", new Object[] {Resource});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
Returns a java.awt.image.BufferedImage object. This can be used to load images from URLs, JAR resources or the file system.
 The size of the returned image will match the passed in arguments.

Parameters:
Resource- if this is a MetaImage then the buffered image is taken from that, otherwise its converted to a string and then the image is loaded from that path
Width- the desired width of the returned image
Height- the desired height of the returned image
Returns:
a newly allocated java.awt.image.BufferedImage corresponding to the specified resource
Since:
4.1
 */
public static java.awt.image.BufferedImage GetScaledImageAsBufferedImage (java.lang.Object Resource, int Width, int Height) {
  Object o = sagex.SageAPI.call("GetScaledImageAsBufferedImage", new Object[] {Resource,Width,Height});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a java.awt.image.BufferedImage object. This can be used to load images from URLs, JAR resources or the file system.
 The size of the returned image will match the passed in arguments.

Parameters:
Resource- if this is a MetaImage then the buffered image is taken from that, otherwise its converted to a string and then the image is loaded from that path
Width- the desired width of the returned image
Height- the desired height of the returned image
Returns:
a newly allocated java.awt.image.BufferedImage corresponding to the specified resource
Since:
4.1
 */
public static java.awt.image.BufferedImage GetScaledImageAsBufferedImage (UIContext _uicontext,java.lang.Object Resource, int Width, int Height) {
  Object o = sagex.SageAPI.call(_uicontext, "GetScaledImageAsBufferedImage", new Object[] {Resource,Width,Height});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
Unloads the specified image resource from memory. NOTE: This does not care about the internal reference
 count in SageTV for this image which could mean bad things will happen if you use this on images other than ones
 that you are explicitly managing.

Parameters:
ResPath- the path to the image resource, can be a url, JAR resource path or a file path
 */
public static void UnloadImage (java.lang.String ResPath) {
   sagex.SageAPI.call("UnloadImage", new Object[] {ResPath});
}

/**
 * UI Context Aware Call<br/>
Unloads the specified image resource from memory. NOTE: This does not care about the internal reference
 count in SageTV for this image which could mean bad things will happen if you use this on images other than ones
 that you are explicitly managing.

Parameters:
ResPath- the path to the image resource, can be a url, JAR resource path or a file path
 */
public static void UnloadImage (UIContext _uicontext,java.lang.String ResPath) {
   sagex.SageAPI.call(_uicontext, "UnloadImage", new Object[] {ResPath});
}

/**
Checks whether the passed in MetaImage (from an API call that returns MetaImage), MediaFile, File, URL or Album is loaded
 into system memory or into the VRAM cache of the corresponding UI making the call.

Parameters:
Image- the MetaImage to check, or a MediaFile or an Album or a java.io.File or a java.net.URL
Returns:
true if the MetaImage (or the MetaImage that would correspond to the passed in resource) is loaded into system memory or the calling UI's VRAM, false otherwise
Since:
6.1
 */
public static boolean IsImageLoaded (java.lang.Object Image) {
  Object o = sagex.SageAPI.call("IsImageLoaded", new Object[] {Image});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Checks whether the passed in MetaImage (from an API call that returns MetaImage), MediaFile, File, URL or Album is loaded
 into system memory or into the VRAM cache of the corresponding UI making the call.

Parameters:
Image- the MetaImage to check, or a MediaFile or an Album or a java.io.File or a java.net.URL
Returns:
true if the MetaImage (or the MetaImage that would correspond to the passed in resource) is loaded into system memory or the calling UI's VRAM, false otherwise
Since:
6.1
 */
public static boolean IsImageLoaded (UIContext _uicontext,java.lang.Object Image) {
  Object o = sagex.SageAPI.call(_uicontext, "IsImageLoaded", new Object[] {Image});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Checks whether the passed in MetaImage (from an API call that returns MetaImage), MediaFile, File, URL or Album failed
 to load successfully. This will return false if the image load has not been attempted yet.

Parameters:
Image- the MetaImage to check, or a MediaFile or an Album or a java.io.File or a java.net.URL
Returns:
true if the MetaImage (or the MetaImage that would correspond to the passed in resource) has already tried to load; and the load failed
Since:
7.0
 */
public static boolean DidImageLoadFail (java.lang.Object Image) {
  Object o = sagex.SageAPI.call("DidImageLoadFail", new Object[] {Image});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Checks whether the passed in MetaImage (from an API call that returns MetaImage), MediaFile, File, URL or Album failed
 to load successfully. This will return false if the image load has not been attempted yet.

Parameters:
Image- the MetaImage to check, or a MediaFile or an Album or a java.io.File or a java.net.URL
Returns:
true if the MetaImage (or the MetaImage that would correspond to the passed in resource) has already tried to load; and the load failed
Since:
7.0
 */
public static boolean DidImageLoadFail (UIContext _uicontext,java.lang.Object Image) {
  Object o = sagex.SageAPI.call(_uicontext, "DidImageLoadFail", new Object[] {Image});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a list of the files in the specified directory

Parameters:
DirectoryPath- the directory to list the files in
Returns:
a list of files in the specified directory
 */
public static java.io.File[] DirectoryListing (java.io.File DirectoryPath) {
  return (java.io.File[]) sagex.SageAPI.call("DirectoryListing", new Object[] {DirectoryPath});
}

/**
 * UI Context Aware Call<br/>
Returns a list of the files in the specified directory

Parameters:
DirectoryPath- the directory to list the files in
Returns:
a list of files in the specified directory
 */
public static java.io.File[] DirectoryListing (UIContext _uicontext,java.io.File DirectoryPath) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "DirectoryListing", new Object[] {DirectoryPath});
}

/**
Returns a list of the files in the specified directory. Only directories and file matching the media mask will be returned.

Parameters:
DirectoryPath- the directory to list the files in
MediaMask- the types of content allowed, any combination of 'M'=Music, 'P'=Pictures or 'V'=Videos
Returns:
a list of folders and matching files in the specified directory
Since:
7.0
 */
public static java.io.File[] DirectoryListing (java.io.File DirectoryPath, java.lang.String MediaMask) {
  return (java.io.File[]) sagex.SageAPI.call("DirectoryListing", new Object[] {DirectoryPath,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns a list of the files in the specified directory. Only directories and file matching the media mask will be returned.

Parameters:
DirectoryPath- the directory to list the files in
MediaMask- the types of content allowed, any combination of 'M'=Music, 'P'=Pictures or 'V'=Videos
Returns:
a list of folders and matching files in the specified directory
Since:
7.0
 */
public static java.io.File[] DirectoryListing (UIContext _uicontext,java.io.File DirectoryPath, java.lang.String MediaMask) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "DirectoryListing", new Object[] {DirectoryPath,MediaMask});
}

/**
Returns a list of the files in the specified directory on the local filesystem

Parameters:
DirectoryPath- the directory to list the files in
Returns:
a list of files in the specified directory
Since:
6.4
 */
public static java.io.File[] LocalDirectoryListing (java.io.File DirectoryPath) {
  return (java.io.File[]) sagex.SageAPI.call("LocalDirectoryListing", new Object[] {DirectoryPath});
}

/**
 * UI Context Aware Call<br/>
Returns a list of the files in the specified directory on the local filesystem

Parameters:
DirectoryPath- the directory to list the files in
Returns:
a list of files in the specified directory
Since:
6.4
 */
public static java.io.File[] LocalDirectoryListing (UIContext _uicontext,java.io.File DirectoryPath) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "LocalDirectoryListing", new Object[] {DirectoryPath});
}

/**
Returns the root directories of the file systems (on Linux this'll just be / and on Windows it'll be the drive letters)

Returns:
the root directories of the file systems
 */
public static java.io.File[] GetFileSystemRoots () {
  return (java.io.File[]) sagex.SageAPI.call("GetFileSystemRoots", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns the root directories of the file systems (on Linux this'll just be / and on Windows it'll be the drive letters)

Returns:
the root directories of the file systems
 */
public static java.io.File[] GetFileSystemRoots (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetFileSystemRoots", (Object[])null);
}

/**
Returns the root directories of the local file systems  (on Linux this'll just be / and on Windows it'll be the drive letters)

Returns:
the root directories of the local file systems
Since:
6.4
 */
public static java.io.File[] GetLocalFileSystemRoots () {
  return (java.io.File[]) sagex.SageAPI.call("GetLocalFileSystemRoots", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns the root directories of the local file systems  (on Linux this'll just be / and on Windows it'll be the drive letters)

Returns:
the root directories of the local file systems
Since:
6.4
 */
public static java.io.File[] GetLocalFileSystemRoots (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetLocalFileSystemRoots", (Object[])null);
}

/**
Returns true if the first string ends with the second, uses java.lang.String.endsWith

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
true if FullString ends with MatchString, false otherwise
 */
public static boolean StringEndsWith (java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call("StringEndsWith", new Object[] {FullString,MatchString});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the first string ends with the second, uses java.lang.String.endsWith

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
true if FullString ends with MatchString, false otherwise
 */
public static boolean StringEndsWith (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call(_uicontext, "StringEndsWith", new Object[] {FullString,MatchString});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the first string starts with the second, uses java.lang.String.startsWith

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
true if FullString starts with MatchString, false otherwise
 */
public static boolean StringStartsWith (java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call("StringStartsWith", new Object[] {FullString,MatchString});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the first string starts with the second, uses java.lang.String.startsWith

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
true if FullString starts with MatchString, false otherwise
 */
public static boolean StringStartsWith (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call(_uicontext, "StringStartsWith", new Object[] {FullString,MatchString});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the index of the second string within the first string, -1 if it is not found. Uses java.lang.String.indexOf

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
the first 0-based index in FullString that MatchString occurs at or -1 if it is not found
 */
public static int StringIndexOf (java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call("StringIndexOf", new Object[] {FullString,MatchString});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the index of the second string within the first string, -1 if it is not found. Uses java.lang.String.indexOf

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
the first 0-based index in FullString that MatchString occurs at or -1 if it is not found
 */
public static int StringIndexOf (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call(_uicontext, "StringIndexOf", new Object[] {FullString,MatchString});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the last index of the second string within the first string, -1 if it is not found. Uses java.lang.String.lastIndexOf

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
the last 0-based index in FullString that MatchString occurs at or -1 if it is not found
 */
public static int StringLastIndexOf (java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call("StringLastIndexOf", new Object[] {FullString,MatchString});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the last index of the second string within the first string, -1 if it is not found. Uses java.lang.String.lastIndexOf

Parameters:
FullString- the string to search in
MatchString- the string to search for
Returns:
the last 0-based index in FullString that MatchString occurs at or -1 if it is not found
 */
public static int StringLastIndexOf (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchString) {
  Object o = sagex.SageAPI.call(_uicontext, "StringLastIndexOf", new Object[] {FullString,MatchString});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the current working directory for the application (if this is a client; it'll be the working directory of the server)

Returns:
the current working directory for the application
 */
public static java.lang.String GetWorkingDirectory () {
  Object o = sagex.SageAPI.call("GetWorkingDirectory", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the current working directory for the application (if this is a client; it'll be the working directory of the server)

Returns:
the current working directory for the application
 */
public static java.lang.String GetWorkingDirectory (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWorkingDirectory", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if this client has a local file system that can be accessed.

Returns:
true if this client has a local file system that can be accessed
Since:
6.4
 */
public static boolean HasLocalFilesystem () {
  Object o = sagex.SageAPI.call("HasLocalFilesystem", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this client has a local file system that can be accessed.

Returns:
true if this client has a local file system that can be accessed
Since:
6.4
 */
public static boolean HasLocalFilesystem (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasLocalFilesystem", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Creates a new file object for the specified directory and file name or relative path

Parameters:
Directory- the directory name
File- the file within the directory or relative file path
Returns:
a new file object for the specified directory and file name or relative path
 */
public static java.io.File CreateFilePath (java.lang.String Directory, java.lang.String File) {
  Object o = sagex.SageAPI.call("CreateFilePath", new Object[] {Directory,File});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Creates a new file object for the specified directory and file name or relative path

Parameters:
Directory- the directory name
File- the file within the directory or relative file path
Returns:
a new file object for the specified directory and file name or relative path
 */
public static java.io.File CreateFilePath (UIContext _uicontext,java.lang.String Directory, java.lang.String File) {
  Object o = sagex.SageAPI.call(_uicontext, "CreateFilePath", new Object[] {Directory,File});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns true if the specified file path is marked as a hidden file

Parameters:
FilePath- the file path to test
Returns:
true if the specified file path is marked as a hidden file
 */
public static boolean IsFilePathHidden (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsFilePathHidden", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified file path is marked as a hidden file

Parameters:
FilePath- the file path to test
Returns:
true if the specified file path is marked as a hidden file
 */
public static boolean IsFilePathHidden (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFilePathHidden", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified local file path is marked as a hidden file

Parameters:
FilePath- the file path to test
Returns:
true if the specified local file path is marked as a hidden file
Since:
6.4
 */
public static boolean IsLocalFilePathHidden (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsLocalFilePathHidden", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified local file path is marked as a hidden file

Parameters:
FilePath- the file path to test
Returns:
true if the specified local file path is marked as a hidden file
Since:
6.4
 */
public static boolean IsLocalFilePathHidden (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLocalFilePathHidden", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified file path denotes a file that exists and is not a directory

Parameters:
FilePath- the file path to test
Returns:
true if the specified file path denotes a file that exists and is not a directory
 */
public static boolean IsFilePath (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified file path denotes a file that exists and is not a directory

Parameters:
FilePath- the file path to test
Returns:
true if the specified file path denotes a file that exists and is not a directory
 */
public static boolean IsFilePath (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified local file path denotes a file that exists and is not a directory

Parameters:
FilePath- the file path to test
Returns:
true if the specified local file path denotes a file that exists and is not a directory
Since:
6.4
 */
public static boolean IsLocalFilePath (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsLocalFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified local file path denotes a file that exists and is not a directory

Parameters:
FilePath- the file path to test
Returns:
true if the specified local file path denotes a file that exists and is not a directory
Since:
6.4
 */
public static boolean IsLocalFilePath (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLocalFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified path denotes a directory that exists

Parameters:
FilePath- the file path to test
Returns:
true if the specified path denotes a directory that exists
 */
public static boolean IsDirectoryPath (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsDirectoryPath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified path denotes a directory that exists

Parameters:
FilePath- the file path to test
Returns:
true if the specified path denotes a directory that exists
 */
public static boolean IsDirectoryPath (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDirectoryPath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified local path denotes a directory that exists

Parameters:
FilePath- the file path to test
Returns:
true if the specified local path denotes a directory that exists
Since:
6.4
 */
public static boolean IsLocalDirectoryPath (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("IsLocalDirectoryPath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified local path denotes a directory that exists

Parameters:
FilePath- the file path to test
Returns:
true if the specified local path denotes a directory that exists
Since:
6.4
 */
public static boolean IsLocalDirectoryPath (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLocalDirectoryPath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Creates a new directory and any parent directories for the specified directory path.

Parameters:
DirectoryPath- the directory to create
Returns:
true if successful, false otherwise
 */
public static boolean CreateNewDirectory (java.io.File DirectoryPath) {
  Object o = sagex.SageAPI.call("CreateNewDirectory", new Object[] {DirectoryPath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Creates a new directory and any parent directories for the specified directory path.

Parameters:
DirectoryPath- the directory to create
Returns:
true if successful, false otherwise
 */
public static boolean CreateNewDirectory (UIContext _uicontext,java.io.File DirectoryPath) {
  Object o = sagex.SageAPI.call(_uicontext, "CreateNewDirectory", new Object[] {DirectoryPath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Creates a new local directory and any parent directories for the specified directory path.

Parameters:
DirectoryPath- the directory to create
Returns:
true if successful, false otherwise
Since:
6.4
 */
public static boolean CreateNewLocalDirectory (java.io.File DirectoryPath) {
  Object o = sagex.SageAPI.call("CreateNewLocalDirectory", new Object[] {DirectoryPath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Creates a new local directory and any parent directories for the specified directory path.

Parameters:
DirectoryPath- the directory to create
Returns:
true if successful, false otherwise
Since:
6.4
 */
public static boolean CreateNewLocalDirectory (UIContext _uicontext,java.io.File DirectoryPath) {
  Object o = sagex.SageAPI.call(_uicontext, "CreateNewLocalDirectory", new Object[] {DirectoryPath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the parent directory for the specified file path

Parameters:
FilePath- the file path to get the parent directory for
Returns:
the parent directory for the specified file path
 */
public static java.io.File GetPathParentDirectory (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetPathParentDirectory", new Object[] {FilePath});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the parent directory for the specified file path

Parameters:
FilePath- the file path to get the parent directory for
Returns:
the parent directory for the specified file path
 */
public static java.io.File GetPathParentDirectory (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPathParentDirectory", new Object[] {FilePath});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns the last modified time of the specified file path

Parameters:
FilePath- the file path
Returns:
the last modified time of the specified file path
 */
public static long GetPathLastModifiedTime (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetPathLastModifiedTime", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the last modified time of the specified file path

Parameters:
FilePath- the file path
Returns:
the last modified time of the specified file path
 */
public static long GetPathLastModifiedTime (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPathLastModifiedTime", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the last modified time of the specified local file path

Parameters:
FilePath- the file path
Returns:
the last modified time of the specified local file path
Since:
6.4
 */
public static long GetLocalPathLastModifiedTime (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetLocalPathLastModifiedTime", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the last modified time of the specified local file path

Parameters:
FilePath- the file path
Returns:
the last modified time of the specified local file path
Since:
6.4
 */
public static long GetLocalPathLastModifiedTime (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLocalPathLastModifiedTime", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the size in bytes of the specified file path

Parameters:
FilePath- the file path
Returns:
the size in bytes of the specified file path
Since:
6.4
 */
public static long GetFilePathSize (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetFilePathSize", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the size in bytes of the specified file path

Parameters:
FilePath- the file path
Returns:
the size in bytes of the specified file path
Since:
6.4
 */
public static long GetFilePathSize (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFilePathSize", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the size in bytes of the specified local file path

Parameters:
FilePath- the file path
Returns:
the size in bytes of the specified local file path
Since:
6.4
 */
public static long GetLocalFilePathSize (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetLocalFilePathSize", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the size in bytes of the specified local file path

Parameters:
FilePath- the file path
Returns:
the size in bytes of the specified local file path
Since:
6.4
 */
public static long GetLocalFilePathSize (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLocalFilePathSize", new Object[] {FilePath});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Deletes the file/directory at the corresponding file path (directories must be empty first)

Parameters:
FilePath- the file path
Returns:
true if successful, false otherwise
Since:
6.3.9
 */
public static boolean DeleteFilePath (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("DeleteFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Deletes the file/directory at the corresponding file path (directories must be empty first)

Parameters:
FilePath- the file path
Returns:
true if successful, false otherwise
Since:
6.3.9
 */
public static boolean DeleteFilePath (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "DeleteFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Deletes the file/directory at the corresponding local file path (directories must be empty first)

Parameters:
FilePath- the file path
Returns:
true if successful, false otherwise
Since:
6.4
 */
public static boolean DeleteLocalFilePath (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("DeleteLocalFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Deletes the file/directory at the corresponding local file path (directories must be empty first)

Parameters:
FilePath- the file path
Returns:
true if successful, false otherwise
Since:
6.4
 */
public static boolean DeleteLocalFilePath (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "DeleteLocalFilePath", new Object[] {FilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Renames a file/directory

Parameters:
OriginalFilePath- the file path to rename
NewFilePath- the new name for the file path
Returns:
true if successful, false otherwise
Since:
6.3.9
 */
public static boolean RenameFilePath (java.io.File OriginalFilePath, java.io.File NewFilePath) {
  Object o = sagex.SageAPI.call("RenameFilePath", new Object[] {OriginalFilePath,NewFilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Renames a file/directory

Parameters:
OriginalFilePath- the file path to rename
NewFilePath- the new name for the file path
Returns:
true if successful, false otherwise
Since:
6.3.9
 */
public static boolean RenameFilePath (UIContext _uicontext,java.io.File OriginalFilePath, java.io.File NewFilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "RenameFilePath", new Object[] {OriginalFilePath,NewFilePath});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Adds the specified value into the grouping using the specified key. Useful on results fromGroupByMethod()
This works using a Map implementation that has Collections as the values and objects as the keys. So if two objects have the same key
 they will both still exist in the map by being in the Collection that corresponds to their key.

Parameters:
Grouping- the grouping (Map) to add the new key/value pair to
Key- the key to use to store the value in the map
Value- the value to store
Returns:
true is always returned
 */
public static boolean AddToGrouping (java.util.Map Grouping, java.lang.Object Key, java.lang.Object Value) {
  Object o = sagex.SageAPI.call("AddToGrouping", new Object[] {Grouping,Key,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Adds the specified value into the grouping using the specified key. Useful on results fromGroupByMethod()
This works using a Map implementation that has Collections as the values and objects as the keys. So if two objects have the same key
 they will both still exist in the map by being in the Collection that corresponds to their key.

Parameters:
Grouping- the grouping (Map) to add the new key/value pair to
Key- the key to use to store the value in the map
Value- the value to store
Returns:
true is always returned
 */
public static boolean AddToGrouping (UIContext _uicontext,java.util.Map Grouping, java.lang.Object Key, java.lang.Object Value) {
  Object o = sagex.SageAPI.call(_uicontext, "AddToGrouping", new Object[] {Grouping,Key,Value});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Opens a TCP/IP socket connection to the specified hostname on the specified port and then sends the specified command. After that
 the socket is closed.

Parameters:
Hostname- the hostname to connect to
Port- the port to connect on
Command- either a byte[] or a String to send across the socket
Returns:
true if successful, false otherwise
 */
public static boolean SendNetworkCommand (java.lang.String Hostname, int Port, java.lang.Object Command) {
  Object o = sagex.SageAPI.call("SendNetworkCommand", new Object[] {Hostname,Port,Command});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Opens a TCP/IP socket connection to the specified hostname on the specified port and then sends the specified command. After that
 the socket is closed.

Parameters:
Hostname- the hostname to connect to
Port- the port to connect on
Command- either a byte[] or a String to send across the socket
Returns:
true if successful, false otherwise
 */
public static boolean SendNetworkCommand (UIContext _uicontext,java.lang.String Hostname, int Port, java.lang.Object Command) {
  Object o = sagex.SageAPI.call(_uicontext, "SendNetworkCommand", new Object[] {Hostname,Port,Command});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Scales a java.awt.image.BufferedImage object using optimized techniques

Parameters:
JavaBufferedImage- the BufferedImage object that is the source for the scaling
Width- the width of the target image
Height- the height of the target image
Alpha- true if the scaling should be done in ARGB, false if it should be done in RGB
Returns:
a new BufferedImage that is a scaled version of the specified image
 */
public static java.awt.image.BufferedImage ScaleBufferedImage (java.awt.image.BufferedImage JavaBufferedImage, int Width, int Height, boolean Alpha) {
  Object o = sagex.SageAPI.call("ScaleBufferedImage", new Object[] {JavaBufferedImage,Width,Height,Alpha});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Scales a java.awt.image.BufferedImage object using optimized techniques

Parameters:
JavaBufferedImage- the BufferedImage object that is the source for the scaling
Width- the width of the target image
Height- the height of the target image
Alpha- true if the scaling should be done in ARGB, false if it should be done in RGB
Returns:
a new BufferedImage that is a scaled version of the specified image
 */
public static java.awt.image.BufferedImage ScaleBufferedImage (UIContext _uicontext,java.awt.image.BufferedImage JavaBufferedImage, int Width, int Height, boolean Alpha) {
  Object o = sagex.SageAPI.call(_uicontext, "ScaleBufferedImage", new Object[] {JavaBufferedImage,Width,Height,Alpha});
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
Returns a localized version of the specified string. Uses SageTV's core translation properties to do this.

Parameters:
EnglishText- the English string to translate from
Returns:
the translated version of the specified string in the currently configured language
 */
public static java.lang.String LocalizeString (java.lang.String EnglishText) {
  Object o = sagex.SageAPI.call("LocalizeString", new Object[] {EnglishText});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a localized version of the specified string. Uses SageTV's core translation properties to do this.

Parameters:
EnglishText- the English string to translate from
Returns:
the translated version of the specified string in the currently configured language
 */
public static java.lang.String LocalizeString (UIContext _uicontext,java.lang.String EnglishText) {
  Object o = sagex.SageAPI.call(_uicontext, "LocalizeString", new Object[] {EnglishText});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the IP address of the machine

Returns:
the IP address of the machine
 */
public static java.lang.String GetLocalIPAddress () {
  Object o = sagex.SageAPI.call("GetLocalIPAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the IP address of the machine

Returns:
the IP address of the machine
 */
public static java.lang.String GetLocalIPAddress (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLocalIPAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified file path has a file extension which would be imported by SageTV into its library.

Parameters:
Filename- the file path to test
Returns:
true if the specified file path has a file extension which would be imported by SageTV into its library, false otherwise
 */
public static boolean IsImportableFileType (java.lang.String Filename) {
  Object o = sagex.SageAPI.call("IsImportableFileType", new Object[] {Filename});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified file path has a file extension which would be imported by SageTV into its library.

Parameters:
Filename- the file path to test
Returns:
true if the specified file path has a file extension which would be imported by SageTV into its library, false otherwise
 */
public static boolean IsImportableFileType (UIContext _uicontext,java.lang.String Filename) {
  Object o = sagex.SageAPI.call(_uicontext, "IsImportableFileType", new Object[] {Filename});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the subnet mask for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the subnet mask for the currently configured network adapter
 */
public static java.lang.String GetSubnetMask () {
  Object o = sagex.SageAPI.call("GetSubnetMask", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the subnet mask for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the subnet mask for the currently configured network adapter
 */
public static java.lang.String GetSubnetMask (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSubnetMask", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the gateway address for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the gateway address for the currently configured network adapter
 */
public static java.lang.String GetGatewayAddress () {
  Object o = sagex.SageAPI.call("GetGatewayAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the gateway address for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the gateway address for the currently configured network adapter
 */
public static java.lang.String GetGatewayAddress (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetGatewayAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the DNS address for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the DNS address for the currently configured network adapter
 */
public static java.lang.String GetDNSAddress () {
  Object o = sagex.SageAPI.call("GetDNSAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the DNS address for the currently configured network adapter.
 NOTE: This is only valid on embedded platforms.

Returns:
the DNS address for the currently configured network adapter
 */
public static java.lang.String GetDNSAddress (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDNSAddress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Guesses what media type the specified filename corresponds to. It does this based on the configuration
 for the import library file types.

Parameters:
Filename- the file path to test
Returns:
"M", "V", "P", "B" or "D" for a music, video, picture, BluRay or DVD file respectively; if it can't tell it returns "V"
Since:
6.4
 */
public static java.lang.String GuessMajorFileType (java.lang.String Filename) {
  Object o = sagex.SageAPI.call("GuessMajorFileType", new Object[] {Filename});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Guesses what media type the specified filename corresponds to. It does this based on the configuration
 for the import library file types.

Parameters:
Filename- the file path to test
Returns:
"M", "V", "P", "B" or "D" for a music, video, picture, BluRay or DVD file respectively; if it can't tell it returns "V"
Since:
6.4
 */
public static java.lang.String GuessMajorFileType (UIContext _uicontext,java.lang.String Filename) {
  Object o = sagex.SageAPI.call(_uicontext, "GuessMajorFileType", new Object[] {Filename});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Connects to the SageTV Locator server and submits the specified Locator ID for a 'ping'. The Locator server will
 then attempt to connect to the IP for that GUID and report back the status.  The return code is an integer as follows:
 -1 - Unable to connect to the locator server (internet connection is down or locator server is down)
 0 - The locator server did not have an IP address registered for this GUID
 1 - The locator server could not connect to the IP address registered for the GUID
 2 - The locator server can connect to the IP address registered for the GUID, but not to the Placeshifter port
 3 - The locator server can connect to the IP address/port for the GUID, but the server that is there is not the Placeshifter
 10 - The ping was successful. External connections to the Placeshifter should work correctly.

Parameters:
LocatorID- the GUID that should be used for the 'ping'
Returns:
an integer status code as described above.
 */
public static int TestPlaceshifterConnectivity (java.lang.String LocatorID) {
  Object o = sagex.SageAPI.call("TestPlaceshifterConnectivity", new Object[] {LocatorID});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Connects to the SageTV Locator server and submits the specified Locator ID for a 'ping'. The Locator server will
 then attempt to connect to the IP for that GUID and report back the status.  The return code is an integer as follows:
 -1 - Unable to connect to the locator server (internet connection is down or locator server is down)
 0 - The locator server did not have an IP address registered for this GUID
 1 - The locator server could not connect to the IP address registered for the GUID
 2 - The locator server can connect to the IP address registered for the GUID, but not to the Placeshifter port
 3 - The locator server can connect to the IP address/port for the GUID, but the server that is there is not the Placeshifter
 10 - The ping was successful. External connections to the Placeshifter should work correctly.

Parameters:
LocatorID- the GUID that should be used for the 'ping'
Returns:
an integer status code as described above.
 */
public static int TestPlaceshifterConnectivity (UIContext _uicontext,java.lang.String LocatorID) {
  Object o = sagex.SageAPI.call(_uicontext, "TestPlaceshifterConnectivity", new Object[] {LocatorID});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Connects to the SageTV Locator server and submits the specified Locator ID for a IP lookup. The Locator server will
 then lookup the IP for that GUID and report it back.

Parameters:
LocatorID- the GUID that should be used for the lookup
Returns:
an String of IP address:port or null if the lookup failed
 */
public static java.lang.String LookupIPForLocatorID (java.lang.String LocatorID) {
  Object o = sagex.SageAPI.call("LookupIPForLocatorID", new Object[] {LocatorID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Connects to the SageTV Locator server and submits the specified Locator ID for a IP lookup. The Locator server will
 then lookup the IP for that GUID and report it back.

Parameters:
LocatorID- the GUID that should be used for the lookup
Returns:
an String of IP address:port or null if the lookup failed
 */
public static java.lang.String LookupIPForLocatorID (UIContext _uicontext,java.lang.String LocatorID) {
  Object o = sagex.SageAPI.call(_uicontext, "LookupIPForLocatorID", new Object[] {LocatorID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Creates a java.lang.Object array and initializes each element to the passed in argument.
 NOTE: This method takes a variable number of arguments, and the length of the returned array will be
 equal to the number of arguments. i.e. calling CreateArray(1, 2) returns an Object array with elements 1 and 2 in it

Parameters:
Value- a value for an element of the array (multiple arguments allowed)
Returns:
the newly allocated Object array with its elements set to the arguments
Since:
6.0
 */
public static java.lang.Object[] CreateArray (java.lang.Object Value) {
  return (java.lang.Object[]) sagex.SageAPI.call("CreateArray", new Object[] {Value});
}

/**
 * UI Context Aware Call<br/>
Creates a java.lang.Object array and initializes each element to the passed in argument.
 NOTE: This method takes a variable number of arguments, and the length of the returned array will be
 equal to the number of arguments. i.e. calling CreateArray(1, 2) returns an Object array with elements 1 and 2 in it

Parameters:
Value- a value for an element of the array (multiple arguments allowed)
Returns:
the newly allocated Object array with its elements set to the arguments
Since:
6.0
 */
public static java.lang.Object[] CreateArray (UIContext _uicontext,java.lang.Object Value) {
  return (java.lang.Object[]) sagex.SageAPI.call(_uicontext, "CreateArray", new Object[] {Value});
}

/**
Scrolls the closest pageable UI parent component (or sibling of a parent) to the specified position.

Parameters:
RelativeX- the X position to scroll to between 0.0 and 1.0 (use a negative number to not change the X position)
RelativeY- the Y position to scroll to between 0.0 and 1.0 (use a negative number to not change the Y position)
Since:
6.2
 */
public static void SetScrollPosition (float RelativeX, float RelativeY) {
   sagex.SageAPI.call("SetScrollPosition", new Object[] {RelativeX,RelativeY});
}

/**
 * UI Context Aware Call<br/>
Scrolls the closest pageable UI parent component (or sibling of a parent) to the specified position.

Parameters:
RelativeX- the X position to scroll to between 0.0 and 1.0 (use a negative number to not change the X position)
RelativeY- the Y position to scroll to between 0.0 and 1.0 (use a negative number to not change the Y position)
Since:
6.2
 */
public static void SetScrollPosition (UIContext _uicontext,float RelativeX, float RelativeY) {
   sagex.SageAPI.call(_uicontext, "SetScrollPosition", new Object[] {RelativeX,RelativeY});
}

/**
Clears the cache that links Widgets to the in memory-menu representations for this UI. This also clears the back/forward history
 to remove any references contained in there as well.

Since:
6.2
 */
public static void ClearMenuCache () {
   sagex.SageAPI.call("ClearMenuCache", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Clears the cache that links Widgets to the in memory-menu representations for this UI. This also clears the back/forward history
 to remove any references contained in there as well.

Since:
6.2
 */
public static void ClearMenuCache (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ClearMenuCache", (Object[])null);
}

/**
Starts an animation for the specified Widget in the specified Layer. If the Widget name ends with a '*' then all Widgets
 that match will be animated; otherwise only the first visible Widget matching the name will be animated. The Widget must
 also have the specified Layer as it's animation layer (i.e. if the Layer is Foreground, then the corresponding Widget
 should have an Animation property of LayerForeground). The type of animation is controlled by AnimtionName. There's
 also suffixes that can be appened to the AnimationName that effect how the timescale for the animation progresses.
 There's also other suffixes that can be used to specify other options for the animations.Valid strings for the AnimationName are:
FullSlideDownOut - slides down off the bottom of the screen
FullSlideDownIn - slides down in from the top of the screen
FullSlideUpOut - slides up off the top of the screen
FullSlideUpIn - slides up in from the bottom of the screen
FullSlideLeftOut - slides off to the left of the screen
FullSlideLeftIn - slides in from the left of the screen
FullSlideRightOut - slides off the right of the screen
FullSlideRightIn - slides in from the right of the screen
SlideDownOut - slides down off the bottom of its parent component
SlideDownIn - slides down in from the top of its parent component
SlideUpOut - slides up off the top of its parent component
SlideUpIn - slides up in from the bottom of its parent component
SlideLeftOut - slides off to the left of its parent component
SlideLeftIn - slides in from the left of its parent component
SlideRightOut - slides off the right of its parent component
SlideRightIn - slides in from the right of its parent component
FadeOut - fades out
FadeIn - fades in
Smooth - smoothly transitions from one position  size to another; the destination image is used for the animation
Morph - smoothly transitions from one position  size to another; the image fades between the source and the destination
ZoomOut - shrinks the size down to nothing from its source size
ZoomIn - grows the size from nothing to its destination size
HZoomOut - shrinks the size down to nothing horitonzatlly from its source size
HZoomIn - grows the size from nothing horitonzatlly to its destination size
VZoomOut - shrinks the size down to nothing vertically from its source size
VZoomIn - grows the size from nothing vertically to its destination size

Timeline modifications for animations affect how the timescale progresses. For out animations, they are eased out if non-linear.
 For in animations, they are eased in if non-linear. For animations that are neither; the timescale modification occurs at both ends.
 Bounce only works properly for 'in' animations.
Valid suffixes for any of the animations are (default is Quadratic):
Linear - animation follows a smooth timeline (first order)
Quadratic - animation follows a quadratic timeline (second order)
Cubic - animation follows a cubic timeline (third order)
Bounce - animation follows a timeline that looks like it 'bounces' in

Additional options for the animation may also be specified by combining additional suffixes to the
 AnimationName. The following is a list of valid option suffixes.
Fade - applies an additional fade in/out effect to the animation (i.e. ZoomOutFade)
North - for Zoom animations will center the zoom around the top of the component (i.e. ZoomInNorth)
West - for Zoom animations will center the zoom around the left of the component
South - for Zoom animations will center the zoom around the bottom of the component
East - for Zoom animations will center the zoom around the right of the component
Behind - for Out animations will cause it to be rendered behind the other layers instead of on top as Out animations usually are
Unclipped - for Slide animations will cause the same motion to occur but without clipping the area when drawn
Unease - for In or Out animations it will reverse the 'easing' direction so you can slide in  out the same panel w/ out overlap

You may combine the directional suffixes to get an additional four directions (i.e. ZoomOutNorthEast). And this
 can also be combined with the timeline suffixes as well, or even Fade (i.e. ZoomInQuadraticSouthWestFade)For delaying the start of an animation; see hereAnimateDelayed()



Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.2
 */
public static boolean Animate (java.lang.String WidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration) {
  Object o = sagex.SageAPI.call("Animate", new Object[] {WidgetName,LayerName,AnimationName,Duration});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Starts an animation for the specified Widget in the specified Layer. If the Widget name ends with a '*' then all Widgets
 that match will be animated; otherwise only the first visible Widget matching the name will be animated. The Widget must
 also have the specified Layer as it's animation layer (i.e. if the Layer is Foreground, then the corresponding Widget
 should have an Animation property of LayerForeground). The type of animation is controlled by AnimtionName. There's
 also suffixes that can be appened to the AnimationName that effect how the timescale for the animation progresses.
 There's also other suffixes that can be used to specify other options for the animations.Valid strings for the AnimationName are:
FullSlideDownOut - slides down off the bottom of the screen
FullSlideDownIn - slides down in from the top of the screen
FullSlideUpOut - slides up off the top of the screen
FullSlideUpIn - slides up in from the bottom of the screen
FullSlideLeftOut - slides off to the left of the screen
FullSlideLeftIn - slides in from the left of the screen
FullSlideRightOut - slides off the right of the screen
FullSlideRightIn - slides in from the right of the screen
SlideDownOut - slides down off the bottom of its parent component
SlideDownIn - slides down in from the top of its parent component
SlideUpOut - slides up off the top of its parent component
SlideUpIn - slides up in from the bottom of its parent component
SlideLeftOut - slides off to the left of its parent component
SlideLeftIn - slides in from the left of its parent component
SlideRightOut - slides off the right of its parent component
SlideRightIn - slides in from the right of its parent component
FadeOut - fades out
FadeIn - fades in
Smooth - smoothly transitions from one position  size to another; the destination image is used for the animation
Morph - smoothly transitions from one position  size to another; the image fades between the source and the destination
ZoomOut - shrinks the size down to nothing from its source size
ZoomIn - grows the size from nothing to its destination size
HZoomOut - shrinks the size down to nothing horitonzatlly from its source size
HZoomIn - grows the size from nothing horitonzatlly to its destination size
VZoomOut - shrinks the size down to nothing vertically from its source size
VZoomIn - grows the size from nothing vertically to its destination size

Timeline modifications for animations affect how the timescale progresses. For out animations, they are eased out if non-linear.
 For in animations, they are eased in if non-linear. For animations that are neither; the timescale modification occurs at both ends.
 Bounce only works properly for 'in' animations.
Valid suffixes for any of the animations are (default is Quadratic):
Linear - animation follows a smooth timeline (first order)
Quadratic - animation follows a quadratic timeline (second order)
Cubic - animation follows a cubic timeline (third order)
Bounce - animation follows a timeline that looks like it 'bounces' in

Additional options for the animation may also be specified by combining additional suffixes to the
 AnimationName. The following is a list of valid option suffixes.
Fade - applies an additional fade in/out effect to the animation (i.e. ZoomOutFade)
North - for Zoom animations will center the zoom around the top of the component (i.e. ZoomInNorth)
West - for Zoom animations will center the zoom around the left of the component
South - for Zoom animations will center the zoom around the bottom of the component
East - for Zoom animations will center the zoom around the right of the component
Behind - for Out animations will cause it to be rendered behind the other layers instead of on top as Out animations usually are
Unclipped - for Slide animations will cause the same motion to occur but without clipping the area when drawn
Unease - for In or Out animations it will reverse the 'easing' direction so you can slide in  out the same panel w/ out overlap

You may combine the directional suffixes to get an additional four directions (i.e. ZoomOutNorthEast). And this
 can also be combined with the timeline suffixes as well, or even Fade (i.e. ZoomInQuadraticSouthWestFade)For delaying the start of an animation; see hereAnimateDelayed()



Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.2
 */
public static boolean Animate (UIContext _uicontext,java.lang.String WidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration) {
  Object o = sagex.SageAPI.call(_uicontext, "Animate", new Object[] {WidgetName,LayerName,AnimationName,Duration});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
For more details on Animations see here:Animate()
In addition to what's specified in the Animate API call; this also offers restricting of an
 Animation by a variable name and value. Usage of the '*' suffix on the WidgetName is allowed.

Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
VarName- the name of the variable that must match for the Widget to be animated
VarValue- the value of the variable to match
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.3
 */
public static boolean AnimateVariable (java.lang.String WidgetName, java.lang.String LayerName, java.lang.String VarName, java.lang.Object VarValue, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call("AnimateVariable", new Object[] {WidgetName,LayerName,VarName,VarValue,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
For more details on Animations see here:Animate()
In addition to what's specified in the Animate API call; this also offers restricting of an
 Animation by a variable name and value. Usage of the '*' suffix on the WidgetName is allowed.

Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
VarName- the name of the variable that must match for the Widget to be animated
VarValue- the value of the variable to match
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.3
 */
public static boolean AnimateVariable (UIContext _uicontext,java.lang.String WidgetName, java.lang.String LayerName, java.lang.String VarName, java.lang.Object VarValue, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call(_uicontext, "AnimateVariable", new Object[] {WidgetName,LayerName,VarName,VarValue,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Performs an Animation between two different Widgets. Normally animations are performed between two different states for a single Widget.
 This API call allows an animation to occur between two different Widgets and will usually be used with a 'Morph' AnimationName. This
 may only target a single Widget; so the '*' suffix is not used on the WidgetNames in this call.For more details on Animations see here:Animate()


Parameters:
SourceWidgetName- the name of the Widget to use as the source for this animation
TargetWidgetName- the name of the Widget to use as the target (destination) for this animation
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.3
 */
public static boolean AnimateTransition (java.lang.String SourceWidgetName, java.lang.String TargetWidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call("AnimateTransition", new Object[] {SourceWidgetName,TargetWidgetName,LayerName,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Performs an Animation between two different Widgets. Normally animations are performed between two different states for a single Widget.
 This API call allows an animation to occur between two different Widgets and will usually be used with a 'Morph' AnimationName. This
 may only target a single Widget; so the '*' suffix is not used on the WidgetNames in this call.For more details on Animations see here:Animate()


Parameters:
SourceWidgetName- the name of the Widget to use as the source for this animation
TargetWidgetName- the name of the Widget to use as the target (destination) for this animation
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.3
 */
public static boolean AnimateTransition (UIContext _uicontext,java.lang.String SourceWidgetName, java.lang.String TargetWidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call(_uicontext, "AnimateTransition", new Object[] {SourceWidgetName,TargetWidgetName,LayerName,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
This is the same as the Animate API call; but it allows specifiying a delay that should occur before the animation actually starts.
 Useful for creating sequences of animation effects.

 For more details see here:Animate()


Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.2
 */
public static boolean AnimateDelayed (java.lang.String WidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call("AnimateDelayed", new Object[] {WidgetName,LayerName,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
This is the same as the Animate API call; but it allows specifiying a delay that should occur before the animation actually starts.
 Useful for creating sequences of animation effects.

 For more details see here:Animate()


Parameters:
WidgetName- the name of the Widget that should be animated
LayerName- the name of the Layer the animated Widget must be in
AnimationName- the name of the animation to perform
Duration- the time in milliseconds that it should take for the animation to complete
StartDelay- the delay in milliseconds before this animation should start
Interruptable- true if the animation can be interrupted to render the next UI update; false if it must complete (this parameter is optional and defaults to false)
Returns:
returns true if a matching Widget was found to perform the animation on; false otherwise
Since:
6.2
 */
public static boolean AnimateDelayed (UIContext _uicontext,java.lang.String WidgetName, java.lang.String LayerName, java.lang.String AnimationName, long Duration, long StartDelay, boolean Interruptable) {
  Object o = sagex.SageAPI.call(_uicontext, "AnimateDelayed", new Object[] {WidgetName,LayerName,AnimationName,Duration,StartDelay,Interruptable});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not animation support is enabled (either layered or Effect based animations; depending upon the STV configuration)

Parameters:
Enabled- true to enable core animations; false otherwise
Since:
6.2
 */
public static void SetCoreAnimationsEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetCoreAnimationsEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br/>
Sets whether or not animation support is enabled (either layered or Effect based animations; depending upon the STV configuration)

Parameters:
Enabled- true to enable core animations; false otherwise
Since:
6.2
 */
public static void SetCoreAnimationsEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetCoreAnimationsEnabled", new Object[] {Enabled});
}

/**
Returns whether or not animation support is enabled (either layered or Effect based animations; depending upon the STV configuration)

Returns:
true if core animations are enabled; false otherwise
Since:
6.2
 */
public static boolean AreCoreAnimationsEnabled () {
  Object o = sagex.SageAPI.call("AreCoreAnimationsEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether or not animation support is enabled (either layered or Effect based animations; depending upon the STV configuration)

Returns:
true if core animations are enabled; false otherwise
Since:
6.2
 */
public static boolean AreCoreAnimationsEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "AreCoreAnimationsEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns whether or not animation support is possible in the current UI environment. Certain clients (like the MVP) do not support animations;
 and animations over remote connections are also disabled due to performance reasons.

Returns:
true if core animations are supported; false otherwise
Since:
7.0
 */
public static boolean AreCoreAnimationsSupported () {
  Object o = sagex.SageAPI.call("AreCoreAnimationsSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether or not animation support is possible in the current UI environment. Certain clients (like the MVP) do not support animations;
 and animations over remote connections are also disabled due to performance reasons.

Returns:
true if core animations are supported; false otherwise
Since:
7.0
 */
public static boolean AreCoreAnimationsSupported (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "AreCoreAnimationsSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Acquires the lock for this user interface system to prevent other updates from occuring. This can be used
 at the start of an animation sequence before the refresh call is made to ensure that the animations will
 all occur on the same refresh cycle. The return value indicates if the lock was acquired. Do NOT release the lock
 unless you acquired the lock. This lock is re-entrant and is thread-based. You must release it from the same
 thread that acquired the lock. If this method return false, then you already have the lock.
 IMPORTANT: It is of CRITICAL IMPORTANCE that ReleaseUIRefreshLock() is called after GetUIRefreshLock() if
 this method returns true or the user interface system will become completely locked up for this client. It's also
 important to not release the lock unless you acquired it.

Returns:
true if the lock was acquired (which means it MUST be released), false if it was not
Since:
6.4
 */
public static boolean GetUIRefreshLock () {
  Object o = sagex.SageAPI.call("GetUIRefreshLock", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Acquires the lock for this user interface system to prevent other updates from occuring. This can be used
 at the start of an animation sequence before the refresh call is made to ensure that the animations will
 all occur on the same refresh cycle. The return value indicates if the lock was acquired. Do NOT release the lock
 unless you acquired the lock. This lock is re-entrant and is thread-based. You must release it from the same
 thread that acquired the lock. If this method return false, then you already have the lock.
 IMPORTANT: It is of CRITICAL IMPORTANCE that ReleaseUIRefreshLock() is called after GetUIRefreshLock() if
 this method returns true or the user interface system will become completely locked up for this client. It's also
 important to not release the lock unless you acquired it.

Returns:
true if the lock was acquired (which means it MUST be released), false if it was not
Since:
6.4
 */
public static boolean GetUIRefreshLock (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetUIRefreshLock", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Releases the lock for this user interface system to allow other updates to occur. This must ONLY be used
 after GetUIRefreshLock() was called and ONLY if GetUIRefreshLock() actually returned true. This must also be called
 from the same thread that called GetUIRefreshLock()

Since:
6.4
 */
public static void ReleaseUIRefreshLock () {
   sagex.SageAPI.call("ReleaseUIRefreshLock", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Releases the lock for this user interface system to allow other updates to occur. This must ONLY be used
 after GetUIRefreshLock() was called and ONLY if GetUIRefreshLock() actually returned true. This must also be called
 from the same thread that called GetUIRefreshLock()

Since:
6.4
 */
public static void ReleaseUIRefreshLock (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ReleaseUIRefreshLock", (Object[])null);
}

/**
Calculates the MD5 Sum of a given file

Parameters:
FilePath- the path to the file who's MD sum should be calculated
Returns:
the MD5 sum of the specified file as a String, null if the file doesn't exist or there's an error reading it
Since:
6.3
 */
public static java.lang.String CalculateMD5Sum (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("CalculateMD5Sum", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Calculates the MD5 Sum of a given file

Parameters:
FilePath- the path to the file who's MD sum should be calculated
Returns:
the MD5 sum of the specified file as a String, null if the file doesn't exist or there's an error reading it
Since:
6.3
 */
public static java.lang.String CalculateMD5Sum (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "CalculateMD5Sum", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Reloads the name server cache. Should be used after reconfiguring the network adapter.
 NOTE: This is only valid on embedded platforms.
 */
public static void ReloadNameserverCache () {
   sagex.SageAPI.call("ReloadNameserverCache", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Reloads the name server cache. Should be used after reconfiguring the network adapter.
 NOTE: This is only valid on embedded platforms.
 */
public static void ReloadNameserverCache (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ReloadNameserverCache", (Object[])null);
}

/**
Returns the amount of time in milliseconds since the last user input occurred for this UI (used for doing things while the user is idle)

Returns:
the amount of time in milliseconds since the last user input occurred
Since:
6.6
 */
public static long GetTimeSinceLastInput () {
  Object o = sagex.SageAPI.call("GetTimeSinceLastInput", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the amount of time in milliseconds since the last user input occurred for this UI (used for doing things while the user is idle)

Returns:
the amount of time in milliseconds since the last user input occurred
Since:
6.6
 */
public static long GetTimeSinceLastInput (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTimeSinceLastInput", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Opens the file at the specified path and reads the entire contents of it and returns it as a String.
 This will use the server's filesystem if executed on SageTVClient.

Parameters:
FilePath- the file path
Returns:
a String which represents the contents of the file; the emptry string if there was a failure
Since:
6.6
 */
public static java.lang.String GetFileAsString (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetFileAsString", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Opens the file at the specified path and reads the entire contents of it and returns it as a String.
 This will use the server's filesystem if executed on SageTVClient.

Parameters:
FilePath- the file path
Returns:
a String which represents the contents of the file; the emptry string if there was a failure
Since:
6.6
 */
public static java.lang.String GetFileAsString (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileAsString", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Opens the file at the specified path and reads the entire contents of it and returns it as a String.

Parameters:
FilePath- the file path
Returns:
a String which represents the contents of the file; the emptry string if there was a failure
Since:
8.0
 */
public static java.lang.String GetLocalFileAsString (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetLocalFileAsString", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Opens the file at the specified path and reads the entire contents of it and returns it as a String.

Parameters:
FilePath- the file path
Returns:
a String which represents the contents of the file; the emptry string if there was a failure
Since:
8.0
 */
public static java.lang.String GetLocalFileAsString (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLocalFileAsString", new Object[] {FilePath});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the local instance of SageTV needs to be restarted due to a plugin install/uninstall

Returns:
true if the local instance of SageTV needs to be restarted due to a plugin install/uninstall, false otherwise
Since:
7.0
 */
public static boolean IsLocalRestartNeeded () {
  Object o = sagex.SageAPI.call("IsLocalRestartNeeded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the local instance of SageTV needs to be restarted due to a plugin install/uninstall

Returns:
true if the local instance of SageTV needs to be restarted due to a plugin install/uninstall, false otherwise
Since:
7.0
 */
public static boolean IsLocalRestartNeeded (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLocalRestartNeeded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the server instance of SageTV needs to be restarted due to a plugin install/uninstall

Returns:
true if the server instance of SageTV needs to be restarted due to a plugin install/uninstall, false otherwise
Since:
7.0
 */
public static boolean IsServerRestartNeeded () {
  Object o = sagex.SageAPI.call("IsServerRestartNeeded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the server instance of SageTV needs to be restarted due to a plugin install/uninstall

Returns:
true if the server instance of SageTV needs to be restarted due to a plugin install/uninstall, false otherwise
Since:
7.0
 */
public static boolean IsServerRestartNeeded (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsServerRestartNeeded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Restarts the local instance of SageTV. Sometimes needed after a plugin install/uninstall. If you want to restart
 the local and server instance; then perform the restart on the server first. This is only supported on
 Windows and Linux currently. If this is called from a SageTVClient running on the same machine as the server, this will invoke
 a restart of the locally running server as well in order to ensure proper file upgrade synchronization.

Returns:
true if restarting is supported (Although the restart will likely complete and the method will never return), false otherwise (Mac OS X does not have restart support)
Since:
7.0
 */
public static boolean Restart () {
  Object o = sagex.SageAPI.call("Restart", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Restarts the local instance of SageTV. Sometimes needed after a plugin install/uninstall. If you want to restart
 the local and server instance; then perform the restart on the server first. This is only supported on
 Windows and Linux currently. If this is called from a SageTVClient running on the same machine as the server, this will invoke
 a restart of the locally running server as well in order to ensure proper file upgrade synchronization.

Returns:
true if restarting is supported (Although the restart will likely complete and the method will never return), false otherwise (Mac OS X does not have restart support)
Since:
7.0
 */
public static boolean Restart (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "Restart", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Restarts the server instance of SageTV. Sometimes needed after a plugin install/uninstall. If you want to restart
 the local and server instance; then perform the restart on the server first. This is only supported on
 Windows servers and Linux servers currently.

Returns:
true if restarting is supported (Although the restart will likely complete and the method will never return), false otherwise (Mac OS X server does not have restart support)
Since:
7.0
 */
public static boolean ServerRestart () {
  Object o = sagex.SageAPI.call("ServerRestart", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Restarts the server instance of SageTV. Sometimes needed after a plugin install/uninstall. If you want to restart
 the local and server instance; then perform the restart on the server first. This is only supported on
 Windows servers and Linux servers currently.

Returns:
true if restarting is supported (Although the restart will likely complete and the method will never return), false otherwise (Mac OS X server does not have restart support)
Since:
7.0
 */
public static boolean ServerRestart (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "ServerRestart", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the MAC address of the SageTV server at the specified hostname. This will only work if SageTV is running on that host.
 This call uses a 3 second timeout internally.

Parameters:
Hostname- the hostname/IP of the SageTV server
Returns:
a String in the format 00:xx:xx:xx:xx:xx that represents the MAC of the server, or null if it fails
Since:
7.0
 */
public static java.lang.String QueryServerMacAddress (java.lang.String Hostname) {
  Object o = sagex.SageAPI.call("QueryServerMacAddress", new Object[] {Hostname});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the MAC address of the SageTV server at the specified hostname. This will only work if SageTV is running on that host.
 This call uses a 3 second timeout internally.

Parameters:
Hostname- the hostname/IP of the SageTV server
Returns:
a String in the format 00:xx:xx:xx:xx:xx that represents the MAC of the server, or null if it fails
Since:
7.0
 */
public static java.lang.String QueryServerMacAddress (UIContext _uicontext,java.lang.String Hostname) {
  Object o = sagex.SageAPI.call(_uicontext, "QueryServerMacAddress", new Object[] {Hostname});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Scans for wireless access points and returns the results as a map. The keys are the SSID names and the values are Security;Strength where
 Security will be WEP/WPA/None and strength will be an integer between 0 and 100
 NOTE: This is only valid on embedded platforms.

Returns:
a Map describing the results of the access point scan
Since:
6.6
 */
public static java.util.Map ScanWirelessAPs () {
  Object o = sagex.SageAPI.call("ScanWirelessAPs", (Object[])null);
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Scans for wireless access points and returns the results as a map. The keys are the SSID names and the values are Security;Strength where
 Security will be WEP/WPA/None and strength will be an integer between 0 and 100
 NOTE: This is only valid on embedded platforms.

Returns:
a Map describing the results of the access point scan
Since:
6.6
 */
public static java.util.Map ScanWirelessAPs (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "ScanWirelessAPs", (Object[])null);
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
Determines the device that is mounted at the specified path, and then repartitions it to have a single EXT3 partition and then
 formats that partition. WARNING: THIS WILL DESTROY ALL INFORMATION ON THE TARGET DEVICE AND REFORMAT IT
 NOTE: This is only valid on embedded platforms.

Parameters:
DrivePath- the path string of a disk to reformat
Returns:
zero upon success, -1 if it is unable to find a device that corresponds to the requested path, -2 if it is unable to unmount that path, -3 if there was a problem re-partitioning or reformatting the drive, and -4 if there was a failure remounting the newly formatted drive
Since:
7.1
 */
public static int ReformatDeviceAtPathAsEXT3 (java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call("ReformatDeviceAtPathAsEXT3", new Object[] {DrivePath});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Determines the device that is mounted at the specified path, and then repartitions it to have a single EXT3 partition and then
 formats that partition. WARNING: THIS WILL DESTROY ALL INFORMATION ON THE TARGET DEVICE AND REFORMAT IT
 NOTE: This is only valid on embedded platforms.

Parameters:
DrivePath- the path string of a disk to reformat
Returns:
zero upon success, -1 if it is unable to find a device that corresponds to the requested path, -2 if it is unable to unmount that path, -3 if there was a problem re-partitioning or reformatting the drive, and -4 if there was a failure remounting the newly formatted drive
Since:
7.1
 */
public static int ReformatDeviceAtPathAsEXT3 (UIContext _uicontext,java.lang.String DrivePath) {
  Object o = sagex.SageAPI.call(_uicontext, "ReformatDeviceAtPathAsEXT3", new Object[] {DrivePath});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
converts a string of NTE key characters (and normal characters) into their
 default character representation - given by the first character in the
 NTE chatacter listThe NTE key characters are the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits),
 representing the numeric Text Keys 1-9 and 0.The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
NteString- the string to convert
Returns:
the converted string
Since:
8.0
 */
public static java.lang.String ConvertNteChars (java.lang.String NteString) {
  Object o = sagex.SageAPI.call("ConvertNteChars", new Object[] {NteString});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
converts a string of NTE key characters (and normal characters) into their
 default character representation - given by the first character in the
 NTE chatacter listThe NTE key characters are the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits),
 representing the numeric Text Keys 1-9 and 0.The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
NteString- the string to convert
Returns:
the converted string
Since:
8.0
 */
public static java.lang.String ConvertNteChars (UIContext _uicontext,java.lang.String NteString) {
  Object o = sagex.SageAPI.call(_uicontext, "ConvertNteChars", new Object[] {NteString});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the index of MatchStringNTE string within FullString, -1 if it is not found.Search is case-insentiveThe MatchStringNTE may contain the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits) representing
 numeric Text Keys 1-9 and 0. The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
FullString- the string to search in
MatchStringNTE- the string to search for
Returns:
the first 0-based index in FullString that MatchStringNTE occurs at or -1 if it is not found
Since:
8.0
 */
public static java.lang.String StringIndexOfNTE (java.lang.String FullString, java.lang.String MatchStringNTE) {
  Object o = sagex.SageAPI.call("StringIndexOfNTE", new Object[] {FullString,MatchStringNTE});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the index of MatchStringNTE string within FullString, -1 if it is not found.Search is case-insentiveThe MatchStringNTE may contain the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits) representing
 numeric Text Keys 1-9 and 0. The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
FullString- the string to search in
MatchStringNTE- the string to search for
Returns:
the first 0-based index in FullString that MatchStringNTE occurs at or -1 if it is not found
Since:
8.0
 */
public static java.lang.String StringIndexOfNTE (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchStringNTE) {
  Object o = sagex.SageAPI.call(_uicontext, "StringIndexOfNTE", new Object[] {FullString,MatchStringNTE});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the Full String starts with characters matching MatchStringNTESearch is case-insentiveThe MatchStringNTE may contain the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits) representing
 numeric Text Keys 1-9 and 0. The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
FullString- the string to search in
MatchStringNTE- the string to search for
Returns:
true if FullString starts with characters matching MatchStringNTE
Since:
8.0
 */
public static java.lang.Boolean StringStartsWithNTE (java.lang.String FullString, java.lang.String MatchStringNTE) {
  Object o = sagex.SageAPI.call("StringStartsWithNTE", new Object[] {FullString,MatchStringNTE});
  if (o!=null) return (java.lang.Boolean) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns true if the Full String starts with characters matching MatchStringNTESearch is case-insentiveThe MatchStringNTE may contain the Unicode characters u2460-u2468 and u24EA  (Unicode Circled Digits) representing
 numeric Text Keys 1-9 and 0. The characters represented by the keys are defined by the client properties"ui/numeric_text_input_ui/translation_language_code_key_lower.

Parameters:
FullString- the string to search in
MatchStringNTE- the string to search for
Returns:
true if FullString starts with characters matching MatchStringNTE
Since:
8.0
 */
public static java.lang.Boolean StringStartsWithNTE (UIContext _uicontext,java.lang.String FullString, java.lang.String MatchStringNTE) {
  Object o = sagex.SageAPI.call(_uicontext, "StringStartsWithNTE", new Object[] {FullString,MatchStringNTE});
  if (o!=null) return (java.lang.Boolean) o;
  return null;
}

/**
Dumps all the java stack information on the SageTV server process to the server's debug output stream

Since:
8.0
 */
public static void DumpServerThreadStates () {
   sagex.SageAPI.call("DumpServerThreadStates", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Dumps all the java stack information on the SageTV server process to the server's debug output stream

Since:
8.0
 */
public static void DumpServerThreadStates (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DumpServerThreadStates", (Object[])null);
}

}
