package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 15/08/16 6:16 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/ChannelAPI.html'>ChannelAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class ChannelAPI {
/**
Gets the descriptive name for this Channel. This is the longer text string.

Parameters:
Channel- the Channel Object
Returns:
the longer descriptive name for the specified Channel
 */
public static java.lang.String GetChannelDescription (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelDescription", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the descriptive name for this Channel. This is the longer text string.

Parameters:
Channel- the Channel Object
Returns:
the longer descriptive name for the specified Channel
 */
public static java.lang.String GetChannelDescription (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelDescription", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the name for this Channel. This is the Channel's call sign.

Parameters:
Channel- the Channel Object
Returns:
the name (call sign) for the specified Channel
 */
public static java.lang.String GetChannelName (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelName", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name for this Channel. This is the Channel's call sign.

Parameters:
Channel- the Channel Object
Returns:
the name (call sign) for the specified Channel
 */
public static java.lang.String GetChannelName (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelName", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the name of the associated network for this Channel. This is a way of grouping kinds of Channels together.

Parameters:
Channel- the Channel Object
Returns:
the network name for the specified Channel
 */
public static java.lang.String GetChannelNetwork (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelNetwork", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the associated network for this Channel. This is a way of grouping kinds of Channels together.

Parameters:
Channel- the Channel Object
Returns:
the network name for the specified Channel
 */
public static java.lang.String GetChannelNetwork (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelNetwork", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the channel number to tune to for this Channel. SageTV will return the first channel number it finds for this Channel since there may be multiple ones.

Parameters:
Channel- the Channel Object
Returns:
a channel number associated with this Channel
 */
public static java.lang.String GetChannelNumber (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelNumber", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the channel number to tune to for this Channel. SageTV will return the first channel number it finds for this Channel since there may be multiple ones.

Parameters:
Channel- the Channel Object
Returns:
a channel number associated with this Channel
 */
public static java.lang.String GetChannelNumber (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelNumber", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the channel number to tune to for this Channel on the specified lineup.
 SageTV will return the first channel number it finds for this Channel on the lineup since there may be multiple ones.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the channel number for the specified Channel on the specified Lineup
 */
public static java.lang.String GetChannelNumberForLineup (Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("GetChannelNumberForLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the channel number to tune to for this Channel on the specified lineup.
 SageTV will return the first channel number it finds for this Channel on the lineup since there may be multiple ones.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the channel number for the specified Channel on the specified Lineup
 */
public static java.lang.String GetChannelNumberForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelNumberForLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the physical channel number to tune to for this Channel on the specified lineup.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the physical channel number for the specified Channel on the specified Lineup
Since:
5.1
 */
public static java.lang.String GetPhysicalChannelNumberForLineup (Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("GetPhysicalChannelNumberForLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the physical channel number to tune to for this Channel on the specified lineup.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the physical channel number for the specified Channel on the specified Lineup
Since:
5.1
 */
public static java.lang.String GetPhysicalChannelNumberForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPhysicalChannelNumberForLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if there is a configured lineup for which this channel is viewable.

Parameters:
Channel- the Channel object
Returns:
true if there is a configured lineup for which this channel is viewable.
 */
public static boolean IsChannelViewable (Object Channel) {
  Object o = sagex.SageAPI.call("IsChannelViewable", new Object[] {Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if there is a configured lineup for which this channel is viewable.

Parameters:
Channel- the Channel object
Returns:
true if there is a configured lineup for which this channel is viewable.
 */
public static boolean IsChannelViewable (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "IsChannelViewable", new Object[] {Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Channel is viewable on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if this Channel is viewable on the specified Lineup
 */
public static boolean IsChannelViewableOnLineup (Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("IsChannelViewableOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Channel is viewable on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if this Channel is viewable on the specified Lineup
 */
public static boolean IsChannelViewableOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "IsChannelViewableOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Channel is viewable on the specified Lineup on the specified channel number

Parameters:
Channel- the Channel object
ChannelNumber- the channel number to check
Lineup- the name of the Lineup
Returns:
true if this Channel is viewable on the specified Lineup on the specified channel number
 */
public static boolean IsChannelViewableOnNumberOnLineup (Object Channel, java.lang.String ChannelNumber, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("IsChannelViewableOnNumberOnLineup", new Object[] {Channel,ChannelNumber,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Channel is viewable on the specified Lineup on the specified channel number

Parameters:
Channel- the Channel object
ChannelNumber- the channel number to check
Lineup- the name of the Lineup
Returns:
true if this Channel is viewable on the specified Lineup on the specified channel number
 */
public static boolean IsChannelViewableOnNumberOnLineup (UIContext _uicontext,Object Channel, java.lang.String ChannelNumber, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "IsChannelViewableOnNumberOnLineup", new Object[] {Channel,ChannelNumber,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the channel numbers which can be used to tune this Channel on the specified lineup.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the channel numbers for the specified Channel on the specified Lineup
 */
public static java.lang.String[] GetChannelNumbersForLineup (Object Channel, java.lang.String Lineup) {
  return (java.lang.String[]) sagex.SageAPI.call("GetChannelNumbersForLineup", new Object[] {Channel,Lineup});
}

/**
 * UI Context Aware Call<br>
Gets the channel numbers which can be used to tune this Channel on the specified lineup.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
the channel numbers for the specified Channel on the specified Lineup
 */
public static java.lang.String[] GetChannelNumbersForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetChannelNumbersForLineup", new Object[] {Channel,Lineup});
}

/**
Clears any associated channel mappings that were created for this Channel on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
 */
public static void ClearChannelMappingOnLineup (Object Channel, java.lang.String Lineup) {
   sagex.SageAPI.call("ClearChannelMappingOnLineup", new Object[] {Channel,Lineup});
}

/**
 * UI Context Aware Call<br>
Clears any associated channel mappings that were created for this Channel on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
 */
public static void ClearChannelMappingOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
   sagex.SageAPI.call(_uicontext, "ClearChannelMappingOnLineup", new Object[] {Channel,Lineup});
}

/**
Returns true if the user has remapped this Channel to a different number than it's default on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if the user has remapped this Channel to a different number than it's default on the specified Lineup
 */
public static boolean IsChannelRemappedOnLineup (Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("IsChannelRemappedOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the user has remapped this Channel to a different number than it's default on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if the user has remapped this Channel to a different number than it's default on the specified Lineup
 */
public static boolean IsChannelRemappedOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "IsChannelRemappedOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Maps a channel on a lineup to a new channel number.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumber- the new channel number to use for this Channel
 */
public static void SetChannelMappingForLineup (Object Channel, java.lang.String Lineup, java.lang.String NewNumber) {
   sagex.SageAPI.call("SetChannelMappingForLineup", new Object[] {Channel,Lineup,NewNumber});
}

/**
 * UI Context Aware Call<br>
Maps a channel on a lineup to a new channel number.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumber- the new channel number to use for this Channel
 */
public static void SetChannelMappingForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup, java.lang.String NewNumber) {
   sagex.SageAPI.call(_uicontext, "SetChannelMappingForLineup", new Object[] {Channel,Lineup,NewNumber});
}

/**
Maps a channel on a lineup to a new channel number(s).

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumbers- the new channel numbers to use for this Channel
Since:
6.4.3
 */
public static void SetChannelMappingsForLineup (Object Channel, java.lang.String Lineup, java.lang.String[] NewNumbers) {
   sagex.SageAPI.call("SetChannelMappingsForLineup", new Object[] {Channel,Lineup,NewNumbers});
}

/**
 * UI Context Aware Call<br>
Maps a channel on a lineup to a new channel number(s).

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumbers- the new channel numbers to use for this Channel
Since:
6.4.3
 */
public static void SetChannelMappingsForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup, java.lang.String[] NewNumbers) {
   sagex.SageAPI.call(_uicontext, "SetChannelMappingsForLineup", new Object[] {Channel,Lineup,NewNumbers});
}

/**
Clears any associated physical channel mappings that were created for this Channel on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Since:
5.1
 */
public static void ClearPhysicalChannelMappingsOnLineup (Object Channel, java.lang.String Lineup) {
   sagex.SageAPI.call("ClearPhysicalChannelMappingsOnLineup", new Object[] {Channel,Lineup});
}

/**
 * UI Context Aware Call<br>
Clears any associated physical channel mappings that were created for this Channel on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Since:
5.1
 */
public static void ClearPhysicalChannelMappingsOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
   sagex.SageAPI.call(_uicontext, "ClearPhysicalChannelMappingsOnLineup", new Object[] {Channel,Lineup});
}

/**
Returns true if the user has remapped this physical Channel to a different physical number than it's default on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if the user has remapped this physical Channel to a different number than it's default on the specified Lineup
Since:
5.1
 */
public static boolean IsPhysicalChannelRemappedOnLineup (Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("IsPhysicalChannelRemappedOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the user has remapped this physical Channel to a different physical number than it's default on the specified Lineup

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Returns:
true if the user has remapped this physical Channel to a different number than it's default on the specified Lineup
Since:
5.1
 */
public static boolean IsPhysicalChannelRemappedOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPhysicalChannelRemappedOnLineup", new Object[] {Channel,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Maps a Channel on a lineup to a new physical channel number.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumber- the new phyical channel number to use for this Channel
Since:
5.1
 */
public static void SetPhysicalChannelMappingForLineup (Object Channel, java.lang.String Lineup, java.lang.String NewNumber) {
   sagex.SageAPI.call("SetPhysicalChannelMappingForLineup", new Object[] {Channel,Lineup,NewNumber});
}

/**
 * UI Context Aware Call<br>
Maps a Channel on a lineup to a new physical channel number.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
NewNumber- the new phyical channel number to use for this Channel
Since:
5.1
 */
public static void SetPhysicalChannelMappingForLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup, java.lang.String NewNumber) {
   sagex.SageAPI.call(_uicontext, "SetPhysicalChannelMappingForLineup", new Object[] {Channel,Lineup,NewNumber});
}

/**
Returns an ID which can be used withGetChannelForStationID()
for doing keyed lookups of Channel objects

Parameters:
Channel- the Channel object
Returns:
the station ID for the specified Channel
 */
public static int GetStationID (Object Channel) {
  Object o = sagex.SageAPI.call("GetStationID", new Object[] {Channel});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns an ID which can be used withGetChannelForStationID()
for doing keyed lookups of Channel objects

Parameters:
Channel- the Channel object
Returns:
the station ID for the specified Channel
 */
public static int GetStationID (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetStationID", new Object[] {Channel});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the logo image for the specified Channel if one exists

Parameters:
Channel- the Channel object
Returns:
the logo image for the Channel
 */
public static Object GetChannelLogo (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelLogo", new Object[] {Channel});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the logo image for the specified Channel if one exists

Parameters:
Channel- the Channel object
Returns:
the logo image for the Channel
 */
public static Object GetChannelLogo (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelLogo", new Object[] {Channel});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a Channel logo for the requested Channel if one exists. This can provide more detailed requests then the single argument GetChannelLogo call.

Parameters:
Channel- the Channel object
Type- the type of image, can be one of "Small", "Med" or "Large" (all logos have all sizes available, w/ the exception of user-supplied logos)
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type (there are only ever 0, 1 or 2 logos for a channel)
Fallback- should be true if an alternate image is allowed (this enables checking user-supplied logos first, as well as falling back to the primary logo if a secondary one is requested but does not exist)
Returns:
a MetaImage corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
7.1
 */
public static Object GetChannelLogo (Object Channel, java.lang.String Type, int Index, boolean Fallback) {
  Object o = sagex.SageAPI.call("GetChannelLogo", new Object[] {Channel,Type,Index,Fallback});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a Channel logo for the requested Channel if one exists. This can provide more detailed requests then the single argument GetChannelLogo call.

Parameters:
Channel- the Channel object
Type- the type of image, can be one of "Small", "Med" or "Large" (all logos have all sizes available, w/ the exception of user-supplied logos)
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type (there are only ever 0, 1 or 2 logos for a channel)
Fallback- should be true if an alternate image is allowed (this enables checking user-supplied logos first, as well as falling back to the primary logo if a secondary one is requested but does not exist)
Returns:
a MetaImage corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
7.1
 */
public static Object GetChannelLogo (UIContext _uicontext,Object Channel, java.lang.String Type, int Index, boolean Fallback) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelLogo", new Object[] {Channel,Type,Index,Fallback});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the argument is a Channel object. Automatic type conversion is NOT done in this call.

Parameters:
Channel- the object to test
Returns:
true if the argument is a Channel object
 */
public static boolean IsChannelObject (Object Channel) {
  Object o = sagex.SageAPI.call("IsChannelObject", new Object[] {Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the argument is a Channel object. Automatic type conversion is NOT done in this call.

Parameters:
Channel- the object to test
Returns:
true if the argument is a Channel object
 */
public static boolean IsChannelObject (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "IsChannelObject", new Object[] {Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not the specified Channel is viewable on the specified number on the specified Lineup

Parameters:
Channel- the Channel object
ChannelNumber- the channel number to set the viewability state for
Lineup- the name of the Lineup
Viewable- true if is viewable, false if it is not
 */
public static void SetChannelViewabilityForChannelNumberOnLineup (Object Channel, java.lang.String ChannelNumber, java.lang.String Lineup, boolean Viewable) {
   sagex.SageAPI.call("SetChannelViewabilityForChannelNumberOnLineup", new Object[] {Channel,ChannelNumber,Lineup,Viewable});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the specified Channel is viewable on the specified number on the specified Lineup

Parameters:
Channel- the Channel object
ChannelNumber- the channel number to set the viewability state for
Lineup- the name of the Lineup
Viewable- true if is viewable, false if it is not
 */
public static void SetChannelViewabilityForChannelNumberOnLineup (UIContext _uicontext,Object Channel, java.lang.String ChannelNumber, java.lang.String Lineup, boolean Viewable) {
   sagex.SageAPI.call(_uicontext, "SetChannelViewabilityForChannelNumberOnLineup", new Object[] {Channel,ChannelNumber,Lineup,Viewable});
}

/**
Sets whether or not the specified Channel is viewable on the specified Lineup. This affects all channel numbers it appears on.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Viewable- true if is viewable, false if it is not
 */
public static void SetChannelViewabilityForChannelOnLineup (Object Channel, java.lang.String Lineup, boolean Viewable) {
   sagex.SageAPI.call("SetChannelViewabilityForChannelOnLineup", new Object[] {Channel,Lineup,Viewable});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the specified Channel is viewable on the specified Lineup. This affects all channel numbers it appears on.

Parameters:
Channel- the Channel object
Lineup- the name of the Lineup
Viewable- true if is viewable, false if it is not
 */
public static void SetChannelViewabilityForChannelOnLineup (UIContext _uicontext,Object Channel, java.lang.String Lineup, boolean Viewable) {
   sagex.SageAPI.call(_uicontext, "SetChannelViewabilityForChannelOnLineup", new Object[] {Channel,Lineup,Viewable});
}

/**
Returns the Channel object that has the corresponding station ID. The station ID is retrieved usingGetStationID()


Parameters:
StationID- the station ID to look up
Returns:
the Channel with the specified station ID
 */
public static Object GetChannelForStationID (int StationID) {
  Object o = sagex.SageAPI.call("GetChannelForStationID", new Object[] {StationID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Channel object that has the corresponding station ID. The station ID is retrieved usingGetStationID()


Parameters:
StationID- the station ID to look up
Returns:
the Channel with the specified station ID
 */
public static Object GetChannelForStationID (UIContext _uicontext,int StationID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelForStationID", new Object[] {StationID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Adds a new Channel to the database. The CallSign should not match that of any other channel; but this rule is not enforced.
 The StationID is what is used as the unique key to identify a station. Be sure that if you're creating new station IDs they do not conflict with existing ones.
 The safest way to pick a station ID (if you need to at random) is to make it less than 10000 and ensure that no channel already exists with that station ID.

Parameters:
CallSign- the 'Name' to assign to the new Channel
Name- the 'Description' to assign to the new Channel
Network- the 'Network' that the Channel is part of (can be "")
StationID- the unique ID to give to this Channel
Returns:
the newly created Channel object, if the station ID is already in use it will return the existing Channel object, but updated with the passed in values
 */
public static Object AddChannel (java.lang.String CallSign, java.lang.String Name, java.lang.String Network, int StationID) {
  Object o = sagex.SageAPI.call("AddChannel", new Object[] {CallSign,Name,Network,StationID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Adds a new Channel to the database. The CallSign should not match that of any other channel; but this rule is not enforced.
 The StationID is what is used as the unique key to identify a station. Be sure that if you're creating new station IDs they do not conflict with existing ones.
 The safest way to pick a station ID (if you need to at random) is to make it less than 10000 and ensure that no channel already exists with that station ID.

Parameters:
CallSign- the 'Name' to assign to the new Channel
Name- the 'Description' to assign to the new Channel
Network- the 'Network' that the Channel is part of (can be "")
StationID- the unique ID to give to this Channel
Returns:
the newly created Channel object, if the station ID is already in use it will return the existing Channel object, but updated with the passed in values
 */
public static Object AddChannel (UIContext _uicontext,java.lang.String CallSign, java.lang.String Name, java.lang.String Network, int StationID) {
  Object o = sagex.SageAPI.call(_uicontext, "AddChannel", new Object[] {CallSign,Name,Network,StationID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns all of the Channels that are defined in the system

Returns:
all of the Channel objects that are defined in the system
 */
public static Object[] GetAllChannels () {
  return (Object[]) sagex.SageAPI.call("GetAllChannels", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns all of the Channels that are defined in the system

Returns:
all of the Channel objects that are defined in the system
 */
public static Object[] GetAllChannels (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllChannels", (Object[])null);
}

/**
Returns a count of logos for this channel. This will either be 0, 1 or 2. This does NOT include user-supplied channel logos.
 Since all channel logos have all types, this does not require a type argument.

Parameters:
Channel- the Channel object
Returns:
the number of logos for the specified Channel (does NOT include user-supplied logos)
Since:
7.1
 */
public static int GetChannelLogoCount (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelLogoCount", new Object[] {Channel});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns a count of logos for this channel. This will either be 0, 1 or 2. This does NOT include user-supplied channel logos.
 Since all channel logos have all types, this does not require a type argument.

Parameters:
Channel- the Channel object
Returns:
the number of logos for the specified Channel (does NOT include user-supplied logos)
Since:
7.1
 */
public static int GetChannelLogoCount (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelLogoCount", new Object[] {Channel});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the URL of the logo image for the specified Channel if one exists

Parameters:
Channel- the Channel object
Returns:
the URL of the logo image for the Channel
Since:
8.0
 */
public static java.lang.String GetChannelLogoURL (Object Channel) {
  Object o = sagex.SageAPI.call("GetChannelLogoURL", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the URL of the logo image for the specified Channel if one exists

Parameters:
Channel- the Channel object
Returns:
the URL of the logo image for the Channel
Since:
8.0
 */
public static java.lang.String GetChannelLogoURL (UIContext _uicontext,Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelLogoURL", new Object[] {Channel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a Channel logo URL for the requested Channel if one exists. This can provide more detailed requests then the single argument GetChannelLogoURL call.

Parameters:
Channel- the Channel object
Type- the type of image, can be one of "Small", "Med" or "Large" (all logos have all sizes available, w/ the exception of user-supplied logos)
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type (there are only ever 0, 1 or 2 logos for a channel)
Fallback- should be true if an alternate image is allowed (this enables checking user-supplied logos first, as well as falling back to the primary logo if a secondary one is requested but does not exist)
Returns:
a URL corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
8.0
 */
public static java.lang.String GetChannelLogoURL (Object Channel, java.lang.String Type, int Index, boolean Fallback) {
  Object o = sagex.SageAPI.call("GetChannelLogoURL", new Object[] {Channel,Type,Index,Fallback});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a Channel logo URL for the requested Channel if one exists. This can provide more detailed requests then the single argument GetChannelLogoURL call.

Parameters:
Channel- the Channel object
Type- the type of image, can be one of "Small", "Med" or "Large" (all logos have all sizes available, w/ the exception of user-supplied logos)
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type (there are only ever 0, 1 or 2 logos for a channel)
Fallback- should be true if an alternate image is allowed (this enables checking user-supplied logos first, as well as falling back to the primary logo if a secondary one is requested but does not exist)
Returns:
a URL corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
8.0
 */
public static java.lang.String GetChannelLogoURL (UIContext _uicontext,Object Channel, java.lang.String Type, int Index, boolean Fallback) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChannelLogoURL", new Object[] {Channel,Type,Index,Fallback});
  if (o!=null) return (java.lang.String) o;
  return null;
}

}
