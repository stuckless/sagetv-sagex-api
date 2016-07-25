package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 7:30 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/ShowAPI.html'>ShowAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class ShowAPI {
/**
If this is true, then two Airings that both represent this Show will contain the same content.
 If this is false then it means the EPG metadata for the content is 'generic' two different Airings
 each with this Show for its metadata may actually represent different content

Parameters:
Show- the Show object
Returns:
true if all Airings of this Show represent the same content, false otherwise
 */
public static boolean IsShowEPGDataUnique (Object Show) {
  Object o = sagex.SageAPI.call("IsShowEPGDataUnique", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
If this is true, then two Airings that both represent this Show will contain the same content.
 If this is false then it means the EPG metadata for the content is 'generic' two different Airings
 each with this Show for its metadata may actually represent different content

Parameters:
Show- the Show object
Returns:
true if all Airings of this Show represent the same content, false otherwise
 */
public static boolean IsShowEPGDataUnique (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "IsShowEPGDataUnique", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the miscellaneous metadata for this Show. This includes things such as
 the star rating for a movie, the studio a movie was produced at, etc.

Parameters:
Show- the Show object
Returns:
the miscellaneous metadata for this Show
 */
public static java.lang.String GetShowMisc (Object Show) {
  Object o = sagex.SageAPI.call("GetShowMisc", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the miscellaneous metadata for this Show. This includes things such as
 the star rating for a movie, the studio a movie was produced at, etc.

Parameters:
Show- the Show object
Returns:
the miscellaneous metadata for this Show
 */
public static java.lang.String GetShowMisc (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowMisc", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the category for the specified Show. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the category for the Show
 */
public static java.lang.String GetShowCategory (Object Show) {
  Object o = sagex.SageAPI.call("GetShowCategory", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the category for the specified Show. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the category for the Show
 */
public static java.lang.String GetShowCategory (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowCategory", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the subcategory for the specified Show

Parameters:
Show- the Show object
Returns:
the subcategory for the Show
 */
public static java.lang.String GetShowSubCategory (Object Show) {
  Object o = sagex.SageAPI.call("GetShowSubCategory", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the subcategory for the specified Show

Parameters:
Show- the Show object
Returns:
the subcategory for the Show
 */
public static java.lang.String GetShowSubCategory (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowSubCategory", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String of categories for the Show, separated by '/' if there are multiple levels of categories. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the categories for the Show
Since:
7.1
 */
public static java.lang.String GetShowCategoriesString (Object Show) {
  Object o = sagex.SageAPI.call("GetShowCategoriesString", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String of categories for the Show, separated by '/' if there are multiple levels of categories. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the categories for the Show
Since:
7.1
 */
public static java.lang.String GetShowCategoriesString (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowCategoriesString", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String of categories for the Show, separated by the specified delimiter if there are multiple levels of categories. For music files, this will be the genre.

Parameters:
Show- the Show object
Delimiter- the string to use to separate multiple categories
Returns:
the categories for the Show
Since:
8.0
 */
public static java.lang.String GetShowCategoriesString (Object Show, java.lang.String Delimiter) {
  Object o = sagex.SageAPI.call("GetShowCategoriesString", new Object[] {Show,Delimiter});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String of categories for the Show, separated by the specified delimiter if there are multiple levels of categories. For music files, this will be the genre.

Parameters:
Show- the Show object
Delimiter- the string to use to separate multiple categories
Returns:
the categories for the Show
Since:
8.0
 */
public static java.lang.String GetShowCategoriesString (UIContext _uicontext,Object Show, java.lang.String Delimiter) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowCategoriesString", new Object[] {Show,Delimiter});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String array of categories for the Show. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the categories for the Show
Since:
7.1
 */
public static java.lang.String[] GetShowCategoriesList (Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call("GetShowCategoriesList", new Object[] {Show});
}

/**
 * UI Context Aware Call<br>
Returns a String array of categories for the Show. For music files, this will be the genre.

Parameters:
Show- the Show object
Returns:
the categories for the Show
Since:
7.1
 */
public static java.lang.String[] GetShowCategoriesList (UIContext _uicontext,Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetShowCategoriesList", new Object[] {Show});
}

/**
Returns the description for the specified Show

Parameters:
Show- the Show object
Returns:
the desccription for the Show
 */
public static java.lang.String GetShowDescription (Object Show) {
  Object o = sagex.SageAPI.call("GetShowDescription", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the description for the specified Show

Parameters:
Show- the Show object
Returns:
the desccription for the Show
 */
public static java.lang.String GetShowDescription (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowDescription", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the episode name for the specified Show. For music files, this will be the name of the song.

Parameters:
Show- the Show object
Returns:
the episode name for the specified Show. For music files, this will be the name of the song. For imported videos, this will be the title of the file
 */
public static java.lang.String GetShowEpisode (Object Show) {
  Object o = sagex.SageAPI.call("GetShowEpisode", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the episode name for the specified Show. For music files, this will be the name of the song.

Parameters:
Show- the Show object
Returns:
the episode name for the specified Show. For music files, this will be the name of the song. For imported videos, this will be the title of the file
 */
public static java.lang.String GetShowEpisode (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowEpisode", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the epxanded ratings information for the specified Show. This includes thigs like
 Violence, Nudity, Adult Language, etc.

Parameters:
Show- the Show object
Returns:
the expanded ratings for the Show
 */
public static java.lang.String GetShowExpandedRatings (Object Show) {
  Object o = sagex.SageAPI.call("GetShowExpandedRatings", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the epxanded ratings information for the specified Show. This includes thigs like
 Violence, Nudity, Adult Language, etc.

Parameters:
Show- the Show object
Returns:
the expanded ratings for the Show
 */
public static java.lang.String GetShowExpandedRatings (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowExpandedRatings", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Deprecated. 

Returns the parental rating for this show. The parental rating field in Airing is used instead of this in the standard implementation.

Parameters:
Show- the Show object
Returns:
the parental rating info for this show
 */
public static java.lang.String GetShowParentalRating (Object Show) {
  Object o = sagex.SageAPI.call("GetShowParentalRating", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Returns the parental rating for this show. The parental rating field in Airing is used instead of this in the standard implementation.

Parameters:
Show- the Show object
Returns:
the parental rating info for this show
 */
public static java.lang.String GetShowParentalRating (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowParentalRating", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the MPAA rating for the specified Show (only used for movies).

Parameters:
Show- the Show object
Returns:
the MPAA rating for this Show, will be one of: G, PG, R, PG-13, etc.
 */
public static java.lang.String GetShowRated (Object Show) {
  Object o = sagex.SageAPI.call("GetShowRated", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the MPAA rating for the specified Show (only used for movies).

Parameters:
Show- the Show object
Returns:
the MPAA rating for this Show, will be one of: G, PG, R, PG-13, etc.
 */
public static java.lang.String GetShowRated (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowRated", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the duration of the specified Show. Most Shows do not contain duration information, with the exception
 of movies whose show duration indicates the runing time of the movie.

Parameters:
Show- the Show object
Returns:
the duration in milliseconds of the specified Show, 0 if it is not set
 */
public static long GetShowDuration (Object Show) {
  Object o = sagex.SageAPI.call("GetShowDuration", new Object[] {Show});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the duration of the specified Show. Most Shows do not contain duration information, with the exception
 of movies whose show duration indicates the runing time of the movie.

Parameters:
Show- the Show object
Returns:
the duration in milliseconds of the specified Show, 0 if it is not set
 */
public static long GetShowDuration (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowDuration", new Object[] {Show});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the title of the specified Show. For music this will correspond to the Album name. For imported videos, For imported videos, this will be the title of the file with the relative import path as it's prefix.

Parameters:
Show- the Show object
Returns:
the title of the specified Show
 */
public static java.lang.String GetShowTitle (Object Show) {
  Object o = sagex.SageAPI.call("GetShowTitle", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the title of the specified Show. For music this will correspond to the Album name. For imported videos, For imported videos, this will be the title of the file with the relative import path as it's prefix.

Parameters:
Show- the Show object
Returns:
the title of the specified Show
 */
public static java.lang.String GetShowTitle (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowTitle", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the year of the specified Show. This is usually only valid for movies.

Parameters:
Show- the Show object
Returns:
the year the specified Show was produced in
 */
public static java.lang.String GetShowYear (Object Show) {
  Object o = sagex.SageAPI.call("GetShowYear", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the year of the specified Show. This is usually only valid for movies.

Parameters:
Show- the Show object
Returns:
the year the specified Show was produced in
 */
public static java.lang.String GetShowYear (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowYear", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the global unique ID which is used to identify Shows. This ID is common among all SageTV users.

Parameters:
Show- the Show object
Returns:
the global unique ID which represents this Show
 */
public static java.lang.String GetShowExternalID (Object Show) {
  Object o = sagex.SageAPI.call("GetShowExternalID", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the global unique ID which is used to identify Shows. This ID is common among all SageTV users.

Parameters:
Show- the Show object
Returns:
the global unique ID which represents this Show
 */
public static java.lang.String GetShowExternalID (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowExternalID", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the date that this Show was originally aired at.

Parameters:
Show- the Show object
Returns:
the date that this Show was originally aired at, same units as java.lang.System.currentTimeMillis()
 */
public static long GetOriginalAiringDate (Object Show) {
  Object o = sagex.SageAPI.call("GetOriginalAiringDate", new Object[] {Show});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the date that this Show was originally aired at.

Parameters:
Show- the Show object
Returns:
the date that this Show was originally aired at, same units as java.lang.System.currentTimeMillis()
 */
public static long GetOriginalAiringDate (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOriginalAiringDate", new Object[] {Show});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets a list of all of the valid roles that people can have in a Show

Returns:
a list of all of the valid roles that people can have in a Show
 */
public static java.lang.String[] GetRoleTypes () {
  return (java.lang.String[]) sagex.SageAPI.call("GetRoleTypes", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the valid roles that people can have in a Show

Returns:
a list of all of the valid roles that people can have in a Show
 */
public static java.lang.String[] GetRoleTypes (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetRoleTypes", (Object[])null);
}

/**
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a comma separated list
 */
public static java.lang.String GetPeopleInShow (Object Show) {
  Object o = sagex.SageAPI.call("GetPeopleInShow", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a comma separated list
 */
public static java.lang.String GetPeopleInShow (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPeopleInShow", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShow (Object Show) {
  return (Object[]) sagex.SageAPI.call("GetPersonListInShow", new Object[] {Show});
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShow (UIContext _uicontext,Object Show) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetPersonListInShow", new Object[] {Show});
}

/**
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShow (Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleListInShow", new Object[] {Show});
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the people involved in this Show. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShow (UIContext _uicontext,Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleListInShow", new Object[] {Show});
}

/**
Gets a list of all of the people involved in this Show and the character each of them plays if known. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show with the characters they play as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShow (Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleAndCharacterListInShow", new Object[] {Show});
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the people involved in this Show and the character each of them plays if known. The order of the returned list will
 correlate with the values returned fromGetRolesInShow
.

Parameters:
Show- the Show object
Returns:
a list of all of the people involved in this Show with the characters they play as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShow (UIContext _uicontext,Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleAndCharacterListInShow", new Object[] {Show});
}

/**
Gets a list of the roles for each of the people in the specified Show. The order of the returned list will
 correlate with the values returned fromGetPeopleInShow


Parameters:
Show- the Show object
Returns:
a list of the roles for each of the people in the specified Show
 */
public static java.lang.String[] GetRolesInShow (Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call("GetRolesInShow", new Object[] {Show});
}

/**
 * UI Context Aware Call<br>
Gets a list of the roles for each of the people in the specified Show. The order of the returned list will
 correlate with the values returned fromGetPeopleInShow


Parameters:
Show- the Show object
Returns:
a list of the roles for each of the people in the specified Show
 */
public static java.lang.String[] GetRolesInShow (UIContext _uicontext,Object Show) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetRolesInShow", new Object[] {Show});
}

/**
Gets the people in the specified Show in the specified Role. Returned as a comma separated list.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role
 */
public static java.lang.String GetPeopleInShowInRole (Object Show, java.lang.String Role) {
  Object o = sagex.SageAPI.call("GetPeopleInShowInRole", new Object[] {Show,Role});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Role. Returned as a comma separated list.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role
 */
public static java.lang.String GetPeopleInShowInRole (UIContext _uicontext,Object Show, java.lang.String Role) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPeopleInShowInRole", new Object[] {Show,Role});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the people in the specified Show in the specified Roles. Returned as a comma separated list.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles
 */
public static java.lang.String GetPeopleInShowInRoles (Object Show, java.lang.String[] RoleList) {
  Object o = sagex.SageAPI.call("GetPeopleInShowInRoles", new Object[] {Show,RoleList});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Roles. Returned as a comma separated list.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles
 */
public static java.lang.String GetPeopleInShowInRoles (UIContext _uicontext,Object Show, java.lang.String[] RoleList) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPeopleInShowInRoles", new Object[] {Show,RoleList});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the people in the specified Show in the specified Role. Returned as a comma separated list.
 Each name will also append the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role
Since:
7.0
 */
public static java.lang.String GetPeopleAndCharacterInShowInRole (Object Show, java.lang.String Role) {
  Object o = sagex.SageAPI.call("GetPeopleAndCharacterInShowInRole", new Object[] {Show,Role});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Role. Returned as a comma separated list.
 Each name will also append the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role
Since:
7.0
 */
public static java.lang.String GetPeopleAndCharacterInShowInRole (UIContext _uicontext,Object Show, java.lang.String Role) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPeopleAndCharacterInShowInRole", new Object[] {Show,Role});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the people in the specified Show in the specified Roles. Returned as a comma separated list.
 Each name will also append the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles
Since:
7.0
 */
public static java.lang.String GetPeopleAndCharacterInShowInRoles (Object Show, java.lang.String[] RoleList) {
  Object o = sagex.SageAPI.call("GetPeopleAndCharacterInShowInRoles", new Object[] {Show,RoleList});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Roles. Returned as a comma separated list.
 Each name will also append the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles
Since:
7.0
 */
public static java.lang.String GetPeopleAndCharacterInShowInRoles (UIContext _uicontext,Object Show, java.lang.String[] RoleList) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPeopleAndCharacterInShowInRoles", new Object[] {Show,RoleList});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the people in the specified Show in the specified Role. Returned as a String array.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShowInRole (Object Show, java.lang.String Role) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleListInShowInRole", new Object[] {Show,Role});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Role. Returned as a String array.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShowInRole (UIContext _uicontext,Object Show, java.lang.String Role) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleListInShowInRole", new Object[] {Show,Role});
}

/**
Gets the people in the specified Show in the specified Role. Returned as a Person array.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShowInRole (Object Show, java.lang.String Role) {
  return (Object[]) sagex.SageAPI.call("GetPersonListInShowInRole", new Object[] {Show,Role});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Role. Returned as a Person array.

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShowInRole (UIContext _uicontext,Object Show, java.lang.String Role) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetPersonListInShowInRole", new Object[] {Show,Role});
}

/**
Gets the people in the specified Show in the specified Roles. Returned as a String array.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShowInRoles (Object Show, java.lang.String[] RoleList) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleListInShowInRoles", new Object[] {Show,RoleList});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Roles. Returned as a String array.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a String array
Since:
5.1
 */
public static java.lang.String[] GetPeopleListInShowInRoles (UIContext _uicontext,Object Show, java.lang.String[] RoleList) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleListInShowInRoles", new Object[] {Show,RoleList});
}

/**
Gets the people in the specified Show in the specified Roles. Returned as a Person array.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShowInRoles (Object Show, java.lang.String[] RoleList) {
  return (Object[]) sagex.SageAPI.call("GetPersonListInShowInRoles", new Object[] {Show,RoleList});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Roles. Returned as a Person array.

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a Person array
Since:
9.0.3
 */
public static Object[] GetPersonListInShowInRoles (UIContext _uicontext,Object Show, java.lang.String[] RoleList) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetPersonListInShowInRoles", new Object[] {Show,RoleList});
}

/**
Gets the people in the specified Show in the specified Role. Returned as a String array.
 Each string will also indicate the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShowInRole (Object Show, java.lang.String Role) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleAndCharacterListInShowInRole", new Object[] {Show,Role});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Role. Returned as a String array.
 Each string will also indicate the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
Role- the role to get the people for
Returns:
the people in the specified Show in the specified Role as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShowInRole (UIContext _uicontext,Object Show, java.lang.String Role) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleAndCharacterListInShowInRole", new Object[] {Show,Role});
}

/**
Gets the people in the specified Show in the specified Roles. Returned as a String array.
 Each string will also indicate the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShowInRoles (Object Show, java.lang.String[] RoleList) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPeopleAndCharacterListInShowInRoles", new Object[] {Show,RoleList});
}

/**
 * UI Context Aware Call<br>
Gets the people in the specified Show in the specified Roles. Returned as a String array.
 Each string will also indicate the character they play if known; using the localized format "Actor as Character".

Parameters:
Show- the Show object
RoleList- the roles to get the people for
Returns:
the people in the specified Show in the specified Roles as a String array
Since:
7.0
 */
public static java.lang.String[] GetPeopleAndCharacterListInShowInRoles (UIContext _uicontext,Object Show, java.lang.String[] RoleList) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPeopleAndCharacterListInShowInRoles", new Object[] {Show,RoleList});
}

/**
Returns true if the passed in argument is a Show object. No automatic type conversion
 will be done on the argument.

Parameters:
Show- the object to test to see if its a Show
Returns:
true if the passed in argument is a Show object, false otherwise
 */
public static boolean IsShowObject (java.lang.Object Show) {
  Object o = sagex.SageAPI.call("IsShowObject", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the passed in argument is a Show object. No automatic type conversion
 will be done on the argument.

Parameters:
Show- the object to test to see if its a Show
Returns:
true if the passed in argument is a Show object, false otherwise
 */
public static boolean IsShowObject (UIContext _uicontext,java.lang.Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "IsShowObject", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified Airing represents the first run of the Show content.

Parameters:
Airing- the Airing object
Returns:
true if the specified Airing represents the first run of its Show content, false otherwise
 */
public static boolean IsShowFirstRun (Object Airing) {
  Object o = sagex.SageAPI.call("IsShowFirstRun", new Object[] {Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Airing represents the first run of the Show content.

Parameters:
Airing- the Airing object
Returns:
true if the specified Airing represents the first run of its Show content, false otherwise
 */
public static boolean IsShowFirstRun (UIContext _uicontext,Object Airing) {
  Object o = sagex.SageAPI.call(_uicontext, "IsShowFirstRun", new Object[] {Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified Airing represents a rerun of the Show content.

Parameters:
Airing- the Airing object
Returns:
true if the specified Airing represents a rerun of its Show content, false otherwise
 */
public static boolean IsShowReRun (Object Airing) {
  Object o = sagex.SageAPI.call("IsShowReRun", new Object[] {Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Airing represents a rerun of the Show content.

Parameters:
Airing- the Airing object
Returns:
true if the specified Airing represents a rerun of its Show content, false otherwise
 */
public static boolean IsShowReRun (UIContext _uicontext,Object Airing) {
  Object o = sagex.SageAPI.call(_uicontext, "IsShowReRun", new Object[] {Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the language that the specified Show is in.

Parameters:
Show- the Show object
Returns:
the language that the specified Show is in
 */
public static java.lang.String GetShowLanguage (Object Show) {
  Object o = sagex.SageAPI.call("GetShowLanguage", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the language that the specified Show is in.

Parameters:
Show- the Show object
Returns:
the language that the specified Show is in
 */
public static java.lang.String GetShowLanguage (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowLanguage", new Object[] {Show});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Adds a new Show to the database. Null or the empty string ("") can be passed in for any unneeded fields.

Parameters:
Title- the title of the Show (for music this should be album name)
IsFirstRun- true if this Show is a first run, false otherwise (this parameter has no effect anymore since Airings determine first/rerun status)
Episode- the episode name for this Show (for music this should be the song title)
Description- the description of the Show
Duration- the duration of the Show, not necessary and can be zero; this is only used for indicating differences between Airing duration and the actual content duration
Category- the category of the Show (should be genre for music)
SubCategory- the subcategory of the Show
PeopleList- a list of all of the people in the Show, the roles of the people should correspond to the RolesListForPeopleList argument
RolesListForPeopleList- a list of the roles for the people in the Show, this should correspond to the PeopleList argument
Rated- the rating for the Show seeGetShowRated()

ExpandedRatingsList- the expanded ratings list for the show, seeGetShowExpandedRatings()

Year- the year of the Show
ParentalRating- the parental rating for the Show (this is no longer used since Airing contains the parental rating)
MiscList- miscellaneous metadata for the Show
ExternalID- the global ID which should be used to uniquely identify this Show
Language- the language for the Show
OriginalAirDate- the original airing date of the Show
Returns:
the newly created Show object
 */
public static Object AddShow (java.lang.String Title, boolean IsFirstRun, java.lang.String Episode, java.lang.String Description, long Duration, java.lang.String Category, java.lang.String SubCategory, java.lang.String[] PeopleList, java.lang.String[] RolesListForPeopleList, java.lang.String Rated, java.lang.String[] ExpandedRatingsList, java.lang.String Year, java.lang.String ParentalRating, java.lang.String[] MiscList, java.lang.String ExternalID, java.lang.String Language, long OriginalAirDate) {
  Object o = sagex.SageAPI.call("AddShow", new Object[] {Title,IsFirstRun,Episode,Description,Duration,Category,SubCategory,PeopleList,RolesListForPeopleList,Rated,ExpandedRatingsList,Year,ParentalRating,MiscList,ExternalID,Language,OriginalAirDate});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Adds a new Show to the database. Null or the empty string ("") can be passed in for any unneeded fields.

Parameters:
Title- the title of the Show (for music this should be album name)
IsFirstRun- true if this Show is a first run, false otherwise (this parameter has no effect anymore since Airings determine first/rerun status)
Episode- the episode name for this Show (for music this should be the song title)
Description- the description of the Show
Duration- the duration of the Show, not necessary and can be zero; this is only used for indicating differences between Airing duration and the actual content duration
Category- the category of the Show (should be genre for music)
SubCategory- the subcategory of the Show
PeopleList- a list of all of the people in the Show, the roles of the people should correspond to the RolesListForPeopleList argument
RolesListForPeopleList- a list of the roles for the people in the Show, this should correspond to the PeopleList argument
Rated- the rating for the Show seeGetShowRated()

ExpandedRatingsList- the expanded ratings list for the show, seeGetShowExpandedRatings()

Year- the year of the Show
ParentalRating- the parental rating for the Show (this is no longer used since Airing contains the parental rating)
MiscList- miscellaneous metadata for the Show
ExternalID- the global ID which should be used to uniquely identify this Show
Language- the language for the Show
OriginalAirDate- the original airing date of the Show
Returns:
the newly created Show object
 */
public static Object AddShow (UIContext _uicontext,java.lang.String Title, boolean IsFirstRun, java.lang.String Episode, java.lang.String Description, long Duration, java.lang.String Category, java.lang.String SubCategory, java.lang.String[] PeopleList, java.lang.String[] RolesListForPeopleList, java.lang.String Rated, java.lang.String[] ExpandedRatingsList, java.lang.String Year, java.lang.String ParentalRating, java.lang.String[] MiscList, java.lang.String ExternalID, java.lang.String Language, long OriginalAirDate) {
  Object o = sagex.SageAPI.call(_uicontext, "AddShow", new Object[] {Title,IsFirstRun,Episode,Description,Duration,Category,SubCategory,PeopleList,RolesListForPeopleList,Rated,ExpandedRatingsList,Year,ParentalRating,MiscList,ExternalID,Language,OriginalAirDate});
  if (o!=null) return (Object) o;
  return null;
}

/**
Adds a new Show to the database. Null or the empty string ("") can be passed in for any unneeded fields.

Parameters:
Title- the title of the Show (for music this should be album name)
IsFirstRun- true if this Show is a first run, false otherwise (this parameter has no effect anymore since Airings determine first/rerun status)
Episode- the episode name for this Show (for music this should be the song title)
Description- the description of the Show
Duration- the duration of the Show, not necessary and can be zero; this is only used for indicating differences between Airing duration and the actual content duration
Categories- an array of the categories of the Show (should be genre for music)
PeopleList- a list of all of the people in the Show, the roles of the people should correspond to the RolesListForPeopleList argument
RolesListForPeopleList- a list of the roles for the people in the Show, this should correspond to the PeopleList argument
Rated- the rating for the Show seeGetShowRated()

ExpandedRatingsList- the expanded ratings list for the show, seeGetShowExpandedRatings()

Year- the year of the Show
ParentalRating- the parental rating for the Show (this is no longer used since Airing contains the parental rating)
MiscList- miscellaneous metadata for the Show
ExternalID- the global ID which should be used to uniquely identify this Show
Language- the language for the Show
OriginalAirDate- the original airing date of the Show
SeasonNumber- the season number of the Show
EpisodeNumber- the episode number for the specific season for the Show
Returns:
the newly created Show object
Since:
7.1
 */
public static Object AddShow (java.lang.String Title, boolean IsFirstRun, java.lang.String Episode, java.lang.String Description, long Duration, java.lang.String[] Categories, java.lang.String[] PeopleList, java.lang.String[] RolesListForPeopleList, java.lang.String Rated, java.lang.String[] ExpandedRatingsList, java.lang.String Year, java.lang.String ParentalRating, java.lang.String[] MiscList, java.lang.String ExternalID, java.lang.String Language, long OriginalAirDate, int SeasonNumber, int EpisodeNumber) {
  Object o = sagex.SageAPI.call("AddShow", new Object[] {Title,IsFirstRun,Episode,Description,Duration,Categories,PeopleList,RolesListForPeopleList,Rated,ExpandedRatingsList,Year,ParentalRating,MiscList,ExternalID,Language,OriginalAirDate,SeasonNumber,EpisodeNumber});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Adds a new Show to the database. Null or the empty string ("") can be passed in for any unneeded fields.

Parameters:
Title- the title of the Show (for music this should be album name)
IsFirstRun- true if this Show is a first run, false otherwise (this parameter has no effect anymore since Airings determine first/rerun status)
Episode- the episode name for this Show (for music this should be the song title)
Description- the description of the Show
Duration- the duration of the Show, not necessary and can be zero; this is only used for indicating differences between Airing duration and the actual content duration
Categories- an array of the categories of the Show (should be genre for music)
PeopleList- a list of all of the people in the Show, the roles of the people should correspond to the RolesListForPeopleList argument
RolesListForPeopleList- a list of the roles for the people in the Show, this should correspond to the PeopleList argument
Rated- the rating for the Show seeGetShowRated()

ExpandedRatingsList- the expanded ratings list for the show, seeGetShowExpandedRatings()

Year- the year of the Show
ParentalRating- the parental rating for the Show (this is no longer used since Airing contains the parental rating)
MiscList- miscellaneous metadata for the Show
ExternalID- the global ID which should be used to uniquely identify this Show
Language- the language for the Show
OriginalAirDate- the original airing date of the Show
SeasonNumber- the season number of the Show
EpisodeNumber- the episode number for the specific season for the Show
Returns:
the newly created Show object
Since:
7.1
 */
public static Object AddShow (UIContext _uicontext,java.lang.String Title, boolean IsFirstRun, java.lang.String Episode, java.lang.String Description, long Duration, java.lang.String[] Categories, java.lang.String[] PeopleList, java.lang.String[] RolesListForPeopleList, java.lang.String Rated, java.lang.String[] ExpandedRatingsList, java.lang.String Year, java.lang.String ParentalRating, java.lang.String[] MiscList, java.lang.String ExternalID, java.lang.String Language, long OriginalAirDate, int SeasonNumber, int EpisodeNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "AddShow", new Object[] {Title,IsFirstRun,Episode,Description,Duration,Categories,PeopleList,RolesListForPeopleList,Rated,ExpandedRatingsList,Year,ParentalRating,MiscList,ExternalID,Language,OriginalAirDate,SeasonNumber,EpisodeNumber});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a list of all of the Airings for the specified Show starting after the specified time.

Parameters:
Show- the Show object
StartingAfterTime- the time that all returned Airings should start after
Returns:
a list of all of the Airings for the specified Show starting after the specified time
 */
public static Object[] GetAiringsForShow (Object Show, long StartingAfterTime) {
  return (Object[]) sagex.SageAPI.call("GetAiringsForShow", new Object[] {Show,StartingAfterTime});
}

/**
 * UI Context Aware Call<br>
Returns a list of all of the Airings for the specified Show starting after the specified time.

Parameters:
Show- the Show object
StartingAfterTime- the time that all returned Airings should start after
Returns:
a list of all of the Airings for the specified Show starting after the specified time
 */
public static Object[] GetAiringsForShow (UIContext _uicontext,Object Show, long StartingAfterTime) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAiringsForShow", new Object[] {Show,StartingAfterTime});
}

/**
Gets a Show based on the global unique ID which is used to identify Shows. This ID is common among all SageTV users.
 This value can be obtained fromGetShowExternalID()


Parameters:
ExternalID- the external ID to find the corresponding Show for
Returns:
the Show which corresponds to the specified externalID, or null if it isn't found in the database
 */
public static Object GetShowForExternalID (java.lang.String ExternalID) {
  Object o = sagex.SageAPI.call("GetShowForExternalID", new Object[] {ExternalID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets a Show based on the global unique ID which is used to identify Shows. This ID is common among all SageTV users.
 This value can be obtained fromGetShowExternalID()


Parameters:
ExternalID- the external ID to find the corresponding Show for
Returns:
the Show which corresponds to the specified externalID, or null if it isn't found in the database
 */
public static Object GetShowForExternalID (UIContext _uicontext,java.lang.String ExternalID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowForExternalID", new Object[] {ExternalID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the specified Show object is a Movie. This is true if the ExternalID starts with 'MV' or if the primary
 category for the content is "Movie"

Parameters:
Show- the Show to test if its a Movie or not
Returns:
true if the specified Show is a Movie
Since:
8.0
 */
public static boolean IsMovie (Object Show) {
  Object o = sagex.SageAPI.call("IsMovie", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Show object is a Movie. This is true if the ExternalID starts with 'MV' or if the primary
 category for the content is "Movie"

Parameters:
Show- the Show to test if its a Movie or not
Returns:
true if the specified Show is a Movie
Since:
8.0
 */
public static boolean IsMovie (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMovie", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the SeriesInfo object for a specified Show if that Show is for a television series and there
 is information on that series.

Parameters:
Show- the Show object
Returns:
the SeriesInfo for the specified Show, or null if the Show has no SeriesInfo
Since:
5.1
 */
public static Object GetShowSeriesInfo (Object Show) {
  Object o = sagex.SageAPI.call("GetShowSeriesInfo", new Object[] {Show});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the SeriesInfo object for a specified Show if that Show is for a television series and there
 is information on that series.

Parameters:
Show- the Show object
Returns:
the SeriesInfo for the specified Show, or null if the Show has no SeriesInfo
Since:
5.1
 */
public static Object GetShowSeriesInfo (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowSeriesInfo", new Object[] {Show});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the season number of the specified Show. For episodic content; sometimes a numeric value is given to the
 season. If that information exists, this will return it.

Parameters:
Show- the Show object
Returns:
the season number of the specified Show, 0 if it is not set
Since:
7.1
 */
public static int GetShowSeasonNumber (Object Show) {
  Object o = sagex.SageAPI.call("GetShowSeasonNumber", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the season number of the specified Show. For episodic content; sometimes a numeric value is given to the
 season. If that information exists, this will return it.

Parameters:
Show- the Show object
Returns:
the season number of the specified Show, 0 if it is not set
Since:
7.1
 */
public static int GetShowSeasonNumber (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowSeasonNumber", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the episode number of the specified Show. For episodic content; sometimes a numeric value is given to the
 episode in a season. If that information exists, this will return it.

Parameters:
Show- the Show object
Returns:
the episode number of the specified Show, 0 if it is not set
Since:
7.1
 */
public static int GetShowEpisodeNumber (Object Show) {
  Object o = sagex.SageAPI.call("GetShowEpisodeNumber", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the episode number of the specified Show. For episodic content; sometimes a numeric value is given to the
 episode in a season. If that information exists, this will return it.

Parameters:
Show- the Show object
Returns:
the episode number of the specified Show, 0 if it is not set
Since:
7.1
 */
public static int GetShowEpisodeNumber (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowEpisodeNumber", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns an image specific to this Show. For the standard implementation, this will only return values for Movies (and not all movies have images).
 UseGetShowImageCount
to determine what the valid values are for the Index parameter.
 In the future this will be expanded to support plugin image providers to extend what is returned.

Parameters:
Show- the Show object
Type- the type of image, can be one of "PhotoTall", "PhotoWide", "PhotoThumbTall", "PhotoThumbWide", "PosterTall", "PosterWide", "PosterThumbTall" or "PosterThumbWide". In the future, there will be support to expand these types using image plugin providers.
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type
Fallback- should be 3 if the returned image must match the requested parameters, 2 if a substitute image may be used that requires a similar type, 1 if a substitute image may be used that requires the same size, or 0 if any image type may be substituted (size is preferred over type)
Returns:
a MetaImage corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
7.1
 */
public static Object GetShowImage (Object Show, java.lang.String Type, int Index, int Fallback) {
  Object o = sagex.SageAPI.call("GetShowImage", new Object[] {Show,Type,Index,Fallback});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns an image specific to this Show. For the standard implementation, this will only return values for Movies (and not all movies have images).
 UseGetShowImageCount
to determine what the valid values are for the Index parameter.
 In the future this will be expanded to support plugin image providers to extend what is returned.

Parameters:
Show- the Show object
Type- the type of image, can be one of "PhotoTall", "PhotoWide", "PhotoThumbTall", "PhotoThumbWide", "PosterTall", "PosterWide", "PosterThumbTall" or "PosterThumbWide". In the future, there will be support to expand these types using image plugin providers.
Index- the 0-based index of the image to retrieve when multiple images exist for a given Type
Fallback- should be 3 if the returned image must match the requested parameters, 2 if a substitute image may be used that requires a similar type, 1 if a substitute image may be used that requires the same size, or 0 if any image type may be substituted (size is preferred over type)
Returns:
a MetaImage corresponding to the requested image, or null if no image matching the requested parameters is found or an invalid Type is specified
Since:
7.1
 */
public static Object GetShowImage (UIContext _uicontext,Object Show, java.lang.String Type, int Index, int Fallback) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowImage", new Object[] {Show,Type,Index,Fallback});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a count of images specific to this Show. For the standard implementation, this will only return non-zero values for Movies (and not all movies have images).
 In the future this will be expanded to support plugin image providers to extend what is returned.

Parameters:
Show- the Show object
Type- the type of image, can be one of "PhotoTall", "PhotoWide", "PhotoThumbTall", "PhotoThumbWide", "PosterTall", "PosterWide", "PosterThumbTall" or "PosterThumbWide". If this is null or the empty string, then it will return 1 if any images exist and zero if none exist. In the future, there will be support to expand these types using image plugin providers.
Returns:
the number of images that match the requested type for the specified Show
Since:
7.1
 */
public static int GetShowImageCount (Object Show, java.lang.String Type) {
  Object o = sagex.SageAPI.call("GetShowImageCount", new Object[] {Show,Type});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns a count of images specific to this Show. For the standard implementation, this will only return non-zero values for Movies (and not all movies have images).
 In the future this will be expanded to support plugin image providers to extend what is returned.

Parameters:
Show- the Show object
Type- the type of image, can be one of "PhotoTall", "PhotoWide", "PhotoThumbTall", "PhotoThumbWide", "PosterTall", "PosterWide", "PosterThumbTall" or "PosterThumbWide". If this is null or the empty string, then it will return 1 if any images exist and zero if none exist. In the future, there will be support to expand these types using image plugin providers.
Returns:
the number of images that match the requested type for the specified Show
Since:
7.1
 */
public static int GetShowImageCount (UIContext _uicontext,Object Show, java.lang.String Type) {
  Object o = sagex.SageAPI.call(_uicontext, "GetShowImageCount", new Object[] {Show,Type});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns true if the passed in Show that represents a Movie has any imagery associated with it

Parameters:
Show- the Show object
Returns:
true if the passed in Show that represents a Movie has any imagery associated with it, false otherwise
Since:
8.0
 */
public static boolean HasMovieImage (Object Show) {
  Object o = sagex.SageAPI.call("HasMovieImage", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the passed in Show that represents a Movie has any imagery associated with it

Parameters:
Show- the Show object
Returns:
true if the passed in Show that represents a Movie has any imagery associated with it, false otherwise
Since:
8.0
 */
public static boolean HasMovieImage (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "HasMovieImage", new Object[] {Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a MetaImage for an image that's representative of this Movie

Parameters:
Show- the Show object
Thumb- true if it should return a thumbnail image
Returns:
a MetaImage for an image that's representative of this Movie, null if there is no such image
Since:
8.0
 */
public static Object GetMovieImage (Object Show, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetMovieImage", new Object[] {Show,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a MetaImage for an image that's representative of this Movie

Parameters:
Show- the Show object
Thumb- true if it should return a thumbnail image
Returns:
a MetaImage for an image that's representative of this Movie, null if there is no such image
Since:
8.0
 */
public static Object GetMovieImage (UIContext _uicontext,Object Show, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieImage", new Object[] {Show,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns an image URL that's representative of this Movie

Parameters:
Show- the Show object
Thumb- true if it should return a thumbnail image
Returns:
a URL for an image that's representative of this Movie, null if there is no such image
Since:
8.0
 */
public static java.lang.String GetMovieImageURL (Object Show, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetMovieImageURL", new Object[] {Show,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns an image URL that's representative of this Movie

Parameters:
Show- the Show object
Thumb- true if it should return a thumbnail image
Returns:
a URL for an image that's representative of this Movie, null if there is no such image
Since:
8.0
 */
public static java.lang.String GetMovieImageURL (UIContext _uicontext,Object Show, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieImageURL", new Object[] {Show,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the number of images available for a Show that represents a Movie

Parameters:
Show- the Show object
Returns:
the number of images available for a Show that represents a Movie
Since:
8.0
 */
public static int GetMovieImageCount (Object Show) {
  Object o = sagex.SageAPI.call("GetMovieImageCount", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of images available for a Show that represents a Movie

Parameters:
Show- the Show object
Returns:
the number of images available for a Show that represents a Movie
Since:
8.0
 */
public static int GetMovieImageCount (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieImageCount", new Object[] {Show});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the image at the specified index for a Show that represents a Movie

Parameters:
Show- the Show object
Index- the 0-based index number of the image to retrieve
Thumb- true if it should return a thumbnail image
Returns:
a MetaImage that corresponds to the requested image, or null if it doesn't exist
Since:
8.0
 */
public static Object GetMovieImageAtIndex (Object Show, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetMovieImageAtIndex", new Object[] {Show,Index,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image at the specified index for a Show that represents a Movie

Parameters:
Show- the Show object
Index- the 0-based index number of the image to retrieve
Thumb- true if it should return a thumbnail image
Returns:
a MetaImage that corresponds to the requested image, or null if it doesn't exist
Since:
8.0
 */
public static Object GetMovieImageAtIndex (UIContext _uicontext,Object Show, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieImageAtIndex", new Object[] {Show,Index,Thumb});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the image URL at the specified index for a Show that represents a Movie

Parameters:
Show- the Show object
Index- the 0-based index number of the image to retrieve
Thumb- true if it should return a thumbnail image
Returns:
a URL that corresponds to the requested image, or null if it doesn't exist
Since:
8.0
 */
public static java.lang.String GetMovieImageURLAtIndex (Object Show, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call("GetMovieImageURLAtIndex", new Object[] {Show,Index,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image URL at the specified index for a Show that represents a Movie

Parameters:
Show- the Show object
Index- the 0-based index number of the image to retrieve
Thumb- true if it should return a thumbnail image
Returns:
a URL that corresponds to the requested image, or null if it doesn't exist
Since:
8.0
 */
public static java.lang.String GetMovieImageURLAtIndex (UIContext _uicontext,Object Show, int Index, boolean Thumb) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieImageURLAtIndex", new Object[] {Show,Index,Thumb});
  if (o!=null) return (java.lang.String) o;
  return null;
}

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
Returns the star rating for a Movie as a floating point number.

Parameters:
Show- the movie to get the star rating for
Returns:
the star rating as a floating point number, zero if there is no star rating for this Show
Since:
8.1
 */
public static float GetMovieStarRating (Object Show) {
  Object o = sagex.SageAPI.call("GetMovieStarRating", new Object[] {Show});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the star rating for a Movie as a floating point number.

Parameters:
Show- the movie to get the star rating for
Returns:
the star rating as a floating point number, zero if there is no star rating for this Show
Since:
8.1
 */
public static float GetMovieStarRating (UIContext _uicontext,Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMovieStarRating", new Object[] {Show});
  if (o!=null) return (Float) o;
  return 0.0f;
}

}
