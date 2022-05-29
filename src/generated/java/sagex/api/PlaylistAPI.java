package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PlaylistAPI.html'>PlaylistAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class PlaylistAPI {
/**
Adds the specified item to this Playlist. The item may be either an Airing, Album, MediaFile or another Playlist.

Parameters:
Playlist- the Playlist object to add the new item to
NewItem- the new item to add to the Playlist; must be an Airing, Album, MediaFile or Playlist
 */
public static void AddToPlaylist (Object Playlist, java.lang.Object NewItem) {
   sagex.SageAPI.call("AddToPlaylist", new Object[] {Playlist,NewItem});
}

/**
 * UI Context Aware Call<br>
Adds the specified item to this Playlist. The item may be either an Airing, Album, MediaFile or another Playlist.

Parameters:
Playlist- the Playlist object to add the new item to
NewItem- the new item to add to the Playlist; must be an Airing, Album, MediaFile or Playlist
 */
public static void AddToPlaylist (UIContext _uicontext,Object Playlist, java.lang.Object NewItem) {
   sagex.SageAPI.call(_uicontext, "AddToPlaylist", new Object[] {Playlist,NewItem});
}

/**
Gets the name of the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
the name of the specified Playlist
 */
public static java.lang.String GetName (Object Playlist) {
  Object o = sagex.SageAPI.call("GetName", new Object[] {Playlist});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
the name of the specified Playlist
 */
public static java.lang.String GetName (UIContext _uicontext,Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "GetName", new Object[] {Playlist});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the number of items in the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
the number of items in the specified Playlist
 */
public static int GetNumberOfPlaylistItems (Object Playlist) {
  Object o = sagex.SageAPI.call("GetNumberOfPlaylistItems", new Object[] {Playlist});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the number of items in the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
the number of items in the specified Playlist
 */
public static int GetNumberOfPlaylistItems (UIContext _uicontext,Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNumberOfPlaylistItems", new Object[] {Playlist});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the item in this Playlist at the specified index

Parameters:
Playlist- the Playlist object
Index- the 0-based index into the playlist to get the item from
Returns:
the item at the specified index in the Playlist; this will be an Airing, Album, Playlist or null
 */
public static java.lang.Object GetPlaylistItemAt (Object Playlist, int Index) {
  Object o = sagex.SageAPI.call("GetPlaylistItemAt", new Object[] {Playlist,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the item in this Playlist at the specified index

Parameters:
Playlist- the Playlist object
Index- the 0-based index into the playlist to get the item from
Returns:
the item at the specified index in the Playlist; this will be an Airing, Album, Playlist or null
 */
public static java.lang.Object GetPlaylistItemAt (UIContext _uicontext,Object Playlist, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPlaylistItemAt", new Object[] {Playlist,Index});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Gets the type of item in the Playlist at the specified index

Parameters:
Playlist- the Playlist object
Index- the 0-based index into the Playlist to get the item type for
Returns:
the type of item at the specified index in the Playlist; one of "Airing", "Album", "Playlist" or "" ("Airing" is used for MediaFile items), "MediaFile" will be returned for temporary MediaFile objects that are not in the database
 */
public static java.lang.String GetPlaylistItemTypeAt (Object Playlist, int Index) {
  Object o = sagex.SageAPI.call("GetPlaylistItemTypeAt", new Object[] {Playlist,Index});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the type of item in the Playlist at the specified index

Parameters:
Playlist- the Playlist object
Index- the 0-based index into the Playlist to get the item type for
Returns:
the type of item at the specified index in the Playlist; one of "Airing", "Album", "Playlist" or "" ("Airing" is used for MediaFile items), "MediaFile" will be returned for temporary MediaFile objects that are not in the database
 */
public static java.lang.String GetPlaylistItemTypeAt (UIContext _uicontext,Object Playlist, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPlaylistItemTypeAt", new Object[] {Playlist,Index});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the list of items in the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
a list of the items in the specified Playlist
 */
public static java.lang.Object[] GetPlaylistItems (Object Playlist) {
  return (java.lang.Object[]) sagex.SageAPI.call("GetPlaylistItems", new Object[] {Playlist});
}

/**
 * UI Context Aware Call<br>
Gets the list of items in the specified Playlist

Parameters:
Playlist- the Playlist object
Returns:
a list of the items in the specified Playlist
 */
public static java.lang.Object[] GetPlaylistItems (UIContext _uicontext,Object Playlist) {
  return (java.lang.Object[]) sagex.SageAPI.call(_uicontext, "GetPlaylistItems", new Object[] {Playlist});
}

/**
Inserts a new item into the specified Playlist at the specified position.

Parameters:
Playlist- the Playlist object to add the new item to
InsertIndex- the 0-based index that the new item should be inserted at
NewItem- the new item to insert into the Playlist; must be an Airing, Album, MediaFile or Playlist
 */
public static void InsertIntoPlaylist (Object Playlist, int InsertIndex, java.lang.Object NewItem) {
   sagex.SageAPI.call("InsertIntoPlaylist", new Object[] {Playlist,InsertIndex,NewItem});
}

/**
 * UI Context Aware Call<br>
Inserts a new item into the specified Playlist at the specified position.

Parameters:
Playlist- the Playlist object to add the new item to
InsertIndex- the 0-based index that the new item should be inserted at
NewItem- the new item to insert into the Playlist; must be an Airing, Album, MediaFile or Playlist
 */
public static void InsertIntoPlaylist (UIContext _uicontext,Object Playlist, int InsertIndex, java.lang.Object NewItem) {
   sagex.SageAPI.call(_uicontext, "InsertIntoPlaylist", new Object[] {Playlist,InsertIndex,NewItem});
}

/**
Swaps the position of the item at the specified index in the Playlist with the item at the position (Index - 1)

Parameters:
Playlist- the Playlist object
Index- the position of the item to move up one in the playlist
 */
public static void MovePlaylistItemUp (Object Playlist, int Index) {
   sagex.SageAPI.call("MovePlaylistItemUp", new Object[] {Playlist,Index});
}

/**
 * UI Context Aware Call<br>
Swaps the position of the item at the specified index in the Playlist with the item at the position (Index - 1)

Parameters:
Playlist- the Playlist object
Index- the position of the item to move up one in the playlist
 */
public static void MovePlaylistItemUp (UIContext _uicontext,Object Playlist, int Index) {
   sagex.SageAPI.call(_uicontext, "MovePlaylistItemUp", new Object[] {Playlist,Index});
}

/**
Swaps the position of the item at the specified index in the Playlist with the item at the position (Index   1)

Parameters:
Playlist- the Playlist object
Index- the position of the item to move down one in the playlist
 */
public static void MovePlaylistItemDown (Object Playlist, int Index) {
   sagex.SageAPI.call("MovePlaylistItemDown", new Object[] {Playlist,Index});
}

/**
 * UI Context Aware Call<br>
Swaps the position of the item at the specified index in the Playlist with the item at the position (Index   1)

Parameters:
Playlist- the Playlist object
Index- the position of the item to move down one in the playlist
 */
public static void MovePlaylistItemDown (UIContext _uicontext,Object Playlist, int Index) {
   sagex.SageAPI.call(_uicontext, "MovePlaylistItemDown", new Object[] {Playlist,Index});
}

/**
Removes the specified item from the Playlist. If this item appears in the Playlist more than once, only the first occurrence will be removed.

Parameters:
Playlist- the Playlist object
Item- the item to remove from the Playlist, must be an Airing, MediaFile, Album or Playlist
 */
public static void RemovePlaylistItem (Object Playlist, java.lang.Object Item) {
   sagex.SageAPI.call("RemovePlaylistItem", new Object[] {Playlist,Item});
}

/**
 * UI Context Aware Call<br>
Removes the specified item from the Playlist. If this item appears in the Playlist more than once, only the first occurrence will be removed.

Parameters:
Playlist- the Playlist object
Item- the item to remove from the Playlist, must be an Airing, MediaFile, Album or Playlist
 */
public static void RemovePlaylistItem (UIContext _uicontext,Object Playlist, java.lang.Object Item) {
   sagex.SageAPI.call(_uicontext, "RemovePlaylistItem", new Object[] {Playlist,Item});
}

/**
Removes the specified item at the specified index from the Playlist.

Parameters:
Playlist- the Playlist object
ItemIndex- the index of the item to remove from the Playlist
 */
public static void RemovePlaylistItemAt (Object Playlist, int ItemIndex) {
   sagex.SageAPI.call("RemovePlaylistItemAt", new Object[] {Playlist,ItemIndex});
}

/**
 * UI Context Aware Call<br>
Removes the specified item at the specified index from the Playlist.

Parameters:
Playlist- the Playlist object
ItemIndex- the index of the item to remove from the Playlist
 */
public static void RemovePlaylistItemAt (UIContext _uicontext,Object Playlist, int ItemIndex) {
   sagex.SageAPI.call(_uicontext, "RemovePlaylistItemAt", new Object[] {Playlist,ItemIndex});
}

/**
Sets the name for this Playlist

Parameters:
Playlist- the Playlist objecxt
Name- the name to set for this Plyalist
 */
public static void SetName (Object Playlist, java.lang.String Name) {
   sagex.SageAPI.call("SetName", new Object[] {Playlist,Name});
}

/**
 * UI Context Aware Call<br>
Sets the name for this Playlist

Parameters:
Playlist- the Playlist objecxt
Name- the name to set for this Plyalist
 */
public static void SetName (UIContext _uicontext,Object Playlist, java.lang.String Name) {
   sagex.SageAPI.call(_uicontext, "SetName", new Object[] {Playlist,Name});
}

/**
Returns true if the passed in argument is a Playlist object

Parameters:
Playlist- the object to test to see if it is a Playlist object
Returns:
true if the passed in argument is a Playlist object, false otherwise
 */
public static boolean IsPlaylistObject (java.lang.Object Playlist) {
  Object o = sagex.SageAPI.call("IsPlaylistObject", new Object[] {Playlist});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the passed in argument is a Playlist object

Parameters:
Playlist- the object to test to see if it is a Playlist object
Returns:
true if the passed in argument is a Playlist object, false otherwise
 */
public static boolean IsPlaylistObject (UIContext _uicontext,java.lang.Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPlaylistObject", new Object[] {Playlist});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets a list of all of the Playlists in the database

Returns:
a list of all of the Playlists in the database
 */
public static Object[] GetPlaylists () {
  return (Object[]) sagex.SageAPI.call("GetPlaylists", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the Playlists in the database

Returns:
a list of all of the Playlists in the database
 */
public static Object[] GetPlaylists (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetPlaylists", (Object[])null);
}

/**
Removes a specified Playlist from the databse completely. The files in the Playlist will NOT be removed.

Parameters:
Playlist- the Playlist object to remove
 */
public static void RemovePlaylist (Object Playlist) {
   sagex.SageAPI.call("RemovePlaylist", new Object[] {Playlist});
}

/**
 * UI Context Aware Call<br>
Removes a specified Playlist from the databse completely. The files in the Playlist will NOT be removed.

Parameters:
Playlist- the Playlist object to remove
 */
public static void RemovePlaylist (UIContext _uicontext,Object Playlist) {
   sagex.SageAPI.call(_uicontext, "RemovePlaylist", new Object[] {Playlist});
}

/**
Returns true if the specified Playlist contains any video files, false otherwise

Parameters:
Playlist- the Playlist object
Returns:
true if the specified Playlist contains any video files, false otherwise
Since:
5.1
 */
public static boolean DoesPlaylistHaveVideo (Object Playlist) {
  Object o = sagex.SageAPI.call("DoesPlaylistHaveVideo", new Object[] {Playlist});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Playlist contains any video files, false otherwise

Parameters:
Playlist- the Playlist object
Returns:
true if the specified Playlist contains any video files, false otherwise
Since:
5.1
 */
public static boolean DoesPlaylistHaveVideo (UIContext _uicontext,Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "DoesPlaylistHaveVideo", new Object[] {Playlist});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Creates a new Playlist object

Parameters:
Name- the name for the new Playlist
Returns:
the newly created Playlist
 */
public static Object AddPlaylist (java.lang.String Name) {
  Object o = sagex.SageAPI.call("AddPlaylist", new Object[] {Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a new Playlist object

Parameters:
Name- the name for the new Playlist
Returns:
the newly created Playlist
 */
public static Object AddPlaylist (UIContext _uicontext,java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "AddPlaylist", new Object[] {Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the 'Now Playing' playlist. This can be used as a local, client-specific playlist which
 songs can be added to and then played as a temporary set of songs. i.e. usually playlists are shared between
 all of the clients that are connected to a SageTV system, but this one is NOT shared

Returns:
the Playlist object to use as the 'Now Playing' list
Since:
5.1
 */
public static Object GetNowPlayingList () {
  Object o = sagex.SageAPI.call("GetNowPlayingList", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the 'Now Playing' playlist. This can be used as a local, client-specific playlist which
 songs can be added to and then played as a temporary set of songs. i.e. usually playlists are shared between
 all of the clients that are connected to a SageTV system, but this one is NOT shared

Returns:
the Playlist object to use as the 'Now Playing' list
Since:
5.1
 */
public static Object GetNowPlayingList (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNowPlayingList", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a property value for a specified Playlist. This must have been set using SetPlaylistProperty.
 Returns the empty string when the property is undefined.

Parameters:
Playlist- the Playlist object
PropertyName- the name of the property
Returns:
the property value for the specified Playlist, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetPlaylistProperty (Object Playlist, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("GetPlaylistProperty", new Object[] {Playlist,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a property value for a specified Playlist. This must have been set using SetPlaylistProperty.
 Returns the empty string when the property is undefined.

Parameters:
Playlist- the Playlist object
PropertyName- the name of the property
Returns:
the property value for the specified Playlist, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetPlaylistProperty (UIContext _uicontext,Object Playlist, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPlaylistProperty", new Object[] {Playlist,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets a property for this Playlist. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this Playlist. This only impacts the return values from GetPlaylistProperty and has no other side effects.

Parameters:
Playlist- the Playlist object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetPlaylistProperty (Object Playlist, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetPlaylistProperty", new Object[] {Playlist,PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets a property for this Playlist. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this Playlist. This only impacts the return values from GetPlaylistProperty and has no other side effects.

Parameters:
Playlist- the Playlist object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetPlaylistProperty (UIContext _uicontext,Object Playlist, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetPlaylistProperty", new Object[] {Playlist,PropertyName,PropertyValue});
}

/**
Returns a java.util.Properties object that has all of the user-set properties for this Playlist in it.

Parameters:
Playlist- the Playlist object
Returns:
a java.util.Properties object that has all of the user-set properties for this Playlist in it; this is a copy of the original one so it is safe to modify it
Since:
7.1
 */
public static java.util.Properties GetPlaylistProperties (Object Playlist) {
  Object o = sagex.SageAPI.call("GetPlaylistProperties", new Object[] {Playlist});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a java.util.Properties object that has all of the user-set properties for this Playlist in it.

Parameters:
Playlist- the Playlist object
Returns:
a java.util.Properties object that has all of the user-set properties for this Playlist in it; this is a copy of the original one so it is safe to modify it
Since:
7.1
 */
public static java.util.Properties GetPlaylistProperties (UIContext _uicontext,Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPlaylistProperties", new Object[] {Playlist});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

}
