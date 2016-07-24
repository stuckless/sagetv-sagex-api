package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 5:40 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/CaptureDeviceAPI.html'>CaptureDeviceAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class CaptureDeviceAPI {
/**
Returns all of the CaptureDevices in the system that SageTV can use

Returns:
the names of all of the CaptureDevices in the system that SageTV can use
 */
public static java.lang.String[] GetCaptureDevices () {
  return (java.lang.String[]) sagex.SageAPI.call("GetCaptureDevices", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns all of the CaptureDevices in the system that SageTV can use

Returns:
the names of all of the CaptureDevices in the system that SageTV can use
 */
public static java.lang.String[] GetCaptureDevices (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetCaptureDevices", (Object[])null);
}

/**
Returns all of the CaptureDeviceInputs for a given CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
all of the CaptureDeviceInputs for the specified CaptureDevice.
 */
public static java.lang.String[] GetCaptureDeviceInputs (java.lang.String CaptureDevice) {
  return (java.lang.String[]) sagex.SageAPI.call("GetCaptureDeviceInputs", new Object[] {CaptureDevice});
}

/**
 * UI Context Aware Call<br/>
Returns all of the CaptureDeviceInputs for a given CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
all of the CaptureDeviceInputs for the specified CaptureDevice.
 */
public static java.lang.String[] GetCaptureDeviceInputs (UIContext _uicontext,java.lang.String CaptureDevice) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetCaptureDeviceInputs", new Object[] {CaptureDevice});
}

/**
Returns all of the CaptureDeviceInputs that are currently configured for use by SageTV.

Returns:
the names of all of the CaptureDeviceInputs that are currently configured for use by SageTV.
 */
public static java.lang.String[] GetConfiguredCaptureDeviceInputs () {
  return (java.lang.String[]) sagex.SageAPI.call("GetConfiguredCaptureDeviceInputs", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns all of the CaptureDeviceInputs that are currently configured for use by SageTV.

Returns:
the names of all of the CaptureDeviceInputs that are currently configured for use by SageTV.
 */
public static java.lang.String[] GetConfiguredCaptureDeviceInputs (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetConfiguredCaptureDeviceInputs", (Object[])null);
}

/**
Returns whether or not a CaptureDevice is functioning (i.e. the device is offline)

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
false if a CaptureDevice is NOT functioning (i.e. the device is offline), otherwise true
 */
public static boolean IsCaptureDeviceFunctioning (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("IsCaptureDeviceFunctioning", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns whether or not a CaptureDevice is functioning (i.e. the device is offline)

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
false if a CaptureDevice is NOT functioning (i.e. the device is offline), otherwise true
 */
public static boolean IsCaptureDeviceFunctioning (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCaptureDeviceFunctioning", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if a CaptureDevice is a Network Encoder

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is a Network Encoder
 */
public static boolean IsCaptureDeviceANetworkEncoder (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("IsCaptureDeviceANetworkEncoder", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if a CaptureDevice is a Network Encoder

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is a Network Encoder
 */
public static boolean IsCaptureDeviceANetworkEncoder (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCaptureDeviceANetworkEncoder", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns all of the CaptureDevices that are currently configured for use by SageTV

Returns:
all of the CaptureDevices that are currently configured for use by SageTV
 */
public static java.lang.String[] GetActiveCaptureDevices () {
  return (java.lang.String[]) sagex.SageAPI.call("GetActiveCaptureDevices", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns all of the CaptureDevices that are currently configured for use by SageTV

Returns:
all of the CaptureDevices that are currently configured for use by SageTV
 */
public static java.lang.String[] GetActiveCaptureDevices (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetActiveCaptureDevices", (Object[])null);
}

/**
Returns true if the CaptureDevice is currently under control of a client who is (or was) watching live TV

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is currently under control of a client who is watching live/delayed TV
 */
public static boolean IsCaptureDeviceInUseByALiveClient (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("IsCaptureDeviceInUseByALiveClient", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the CaptureDevice is currently under control of a client who is (or was) watching live TV

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is currently under control of a client who is watching live/delayed TV
 */
public static boolean IsCaptureDeviceInUseByALiveClient (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCaptureDeviceInUseByALiveClient", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns a CaptureDeviceInput that corresponds to using the tuner input on the CaptureDevice locked to a certain channel.
 For example, using the RF connection from your cable box to the capture card on channel 3 would required adding a new input this way.

Parameters:
CaptureDevice- the name of the CaptureDevice to add the new input to
RFChannel- the channel to tune to for this RF input
Returns:
the name of the CaptureDeviceInput that was created which will act as an RF channel input
 */
public static java.lang.String AddInputForRFChannel (java.lang.String CaptureDevice, int RFChannel) {
  Object o = sagex.SageAPI.call("AddInputForRFChannel", new Object[] {CaptureDevice,RFChannel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a CaptureDeviceInput that corresponds to using the tuner input on the CaptureDevice locked to a certain channel.
 For example, using the RF connection from your cable box to the capture card on channel 3 would required adding a new input this way.

Parameters:
CaptureDevice- the name of the CaptureDevice to add the new input to
RFChannel- the channel to tune to for this RF input
Returns:
the name of the CaptureDeviceInput that was created which will act as an RF channel input
 */
public static java.lang.String AddInputForRFChannel (UIContext _uicontext,java.lang.String CaptureDevice, int RFChannel) {
  Object o = sagex.SageAPI.call(_uicontext, "AddInputForRFChannel", new Object[] {CaptureDevice,RFChannel});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the last CaptureDevice that was accessed by SageTV.

Returns:
the name of the last CaptureDevice that was accessed by SageTV.
 */
public static java.lang.String GetLastUsedCaptureDevice () {
  Object o = sagex.SageAPI.call("GetLastUsedCaptureDevice", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the last CaptureDevice that was accessed by SageTV.

Returns:
the name of the last CaptureDevice that was accessed by SageTV.
 */
public static java.lang.String GetLastUsedCaptureDevice (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLastUsedCaptureDevice", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the last CaptureDeviceInput that was used by SageTV on the given CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the last CaptureDeviceInput that was used by SageTV on the given CaptureDevice
 */
public static java.lang.String GetLastUsedCaptureDeviceInput (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetLastUsedCaptureDeviceInput", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the last CaptureDeviceInput that was used by SageTV on the given CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the last CaptureDeviceInput that was used by SageTV on the given CaptureDevice
 */
public static java.lang.String GetLastUsedCaptureDeviceInput (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetLastUsedCaptureDeviceInput", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the file that is currently being recorded by this capture device

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the file that is currently being recorded by the specified capture device
 */
public static Object GetCaptureDeviceCurrentRecordFile (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceCurrentRecordFile", new Object[] {CaptureDevice});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the file that is currently being recorded by this capture device

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the file that is currently being recorded by the specified capture device
 */
public static Object GetCaptureDeviceCurrentRecordFile (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceCurrentRecordFile", new Object[] {CaptureDevice});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the recording qualities which are supported by this CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the recording qualities which are supported by the specified CaptureDevice
 */
public static java.lang.String[] GetCaptureDeviceQualities (java.lang.String CaptureDevice) {
  return (java.lang.String[]) sagex.SageAPI.call("GetCaptureDeviceQualities", new Object[] {CaptureDevice});
}

/**
 * UI Context Aware Call<br/>
Returns the recording qualities which are supported by this CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the recording qualities which are supported by the specified CaptureDevice
 */
public static java.lang.String[] GetCaptureDeviceQualities (UIContext _uicontext,java.lang.String CaptureDevice) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetCaptureDeviceQualities", new Object[] {CaptureDevice});
}

/**
Returns the default recording qualities for this CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the default recording quality for the specified CaptureDevice; if there is no default quality set it will return the empty string
 */
public static java.lang.String GetCaptureDeviceDefaultQuality (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceDefaultQuality", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the default recording qualities for this CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the default recording quality for the specified CaptureDevice; if there is no default quality set it will return the empty string
 */
public static java.lang.String GetCaptureDeviceDefaultQuality (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceDefaultQuality", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the default recording quality for a CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Quality- the default quality setting to use for the specified capture device, use null or the empty string to clear the setting
 */
public static void SetCaptureDeviceDefaultQuality (java.lang.String CaptureDevice, java.lang.String Quality) {
   sagex.SageAPI.call("SetCaptureDeviceDefaultQuality", new Object[] {CaptureDevice,Quality});
}

/**
 * UI Context Aware Call<br/>
Sets the default recording quality for a CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
Quality- the default quality setting to use for the specified capture device, use null or the empty string to clear the setting
 */
public static void SetCaptureDeviceDefaultQuality (UIContext _uicontext,java.lang.String CaptureDevice, java.lang.String Quality) {
   sagex.SageAPI.call(_uicontext, "SetCaptureDeviceDefaultQuality", new Object[] {CaptureDevice,Quality});
}

/**
Sets the audio capture source for a corresponding CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
AudioSource- the name of the audio capture source, should be one of the values fromGetAudioCaptureSources()
 */
public static void SetCaptureDeviceAudioSource (java.lang.String CaptureDevice, java.lang.String AudioSource) {
   sagex.SageAPI.call("SetCaptureDeviceAudioSource", new Object[] {CaptureDevice,AudioSource});
}

/**
 * UI Context Aware Call<br/>
Sets the audio capture source for a corresponding CaptureDevice

Parameters:
CaptureDevice- the name of the CaptureDevice
AudioSource- the name of the audio capture source, should be one of the values fromGetAudioCaptureSources()
 */
public static void SetCaptureDeviceAudioSource (UIContext _uicontext,java.lang.String CaptureDevice, java.lang.String AudioSource) {
   sagex.SageAPI.call(_uicontext, "SetCaptureDeviceAudioSource", new Object[] {CaptureDevice,AudioSource});
}

/**
Gets the audio capture source for a corresponding CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the audio capture source for the specified CaptureDevice; the empty string is returned if there is no separate audio capture source (i.e. multiplexed capture or video only capture)
 */
public static java.lang.String GetCaptureDeviceAudioSource (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceAudioSource", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the audio capture source for a corresponding CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the audio capture source for the specified CaptureDevice; the empty string is returned if there is no separate audio capture source (i.e. multiplexed capture or video only capture)
 */
public static java.lang.String GetCaptureDeviceAudioSource (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceAudioSource", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns an array of all the audio capture sources in the system, used withSetCaptureDeviceAudioSource(CaptureDevice, AudioSource)


Returns:
an array of all the audio capture sources in the system
 */
public static java.lang.String[] GetAudioCaptureSources () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAudioCaptureSources", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns an array of all the audio capture sources in the system, used withSetCaptureDeviceAudioSource(CaptureDevice, AudioSource)


Returns:
an array of all the audio capture sources in the system
 */
public static java.lang.String[] GetAudioCaptureSources (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAudioCaptureSources", (Object[])null);
}

/**
Returns true if the CaptureDevice is a hardware encoder

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is a hardware encoder
 */
public static boolean IsCaptureDeviceHardwareEncoder (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("IsCaptureDeviceHardwareEncoder", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the CaptureDevice is a hardware encoder

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
true if the specified CaptureDevice is a hardware encoder
 */
public static boolean IsCaptureDeviceHardwareEncoder (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCaptureDeviceHardwareEncoder", new Object[] {CaptureDevice});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the name of the broadcast standard used for reception on this capture device.
 NOTE: The method 'GetCaptureDeviceInputBroadcastStandard' should be used instead since the broadcast standard can change per-input

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the broadcast standard used for reception on this capture device (i.e. NTSC, ATSC, DVB-S, etc.)
Since:
5.1
 */
public static java.lang.String GetCaptureDeviceBroadcastStandard (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceBroadcastStandard", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the name of the broadcast standard used for reception on this capture device.
 NOTE: The method 'GetCaptureDeviceInputBroadcastStandard' should be used instead since the broadcast standard can change per-input

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
the name of the broadcast standard used for reception on this capture device (i.e. NTSC, ATSC, DVB-S, etc.)
Since:
5.1
 */
public static java.lang.String GetCaptureDeviceBroadcastStandard (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceBroadcastStandard", new Object[] {CaptureDevice});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the TV standard to use for a capture device for devices that support multiple digital TV standards. The only current
 example of this is the Hauppauge HVR-4000 which support DVB-T, DVB-S and DVB-C.

Parameters:
CaptureDevice- the name of the CaptureDevice
DTVStandard- the DTV standard to use for this capture device, should be one of "DVB-T", "DVB-S" or "DVB-C"
Since:
7.0
 */
public static void SetCaptureDeviceDTVStandard (java.lang.String CaptureDevice, java.lang.String DTVStandard) {
   sagex.SageAPI.call("SetCaptureDeviceDTVStandard", new Object[] {CaptureDevice,DTVStandard});
}

/**
 * UI Context Aware Call<br/>
Sets the TV standard to use for a capture device for devices that support multiple digital TV standards. The only current
 example of this is the Hauppauge HVR-4000 which support DVB-T, DVB-S and DVB-C.

Parameters:
CaptureDevice- the name of the CaptureDevice
DTVStandard- the DTV standard to use for this capture device, should be one of "DVB-T", "DVB-S" or "DVB-C"
Since:
7.0
 */
public static void SetCaptureDeviceDTVStandard (UIContext _uicontext,java.lang.String CaptureDevice, java.lang.String DTVStandard) {
   sagex.SageAPI.call(_uicontext, "SetCaptureDeviceDTVStandard", new Object[] {CaptureDevice,DTVStandard});
}

/**
Gets the encoder merit for a CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
The merit value for the specified CaptureDevice; If all else is equal, a capture device with a higher merit has higher priority.
 */
public static int GetCaptureDeviceMerit (java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call("GetCaptureDeviceMerit", new Object[] {CaptureDevice});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Gets the encoder merit for a CaptureDevice.

Parameters:
CaptureDevice- the name of the CaptureDevice
Returns:
The merit value for the specified CaptureDevice; If all else is equal, a capture device with a higher merit has higher priority.
 */
public static int GetCaptureDeviceMerit (UIContext _uicontext,java.lang.String CaptureDevice) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCaptureDeviceMerit", new Object[] {CaptureDevice});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Sets the encoder merit for a CaptureDevice.

Parameters:
Merit- The new merit value for the specified CaptureDevice
 */
public static void SetCaptureDeviceMerit (java.lang.String CaptureDevice, int Merit) {
   sagex.SageAPI.call("SetCaptureDeviceMerit", new Object[] {CaptureDevice,Merit});
}

/**
 * UI Context Aware Call<br/>
Sets the encoder merit for a CaptureDevice.

Parameters:
Merit- The new merit value for the specified CaptureDevice
 */
public static void SetCaptureDeviceMerit (UIContext _uicontext,java.lang.String CaptureDevice, int Merit) {
   sagex.SageAPI.call(_uicontext, "SetCaptureDeviceMerit", new Object[] {CaptureDevice,Merit});
}

}
