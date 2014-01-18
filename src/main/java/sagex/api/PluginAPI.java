package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PluginAPI.html'>PluginAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class PluginAPI {
/**
Returns an object which implements the sage.SageTVPluginRegistry interface. Can be used to subscribe/unsubscribe
 to SageTVEvents.

Returns:
an object which implements the sage.SageTVPluginRegistry interface
Since:
7.0
 */
public static Object GetSageTVPluginRegistry () {
  Object o = sagex.SageAPI.call("GetSageTVPluginRegistry", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns an object which implements the sage.SageTVPluginRegistry interface. Can be used to subscribe/unsubscribe
 to SageTVEvents.

Returns:
an object which implements the sage.SageTVPluginRegistry interface
Since:
7.0
 */
public static Object GetSageTVPluginRegistry (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSageTVPluginRegistry", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns an array of Plugin objects which represent all the plugins available in the plugin repository.

Returns:
an array of Plugin objects which represent all the plugins available in the plugin repository
Since:
7.0
 */
public static Object[] GetAllAvailablePlugins () {
  return (Object[]) sagex.SageAPI.call("GetAllAvailablePlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns an array of Plugin objects which represent all the plugins available in the plugin repository.

Returns:
an array of Plugin objects which represent all the plugins available in the plugin repository
Since:
7.0
 */
public static Object[] GetAllAvailablePlugins (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllAvailablePlugins", (Object[])null);
}

/**
Returns an array of Plugin objects which represent all the plugins that have been installed on this SageTV system (enabled or disabled).
 If using a non-localhost SageTVClient; this will return the plugins that are installed on the server.

Returns:
an array of Plugin objects which represent all the plugins that have been installed on this SageTV system (enabled or disabled)
Since:
7.0
 */
public static Object[] GetInstalledPlugins () {
  return (Object[]) sagex.SageAPI.call("GetInstalledPlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns an array of Plugin objects which represent all the plugins that have been installed on this SageTV system (enabled or disabled).
 If using a non-localhost SageTVClient; this will return the plugins that are installed on the server.

Returns:
an array of Plugin objects which represent all the plugins that have been installed on this SageTV system (enabled or disabled)
Since:
7.0
 */
public static Object[] GetInstalledPlugins (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetInstalledPlugins", (Object[])null);
}

/**
Returns an array of Plugin objects which represent all the plugins that have been installed on the local client (enabled or disabled).
 This is only needed when dealing with SageTVClient applications that are connected to a non-localhost server.

Returns:
an array of Plugin objects which represent all the plugins that have been installed on the local client (enabled or disabled)
Since:
7.0
 */
public static Object[] GetInstalledClientPlugins () {
  return (Object[]) sagex.SageAPI.call("GetInstalledClientPlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns an array of Plugin objects which represent all the plugins that have been installed on the local client (enabled or disabled).
 This is only needed when dealing with SageTVClient applications that are connected to a non-localhost server.

Returns:
an array of Plugin objects which represent all the plugins that have been installed on the local client (enabled or disabled)
Since:
7.0
 */
public static Object[] GetInstalledClientPlugins (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetInstalledClientPlugins", (Object[])null);
}

/**
Returns an array of Plugin objects which represent all of the versions available of the specified plugin in the repository

Parameters:
Plugin- the Plugin object to check, this can either be a Plugin object or a String representing a Plugin ID
Returns:
an array of Plugin objects which represent all of the versions available of the specified plugin in the repository
Since:
7.0
 */
public static Object[] GetAllPluginVersions (java.lang.Object Plugin) {
  return (Object[]) sagex.SageAPI.call("GetAllPluginVersions", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns an array of Plugin objects which represent all of the versions available of the specified plugin in the repository

Parameters:
Plugin- the Plugin object to check, this can either be a Plugin object or a String representing a Plugin ID
Returns:
an array of Plugin objects which represent all of the versions available of the specified plugin in the repository
Since:
7.0
 */
public static Object[] GetAllPluginVersions (UIContext _uicontext,java.lang.Object Plugin) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllPluginVersions", new Object[] {Plugin});
}

/**
Returns the plugin in the repository for the specified plugin ID

Parameters:
PluginID- the plugin identifier
Returns:
the plugin in the repository for the specified plugin ID
Since:
7.0
 */
public static Object GetAvailablePluginForID (java.lang.String PluginID) {
  Object o = sagex.SageAPI.call("GetAvailablePluginForID", new Object[] {PluginID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the plugin in the repository for the specified plugin ID

Parameters:
PluginID- the plugin identifier
Returns:
the plugin in the repository for the specified plugin ID
Since:
7.0
 */
public static Object GetAvailablePluginForID (UIContext _uicontext,java.lang.String PluginID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAvailablePluginForID", new Object[] {PluginID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the specified plugin has already been installed

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed
Since:
7.0
 */
public static boolean IsPluginInstalled (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginInstalled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed
Since:
7.0
 */
public static boolean IsPluginInstalled (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginInstalled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin has already been installed into the locally running SageTVClient

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed into the locally running SageTVClient
Since:
7.0
 */
public static boolean IsClientPluginInstalled (Object Plugin) {
  Object o = sagex.SageAPI.call("IsClientPluginInstalled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed into the locally running SageTVClient

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed into the locally running SageTVClient
Since:
7.0
 */
public static boolean IsClientPluginInstalled (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsClientPluginInstalled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin has already been installed and is the same version as this one

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed and is the same version as this one
Since:
7.0
 */
public static boolean IsPluginInstalledSameVersion (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginInstalledSameVersion", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed and is the same version as this one

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed and is the same version as this one
Since:
7.0
 */
public static boolean IsPluginInstalledSameVersion (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginInstalledSameVersion", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin has already been installed into the locally running SageTVClient and is the same version as this one

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed into the locally running SageTVClient and is the same version as this one
Since:
7.0
 */
public static boolean IsClientPluginInstalledSameVersion (Object Plugin) {
  Object o = sagex.SageAPI.call("IsClientPluginInstalledSameVersion", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed into the locally running SageTVClient and is the same version as this one

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin has already been installed into the locally running SageTVClient and is the same version as this one
Since:
7.0
 */
public static boolean IsClientPluginInstalledSameVersion (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsClientPluginInstalledSameVersion", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin has already been installed and is enabled. This will also
 return true if the specified plugin does not support being enabled/disabled.

Parameters:
Plugin- the Plugin object to check, this should be from a call to GetInstalledPlugins or GetInstalledClientPlugins
Returns:
true if the specified plugin has already been installed and is enabled or it doesn't support being disabled, false otherwise
Since:
7.0
 */
public static boolean IsPluginEnabled (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginEnabled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed and is enabled. This will also
 return true if the specified plugin does not support being enabled/disabled.

Parameters:
Plugin- the Plugin object to check, this should be from a call to GetInstalledPlugins or GetInstalledClientPlugins
Returns:
true if the specified plugin has already been installed and is enabled or it doesn't support being disabled, false otherwise
Since:
7.0
 */
public static boolean IsPluginEnabled (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginEnabled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin has already been installed and is enabled; but the loading of it has failed.

Parameters:
Plugin- the Plugin object to check, this should be from a call to GetInstalledPlugins or GetInstalledClientPlugins
Returns:
true if the specified plugin has already been installed and is enabled and the loading of it failed, false otherwise
Since:
7.0
 */
public static boolean IsPluginFailed (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginFailed", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin has already been installed and is enabled; but the loading of it has failed.

Parameters:
Plugin- the Plugin object to check, this should be from a call to GetInstalledPlugins or GetInstalledClientPlugins
Returns:
true if the specified plugin has already been installed and is enabled and the loading of it failed, false otherwise
Since:
7.0
 */
public static boolean IsPluginFailed (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginFailed", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin is only supported in desktop environments (i.e. not on a headless server, placeshifter or extender)

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin is only supported in desktop environments, false otherwise
Since:
7.0
 */
public static boolean IsPluginDesktopOnly (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginDesktopOnly", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin is only supported in desktop environments (i.e. not on a headless server, placeshifter or extender)

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin is only supported in desktop environments, false otherwise
Since:
7.0
 */
public static boolean IsPluginDesktopOnly (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginDesktopOnly", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified plugin is tagged as a 'beta' version.

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin is tagged as a 'beta' version, false otherwise
Since:
7.0
 */
public static boolean IsPluginBeta (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginBeta", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin is tagged as a 'beta' version.

Parameters:
Plugin- the Plugin object to check
Returns:
true if the specified plugin is tagged as a 'beta' version, false otherwise
Since:
7.0
 */
public static boolean IsPluginBeta (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginBeta", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Refreshes the plugin repository list by contacting the server to ensure it is up to date (this is done automatically
 on a regular basis)

Since:
7.0
 */
public static void RefreshAvailablePlugins () {
   sagex.SageAPI.call("RefreshAvailablePlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Refreshes the plugin repository list by contacting the server to ensure it is up to date (this is done automatically
 on a regular basis)

Since:
7.0
 */
public static void RefreshAvailablePlugins (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "RefreshAvailablePlugins", (Object[])null);
}

/**
Returns whether the specified plugin can be enabled/disabled. Only 'Standard' type plugins w/ an implementation class and STVIs can be enabled/disabled.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified plugin can be enabled/disabled, false otherwise
Since:
7.0
 */
public static boolean CanPluginBeDisabled (Object Plugin) {
  Object o = sagex.SageAPI.call("CanPluginBeDisabled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether the specified plugin can be enabled/disabled. Only 'Standard' type plugins w/ an implementation class and STVIs can be enabled/disabled.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified plugin can be enabled/disabled, false otherwise
Since:
7.0
 */
public static boolean CanPluginBeDisabled (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "CanPluginBeDisabled", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the displayable name of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the displayable name of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginName (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginName", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the displayable name of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the displayable name of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginName (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginName", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the unique identifier of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the unique identifier of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginIdentifier (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginIdentifier", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the unique identifier of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the unique identifier of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginIdentifier (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginIdentifier", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the author of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the author of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginAuthor (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginAuthor", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the author of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the author of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginAuthor (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginAuthor", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the release notes attached to this specific version of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the release notes attached to this specific version of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginReleaseNotes (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginReleaseNotes", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the release notes attached to this specific version of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the release notes attached to this specific version of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginReleaseNotes (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginReleaseNotes", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the last modification date of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the last modification date of the specified Plugin object
Since:
7.0
 */
public static long GetPluginModificationDate (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginModificationDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the last modification date of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the last modification date of the specified Plugin object
Since:
7.0
 */
public static long GetPluginModificationDate (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginModificationDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the creation date of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the creation date of the specified Plugin object
Since:
7.0
 */
public static long GetPluginCreationDate (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginCreationDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the creation date of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the creation date of the specified Plugin object
Since:
7.0
 */
public static long GetPluginCreationDate (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginCreationDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the date the specified Plugin object was installed

Parameters:
Plugin- the specified Plugin object (must be an 'installed' Plugin object and not a 'repository' one)
Returns:
the date the specified Plugin object was installed
Since:
7.0
 */
public static long GetPluginInstallDate (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginInstallDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the date the specified Plugin object was installed

Parameters:
Plugin- the specified Plugin object (must be an 'installed' Plugin object and not a 'repository' one)
Returns:
the date the specified Plugin object was installed
Since:
7.0
 */
public static long GetPluginInstallDate (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginInstallDate", new Object[] {Plugin});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the description of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the description of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginDescription (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginDescription", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the description of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the description of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginDescription (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginDescription", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the version of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the version of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginVersion (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginVersion", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the version of the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the version of the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginVersion (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginVersion", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the relative path to resources used by the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the relative path to resources used by the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginResourcePath (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginResourcePath", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the relative path to resources used by the specified Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
the relative path to resources used by the specified Plugin object
Since:
7.0
 */
public static java.lang.String GetPluginResourcePath (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginResourcePath", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns an array of URLs to screenshots for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to screenshots for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginScreenshots (Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginScreenshots", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns an array of URLs to screenshots for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to screenshots for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginScreenshots (UIContext _uicontext,Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginScreenshots", new Object[] {Plugin});
}

/**
Returns an array of URLs to demo videos for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to demo videos for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginDemoVideos (Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginDemoVideos", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns an array of URLs to demo videos for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to demo videos for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginDemoVideos (UIContext _uicontext,Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginDemoVideos", new Object[] {Plugin});
}

/**
Returns an array of URLs to websites for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to websites for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginWebsites (Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginWebsites", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns an array of URLs to websites for the specified plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
an array of URLs to websites for the specified plugin object
Since:
7.0
 */
public static java.lang.String[] GetPluginWebsites (UIContext _uicontext,Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginWebsites", new Object[] {Plugin});
}

/**
Returns the type of the specified plugin object. This wil be one of "Standard", "Theme", "STV",
 "STVI", "Library" or "Images". The empty string will be returned if an invalid argument is supplied.

Parameters:
Plugin- the specified Plugin object
Returns:
the type of the specified plugin object
Since:
7.0
 */
public static java.lang.String GetPluginType (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginType", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the type of the specified plugin object. This wil be one of "Standard", "Theme", "STV",
 "STVI", "Library" or "Images". The empty string will be returned if an invalid argument is supplied.

Parameters:
Plugin- the specified Plugin object
Returns:
the type of the specified plugin object
Since:
7.0
 */
public static java.lang.String GetPluginType (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginType", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns an array of Strings which specifies the dependencies of this plugin. These strings
 will be descriptive and indicate the type of dependency (i.e. STV, Plugin, OS or Desktop) and
 the specifics of that dependency.

Parameters:
Plugin- the specified Plugin object
Returns:
an array of Strings which specifies the dependencies of this plugin
Since:
7.0
 */
public static java.lang.String[] GetPluginDependencies (Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginDependencies", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns an array of Strings which specifies the dependencies of this plugin. These strings
 will be descriptive and indicate the type of dependency (i.e. STV, Plugin, OS or Desktop) and
 the specifics of that dependency.

Parameters:
Plugin- the specified Plugin object
Returns:
an array of Strings which specifies the dependencies of this plugin
Since:
7.0
 */
public static java.lang.String[] GetPluginDependencies (UIContext _uicontext,Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginDependencies", new Object[] {Plugin});
}

/**
Returns true if the specified object is a Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified object is a Plugin object, false otherwise
Since:
7.0
 */
public static boolean IsPluginObject (java.lang.Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginObject", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified object is a Plugin object

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified object is a Plugin object, false otherwise
Since:
7.0
 */
public static boolean IsPluginObject (UIContext _uicontext,java.lang.Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginObject", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Disables the specified Plugin if it can be disabled. Some plugins, like Themes and STVs are disabled by simply selecting
 an alternate Theme or STV, so those do not have the ability to be 'disabled' in the sense that this API call refers to.

Parameters:
Plugin- the specified Plugin object
Returns:
true if disabling the plugin succeeded; if it fails its because there's another plugin dependent on it
Since:
7.0
 */
public static boolean DisablePlugin (Object Plugin) {
  Object o = sagex.SageAPI.call("DisablePlugin", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Disables the specified Plugin if it can be disabled. Some plugins, like Themes and STVs are disabled by simply selecting
 an alternate Theme or STV, so those do not have the ability to be 'disabled' in the sense that this API call refers to.

Parameters:
Plugin- the specified Plugin object
Returns:
true if disabling the plugin succeeded; if it fails its because there's another plugin dependent on it
Since:
7.0
 */
public static boolean DisablePlugin (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "DisablePlugin", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Enables the specified Plugin if it can be enabled/disabled.

Parameters:
Plugin- the specified Plugin object
Returns:
true if it was successfully enabled, false otherwise; this will also return true even if the plugin does not have the ability to be enabled/disabled
Since:
7.0
 */
public static boolean EnablePlugin (Object Plugin) {
  Object o = sagex.SageAPI.call("EnablePlugin", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Enables the specified Plugin if it can be enabled/disabled.

Parameters:
Plugin- the specified Plugin object
Returns:
true if it was successfully enabled, false otherwise; this will also return true even if the plugin does not have the ability to be enabled/disabled
Since:
7.0
 */
public static boolean EnablePlugin (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "EnablePlugin", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the reason why the specified Plugin object is incompatible and cannot be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the reason why the specified Plugin cannot be installed
Since:
7.0
 */
public static java.lang.String GetPluginIncompatabilityReason (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginIncompatabilityReason", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the reason why the specified Plugin object is incompatible and cannot be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the reason why the specified Plugin cannot be installed
Since:
7.0
 */
public static java.lang.String GetPluginIncompatabilityReason (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginIncompatabilityReason", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the reason why the specified Plugin object is incompatible and cannot be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts. This version of the API
 call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the reason why the specified Plugin cannot be installed
Since:
7.0
 */
public static java.lang.String GetClientPluginIncompatabilityReason (Object Plugin) {
  Object o = sagex.SageAPI.call("GetClientPluginIncompatabilityReason", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the reason why the specified Plugin object is incompatible and cannot be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts. This version of the API
 call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the reason why the specified Plugin cannot be installed
Since:
7.0
 */
public static java.lang.String GetClientPluginIncompatabilityReason (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetClientPluginIncompatabilityReason", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns whether or not the specified Plugin object is compatible and can be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified Plugin object is compatible and can be installed, false otherwise
Since:
7.0
 */
public static boolean IsPluginCompatible (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginCompatible", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether or not the specified Plugin object is compatible and can be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified Plugin object is compatible and can be installed, false otherwise
Since:
7.0
 */
public static boolean IsPluginCompatible (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginCompatible", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns whether or not the specified Plugin object is compatible and can be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts. This version of the API
 call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified Plugin object is compatible and can be installed, false otherwise
Since:
7.0
 */
public static boolean IsClientPluginCompatible (Object Plugin) {
  Object o = sagex.SageAPI.call("IsClientPluginCompatible", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether or not the specified Plugin object is compatible and can be installed. This can be due to
 operating system, desktop, STV, STV Version or plugin dependency version conflicts. This version of the API
 call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified Plugin object is compatible and can be installed, false otherwise
Since:
7.0
 */
public static boolean IsClientPluginCompatible (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsClientPluginCompatible", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Installs or upgrades the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String InstallPlugin (Object Plugin) {
  Object o = sagex.SageAPI.call("InstallPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Installs or upgrades the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String InstallPlugin (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "InstallPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Installs or upgrades the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.
 This version of the API call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String InstallClientPlugin (Object Plugin) {
  Object o = sagex.SageAPI.call("InstallClientPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Installs or upgrades the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.
 This version of the API call relates to installation on non-localhost connected SageTVClients.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String InstallClientPlugin (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "InstallClientPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Uninstalls the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.
 Failure will also occur if other plugins are dependent on this plugin.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String UninstallPlugin (Object Plugin) {
  Object o = sagex.SageAPI.call("UninstallPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Uninstalls the specified Plugin. If there's a failure in doing so
 or a restart of SageTV is required after installing the plugin; the return value will indicate that.
 Failure will also occur if other plugins are dependent on this plugin.

Parameters:
Plugin- the specified Plugin object
Returns:
a String describing the install result; this will be "OK" if it was successful, "RESTART" if it was successful but a restart of SageTV is required or "FAILED - XXX" if a failure occurred with XXX describing the reason why
Since:
7.0
 */
public static java.lang.String UninstallPlugin (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "UninstallPlugin", new Object[] {Plugin});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a progress based status message regarding any current plugin installation. There is no progress messages
 for plugin uninstalls since they should happen relatively quickly.

Returns:
a String describing the current progress of plugin installation, or an empty string if its not currently in progress
Since:
7.0
 */
public static java.lang.String GetPluginProgress () {
  Object o = sagex.SageAPI.call("GetPluginProgress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a progress based status message regarding any current plugin installation. There is no progress messages
 for plugin uninstalls since they should happen relatively quickly.

Returns:
a String describing the current progress of plugin installation, or an empty string if its not currently in progress
Since:
7.0
 */
public static java.lang.String GetPluginProgress (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginProgress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a progress based status message regarding any current plugin installation. This is for non-localhost connected
 SageTVClients regarding client plugin installation. There is no progress messages
 for plugin uninstalls since they should happen relatively quickly.

Returns:
a String describing the current progress of plugin installation, or an empty string if its not currently in progress
Since:
7.0
 */
public static java.lang.String GetClientPluginProgress () {
  Object o = sagex.SageAPI.call("GetClientPluginProgress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a progress based status message regarding any current plugin installation. This is for non-localhost connected
 SageTVClients regarding client plugin installation. There is no progress messages
 for plugin uninstalls since they should happen relatively quickly.

Returns:
a String describing the current progress of plugin installation, or an empty string if its not currently in progress
Since:
7.0
 */
public static java.lang.String GetClientPluginProgress (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetClientPluginProgress", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if this instance of SageTV supports installation of client plugins. This is true for SageTVClient applications
 that are not running on the same machine as the SageTV server itself. If they are running on the same machine; then their 
 installations will be shared.

Returns:
true if this instance of SageTV supports installation of client plugins, false otherwise
Since:
7.0
 */
public static boolean AreClientPluginsSupported () {
  Object o = sagex.SageAPI.call("AreClientPluginsSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this instance of SageTV supports installation of client plugins. This is true for SageTVClient applications
 that are not running on the same machine as the SageTV server itself. If they are running on the same machine; then their 
 installations will be shared.

Returns:
true if this instance of SageTV supports installation of client plugins, false otherwise
Since:
7.0
 */
public static boolean AreClientPluginsSupported (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "AreClientPluginsSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a list of the setting names for the specified Plugin object. These are not suitable for
 display; but should be used as the 'SettingName' for any of the plugin setting operations.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
Returns:
a String[] of the setting names for the specified Plugin object, a zero-length array will be returned if this Plugin has no configuration settings
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigSettings (Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginConfigSettings", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Returns a list of the setting names for the specified Plugin object. These are not suitable for
 display; but should be used as the 'SettingName' for any of the plugin setting operations.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
Returns:
a String[] of the setting names for the specified Plugin object, a zero-length array will be returned if this Plugin has no configuration settings
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigSettings (UIContext _uicontext,Object Plugin) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginConfigSettings", new Object[] {Plugin});
}

/**
Gets the current value for the specified configuration setting for the specified Plugin object. 
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which represents the current value of the specified setting
Since:
7.0
 */
public static java.lang.String GetPluginConfigValue (Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call("GetPluginConfigValue", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the current value for the specified configuration setting for the specified Plugin object. 
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which represents the current value of the specified setting
Since:
7.0
 */
public static java.lang.String GetPluginConfigValue (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginConfigValue", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the current values for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String[] which represents the current values of the specified setting
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigValues (Object Plugin, java.lang.String SettingName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginConfigValues", new Object[] {Plugin,SettingName});
}

/**
 * UI Context Aware Call<br/>
Gets the current values for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String[] which represents the current values of the specified setting
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigValues (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginConfigValues", new Object[] {Plugin,SettingName});
}

/**
Gets the setting type for the specified configuration setting for the specified Plugin object.
 The possible values are "Boolean", "Integer", "Text", "Choice", "Multichoice", "File", "Directory", "Button" or "Password".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which represents the type of the specified setting, the empty string will be returned if the call is invalid
Since:
7.0
 */
public static java.lang.String GetPluginConfigType (Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call("GetPluginConfigType", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the setting type for the specified configuration setting for the specified Plugin object.
 The possible values are "Boolean", "Integer", "Text", "Choice", "Multichoice", "File", "Directory", "Button" or "Password".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which represents the type of the specified setting, the empty string will be returned if the call is invalid
Since:
7.0
 */
public static java.lang.String GetPluginConfigType (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginConfigType", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the value for the specified configuration setting for the specified Plugin object.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
SettingValue- the value to set the configuration setting to
Returns:
null on success, or if an exception occurred while setting the value, a string representation of the exception will be returned
Since:
7.0
 */
public static java.lang.String SetPluginConfigValue (Object Plugin, java.lang.String SettingName, java.lang.String SettingValue) {
  Object o = sagex.SageAPI.call("SetPluginConfigValue", new Object[] {Plugin,SettingName,SettingValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Sets the value for the specified configuration setting for the specified Plugin object.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
SettingValue- the value to set the configuration setting to
Returns:
null on success, or if an exception occurred while setting the value, a string representation of the exception will be returned
Since:
7.0
 */
public static java.lang.String SetPluginConfigValue (UIContext _uicontext,Object Plugin, java.lang.String SettingName, java.lang.String SettingValue) {
  Object o = sagex.SageAPI.call(_uicontext, "SetPluginConfigValue", new Object[] {Plugin,SettingName,SettingValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the values for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
SettingValues- the values to set the configuration setting to
Returns:
null on success, or if an exception occurred while setting the value, a string representation of the exception will be returned
Since:
7.0
 */
public static java.lang.String SetPluginConfigValues (Object Plugin, java.lang.String SettingName, java.lang.String[] SettingValues) {
  Object o = sagex.SageAPI.call("SetPluginConfigValues", new Object[] {Plugin,SettingName,SettingValues});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Sets the values for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice".
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
SettingValues- the values to set the configuration setting to
Returns:
null on success, or if an exception occurred while setting the value, a string representation of the exception will be returned
Since:
7.0
 */
public static java.lang.String SetPluginConfigValues (UIContext _uicontext,Object Plugin, java.lang.String SettingName, java.lang.String[] SettingValues) {
  Object o = sagex.SageAPI.call(_uicontext, "SetPluginConfigValues", new Object[] {Plugin,SettingName,SettingValues});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets all the options available for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice" or "Choice". These are the different choices
 that the user will select from. Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String[] which represents all of the choice options for the specified setting
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigOptions (Object Plugin, java.lang.String SettingName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetPluginConfigOptions", new Object[] {Plugin,SettingName});
}

/**
 * UI Context Aware Call<br/>
Gets all the options available for the specified configuration setting for the specified Plugin object.
 This should be used for plugin settings of type "Multichoice" or "Choice". These are the different choices
 that the user will select from. Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String[] which represents all of the choice options for the specified setting
Since:
7.0
 */
public static java.lang.String[] GetPluginConfigOptions (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPluginConfigOptions", new Object[] {Plugin,SettingName});
}

/**
Gets the help text to describe the specified configuration setting for the specified Plugin object. 
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which is help text to further describe the specified setting
Since:
7.0
 */
public static java.lang.String GetPluginConfigHelpText (Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call("GetPluginConfigHelpText", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the help text to describe the specified configuration setting for the specified Plugin object. 
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which is help text to further describe the specified setting
Since:
7.0
 */
public static java.lang.String GetPluginConfigHelpText (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginConfigHelpText", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the label to describe the specified configuration setting for the specified Plugin object. 
 This should be used for UI display when presenting this setting to the user instead of the SettingName.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which is a label to describe the specified setting in the UI
Since:
7.0
 */
public static java.lang.String GetPluginConfigLabel (Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call("GetPluginConfigLabel", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the label to describe the specified configuration setting for the specified Plugin object. 
 This should be used for UI display when presenting this setting to the user instead of the SettingName.
 Only enabled plugins can be configured.

Parameters:
Plugin- the specified Plugin object
SettingName- the name of the plugin configuration setting
Returns:
a String which is a label to describe the specified setting in the UI
Since:
7.0
 */
public static java.lang.String GetPluginConfigLabel (UIContext _uicontext,Object Plugin, java.lang.String SettingName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginConfigLabel", new Object[] {Plugin,SettingName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Resets the configuration for the specified plugin. If this is called on a disabled plugin, then next time it
 is enabled the configuration will be reset.

Parameters:
Plugin- the specified Plugin object
Since:
7.0
 */
public static void ResetPluginConfiguration (Object Plugin) {
   sagex.SageAPI.call("ResetPluginConfiguration", new Object[] {Plugin});
}

/**
 * UI Context Aware Call<br/>
Resets the configuration for the specified plugin. If this is called on a disabled plugin, then next time it
 is enabled the configuration will be reset.

Parameters:
Plugin- the specified Plugin object
Since:
7.0
 */
public static void ResetPluginConfiguration (UIContext _uicontext,Object Plugin) {
   sagex.SageAPI.call(_uicontext, "ResetPluginConfiguration", new Object[] {Plugin});
}

/**
Returns true if the specified plugin can be configured when enabled. If it is disabled, it can still have its configuration reset.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified plugin can be configured when enabled; if it is disabled, it can still have its configuration reset
Since:
7.0
 */
public static boolean IsPluginConfigurable (Object Plugin) {
  Object o = sagex.SageAPI.call("IsPluginConfigurable", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified plugin can be configured when enabled. If it is disabled, it can still have its configuration reset.

Parameters:
Plugin- the specified Plugin object
Returns:
true if the specified plugin can be configured when enabled; if it is disabled, it can still have its configuration reset
Since:
7.0
 */
public static boolean IsPluginConfigurable (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginConfigurable", new Object[] {Plugin});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the actual object that implements the sage.SageTVPlugin interface for the specified Plugin. This will only be valid
 if the Plugin has an actual implementation and is being called on a plugin that is valid in this context (i.e. you can't call it on a 
 server plugin in the client JVM). DO NOT use this object to start/stop or perform other behaviors that are normally done by the
 SageTV core on that object.

Parameters:
Plugin- the specified Plugin object
Returns:
the actual plugin implementation object for the specified plugin, or null if it can't be obtained or doesn't exist
Since:
7.0
 */
public static Object GetPluginImplementation (Object Plugin) {
  Object o = sagex.SageAPI.call("GetPluginImplementation", new Object[] {Plugin});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the actual object that implements the sage.SageTVPlugin interface for the specified Plugin. This will only be valid
 if the Plugin has an actual implementation and is being called on a plugin that is valid in this context (i.e. you can't call it on a 
 server plugin in the client JVM). DO NOT use this object to start/stop or perform other behaviors that are normally done by the
 SageTV core on that object.

Parameters:
Plugin- the specified Plugin object
Returns:
the actual plugin implementation object for the specified plugin, or null if it can't be obtained or doesn't exist
Since:
7.0
 */
public static Object GetPluginImplementation (UIContext _uicontext,Object Plugin) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPluginImplementation", new Object[] {Plugin});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true once all of the core plugins that are enabled have completed their startup process. This can be useful because
 plugins are loaded asynchronously with the UI and sometimes a UI needs to wait for their startup process to be completed before it loads.
 For client instances; this will return true once client and server plugin startup has completed.

Returns:
true once all of the core plugins that are enabled have completed their startup process, false otherwise
Since:
7.0
 */
public static boolean IsPluginStartupComplete () {
  Object o = sagex.SageAPI.call("IsPluginStartupComplete", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true once all of the core plugins that are enabled have completed their startup process. This can be useful because
 plugins are loaded asynchronously with the UI and sometimes a UI needs to wait for their startup process to be completed before it loads.
 For client instances; this will return true once client and server plugin startup has completed.

Returns:
true once all of the core plugins that are enabled have completed their startup process, false otherwise
Since:
7.0
 */
public static boolean IsPluginStartupComplete (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPluginStartupComplete", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

}
