package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/TVEditorialAPI.html'>TVEditorialAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class TVEditorialAPI {
/**
Returns a list of all of the 'TV Editorials' which are stories about TV shows

Returns:
a list of all of the 'TV Editorials'
Since:
5.1
 */
public static Object[] GetAllTVEditorials () {
  return (Object[]) sagex.SageAPI.call("GetAllTVEditorials", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of all of the 'TV Editorials' which are stories about TV shows

Returns:
a list of all of the 'TV Editorials'
Since:
5.1
 */
public static Object[] GetAllTVEditorials (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllTVEditorials", (Object[])null);
}

/**
Returns the title for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the title for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialTitle (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialTitle", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the title for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the title for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialTitle (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialTitle", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the Show for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the Show for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialShow (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialShow", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Show for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the Show for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialShow (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialShow", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the text for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the text for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialText (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialText", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the text for the specified TVEditorial

Parameters:
TVEditorial- the TVEditorial object
Returns:
the text for the specified TVEditorial
Since:
5.1
 */
public static java.lang.String GetEditorialText (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialText", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a String representing the airing date for the content the editorial is about

Parameters:
TVEditorial- the TVEditorial object
Returns:
a String representing the airing date for the content the editorial is about
Since:
5.1
 */
public static java.lang.String GetEditorialAirDate (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialAirDate", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a String representing the airing date for the content the editorial is about

Parameters:
TVEditorial- the TVEditorial object
Returns:
a String representing the airing date for the content the editorial is about
Since:
5.1
 */
public static java.lang.String GetEditorialAirDate (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialAirDate", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the network that the Show for this editorial is broadcast on

Parameters:
TVEditorial- the TVEditorial object
Returns:
the network that the Show for this editorial is broadcast on
Since:
5.1
 */
public static java.lang.String GetEditorialNetwork (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialNetwork", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the network that the Show for this editorial is broadcast on

Parameters:
TVEditorial- the TVEditorial object
Returns:
the network that the Show for this editorial is broadcast on
Since:
5.1
 */
public static java.lang.String GetEditorialNetwork (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialNetwork", new Object[] {TVEditorial});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified editorial has an image that corresponds to it

Parameters:
TVEditorial- the TVEditorial object
Returns:
true if the specified editorial has an image that corresponds to it, false otherwise
Since:
5.1
 */
public static boolean HasEditorialImage (Object TVEditorial) {
  Object o = sagex.SageAPI.call("HasEditorialImage", new Object[] {TVEditorial});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified editorial has an image that corresponds to it

Parameters:
TVEditorial- the TVEditorial object
Returns:
true if the specified editorial has an image that corresponds to it, false otherwise
Since:
5.1
 */
public static boolean HasEditorialImage (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "HasEditorialImage", new Object[] {TVEditorial});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the image that corresponds to this editorial if there is one

Parameters:
TVEditorial- the TVEditorial object
Returns:
the image that corresponds to this editorial if there is one
Since:
5.1
 */
public static Object GetEditorialImage (Object TVEditorial) {
  Object o = sagex.SageAPI.call("GetEditorialImage", new Object[] {TVEditorial});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the image that corresponds to this editorial if there is one

Parameters:
TVEditorial- the TVEditorial object
Returns:
the image that corresponds to this editorial if there is one
Since:
5.1
 */
public static Object GetEditorialImage (UIContext _uicontext,Object TVEditorial) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEditorialImage", new Object[] {TVEditorial});
  if (o!=null) return (Object) o;
  return null;
}

}
