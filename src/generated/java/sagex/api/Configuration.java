package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 7:30 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/Configuration.html'>Configuration</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class Configuration {
/**
Saves the Sage.properties file to disk
 */
public static void SaveProperties () {
   sagex.SageAPI.call("SaveProperties", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Saves the Sage.properties file to disk
 */
public static void SaveProperties (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SaveProperties", (Object[])null);
}

/**
Returns all of the library import paths that are currently configured for all media types

Returns:
the library import paths that are currently configured for all media types
 */
public static java.io.File[] GetLibraryImportPaths () {
  return (java.io.File[]) sagex.SageAPI.call("GetLibraryImportPaths", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns all of the library import paths that are currently configured for all media types

Returns:
the library import paths that are currently configured for all media types
 */
public static java.io.File[] GetLibraryImportPaths (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetLibraryImportPaths", (Object[])null);
}

/**
Returns the library import paths that are currently configured for picture files

Returns:
the library import paths that are currently configured for picture files
 */
public static java.io.File[] GetPictureLibraryImportPaths () {
  return (java.io.File[]) sagex.SageAPI.call("GetPictureLibraryImportPaths", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the library import paths that are currently configured for picture files

Returns:
the library import paths that are currently configured for picture files
 */
public static java.io.File[] GetPictureLibraryImportPaths (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetPictureLibraryImportPaths", (Object[])null);
}

/**
Returns the library import paths that are currently configured for music files

Returns:
the library import paths that are currently configured for music files
 */
public static java.io.File[] GetMusicLibraryImportPaths () {
  return (java.io.File[]) sagex.SageAPI.call("GetMusicLibraryImportPaths", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the library import paths that are currently configured for music files

Returns:
the library import paths that are currently configured for music files
 */
public static java.io.File[] GetMusicLibraryImportPaths (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetMusicLibraryImportPaths", (Object[])null);
}

/**
Returns the library import paths that are currently configured for video files

Returns:
the library import paths that are currently configured for video files
 */
public static java.io.File[] GetVideoLibraryImportPaths () {
  return (java.io.File[]) sagex.SageAPI.call("GetVideoLibraryImportPaths", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the library import paths that are currently configured for video files

Returns:
the library import paths that are currently configured for video files
 */
public static java.io.File[] GetVideoLibraryImportPaths (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetVideoLibraryImportPaths", (Object[])null);
}

/**
Deprecated. 

Returns true if the legacy major/minor channel tuning is enabled. Do not use anymore

Returns:
true if the legacy major/minor channel tuning is enabled
 */
public static boolean IsMajorMinorDTVChannelTuningEnabled () {
  Object o = sagex.SageAPI.call("IsMajorMinorDTVChannelTuningEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Returns true if the legacy major/minor channel tuning is enabled. Do not use anymore

Returns:
true if the legacy major/minor channel tuning is enabled
 */
public static boolean IsMajorMinorDTVChannelTuningEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMajorMinorDTVChannelTuningEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if SageTV should attempt to autodial before accessing the Internet

Returns:
true if SageTV should attempt to autodial before accessing the Internet
 */
public static boolean GetAutodialForInternet () {
  Object o = sagex.SageAPI.call("GetAutodialForInternet", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV should attempt to autodial before accessing the Internet

Returns:
true if SageTV should attempt to autodial before accessing the Internet
 */
public static boolean GetAutodialForInternet (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAutodialForInternet", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not SageTV should autodial before accessing the Internet

Parameters:
Autodial- true if SageTV should autodial before accessing the Internet
 */
public static void SetAutodialForInternet (boolean Autodial) {
   sagex.SageAPI.call("SetAutodialForInternet", new Object[] {Autodial});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV should autodial before accessing the Internet

Parameters:
Autodial- true if SageTV should autodial before accessing the Internet
 */
public static void SetAutodialForInternet (UIContext _uicontext,boolean Autodial) {
   sagex.SageAPI.call(_uicontext, "SetAutodialForInternet", new Object[] {Autodial});
}

/**
Deprecated. 

Returns true if the Provideo 256 Pentium 4 fix is enabled

Returns:
true if the Provideo 256 Pentium 4 fix is enabled
 */
public static boolean IsProvideoPentium4FixEnabled () {
  Object o = sagex.SageAPI.call("IsProvideoPentium4FixEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Returns true if the Provideo 256 Pentium 4 fix is enabled

Returns:
true if the Provideo 256 Pentium 4 fix is enabled
 */
public static boolean IsProvideoPentium4FixEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsProvideoPentium4FixEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Deprecated. 

Sets whether or not the Provideo 256 Pentium 4 fix should be enabled

Parameters:
Enabled- true if the Provideo 256 Pentium 4 fix should be enabled
 */
public static void SetProvideoPentium4FixEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetProvideoPentium4FixEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Sets whether or not the Provideo 256 Pentium 4 fix should be enabled

Parameters:
Enabled- true if the Provideo 256 Pentium 4 fix should be enabled
 */
public static void SetProvideoPentium4FixEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetProvideoPentium4FixEnabled", new Object[] {Enabled});
}

/**
Gets the list of infrared tuning plugins that are available for use with SageTV

Returns:
the list of infrared tuning plugins that are available for use with SageTV
 */
public static java.lang.String[] GetInfraredTuningPlugins () {
  return (java.lang.String[]) sagex.SageAPI.call("GetInfraredTuningPlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of infrared tuning plugins that are available for use with SageTV

Returns:
the list of infrared tuning plugins that are available for use with SageTV
 */
public static java.lang.String[] GetInfraredTuningPlugins (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetInfraredTuningPlugins", (Object[])null);
}

/**
Gets the names of the 'Remote Controls' which correspond to external devices that can be controlled with the specified plugin

Parameters:
PluginName- the name of the infrared tuning plugin to get the remotes for
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
Returns:
the names of the 'Remotes' which correspond to external devices that can be controlled by the specified plugin on the specified port
 */
public static java.lang.String[] GetRemotesForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber) {
  return (java.lang.String[]) sagex.SageAPI.call("GetRemotesForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber});
}

/**
 * UI Context Aware Call<br>
Gets the names of the 'Remote Controls' which correspond to external devices that can be controlled with the specified plugin

Parameters:
PluginName- the name of the infrared tuning plugin to get the remotes for
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
Returns:
the names of the 'Remotes' which correspond to external devices that can be controlled by the specified plugin on the specified port
 */
public static java.lang.String[] GetRemotesForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetRemotesForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber});
}

/**
Creates a new 'Remote Control' with the specified name for the specified plugin. Depending upon the plugin, this may require
 the user to perform some interaction before it returns.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name to use for the newly created 'Remote Control'
Returns:
the RemoteName parameter will be returned if a new 'Remote Control' is created, null will be returned if one already exists with that name
 */
public static java.lang.String AddRemoteForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("AddRemoteForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a new 'Remote Control' with the specified name for the specified plugin. Depending upon the plugin, this may require
 the user to perform some interaction before it returns.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name to use for the newly created 'Remote Control'
Returns:
the RemoteName parameter will be returned if a new 'Remote Control' is created, null will be returned if one already exists with that name
 */
public static java.lang.String AddRemoteForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "AddRemoteForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Informs an infrared tuning plugin that it should go into the learn mode to learn a new command. This call will return after the user has
 given the hardware the appropriate input it is looking for.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' that the command is being learned from
CommandName- the name of the command being sent from the remote control
Returns:
true if the command was successfully learned, false otherwise
 */
public static boolean LearnCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String CommandName) {
  Object o = sagex.SageAPI.call("LearnCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,CommandName});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Informs an infrared tuning plugin that it should go into the learn mode to learn a new command. This call will return after the user has
 given the hardware the appropriate input it is looking for.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' that the command is being learned from
CommandName- the name of the command being sent from the remote control
Returns:
true if the command was successfully learned, false otherwise
 */
public static boolean LearnCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String CommandName) {
  Object o = sagex.SageAPI.call(_uicontext, "LearnCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,CommandName});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Renames a command for a remote control on an infrared tuning plugin

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' that the command is from
OldCommandName- the current name of the command
NewCommandName- the new name to rename this command to
 */
public static void RenameCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String OldCommandName, java.lang.String NewCommandName) {
   sagex.SageAPI.call("RenameCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,OldCommandName,NewCommandName});
}

/**
 * UI Context Aware Call<br>
Renames a command for a remote control on an infrared tuning plugin

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' that the command is from
OldCommandName- the current name of the command
NewCommandName- the new name to rename this command to
 */
public static void RenameCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String OldCommandName, java.lang.String NewCommandName) {
   sagex.SageAPI.call(_uicontext, "RenameCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,OldCommandName,NewCommandName});
}

/**
Removes a 'Remote Control' from an infrared tuning plugin. This will also delete all commands learned by that 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' to remove
 */
public static void RemoveRemoteForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
   sagex.SageAPI.call("RemoveRemoteForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
}

/**
 * UI Context Aware Call<br>
Removes a 'Remote Control' from an infrared tuning plugin. This will also delete all commands learned by that 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control' to remove
 */
public static void RemoveRemoteForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
   sagex.SageAPI.call(_uicontext, "RemoveRemoteForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
}

/**
Removes a command from a 'Remote Control' for an infrared tuning plugin. If the command had a learned code, that code will be lost.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
CommandName- the name of the command to remove
 */
public static void RemoveCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String CommandName) {
   sagex.SageAPI.call("RemoveCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,CommandName});
}

/**
 * UI Context Aware Call<br>
Removes a command from a 'Remote Control' for an infrared tuning plugin. If the command had a learned code, that code will be lost.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
CommandName- the name of the command to remove
 */
public static void RemoveCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String CommandName) {
   sagex.SageAPI.call(_uicontext, "RemoveCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,CommandName});
}

/**
Sets the maximum number of digits that are needed to tune a channel on the device that corresponds to the specified 'Remote Control'.
 For example, if you always need to push 3 numeric keys before the device would tune a channel (i.e. channels are from 1-999) then you
 would specify 3 here.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
NumberOfDigits- the maximum number of digits needed to tune a channel using the specified remote on this plugin
 */
public static void SetMaxChannelDigitsForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int NumberOfDigits) {
   sagex.SageAPI.call("SetMaxChannelDigitsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,NumberOfDigits});
}

/**
 * UI Context Aware Call<br>
Sets the maximum number of digits that are needed to tune a channel on the device that corresponds to the specified 'Remote Control'.
 For example, if you always need to push 3 numeric keys before the device would tune a channel (i.e. channels are from 1-999) then you
 would specify 3 here.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
NumberOfDigits- the maximum number of digits needed to tune a channel using the specified remote on this plugin
 */
public static void SetMaxChannelDigitsForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int NumberOfDigits) {
   sagex.SageAPI.call(_uicontext, "SetMaxChannelDigitsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,NumberOfDigits});
}

/**
Gets the maximum number of digits that are needed to tune a channel on the device that corresponds to the specified 'Remote Control'.
 For example, if you always need to push 3 numeric keys before the device would tune a channel (i.e. channels are from 1-999) then this
 should be 3.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the maximum number of digits needed to tune a channel using the specified remote on this plugin
 */
public static int GetMaxChannelDigitsForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetMaxChannelDigitsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the maximum number of digits that are needed to tune a channel on the device that corresponds to the specified 'Remote Control'.
 For example, if you always need to push 3 numeric keys before the device would tune a channel (i.e. channels are from 1-999) then this
 should be 3.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the maximum number of digits needed to tune a channel using the specified remote on this plugin
 */
public static int GetMaxChannelDigitsForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMaxChannelDigitsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the minimum delay in milliseconds that is required between sending consecutive commands using the specified 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
MsecDelay- the minimum required delay between commands in milliseconds
 */
public static void SetButtonDelayForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int MsecDelay) {
   sagex.SageAPI.call("SetButtonDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,MsecDelay});
}

/**
 * UI Context Aware Call<br>
Sets the minimum delay in milliseconds that is required between sending consecutive commands using the specified 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
MsecDelay- the minimum required delay between commands in milliseconds
 */
public static void SetButtonDelayForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int MsecDelay) {
   sagex.SageAPI.call(_uicontext, "SetButtonDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,MsecDelay});
}

/**
Gets the minimum delay in milliseconds that is required between sending consecutive commands using the specified 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the minimum required delay between commands in milliseconds
 */
public static int GetButtonDelayForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetButtonDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the minimum delay in milliseconds that is required between sending consecutive commands using the specified 'Remote Control'.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the minimum required delay between commands in milliseconds
 */
public static int GetButtonDelayForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetButtonDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the minimum delay in milliseconds that is required between the completion of a sequence of commands that represent a channel change
 and the start of a new sequence of commands that represent a channel change

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
MsecDelay- the minimum delay in milliseconds between finishing one channel change sequence and starting another when using the specified 'Remote Control'
 */
public static void SetSequenceDelayForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int MsecDelay) {
   sagex.SageAPI.call("SetSequenceDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,MsecDelay});
}

/**
 * UI Context Aware Call<br>
Sets the minimum delay in milliseconds that is required between the completion of a sequence of commands that represent a channel change
 and the start of a new sequence of commands that represent a channel change

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
MsecDelay- the minimum delay in milliseconds between finishing one channel change sequence and starting another when using the specified 'Remote Control'
 */
public static void SetSequenceDelayForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, int MsecDelay) {
   sagex.SageAPI.call(_uicontext, "SetSequenceDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,MsecDelay});
}

/**
Gets the minimum delay in milliseconds that is required between the completion of a sequence of commands that represent a channel change
 and the start of a new sequence of commands that represent a channel change

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the minimum delay in milliseconds between finishing one channel change sequence and starting another when using the specified 'Remote Control'
 */
public static int GetSequenceDelayForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetSequenceDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the minimum delay in milliseconds that is required between the completion of a sequence of commands that represent a channel change
 and the start of a new sequence of commands that represent a channel change

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the minimum delay in milliseconds between finishing one channel change sequence and starting another when using the specified 'Remote Control'
 */
public static int GetSequenceDelayForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSequenceDelayForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the command that is to be sent as the last command to complete a channel change sequence. This is for devices that require an
 'Enter' or other type of confirmation key to be pressed after the numeric channel codes are sent.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Command- the name of the command from this 'Remote Control' to use to confirm a channel change
 */
public static void SetConfirmCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String Command) {
   sagex.SageAPI.call("SetConfirmCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,Command});
}

/**
 * UI Context Aware Call<br>
Sets the command that is to be sent as the last command to complete a channel change sequence. This is for devices that require an
 'Enter' or other type of confirmation key to be pressed after the numeric channel codes are sent.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Command- the name of the command from this 'Remote Control' to use to confirm a channel change
 */
public static void SetConfirmCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String Command) {
   sagex.SageAPI.call(_uicontext, "SetConfirmCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,Command});
}

/**
Sets the command that is to be sent before a channel change sequence is started. This is for devices that require a
 'Power On' or 'Cancel' type of function to ensure the device is a responsive state.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Command- the name of the command from this 'Remote Control' to use to prefix a channel change
Since:
6.2
 */
public static void SetPrefixCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String Command) {
   sagex.SageAPI.call("SetPrefixCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,Command});
}

/**
 * UI Context Aware Call<br>
Sets the command that is to be sent before a channel change sequence is started. This is for devices that require a
 'Power On' or 'Cancel' type of function to ensure the device is a responsive state.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Command- the name of the command from this 'Remote Control' to use to prefix a channel change
Since:
6.2
 */
public static void SetPrefixCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName, java.lang.String Command) {
   sagex.SageAPI.call(_uicontext, "SetPrefixCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName,Command});
}

/**
Gets the command that is to be sent as the last command to complete a channel change sequence. This is for devices that require an
 'Enter' or other type of confirmation key to be pressed after the numeric channel codes are sent.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the name of the command from this 'Remote Control' to use to confirm a channel change
 */
public static java.lang.String GetConfirmCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetConfirmCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the command that is to be sent as the last command to complete a channel change sequence. This is for devices that require an
 'Enter' or other type of confirmation key to be pressed after the numeric channel codes are sent.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the name of the command from this 'Remote Control' to use to confirm a channel change
 */
public static java.lang.String GetConfirmCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetConfirmCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the command that is to be sent before a channel change sequence is started. This is for devices that require a
 'Power On' or 'Cancel' type of function to ensure the device is a responsive state.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the name of the command from this 'Remote Control' to use to prefix a channel change
Since:
6.2
 */
public static java.lang.String GetPrefixCommandForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetPrefixCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the command that is to be sent before a channel change sequence is started. This is for devices that require a
 'Power On' or 'Cancel' type of function to ensure the device is a responsive state.

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the name of the command from this 'Remote Control' to use to prefix a channel change
Since:
6.2
 */
public static java.lang.String GetPrefixCommandForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPrefixCommandForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the carrier frequency detected by this plugin for the specified remote

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the carrier frequency of the specified 'Remote Control', or zero if the plugin doesn't have that information
 */
public static long GetCarrierFrequencyForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetCarrierFrequencyForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the carrier frequency detected by this plugin for the specified remote

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the carrier frequency of the specified 'Remote Control', or zero if the plugin doesn't have that information
 */
public static long GetCarrierFrequencyForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCarrierFrequencyForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the 'bit time' detected by this plugin for the specified remote

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the 'bit time' of the specified 'Remote Control', or zero if the plugin doesn't have that information
 */
public static long GetBitTimeForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetBitTimeForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the 'bit time' detected by this plugin for the specified remote

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the 'bit time' of the specified 'Remote Control', or zero if the plugin doesn't have that information
 */
public static long GetBitTimeForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetBitTimeForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the list of commands for the specified 'Remote Control' for the specified plugin

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the list of commands for the specified 'Remote Control' for the specified plugin
 */
public static java.util.Vector GetCommandsForInfraredTuningPlugin (java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call("GetCommandsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the list of commands for the specified 'Remote Control' for the specified plugin

Parameters:
PluginName- the name of the infrared tuning plugin
PluginPortNumber- the port number of the tuning plugin, 0 if there is no port for it
RemoteName- the name of the 'Remote Control'
Returns:
the list of commands for the specified 'Remote Control' for the specified plugin
 */
public static java.util.Vector GetCommandsForInfraredTuningPlugin (UIContext _uicontext,java.lang.String PluginName, int PluginPortNumber, java.lang.String RemoteName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCommandsForInfraredTuningPlugin", new Object[] {PluginName,PluginPortNumber,RemoteName});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Returns the list of properties underneath the specified property that themselves contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would be "fish" and "reptile"

Parameters:
PropertyName- the root property to check for subproperty branches under
Returns:
the list of properties underneath the specified property that themselves contain further subproperties.
 */
public static java.lang.String[] GetSubpropertiesThatAreBranches (java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetSubpropertiesThatAreBranches", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Returns the list of properties underneath the specified property that themselves contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would be "fish" and "reptile"

Parameters:
PropertyName- the root property to check for subproperty branches under
Returns:
the list of properties underneath the specified property that themselves contain further subproperties.
 */
public static java.lang.String[] GetSubpropertiesThatAreBranches (UIContext _uicontext,java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSubpropertiesThatAreBranches", new Object[] {PropertyName});
}

/**
Returns the list of properties underneath the specified property that do not contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would only be "pig"

Parameters:
PropertyName- the root property to check for subproperty leaves under
Returns:
the list of properties underneath the specified property that do not contain further subproperties
 */
public static java.lang.String[] GetSubpropertiesThatAreLeaves (java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetSubpropertiesThatAreLeaves", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Returns the list of properties underneath the specified property that do not contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would only be "pig"

Parameters:
PropertyName- the root property to check for subproperty leaves under
Returns:
the list of properties underneath the specified property that do not contain further subproperties
 */
public static java.lang.String[] GetSubpropertiesThatAreLeaves (UIContext _uicontext,java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSubpropertiesThatAreLeaves", new Object[] {PropertyName});
}

/**
Returns the list of properties underneath the specified property that themselves contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would be "fish" and "reptile"
 If this is called from a client instance then it will use the properties on the server system for this call.

Parameters:
PropertyName- the root property to check for subproperty branches under
Returns:
the list of properties underneath the specified property that themselves contain further subproperties.
Since:
6.1
 */
public static java.lang.String[] GetServerSubpropertiesThatAreBranches (java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetServerSubpropertiesThatAreBranches", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Returns the list of properties underneath the specified property that themselves contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would be "fish" and "reptile"
 If this is called from a client instance then it will use the properties on the server system for this call.

Parameters:
PropertyName- the root property to check for subproperty branches under
Returns:
the list of properties underneath the specified property that themselves contain further subproperties.
Since:
6.1
 */
public static java.lang.String[] GetServerSubpropertiesThatAreBranches (UIContext _uicontext,java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetServerSubpropertiesThatAreBranches", new Object[] {PropertyName});
}

/**
Returns the list of properties underneath the specified property that do not contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would only be "pig"
 If this is called from a client instance then it will use the properties on the server system for this call.

Parameters:
PropertyName- the root property to check for subproperty leaves under
Returns:
the list of properties underneath the specified property that do not contain further subproperties
Since:
6.1
 */
public static java.lang.String[] GetServerSubpropertiesThatAreLeaves (java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call("GetServerSubpropertiesThatAreLeaves", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Returns the list of properties underneath the specified property that do not contain further subproperties.
 For example, if the following were the properties:
 animal/pig=0
 animal/fish/salmon=1
 animal/fish/trout=2
 animal/reptile/green/alligator=4

 and this call was made with "animal" as the argument, then the returned values would only be "pig"
 If this is called from a client instance then it will use the properties on the server system for this call.

Parameters:
PropertyName- the root property to check for subproperty leaves under
Returns:
the list of properties underneath the specified property that do not contain further subproperties
Since:
6.1
 */
public static java.lang.String[] GetServerSubpropertiesThatAreLeaves (UIContext _uicontext,java.lang.String PropertyName) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetServerSubpropertiesThatAreLeaves", new Object[] {PropertyName});
}

/**
Gets the property with the specified name. If the property is not set yet, it will be set to the DefaultValue
 that is passed in unless that value is null

Parameters:
PropertyName- the name of the property to retrieve
DefaultValue- the default value to set the property to if it does not exist, null if it should not be set
Returns:
the value of the specified property, or the DefaultValue if the property was not set prior to this call
 */
public static java.lang.String GetProperty (java.lang.String PropertyName, java.lang.String DefaultValue) {
  Object o = sagex.SageAPI.call("GetProperty", new Object[] {PropertyName,DefaultValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the property with the specified name. If the property is not set yet, it will be set to the DefaultValue
 that is passed in unless that value is null

Parameters:
PropertyName- the name of the property to retrieve
DefaultValue- the default value to set the property to if it does not exist, null if it should not be set
Returns:
the value of the specified property, or the DefaultValue if the property was not set prior to this call
 */
public static java.lang.String GetProperty (UIContext _uicontext,java.lang.String PropertyName, java.lang.String DefaultValue) {
  Object o = sagex.SageAPI.call(_uicontext, "GetProperty", new Object[] {PropertyName,DefaultValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the property with the specified name to the specified value.

Parameters:
PropertyName- the name of the property to set
PropertyValue- the value to set the property to
 */
public static void SetProperty (java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetProperty", new Object[] {PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets the property with the specified name to the specified value.

Parameters:
PropertyName- the name of the property to set
PropertyValue- the value to set the property to
 */
public static void SetProperty (UIContext _uicontext,java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetProperty", new Object[] {PropertyName,PropertyValue});
}

/**
Gets the property with the specified name. If the property is not set yet, it will be set to the DefaultValue
 that is passed in unless that value is null. If this is called from a client instance then it will use the
 properties on the server system for this call.

Parameters:
PropertyName- the name of the property to retrieve
DefaultValue- the default value to set the property to if it does not exist, null if it should not be set
Returns:
the value of the specified property, or the DefaultValue if the property was not set prior to this call
 */
public static java.lang.String GetServerProperty (java.lang.String PropertyName, java.lang.String DefaultValue) {
  Object o = sagex.SageAPI.call("GetServerProperty", new Object[] {PropertyName,DefaultValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the property with the specified name. If the property is not set yet, it will be set to the DefaultValue
 that is passed in unless that value is null. If this is called from a client instance then it will use the
 properties on the server system for this call.

Parameters:
PropertyName- the name of the property to retrieve
DefaultValue- the default value to set the property to if it does not exist, null if it should not be set
Returns:
the value of the specified property, or the DefaultValue if the property was not set prior to this call
 */
public static java.lang.String GetServerProperty (UIContext _uicontext,java.lang.String PropertyName, java.lang.String DefaultValue) {
  Object o = sagex.SageAPI.call(_uicontext, "GetServerProperty", new Object[] {PropertyName,DefaultValue});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the property with the specified name to the specified value. If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property to set
PropertyValue- the value to set the property to
 */
public static void SetServerProperty (java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetServerProperty", new Object[] {PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets the property with the specified name to the specified value. If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property to set
PropertyValue- the value to set the property to
 */
public static void SetServerProperty (UIContext _uicontext,java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetServerProperty", new Object[] {PropertyName,PropertyValue});
}

/**
Removes the specified property from the property map

Parameters:
PropertyName- the name of the property to remove
 */
public static void RemoveProperty (java.lang.String PropertyName) {
   sagex.SageAPI.call("RemoveProperty", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Removes the specified property from the property map

Parameters:
PropertyName- the name of the property to remove
 */
public static void RemoveProperty (UIContext _uicontext,java.lang.String PropertyName) {
   sagex.SageAPI.call(_uicontext, "RemoveProperty", new Object[] {PropertyName});
}

/**
Removes the specified property and any subproperties that start with the same prefix

Parameters:
PropertyName- the name of the property that should be removed along with all of its subproperties
 */
public static void RemovePropertyAndChildren (java.lang.String PropertyName) {
   sagex.SageAPI.call("RemovePropertyAndChildren", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Removes the specified property and any subproperties that start with the same prefix

Parameters:
PropertyName- the name of the property that should be removed along with all of its subproperties
 */
public static void RemovePropertyAndChildren (UIContext _uicontext,java.lang.String PropertyName) {
   sagex.SageAPI.call(_uicontext, "RemovePropertyAndChildren", new Object[] {PropertyName});
}

/**
Removes the specified property from the property map. If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property to remove
Since:
6.1
 */
public static void RemoveServerProperty (java.lang.String PropertyName) {
   sagex.SageAPI.call("RemoveServerProperty", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Removes the specified property from the property map. If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property to remove
Since:
6.1
 */
public static void RemoveServerProperty (UIContext _uicontext,java.lang.String PropertyName) {
   sagex.SageAPI.call(_uicontext, "RemoveServerProperty", new Object[] {PropertyName});
}

/**
Removes the specified property and any subproperties that start with the same prefix.
 If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property that should be removed along with all of its subproperties
Since:
6.1
 */
public static void RemoveServerPropertyAndChildren (java.lang.String PropertyName) {
   sagex.SageAPI.call("RemoveServerPropertyAndChildren", new Object[] {PropertyName});
}

/**
 * UI Context Aware Call<br>
Removes the specified property and any subproperties that start with the same prefix.
 If this is called from a client instance then it will use the
 properties on the server system for this call and the change will be made on the server system.

Parameters:
PropertyName- the name of the property that should be removed along with all of its subproperties
Since:
6.1
 */
public static void RemoveServerPropertyAndChildren (UIContext _uicontext,java.lang.String PropertyName) {
   sagex.SageAPI.call(_uicontext, "RemoveServerPropertyAndChildren", new Object[] {PropertyName});
}

/**
Gets the name of the default quality that is used to record television.

Returns:
the name of the default quality that is used to record television
 */
public static java.lang.String GetDefaultRecordingQuality () {
  Object o = sagex.SageAPI.call("GetDefaultRecordingQuality", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the default quality that is used to record television.

Returns:
the name of the default quality that is used to record television
 */
public static java.lang.String GetDefaultRecordingQuality (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDefaultRecordingQuality", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the 'Intelligent Recording' feature of SageTV is disabled. The default is disabled.

Returns:
true if the 'Intelligent Recording' feature of SageTV is disabled, false otherwise
 */
public static boolean IsIntelligentRecordingDisabled () {
  Object o = sagex.SageAPI.call("IsIntelligentRecordingDisabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the 'Intelligent Recording' feature of SageTV is disabled. The default is disabled.

Returns:
true if the 'Intelligent Recording' feature of SageTV is disabled, false otherwise
 */
public static boolean IsIntelligentRecordingDisabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsIntelligentRecordingDisabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for music, video and picture files.

Parameters:
NewPath- the file path to add to the list of library import paths
 */
public static void AddLibraryImportPath (java.lang.String NewPath) {
   sagex.SageAPI.call("AddLibraryImportPath", new Object[] {NewPath});
}

/**
 * UI Context Aware Call<br>
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for music, video and picture files.

Parameters:
NewPath- the file path to add to the list of library import paths
 */
public static void AddLibraryImportPath (UIContext _uicontext,java.lang.String NewPath) {
   sagex.SageAPI.call(_uicontext, "AddLibraryImportPath", new Object[] {NewPath});
}

/**
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for picture files only.

Parameters:
NewPath- the file path to add to the list of library import paths for picture files
 */
public static void AddPictureLibraryImportPath (java.lang.String NewPath) {
   sagex.SageAPI.call("AddPictureLibraryImportPath", new Object[] {NewPath});
}

/**
 * UI Context Aware Call<br>
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for picture files only.

Parameters:
NewPath- the file path to add to the list of library import paths for picture files
 */
public static void AddPictureLibraryImportPath (UIContext _uicontext,java.lang.String NewPath) {
   sagex.SageAPI.call(_uicontext, "AddPictureLibraryImportPath", new Object[] {NewPath});
}

/**
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for music files only.

Parameters:
NewPath- the file path to add to the list of library import paths for music files
 */
public static void AddMusicLibraryImportPath (java.lang.String NewPath) {
   sagex.SageAPI.call("AddMusicLibraryImportPath", new Object[] {NewPath});
}

/**
 * UI Context Aware Call<br>
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for music files only.

Parameters:
NewPath- the file path to add to the list of library import paths for music files
 */
public static void AddMusicLibraryImportPath (UIContext _uicontext,java.lang.String NewPath) {
   sagex.SageAPI.call(_uicontext, "AddMusicLibraryImportPath", new Object[] {NewPath});
}

/**
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for video files only.

Parameters:
NewPath- the file path to add to the list of library import paths for video files
 */
public static void AddVideoLibraryImportPath (java.lang.String NewPath) {
   sagex.SageAPI.call("AddVideoLibraryImportPath", new Object[] {NewPath});
}

/**
 * UI Context Aware Call<br>
Adds a new file path to the list of paths that SageTV checks for library import files. This path will
 be used to search for video files only.

Parameters:
NewPath- the file path to add to the list of library import paths for video files
 */
public static void AddVideoLibraryImportPath (UIContext _uicontext,java.lang.String NewPath) {
   sagex.SageAPI.call(_uicontext, "AddVideoLibraryImportPath", new Object[] {NewPath});
}

/**
Removes a path from the list of library import paths. This will affect all import types.

Parameters:
RemovePath- the path to remove from the list of library import paths
 */
public static void RemoveLibraryImportPath (java.io.File RemovePath) {
   sagex.SageAPI.call("RemoveLibraryImportPath", new Object[] {RemovePath});
}

/**
 * UI Context Aware Call<br>
Removes a path from the list of library import paths. This will affect all import types.

Parameters:
RemovePath- the path to remove from the list of library import paths
 */
public static void RemoveLibraryImportPath (UIContext _uicontext,java.io.File RemovePath) {
   sagex.SageAPI.call(_uicontext, "RemoveLibraryImportPath", new Object[] {RemovePath});
}

/**
Removes a path from the list of library import paths for pictures

Parameters:
RemovePath- the path to remove from the list of library import paths for pictures
 */
public static void RemovePictureLibraryImportPath (java.io.File RemovePath) {
   sagex.SageAPI.call("RemovePictureLibraryImportPath", new Object[] {RemovePath});
}

/**
 * UI Context Aware Call<br>
Removes a path from the list of library import paths for pictures

Parameters:
RemovePath- the path to remove from the list of library import paths for pictures
 */
public static void RemovePictureLibraryImportPath (UIContext _uicontext,java.io.File RemovePath) {
   sagex.SageAPI.call(_uicontext, "RemovePictureLibraryImportPath", new Object[] {RemovePath});
}

/**
Removes a path from the list of library import paths for music

Parameters:
RemovePath- the path to remove from the list of library import paths for music
 */
public static void RemoveMusicLibraryImportPath (java.io.File RemovePath) {
   sagex.SageAPI.call("RemoveMusicLibraryImportPath", new Object[] {RemovePath});
}

/**
 * UI Context Aware Call<br>
Removes a path from the list of library import paths for music

Parameters:
RemovePath- the path to remove from the list of library import paths for music
 */
public static void RemoveMusicLibraryImportPath (UIContext _uicontext,java.io.File RemovePath) {
   sagex.SageAPI.call(_uicontext, "RemoveMusicLibraryImportPath", new Object[] {RemovePath});
}

/**
Removes a path from the list of library import paths for videos

Parameters:
RemovePath- the path to remove from the list of library import paths for videos
 */
public static void RemoveVideoLibraryImportPath (java.io.File RemovePath) {
   sagex.SageAPI.call("RemoveVideoLibraryImportPath", new Object[] {RemovePath});
}

/**
 * UI Context Aware Call<br>
Removes a path from the list of library import paths for videos

Parameters:
RemovePath- the path to remove from the list of library import paths for videos
 */
public static void RemoveVideoLibraryImportPath (UIContext _uicontext,java.io.File RemovePath) {
   sagex.SageAPI.call(_uicontext, "RemoveVideoLibraryImportPath", new Object[] {RemovePath});
}

/**
Sets the default quality that is used to record television

Parameters:
Quality- the name of the quality setting to use to record television by default
 */
public static void SetDefaultRecordingQuality (java.lang.String Quality) {
   sagex.SageAPI.call("SetDefaultRecordingQuality", new Object[] {Quality});
}

/**
 * UI Context Aware Call<br>
Sets the default quality that is used to record television

Parameters:
Quality- the name of the quality setting to use to record television by default
 */
public static void SetDefaultRecordingQuality (UIContext _uicontext,java.lang.String Quality) {
   sagex.SageAPI.call(_uicontext, "SetDefaultRecordingQuality", new Object[] {Quality});
}

/**
Sets whether or not 'Intelligent Recording' should be disabled.

Parameters:
Disabled- should be true to disable 'Intelligent Recording', false to enable it
 */
public static void SetIntelligentRecordingDisabled (boolean Disabled) {
   sagex.SageAPI.call("SetIntelligentRecordingDisabled", new Object[] {Disabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not 'Intelligent Recording' should be disabled.

Parameters:
Disabled- should be true to disable 'Intelligent Recording', false to enable it
 */
public static void SetIntelligentRecordingDisabled (UIContext _uicontext,boolean Disabled) {
   sagex.SageAPI.call(_uicontext, "SetIntelligentRecordingDisabled", new Object[] {Disabled});
}

/**
Deprecated. 

Sets whether or not SageTV should use legacy major-minor DTV channels. Not recommend for use anymore.

Parameters:
Enabled- true if SageTV should use legacy major-minor DTV channel tuning
 */
public static void SetMajorMinorDTVChannelTuningEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetMajorMinorDTVChannelTuningEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Sets whether or not SageTV should use legacy major-minor DTV channels. Not recommend for use anymore.

Parameters:
Enabled- true if SageTV should use legacy major-minor DTV channel tuning
 */
public static void SetMajorMinorDTVChannelTuningEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetMajorMinorDTVChannelTuningEnabled", new Object[] {Enabled});
}

/**
Returns true if SageTV will go to its screen saver when it is put to sleep. If SageTV is not in full screen mode
 then it will go to the system tray regardless of this setting.

Returns:
true if SageTV will go to its screen saver when put to sleep, false otherwise
 */
public static boolean IsScreenSaverOnSleepEnabled () {
  Object o = sagex.SageAPI.call("IsScreenSaverOnSleepEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV will go to its screen saver when it is put to sleep. If SageTV is not in full screen mode
 then it will go to the system tray regardless of this setting.

Returns:
true if SageTV will go to its screen saver when put to sleep, false otherwise
 */
public static boolean IsScreenSaverOnSleepEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsScreenSaverOnSleepEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not SageTV should go to its screen saver when put to sleep. If SageTV is not in full screen mode
 then it will go to the system tray regardless of this setting.

Parameters:
Enabled- true if SageTV should go to the screen saver when put to sleep, false otherwise
 */
public static void SetScreenSaverOnSleepEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetScreenSaverOnSleepEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV should go to its screen saver when put to sleep. If SageTV is not in full screen mode
 then it will go to the system tray regardless of this setting.

Parameters:
Enabled- true if SageTV should go to the screen saver when put to sleep, false otherwise
 */
public static void SetScreenSaverOnSleepEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetScreenSaverOnSleepEnabled", new Object[] {Enabled});
}

/**
Returns true if SageTV should synchronize the system clock with the server. For SageTV Client this
 will synchronize with its SageTV Server. For a SageTV system, this will synchronize with the EPG data server.

Returns:
true if SageTV should synchronize the system clock with the server
 */
public static boolean IsSyncSystemClockWithServerEnabled () {
  Object o = sagex.SageAPI.call("IsSyncSystemClockWithServerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV should synchronize the system clock with the server. For SageTV Client this
 will synchronize with its SageTV Server. For a SageTV system, this will synchronize with the EPG data server.

Returns:
true if SageTV should synchronize the system clock with the server
 */
public static boolean IsSyncSystemClockWithServerEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSyncSystemClockWithServerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets if SageTV should synchronize the system clock with the server. For SageTV Client this
 will synchronize with its SageTV Server. For a SageTV system, this will synchronize with the EPG data server.

Parameters:
Enabled- true if SageTV should synchronize the system clock with the server
 */
public static void SetSyncSystemClockWithServerEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetSyncSystemClockWithServerEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets if SageTV should synchronize the system clock with the server. For SageTV Client this
 will synchronize with its SageTV Server. For a SageTV system, this will synchronize with the EPG data server.

Parameters:
Enabled- true if SageTV should synchronize the system clock with the server
 */
public static void SetSyncSystemClockWithServerEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetSyncSystemClockWithServerEnabled", new Object[] {Enabled});
}

/**
Returns the localized name of the aspect ratio mode currently in use.

Returns:
the localized name of the aspect ratio mode currently in use
 */
public static java.lang.String GetAspectRatioMode () {
  Object o = sagex.SageAPI.call("GetAspectRatioMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the localized name of the aspect ratio mode currently in use.

Returns:
the localized name of the aspect ratio mode currently in use
 */
public static java.lang.String GetAspectRatioMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAspectRatioMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the aspect ratio mode that should currently be used.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode that should currently be used
 */
public static void SetAspectRatioMode (java.lang.String AspectRatioMode) {
   sagex.SageAPI.call("SetAspectRatioMode", new Object[] {AspectRatioMode});
}

/**
 * UI Context Aware Call<br>
Sets the aspect ratio mode that should currently be used.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode that should currently be used
 */
public static void SetAspectRatioMode (UIContext _uicontext,java.lang.String AspectRatioMode) {
   sagex.SageAPI.call(_uicontext, "SetAspectRatioMode", new Object[] {AspectRatioMode});
}

/**
Gets the list of localized names for the aspect ratio modes

Returns:
the list of localized names for the aspect ratio modes
 */
public static java.lang.String[] GetAspectRatioModes () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAspectRatioModes", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of localized names for the aspect ratio modes

Returns:
the list of localized names for the aspect ratio modes
 */
public static java.lang.String[] GetAspectRatioModes (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAspectRatioModes", (Object[])null);
}

/**
Returns the display aspect ratio that is set for the current display device being used

Returns:
the display aspect ratio that is set for the current display device being used
Since:
5.1
 */
public static float GetDisplayAspectRatio () {
  Object o = sagex.SageAPI.call("GetDisplayAspectRatio", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the display aspect ratio that is set for the current display device being used

Returns:
the display aspect ratio that is set for the current display device being used
Since:
5.1
 */
public static float GetDisplayAspectRatio (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDisplayAspectRatio", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Sets the aspect ratio of the current display device

Parameters:
DisplayAspectRatio- the aspect ratio of the current display device
Since:
5.1
 */
public static void SetDisplayAspectRatio (float DisplayAspectRatio) {
   sagex.SageAPI.call("SetDisplayAspectRatio", new Object[] {DisplayAspectRatio});
}

/**
 * UI Context Aware Call<br>
Sets the aspect ratio of the current display device

Parameters:
DisplayAspectRatio- the aspect ratio of the current display device
Since:
5.1
 */
public static void SetDisplayAspectRatio (UIContext _uicontext,float DisplayAspectRatio) {
   sagex.SageAPI.call(_uicontext, "SetDisplayAspectRatio", new Object[] {DisplayAspectRatio});
}

/**
Returns true if parental controls are enabled on the system

Returns:
true if parental controls are enabled on the system
 */
public static boolean IsParentalControlEnabled () {
  Object o = sagex.SageAPI.call("IsParentalControlEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if parental controls are enabled on the system

Returns:
true if parental controls are enabled on the system
 */
public static boolean IsParentalControlEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsParentalControlEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not parental controls are enabled for the system

Parameters:
Enabled- true if parental controls should be enabled, false otherwise
 */
public static void SetParentalControlEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetParentalControlEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not parental controls are enabled for the system

Parameters:
Enabled- true if parental controls should be enabled, false otherwise
 */
public static void SetParentalControlEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetParentalControlEnabled", new Object[] {Enabled});
}

/**
Returns true if SageTV should mute the volume when media is played back at speeds besides x1

Returns:
true if SageTV should mute the volume when media is played back at speeds besides x1, false otherwise
 */
public static boolean IsMutedOnAlternateSpeedPlayback () {
  Object o = sagex.SageAPI.call("IsMutedOnAlternateSpeedPlayback", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if SageTV should mute the volume when media is played back at speeds besides x1

Returns:
true if SageTV should mute the volume when media is played back at speeds besides x1, false otherwise
 */
public static boolean IsMutedOnAlternateSpeedPlayback (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMutedOnAlternateSpeedPlayback", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not SageTV should mute the sound when media is played back at a speed other than x1

Parameters:
Enabled- true if SageTV should mute the sound when media is played at a speed other x1, false otherwise
 */
public static void SetMuteOnAlternateSpeedPlayback (boolean Enabled) {
   sagex.SageAPI.call("SetMuteOnAlternateSpeedPlayback", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not SageTV should mute the sound when media is played back at a speed other than x1

Parameters:
Enabled- true if SageTV should mute the sound when media is played at a speed other x1, false otherwise
 */
public static void SetMuteOnAlternateSpeedPlayback (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetMuteOnAlternateSpeedPlayback", new Object[] {Enabled});
}

/**
Returns true if a parental lock code has been configured

Returns:
true if a parental lock code has been configured, false otherwise
 */
public static boolean HasParentalLockCode () {
  Object o = sagex.SageAPI.call("HasParentalLockCode", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if a parental lock code has been configured

Returns:
true if a parental lock code has been configured, false otherwise
 */
public static boolean HasParentalLockCode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasParentalLockCode", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the list of content ratings that are under parental lock. When any content that has ratings that match anything
 in the restricted list is requested for playback; the parental lock code must be entered before playback will begin.

Returns:
the list of content ratings that are under parental lock
 */
public static java.lang.String[] GetRatingsUnderParentalLock () {
  return (java.lang.String[]) sagex.SageAPI.call("GetRatingsUnderParentalLock", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of content ratings that are under parental lock. When any content that has ratings that match anything
 in the restricted list is requested for playback; the parental lock code must be entered before playback will begin.

Returns:
the list of content ratings that are under parental lock
 */
public static java.lang.String[] GetRatingsUnderParentalLock (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetRatingsUnderParentalLock", (Object[])null);
}

/**
Returns true if the specified rating is in the list that is under parental control

Parameters:
Rating- the rating to check
Returns:
true if the specified rating is in the list that is under parental control, false otherwise
 */
public static boolean IsRatingUnderParentalLock (java.lang.String Rating) {
  Object o = sagex.SageAPI.call("IsRatingUnderParentalLock", new Object[] {Rating});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified rating is in the list that is under parental control

Parameters:
Rating- the rating to check
Returns:
true if the specified rating is in the list that is under parental control, false otherwise
 */
public static boolean IsRatingUnderParentalLock (UIContext _uicontext,java.lang.String Rating) {
  Object o = sagex.SageAPI.call(_uicontext, "IsRatingUnderParentalLock", new Object[] {Rating});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the color that should be used for the video background. This is only shown when the video's aspect ratio doesn't match the area that it's playing back in.

Returns:
the color that should be used for the video background
 */
public static java.awt.Color GetVideoBackgroundColor () {
  Object o = sagex.SageAPI.call("GetVideoBackgroundColor", (Object[])null);
  if (o!=null) return (java.awt.Color) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the color that should be used for the video background. This is only shown when the video's aspect ratio doesn't match the area that it's playing back in.

Returns:
the color that should be used for the video background
 */
public static java.awt.Color GetVideoBackgroundColor (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoBackgroundColor", (Object[])null);
  if (o!=null) return (java.awt.Color) o;
  return null;
}

/**
Sets the color that should be used for the video background. This is only shown when the video's aspect ratio doesn't match the area that it's playing back in.

Parameters:
Color- the color that should be used for the video background
 */
public static void SetVideoBackgroundColor (java.awt.Color Color) {
   sagex.SageAPI.call("SetVideoBackgroundColor", new Object[] {Color});
}

/**
 * UI Context Aware Call<br>
Sets the color that should be used for the video background. This is only shown when the video's aspect ratio doesn't match the area that it's playing back in.

Parameters:
Color- the color that should be used for the video background
 */
public static void SetVideoBackgroundColor (UIContext _uicontext,java.awt.Color Color) {
   sagex.SageAPI.call(_uicontext, "SetVideoBackgroundColor", new Object[] {Color});
}

/**
Gets the video orbiting duration in milliseconds. This is used to shift the video left-to-right very slowly over time. It
 is used on widescreen displays to prevent screen burn when watching 4:3 content.

Returns:
the video orbiting duration in milliseconds
 */
public static long GetVideoOrbitingDuration () {
  Object o = sagex.SageAPI.call("GetVideoOrbitingDuration", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the video orbiting duration in milliseconds. This is used to shift the video left-to-right very slowly over time. It
 is used on widescreen displays to prevent screen burn when watching 4:3 content.

Returns:
the video orbiting duration in milliseconds
 */
public static long GetVideoOrbitingDuration (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoOrbitingDuration", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Sets the video orbiting duration in milliseconds. This is used to shift the video left-to-right very slowly over time. It
 is used on widescreen displays to prevent screen burn when watching 4:3 content.

Parameters:
Duration- the video orbiting duration in milliseconds
 */
public static void SetVideoOrbitingDuration (long Duration) {
   sagex.SageAPI.call("SetVideoOrbitingDuration", new Object[] {Duration});
}

/**
 * UI Context Aware Call<br>
Sets the video orbiting duration in milliseconds. This is used to shift the video left-to-right very slowly over time. It
 is used on widescreen displays to prevent screen burn when watching 4:3 content.

Parameters:
Duration- the video orbiting duration in milliseconds
 */
public static void SetVideoOrbitingDuration (UIContext _uicontext,long Duration) {
   sagex.SageAPI.call(_uicontext, "SetVideoOrbitingDuration", new Object[] {Duration});
}

/**
Gets the horizontal scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the horizontal scale factor for the video for the specified aspect ratio mode
 */
public static float GetVideoZoomX (java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call("GetVideoZoomX", new Object[] {AspectRatioMode});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Gets the horizontal scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the horizontal scale factor for the video for the specified aspect ratio mode
 */
public static float GetVideoZoomX (UIContext _uicontext,java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoZoomX", new Object[] {AspectRatioMode});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Sets the horizontal scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
ScaleFactor- the horizontal scale factor for the video for the specified aspect ratio mode
 */
public static void SetVideoZoomX (java.lang.String AspectRatioMode, float ScaleFactor) {
   sagex.SageAPI.call("SetVideoZoomX", new Object[] {AspectRatioMode,ScaleFactor});
}

/**
 * UI Context Aware Call<br>
Sets the horizontal scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
ScaleFactor- the horizontal scale factor for the video for the specified aspect ratio mode
 */
public static void SetVideoZoomX (UIContext _uicontext,java.lang.String AspectRatioMode, float ScaleFactor) {
   sagex.SageAPI.call(_uicontext, "SetVideoZoomX", new Object[] {AspectRatioMode,ScaleFactor});
}

/**
Gets the vertical scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the vertical scale factor for the video for the specified aspect ratio mode
 */
public static float GetVideoZoomY (java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call("GetVideoZoomY", new Object[] {AspectRatioMode});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Gets the vertical scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the vertical scale factor for the video for the specified aspect ratio mode
 */
public static float GetVideoZoomY (UIContext _uicontext,java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoZoomY", new Object[] {AspectRatioMode});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Sets the vertical scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
ScaleFactor- the vertical scale factor for the video for the specified aspect ratio mode
 */
public static void SetVideoZoomY (java.lang.String AspectRatioMode, float ScaleFactor) {
   sagex.SageAPI.call("SetVideoZoomY", new Object[] {AspectRatioMode,ScaleFactor});
}

/**
 * UI Context Aware Call<br>
Sets the vertical scale factor for the video for the specified aspect ratio mode.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
ScaleFactor- the vertical scale factor for the video for the specified aspect ratio mode
 */
public static void SetVideoZoomY (UIContext _uicontext,java.lang.String AspectRatioMode, float ScaleFactor) {
   sagex.SageAPI.call(_uicontext, "SetVideoZoomY", new Object[] {AspectRatioMode,ScaleFactor});
}

/**
Gets of the offset in pixels that should be applied horizontally to the video. Positive numbers move it to the right.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the offset in pixels that should be applied horizontally to the video
 */
public static int GetVideoOffsetX (java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call("GetVideoOffsetX", new Object[] {AspectRatioMode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets of the offset in pixels that should be applied horizontally to the video. Positive numbers move it to the right.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the offset in pixels that should be applied horizontally to the video
 */
public static int GetVideoOffsetX (UIContext _uicontext,java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoOffsetX", new Object[] {AspectRatioMode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets of the offset in pixels that should be applied horizontally to the video. Positive numbers move it to the right.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
PixelOffset- the offset in pixels that should be applied horizontally to the video
 */
public static void SetVideoOffsetX (java.lang.String AspectRatioMode, int PixelOffset) {
   sagex.SageAPI.call("SetVideoOffsetX", new Object[] {AspectRatioMode,PixelOffset});
}

/**
 * UI Context Aware Call<br>
Sets of the offset in pixels that should be applied horizontally to the video. Positive numbers move it to the right.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
PixelOffset- the offset in pixels that should be applied horizontally to the video
 */
public static void SetVideoOffsetX (UIContext _uicontext,java.lang.String AspectRatioMode, int PixelOffset) {
   sagex.SageAPI.call(_uicontext, "SetVideoOffsetX", new Object[] {AspectRatioMode,PixelOffset});
}

/**
Gets of the offset in pixels that should be applied vertically to the video. Positive numbers move it down.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the offset in pixels that should be applied vertically to the video
 */
public static int GetVideoOffsetY (java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call("GetVideoOffsetY", new Object[] {AspectRatioMode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets of the offset in pixels that should be applied vertically to the video. Positive numbers move it down.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
Returns:
the offset in pixels that should be applied vertically to the video
 */
public static int GetVideoOffsetY (UIContext _uicontext,java.lang.String AspectRatioMode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoOffsetY", new Object[] {AspectRatioMode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets of the offset in pixels that should be applied vertically to the video. Positive numbers move it down.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
PixelOffset- the offset in pixels that should be applied vertically to the video
 */
public static void SetVideoOffsetY (java.lang.String AspectRatioMode, int PixelOffset) {
   sagex.SageAPI.call("SetVideoOffsetY", new Object[] {AspectRatioMode,PixelOffset});
}

/**
 * UI Context Aware Call<br>
Sets of the offset in pixels that should be applied vertically to the video. Positive numbers move it down.

Parameters:
AspectRatioMode- the localized name of the aspect ratio mode
PixelOffset- the offset in pixels that should be applied vertically to the video
 */
public static void SetVideoOffsetY (UIContext _uicontext,java.lang.String AspectRatioMode, int PixelOffset) {
   sagex.SageAPI.call(_uicontext, "SetVideoOffsetY", new Object[] {AspectRatioMode,PixelOffset});
}

/**
Sets the code that is to be used in order to unlock the parental controls.

Parameters:
ParentalLockCode- the new value to set the parental lock code to
 */
public static void SetParentalLockCode (java.lang.String ParentalLockCode) {
   sagex.SageAPI.call("SetParentalLockCode", new Object[] {ParentalLockCode});
}

/**
 * UI Context Aware Call<br>
Sets the code that is to be used in order to unlock the parental controls.

Parameters:
ParentalLockCode- the new value to set the parental lock code to
 */
public static void SetParentalLockCode (UIContext _uicontext,java.lang.String ParentalLockCode) {
   sagex.SageAPI.call(_uicontext, "SetParentalLockCode", new Object[] {ParentalLockCode});
}

/**
Returns a list of the different recording quality names available in the system

Returns:
a list of the different recording quality names available in the system
 */
public static java.lang.String[] GetRecordingQualities () {
  return (java.lang.String[]) sagex.SageAPI.call("GetRecordingQualities", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of the different recording quality names available in the system

Returns:
a list of the different recording quality names available in the system
 */
public static java.lang.String[] GetRecordingQualities (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetRecordingQualities", (Object[])null);
}

/**
Gets the estimated overall bitrate for a given recording quality. The returned value is in Megabits per second.

Parameters:
Quality- the name of the recording quality
Returns:
the estimated overall bitrate for the specified recording quality in Megabits per second
 */
public static long GetRecordingQualityBitrate (java.lang.String Quality) {
  Object o = sagex.SageAPI.call("GetRecordingQualityBitrate", new Object[] {Quality});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the estimated overall bitrate for a given recording quality. The returned value is in Megabits per second.

Parameters:
Quality- the name of the recording quality
Returns:
the estimated overall bitrate for the specified recording quality in Megabits per second
 */
public static long GetRecordingQualityBitrate (UIContext _uicontext,java.lang.String Quality) {
  Object o = sagex.SageAPI.call(_uicontext, "GetRecordingQualityBitrate", new Object[] {Quality});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the format for a given recording quality. Returns values like "MPEG-2 PS", "DivX", etc.

Parameters:
Quality- the name of the recording quality
Returns:
the format for the specified recording quality
 */
public static java.lang.String GetRecordingQualityFormat (java.lang.String Quality) {
  Object o = sagex.SageAPI.call("GetRecordingQualityFormat", new Object[] {Quality});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the format for a given recording quality. Returns values like "MPEG-2 PS", "DivX", etc.

Parameters:
Quality- the name of the recording quality
Returns:
the format for the specified recording quality
 */
public static java.lang.String GetRecordingQualityFormat (UIContext _uicontext,java.lang.String Quality) {
  Object o = sagex.SageAPI.call(_uicontext, "GetRecordingQualityFormat", new Object[] {Quality});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the list of directories that SageTV is configured to record television to

Returns:
the list of directories that SageTV is configured to record television to
 */
public static java.io.File[] GetVideoDirectories () {
  return (java.io.File[]) sagex.SageAPI.call("GetVideoDirectories", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of directories that SageTV is configured to record television to

Returns:
the list of directories that SageTV is configured to record television to
 */
public static java.io.File[] GetVideoDirectories (UIContext _uicontext) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetVideoDirectories", (Object[])null);
}

/**
Returns the diskspace rule that SageTV should use when managing the disk space in a given directory.
 The names for the rules are localized versions of the strings "Use Only", "Use All" and "Leave Free"

Parameters:
Directory- the video directory to get the diskspace rule for
Returns:
the diskspace rule for the specified video directory
 */
public static java.lang.String GetDiskspaceRuleForVideoDirectory (java.io.File Directory) {
  Object o = sagex.SageAPI.call("GetDiskspaceRuleForVideoDirectory", new Object[] {Directory});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the diskspace rule that SageTV should use when managing the disk space in a given directory.
 The names for the rules are localized versions of the strings "Use Only", "Use All" and "Leave Free"

Parameters:
Directory- the video directory to get the diskspace rule for
Returns:
the diskspace rule for the specified video directory
 */
public static java.lang.String GetDiskspaceRuleForVideoDirectory (UIContext _uicontext,java.io.File Directory) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDiskspaceRuleForVideoDirectory", new Object[] {Directory});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the size (in bytes) that should be applied to the specified directory for its configured diskspace rule

Parameters:
Directory- the video directory to get the size for that applies to its rule
Returns:
the size (in bytes) that should be applied to the specified directory for its configured diskspace rule
 */
public static long GetDiskspaceSizeForVideoDirectory (java.io.File Directory) {
  Object o = sagex.SageAPI.call("GetDiskspaceSizeForVideoDirectory", new Object[] {Directory});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the size (in bytes) that should be applied to the specified directory for its configured diskspace rule

Parameters:
Directory- the video directory to get the size for that applies to its rule
Returns:
the size (in bytes) that should be applied to the specified directory for its configured diskspace rule
 */
public static long GetDiskspaceSizeForVideoDirectory (UIContext _uicontext,java.io.File Directory) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDiskspaceSizeForVideoDirectory", new Object[] {Directory});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Removes a directory from SageTV's list of directories that it can record television to. If you delete all of the directories;
 SageTV will be unable to record television. This does NOT delete the directory or any of its files from disk. They will still be fully
 accessible in SageTV.

Parameters:
Directory- the directory that SageTV should no longer record television content to
 */
public static void RemoveVideoDirectory (java.io.File Directory) {
   sagex.SageAPI.call("RemoveVideoDirectory", new Object[] {Directory});
}

/**
 * UI Context Aware Call<br>
Removes a directory from SageTV's list of directories that it can record television to. If you delete all of the directories;
 SageTV will be unable to record television. This does NOT delete the directory or any of its files from disk. They will still be fully
 accessible in SageTV.

Parameters:
Directory- the directory that SageTV should no longer record television content to
 */
public static void RemoveVideoDirectory (UIContext _uicontext,java.io.File Directory) {
   sagex.SageAPI.call(_uicontext, "RemoveVideoDirectory", new Object[] {Directory});
}

/**
Adds a new directory to SageTV's list of directories that it can record video to. Also specifies what rule  size to use
 when managing the diskspace for this directory.

Parameters:
Directory- the directory to add as a video directory
Rule- the diskspace rule to use for this directory seeGetVideoDiskspaceRules()

Size- the size to use for the specified diskspace rule and directory
 */
public static void AddVideoDirectory (java.lang.String Directory, java.lang.String Rule, long Size) {
   sagex.SageAPI.call("AddVideoDirectory", new Object[] {Directory,Rule,Size});
}

/**
 * UI Context Aware Call<br>
Adds a new directory to SageTV's list of directories that it can record video to. Also specifies what rule  size to use
 when managing the diskspace for this directory.

Parameters:
Directory- the directory to add as a video directory
Rule- the diskspace rule to use for this directory seeGetVideoDiskspaceRules()

Size- the size to use for the specified diskspace rule and directory
 */
public static void AddVideoDirectory (UIContext _uicontext,java.lang.String Directory, java.lang.String Rule, long Size) {
   sagex.SageAPI.call(_uicontext, "AddVideoDirectory", new Object[] {Directory,Rule,Size});
}

/**
Changes the location of a given video directory, or modifies the diskspace rule or diskspace rule size for a video directory.

Parameters:
OldDirectory- the currently configured path for the video directory that is to have its path or rules modified
NewDirectory- the new file path to use for the video directory (this can be the same as OldDirectory)
NewRule- the diskspace rule to use for this video directory, seeGetVideoDiskspaceRules()

NewSize- the size to use for this diskspace rule
 */
public static void ChangeVideoDirectory (java.io.File OldDirectory, java.io.File NewDirectory, java.lang.String NewRule, long NewSize) {
   sagex.SageAPI.call("ChangeVideoDirectory", new Object[] {OldDirectory,NewDirectory,NewRule,NewSize});
}

/**
 * UI Context Aware Call<br>
Changes the location of a given video directory, or modifies the diskspace rule or diskspace rule size for a video directory.

Parameters:
OldDirectory- the currently configured path for the video directory that is to have its path or rules modified
NewDirectory- the new file path to use for the video directory (this can be the same as OldDirectory)
NewRule- the diskspace rule to use for this video directory, seeGetVideoDiskspaceRules()

NewSize- the size to use for this diskspace rule
 */
public static void ChangeVideoDirectory (UIContext _uicontext,java.io.File OldDirectory, java.io.File NewDirectory, java.lang.String NewRule, long NewSize) {
   sagex.SageAPI.call(_uicontext, "ChangeVideoDirectory", new Object[] {OldDirectory,NewDirectory,NewRule,NewSize});
}

/**
Returns the list of valid diskspace rules. Will be localized versions of the strings "Use All", "Use Only" and "Leave Free"

Returns:
the list of valid diskspace rules
 */
public static java.lang.String[] GetVideoDiskspaceRules () {
  return (java.lang.String[]) sagex.SageAPI.call("GetVideoDiskspaceRules", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the list of valid diskspace rules. Will be localized versions of the strings "Use All", "Use Only" and "Leave Free"

Returns:
the list of valid diskspace rules
 */
public static java.lang.String[] GetVideoDiskspaceRules (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetVideoDiskspaceRules", (Object[])null);
}

/**
Returns the infrared codes that are linked to the given SageTV Command. When one of these IR codes is received; that will cause the
 specified SageTV Command to get executed.

Parameters:
SageCommand- the SageTV Command for which the IR codes should be retrieved
Returns:
the infrared codes that are linked to the specified SageTV Command
 */
public static long[] GetIRCodesLinkedToSageCommand (java.lang.String SageCommand) {
  return (long[]) sagex.SageAPI.call("GetIRCodesLinkedToSageCommand", new Object[] {SageCommand});
}

/**
 * UI Context Aware Call<br>
Returns the infrared codes that are linked to the given SageTV Command. When one of these IR codes is received; that will cause the
 specified SageTV Command to get executed.

Parameters:
SageCommand- the SageTV Command for which the IR codes should be retrieved
Returns:
the infrared codes that are linked to the specified SageTV Command
 */
public static long[] GetIRCodesLinkedToSageCommand (UIContext _uicontext,java.lang.String SageCommand) {
  return (long[]) sagex.SageAPI.call(_uicontext, "GetIRCodesLinkedToSageCommand", new Object[] {SageCommand});
}

/**
Returns the keystroke names that are linked to the given SageTV Command. When one of these keystrokes is received; that will cause the
 specified SageTV Command to get executed.

Parameters:
SageCommand- the SageTV Command for which the keystrokes should be retrieved
Returns:
the keystrokes that are linked to the specified SageTV Command
 */
public static java.lang.String[] GetKeystrokesLinkedToSageCommand (java.lang.String SageCommand) {
  return (java.lang.String[]) sagex.SageAPI.call("GetKeystrokesLinkedToSageCommand", new Object[] {SageCommand});
}

/**
 * UI Context Aware Call<br>
Returns the keystroke names that are linked to the given SageTV Command. When one of these keystrokes is received; that will cause the
 specified SageTV Command to get executed.

Parameters:
SageCommand- the SageTV Command for which the keystrokes should be retrieved
Returns:
the keystrokes that are linked to the specified SageTV Command
 */
public static java.lang.String[] GetKeystrokesLinkedToSageCommand (UIContext _uicontext,java.lang.String SageCommand) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetKeystrokesLinkedToSageCommand", new Object[] {SageCommand});
}

/**
Gets the name that is associated with an IR code. This has no functional purpose and is purely for display purposes.

Parameters:
IRCode- the IRCode to get the associated name for, seeSetNameForIRCode()

Returns:
the name for the specified IRCode
 */
public static java.lang.String GetNameForIRCode (long IRCode) {
  Object o = sagex.SageAPI.call("GetNameForIRCode", new Object[] {IRCode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name that is associated with an IR code. This has no functional purpose and is purely for display purposes.

Parameters:
IRCode- the IRCode to get the associated name for, seeSetNameForIRCode()

Returns:
the name for the specified IRCode
 */
public static java.lang.String GetNameForIRCode (UIContext _uicontext,long IRCode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNameForIRCode", new Object[] {IRCode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the SageTV Command that is linked to the specified infrared code.

Parameters:
IRCode- the infrared code
Returns:
the SageTV Command that is linked to the specified infrared code
 */
public static java.lang.String GetSageCommandLinkedToIRCode (long IRCode) {
  Object o = sagex.SageAPI.call("GetSageCommandLinkedToIRCode", new Object[] {IRCode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the SageTV Command that is linked to the specified infrared code.

Parameters:
IRCode- the infrared code
Returns:
the SageTV Command that is linked to the specified infrared code
 */
public static java.lang.String GetSageCommandLinkedToIRCode (UIContext _uicontext,long IRCode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSageCommandLinkedToIRCode", new Object[] {IRCode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the SageTV Command that is linked to the specified keystroke.

Parameters:
Keystroke- the name of the keystroke
Returns:
the SageTV Command that is linked to the specified keystroke
 */
public static java.lang.String GetSageCommandLinkedToKeystroke (java.lang.String Keystroke) {
  Object o = sagex.SageAPI.call("GetSageCommandLinkedToKeystroke", new Object[] {Keystroke});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the SageTV Command that is linked to the specified keystroke.

Parameters:
Keystroke- the name of the keystroke
Returns:
the SageTV Command that is linked to the specified keystroke
 */
public static java.lang.String GetSageCommandLinkedToKeystroke (UIContext _uicontext,java.lang.String Keystroke) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSageCommandLinkedToKeystroke", new Object[] {Keystroke});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name for a given IR code. This has no functional purpose, and is purely for display purposes.

Parameters:
IRCode- the infrared code to attach a name to
Name- the name to attach to the specified infrared code
 */
public static void SetNameForIRCode (long IRCode, java.lang.String Name) {
   sagex.SageAPI.call("SetNameForIRCode", new Object[] {IRCode,Name});
}

/**
 * UI Context Aware Call<br>
Sets the name for a given IR code. This has no functional purpose, and is purely for display purposes.

Parameters:
IRCode- the infrared code to attach a name to
Name- the name to attach to the specified infrared code
 */
public static void SetNameForIRCode (UIContext _uicontext,long IRCode, java.lang.String Name) {
   sagex.SageAPI.call(_uicontext, "SetNameForIRCode", new Object[] {IRCode,Name});
}

/**
Links an infrared code to a SageTV Command. The specified SageTV Command will then be executed whenever the specified IRCode is received.

Parameters:
IRCode- the infrared code to link to the SageTV Command
SageCommand- the SageTVCommand to link the infrared code to
 */
public static void LinkIRCodeToSageCommand (long IRCode, java.lang.String SageCommand) {
   sagex.SageAPI.call("LinkIRCodeToSageCommand", new Object[] {IRCode,SageCommand});
}

/**
 * UI Context Aware Call<br>
Links an infrared code to a SageTV Command. The specified SageTV Command will then be executed whenever the specified IRCode is received.

Parameters:
IRCode- the infrared code to link to the SageTV Command
SageCommand- the SageTVCommand to link the infrared code to
 */
public static void LinkIRCodeToSageCommand (UIContext _uicontext,long IRCode, java.lang.String SageCommand) {
   sagex.SageAPI.call(_uicontext, "LinkIRCodeToSageCommand", new Object[] {IRCode,SageCommand});
}

/**
Links a keystroke to a SageTV Command. The specified SageTV Command will then be executed whenever the specified keystroke is received.

Parameters:
Keystroke- the name of the keystroke to link to the SageTV Command
SageCommand- the SageTVCommand to link the keystroke to
 */
public static void LinkKeystrokeToSageCommand (java.lang.String Keystroke, java.lang.String SageCommand) {
   sagex.SageAPI.call("LinkKeystrokeToSageCommand", new Object[] {Keystroke,SageCommand});
}

/**
 * UI Context Aware Call<br>
Links a keystroke to a SageTV Command. The specified SageTV Command will then be executed whenever the specified keystroke is received.

Parameters:
Keystroke- the name of the keystroke to link to the SageTV Command
SageCommand- the SageTVCommand to link the keystroke to
 */
public static void LinkKeystrokeToSageCommand (UIContext _uicontext,java.lang.String Keystroke, java.lang.String SageCommand) {
   sagex.SageAPI.call(_uicontext, "LinkKeystrokeToSageCommand", new Object[] {Keystroke,SageCommand});
}

/**
Unlinks an infrared code from any SageTV commands it is linked to

Parameters:
IRCode- the infrared code to unlink from any SageTV Commands that it is linked with
 */
public static void UnlinkIRCodeFromSageCommands (long IRCode) {
   sagex.SageAPI.call("UnlinkIRCodeFromSageCommands", new Object[] {IRCode});
}

/**
 * UI Context Aware Call<br>
Unlinks an infrared code from any SageTV commands it is linked to

Parameters:
IRCode- the infrared code to unlink from any SageTV Commands that it is linked with
 */
public static void UnlinkIRCodeFromSageCommands (UIContext _uicontext,long IRCode) {
   sagex.SageAPI.call(_uicontext, "UnlinkIRCodeFromSageCommands", new Object[] {IRCode});
}

/**
Unlinks a keystroke from any SageTV commands it is linked to

Parameters:
Keystroke- the keystroke to unlink from any SageTV Commands that it is linked with
 */
public static void UnlinkKeystrokeFromSageCommands (java.lang.String Keystroke) {
   sagex.SageAPI.call("UnlinkKeystrokeFromSageCommands", new Object[] {Keystroke});
}

/**
 * UI Context Aware Call<br>
Unlinks a keystroke from any SageTV commands it is linked to

Parameters:
Keystroke- the keystroke to unlink from any SageTV Commands that it is linked with
 */
public static void UnlinkKeystrokeFromSageCommands (UIContext _uicontext,java.lang.String Keystroke) {
   sagex.SageAPI.call(_uicontext, "UnlinkKeystrokeFromSageCommands", new Object[] {Keystroke});
}

/**
Sets whether or not a given rating should be restricted under parental control

Parameters:
Rating- the name of the rating
Restricted- true if the specified Rating should be restricted by parental control, false otherwise
 */
public static void SetRatingUnderParentalControl (java.lang.String Rating, boolean Restricted) {
   sagex.SageAPI.call("SetRatingUnderParentalControl", new Object[] {Rating,Restricted});
}

/**
 * UI Context Aware Call<br>
Sets whether or not a given rating should be restricted under parental control

Parameters:
Rating- the name of the rating
Restricted- true if the specified Rating should be restricted by parental control, false otherwise
 */
public static void SetRatingUnderParentalControl (UIContext _uicontext,java.lang.String Rating, boolean Restricted) {
   sagex.SageAPI.call(_uicontext, "SetRatingUnderParentalControl", new Object[] {Rating,Restricted});
}

/**
Gets the name of the port that the infrared receiver is connected to.

Returns:
the name of the port that the infrared receiver is connected to; will be a value like: "COM1", "COM2" or "USB"
 */
public static java.lang.String GetInfraredReceiverPort () {
  Object o = sagex.SageAPI.call("GetInfraredReceiverPort", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the port that the infrared receiver is connected to.

Returns:
the name of the port that the infrared receiver is connected to; will be a value like: "COM1", "COM2" or "USB"
 */
public static java.lang.String GetInfraredReceiverPort (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInfraredReceiverPort", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the port that the infrared receiver is connected to.

Parameters:
Port- the name of the port that the infrared receiver is connected to; should be a value like: "COM1", "COM2" or "USB"
Returns:
true on success, false otherwise
 */
public static boolean SetInfraredReceiverPort (java.lang.String Port) {
  Object o = sagex.SageAPI.call("SetInfraredReceiverPort", new Object[] {Port});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the name of the port that the infrared receiver is connected to.

Parameters:
Port- the name of the port that the infrared receiver is connected to; should be a value like: "COM1", "COM2" or "USB"
Returns:
true on success, false otherwise
 */
public static boolean SetInfraredReceiverPort (UIContext _uicontext,java.lang.String Port) {
  Object o = sagex.SageAPI.call(_uicontext, "SetInfraredReceiverPort", new Object[] {Port});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the inactivity timeout in milliseconds. The hook InactivityTimeout() will be called whenever the system experiences inactivity
 for this amount of time.

Returns:
the inactivity timeout in milliseconds
 */
public static int GetInactivityTimeout () {
  Object o = sagex.SageAPI.call("GetInactivityTimeout", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the inactivity timeout in milliseconds. The hook InactivityTimeout() will be called whenever the system experiences inactivity
 for this amount of time.

Returns:
the inactivity timeout in milliseconds
 */
public static int GetInactivityTimeout (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInactivityTimeout", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the inactivity timeout in milliseconds. The hook InactivityTimeout() will be called whenever the system experiences inactivity
 for this amount of time.

Parameters:
Timeout- the inactivity timeout in milliseconds
 */
public static void SetInactivityTimeout (int Timeout) {
   sagex.SageAPI.call("SetInactivityTimeout", new Object[] {Timeout});
}

/**
 * UI Context Aware Call<br>
Sets the inactivity timeout in milliseconds. The hook InactivityTimeout() will be called whenever the system experiences inactivity
 for this amount of time.

Parameters:
Timeout- the inactivity timeout in milliseconds
 */
public static void SetInactivityTimeout (UIContext _uicontext,int Timeout) {
   sagex.SageAPI.call(_uicontext, "SetInactivityTimeout", new Object[] {Timeout});
}

/**
Gets the screen saver timeout in milliseconds. The "Screen Saver" menu will be launched after this period of user inactivity if the
 program is in full screen mode.

Returns:
the screen saver timeout in milliseconds
 */
public static int GetScreenSaverTimeout () {
  Object o = sagex.SageAPI.call("GetScreenSaverTimeout", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the screen saver timeout in milliseconds. The "Screen Saver" menu will be launched after this period of user inactivity if the
 program is in full screen mode.

Returns:
the screen saver timeout in milliseconds
 */
public static int GetScreenSaverTimeout (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetScreenSaverTimeout", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the screen saver timeout in milliseconds. The "Screen Saver" menu will be launched after this period of user inactivity if the
 program is in full screen mode.

Parameters:
Timeout- the screen saver timeout in milliseconds
 */
public static void SetScreenSaverTimeout (int Timeout) {
   sagex.SageAPI.call("SetScreenSaverTimeout", new Object[] {Timeout});
}

/**
 * UI Context Aware Call<br>
Sets the screen saver timeout in milliseconds. The "Screen Saver" menu will be launched after this period of user inactivity if the
 program is in full screen mode.

Parameters:
Timeout- the screen saver timeout in milliseconds
 */
public static void SetScreenSaverTimeout (UIContext _uicontext,int Timeout) {
   sagex.SageAPI.call(_uicontext, "SetScreenSaverTimeout", new Object[] {Timeout});
}

/**
Returns true if the SageTV server is enabled. This allows SageTV Clients to connect.

Returns:
true if the SageTV server is enabled, false otherwise
 */
public static boolean IsSageTVServerEnabled () {
  Object o = sagex.SageAPI.call("IsSageTVServerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the SageTV server is enabled. This allows SageTV Clients to connect.

Returns:
true if the SageTV server is enabled, false otherwise
 */
public static boolean IsSageTVServerEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSageTVServerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not the SageTV server should be enabled. This call will take effect immediately (i.e. the server can
 be started/stopped on demand)

Parameters:
Enabled- true if the SageTV server should be enabled, false otherwise
 */
public static void SetSageTVServerEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetSageTVServerEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the SageTV server should be enabled. This call will take effect immediately (i.e. the server can
 be started/stopped on demand)

Parameters:
Enabled- true if the SageTV server should be enabled, false otherwise
 */
public static void SetSageTVServerEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetSageTVServerEnabled", new Object[] {Enabled});
}

/**
Returns true if 3D acceleration is enabled for the rendering engine. This uses DirectX9-3D on Windows and OpenGL on Linux.

Returns:
true if 3D acceleration is enabled for the rendering engine
 */
public static boolean IsAcceleratedDrawingEnabled () {
  Object o = sagex.SageAPI.call("IsAcceleratedDrawingEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if 3D acceleration is enabled for the rendering engine. This uses DirectX9-3D on Windows and OpenGL on Linux.

Returns:
true if 3D acceleration is enabled for the rendering engine
 */
public static boolean IsAcceleratedDrawingEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsAcceleratedDrawingEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Specifies whether or not 3D acceleration should be enabled for the rendering engine. This uses DirectX9 on Windows and OpenGL on Linux.
 This call takes effect immediately.

Parameters:
Enabled- true if 3D acceleration should be enabled, false otherwise.
Returns:
true if the change succeeded, false otherwise
 */
public static boolean SetAcceleratedDrawingEnabled (boolean Enabled) {
  Object o = sagex.SageAPI.call("SetAcceleratedDrawingEnabled", new Object[] {Enabled});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Specifies whether or not 3D acceleration should be enabled for the rendering engine. This uses DirectX9 on Windows and OpenGL on Linux.
 This call takes effect immediately.

Parameters:
Enabled- true if 3D acceleration should be enabled, false otherwise.
Returns:
true if the change succeeded, false otherwise
 */
public static boolean SetAcceleratedDrawingEnabled (UIContext _uicontext,boolean Enabled) {
  Object o = sagex.SageAPI.call(_uicontext, "SetAcceleratedDrawingEnabled", new Object[] {Enabled});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the horizontal offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the horizontal offset in pixles that should be applied to the UI to account for overscan, positive values move it to the right
 */
public static int GetOverscanOffsetX () {
  Object o = sagex.SageAPI.call("GetOverscanOffsetX", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the horizontal offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the horizontal offset in pixles that should be applied to the UI to account for overscan, positive values move it to the right
 */
public static int GetOverscanOffsetX (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanOffsetX", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the vertical offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the vertical offset in pixles that should be applied to the UI to account for overscan, positive values move it down
 */
public static int GetOverscanOffsetY () {
  Object o = sagex.SageAPI.call("GetOverscanOffsetY", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the vertical offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the vertical offset in pixles that should be applied to the UI to account for overscan, positive values move it down
 */
public static int GetOverscanOffsetY (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanOffsetY", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the horizontal scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the horizontal scale factor that should be applied to the UI to account for overscan
 */
public static float GetOverscanScaleWidth () {
  Object o = sagex.SageAPI.call("GetOverscanScaleWidth", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the horizontal scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the horizontal scale factor that should be applied to the UI to account for overscan
 */
public static float GetOverscanScaleWidth (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanScaleWidth", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns the vertical scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the vertical scale factor that should be applied to the UI to account for overscan
 */
public static float GetOverscanScaleHeight () {
  Object o = sagex.SageAPI.call("GetOverscanScaleHeight", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the vertical scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Returns:
the vertical scale factor that should be applied to the UI to account for overscan
 */
public static float GetOverscanScaleHeight (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanScaleHeight", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Sets the horizontal offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the horizontal offset in pixles that should be applied to the UI to account for overscan, positive values move it to the right
 */
public static void SetOverscanOffsetX (int Amount) {
   sagex.SageAPI.call("SetOverscanOffsetX", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Sets the horizontal offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the horizontal offset in pixles that should be applied to the UI to account for overscan, positive values move it to the right
 */
public static void SetOverscanOffsetX (UIContext _uicontext,int Amount) {
   sagex.SageAPI.call(_uicontext, "SetOverscanOffsetX", new Object[] {Amount});
}

/**
Sets the vertical offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the vertical offset in pixles that should be applied to the UI to account for overscan, positive values move it down
 */
public static void SetOverscanOffsetY (int Amount) {
   sagex.SageAPI.call("SetOverscanOffsetY", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Sets the vertical offset in pixels that should be applied to the UI to account for overscan. This moves the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the vertical offset in pixles that should be applied to the UI to account for overscan, positive values move it down
 */
public static void SetOverscanOffsetY (UIContext _uicontext,int Amount) {
   sagex.SageAPI.call(_uicontext, "SetOverscanOffsetY", new Object[] {Amount});
}

/**
Sets the horizontal scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the horizontal scale factor that should be applied to the UI to account for overscan
 */
public static void SetOverscanScaleWidth (float Amount) {
   sagex.SageAPI.call("SetOverscanScaleWidth", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Sets the horizontal scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the horizontal scale factor that should be applied to the UI to account for overscan
 */
public static void SetOverscanScaleWidth (UIContext _uicontext,float Amount) {
   sagex.SageAPI.call(_uicontext, "SetOverscanScaleWidth", new Object[] {Amount});
}

/**
Sets the vertical scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the vertical scale factor that should be applied to the UI to account for overscan
 */
public static void SetOverscanScaleHeight (float Amount) {
   sagex.SageAPI.call("SetOverscanScaleHeight", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Sets the vertical scale factor that should be applied to the UI to account for overscan. This shrinks the UI to fit on a TV screen in the
 case where it goes off the edges of the screen due to what is known as 'Overscan'.

Parameters:
Amount- the vertical scale factor that should be applied to the UI to account for overscan
 */
public static void SetOverscanScaleHeight (UIContext _uicontext,float Amount) {
   sagex.SageAPI.call(_uicontext, "SetOverscanScaleHeight", new Object[] {Amount});
}

/**
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the left side.
 Equivalent to (GetOverscanOffsetX() * 1.0 / (GetFullUIWidth() * GetOverscanScaleWidth()))

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the left side
Since:
7.0
 */
public static float GetOverscanInsetLeft () {
  Object o = sagex.SageAPI.call("GetOverscanInsetLeft", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the left side.
 Equivalent to (GetOverscanOffsetX() * 1.0 / (GetFullUIWidth() * GetOverscanScaleWidth()))

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the left side
Since:
7.0
 */
public static float GetOverscanInsetLeft (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanInsetLeft", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the right side.
 Equivalent to (1.0 - (GetOverscanOffsetX() * 1.0 / GetFullUIWidth()) - GetOverscanScaleWidth())/GetOverscanScaleWidth()

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the right side
Since:
7.0
 */
public static float GetOverscanInsetRight () {
  Object o = sagex.SageAPI.call("GetOverscanInsetRight", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the right side.
 Equivalent to (1.0 - (GetOverscanOffsetX() * 1.0 / GetFullUIWidth()) - GetOverscanScaleWidth())/GetOverscanScaleWidth()

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the right side
Since:
7.0
 */
public static float GetOverscanInsetRight (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanInsetRight", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the top
 Equivalent to (GetOverscanOffsetY() * 1.0 / (GetFullUIHeight() * GetOverscanScaleHeight())))

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the top
Since:
7.0
 */
public static float GetOverscanInsetTop () {
  Object o = sagex.SageAPI.call("GetOverscanInsetTop", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the top
 Equivalent to (GetOverscanOffsetY() * 1.0 / (GetFullUIHeight() * GetOverscanScaleHeight())))

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the top
Since:
7.0
 */
public static float GetOverscanInsetTop (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanInsetTop", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the bottom
 Equivalent to (1.0 - (GetOverscanOffsetY() * 1.0 / GetFullUIHeight()) - GetOverscanScaleHeight())/GetOverscanScaleHeight()

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the bottom
Since:
7.0
 */
public static float GetOverscanInsetBottom () {
  Object o = sagex.SageAPI.call("GetOverscanInsetBottom", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns a floating point value which specifies the percent of the UI that is taken up by overscan on the bottom
 Equivalent to (1.0 - (GetOverscanOffsetY() * 1.0 / GetFullUIHeight()) - GetOverscanScaleHeight())/GetOverscanScaleHeight()

Returns:
a floating point value which specifies the percent of the UI that is taken up by overscan on the bottom
Since:
7.0
 */
public static float GetOverscanInsetBottom (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetOverscanInsetBottom", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Returns a length 4 array of floating point values which specifies the percent of the UI that is taken up by overscan on the 4 sides.
 The order is top, left, bottom, right in the returned array. Each value comes from GetOverscanInsetTop/Left/Bottom/Right() API calls.

Returns:
a length 4 array of floating point values which specifies the percent of the UI that is taken up by overscan on the 4 sides
Since:
7.0
 */
public static java.lang.Float[] GetOverscanInsets () {
  return (java.lang.Float[]) sagex.SageAPI.call("GetOverscanInsets", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a length 4 array of floating point values which specifies the percent of the UI that is taken up by overscan on the 4 sides.
 The order is top, left, bottom, right in the returned array. Each value comes from GetOverscanInsetTop/Left/Bottom/Right() API calls.

Returns:
a length 4 array of floating point values which specifies the percent of the UI that is taken up by overscan on the 4 sides
Since:
7.0
 */
public static java.lang.Float[] GetOverscanInsets (UIContext _uicontext) {
  return (java.lang.Float[]) sagex.SageAPI.call(_uicontext, "GetOverscanInsets", (Object[])null);
}

/**
Gets the names of the countries that can be used in theSetCountry()
call.

Returns:
the possible names for country selection
 */
public static java.lang.String[] GetAvailableCountries () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAvailableCountries", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the names of the countries that can be used in theSetCountry()
call.

Returns:
the possible names for country selection
 */
public static java.lang.String[] GetAvailableCountries (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAvailableCountries", (Object[])null);
}

/**
Sets the country that the user is in. This is used for determining the frequencies used for tuning television signals.

Parameters:
Country- the name of the country the user is in, should be a value fromGetAvailableCountries()

Returns:
the passed in Country variable
 */
public static java.lang.String SetCountry (java.lang.String Country) {
  Object o = sagex.SageAPI.call("SetCountry", new Object[] {Country});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Sets the country that the user is in. This is used for determining the frequencies used for tuning television signals.

Parameters:
Country- the name of the country the user is in, should be a value fromGetAvailableCountries()

Returns:
the passed in Country variable
 */
public static java.lang.String SetCountry (UIContext _uicontext,java.lang.String Country) {
  Object o = sagex.SageAPI.call(_uicontext, "SetCountry", new Object[] {Country});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the country that SageTV is configured for. This is used for determining the frequencies used for tuning television signals.

Returns:
the name of the country that SageTV is configured for
 */
public static java.lang.String GetCountry () {
  Object o = sagex.SageAPI.call("GetCountry", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the country that SageTV is configured for. This is used for determining the frequencies used for tuning television signals.

Returns:
the name of the country that SageTV is configured for
 */
public static java.lang.String GetCountry (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCountry", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the analog video format that should be used for capture and playback. Valid values are "NTSC" or "PAL"

Parameters:
Format- the analog video format that should be used for capture and playback; valid values are "NTSC" or "PAL"
 */
public static void SetAnalogVideoFormat (java.lang.String Format) {
   sagex.SageAPI.call("SetAnalogVideoFormat", new Object[] {Format});
}

/**
 * UI Context Aware Call<br>
Sets the analog video format that should be used for capture and playback. Valid values are "NTSC" or "PAL"

Parameters:
Format- the analog video format that should be used for capture and playback; valid values are "NTSC" or "PAL"
 */
public static void SetAnalogVideoFormat (UIContext _uicontext,java.lang.String Format) {
   sagex.SageAPI.call(_uicontext, "SetAnalogVideoFormat", new Object[] {Format});
}

/**
Gets the analog video format that should be used for capture and playback. Valid values are "NTSC" or "PAL"

Returns:
the analog video format that should be used for capture and playback
 */
public static java.lang.String GetAnalogVideoFormat () {
  Object o = sagex.SageAPI.call("GetAnalogVideoFormat", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the analog video format that should be used for capture and playback. Valid values are "NTSC" or "PAL"

Returns:
the analog video format that should be used for capture and playback
 */
public static java.lang.String GetAnalogVideoFormat (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAnalogVideoFormat", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the language that the user interface should be displayed in.

Returns:
the language that the user interface should be displayed in
 */
public static java.lang.String GetUILanguage () {
  Object o = sagex.SageAPI.call("GetUILanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the language that the user interface should be displayed in.

Returns:
the language that the user interface should be displayed in
 */
public static java.lang.String GetUILanguage (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetUILanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the language that the user interface should be displayed in. This takes effect immediately.
 Use theGetAvailableUILanguages()
call to get the options for this.

Parameters:
Language- the language that the user interface should be displayed in
 */
public static void SetUILanguage (java.lang.String Language) {
   sagex.SageAPI.call("SetUILanguage", new Object[] {Language});
}

/**
 * UI Context Aware Call<br>
Sets the language that the user interface should be displayed in. This takes effect immediately.
 Use theGetAvailableUILanguages()
call to get the options for this.

Parameters:
Language- the language that the user interface should be displayed in
 */
public static void SetUILanguage (UIContext _uicontext,java.lang.String Language) {
   sagex.SageAPI.call(_uicontext, "SetUILanguage", new Object[] {Language});
}

/**
Gets the list of languages that are available to be used for the user interface.

Returns:
the list of languages that are available to be used for the user interface
 */
public static java.lang.String[] GetAvailableUILanguages () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAvailableUILanguages", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of languages that are available to be used for the user interface.

Returns:
the list of languages that are available to be used for the user interface
 */
public static java.lang.String[] GetAvailableUILanguages (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAvailableUILanguages", (Object[])null);
}

/**
Gets the list of languages that are available to be used as presets for Audio tracks or Subpicture.

Returns:
the list of languages that are available to be used as presets for Audio tracks or Subpicture.
 */
public static java.lang.String[] GetSubpicAudioLanguageOptions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetSubpicAudioLanguageOptions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of languages that are available to be used as presets for Audio tracks or Subpicture.

Returns:
the list of languages that are available to be used as presets for Audio tracks or Subpicture.
 */
public static java.lang.String[] GetSubpicAudioLanguageOptions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetSubpicAudioLanguageOptions", (Object[])null);
}

/**
Gets the name of the preferred default language when selecting which audio stream to playback.

Returns:
the name of the preferred default language when selecting which audio stream to playback
 */
public static java.lang.String GetDefaultAudioLanguage () {
  Object o = sagex.SageAPI.call("GetDefaultAudioLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the preferred default language when selecting which audio stream to playback.

Returns:
the name of the preferred default language when selecting which audio stream to playback
 */
public static java.lang.String GetDefaultAudioLanguage (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDefaultAudioLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the preferred default language when selecting which audio stream to playback. The values for this should be
 obtained from GetSubpicAudioLanguageOptions.

Parameters:
Language- the name of the preferred default language when selecting which audio stream to playback
 */
public static void SetDefaultAudioLanguage (java.lang.String Language) {
   sagex.SageAPI.call("SetDefaultAudioLanguage", new Object[] {Language});
}

/**
 * UI Context Aware Call<br>
Sets the name of the preferred default language when selecting which audio stream to playback. The values for this should be
 obtained from GetSubpicAudioLanguageOptions.

Parameters:
Language- the name of the preferred default language when selecting which audio stream to playback
 */
public static void SetDefaultAudioLanguage (UIContext _uicontext,java.lang.String Language) {
   sagex.SageAPI.call(_uicontext, "SetDefaultAudioLanguage", new Object[] {Language});
}

/**
Gets the name of the preferred default language when selecting which subpicture stream to playback. This
 will be the empty string if subtitles are preferred to be off by default.

Returns:
the name of the preferred default language when selecting which subpicture stream to playback or the empty string for no subtitles
 */
public static java.lang.String GetDefaultSubpicLanguage () {
  Object o = sagex.SageAPI.call("GetDefaultSubpicLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the preferred default language when selecting which subpicture stream to playback. This
 will be the empty string if subtitles are preferred to be off by default.

Returns:
the name of the preferred default language when selecting which subpicture stream to playback or the empty string for no subtitles
 */
public static java.lang.String GetDefaultSubpicLanguage (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDefaultSubpicLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the preferred default language when selecting which subpicture stream to playback. The values for this should be
 obtained from GetSubpicAudioLanguageOptions, the value of null or the empty string is also allowed to indicate no subtitle track should be selected by default.

Parameters:
Language- the name of the preferred default language when selecting which subpicture stream to playback, null or the empty string can be used to prefer no subtitles
 */
public static void SetDefaultSubpicLanguage (java.lang.String Language) {
   sagex.SageAPI.call("SetDefaultSubpicLanguage", new Object[] {Language});
}

/**
 * UI Context Aware Call<br>
Sets the name of the preferred default language when selecting which subpicture stream to playback. The values for this should be
 obtained from GetSubpicAudioLanguageOptions, the value of null or the empty string is also allowed to indicate no subtitle track should be selected by default.

Parameters:
Language- the name of the preferred default language when selecting which subpicture stream to playback, null or the empty string can be used to prefer no subtitles
 */
public static void SetDefaultSubpicLanguage (UIContext _uicontext,java.lang.String Language) {
   sagex.SageAPI.call(_uicontext, "SetDefaultSubpicLanguage", new Object[] {Language});
}

/**
Gets the name of the time zone that the application is currently configured to use

Returns:
the name of the time zone that the application is currently configured to use
 */
public static java.lang.String GetTimeZone () {
  Object o = sagex.SageAPI.call("GetTimeZone", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the time zone that the application is currently configured to use

Returns:
the name of the time zone that the application is currently configured to use
 */
public static java.lang.String GetTimeZone (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTimeZone", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the time zone that the application should use. This takes effect immediately.

Parameters:
TimeZone- the name of the time zone to use, seeGetAllTimeZones()
 */
public static void SetTimeZone (java.lang.String TimeZone) {
   sagex.SageAPI.call("SetTimeZone", new Object[] {TimeZone});
}

/**
 * UI Context Aware Call<br>
Sets the name of the time zone that the application should use. This takes effect immediately.

Parameters:
TimeZone- the name of the time zone to use, seeGetAllTimeZones()
 */
public static void SetTimeZone (UIContext _uicontext,java.lang.String TimeZone) {
   sagex.SageAPI.call(_uicontext, "SetTimeZone", new Object[] {TimeZone});
}

/**
Gets the list of all of the valid time zone names

Returns:
the list of all of the valid time zone names
 */
public static java.util.Vector GetAllTimeZones () {
  Object o = sagex.SageAPI.call("GetAllTimeZones", (Object[])null);
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the list of all of the valid time zone names

Returns:
the list of all of the valid time zone names
 */
public static java.util.Vector GetAllTimeZones (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAllTimeZones", (Object[])null);
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Gets the names of the regions for the configured country which are used for dividing it up into
 different areas for DVB-T reception. Returns a zero-length list if there are no sub-regions within the country.
 Use the results from this in a call toSetDVBTRegion(DVBTRegion)


Returns:
the region names in the country to use for DVBT reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBTRegions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVBTRegions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the names of the regions for the configured country which are used for dividing it up into
 different areas for DVB-T reception. Returns a zero-length list if there are no sub-regions within the country.
 Use the results from this in a call toSetDVBTRegion(DVBTRegion)


Returns:
the region names in the country to use for DVBT reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBTRegions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVBTRegions", (Object[])null);
}

/**
Sets the the region within the current country that the user is in.

Parameters:
DVBTRegion- the name of the region the user is in, should be a value fromGetDVBTRegions()

Since:
5.1
 */
public static void SetDVBTRegion (java.lang.String DVBTRegion) {
   sagex.SageAPI.call("SetDVBTRegion", new Object[] {DVBTRegion});
}

/**
 * UI Context Aware Call<br>
Sets the the region within the current country that the user is in.

Parameters:
DVBTRegion- the name of the region the user is in, should be a value fromGetDVBTRegions()

Since:
5.1
 */
public static void SetDVBTRegion (UIContext _uicontext,java.lang.String DVBTRegion) {
   sagex.SageAPI.call(_uicontext, "SetDVBTRegion", new Object[] {DVBTRegion});
}

/**
Gets the the region within the current country that the user is in for DVB-T tuning purposes.
 Must have been set with a call toSetDVBTRegion(DVBTRegion)


Returns:
the name of the region the user is in
Since:
5.1
 */
public static java.lang.String GetDVBTRegion () {
  Object o = sagex.SageAPI.call("GetDVBTRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the the region within the current country that the user is in for DVB-T tuning purposes.
 Must have been set with a call toSetDVBTRegion(DVBTRegion)


Returns:
the name of the region the user is in
Since:
5.1
 */
public static java.lang.String GetDVBTRegion (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVBTRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the names of the DVB-C providers for the configured country which are used for dividing it up into
 different areas for DVB-C reception. Returns a zero-length list if there are one or no providers in this country.
 Use the results from this in a call toSetDVBCRegion(DVBCRegion)


Returns:
the provider names in the country to use for DVBC reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBCRegions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVBCRegions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the names of the DVB-C providers for the configured country which are used for dividing it up into
 different areas for DVB-C reception. Returns a zero-length list if there are one or no providers in this country.
 Use the results from this in a call toSetDVBCRegion(DVBCRegion)


Returns:
the provider names in the country to use for DVBC reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBCRegions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVBCRegions", (Object[])null);
}

/**
Sets the the provider within the current country that the user has for DVBC reception.

Parameters:
DVBCRegion- the name of the provider the user has, should be a value fromGetDVBCRegions()

Since:
5.1
 */
public static void SetDVBCRegion (java.lang.String DVBCRegion) {
   sagex.SageAPI.call("SetDVBCRegion", new Object[] {DVBCRegion});
}

/**
 * UI Context Aware Call<br>
Sets the the provider within the current country that the user has for DVBC reception.

Parameters:
DVBCRegion- the name of the provider the user has, should be a value fromGetDVBCRegions()

Since:
5.1
 */
public static void SetDVBCRegion (UIContext _uicontext,java.lang.String DVBCRegion) {
   sagex.SageAPI.call(_uicontext, "SetDVBCRegion", new Object[] {DVBCRegion});
}

/**
Gets the the provider within the current country that the user has for DVB-C tuning purposes.
 Must have been set with a call toSetDVBCRegion(DVBCRegion)


Returns:
the name of the provider the user has for DVB-C
Since:
5.1
 */
public static java.lang.String GetDVBCRegion () {
  Object o = sagex.SageAPI.call("GetDVBCRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the the provider within the current country that the user has for DVB-C tuning purposes.
 Must have been set with a call toSetDVBCRegion(DVBCRegion)


Returns:
the name of the provider the user has for DVB-C
Since:
5.1
 */
public static java.lang.String GetDVBCRegion (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVBCRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the names of the providers for the configured country which are used for dividing it up into
 different areas for DVB-S reception. Returns a zero-length list if there are one or no providers within the country.
 Use the results from this in a call toSetDVBSRegion(DVBSRegion)


Returns:
the providers names in the country to use for DVBS reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBSRegions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVBSRegions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the names of the providers for the configured country which are used for dividing it up into
 different areas for DVB-S reception. Returns a zero-length list if there are one or no providers within the country.
 Use the results from this in a call toSetDVBSRegion(DVBSRegion)


Returns:
the providers names in the country to use for DVBS reception differentiation
Since:
5.1
 */
public static java.lang.String[] GetDVBSRegions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVBSRegions", (Object[])null);
}

/**
Sets the the provider within the current country that the user has for DVBS reception.

Parameters:
DVBSRegion- the name of the provider the user has, should be a value fromGetDVBSRegions()

Since:
5.1
 */
public static void SetDVBSRegion (java.lang.String DVBSRegion) {
   sagex.SageAPI.call("SetDVBSRegion", new Object[] {DVBSRegion});
}

/**
 * UI Context Aware Call<br>
Sets the the provider within the current country that the user has for DVBS reception.

Parameters:
DVBSRegion- the name of the provider the user has, should be a value fromGetDVBSRegions()

Since:
5.1
 */
public static void SetDVBSRegion (UIContext _uicontext,java.lang.String DVBSRegion) {
   sagex.SageAPI.call(_uicontext, "SetDVBSRegion", new Object[] {DVBSRegion});
}

/**
Gets the the provider within the current country that the user has for DVB-S tuning purposes.
 Must have been set with a call toSetDVBSRegion(DVBSRegion)


Returns:
the name of the provider the user has for DVB-S
Since:
5.1
 */
public static java.lang.String GetDVBSRegion () {
  Object o = sagex.SageAPI.call("GetDVBSRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the the provider within the current country that the user has for DVB-S tuning purposes.
 Must have been set with a call toSetDVBSRegion(DVBSRegion)


Returns:
the name of the provider the user has for DVB-S
Since:
5.1
 */
public static java.lang.String GetDVBSRegion (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVBSRegion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if this device can do native output resolutions (where output resolution
 matches the format of the media being played)

Returns:
true if this device can do native output resolutions
Since:
6.3
 */
public static boolean CanDoNativeOutputResolution () {
  Object o = sagex.SageAPI.call("CanDoNativeOutputResolution", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this device can do native output resolutions (where output resolution
 matches the format of the media being played)

Returns:
true if this device can do native output resolutions
Since:
6.3
 */
public static boolean CanDoNativeOutputResolution (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "CanDoNativeOutputResolution", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this device is configured to match the output resolution to the media format's resolution

Returns:
true if this device is configured to match the output resolution to the media format's resolution
Since:
6.3
 */
public static boolean IsNativeOutputResolutionEnabled () {
  Object o = sagex.SageAPI.call("IsNativeOutputResolutionEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this device is configured to match the output resolution to the media format's resolution

Returns:
true if this device is configured to match the output resolution to the media format's resolution
Since:
6.3
 */
public static boolean IsNativeOutputResolutionEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNativeOutputResolutionEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not this device should try to match its output resolution to the media format's resolution

Parameters:
Enabled- true if this device should be configured to match the output resolution to the media format's resolution; false to use a fixed resolution
Since:
6.3
 */
public static void SetNativeOutputResolutionEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetNativeOutputResolutionEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not this device should try to match its output resolution to the media format's resolution

Parameters:
Enabled- true if this device should be configured to match the output resolution to the media format's resolution; false to use a fixed resolution
Since:
6.3
 */
public static void SetNativeOutputResolutionEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetNativeOutputResolutionEnabled", new Object[] {Enabled});
}

/**
Returns a string describing the currently selected audio output (empty string if this can't be configured)

Returns:
a string describing the currently selected audio output (empty string if this can't be configured)
Since:
6.3
 */
public static java.lang.String GetAudioOutput () {
  Object o = sagex.SageAPI.call("GetAudioOutput", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string describing the currently selected audio output (empty string if this can't be configured)

Returns:
a string describing the currently selected audio output (empty string if this can't be configured)
Since:
6.3
 */
public static java.lang.String GetAudioOutput (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAudioOutput", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a list of the possible audio outputs. This is currently only used
 on media extender devices that have adjustable audio outputs.

Returns:
an array of the audio outputs that can be used, null if this change is not supported
Since:
6.3
 */
public static java.lang.String[] GetAudioOutputOptions () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAudioOutputOptions", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of the possible audio outputs. This is currently only used
 on media extender devices that have adjustable audio outputs.

Returns:
an array of the audio outputs that can be used, null if this change is not supported
Since:
6.3
 */
public static java.lang.String[] GetAudioOutputOptions (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAudioOutputOptions", (Object[])null);
}

/**
Sets the current audio output. This is currently only used
 on media extender devices that have configurable audio outputs.

Parameters:
AudioOutput- this must be a value fromGetAudioOutputOptions()
and should be the new desired audio output
Since:
6.3
 */
public static void SetAudioOutput (java.lang.String AudioOutput) {
   sagex.SageAPI.call("SetAudioOutput", new Object[] {AudioOutput});
}

/**
 * UI Context Aware Call<br>
Sets the current audio output. This is currently only used
 on media extender devices that have configurable audio outputs.

Parameters:
AudioOutput- this must be a value fromGetAudioOutputOptions()
and should be the new desired audio output
Since:
6.3
 */
public static void SetAudioOutput (UIContext _uicontext,java.lang.String AudioOutput) {
   sagex.SageAPI.call(_uicontext, "SetAudioOutput", new Object[] {AudioOutput});
}

/**
Returns a string describing the type of connection autodetected on HDMI (currently only used on media extenders)

Returns:
a string describing the type of connection autodetected on HDMI (empty string if this isn't supported)
Since:
6.3
 */
public static java.lang.String GetHDMIAutodetectedConnector () {
  Object o = sagex.SageAPI.call("GetHDMIAutodetectedConnector", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string describing the type of connection autodetected on HDMI (currently only used on media extenders)

Returns:
a string describing the type of connection autodetected on HDMI (empty string if this isn't supported)
Since:
6.3
 */
public static java.lang.String GetHDMIAutodetectedConnector (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetHDMIAutodetectedConnector", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the client supports doing advanced deinterlacing. This is only available on the HD300.

Returns:
true if the client supports doing advanced deinterlacing, false otherwise
 */
public static boolean IsAdvancedDeinterlacingSupported () {
  Object o = sagex.SageAPI.call("IsAdvancedDeinterlacingSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the client supports doing advanced deinterlacing. This is only available on the HD300.

Returns:
true if the client supports doing advanced deinterlacing, false otherwise
 */
public static boolean IsAdvancedDeinterlacingSupported (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsAdvancedDeinterlacingSupported", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the client supports doing advanced deinterlacing and it is enabled. This is only available on the HD300.

Returns:
true if the client supports doing advanced deinterlacing and it is enabled, false otherwise
 */
public static boolean IsAdvancedDeinterlacingEnabled () {
  Object o = sagex.SageAPI.call("IsAdvancedDeinterlacingEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the client supports doing advanced deinterlacing and it is enabled. This is only available on the HD300.

Returns:
true if the client supports doing advanced deinterlacing and it is enabled, false otherwise
 */
public static boolean IsAdvancedDeinterlacingEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsAdvancedDeinterlacingEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Allows enabling/disabling of advanced deinterlacing support. This is only available on the HD300.

Parameters:
Enabled- true if advanced deinterlacing should be enabled, false if it should be disabled
 */
public static void SetAdvancedDeinterlacingEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetAdvancedDeinterlacingEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Allows enabling/disabling of advanced deinterlacing support. This is only available on the HD300.

Parameters:
Enabled- true if advanced deinterlacing should be enabled, false if it should be disabled
 */
public static void SetAdvancedDeinterlacingEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetAdvancedDeinterlacingEnabled", new Object[] {Enabled});
}

/**
Deprecated. 

Sets the DirectShow audio  video decoders on windows to acceptable values
 */
public static void RunFilterAutoconfiguration () {
   sagex.SageAPI.call("RunFilterAutoconfiguration", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Deprecated. 

Sets the DirectShow audio  video decoders on windows to acceptable values
 */
public static void RunFilterAutoconfiguration (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "RunFilterAutoconfiguration", (Object[])null);
}

/**
Gets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D (or Default if not set)
 This is used when playing back MPEG2 files.

Returns:
the preferred DXVA MPEG Mode configuration setting
 */
public static java.lang.String GetDXVAMpegMode () {
  Object o = sagex.SageAPI.call("GetDXVAMpegMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D (or Default if not set)
 This is used when playing back MPEG2 files.

Returns:
the preferred DXVA MPEG Mode configuration setting
 */
public static java.lang.String GetDXVAMpegMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDXVAMpegMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D.
 This is used when playing back MPEG2 files.

Parameters:
DXVAMode- the preferred DXVA MPEG Mode configuration setting, use the empty string or "Default" to disable this
 */
public static void SetDXVAMpegMode (java.lang.String DXVAMode) {
   sagex.SageAPI.call("SetDXVAMpegMode", new Object[] {DXVAMode});
}

/**
 * UI Context Aware Call<br>
Sets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D.
 This is used when playing back MPEG2 files.

Parameters:
DXVAMode- the preferred DXVA MPEG Mode configuration setting, use the empty string or "Default" to disable this
 */
public static void SetDXVAMpegMode (UIContext _uicontext,java.lang.String DXVAMode) {
   sagex.SageAPI.call(_uicontext, "SetDXVAMpegMode", new Object[] {DXVAMode});
}

/**
Gets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D (or Default if not set)
 This is used when playing back DVDs.

Returns:
the preferred DXVA MPEG Mode configuration setting
 */
public static java.lang.String GetDVDDXVAMpegMode () {
  Object o = sagex.SageAPI.call("GetDVDDXVAMpegMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D (or Default if not set)
 This is used when playing back DVDs.

Returns:
the preferred DXVA MPEG Mode configuration setting
 */
public static java.lang.String GetDVDDXVAMpegMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDDXVAMpegMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D.
 This is used when playing back DVDs.

Parameters:
DXVAMode- the preferred DXVA MPEG Mode configuration setting, use the empty string or "Default" to disable this
 */
public static void SetDVDDXVAMpegMode (java.lang.String DXVAMode) {
   sagex.SageAPI.call("SetDVDDXVAMpegMode", new Object[] {DXVAMode});
}

/**
 * UI Context Aware Call<br>
Sets the preferred DXVA MPEG Mode configuration setting (Windows only). This will be A, B, C or D.
 This is used when playing back DVDs.

Parameters:
DXVAMode- the preferred DXVA MPEG Mode configuration setting, use the empty string or "Default" to disable this
 */
public static void SetDVDDXVAMpegMode (UIContext _uicontext,java.lang.String DXVAMode) {
   sagex.SageAPI.call(_uicontext, "SetDVDDXVAMpegMode", new Object[] {DXVAMode});
}

/**
Gets the list of available DXVA MPEG Modes. This will return {"A", "B", "C", "D"}

Returns:
the list of available DXVA MPEG Modes: {"A", "B", "C", "D"}
 */
public static java.lang.String[] GetDXVAMpegModes () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDXVAMpegModes", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of available DXVA MPEG Modes. This will return {"A", "B", "C", "D"}

Returns:
the list of available DXVA MPEG Modes: {"A", "B", "C", "D"}
 */
public static java.lang.String[] GetDXVAMpegModes (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDXVAMpegModes", (Object[])null);
}

/**
Gets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back MPEG2 files.

Returns:
the preferred DXVA Deinterlacing configuration setting
 */
public static java.lang.String GetDXVADeinterlaceMode () {
  Object o = sagex.SageAPI.call("GetDXVADeinterlaceMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back MPEG2 files.

Returns:
the preferred DXVA Deinterlacing configuration setting
 */
public static java.lang.String GetDXVADeinterlaceMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDXVADeinterlaceMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back MPEG2 files.

Parameters:
DeinterlaceMode- the preferred DXVA Deinterlacing configuration setting
 */
public static void SetDXVADeinterlaceMode (java.lang.String DeinterlaceMode) {
   sagex.SageAPI.call("SetDXVADeinterlaceMode", new Object[] {DeinterlaceMode});
}

/**
 * UI Context Aware Call<br>
Sets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back MPEG2 files.

Parameters:
DeinterlaceMode- the preferred DXVA Deinterlacing configuration setting
 */
public static void SetDXVADeinterlaceMode (UIContext _uicontext,java.lang.String DeinterlaceMode) {
   sagex.SageAPI.call(_uicontext, "SetDXVADeinterlaceMode", new Object[] {DeinterlaceMode});
}

/**
Gets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back DVDs.

Returns:
the preferred DXVA Deinterlacing configuration setting
 */
public static java.lang.String GetDVDDXVADeinterlaceMode () {
  Object o = sagex.SageAPI.call("GetDVDDXVADeinterlaceMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back DVDs.

Returns:
the preferred DXVA Deinterlacing configuration setting
 */
public static java.lang.String GetDVDDXVADeinterlaceMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDDXVADeinterlaceMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back DVDs.

Parameters:
DeinterlaceMode- the preferred DXVA Deinterlacing configuration setting
 */
public static void SetDVDDXVADeinterlaceMode (java.lang.String DeinterlaceMode) {
   sagex.SageAPI.call("SetDVDDXVADeinterlaceMode", new Object[] {DeinterlaceMode});
}

/**
 * UI Context Aware Call<br>
Sets the preferred DXVA Deinterlacing configuration setting (Windows only).
 This is used when playing back DVDs.

Parameters:
DeinterlaceMode- the preferred DXVA Deinterlacing configuration setting
 */
public static void SetDVDDXVADeinterlaceMode (UIContext _uicontext,java.lang.String DeinterlaceMode) {
   sagex.SageAPI.call(_uicontext, "SetDVDDXVADeinterlaceMode", new Object[] {DeinterlaceMode});
}

/**
Gets the list of potential DXVA Deinterlacing Capabilities (Widows only)

Returns:
the list of potential DXVA Deinterlacing Capabilities
 */
public static java.lang.String[] GetDXVADeinterlaceModes () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDXVADeinterlaceModes", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of potential DXVA Deinterlacing Capabilities (Widows only)

Returns:
the list of potential DXVA Deinterlacing Capabilities
 */
public static java.lang.String[] GetDXVADeinterlaceModes (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDXVADeinterlaceModes", (Object[])null);
}

/**
Gets the mode that DScaler is currently configured to run in when it is used (Windows only)

Returns:
the mode that DScaler is currently configured to run in when it is used
 */
public static java.lang.String GetDscalerMode () {
  Object o = sagex.SageAPI.call("GetDscalerMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the mode that DScaler is currently configured to run in when it is used (Windows only)

Returns:
the mode that DScaler is currently configured to run in when it is used
 */
public static java.lang.String GetDscalerMode (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDscalerMode", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the mode that DScaler should be configured to run in when it is used (Windows only)

Parameters:
DscalerMode- the mode that DScaler should be configured to run in when it is used
 */
public static void SetDscalerMode (java.lang.String DscalerMode) {
   sagex.SageAPI.call("SetDscalerMode", new Object[] {DscalerMode});
}

/**
 * UI Context Aware Call<br>
Sets the mode that DScaler should be configured to run in when it is used (Windows only)

Parameters:
DscalerMode- the mode that DScaler should be configured to run in when it is used
 */
public static void SetDscalerMode (UIContext _uicontext,java.lang.String DscalerMode) {
   sagex.SageAPI.call(_uicontext, "SetDscalerMode", new Object[] {DscalerMode});
}

/**
Gets the list of the available modes that DScaler can be run in

Returns:
the list of the available modes that DScaler can be run in
 */
public static java.lang.String[] GetDscalerModes () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDscalerModes", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of the available modes that DScaler can be run in

Returns:
the list of the available modes that DScaler can be run in
 */
public static java.lang.String[] GetDscalerModes (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDscalerModes", (Object[])null);
}

/**
Gets the name of the DirectShow audio decoder filter that's used for MPEG2 playback (Windows only)

Returns:
the name of the DirectShow audio decoder filter that's used for MPEG2 playback
 */
public static java.lang.String GetAudioDecoderFilter () {
  Object o = sagex.SageAPI.call("GetAudioDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow audio decoder filter that's used for MPEG2 playback (Windows only)

Returns:
the name of the DirectShow audio decoder filter that's used for MPEG2 playback
 */
public static java.lang.String GetAudioDecoderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAudioDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow audio decoder filter that's used for MPEG2 playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio decoder filter to use for MPEG2 playback
 */
public static void SetAudioDecoderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetAudioDecoderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow audio decoder filter that's used for MPEG2 playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio decoder filter to use for MPEG2 playback
 */
public static void SetAudioDecoderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetAudioDecoderFilter", new Object[] {FilterName});
}

/**
Gets the name of the DirectShow audio decoder filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow audio decoder filter that's used for DVD playback
 */
public static java.lang.String GetDVDAudioDecoderFilter () {
  Object o = sagex.SageAPI.call("GetDVDAudioDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow audio decoder filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow audio decoder filter that's used for DVD playback
 */
public static java.lang.String GetDVDAudioDecoderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDAudioDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow audio decoder filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio decoder filter to use for DVD playback
 */
public static void SetDVDAudioDecoderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetDVDAudioDecoderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow audio decoder filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio decoder filter to use for DVD playback
 */
public static void SetDVDAudioDecoderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetDVDAudioDecoderFilter", new Object[] {FilterName});
}

/**
Gets the name of the DirectShow audio renderer filter that's used for all playback except DVDs (Windows only)

Returns:
the name of the DirectShow audio renderer filter that's used for playback except DVDs
 */
public static java.lang.String GetAudioRenderFilter () {
  Object o = sagex.SageAPI.call("GetAudioRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow audio renderer filter that's used for all playback except DVDs (Windows only)

Returns:
the name of the DirectShow audio renderer filter that's used for playback except DVDs
 */
public static java.lang.String GetAudioRenderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAudioRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow audio renderer filter that's used for playback except DVDs (Windows only)

Parameters:
FilterName- the name of the DirectShow audio renderer filter to use for playback except DVDs
 */
public static void SetAudioRenderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetAudioRenderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow audio renderer filter that's used for playback except DVDs (Windows only)

Parameters:
FilterName- the name of the DirectShow audio renderer filter to use for playback except DVDs
 */
public static void SetAudioRenderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetAudioRenderFilter", new Object[] {FilterName});
}

/**
Gets the name of the DirectShow audio renderer filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow audio renderer filter that's used for DVD playback
 */
public static java.lang.String GetDVDAudioRenderFilter () {
  Object o = sagex.SageAPI.call("GetDVDAudioRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow audio renderer filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow audio renderer filter that's used for DVD playback
 */
public static java.lang.String GetDVDAudioRenderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDAudioRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow audio renderer filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio renderer filter to use for DVD playback
 */
public static void SetDVDAudioRenderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetDVDAudioRenderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow audio renderer filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow audio renderer filter to use for DVD playback
 */
public static void SetDVDAudioRenderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetDVDAudioRenderFilter", new Object[] {FilterName});
}

/**
Gets the video renderer filter that should be used for DVD playback. Possible values are "VMR9",
 "Overlay" and the localized "Default" string

Returns:
the video renderer filter that should be used for DVD playback
 */
public static java.lang.String GetDVDVideoRenderFilter () {
  Object o = sagex.SageAPI.call("GetDVDVideoRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the video renderer filter that should be used for DVD playback. Possible values are "VMR9",
 "Overlay" and the localized "Default" string

Returns:
the video renderer filter that should be used for DVD playback
 */
public static java.lang.String GetDVDVideoRenderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDVideoRenderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the video renderer filter that should be used for DVD playback. Possible values are "VMR9",
 "Overlay" and the localized "Default" string

Parameters:
FilterName- the video renderer filter that should be used for DVD playback
 */
public static void SetDVDVideoRenderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetDVDVideoRenderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the video renderer filter that should be used for DVD playback. Possible values are "VMR9",
 "Overlay" and the localized "Default" string

Parameters:
FilterName- the video renderer filter that should be used for DVD playback
 */
public static void SetDVDVideoRenderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetDVDVideoRenderFilter", new Object[] {FilterName});
}

/**
Gets the name of the DirectShow video decoder filter that's used for MPEG2 playback (Windows only)

Returns:
the name of the DirectShow video decoder filter that's used for MPEG2 playback
 */
public static java.lang.String GetVideoDecoderFilter () {
  Object o = sagex.SageAPI.call("GetVideoDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow video decoder filter that's used for MPEG2 playback (Windows only)

Returns:
the name of the DirectShow video decoder filter that's used for MPEG2 playback
 */
public static java.lang.String GetVideoDecoderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow video decoder filter that's used for MPEG2 playback (Windows only)

Parameters:
FilterName- the name of the DirectShow video decoder filter to use for MPEG2 playback
 */
public static void SetVideoDecoderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetVideoDecoderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow video decoder filter that's used for MPEG2 playback (Windows only)

Parameters:
FilterName- the name of the DirectShow video decoder filter to use for MPEG2 playback
 */
public static void SetVideoDecoderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetVideoDecoderFilter", new Object[] {FilterName});
}

/**
Gets the name of the DirectShow video decoder filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow video decoder filter that's used for DVD playback
 */
public static java.lang.String GetDVDVideoDecoderFilter () {
  Object o = sagex.SageAPI.call("GetDVDVideoDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the DirectShow video decoder filter that's used for DVD playback (Windows only)

Returns:
the name of the DirectShow video decoder filter that's used for DVD playback
 */
public static java.lang.String GetDVDVideoDecoderFilter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDVideoDecoderFilter", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name of the DirectShow video decoder filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow video decoder filter to use for DVD playback
 */
public static void SetDVDVideoDecoderFilter (java.lang.String FilterName) {
   sagex.SageAPI.call("SetDVDVideoDecoderFilter", new Object[] {FilterName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the DirectShow video decoder filter that's used for DVD playback (Windows only)

Parameters:
FilterName- the name of the DirectShow video decoder filter to use for DVD playback
 */
public static void SetDVDVideoDecoderFilter (UIContext _uicontext,java.lang.String FilterName) {
   sagex.SageAPI.call(_uicontext, "SetDVDVideoDecoderFilter", new Object[] {FilterName});
}

/**
Gets the audio delay in milliseconds to apply when playing back MPEG2 files (Windows only)

Returns:
the audio delay in milliseconds to apply when playing back MPEG2 files
 */
public static int GetAudioDelay () {
  Object o = sagex.SageAPI.call("GetAudioDelay", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the audio delay in milliseconds to apply when playing back MPEG2 files (Windows only)

Returns:
the audio delay in milliseconds to apply when playing back MPEG2 files
 */
public static int GetAudioDelay (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAudioDelay", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the audio delay in milliseconds to apply when playing back MPEG2 files (Windows only)

Parameters:
Delay- the audio delay in milliseconds to apply when playing back MPEG2 files
 */
public static void SetAudioDelay (int Delay) {
   sagex.SageAPI.call("SetAudioDelay", new Object[] {Delay});
}

/**
 * UI Context Aware Call<br>
Sets the audio delay in milliseconds to apply when playing back MPEG2 files (Windows only)

Parameters:
Delay- the audio delay in milliseconds to apply when playing back MPEG2 files
 */
public static void SetAudioDelay (UIContext _uicontext,int Delay) {
   sagex.SageAPI.call(_uicontext, "SetAudioDelay", new Object[] {Delay});
}

/**
Gets the list of the audio decoder filters that are available in the system for MPEG2 playback (Windows only)

Returns:
the list of the audio decoder filters that are available in the system for MPEG2 playback
 */
public static java.lang.String[] GetAudioDecoderFilters () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAudioDecoderFilters", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of the audio decoder filters that are available in the system for MPEG2 playback (Windows only)

Returns:
the list of the audio decoder filters that are available in the system for MPEG2 playback
 */
public static java.lang.String[] GetAudioDecoderFilters (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAudioDecoderFilters", (Object[])null);
}

/**
Gets the list of the video decoder filters that are available in the system for MPEG2 playback (Windows only)

Returns:
the list of the video decoder filters that are available in the system for MPEG2 playback
 */
public static java.lang.String[] GetVideoDecoderFilters () {
  return (java.lang.String[]) sagex.SageAPI.call("GetVideoDecoderFilters", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the list of the video decoder filters that are available in the system for MPEG2 playback (Windows only)

Returns:
the list of the video decoder filters that are available in the system for MPEG2 playback
 */
public static java.lang.String[] GetVideoDecoderFilters (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetVideoDecoderFilters", (Object[])null);
}

/**
Returns true if software decoding is disabled. This only applies to the TV output of the Hauppauge WinTV PVR-350 PCI card on Windows

Returns:
true if software decoding is disabled
 */
public static boolean IsSoftwareDecodingDisabled () {
  Object o = sagex.SageAPI.call("IsSoftwareDecodingDisabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if software decoding is disabled. This only applies to the TV output of the Hauppauge WinTV PVR-350 PCI card on Windows

Returns:
true if software decoding is disabled
 */
public static boolean IsSoftwareDecodingDisabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSoftwareDecodingDisabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets if software decoding is disabled. This only applies to the TV output of the Hauppauge WinTV PVR-350 PCI card on Windows

Parameters:
Disabled- true if software decoding is disabled
 */
public static void SetSoftwareDecodingDisabled (boolean Disabled) {
   sagex.SageAPI.call("SetSoftwareDecodingDisabled", new Object[] {Disabled});
}

/**
 * UI Context Aware Call<br>
Sets if software decoding is disabled. This only applies to the TV output of the Hauppauge WinTV PVR-350 PCI card on Windows

Parameters:
Disabled- true if software decoding is disabled
 */
public static void SetSoftwareDecodingDisabled (UIContext _uicontext,boolean Disabled) {
   sagex.SageAPI.call(_uicontext, "SetSoftwareDecodingDisabled", new Object[] {Disabled});
}

/**
Returns true if DScaler is set to double the refresh rate when used. This means it'll run at 60fps instead of 30fps.

Returns:
true if DScaler is set to double the refresh rate when used.
 */
public static boolean IsDscalerDoubleRefresh () {
  Object o = sagex.SageAPI.call("IsDscalerDoubleRefresh", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if DScaler is set to double the refresh rate when used. This means it'll run at 60fps instead of 30fps.

Returns:
true if DScaler is set to double the refresh rate when used.
 */
public static boolean IsDscalerDoubleRefresh (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDscalerDoubleRefresh", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not DScaler should double the refresh rate. This means it'll run at 60fps instead of 30fps.

Parameters:
Enabled- true if DScaler should double the refresh rate when used, false otherwise
 */
public static void SetDscalerDoubleRefresh (boolean Enabled) {
   sagex.SageAPI.call("SetDscalerDoubleRefresh", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not DScaler should double the refresh rate. This means it'll run at 60fps instead of 30fps.

Parameters:
Enabled- true if DScaler should double the refresh rate when used, false otherwise
 */
public static void SetDscalerDoubleRefresh (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetDscalerDoubleRefresh", new Object[] {Enabled});
}

/**
Returns true if DScaler is configured to display the odd field first (fields are even or odd)

Returns:
true if DScaler is configured to display the odd field first
 */
public static boolean IsDscalerOddFieldFirst () {
  Object o = sagex.SageAPI.call("IsDscalerOddFieldFirst", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if DScaler is configured to display the odd field first (fields are even or odd)

Returns:
true if DScaler is configured to display the odd field first
 */
public static boolean IsDscalerOddFieldFirst (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDscalerOddFieldFirst", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets if DScaler should display the odd field first (fields are even or odd)

Parameters:
Enabled- true if DScaler should display the odd field first
 */
public static void SetDscalerOddFieldFirst (boolean Enabled) {
   sagex.SageAPI.call("SetDscalerOddFieldFirst", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets if DScaler should display the odd field first (fields are even or odd)

Parameters:
Enabled- true if DScaler should display the odd field first
 */
public static void SetDscalerOddFieldFirst (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetDscalerOddFieldFirst", new Object[] {Enabled});
}

/**
Returns true if the system has a Hauppauge WinTV PVR-350 card installed which can produce a TV output (Windows only)

Returns:
true if the system has a Hauppauge WinTV PVR-350 card installed which can produce a TV output
 */
public static boolean HasPVR350TVOutput () {
  Object o = sagex.SageAPI.call("HasPVR350TVOutput", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the system has a Hauppauge WinTV PVR-350 card installed which can produce a TV output (Windows only)

Returns:
true if the system has a Hauppauge WinTV PVR-350 card installed which can produce a TV output
 */
public static boolean HasPVR350TVOutput (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasPVR350TVOutput", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the TV output on a Hauppauge WinTV PVR-350 card is enabled (Windows only)

Returns:
true if the TV output on a Hauppauge WinTV PVR-350 card is enabled
 */
public static boolean IsPVR350TVOutputEnabled () {
  Object o = sagex.SageAPI.call("IsPVR350TVOutputEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the TV output on a Hauppauge WinTV PVR-350 card is enabled (Windows only)

Returns:
true if the TV output on a Hauppauge WinTV PVR-350 card is enabled
 */
public static boolean IsPVR350TVOutputEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPVR350TVOutputEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not the TV output on a Hauppauge WinTV PVR-350 should be enabled (Windows only)

Parameters:
Enabled- true if the TV output of a Hauppauge WinTV PVR-350 should be enabled
 */
public static void SetPVR350TVOutputEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetPVR350TVOutputEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the TV output on a Hauppauge WinTV PVR-350 should be enabled (Windows only)

Parameters:
Enabled- true if the TV output of a Hauppauge WinTV PVR-350 should be enabled
 */
public static void SetPVR350TVOutputEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetPVR350TVOutputEnabled", new Object[] {Enabled});
}

/**
Returns true if the user interface (OSD) display on a Hauppauge WinTV PVR-350 should be shown through the tv output (Windows only)

Returns:
true if the user interface (OSD) display on a Hauppauge WinTV PVR-350 should be shown through the tv output
 */
public static boolean IsPVR350OSDEnabled () {
  Object o = sagex.SageAPI.call("IsPVR350OSDEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the user interface (OSD) display on a Hauppauge WinTV PVR-350 should be shown through the tv output (Windows only)

Returns:
true if the user interface (OSD) display on a Hauppauge WinTV PVR-350 should be shown through the tv output
 */
public static boolean IsPVR350OSDEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPVR350OSDEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not the user interface (OSD) should be displayed on the TV output of a Hauppauge WinTV PVR-350 (Windows only)

Parameters:
Enabled- true if the user interface (OSD) should be displayed on the TV output of a Hauppauge WinTV PVR-350, false otherwise
 */
public static void SetPVR350OSDEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetPVR350OSDEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the user interface (OSD) should be displayed on the TV output of a Hauppauge WinTV PVR-350 (Windows only)

Parameters:
Enabled- true if the user interface (OSD) should be displayed on the TV output of a Hauppauge WinTV PVR-350, false otherwise
 */
public static void SetPVR350OSDEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetPVR350OSDEnabled", new Object[] {Enabled});
}

/**
Returns true if the DScaler deinterlacing filter is enabled (Windows only)

Returns:
true if the DScaler deinterlacing filter is enabled
 */
public static boolean IsDscalerEnabled () {
  Object o = sagex.SageAPI.call("IsDscalerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the DScaler deinterlacing filter is enabled (Windows only)

Returns:
true if the DScaler deinterlacing filter is enabled
 */
public static boolean IsDscalerEnabled (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDscalerEnabled", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not the DScaler deinterlacing filter should be used (Windows only)

Parameters:
Enabled- true if the DScaler deinterlacing filter should be used, false otherwise
 */
public static void SetDscalerEnabled (boolean Enabled) {
   sagex.SageAPI.call("SetDscalerEnabled", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not the DScaler deinterlacing filter should be used (Windows only)

Parameters:
Enabled- true if the DScaler deinterlacing filter should be used, false otherwise
 */
public static void SetDscalerEnabled (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetDscalerEnabled", new Object[] {Enabled});
}

/**
Gets the plugin that DScaler is currently configured to use when it is in "Plugin" mode.

Returns:
the plugin that DScaler is currently configured to use when it is in "Plugin" mode
 */
public static java.lang.String GetDscalerPlugin () {
  Object o = sagex.SageAPI.call("GetDscalerPlugin", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the plugin that DScaler is currently configured to use when it is in "Plugin" mode.

Returns:
the plugin that DScaler is currently configured to use when it is in "Plugin" mode
 */
public static java.lang.String GetDscalerPlugin (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDscalerPlugin", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the plugin that should be used by DScaler. DScaler must also be set into "Plugin" mode.

Parameters:
PluginName- the name of the plugin to use with DScaler
 */
public static void SetDscalerPlugin (java.lang.String PluginName) {
   sagex.SageAPI.call("SetDscalerPlugin", new Object[] {PluginName});
}

/**
 * UI Context Aware Call<br>
Sets the plugin that should be used by DScaler. DScaler must also be set into "Plugin" mode.

Parameters:
PluginName- the name of the plugin to use with DScaler
 */
public static void SetDscalerPlugin (UIContext _uicontext,java.lang.String PluginName) {
   sagex.SageAPI.call(_uicontext, "SetDscalerPlugin", new Object[] {PluginName});
}

/**
Returns the list of plugins that are supported by DScaler. These are used when DScaler is in "Plugin" mode. (Windows only)

Returns:
the list of plugins that are supported by DScaler
 */
public static java.lang.String[] GetDscalerPlugins () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDscalerPlugins", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns the list of plugins that are supported by DScaler. These are used when DScaler is in "Plugin" mode. (Windows only)

Returns:
the list of plugins that are supported by DScaler
 */
public static java.lang.String[] GetDscalerPlugins (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDscalerPlugins", (Object[])null);
}

/**
Returns true if the system has DirectX 9 installed (Windows Only)

Returns:
true if the system has DirectX 9 installed, false otherwise
 */
public static boolean HasDirectX9 () {
  Object o = sagex.SageAPI.call("HasDirectX9", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the system has DirectX 9 installed (Windows Only)

Returns:
true if the system has DirectX 9 installed, false otherwise
 */
public static boolean HasDirectX9 (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasDirectX9", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the system has support for the Enhanced Video Renderer (EVR) (Windows Only)

Returns:
true if the system has support for the Enhanced Video Renderer (EVR), false otherwise
 */
public static boolean HasEVRSupport () {
  Object o = sagex.SageAPI.call("HasEVRSupport", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the system has support for the Enhanced Video Renderer (EVR) (Windows Only)

Returns:
true if the system has support for the Enhanced Video Renderer (EVR), false otherwise
 */
public static boolean HasEVRSupport (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasEVRSupport", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the video renderer is configured to use the Overlay surface (Windows Only) Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use the Overlay surface, false otherwise
 */
public static boolean IsVideoRendererOverlay () {
  Object o = sagex.SageAPI.call("IsVideoRendererOverlay", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the video renderer is configured to use the Overlay surface (Windows Only) Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use the Overlay surface, false otherwise
 */
public static boolean IsVideoRendererOverlay (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsVideoRendererOverlay", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the video renderer is configured to use the Video Mixing Renderer 9 (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of VMR9. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use VMR9, false otherwise
 */
public static boolean IsVideoRendererVMR9 () {
  Object o = sagex.SageAPI.call("IsVideoRendererVMR9", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the video renderer is configured to use the Video Mixing Renderer 9 (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of VMR9. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use VMR9, false otherwise
 */
public static boolean IsVideoRendererVMR9 (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsVideoRendererVMR9", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the video renderer is configured to use the Enhanced Video Renderer (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of EVR. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use EVR, false otherwise
Since:
6.5
 */
public static boolean IsVideoRendererEVR () {
  Object o = sagex.SageAPI.call("IsVideoRendererEVR", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the video renderer is configured to use the Enhanced Video Renderer (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of EVR. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use EVR, false otherwise
Since:
6.5
 */
public static boolean IsVideoRendererEVR (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsVideoRendererEVR", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the video renderer is configured to use the Default renderer (Windows Only). This will usually be the Video Mixing
 Renderer 7 if using Windows XP; but DirectShow ultimately decides this itself. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use the Default renderer
 */
public static boolean IsVideoRendererDefault () {
  Object o = sagex.SageAPI.call("IsVideoRendererDefault", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the video renderer is configured to use the Default renderer (Windows Only). This will usually be the Video Mixing
 Renderer 7 if using Windows XP; but DirectShow ultimately decides this itself. Applies to all files except DVDs.

Returns:
true if the video renderer is configured to use the Default renderer
 */
public static boolean IsVideoRendererDefault (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsVideoRendererDefault", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the video renderer to use the default renderer (Windows Only). This will usually be the Video Mixing
 Renderer 7 if using Windows XP; but DirectShow ultimately decides this itself. Applies to all files except DVDs.
 */
public static void SetVideoRendererToDefault () {
   sagex.SageAPI.call("SetVideoRendererToDefault", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the video renderer to use the default renderer (Windows Only). This will usually be the Video Mixing
 Renderer 7 if using Windows XP; but DirectShow ultimately decides this itself. Applies to all files except DVDs.
 */
public static void SetVideoRendererToDefault (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SetVideoRendererToDefault", (Object[])null);
}

/**
Sets the video renderer to use the video Overlay surface (Windows Only). Applies to all files except DVDs.
 */
public static void SetVideoRendererToOverlay () {
   sagex.SageAPI.call("SetVideoRendererToOverlay", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the video renderer to use the video Overlay surface (Windows Only). Applies to all files except DVDs.
 */
public static void SetVideoRendererToOverlay (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SetVideoRendererToOverlay", (Object[])null);
}

/**
Sets the video renderer to use the Video Mixing Renderer 9 (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of VMR9. Applies to all files except DVDs.
 */
public static void SetVideoRendererToVMR9 () {
   sagex.SageAPI.call("SetVideoRendererToVMR9", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the video renderer to use the Video Mixing Renderer 9 (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of VMR9. Applies to all files except DVDs.
 */
public static void SetVideoRendererToVMR9 (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SetVideoRendererToVMR9", (Object[])null);
}

/**
Sets the video renderer to use the Enhanced Video Renderer (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of EVR. Applies to all files except DVDs.

Since:
6.5
 */
public static void SetVideoRendererToEVR () {
   sagex.SageAPI.call("SetVideoRendererToEVR", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the video renderer to use the Enhanced Video Renderer (Windows Only). This
 will only work if accelerated rendering is enabled (3D acceleration). If it's not then Overlay will be used
 as the video renderer instead of EVR. Applies to all files except DVDs.

Since:
6.5
 */
public static void SetVideoRendererToEVR (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SetVideoRendererToEVR", (Object[])null);
}

/**
Gets the list of DirectShow audio renderer filters that are available on the system (Windows Only).

Returns:
the list of DirectShow audio renderer filters that are available on the system
 */
public static java.util.Vector GetAudioRendererFilters () {
  Object o = sagex.SageAPI.call("GetAudioRendererFilters", (Object[])null);
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the list of DirectShow audio renderer filters that are available on the system (Windows Only).

Returns:
the list of DirectShow audio renderer filters that are available on the system
 */
public static java.util.Vector GetAudioRendererFilters (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAudioRendererFilters", (Object[])null);
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Gets the different input connectors that are available on the system sound mixer (Windows Only)

Returns:
the different input connectors that are available on the system sound mixer
 */
public static java.lang.String[] GetMixerAudioInputPaths () {
  return (java.lang.String[]) sagex.SageAPI.call("GetMixerAudioInputPaths", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the different input connectors that are available on the system sound mixer (Windows Only)

Returns:
the different input connectors that are available on the system sound mixer
 */
public static java.lang.String[] GetMixerAudioInputPaths (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetMixerAudioInputPaths", (Object[])null);
}

/**
Sets whether or not placeshifter connections should be allowed to cache their login information. Disabling
 this setting will clear the current authentication cache on the server.

Parameters:
Enabled- true if the server should allow caching of placeshifter logins; false otherwise (false also clears the cache)
Since:
6.6
 */
public static void SetAllowPlaceshifterLoginCaching (boolean Enabled) {
   sagex.SageAPI.call("SetAllowPlaceshifterLoginCaching", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not placeshifter connections should be allowed to cache their login information. Disabling
 this setting will clear the current authentication cache on the server.

Parameters:
Enabled- true if the server should allow caching of placeshifter logins; false otherwise (false also clears the cache)
Since:
6.6
 */
public static void SetAllowPlaceshifterLoginCaching (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetAllowPlaceshifterLoginCaching", new Object[] {Enabled});
}

/**
Returns true if this server allows caching of placeshifter logins, false otherwise

Returns:
true if this server allows caching of placeshifter logins, false otherwise
Since:
6.6
 */
public static boolean IsPlaceshifterLoginCachingAllowed () {
  Object o = sagex.SageAPI.call("IsPlaceshifterLoginCachingAllowed", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this server allows caching of placeshifter logins, false otherwise

Returns:
true if this server allows caching of placeshifter logins, false otherwise
Since:
6.6
 */
public static boolean IsPlaceshifterLoginCachingAllowed (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPlaceshifterLoginCachingAllowed", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets whether or not when playing back a program that is currently airing whether we should start from live TV or not

Parameters:
Enabled- true if we should start from live for anything currently airing
Since:
8.1
 */
public static void SetCurrentlyAiringProgramsStartLive (boolean Enabled) {
   sagex.SageAPI.call("SetCurrentlyAiringProgramsStartLive", new Object[] {Enabled});
}

/**
 * UI Context Aware Call<br>
Sets whether or not when playing back a program that is currently airing whether we should start from live TV or not

Parameters:
Enabled- true if we should start from live for anything currently airing
Since:
8.1
 */
public static void SetCurrentlyAiringProgramsStartLive (UIContext _uicontext,boolean Enabled) {
   sagex.SageAPI.call(_uicontext, "SetCurrentlyAiringProgramsStartLive", new Object[] {Enabled});
}

/**
Returns true if the system is configured to start any program that is currently airing
 from live, false otherwise

Returns:
true if the system is configured to start any program that is currently airing from live, false otherwise
Since:
8.1
 */
public static boolean GetCurrentlyAiringProgramsStartLive () {
  Object o = sagex.SageAPI.call("GetCurrentlyAiringProgramsStartLive", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the system is configured to start any program that is currently airing
 from live, false otherwise

Returns:
true if the system is configured to start any program that is currently airing from live, false otherwise
Since:
8.1
 */
public static boolean GetCurrentlyAiringProgramsStartLive (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentlyAiringProgramsStartLive", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

}
