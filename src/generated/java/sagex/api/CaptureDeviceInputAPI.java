package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/CaptureDeviceInputAPI.html'>CaptureDeviceInputAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class CaptureDeviceInputAPI {
/**
Gets the name of the tuning plugin used for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the tuning plugin currently used for the specified CaptureDeviceInput
 */
public static java.lang.String GetInfraredTuningPlugin (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetInfraredTuningPlugin", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the name of the tuning plugin used for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the tuning plugin currently used for the specified CaptureDeviceInput
 */
public static java.lang.String GetInfraredTuningPlugin (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInfraredTuningPlugin", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the port number used by the tuning plugin for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the port number of the tuning plugin currently used for the specified CaptureDeviceInput
 */
public static int GetInfraredTuningPluginPortNumber (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetInfraredTuningPluginPortNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the port number used by the tuning plugin for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the port number of the tuning plugin currently used for the specified CaptureDeviceInput
 */
public static int GetInfraredTuningPluginPortNumber (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInfraredTuningPluginPortNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the name and port number for the tuning plugin for a CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
PluginName- the name of the tuning plugin to use on the specified CaptureDeviceInput. This should be a value fromGetInfraredTuningPlugins()
Use the emptry string "" to set the CaptureDeviceInput to not use a plugin
PluginPortNumber- the port number to configure the specified tuning plugin to use on the specified CaptureDeviceInput. Use 0 for the USB port.
Returns:
true if the plugin was setup (if it requires hardware this validates the hardware is connected)
 */
public static boolean SetInfraredTuningPluginAndPort (java.lang.String CaptureDeviceInput, java.lang.String PluginName, int PluginPortNumber) {
  Object o = sagex.SageAPI.call("SetInfraredTuningPluginAndPort", new Object[] {CaptureDeviceInput,PluginName,PluginPortNumber});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Sets the name and port number for the tuning plugin for a CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
PluginName- the name of the tuning plugin to use on the specified CaptureDeviceInput. This should be a value fromGetInfraredTuningPlugins()
Use the emptry string "" to set the CaptureDeviceInput to not use a plugin
PluginPortNumber- the port number to configure the specified tuning plugin to use on the specified CaptureDeviceInput. Use 0 for the USB port.
Returns:
true if the plugin was setup (if it requires hardware this validates the hardware is connected)
 */
public static boolean SetInfraredTuningPluginAndPort (UIContext _uicontext,java.lang.String CaptureDeviceInput, java.lang.String PluginName, int PluginPortNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "SetInfraredTuningPluginAndPort", new Object[] {CaptureDeviceInput,PluginName,PluginPortNumber});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Tunes the CaptureDeviceInput to the specified physical channel and indicates whether or not a signal is present. This call should only
 be used if the CaptureDeviceInput is already under live control (i.e.WatchLive()
orLockTuner()
was called on it) or
 if the input has not been configured for use yet. Otherwise this call may interfere with what is currently being recorded.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ChannelNumber- the channel string to tune to
Returns:
true if the hardware detected a signal on the specified channel
 */
public static boolean AutoTuneChannelTest (java.lang.String CaptureDeviceInput, java.lang.String ChannelNumber) {
  Object o = sagex.SageAPI.call("AutoTuneChannelTest", new Object[] {CaptureDeviceInput,ChannelNumber});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Tunes the CaptureDeviceInput to the specified physical channel and indicates whether or not a signal is present. This call should only
 be used if the CaptureDeviceInput is already under live control (i.e.WatchLive()
orLockTuner()
was called on it) or
 if the input has not been configured for use yet. Otherwise this call may interfere with what is currently being recorded.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ChannelNumber- the channel string to tune to
Returns:
true if the hardware detected a signal on the specified channel
 */
public static boolean AutoTuneChannelTest (UIContext _uicontext,java.lang.String CaptureDeviceInput, java.lang.String ChannelNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "AutoTuneChannelTest", new Object[] {CaptureDeviceInput,ChannelNumber});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Tunes the CaptureDeviceInput to the specified physical channel and returns a list of the available channels. This call should only
 be used if the CaptureDeviceInput is already under live control (i.e.WatchLive()
orLockTuner()
was called on it) or
 if the input has not been configured for use yet. Otherwise this call may interfere with what is currently being recorded.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ChannelNumber- the channel string to tune to
Returns:
a string describing the subchannels found scanning this channel, if no channels were found an empty or null string will be returned
 */
public static java.lang.String AutoScanChannelInfo (java.lang.String CaptureDeviceInput, java.lang.String ChannelNumber) {
  Object o = sagex.SageAPI.call("AutoScanChannelInfo", new Object[] {CaptureDeviceInput,ChannelNumber});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Tunes the CaptureDeviceInput to the specified physical channel and returns a list of the available channels. This call should only
 be used if the CaptureDeviceInput is already under live control (i.e.WatchLive()
orLockTuner()
was called on it) or
 if the input has not been configured for use yet. Otherwise this call may interfere with what is currently being recorded.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ChannelNumber- the channel string to tune to
Returns:
a string describing the subchannels found scanning this channel, if no channels were found an empty or null string will be returned
 */
public static java.lang.String AutoScanChannelInfo (UIContext _uicontext,java.lang.String CaptureDeviceInput, java.lang.String ChannelNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "AutoScanChannelInfo", new Object[] {CaptureDeviceInput,ChannelNumber});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the minimum channel number that this CaptureDeviceInput can tune to

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the minimum channel number for the specified CaptureDeviceInput
 */
public static int GetInputMinimumChannelNumber (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetInputMinimumChannelNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the minimum channel number that this CaptureDeviceInput can tune to

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the minimum channel number for the specified CaptureDeviceInput
 */
public static int GetInputMinimumChannelNumber (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInputMinimumChannelNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the maximum channel number that this CaptureDeviceInput can tune to

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the maximum channel number for the specified CaptureDeviceInput
 */
public static int GetInputMaximumChannelNumber (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetInputMaximumChannelNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the maximum channel number that this CaptureDeviceInput can tune to

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the maximum channel number for the specified CaptureDeviceInput
 */
public static int GetInputMaximumChannelNumber (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInputMaximumChannelNumber", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the brightness for capture on this CaptureDeviceInput. This only affects analog capture devices

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the brightness to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureBrightness (java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call("SetCaptureBrightness", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets the brightness for capture on this CaptureDeviceInput. This only affects analog capture devices

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the brightness to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureBrightness (UIContext _uicontext,java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call(_uicontext, "SetCaptureBrightness", new Object[] {CaptureDeviceInput,Value});
}

/**
Sets the saturation for capture on this CaptureDeviceInput. This only affects analog capture devices

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the saturation to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureSaturation (java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call("SetCaptureSaturation", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets the saturation for capture on this CaptureDeviceInput. This only affects analog capture devices

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the saturation to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureSaturation (UIContext _uicontext,java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call(_uicontext, "SetCaptureSaturation", new Object[] {CaptureDeviceInput,Value});
}

/**
Sets the hue for capture on this CaptureDeviceInput. This only affects analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the hue to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureHue (java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call("SetCaptureHue", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets the hue for capture on this CaptureDeviceInput. This only affects analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the hue to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureHue (UIContext _uicontext,java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call(_uicontext, "SetCaptureHue", new Object[] {CaptureDeviceInput,Value});
}

/**
Sets the contrast for capture on this CaptureDeviceInput. This only affects analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the contrast to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureContrast (java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call("SetCaptureContrast", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets the contrast for capture on this CaptureDeviceInput. This only affects analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the contrast to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureContrast (UIContext _uicontext,java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call(_uicontext, "SetCaptureContrast", new Object[] {CaptureDeviceInput,Value});
}

/**
Sets the sharpness for capture on this CaptureDeviceInput. This only affects analog capture devices.
 NOTE: On Linux this currently sets the audio capture volume level

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the sharpness to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureSharpness (java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call("SetCaptureSharpness", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets the sharpness for capture on this CaptureDeviceInput. This only affects analog capture devices.
 NOTE: On Linux this currently sets the audio capture volume level

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- the new value to set the sharpness to, in the inclusive range 0-255. Use -1 to set it to the default.
 */
public static void SetCaptureSharpness (UIContext _uicontext,java.lang.String CaptureDeviceInput, int Value) {
   sagex.SageAPI.call(_uicontext, "SetCaptureSharpness", new Object[] {CaptureDeviceInput,Value});
}

/**
Gets the brightness level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the brightness level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureBrightness (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureBrightness", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the brightness level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the brightness level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureBrightness (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureBrightness", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the saturation level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the saturation level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureSaturation (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureSaturation", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the saturation level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the saturation level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureSaturation (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureSaturation", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the hue level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the hue level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureHue (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureHue", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the hue level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the hue level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureHue (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureHue", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the contrast level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the contrast level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureContrast (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureContrast", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the contrast level for this CaptureDeviceInput. This is only valid for analog capture devices.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the contrast level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureContrast (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureContrast", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the sharpness level for this CaptureDeviceInput. This is only valid for analog capture devices.
 NOTE: On Linux this gets the audio volume level

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the sharpness level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureSharpness (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureSharpness", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the sharpness level for this CaptureDeviceInput. This is only valid for analog capture devices.
 NOTE: On Linux this gets the audio volume level

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the sharpness level for the specified CaptureDeviceInput in the inclusive range 0-255
 */
public static int GetCaptureSharpness (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureSharpness", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the name of the device that is passed to the IR Tuner plugin for tuning control. Corresponds to a .ir file for current IR transmitters

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ExternalDeviceName- the name of the external device the IR tuning plugin is supposed to control This value should be obtained from a call to (@link Configuration#GetRemotesForInfraredTuningPlugin GetRemotesForInfraredTuningPlugin()}
 */
public static void SetInfraredTunerRemoteName (java.lang.String CaptureDeviceInput, java.lang.String ExternalDeviceName) {
   sagex.SageAPI.call("SetInfraredTunerRemoteName", new Object[] {CaptureDeviceInput,ExternalDeviceName});
}

/**
 * UI Context Aware Call<br>
Sets the name of the device that is passed to the IR Tuner plugin for tuning control. Corresponds to a .ir file for current IR transmitters

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
ExternalDeviceName- the name of the external device the IR tuning plugin is supposed to control This value should be obtained from a call to (@link Configuration#GetRemotesForInfraredTuningPlugin GetRemotesForInfraredTuningPlugin()}
 */
public static void SetInfraredTunerRemoteName (UIContext _uicontext,java.lang.String CaptureDeviceInput, java.lang.String ExternalDeviceName) {
   sagex.SageAPI.call(_uicontext, "SetInfraredTunerRemoteName", new Object[] {CaptureDeviceInput,ExternalDeviceName});
}

/**
Returns the name of the device that is passed to the IR Tuner plugin for tuning control. Corresponds to a .ir file for current IR transmitters.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the external device codes used for the tuner plugin on the specified CaptureDeviceInput
 */
public static java.lang.String GetInfraredTunerRemoteName (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetInfraredTunerRemoteName", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the device that is passed to the IR Tuner plugin for tuning control. Corresponds to a .ir file for current IR transmitters.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the external device codes used for the tuner plugin on the specified CaptureDeviceInput
 */
public static java.lang.String GetInfraredTunerRemoteName (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetInfraredTunerRemoteName", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets whether or not this CaptureDeviceInput tunes for Antenna or Cable if it's a TV Tuner input

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- true if this input is connected to a Cable source, false if it uses Broadcast/Over-the-Air (OTA)
 */
public static void SetRFSignalIsCableTV (java.lang.String CaptureDeviceInput, boolean Value) {
   sagex.SageAPI.call("SetRFSignalIsCableTV", new Object[] {CaptureDeviceInput,Value});
}

/**
 * UI Context Aware Call<br>
Sets whether or not this CaptureDeviceInput tunes for Antenna or Cable if it's a TV Tuner input

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Value- true if this input is connected to a Cable source, false if it uses Broadcast/Over-the-Air (OTA)
 */
public static void SetRFSignalIsCableTV (UIContext _uicontext,java.lang.String CaptureDeviceInput, boolean Value) {
   sagex.SageAPI.call(_uicontext, "SetRFSignalIsCableTV", new Object[] {CaptureDeviceInput,Value});
}

/**
Returns whether or not this CaptureDeviceInput tunes for Antenna or Cable if it's a TV Tuner input

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input is connected to a Cable source, false if it uses Broadcast/Over-the-Air (OTA)
 */
public static boolean IsRFSignalCableTV (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("IsRFSignalCableTV", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns whether or not this CaptureDeviceInput tunes for Antenna or Cable if it's a TV Tuner input

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input is connected to a Cable source, false if it uses Broadcast/Over-the-Air (OTA)
 */
public static boolean IsRFSignalCableTV (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "IsRFSignalCableTV", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this input was created usingAddInputForRFChannel()
method call

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input was created usingAddInputForRFChannel()
method call
 */
public static boolean IsExternallyTunedRFInput (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("IsExternallyTunedRFInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if this input was created usingAddInputForRFChannel()
method call

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input was created usingAddInputForRFChannel()
method call
 */
public static boolean IsExternallyTunedRFInput (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "IsExternallyTunedRFInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the RF channel number that is used to receive the source signal. This is set usingAddInputForRFChannel()


Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the RF channel number used to receive the source signal on the specified CaptureDeviceInput
 */
public static int GetConstantRFChannelInput (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetConstantRFChannelInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the RF channel number that is used to receive the source signal. This is set usingAddInputForRFChannel()


Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the RF channel number used to receive the source signal on the specified CaptureDeviceInput
 */
public static int GetConstantRFChannelInput (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetConstantRFChannelInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns whether or not this CaptureDeviceInput captures both audio and video

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input captures both audio and video, false if it just captures video
 */
public static boolean IsCaptureDeviceInputAudioVideo (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("IsCaptureDeviceInputAudioVideo", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns whether or not this CaptureDeviceInput captures both audio and video

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
true if this input captures both audio and video, false if it just captures video
 */
public static boolean IsCaptureDeviceInputAudioVideo (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCaptureDeviceInputAudioVideo", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the type of input this is, such as: S-Video, Composite, TV Tuner, etc.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the type of physical connector used for the specified CaptureDeviceInput
 */
public static java.lang.String GetPhysicalInputType (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetPhysicalInputType", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the type of input this is, such as: S-Video, Composite, TV Tuner, etc.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the type of physical connector used for the specified CaptureDeviceInput
 */
public static java.lang.String GetPhysicalInputType (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPhysicalInputType", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of this CaptureDeviceInput connection without the CaptureDevice name prefixing it. This is not the
 same as the 'name' of the CaptureDeviceInput used as the parameter. The String that uniquely identifies a CaptureDeviceInput
 must always have the CaptureDevice's name included in it. Only use this return value for display purposes; do not use
 it for anything else.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the specified CaptureDeviceInput connection without the CaptureDevice name prefixing it
 */
public static java.lang.String GetCaptureDeviceInputName (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceInputName", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of this CaptureDeviceInput connection without the CaptureDevice name prefixing it. This is not the
 same as the 'name' of the CaptureDeviceInput used as the parameter. The String that uniquely identifies a CaptureDeviceInput
 must always have the CaptureDevice's name included in it. Only use this return value for display purposes; do not use
 it for anything else.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the specified CaptureDeviceInput connection without the CaptureDevice name prefixing it
 */
public static java.lang.String GetCaptureDeviceInputName (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceInputName", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Configures this CaptureDeviceInput to use the specified EPG Lineup.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to set the lineup on
Lineup- the name of the Lineup to configure this CaptureDeviceInput for. This name should be obtained from a call to the EPG server
Returns:
true if the Lineup was successfully configured for the specified CaptureDeviceInput
 */
public static boolean ConfigureInputForEPGDataLineup (java.lang.String CaptureDeviceInput, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call("ConfigureInputForEPGDataLineup", new Object[] {CaptureDeviceInput,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Configures this CaptureDeviceInput to use the specified EPG Lineup.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to set the lineup on
Lineup- the name of the Lineup to configure this CaptureDeviceInput for. This name should be obtained from a call to the EPG server
Returns:
true if the Lineup was successfully configured for the specified CaptureDeviceInput
 */
public static boolean ConfigureInputForEPGDataLineup (UIContext _uicontext,java.lang.String CaptureDeviceInput, java.lang.String Lineup) {
  Object o = sagex.SageAPI.call(_uicontext, "ConfigureInputForEPGDataLineup", new Object[] {CaptureDeviceInput,Lineup});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Configures this CaptureDeviceInput to not use an EPG data source. It will instead create a generic lineup with numeric channels that

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
true (the call will always succeed)
 */
public static boolean ConfigureInputWithoutEPGData (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("ConfigureInputWithoutEPGData", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Configures this CaptureDeviceInput to not use an EPG data source. It will instead create a generic lineup with numeric channels that

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
true (the call will always succeed)
 */
public static boolean ConfigureInputWithoutEPGData (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "ConfigureInputWithoutEPGData", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Releases this CaptureDeviceInput from its currently configured lineup. It will no longer be considered "configured" or "active".
 If its lineup is no longer is in use, it will be cleaned up on the next EPG maintenance cycle.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
 */
public static void ReleaseCaptureDeviceInput (java.lang.String CaptureDeviceInput) {
   sagex.SageAPI.call("ReleaseCaptureDeviceInput", new Object[] {CaptureDeviceInput});
}

/**
 * UI Context Aware Call<br>
Releases this CaptureDeviceInput from its currently configured lineup. It will no longer be considered "configured" or "active".
 If its lineup is no longer is in use, it will be cleaned up on the next EPG maintenance cycle.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
 */
public static void ReleaseCaptureDeviceInput (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
   sagex.SageAPI.call(_uicontext, "ReleaseCaptureDeviceInput", new Object[] {CaptureDeviceInput});
}

/**
Returns the CaptureDeviceInput that is recording the MediaFile that is currently loaded by the MediaPlayer

Returns:
the CaptureDeviceInput that is recording the MediaFile that is currently loaded by the MediaPlayer
 */
public static java.lang.String GetCaptureDeviceInputBeingViewed () {
  Object o = sagex.SageAPI.call("GetCaptureDeviceInputBeingViewed", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the CaptureDeviceInput that is recording the MediaFile that is currently loaded by the MediaPlayer

Returns:
the CaptureDeviceInput that is recording the MediaFile that is currently loaded by the MediaPlayer
 */
public static java.lang.String GetCaptureDeviceInputBeingViewed (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceInputBeingViewed", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the CaptureDeviceInput that is recording the specified MediaFile

Parameters:
MediaFile- the MediaFile who's recording CaptureDeviceInput should be returned
Returns:
the CaptureDeviceInput that is recording the specified MediaFile; null if that file is not being recorded currently
 */
public static java.lang.String GetCaptureDeviceInputRecordingMediaFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceInputRecordingMediaFile", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the CaptureDeviceInput that is recording the specified MediaFile

Parameters:
MediaFile- the MediaFile who's recording CaptureDeviceInput should be returned
Returns:
the CaptureDeviceInput that is recording the specified MediaFile; null if that file is not being recorded currently
 */
public static java.lang.String GetCaptureDeviceInputRecordingMediaFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceInputRecordingMediaFile", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of the lineup that this CaptureDeviceInput is configured to use

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the name of the lineups that is configured for use on the specified CaptureDeviceInput; returns null if the input is not configured
 */
public static java.lang.String GetLineupForCaptureDeviceInput (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetLineupForCaptureDeviceInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the lineup that this CaptureDeviceInput is configured to use

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the name of the lineups that is configured for use on the specified CaptureDeviceInput; returns null if the input is not configured
 */
public static java.lang.String GetLineupForCaptureDeviceInput (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLineupForCaptureDeviceInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the CaptureDevice for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the name of the CaptureDevice for the specified CaptureDeviceInput
 */
public static java.lang.String GetCaptureDeviceForInput (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceForInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the CaptureDevice for this CaptureDeviceInput

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the name of the CaptureDevice for the specified CaptureDeviceInput
 */
public static java.lang.String GetCaptureDeviceForInput (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceForInput", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the current signal strength for this CaptureDeviceInput. This is only valid for Digital TV inputs.
 The returned value will be between 0 and 100 inclusive. 0 is no signal and 100 is maximum signal strength.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the current signal strength on the specified CaptureDeviceInput
 */
public static int GetSignalStrength (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetSignalStrength", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the current signal strength for this CaptureDeviceInput. This is only valid for Digital TV inputs.
 The returned value will be between 0 and 100 inclusive. 0 is no signal and 100 is maximum signal strength.

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput to use
Returns:
the current signal strength on the specified CaptureDeviceInput
 */
public static int GetSignalStrength (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSignalStrength", new Object[] {CaptureDeviceInput});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the name of the broadcast standard used for reception on this capture device input (can be different per-input)

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the broadcast standard used for reception on this capture device input (i.e. NTSC, ATSC, DVB-S, etc.)
Since:
7.0
 */
public static java.lang.String GetCaptureDeviceInputBroadcastStandard (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceInputBroadcastStandard", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the broadcast standard used for reception on this capture device input (can be different per-input)

Parameters:
CaptureDeviceInput- the name of the CaptureDeviceInput
Returns:
the name of the broadcast standard used for reception on this capture device input (i.e. NTSC, ATSC, DVB-S, etc.)
Since:
7.0
 */
public static java.lang.String GetCaptureDeviceInputBroadcastStandard (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceInputBroadcastStandard", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.String) o;
  return null;
}

}
