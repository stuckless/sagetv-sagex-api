package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/AlbumAPI.html'>AlbumAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class AlbumAPI {
/**
Returns all of the artists for the music files in the library

Returns:
an array of the artists for the music files in the library
 */
public static java.lang.String[] GetAllMusicArtists () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllMusicArtists", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns all of the artists for the music files in the library

Returns:
an array of the artists for the music files in the library
 */
public static java.lang.String[] GetAllMusicArtists (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllMusicArtists", (Object[])null);
}

/**
Returns all of the genres for the music files in the library

Returns:
an array of the genres for the music files in the library
 */
public static java.lang.String[] GetAllMusicGenres () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllMusicGenres", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns all of the genres for the music files in the library

Returns:
an array of the genres for the music files in the library
 */
public static java.lang.String[] GetAllMusicGenres (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllMusicGenres", (Object[])null);
}

/**
Returns all of the Album objects in the library. This list is derived from the music files in the library.

Returns:
an array of all of the Album objects in the library
 */
public static Object[] GetAlbums () {
  return (Object[]) sagex.SageAPI.call("GetAlbums", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns all of the Album objects in the library. This list is derived from the music files in the library.

Returns:
an array of all of the Album objects in the library
 */
public static Object[] GetAlbums (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAlbums", (Object[])null);
}

/**
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that have an artist that matches the passed in artist

Parameters:
Artist- the name of the artist
Returns:
an array of the Airings that correspond to music files by the specified artist
 */
public static Object[] GetAllMusicForArtist (java.lang.String Artist) {
  return (Object[]) sagex.SageAPI.call("GetAllMusicForArtist", new Object[] {Artist});
}

/**
 * UI Context Aware Call<br>
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that have an artist that matches the passed in artist

Parameters:
Artist- the name of the artist
Returns:
an array of the Airings that correspond to music files by the specified artist
 */
public static Object[] GetAllMusicForArtist (UIContext _uicontext,java.lang.String Artist) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllMusicForArtist", new Object[] {Artist});
}

/**
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that have a genre that matches the passed in genre

Parameters:
Genre- the name of the genre
Returns:
an array of the Airings that correspond to music files by the specified genre
 */
public static Object[] GetAllMusicForGenre (java.lang.String Genre) {
  return (Object[]) sagex.SageAPI.call("GetAllMusicForGenre", new Object[] {Genre});
}

/**
 * UI Context Aware Call<br>
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that have a genre that matches the passed in genre

Parameters:
Genre- the name of the genre
Returns:
an array of the Airings that correspond to music files by the specified genre
 */
public static Object[] GetAllMusicForGenre (UIContext _uicontext,java.lang.String Genre) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllMusicForGenre", new Object[] {Genre});
}

/**
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that are on this Album in the library. The returned list is sorted by the track number of each song.

Parameters:
Album- the Album object to get the tracks for
Returns:
an array of Airings which are the tracks on this Album
 */
public static Object[] GetAlbumTracks (Object Album) {
  return (Object[]) sagex.SageAPI.call("GetAlbumTracks", new Object[] {Album});
}

/**
 * UI Context Aware Call<br>
Gets all of the Airings (a 'meta' object referring to the music file in this case)
 that are on this Album in the library. The returned list is sorted by the track number of each song.

Parameters:
Album- the Album object to get the tracks for
Returns:
an array of Airings which are the tracks on this Album
 */
public static Object[] GetAlbumTracks (UIContext _uicontext,Object Album) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAlbumTracks", new Object[] {Album});
}

/**
Returns the number of tracks that are on this Album

Parameters:
Album- the Album object
Returns:
the number of tracks that are on the specified Album
 */
public static int GetNumberOfTracks (Object Album) {
  Object o = sagex.SageAPI.call("GetNumberOfTracks", new Object[] {Album});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of tracks that are on this Album

Parameters:
Album- the Album object
Returns:
the number of tracks that are on the specified Album
 */
public static int GetNumberOfTracks (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNumberOfTracks", new Object[] {Album});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the artist for this Album. If there's more than one artist it will return the
 localized string for the resource "Various_Artists". This defaults to "Various".

Parameters:
Album- the Album object
Returns:
the artist for the specified Album
 */
public static java.lang.String GetAlbumArtist (Object Album) {
  Object o = sagex.SageAPI.call("GetAlbumArtist", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the artist for this Album. If there's more than one artist it will return the
 localized string for the resource "Various_Artists". This defaults to "Various".

Parameters:
Album- the Album object
Returns:
the artist for the specified Album
 */
public static java.lang.String GetAlbumArtist (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumArtist", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the album art for this Album.

Parameters:
Album- the Album object
Returns:
the album art for the specified Album, this can be fed into an Image Widget to display it
 */
public static Object GetAlbumArt (Object Album) {
  Object o = sagex.SageAPI.call("GetAlbumArt", new Object[] {Album});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the album art for this Album.

Parameters:
Album- the Album object
Returns:
the album art for the specified Album, this can be fed into an Image Widget to display it
 */
public static Object GetAlbumArt (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumArt", new Object[] {Album});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the name/title for this Album

Parameters:
Album- the Album object
Returns:
the name/title of the specified Album
 */
public static java.lang.String GetAlbumName (Object Album) {
  Object o = sagex.SageAPI.call("GetAlbumName", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name/title for this Album

Parameters:
Album- the Album object
Returns:
the name/title of the specified Album
 */
public static java.lang.String GetAlbumName (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumName", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if there is album art for this Album

Parameters:
Album- the Album object
Returns:
true if there is album art for this Album, false otherwise
 */
public static boolean HasAlbumArt (Object Album) {
  Object o = sagex.SageAPI.call("HasAlbumArt", new Object[] {Album});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if there is album art for this Album

Parameters:
Album- the Album object
Returns:
true if there is album art for this Album, false otherwise
 */
public static boolean HasAlbumArt (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "HasAlbumArt", new Object[] {Album});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the argument is an Album object

Parameters:
Album- the Object to test
Returns:
true if the passed in object is an Album object, false otherwise
 */
public static boolean IsAlbumObject (java.lang.Object Album) {
  Object o = sagex.SageAPI.call("IsAlbumObject", new Object[] {Album});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the argument is an Album object

Parameters:
Album- the Object to test
Returns:
true if the passed in object is an Album object, false otherwise
 */
public static boolean IsAlbumObject (UIContext _uicontext,java.lang.Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "IsAlbumObject", new Object[] {Album});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the genre for this Album

Parameters:
Album- the Album object
Returns:
the genre for the specified Album
 */
public static java.lang.String GetAlbumGenre (Object Album) {
  Object o = sagex.SageAPI.call("GetAlbumGenre", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the genre for this Album

Parameters:
Album- the Album object
Returns:
the genre for the specified Album
 */
public static java.lang.String GetAlbumGenre (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumGenre", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the year this Album was recorded in

Parameters:
Album- the Album object
Returns:
the year the specified album was recorded in
 */
public static java.lang.String GetAlbumYear (Object Album) {
  Object o = sagex.SageAPI.call("GetAlbumYear", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the year this Album was recorded in

Parameters:
Album- the Album object
Returns:
the year the specified album was recorded in
 */
public static java.lang.String GetAlbumYear (UIContext _uicontext,Object Album) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumYear", new Object[] {Album});
  if (o!=null) return (java.lang.String) o;
  return null;
}

}
