package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/FavoriteAPI.html'>FavoriteAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class FavoriteAPI {
/**
Returns true if this Favorite is configured to record both first runs and reruns.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record both first runs AND reruns, false otherwise
 */
public static boolean IsFirstRunsAndReRuns (Object Favorite) {
  Object o = sagex.SageAPI.call("IsFirstRunsAndReRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Favorite is configured to record both first runs and reruns.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record both first runs AND reruns, false otherwise
 */
public static boolean IsFirstRunsAndReRuns (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFirstRunsAndReRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Favorite is configured to record first runs but not reruns.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record first runs only, false otherwise
 */
public static boolean IsFirstRunsOnly (Object Favorite) {
  Object o = sagex.SageAPI.call("IsFirstRunsOnly", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Favorite is configured to record first runs but not reruns.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record first runs only, false otherwise
 */
public static boolean IsFirstRunsOnly (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFirstRunsOnly", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Favorite is configured to record reruns but not first runs.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record reruns only, false otherwise
 */
public static boolean IsReRunsOnly (Object Favorite) {
  Object o = sagex.SageAPI.call("IsReRunsOnly", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Favorite is configured to record reruns but not first runs.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record reruns only, false otherwise
 */
public static boolean IsReRunsOnly (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsReRunsOnly", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Favorite is configured to record first runs (it may or may not record reruns)

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record first runs, false otherwise
 */
public static boolean IsFirstRuns (Object Favorite) {
  Object o = sagex.SageAPI.call("IsFirstRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Favorite is configured to record first runs (it may or may not record reruns)

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record first runs, false otherwise
 */
public static boolean IsFirstRuns (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFirstRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this Favorite is configured to record reruns (it may or may not record first runs)

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record reruns, false otherwise
 */
public static boolean IsReRuns (Object Favorite) {
  Object o = sagex.SageAPI.call("IsReRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this Favorite is configured to record reruns (it may or may not record first runs)

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to record reruns, false otherwise
 */
public static boolean IsReRuns (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsReRuns", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if SageTV is allowed to automatically delete recordings of this
 Favorite when it needs more disk space. If this is false, then SageTV will never automatically
 delete files recorded for this Favorite; the user will have to delete the files themself.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured for auto delete, false otherwise
 */
public static boolean IsAutoDelete (Object Favorite) {
  Object o = sagex.SageAPI.call("IsAutoDelete", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV is allowed to automatically delete recordings of this
 Favorite when it needs more disk space. If this is false, then SageTV will never automatically
 delete files recorded for this Favorite; the user will have to delete the files themself.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured for auto delete, false otherwise
 */
public static boolean IsAutoDelete (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsAutoDelete", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
If an automatic conversion quality is set for this Favorite; then this will return true if
 the original file will be deleted after that conversion is performed

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to delete the original file after automatic conversion
Since:
7.0
 */
public static boolean IsDeleteAfterAutomaticConversion (Object Favorite) {
  Object o = sagex.SageAPI.call("IsDeleteAfterAutomaticConversion", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
If an automatic conversion quality is set for this Favorite; then this will return true if
 the original file will be deleted after that conversion is performed

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is configured to delete the original file after automatic conversion
Since:
7.0
 */
public static boolean IsDeleteAfterAutomaticConversion (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDeleteAfterAutomaticConversion", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if SageTV considers this favorite when performing scheduling.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is enabled, false otherwise
Since:
9.0
 */
public static boolean IsFavoriteEnabled (Object Favorite) {
  Object o = sagex.SageAPI.call("IsFavoriteEnabled", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV considers this favorite when performing scheduling.

Parameters:
Favorite- the Favorite object
Returns:
true if this Favorite is enabled, false otherwise
Since:
9.0
 */
public static boolean IsFavoriteEnabled (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFavoriteEnabled", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the maximum number of recordings that match this Favorite that should be kept on disk. If AutoDelete is
 set to true then SageTV will continue to record new airings of this Favorite as they air, and delete the oldest
 recording on disk if it hits the keep at most limit. If AutoDelete is false then SageTV will stop recording this Favorite
 once it has this many recordings on disk

Parameters:
Favorite- the Favorite object
Returns:
the maximum number of recordings SageTV should keep on disk of this Favorite, 0 if it is unlimited
 */
public static int GetKeepAtMost (Object Favorite) {
  Object o = sagex.SageAPI.call("GetKeepAtMost", new Object[] {Favorite});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the maximum number of recordings that match this Favorite that should be kept on disk. If AutoDelete is
 set to true then SageTV will continue to record new airings of this Favorite as they air, and delete the oldest
 recording on disk if it hits the keep at most limit. If AutoDelete is false then SageTV will stop recording this Favorite
 once it has this many recordings on disk

Parameters:
Favorite- the Favorite object
Returns:
the maximum number of recordings SageTV should keep on disk of this Favorite, 0 if it is unlimited
 */
public static int GetKeepAtMost (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetKeepAtMost", new Object[] {Favorite});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns a String that describes this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for this Favorite
 */
public static java.lang.String GetFavoriteDescription (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteDescription", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String that describes this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for this Favorite
 */
public static java.lang.String GetFavoriteDescription (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteDescription", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String that describes this Favorite in a 'clean' way. Should be used in conjunction with
 GetFavoritePresentationPrefix to create a complete string for presenting a Favorite named uniquely.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for this Favorite
Since:
8.0
 */
public static java.lang.String GetFavoritePresentationName (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoritePresentationName", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String that describes this Favorite in a 'clean' way. Should be used in conjunction with
 GetFavoritePresentationPrefix to create a complete string for presenting a Favorite named uniquely.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for this Favorite
Since:
8.0
 */
public static java.lang.String GetFavoritePresentationName (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoritePresentationName", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String that describes this type of Favorite this is, such as Show, Keyword, Person, etc.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for the type of Favorite
Since:
8.0
 */
public static java.lang.String GetFavoritePresentationPrefix (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoritePresentationPrefix", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String that describes this type of Favorite this is, such as Show, Keyword, Person, etc.

Parameters:
Favorite- the Favorite object
Returns:
a descriptive string for the type of Favorite
Since:
8.0
 */
public static java.lang.String GetFavoritePresentationPrefix (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoritePresentationPrefix", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the title that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the title that an Airing must match to be included in this Favorite, returns the empty string if the title isn't a field that needs to match
 */
public static java.lang.String GetFavoriteTitle (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteTitle", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the title that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the title that an Airing must match to be included in this Favorite, returns the empty string if the title isn't a field that needs to match
 */
public static java.lang.String GetFavoriteTitle (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteTitle", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the category that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the category that an Airing must match to be included in this Favorite, returns the empty string if category isn't a field that needs to match
 */
public static java.lang.String GetFavoriteCategory (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteCategory", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the category that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the category that an Airing must match to be included in this Favorite, returns the empty string if category isn't a field that needs to match
 */
public static java.lang.String GetFavoriteCategory (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteCategory", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the subcategory that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the subcategory that an Airing must match to be included in this Favorite, returns the empty string if subcategory isn't a field that needs to match
 */
public static java.lang.String GetFavoriteSubCategory (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteSubCategory", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the subcategory that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the subcategory that an Airing must match to be included in this Favorite, returns the empty string if subcategory isn't a field that needs to match
 */
public static java.lang.String GetFavoriteSubCategory (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteSubCategory", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the person that an Airing must have to be included in this Favorite. The person may also be restricted by their role in the content.

Parameters:
Favorite- the Favorite object
Returns:
the person that an Airing must have to be included in this Favorite, returns the empty string if person isn't a field that needs to match
 */
public static String GetFavoritePerson (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoritePerson", new Object[] {Favorite});
  if (o!=null) return (String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the person that an Airing must have to be included in this Favorite. The person may also be restricted by their role in the content.

Parameters:
Favorite- the Favorite object
Returns:
the person that an Airing must have to be included in this Favorite, returns the empty string if person isn't a field that needs to match
 */
public static String GetFavoritePerson (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoritePerson", new Object[] {Favorite});
  if (o!=null) return (String) o;
  return null;
}

/**
Returns the rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the rating that an Airing must match to be included in this Favorite, returns the empty string if rating isn't a field that needs to match
 */
public static java.lang.String GetFavoriteRated (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteRated", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the rating that an Airing must match to be included in this Favorite, returns the empty string if rating isn't a field that needs to match
 */
public static java.lang.String GetFavoriteRated (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteRated", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the role that an Airing must have the Favorite Person in to be included in this Favorite. This only applies if a person is set for this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the role that the favorite person for an Airing must have to be included in this Favorite, returns the empty string if role doesn't matter
 */
public static java.lang.String GetFavoritePersonRole (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoritePersonRole", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the role that an Airing must have the Favorite Person in to be included in this Favorite. This only applies if a person is set for this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the role that the favorite person for an Airing must have to be included in this Favorite, returns the empty string if role doesn't matter
 */
public static java.lang.String GetFavoritePersonRole (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoritePersonRole", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the year that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the year that an Airing must match to be included in this Favorite, returns the empty string if year isn't a field that needs to match
 */
public static java.lang.String GetFavoriteYear (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteYear", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the year that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the year that an Airing must match to be included in this Favorite, returns the empty string if year isn't a field that needs to match
 */
public static java.lang.String GetFavoriteYear (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteYear", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the parental rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the parental rating that an Airing must match to be included in this Favorite, returns the empty string if parental rating isn't a field that needs to match
 */
public static java.lang.String GetFavoriteParentalRating (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteParentalRating", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the parental rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the parental rating that an Airing must match to be included in this Favorite, returns the empty string if parental rating isn't a field that needs to match
 */
public static java.lang.String GetFavoriteParentalRating (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteParentalRating", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the channel name (call sign) that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the channel name that an Airing must be on to be included in this Favorite, returns the empty string if channel doesn't matter; for mult-channel favorites this will be a semicolon or comma-delimited list of channel names
 */
public static java.lang.String GetFavoriteChannel (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteChannel", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the channel name (call sign) that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the channel name that an Airing must be on to be included in this Favorite, returns the empty string if channel doesn't matter; for mult-channel favorites this will be a semicolon or comma-delimited list of channel names
 */
public static java.lang.String GetFavoriteChannel (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteChannel", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the keyword string that an Airing must match to be included in this Favorite. This is case insensitive. Double quotes
 can be used to require word to be in a certain order. Otherwise; each individual word is searched for in the Airing's details and must
 match a whole word for the match to succeed.  The * character can be used to match 0 or more characters. The ? character can be used
 to match a single character. Regex is the matching language used for this so any other regex parsing characters besides * and ? can be used.
 All of the fields of the object are searched as part of this.

Parameters:
Favorite- the Favorite object
Returns:
the keyword that an Airing must match to be included in this Favorite, returns the empty string if keyword doesn't matter
 */
public static java.lang.String GetFavoriteKeyword (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteKeyword", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the keyword string that an Airing must match to be included in this Favorite. This is case insensitive. Double quotes
 can be used to require word to be in a certain order. Otherwise; each individual word is searched for in the Airing's details and must
 match a whole word for the match to succeed.  The * character can be used to match 0 or more characters. The ? character can be used
 to match a single character. Regex is the matching language used for this so any other regex parsing characters besides * and ? can be used.
 All of the fields of the object are searched as part of this.

Parameters:
Favorite- the Favorite object
Returns:
the keyword that an Airing must match to be included in this Favorite, returns the empty string if keyword doesn't matter
 */
public static java.lang.String GetFavoriteKeyword (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteKeyword", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the network name that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the network name that an Airing must be on to be included in this Favorite, returns the empty string if network doesn't matter
 */
public static java.lang.String GetFavoriteNetwork (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteNetwork", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the network name that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the network name that an Airing must be on to be included in this Favorite, returns the empty string if network doesn't matter
 */
public static java.lang.String GetFavoriteNetwork (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteNetwork", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the timeslot that an Airing must be in to be included in this Favorite. It just needs to overlap the timeslot.

Parameters:
Favorite- the Favorite object
Returns:
the timeslot that an Airing must be in to be included in this Favorite, returns the empty string if timeslot doesn't matter
 */
public static java.lang.String GetFavoriteTimeslot (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteTimeslot", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the timeslot that an Airing must be in to be included in this Favorite. It just needs to overlap the timeslot.

Parameters:
Favorite- the Favorite object
Returns:
the timeslot that an Airing must be in to be included in this Favorite, returns the empty string if timeslot doesn't matter
 */
public static java.lang.String GetFavoriteTimeslot (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteTimeslot", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the amount of time any recording for this Favorite should start before the actual Airing begins.

Parameters:
Favorite- the Favorite object
Returns:
the amount of time any recording for this Favorite should start before the actual Airing begins, in milliseconds
 */
public static long GetStartPadding (Object Favorite) {
  Object o = sagex.SageAPI.call("GetStartPadding", new Object[] {Favorite});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the amount of time any recording for this Favorite should start before the actual Airing begins.

Parameters:
Favorite- the Favorite object
Returns:
the amount of time any recording for this Favorite should start before the actual Airing begins, in milliseconds
 */
public static long GetStartPadding (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetStartPadding", new Object[] {Favorite});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the amount of time any recording for this Favorite should stop after the actual Airing ends.

Parameters:
Favorite- the Favorite object
Returns:
the amount of time any recording for this Favorite should stop after the actual Airing ends, in milliseconds
 */
public static long GetStopPadding (Object Favorite) {
  Object o = sagex.SageAPI.call("GetStopPadding", new Object[] {Favorite});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the amount of time any recording for this Favorite should stop after the actual Airing ends.

Parameters:
Favorite- the Favorite object
Returns:
the amount of time any recording for this Favorite should stop after the actual Airing ends, in milliseconds
 */
public static long GetStopPadding (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetStopPadding", new Object[] {Favorite});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the name of the recording quality that should be used when recording this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the name of the recording quality that should be used when recording this Favorite, the empty string if the default recording quality should be used
 */
public static java.lang.String GetFavoriteQuality (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteQuality", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the recording quality that should be used when recording this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the name of the recording quality that should be used when recording this Favorite, the empty string if the default recording quality should be used
 */
public static java.lang.String GetFavoriteQuality (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteQuality", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the name of the format that recordings of this Favorite will automatically be converted to when they have completed recording. It will return an empty
 string if automatic conversion is disabled for this Favorite

Parameters:
Favorite- the Favorite object
Returns:
the name of the transcode format that should be used when converting this Favorite, the empty string if no automatic conversion should be done
Since:
7.0
 */
public static java.lang.String GetFavoriteAutomaticConversionFormat (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteAutomaticConversionFormat", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the format that recordings of this Favorite will automatically be converted to when they have completed recording. It will return an empty
 string if automatic conversion is disabled for this Favorite

Parameters:
Favorite- the Favorite object
Returns:
the name of the transcode format that should be used when converting this Favorite, the empty string if no automatic conversion should be done
Since:
7.0
 */
public static java.lang.String GetFavoriteAutomaticConversionFormat (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteAutomaticConversionFormat", new Object[] {Favorite});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the directory that automatic conversions of this favorite should be saved to.
 Returns the empty string when using the same directory the recording is in.

Parameters:
Favorite- the Favorite object
Returns:
the destination directory for the automatic conversions of this Favorite; or null if its the same as the recording directory
Since:
7.0
 */
public static java.io.File GetFavoriteAutomaticConversionDestination (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteAutomaticConversionDestination", new Object[] {Favorite});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the directory that automatic conversions of this favorite should be saved to.
 Returns the empty string when using the same directory the recording is in.

Parameters:
Favorite- the Favorite object
Returns:
the destination directory for the automatic conversions of this Favorite; or null if its the same as the recording directory
Since:
7.0
 */
public static java.io.File GetFavoriteAutomaticConversionDestination (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteAutomaticConversionDestination", new Object[] {Favorite});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Sets the amount of time any recording for this Favorite should start before the actual Airing begins.

Parameters:
Favorite- the Favorite object
StartPadding- the amount of time any recording for this Favorite should start before the actual Airing begins, in milliseconds
 */
public static void SetStartPadding (Object Favorite, long StartPadding) {
   sagex.SageAPI.call("SetStartPadding", new Object[] {Favorite,StartPadding});
}

/**
 * UI Context Aware Call<br>
Sets the amount of time any recording for this Favorite should start before the actual Airing begins.

Parameters:
Favorite- the Favorite object
StartPadding- the amount of time any recording for this Favorite should start before the actual Airing begins, in milliseconds
 */
public static void SetStartPadding (UIContext _uicontext,Object Favorite, long StartPadding) {
   sagex.SageAPI.call(_uicontext, "SetStartPadding", new Object[] {Favorite,StartPadding});
}

/**
Sets the amount of time any recording for this Favorite should stop after the actual Airing ends.

Parameters:
Favorite- the Favorite object
StopPadding- the amount of time any recording for this Favorite should stop after the actual Airing ends, in milliseconds
 */
public static void SetStopPadding (Object Favorite, long StopPadding) {
   sagex.SageAPI.call("SetStopPadding", new Object[] {Favorite,StopPadding});
}

/**
 * UI Context Aware Call<br>
Sets the amount of time any recording for this Favorite should stop after the actual Airing ends.

Parameters:
Favorite- the Favorite object
StopPadding- the amount of time any recording for this Favorite should stop after the actual Airing ends, in milliseconds
 */
public static void SetStopPadding (UIContext _uicontext,Object Favorite, long StopPadding) {
   sagex.SageAPI.call(_uicontext, "SetStopPadding", new Object[] {Favorite,StopPadding});
}

/**
Sets the name of the recording quality that should be used when recording this Favorite.

Parameters:
Favorite- the Favorite object
Quality- the name of the recording quality that should be used when recording this Favorite, the empty string if the default recording quality should be used
 */
public static void SetFavoriteQuality (Object Favorite, java.lang.String Quality) {
   sagex.SageAPI.call("SetFavoriteQuality", new Object[] {Favorite,Quality});
}

/**
 * UI Context Aware Call<br>
Sets the name of the recording quality that should be used when recording this Favorite.

Parameters:
Favorite- the Favorite object
Quality- the name of the recording quality that should be used when recording this Favorite, the empty string if the default recording quality should be used
 */
public static void SetFavoriteQuality (UIContext _uicontext,Object Favorite, java.lang.String Quality) {
   sagex.SageAPI.call(_uicontext, "SetFavoriteQuality", new Object[] {Favorite,Quality});
}

/**
Sets the name of the format to transcode this Favorite to after a recording has been completed. Format names should come fromGetTranscodeFormats()
.
 Use the empty string or null to disable automatic conversion for this Favorite.

Parameters:
Favorite- the Favorite object
Format- the name of the transcode format to use when converting recordings of this Favorite; the empty string or null to disable automatic conversion
Since:
7.0
 */
public static void SetFavoriteAutomaticConversionFormat (Object Favorite, java.lang.String Format) {
   sagex.SageAPI.call("SetFavoriteAutomaticConversionFormat", new Object[] {Favorite,Format});
}

/**
 * UI Context Aware Call<br>
Sets the name of the format to transcode this Favorite to after a recording has been completed. Format names should come fromGetTranscodeFormats()
.
 Use the empty string or null to disable automatic conversion for this Favorite.

Parameters:
Favorite- the Favorite object
Format- the name of the transcode format to use when converting recordings of this Favorite; the empty string or null to disable automatic conversion
Since:
7.0
 */
public static void SetFavoriteAutomaticConversionFormat (UIContext _uicontext,Object Favorite, java.lang.String Format) {
   sagex.SageAPI.call(_uicontext, "SetFavoriteAutomaticConversionFormat", new Object[] {Favorite,Format});
}

/**
Sets the directory that automatic conversions of this favorite should be saved to.
 Use null to use the same directory the recording is in.

Parameters:
Favorite- the Favorite object
Folder- the destination directory for the automatic conversions of this Favorite; null to use the same directory as the recording directory
Since:
7.0
 */
public static void SetFavoriteAutomaticConversionDestination (Object Favorite, java.io.File Folder) {
   sagex.SageAPI.call("SetFavoriteAutomaticConversionDestination", new Object[] {Favorite,Folder});
}

/**
 * UI Context Aware Call<br>
Sets the directory that automatic conversions of this favorite should be saved to.
 Use null to use the same directory the recording is in.

Parameters:
Favorite- the Favorite object
Folder- the destination directory for the automatic conversions of this Favorite; null to use the same directory as the recording directory
Since:
7.0
 */
public static void SetFavoriteAutomaticConversionDestination (UIContext _uicontext,Object Favorite, java.io.File Folder) {
   sagex.SageAPI.call(_uicontext, "SetFavoriteAutomaticConversionDestination", new Object[] {Favorite,Folder});
}

/**
Establishes a priority of one Favorite over another. This will take undo any previous prioritization that it directly conflicts with.
 Favorites with a higher priority will be recorded over ones with a lower priority if there's a case where both cannot be recorded at once.

Parameters:
HigherPriorityFavorite- the Favorite object that you wish to make a higher priority than the other specified Favorite object
LowerPriorityFavorite- the Favorite object that you wish to make a lower priority than the other specified Favorite object
 */
public static void CreateFavoritePriority (Object HigherPriorityFavorite, Object LowerPriorityFavorite) {
   sagex.SageAPI.call("CreateFavoritePriority", new Object[] {HigherPriorityFavorite,LowerPriorityFavorite});
}

/**
 * UI Context Aware Call<br>
Establishes a priority of one Favorite over another. This will take undo any previous prioritization that it directly conflicts with.
 Favorites with a higher priority will be recorded over ones with a lower priority if there's a case where both cannot be recorded at once.

Parameters:
HigherPriorityFavorite- the Favorite object that you wish to make a higher priority than the other specified Favorite object
LowerPriorityFavorite- the Favorite object that you wish to make a lower priority than the other specified Favorite object
 */
public static void CreateFavoritePriority (UIContext _uicontext,Object HigherPriorityFavorite, Object LowerPriorityFavorite) {
   sagex.SageAPI.call(_uicontext, "CreateFavoritePriority", new Object[] {HigherPriorityFavorite,LowerPriorityFavorite});
}

/**
Confirms that the user is aware that a manual recording they've selected creates a conflict with this favorite recording. This is purely
 for notifcation purposes.

Parameters:
ManualRecordAiring- the manual record Airing object to confirm the recording priority of
FavoriteAiring- the Airing for the Favorite that won't be recorded due to the manual record
 */
public static void ConfirmManualRecordOverFavoritePriority (Object ManualRecordAiring, Object FavoriteAiring) {
   sagex.SageAPI.call("ConfirmManualRecordOverFavoritePriority", new Object[] {ManualRecordAiring,FavoriteAiring});
}

/**
 * UI Context Aware Call<br>
Confirms that the user is aware that a manual recording they've selected creates a conflict with this favorite recording. This is purely
 for notifcation purposes.

Parameters:
ManualRecordAiring- the manual record Airing object to confirm the recording priority of
FavoriteAiring- the Airing for the Favorite that won't be recorded due to the manual record
 */
public static void ConfirmManualRecordOverFavoritePriority (UIContext _uicontext,Object ManualRecordAiring, Object FavoriteAiring) {
   sagex.SageAPI.call(_uicontext, "ConfirmManualRecordOverFavoritePriority", new Object[] {ManualRecordAiring,FavoriteAiring});
}

/**
Sets whether or not SageTV is allowed to automatically delete recordings of this
 Favorite when it needs more disk space. If this is true, then SageTV will never automatically
 delete files recorded for this Favorite; the user will have to delete the files themself.

Parameters:
Favorite- the Favorite object
DontAutoDelete- true if this Favorite is configured to NOT auto delete, false otherwise
 */
public static void SetDontAutodelete (Object Favorite, boolean DontAutoDelete) {
   sagex.SageAPI.call("SetDontAutodelete", new Object[] {Favorite,DontAutoDelete});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV is allowed to automatically delete recordings of this
 Favorite when it needs more disk space. If this is true, then SageTV will never automatically
 delete files recorded for this Favorite; the user will have to delete the files themself.

Parameters:
Favorite- the Favorite object
DontAutoDelete- true if this Favorite is configured to NOT auto delete, false otherwise
 */
public static void SetDontAutodelete (UIContext _uicontext,Object Favorite, boolean DontAutoDelete) {
   sagex.SageAPI.call(_uicontext, "SetDontAutodelete", new Object[] {Favorite,DontAutoDelete});
}

/**
Sets whether or not SageTV should delete the original file after doing an automatic conversion
 for this Favorite

Parameters:
Favorite- the Favorite object
DeleteAfterAutomaticConversion- true if this Favorite is configured to delete the source file after automatic conversion
Since:
7.0
 */
public static void SetDeleteAfterAutomaticConversion (Object Favorite, boolean DeleteAfterAutomaticConversion) {
   sagex.SageAPI.call("SetDeleteAfterAutomaticConversion", new Object[] {Favorite,DeleteAfterAutomaticConversion});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV should delete the original file after doing an automatic conversion
 for this Favorite

Parameters:
Favorite- the Favorite object
DeleteAfterAutomaticConversion- true if this Favorite is configured to delete the source file after automatic conversion
Since:
7.0
 */
public static void SetDeleteAfterAutomaticConversion (UIContext _uicontext,Object Favorite, boolean DeleteAfterAutomaticConversion) {
   sagex.SageAPI.call(_uicontext, "SetDeleteAfterAutomaticConversion", new Object[] {Favorite,DeleteAfterAutomaticConversion});
}

/**
Sets the maximum number of recordings that match this Favorite that should be kept on disk. If AutoDelete is
 set to true then SageTV will continue to record new airings of this Favorite as they air, and delete the oldest
 recording on disk if it hits the keep at most limit. If AutoDelete is false then SageTV will stop recording this Favorite
 once it has this many recordings on disk

Parameters:
Favorite- the Favorite object
NumberToKeep- the maximum number of recordings SageTV should keep on disk of this Favorite, 0 if it is unlimited
 */
public static void SetKeepAtMost (Object Favorite, int NumberToKeep) {
   sagex.SageAPI.call("SetKeepAtMost", new Object[] {Favorite,NumberToKeep});
}

/**
 * UI Context Aware Call<br>
Sets the maximum number of recordings that match this Favorite that should be kept on disk. If AutoDelete is
 set to true then SageTV will continue to record new airings of this Favorite as they air, and delete the oldest
 recording on disk if it hits the keep at most limit. If AutoDelete is false then SageTV will stop recording this Favorite
 once it has this many recordings on disk

Parameters:
Favorite- the Favorite object
NumberToKeep- the maximum number of recordings SageTV should keep on disk of this Favorite, 0 if it is unlimited
 */
public static void SetKeepAtMost (UIContext _uicontext,Object Favorite, int NumberToKeep) {
   sagex.SageAPI.call(_uicontext, "SetKeepAtMost", new Object[] {Favorite,NumberToKeep});
}

/**
Sets whether first runs, reruns or both types of airings should be recorded for this Favorite. If both arguments
 are false, SageTV will record both first runs and reruns.

Parameters:
Favorite- the Favorite object
FirstRuns- true if first runs should be recorded with this favorite, false otherwise
ReRuns- true if reruns should be recorded with this Favorite, false otherwise
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetRunStatus (Object Favorite, boolean FirstRuns, boolean ReRuns) {
  Object o = sagex.SageAPI.call("SetRunStatus", new Object[] {Favorite,FirstRuns,ReRuns});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets whether first runs, reruns or both types of airings should be recorded for this Favorite. If both arguments
 are false, SageTV will record both first runs and reruns.

Parameters:
Favorite- the Favorite object
FirstRuns- true if first runs should be recorded with this favorite, false otherwise
ReRuns- true if reruns should be recorded with this Favorite, false otherwise
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetRunStatus (UIContext _uicontext,Object Favorite, boolean FirstRuns, boolean ReRuns) {
  Object o = sagex.SageAPI.call(_uicontext, "SetRunStatus", new Object[] {Favorite,FirstRuns,ReRuns});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the title that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteTitle (Object Favorite, java.lang.String Title) {
  Object o = sagex.SageAPI.call("SetFavoriteTitle", new Object[] {Favorite,Title});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the title that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteTitle (UIContext _uicontext,Object Favorite, java.lang.String Title) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteTitle", new Object[] {Favorite,Title});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the category and optionally the subcategory that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if the category isn't a field that needs to match
SubCategory- the category that an Airing must match to be included in this Favorite, use the empty string the subcategory doesn't need to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteCategories (Object Favorite, java.lang.String Category, java.lang.String SubCategory) {
  Object o = sagex.SageAPI.call("SetFavoriteCategories", new Object[] {Favorite,Category,SubCategory});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the category and optionally the subcategory that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if the category isn't a field that needs to match
SubCategory- the category that an Airing must match to be included in this Favorite, use the empty string the subcategory doesn't need to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteCategories (UIContext _uicontext,Object Favorite, java.lang.String Category, java.lang.String SubCategory) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteCategories", new Object[] {Favorite,Category,SubCategory});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets a person (and optionally the role the person must appear in) that must be in an Airing for it to be included in this Favorite

Parameters:
Favorite- the Favorite object
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
Role- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoritePerson (Object Favorite, Object Person, java.lang.String Role) {
  Object o = sagex.SageAPI.call("SetFavoritePerson", new Object[] {Favorite,Person,Role});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets a person (and optionally the role the person must appear in) that must be in an Airing for it to be included in this Favorite

Parameters:
Favorite- the Favorite object
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
Role- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoritePerson (UIContext _uicontext,Object Favorite, Object Person, java.lang.String Role) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoritePerson", new Object[] {Favorite,Person,Role});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteRated (Object Favorite, java.lang.String Rated) {
  Object o = sagex.SageAPI.call("SetFavoriteRated", new Object[] {Favorite,Rated});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteRated (UIContext _uicontext,Object Favorite, java.lang.String Rated) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteRated", new Object[] {Favorite,Rated});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the year that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteYear (Object Favorite, java.lang.String Year) {
  Object o = sagex.SageAPI.call("SetFavoriteYear", new Object[] {Favorite,Year});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the year that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteYear (UIContext _uicontext,Object Favorite, java.lang.String Year) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteYear", new Object[] {Favorite,Year});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the parental rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteParentalRating (Object Favorite, java.lang.String ParentalRating) {
  Object o = sagex.SageAPI.call("SetFavoriteParentalRating", new Object[] {Favorite,ParentalRating});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the parental rating that an Airing must match to be included in this Favorite.

Parameters:
Favorite- the Favorite object
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteParentalRating (UIContext _uicontext,Object Favorite, java.lang.String ParentalRating) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteParentalRating", new Object[] {Favorite,ParentalRating});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the keyword string that an Airing must match to be included in this Favorite. This is case insensitive. Double quotes
 can be used to require word to be in a certain order. Otherwise; each individual word is searched for in the Airing's details and must
 match a whole word for the match to succeed.  The * character can be used to match 0 or more characters. The ? character can be used
 to match a single character. Regex is the matching language used for this so any other regex parsing characters besides * and ? can be used.
 All of the fields of the object are searched as part of this.

Parameters:
Favorite- the Favorite object
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteKeyword (Object Favorite, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call("SetFavoriteKeyword", new Object[] {Favorite,Keyword});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the keyword string that an Airing must match to be included in this Favorite. This is case insensitive. Double quotes
 can be used to require word to be in a certain order. Otherwise; each individual word is searched for in the Airing's details and must
 match a whole word for the match to succeed.  The * character can be used to match 0 or more characters. The ? character can be used
 to match a single character. Regex is the matching language used for this so any other regex parsing characters besides * and ? can be used.
 All of the fields of the object are searched as part of this.

Parameters:
Favorite- the Favorite object
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteKeyword (UIContext _uicontext,Object Favorite, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteKeyword", new Object[] {Favorite,Keyword});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the channel name (call sign) that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Channel- the channel name (String) or Channel object (Channel) that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for mult-channel favorites
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteChannel (Object Favorite, java.lang.Object Channel) {
  Object o = sagex.SageAPI.call("SetFavoriteChannel", new Object[] {Favorite,Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the channel name (call sign) that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Channel- the channel name (String) or Channel object (Channel) that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for mult-channel favorites
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteChannel (UIContext _uicontext,Object Favorite, java.lang.Object Channel) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteChannel", new Object[] {Favorite,Channel});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the network name that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteNetwork (Object Favorite, java.lang.String Network) {
  Object o = sagex.SageAPI.call("SetFavoriteNetwork", new Object[] {Favorite,Network});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the network name that an Airing must be on to be included in this Favorite.

Parameters:
Favorite- the Favorite object
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteNetwork (UIContext _uicontext,Object Favorite, java.lang.String Network) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteNetwork", new Object[] {Favorite,Network});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the timeslot that an Airing must be in to be included in this Favorite. It just needs to overlap the timeslot.

Parameters:
Favorite- the Favorite object
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00).
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteTimeslot (Object Favorite, java.lang.String Timeslot) {
  Object o = sagex.SageAPI.call("SetFavoriteTimeslot", new Object[] {Favorite,Timeslot});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the timeslot that an Airing must be in to be included in this Favorite. It just needs to overlap the timeslot.

Parameters:
Favorite- the Favorite object
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00).
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Returns:
true if the change was successful, false if the change would alter this Favorite to be identical to an existing Favorite or if the user doesn't have permissions to make this change
 */
public static boolean SetFavoriteTimeslot (UIContext _uicontext,Object Favorite, java.lang.String Timeslot) {
  Object o = sagex.SageAPI.call(_uicontext, "SetFavoriteTimeslot", new Object[] {Favorite,Timeslot});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not SageTV will use this favorite when scheduling recordings

Parameters:
Favorite- the Favorite object
Enabled- true if this Favorite is to be used for scheduling, false otherwise
Since:
9.0
 */
public static void SetFavoriteEnabled (Object Favorite, boolean Enabled) {
   sagex.SageAPI.call("SetFavoriteEnabled", new Object[] {Favorite,Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV will use this favorite when scheduling recordings

Parameters:
Favorite- the Favorite object
Enabled- true if this Favorite is to be used for scheduling, false otherwise
Since:
9.0
 */
public static void SetFavoriteEnabled (UIContext _uicontext,Object Favorite, boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetFavoriteEnabled", new Object[] {Favorite,Enabled});
}

/**
Gets the Favorite that matches this Airing if one exists.

Parameters:
Airing- the Airing object to get a matching Favorite for
Returns:
a Favorite object that matches this Airing or null if there is no such Favorite
 */
public static Object GetFavoriteForAiring (Object Airing) {
  Object o = sagex.SageAPI.call("GetFavoriteForAiring", new Object[] {Airing});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the Favorite that matches this Airing if one exists.

Parameters:
Airing- the Airing object to get a matching Favorite for
Returns:
a Favorite object that matches this Airing or null if there is no such Favorite
 */
public static Object GetFavoriteForAiring (UIContext _uicontext,Object Airing) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteForAiring", new Object[] {Airing});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets the list of all Favorites that match this Airing

Parameters:
Airing- the Airing object to get the matching Favorites for
Returns:
a Favorite array who's elements all match this Airing
Since:
8.0
 */
public static Object[] GetFavoritesForAiring (Object Airing) {
  return (Object[]) sagex.SageAPI.call("GetFavoritesForAiring", new Object[] {Airing});
}

/**
 * UI Context Aware Call<br>
Gets the list of all Favorites that match this Airing

Parameters:
Airing- the Airing object to get the matching Favorites for
Returns:
a Favorite array who's elements all match this Airing
Since:
8.0
 */
public static Object[] GetFavoritesForAiring (UIContext _uicontext,Object Airing) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetFavoritesForAiring", new Object[] {Airing});
}

/**
Returns true if the specified Favorite object matches the specified Airing object.

Parameters:
Favorite- the Favorite object to test
Airing- the Airing object to test
Returns:
true if the specified Favorite matches the specified Airing, false otherwise
 */
public static boolean DoesFavoriteMatchAiring (Object Favorite, Object Airing) {
  Object o = sagex.SageAPI.call("DoesFavoriteMatchAiring", new Object[] {Favorite,Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Favorite object matches the specified Airing object.

Parameters:
Favorite- the Favorite object to test
Airing- the Airing object to test
Returns:
true if the specified Favorite matches the specified Airing, false otherwise
 */
public static boolean DoesFavoriteMatchAiring (UIContext _uicontext,Object Favorite, Object Airing) {
  Object o = sagex.SageAPI.call(_uicontext, "DoesFavoriteMatchAiring", new Object[] {Favorite,Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the argument is a Favorite object, false otherwise

Parameters:
Favorite- an object to test to see if its an instance of Favorite
Returns:
true if the argument is an instance of a Favorite object, false otherwise
 */
public static boolean IsFavoriteObject (java.lang.Object Favorite) {
  Object o = sagex.SageAPI.call("IsFavoriteObject", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the argument is a Favorite object, false otherwise

Parameters:
Favorite- an object to test to see if its an instance of Favorite
Returns:
true if the argument is an instance of a Favorite object, false otherwise
 */
public static boolean IsFavoriteObject (UIContext _uicontext,java.lang.Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFavoriteObject", new Object[] {Favorite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Updates all of the fields of a Favorite that can be used to match. The rules for the arguments are specified in the
 individual methods that allow settting of the corresponding parameter.

Parameters:
Favorite- the Favorite object to update
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
FirstRuns- true if this Favorite should match First Runs, false otherwise
ReRuns- true if this Favorite should match ReRuns, false otherwise
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if category isn't a field that needs to match
SubCategory- the subcategory that an Airing must match to be included in this Favorite, use the empty string or null if subcategory isn't a field that needs to match
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
RoleForPerson- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
ChannelCallSign- the channel name that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for mult-channel favorites
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00)
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
the updated Favorite object, or if the changes would make this Favorite the same as an existing Favorite, the other existing Favorite is returned, null is returned if there was no valid criteria specified in the arguments
 */
public static Object UpdateFavorite (Object Favorite, java.lang.String Title, boolean FirstRuns, boolean ReRuns, java.lang.String Category, java.lang.String SubCategory, Object Person, java.lang.String RoleForPerson, java.lang.String Rated, java.lang.String Year, java.lang.String ParentalRating, java.lang.String Network, java.lang.String ChannelCallSign, java.lang.String Timeslot, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call("UpdateFavorite", new Object[] {Favorite,Title,FirstRuns,ReRuns,Category,SubCategory,Person,RoleForPerson,Rated,Year,ParentalRating,Network,ChannelCallSign,Timeslot,Keyword});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Updates all of the fields of a Favorite that can be used to match. The rules for the arguments are specified in the
 individual methods that allow settting of the corresponding parameter.

Parameters:
Favorite- the Favorite object to update
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
FirstRuns- true if this Favorite should match First Runs, false otherwise
ReRuns- true if this Favorite should match ReRuns, false otherwise
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if category isn't a field that needs to match
SubCategory- the subcategory that an Airing must match to be included in this Favorite, use the empty string or null if subcategory isn't a field that needs to match
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
RoleForPerson- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
ChannelCallSign- the channel name that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for mult-channel favorites
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00)
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
the updated Favorite object, or if the changes would make this Favorite the same as an existing Favorite, the other existing Favorite is returned, null is returned if there was no valid criteria specified in the arguments
 */
public static Object UpdateFavorite (UIContext _uicontext,Object Favorite, java.lang.String Title, boolean FirstRuns, boolean ReRuns, java.lang.String Category, java.lang.String SubCategory, Object Person, java.lang.String RoleForPerson, java.lang.String Rated, java.lang.String Year, java.lang.String ParentalRating, java.lang.String Network, java.lang.String ChannelCallSign, java.lang.String Timeslot, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call(_uicontext, "UpdateFavorite", new Object[] {Favorite,Title,FirstRuns,ReRuns,Category,SubCategory,Person,RoleForPerson,Rated,Year,ParentalRating,Network,ChannelCallSign,Timeslot,Keyword});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a list of all of the Airings in the database that match this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the list of Airings in the DB that match this Favorite
 */
public static Object[] GetFavoriteAirings (Object Favorite) {
  return (Object[]) sagex.SageAPI.call("GetFavoriteAirings", new Object[] {Favorite});
}

/**
 * UI Context Aware Call<br>
Returns a list of all of the Airings in the database that match this Favorite.

Parameters:
Favorite- the Favorite object
Returns:
the list of Airings in the DB that match this Favorite
 */
public static Object[] GetFavoriteAirings (UIContext _uicontext,Object Favorite) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetFavoriteAirings", new Object[] {Favorite});
}

/**
Gets a unique ID for this Favorite which can be used withGetFavoriteForID()
for retrieving the object later.

Parameters:
Favorite- the Favorite object
Returns:
the unique ID for this Favorite
 */
public static int GetFavoriteID (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteID", new Object[] {Favorite});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets a unique ID for this Favorite which can be used withGetFavoriteForID()
for retrieving the object later.

Parameters:
Favorite- the Favorite object
Returns:
the unique ID for this Favorite
 */
public static int GetFavoriteID (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteID", new Object[] {Favorite});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the Favorite object with the corresponding ID from the database. Use withGetFavoriteID()


Parameters:
FavoriteID- the ID to look up in the DB for a Favorite object
Returns:
the Favorite object with the specified ID if it exists, null otherwise
 */
public static Object GetFavoriteForID (int FavoriteID) {
  Object o = sagex.SageAPI.call("GetFavoriteForID", new Object[] {FavoriteID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the Favorite object with the corresponding ID from the database. Use withGetFavoriteID()


Parameters:
FavoriteID- the ID to look up in the DB for a Favorite object
Returns:
the Favorite object with the specified ID if it exists, null otherwise
 */
public static Object GetFavoriteForID (UIContext _uicontext,int FavoriteID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteForID", new Object[] {FavoriteID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets all of the Favorite objects from the database

Returns:
all of the Favorite objects in the database
 */
public static Object[] GetFavorites () {
  return (Object[]) sagex.SageAPI.call("GetFavorites", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets all of the Favorite objects from the database

Returns:
all of the Favorite objects in the database
 */
public static Object[] GetFavorites (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetFavorites", (Object[])null);
}

/**
Removes a Favorite object from the database. Airings matching this Favorite will not necesarilly be automatically recorded anymore (intelligent recording may still record them)

Parameters:
Favorite- the Favorite object to remove
 */
public static void RemoveFavorite (Object Favorite) {
   sagex.SageAPI.call("RemoveFavorite", new Object[] {Favorite});
}

/**
 * UI Context Aware Call<br>
Removes a Favorite object from the database. Airings matching this Favorite will not necesarilly be automatically recorded anymore (intelligent recording may still record them)

Parameters:
Favorite- the Favorite object to remove
 */
public static void RemoveFavorite (UIContext _uicontext,Object Favorite) {
   sagex.SageAPI.call(_uicontext, "RemoveFavorite", new Object[] {Favorite});
}

/**
Creates a new Favorite object in SageTV. Airings that match this Favorite will be recorded and saved into the SageTV Recordings.

Parameters:
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
FirstRuns- true if this Favorite should match First Runs, false otherwise
ReRuns- true if this Favorite should match ReRuns, false otherwise (if both FirstRuns and ReRuns are false, then it will match both)
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if category isn't a field that needs to match
SubCategory- the subcategory that an Airing must match to be included in this Favorite, use the empty string or null if subcategory isn't a field that needs to match
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
RoleForPerson- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
ChannelCallSign- the channel name that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for multi-channel favorites
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00)
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
the newly created Favorite object, null is returned if there was no valid criteria specified in the arguments
 */
public static Object AddFavorite (java.lang.String Title, boolean FirstRuns, boolean ReRuns, java.lang.String Category, java.lang.String SubCategory, Object Person, java.lang.String RoleForPerson, java.lang.String Rated, java.lang.String Year, java.lang.String ParentalRating, java.lang.String Network, java.lang.String ChannelCallSign, java.lang.String Timeslot, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call("AddFavorite", new Object[] {Title,FirstRuns,ReRuns,Category,SubCategory,Person,RoleForPerson,Rated,Year,ParentalRating,Network,ChannelCallSign,Timeslot,Keyword});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a new Favorite object in SageTV. Airings that match this Favorite will be recorded and saved into the SageTV Recordings.

Parameters:
Title- the title that an Airing must match to be included in this Favorite, use the empty string or null if the title isn't a field that needs to match
FirstRuns- true if this Favorite should match First Runs, false otherwise
ReRuns- true if this Favorite should match ReRuns, false otherwise (if both FirstRuns and ReRuns are false, then it will match both)
Category- the category that an Airing must match to be included in this Favorite, use the empty string or null if category isn't a field that needs to match
SubCategory- the subcategory that an Airing must match to be included in this Favorite, use the empty string or null if subcategory isn't a field that needs to match
Person- the name of the person that needs to be included in an Airing for it to match this Favorite, use the empty string or null if person doesn't need to match
RoleForPerson- the name of the role the corresponding person needs to be in, or the emptry string or null if role doesn't matter
Rated- the rating that an Airing must match to be included in this Favorite, use the empty string or null if rating isn't a field that needs to match
Year- the year that an Airing must match to be included in this Favorite, use the empty string or null if year isn't a field that needs to match
ParentalRating- the parental rating that an Airing must match to be included in this Favorite, use the empty string or null if parental rating isn't a field that needs to match
Network- the network name that an Airing must be on to be included in this Favorite, use null or the empty string if network doesn't matter
ChannelCallSign- the channel name that an Airing must be on to be included in this Favorite, use null or the empty string if channel doesn't matter; you may also use a semicolon or comma-delimited list of channel names for multi-channel favorites
Timeslot- the timeslot that an Airing must be in to be included in this Favorite, use null or the empty string if timeslot doesn't matter.
         The timeslot should be in one of three formats: 1) Day Time, 2) Day, 3) Time. Where Day is a day of the week, and Time is an
         hour of the day such as 3pm or 8:00 (if the user's locale uses am/pm then it'll be like 3pm, otherwise it'll use like 8:00)
         Multiple timeslots are allowed and should be sent as a semicolon delimited list; an Airing only needs to overlap one of the timeslots to match the Favorite then.
                   Multiple timeslots must also all be of the same type (i.e. all DayTime, all Day or all Time).
Keyword- the keyword that an Airing must match to be included in this Favorite, use the empty string or null if keyword doesn't matter
Returns:
the newly created Favorite object, null is returned if there was no valid criteria specified in the arguments
 */
public static Object AddFavorite (UIContext _uicontext,java.lang.String Title, boolean FirstRuns, boolean ReRuns, java.lang.String Category, java.lang.String SubCategory, Object Person, java.lang.String RoleForPerson, java.lang.String Rated, java.lang.String Year, java.lang.String ParentalRating, java.lang.String Network, java.lang.String ChannelCallSign, java.lang.String Timeslot, java.lang.String Keyword) {
  Object o = sagex.SageAPI.call(_uicontext, "AddFavorite", new Object[] {Title,FirstRuns,ReRuns,Category,SubCategory,Person,RoleForPerson,Rated,Year,ParentalRating,Network,ChannelCallSign,Timeslot,Keyword});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a property value for a specified Favorite. This must have been set using SetFavoriteProperty.
 Returns the empty string when the property is undefined.

Parameters:
Favorite- the Favorite object
PropertyName- the name of the property
Returns:
the property value for the specified Favorite, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetFavoriteProperty (Object Favorite, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("GetFavoriteProperty", new Object[] {Favorite,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a property value for a specified Favorite. This must have been set using SetFavoriteProperty.
 Returns the empty string when the property is undefined.

Parameters:
Favorite- the Favorite object
PropertyName- the name of the property
Returns:
the property value for the specified Favorite, or the empty string if it is not defined
Since:
7.0
 */
public static java.lang.String GetFavoriteProperty (UIContext _uicontext,Object Favorite, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteProperty", new Object[] {Favorite,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets a property for this Favorite. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this Favorite. This only impacts the return values from GetFavoriteProperty and has no other side effects.

Parameters:
Favorite- the Favorite object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetFavoriteProperty (Object Favorite, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetFavoriteProperty", new Object[] {Favorite,PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets a property for this Favorite. This can be any name/value combination (but the name cannot be null). If the value is null;
 then the specified property will be removed from this Favorite. This only impacts the return values from GetFavoriteProperty and has no other side effects.

Parameters:
Favorite- the Favorite object
PropertyName- the name of the property
PropertyValue- the value of the property
Since:
7.0
 */
public static void SetFavoriteProperty (UIContext _uicontext,Object Favorite, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetFavoriteProperty", new Object[] {Favorite,PropertyName,PropertyValue});
}

/**
Returns a java.util.Properties object that has all of the user-set properties for this Favorite in it.

Parameters:
Favorite- the Favorite object
Returns:
a java.util.Properties object that has all of the user-set properties for this Favorite in it; this is a copy of the original one so it is safe to modify it
Since:
7.1
 */
public static java.util.Properties GetFavoriteProperties (Object Favorite) {
  Object o = sagex.SageAPI.call("GetFavoriteProperties", new Object[] {Favorite});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a java.util.Properties object that has all of the user-set properties for this Favorite in it.

Parameters:
Favorite- the Favorite object
Returns:
a java.util.Properties object that has all of the user-set properties for this Favorite in it; this is a copy of the original one so it is safe to modify it
Since:
7.1
 */
public static java.util.Properties GetFavoriteProperties (UIContext _uicontext,Object Favorite) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFavoriteProperties", new Object[] {Favorite});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

}
