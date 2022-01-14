package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 12/6/21 7:46 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/SeriesInfoAPI.html'>SeriesInfoAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class SeriesInfoAPI {
/**
Returns a list of all of the SeriesInfo which is information about television series

Returns:
a list of all of the SeriesInfo
Since:
5.1
 */
public static Object[] GetAllSeriesInfo () {
  return (Object[]) sagex.SageAPI.call("GetAllSeriesInfo", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of all of the SeriesInfo which is information about television series

Returns:
a list of all of the SeriesInfo
Since:
5.1
 */
public static Object[] GetAllSeriesInfo (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllSeriesInfo", (Object[])null);
}

/**
Returns the title for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the title for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesTitle (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesTitle", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the title for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the title for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesTitle (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesTitle", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the description for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the description for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesDescription (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesDescription", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the description for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the description for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesDescription (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesDescription", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the category for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the category for the SeriesInfo
Since:
V7.0
 */
public static java.lang.String GetSeriesCategory (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesCategory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the category for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the category for the SeriesInfo
Since:
V7.0
 */
public static java.lang.String GetSeriesCategory (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesCategory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the subcategory for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the subcategory for the SeriesInfo
Since:
V7.0
 */
public static java.lang.String GetSeriesSubCategory (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesSubCategory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the subcategory for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the subcategory for the SeriesInfo
Since:
V7.0
 */
public static java.lang.String GetSeriesSubCategory (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesSubCategory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the history description for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the history description for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesHistory (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesHistory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the history description for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the history description for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesHistory (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesHistory", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String describing the premiere date for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a String describing the premiere date for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesPremiereDate (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesPremiereDate", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String describing the premiere date for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a String describing the premiere date for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesPremiereDate (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesPremiereDate", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String describing the finale date for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a String describing the finale date for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesFinaleDate (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesFinaleDate", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String describing the finale date for the specified SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a String describing the finale date for the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesFinaleDate (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesFinaleDate", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of the network the specified SeriesInfo airs on

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the name of the network the specified SeriesInfo airs on
Since:
5.1
 */
public static java.lang.String GetSeriesNetwork (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesNetwork", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the network the specified SeriesInfo airs on

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the name of the network the specified SeriesInfo airs on
Since:
5.1
 */
public static java.lang.String GetSeriesNetwork (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesNetwork", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of the day of the week the specified SeriesInfo airs on

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the name of the day of the week the specified SeriesInfo airs on
Since:
5.1
 */
public static java.lang.String GetSeriesDayOfWeek (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesDayOfWeek", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the day of the week the specified SeriesInfo airs on

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the name of the day of the week the specified SeriesInfo airs on
Since:
5.1
 */
public static java.lang.String GetSeriesDayOfWeek (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesDayOfWeek", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the hour/minute timeslot that the specified SeriesInfo airs at

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the hour/minute timeslot that the specified SeriesInfo airs at
Since:
5.1
 */
public static java.lang.String GetSeriesHourAndMinuteTimeslot (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesHourAndMinuteTimeslot", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the hour/minute timeslot that the specified SeriesInfo airs at

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the hour/minute timeslot that the specified SeriesInfo airs at
Since:
5.1
 */
public static java.lang.String GetSeriesHourAndMinuteTimeslot (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesHourAndMinuteTimeslot", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified SeriesInfo has a corresponding image for it

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
true if the specified SeriesInfo has a corresponding image for it
Since:
5.1
 */
public static boolean HasSeriesImage (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("HasSeriesImage", new Object[] {SeriesInfo});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified SeriesInfo has a corresponding image for it

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
true if the specified SeriesInfo has a corresponding image for it
Since:
5.1
 */
public static boolean HasSeriesImage (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "HasSeriesImage", new Object[] {SeriesInfo});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the image that corresponds to this SeriesInfo if there is one
Since:
5.1
 */
public static Object GetSeriesImage (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesImage", new Object[] {SeriesInfo});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the image that corresponds to this SeriesInfo if there is one
Since:
5.1
 */
public static Object GetSeriesImage (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImage", new Object[] {SeriesInfo});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static Object GetSeriesImage (Object SeriesInfo, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesImage", new Object[] {SeriesInfo,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static Object GetSeriesImage (UIContext _uicontext,Object SeriesInfo, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImage", new Object[] {SeriesInfo,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the URL of the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the URL of the image that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static java.lang.String GetSeriesImageURL (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesImageURL", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the URL of the image that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the URL of the image that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static java.lang.String GetSeriesImageURL (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImageURL", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the image URL that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image URL that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static java.lang.String GetSeriesImageURL (Object SeriesInfo, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesImageURL", new Object[] {SeriesInfo,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image URL that corresponds to this SeriesInfo if there is one

Parameters:
SeriesInfo- the SeriesInfo object
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image URL that corresponds to this SeriesInfo if there is one
Since:
8.0
 */
public static java.lang.String GetSeriesImageURL (UIContext _uicontext,Object SeriesInfo, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImageURL", new Object[] {SeriesInfo,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the number of images available that correspond to this SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the number of images available that correspond to this SeriesInfo
Since:
8.0
 */
public static int GetSeriesImageCount (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesImageCount", new Object[] {SeriesInfo});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of images available that correspond to this SeriesInfo

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the number of images available that correspond to this SeriesInfo
Since:
8.0
 */
public static int GetSeriesImageCount (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImageCount", new Object[] {SeriesInfo});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the image that corresponds to this SeriesInfo at the specified index (when there are multiple images)

Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of which image to return
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image that corresponds to this SeriesInfo at the specified index
Since:
8.0
 */
public static Object GetSeriesImageAtIndex (Object SeriesInfo, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesImageAtIndex", new Object[] {SeriesInfo,Index,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image that corresponds to this SeriesInfo at the specified index (when there are multiple images)

Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of which image to return
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image that corresponds to this SeriesInfo at the specified index
Since:
8.0
 */
public static Object GetSeriesImageAtIndex (UIContext _uicontext,Object SeriesInfo, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImageAtIndex", new Object[] {SeriesInfo,Index,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the image URL that corresponds to this SeriesInfo at the specified index (when there are multiple images)

Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of which image to return
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image URL that corresponds to this SeriesInfo at the specified index
Since:
8.0
 */
public static java.lang.String GetSeriesImageURLAtIndex (Object SeriesInfo, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesImageURLAtIndex", new Object[] {SeriesInfo,Index,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image URL that corresponds to this SeriesInfo at the specified index (when there are multiple images)

Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of which image to return
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
the image URL that corresponds to this SeriesInfo at the specified index
Since:
8.0
 */
public static java.lang.String GetSeriesImageURLAtIndex (UIContext _uicontext,Object SeriesInfo, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesImageURLAtIndex", new Object[] {SeriesInfo,Index,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified SeriesInfo has a corresponding image for it for the specified Person in it

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Returns:
true if the specified SeriesInfo has a corresponding image for it for the specified Person in it
Since:
8.0
 */
public static boolean HasSeriesActorImage (Object SeriesInfo, Object Person) {
  Object o = sagex.SageAPI.call("HasSeriesActorImage", new Object[] {SeriesInfo,Person});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified SeriesInfo has a corresponding image for it for the specified Person in it

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Returns:
true if the specified SeriesInfo has a corresponding image for it for the specified Person in it
Since:
8.0
 */
public static boolean HasSeriesActorImage (UIContext _uicontext,Object SeriesInfo, Object Person) {
  Object o = sagex.SageAPI.call(_uicontext, "HasSeriesActorImage", new Object[] {SeriesInfo,Person});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns an image of the specified Person in their role in the specified Series

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
an image of the specified Person in their role in the specified Series
Since:
8.0
 */
public static Object GetSeriesActorImage (Object SeriesInfo, Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesActorImage", new Object[] {SeriesInfo,Person,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns an image of the specified Person in their role in the specified Series

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
an image of the specified Person in their role in the specified Series
Since:
8.0
 */
public static Object GetSeriesActorImage (UIContext _uicontext,Object SeriesInfo, Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesActorImage", new Object[] {SeriesInfo,Person,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns an image URL of the specified Person in their role in the specified Series

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
an image URL of the specified Person in their role in the specified Series
Since:
8.0
 */
public static java.lang.String GetSeriesActorImageURL (Object SeriesInfo, Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetSeriesActorImageURL", new Object[] {SeriesInfo,Person,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns an image URL of the specified Person in their role in the specified Series

Parameters:
SeriesInfo- the SeriesInfo object
Person- the Person to check for an image
Thumb- true if a thumbnail is preferred, false if a full size image is
Returns:
an image URL of the specified Person in their role in the specified Series
Since:
8.0
 */
public static java.lang.String GetSeriesActorImageURL (UIContext _uicontext,Object SeriesInfo, Object Person, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesActorImageURL", new Object[] {SeriesInfo,Person,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the number of characters that we have information on for the specified series

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the number of characters that we have information on for the specified series
Since:
5.1
 */
public static int GetNumberOfCharactersInSeries (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetNumberOfCharactersInSeries", new Object[] {SeriesInfo});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of characters that we have information on for the specified series

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the number of characters that we have information on for the specified series
Since:
5.1
 */
public static int GetNumberOfCharactersInSeries (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNumberOfCharactersInSeries", new Object[] {SeriesInfo});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the name of the actor/actress for the specfied index in the specified SeriesInfo. The range
 for the index is from 0 to one less than the value ofGetNumberOfCharactersInSeries()


Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of the actor to retrieve
Returns:
the Person object of the actor/actress for the specfied index in the specified SeriesInfo
Since:
5.1
 */
public static Object GetSeriesActor (Object SeriesInfo, int Index) {
  Object o = sagex.SageAPI.call("GetSeriesActor", new Object[] {SeriesInfo,Index});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the actor/actress for the specfied index in the specified SeriesInfo. The range
 for the index is from 0 to one less than the value ofGetNumberOfCharactersInSeries()


Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of the actor to retrieve
Returns:
the Person object of the actor/actress for the specfied index in the specified SeriesInfo
Since:
5.1
 */
public static Object GetSeriesActor (UIContext _uicontext,Object SeriesInfo, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesActor", new Object[] {SeriesInfo,Index});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a list of the names of the actors/actresses in the specified SeriesInfo.

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a list of the Persons of the actors/actresses in the specified SeriesInfo
Since:
5.1
 */
public static Object[] GetSeriesActorList (Object SeriesInfo) {
  return (Object[]) sagex.SageAPI.call("GetSeriesActorList", new Object[] {SeriesInfo});
}

/**
 * UI Context Aware Call<br>
Returns a list of the names of the actors/actresses in the specified SeriesInfo.

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a list of the Persons of the actors/actresses in the specified SeriesInfo
Since:
5.1
 */
public static Object[] GetSeriesActorList (UIContext _uicontext,Object SeriesInfo) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetSeriesActorList", new Object[] {SeriesInfo});
}

/**
Returns the name of the character for the specfied index in the specified SeriesInfo. The range
 for the index is from 0 to one less than the value ofGetNumberOfCharactersInSeries()


Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of the actor to retrieve
Returns:
the name of the character for the specfied index in the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesCharacter (Object SeriesInfo, int Index) {
  Object o = sagex.SageAPI.call("GetSeriesCharacter", new Object[] {SeriesInfo,Index});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the character for the specfied index in the specified SeriesInfo. The range
 for the index is from 0 to one less than the value ofGetNumberOfCharactersInSeries()


Parameters:
SeriesInfo- the SeriesInfo object
Index- the 0-based index of the actor to retrieve
Returns:
the name of the character for the specfied index in the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String GetSeriesCharacter (UIContext _uicontext,Object SeriesInfo, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesCharacter", new Object[] {SeriesInfo,Index});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a list of the names of the characters in the specified SeriesInfo.

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a list of the names of the characters in the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String[] GetSeriesCharacterList (Object SeriesInfo) {
  return (java.lang.String[]) sagex.SageAPI.call("GetSeriesCharacterList", new Object[] {SeriesInfo});
}

/**
 * UI Context Aware Call<br>
Returns a list of the names of the characters in the specified SeriesInfo.

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
a list of the names of the characters in the specified SeriesInfo
Since:
5.1
 */
public static java.lang.String[] GetSeriesCharacterList (UIContext _uicontext,Object SeriesInfo) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSeriesCharacterList", new Object[] {SeriesInfo});
}

/**
Returns the name of the character that the corresponding actor plays in this series

Parameters:
SeriesInfo- the SeriesInfo object
Actor- the actor
Returns:
the name of the character that the corresponding actor plays in this series, the empty string if there's no correlation
Since:
7.0
 */
public static java.lang.String GetSeriesCharacterForActor (Object SeriesInfo, java.lang.String Actor) {
  Object o = sagex.SageAPI.call("GetSeriesCharacterForActor", new Object[] {SeriesInfo,Actor});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the character that the corresponding actor plays in this series

Parameters:
SeriesInfo- the SeriesInfo object
Actor- the actor
Returns:
the name of the character that the corresponding actor plays in this series, the empty string if there's no correlation
Since:
7.0
 */
public static java.lang.String GetSeriesCharacterForActor (UIContext _uicontext,Object SeriesInfo, java.lang.String Actor) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesCharacterForActor", new Object[] {SeriesInfo,Actor});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the Series ID of the specified SeriesInfo
 NOTE: V8.0 IDs are not backwards compatible with prior versions

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the Series ID of the specified SeriesInfo object (currently an integer, represented as a String for future expansion)
Since:
7.0
 */
public static java.lang.String GetSeriesID (Object SeriesInfo) {
  Object o = sagex.SageAPI.call("GetSeriesID", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Series ID of the specified SeriesInfo
 NOTE: V8.0 IDs are not backwards compatible with prior versions

Parameters:
SeriesInfo- the SeriesInfo object
Returns:
the Series ID of the specified SeriesInfo object (currently an integer, represented as a String for future expansion)
Since:
7.0
 */
public static java.lang.String GetSeriesID (UIContext _uicontext,Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesID", new Object[] {SeriesInfo});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the SeriesInfo object for the specified Series ID
 NOTE: V8.0 IDs are not backwards compatible with prior versions

Parameters:
SeriesID- the ID of the desired SeriesInfo object
Returns:
the SeriesInfo object with the specified ID, or null if it does not exist
Since:
7.0
 */
public static Object GetSeriesInfoForID (java.lang.String SeriesID) {
  Object o = sagex.SageAPI.call("GetSeriesInfoForID", new Object[] {SeriesID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the SeriesInfo object for the specified Series ID
 NOTE: V8.0 IDs are not backwards compatible with prior versions

Parameters:
SeriesID- the ID of the desired SeriesInfo object
Returns:
the SeriesInfo object with the specified ID, or null if it does not exist
Since:
7.0
 */
public static Object GetSeriesInfoForID (UIContext _uicontext,java.lang.String SeriesID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesInfoForID", new Object[] {SeriesID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Call this to add a SeriesInfo object to the database. If a SeriesInfo with this seriesID is already present, it will be updated
 to this information. You can use null or String[0] for any fields you don't want to specify.

Parameters:
SeriesID- the ID of the series, this should match the prefix of corresponding ShowIDs w/out the last 4 digits for proper linkage (i.e. the SeriesID for EP1234567890 would be 123456)
Title- the title of the series
Network- the network that airs the series
Description- a description of this series
History- a historical description of the series
PremiereDate- a String representation of the date the series premiered
FinaleDate- a String representation of the date the series ended
AirDOW- a String representation of the day of the week the series airs
AirHrMin- a String representation of the time the series airs
ImageURL- a URL that links to an image for this series
People- names of people/actors in this show
Characters- must be same length as people array, should give the character names the corresponding people have in the series
Returns:
the newly added SeriesInfo object, or the updated object if another SeriesInfo object already existed with the same SeriesID
Since:
7.0
 */
public static Object AddSeriesInfo (int SeriesID, java.lang.String Title, java.lang.String Network, java.lang.String Description, java.lang.String History, java.lang.String PremiereDate, java.lang.String FinaleDate, java.lang.String AirDOW, java.lang.String AirHrMin, java.lang.String ImageURL, java.lang.String[] People, java.lang.String[] Characters) {
  Object o = sagex.SageAPI.call("AddSeriesInfo", new Object[] {SeriesID,Title,Network,Description,History,PremiereDate,FinaleDate,AirDOW,AirHrMin,ImageURL,People,Characters});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Call this to add a SeriesInfo object to the database. If a SeriesInfo with this seriesID is already present, it will be updated
 to this information. You can use null or String[0] for any fields you don't want to specify.

Parameters:
SeriesID- the ID of the series, this should match the prefix of corresponding ShowIDs w/out the last 4 digits for proper linkage (i.e. the SeriesID for EP1234567890 would be 123456)
Title- the title of the series
Network- the network that airs the series
Description- a description of this series
History- a historical description of the series
PremiereDate- a String representation of the date the series premiered
FinaleDate- a String representation of the date the series ended
AirDOW- a String representation of the day of the week the series airs
AirHrMin- a String representation of the time the series airs
ImageURL- a URL that links to an image for this series
People- names of people/actors in this show
Characters- must be same length as people array, should give the character names the corresponding people have in the series
Returns:
the newly added SeriesInfo object, or the updated object if another SeriesInfo object already existed with the same SeriesID
Since:
7.0
 */
public static Object AddSeriesInfo (UIContext _uicontext,int SeriesID, java.lang.String Title, java.lang.String Network, java.lang.String Description, java.lang.String History, java.lang.String PremiereDate, java.lang.String FinaleDate, java.lang.String AirDOW, java.lang.String AirHrMin, java.lang.String ImageURL, java.lang.String[] People, java.lang.String[] Characters) {
  Object o = sagex.SageAPI.call(_uicontext, "AddSeriesInfo", new Object[] {SeriesID,Title,Network,Description,History,PremiereDate,FinaleDate,AirDOW,AirHrMin,ImageURL,People,Characters});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a property value for a specified SeriesInfo object. This must have been set using SetSeriesInfoProperty.
 Returns the empty string when the property is undefined.

Parameters:
SeriesInfo- the SeriesInfo object
PropertyName- the name of the property
Returns:
the property value for the specified SeriesInfo, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetSeriesInfoProperty (Object SeriesInfo, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("GetSeriesInfoProperty", new Object[] {SeriesInfo,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a property value for a specified SeriesInfo object. This must have been set using SetSeriesInfoProperty.
 Returns the empty string when the property is undefined.

Parameters:
SeriesInfo- the SeriesInfo object
PropertyName- the name of the property
Returns:
the property value for the specified SeriesInfo, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetSeriesInfoProperty (UIContext _uicontext,Object SeriesInfo, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSeriesInfoProperty", new Object[] {SeriesInfo,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets a property for this SeriesInfo object. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this SeriesInfo object. This only impacts the return values from GetSeriesInfoProperty and has no other side effects.

Parameters:
SeriesInfo- the SeriesInfo object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetSeriesInfoProperty (Object SeriesInfo, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetSeriesInfoProperty", new Object[] {SeriesInfo,PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets a property for this SeriesInfo object. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this SeriesInfo object. This only impacts the return values from GetSeriesInfoProperty and has no other side effects.

Parameters:
SeriesInfo- the SeriesInfo object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetSeriesInfoProperty (UIContext _uicontext,Object SeriesInfo, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetSeriesInfoProperty", new Object[] {SeriesInfo,PropertyName,PropertyValue});
}

/**
Returns true if the argument is a SeriesInfo object. Automatic type conversion is NOT done in this call.

Parameters:
SeriesInfo- the object to test
Returns:
true if the argument is an SeriesInfo object
Since:
7.1
 */
public static boolean IsSeriesInfoObject (java.lang.Object SeriesInfo) {
  Object o = sagex.SageAPI.call("IsSeriesInfoObject", new Object[] {SeriesInfo});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the argument is a SeriesInfo object. Automatic type conversion is NOT done in this call.

Parameters:
SeriesInfo- the object to test
Returns:
true if the argument is an SeriesInfo object
Since:
7.1
 */
public static boolean IsSeriesInfoObject (UIContext _uicontext,java.lang.Object SeriesInfo) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSeriesInfoObject", new Object[] {SeriesInfo});
  if (o!=null) return (Boolean) o;
  return false;
}

}
