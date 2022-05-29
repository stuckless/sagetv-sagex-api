package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/Security.html'>Security</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class Security {
/**
Returns the name of the current security profile for the UI client making the API call.

Returns:
the name of the current security profile for the UI client making the API call, returns null if there's no valid UI context for this call
Since:
7.1
 */
public static java.lang.String GetActiveSecurityProfile () {
  Object o = sagex.SageAPI.call("GetActiveSecurityProfile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the current security profile for the UI client making the API call.

Returns:
the name of the current security profile for the UI client making the API call, returns null if there's no valid UI context for this call
Since:
7.1
 */
public static java.lang.String GetActiveSecurityProfile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetActiveSecurityProfile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of the default security profile to use when a new client connects that does not have an associated security profile.

Returns:
the name of the default security profile to use when a new client connects that does not have an associated security profile
Since:
7.1
 */
public static java.lang.String GetDefaultSecurityProfile () {
  Object o = sagex.SageAPI.call("GetDefaultSecurityProfile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the default security profile to use when a new client connects that does not have an associated security profile.

Returns:
the name of the default security profile to use when a new client connects that does not have an associated security profile
Since:
7.1
 */
public static java.lang.String GetDefaultSecurityProfile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDefaultSecurityProfile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the current security profile for the UI client making the API call.

Parameters:
Profile- the name of the security profile
Returns:
true if the call succeeded; false if the specified profile does not exist or there is no valid UI context for this call
Since:
7.1
 */
public static boolean SetActiveSecurityProfile (java.lang.String Profile) {
  Object o = sagex.SageAPI.call("SetActiveSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the name of the current security profile for the UI client making the API call.

Parameters:
Profile- the name of the security profile
Returns:
true if the call succeeded; false if the specified profile does not exist or there is no valid UI context for this call
Since:
7.1
 */
public static boolean SetActiveSecurityProfile (UIContext _uicontext,java.lang.String Profile) {
  Object o = sagex.SageAPI.call(_uicontext, "SetActiveSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the name of the default security profile to use when a new client connects that does not have an associated security profile.

Parameters:
Profile- the name of the default security profile to use when a new client connects that does not have an associated security profile
Returns:
true if the call succeeds, false if the specified profile does not exist
Since:
7.1
 */
public static boolean SetDefaultSecurityProfile (java.lang.String Profile) {
  Object o = sagex.SageAPI.call("SetDefaultSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the name of the default security profile to use when a new client connects that does not have an associated security profile.

Parameters:
Profile- the name of the default security profile to use when a new client connects that does not have an associated security profile
Returns:
true if the call succeeds, false if the specified profile does not exist
Since:
7.1
 */
public static boolean SetDefaultSecurityProfile (UIContext _uicontext,java.lang.String Profile) {
  Object o = sagex.SageAPI.call(_uicontext, "SetDefaultSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the names of the different security profiles.

Returns:
the names of the different security profiles
Since:
7.1
 */
public static java.lang.String[] GetSecurityProfiles () {
  return (java.lang.String[]) sagex.SageAPI.call("GetSecurityProfiles", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the names of the different security profiles.

Returns:
the names of the different security profiles
Since:
7.1
 */
public static java.lang.String[] GetSecurityProfiles (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSecurityProfiles", (Object[])null);
}

/**
Adds a new security profile with the specified name. Unless this profile existed before; all permissions will default to false. If the
 profile existed before; it's old settings will be the initial settings for this new profile.

Parameters:
Profile- the name for the new security profile
Returns:
true if this was added as a new security profile, false otherwise (it'll only fail if the name is already in use)
Since:
7.1
 */
public static boolean AddSecurityProfile (java.lang.String Profile) {
  Object o = sagex.SageAPI.call("AddSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Adds a new security profile with the specified name. Unless this profile existed before; all permissions will default to false. If the
 profile existed before; it's old settings will be the initial settings for this new profile.

Parameters:
Profile- the name for the new security profile
Returns:
true if this was added as a new security profile, false otherwise (it'll only fail if the name is already in use)
Since:
7.1
 */
public static boolean AddSecurityProfile (UIContext _uicontext,java.lang.String Profile) {
  Object o = sagex.SageAPI.call(_uicontext, "AddSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Removes the security profile with the specified name. You cannot remove the Administrator profile. If a user session is currently
 active under the profile being removed; it will continue to remain active under that profile with the current permissions until that
 user session expires.

Parameters:
Profile- the name for the security profile to remove
Returns:
true if this was removed as a security profile, false otherwise (it'll only fail if the name isn't in use or is Administrator)
Since:
7.1
 */
public static boolean RemoveSecurityProfile (java.lang.String Profile) {
  Object o = sagex.SageAPI.call("RemoveSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Removes the security profile with the specified name. You cannot remove the Administrator profile. If a user session is currently
 active under the profile being removed; it will continue to remain active under that profile with the current permissions until that
 user session expires.

Parameters:
Profile- the name for the security profile to remove
Returns:
true if this was removed as a security profile, false otherwise (it'll only fail if the name isn't in use or is Administrator)
Since:
7.1
 */
public static boolean RemoveSecurityProfile (UIContext _uicontext,java.lang.String Profile) {
  Object o = sagex.SageAPI.call(_uicontext, "RemoveSecurityProfile", new Object[] {Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a list of all the predefined permission names. Plugins are free to define their own new permissions using any string they like;
 but those will not be returned from this API call.

Returns:
a list of all the predefined permission names
Since:
7.1
 */
public static java.lang.String[] GetPredefinedPermissions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetPredefinedPermissions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of all the predefined permission names. Plugins are free to define their own new permissions using any string they like;
 but those will not be returned from this API call.

Returns:
a list of all the predefined permission names
Since:
7.1
 */
public static java.lang.String[] GetPredefinedPermissions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetPredefinedPermissions", (Object[])null);
}

/**
Sets whether or not a permission is allowed under a specific security profile.

Parameters:
Permission- the name of the permission to set
Profile- the name of the security profile this permission applies to
Allowed- true if the permission should be granted, false if it should be denied
Since:
7.1
 */
public static void SetPermission (java.lang.String Permission, java.lang.String Profile, boolean Allowed) {
   sagex.SageAPI.call("SetPermission", new Object[] {Permission,Profile,Allowed});
}

/**
 * UI Context Aware Call<br>
Sets whether or not a permission is allowed under a specific security profile.

Parameters:
Permission- the name of the permission to set
Profile- the name of the security profile this permission applies to
Allowed- true if the permission should be granted, false if it should be denied
Since:
7.1
 */
public static void SetPermission (UIContext _uicontext,java.lang.String Permission, java.lang.String Profile, boolean Allowed) {
   sagex.SageAPI.call(_uicontext, "SetPermission", new Object[] {Permission,Profile,Allowed});
}

/**
Returns true if the specified permission is allowed under the specified security profile. If this permission has not
 been explicitly set to false for that profile; this method will return true. The return value is undefined if the specified profile is invalid.

Parameters:
Permission- the name of the permission
Profile- the of the security profile
Returns:
false if the specified permission is denied under the specified profile, true otherwise
Since:
7.1
 */
public static boolean HasPermission (java.lang.String Permission, java.lang.String Profile) {
  Object o = sagex.SageAPI.call("HasPermission", new Object[] {Permission,Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified permission is allowed under the specified security profile. If this permission has not
 been explicitly set to false for that profile; this method will return true. The return value is undefined if the specified profile is invalid.

Parameters:
Permission- the name of the permission
Profile- the of the security profile
Returns:
false if the specified permission is denied under the specified profile, true otherwise
Since:
7.1
 */
public static boolean HasPermission (UIContext _uicontext,java.lang.String Permission, java.lang.String Profile) {
  Object o = sagex.SageAPI.call(_uicontext, "HasPermission", new Object[] {Permission,Profile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified permission is allowed under the security profile active for the UI making this API call. If this permission has not
 been explicitly set to false for that profile; this method will return true.

Parameters:
Permission- the name of the permission
Returns:
false if the specified permission is denied under the active security profile or if the current context has no security profile, true otherwise
Since:
7.1
 */
public static boolean HasPermission (java.lang.String Permission) {
  Object o = sagex.SageAPI.call("HasPermission", new Object[] {Permission});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified permission is allowed under the security profile active for the UI making this API call. If this permission has not
 been explicitly set to false for that profile; this method will return true.

Parameters:
Permission- the name of the permission
Returns:
false if the specified permission is denied under the active security profile or if the current context has no security profile, true otherwise
Since:
7.1
 */
public static boolean HasPermission (UIContext _uicontext,java.lang.String Permission) {
  Object o = sagex.SageAPI.call(_uicontext, "HasPermission", new Object[] {Permission});
  if (o!=null) return (Boolean) o;
  return false;
}

}
