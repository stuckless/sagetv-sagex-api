package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 12/6/21 7:46 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaPlayerAPI.html'>MediaPlayerAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class MediaPlayerAPI {
/**
Returns true if the MediaPlayer is fully loaded. This means it has the meta information for the
 file loaded as well as the native media player.

Returns:
true if the MediaPlayer is fully loaded, false otherwise
 */
public static boolean IsMediaPlayerFullyLoaded () {
  Object o = sagex.SageAPI.call("IsMediaPlayerFullyLoaded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer is fully loaded. This means it has the meta information for the
 file loaded as well as the native media player.

Returns:
true if the MediaPlayer is fully loaded, false otherwise
 */
public static boolean IsMediaPlayerFullyLoaded (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMediaPlayerFullyLoaded", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer is loading. This is true from the point that a Watch() API call
 is made until the point that the native media player is loaded or there is a failure loading the file.

Returns:
true if the MediaPlayer is loading, false otherwise
 */
public static boolean IsMediaPlayerLoading () {
  Object o = sagex.SageAPI.call("IsMediaPlayerLoading", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer is loading. This is true from the point that a Watch() API call
 is made until the point that the native media player is loaded or there is a failure loading the file.

Returns:
true if the MediaPlayer is loading, false otherwise
 */
public static boolean IsMediaPlayerLoading (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMediaPlayerLoading", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the playback rate of the MediaPlayer to be twice the current playback rate. Not supported
 on all platforms or with all media formats.
 */
public static void PlayFaster () {
   sagex.SageAPI.call("PlayFaster", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the playback rate of the MediaPlayer to be twice the current playback rate. Not supported
 on all platforms or with all media formats.
 */
public static void PlayFaster (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "PlayFaster", (Object[])null);
}

/**
Performs a time seek forward in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/ff_time in milliseconds. (the default is 10 seconds)
 */
public static void SkipForward () {
   sagex.SageAPI.call("SkipForward", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a time seek forward in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/ff_time in milliseconds. (the default is 10 seconds)
 */
public static void SkipForward (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SkipForward", (Object[])null);
}

/**
Performs a time seek forward in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/ff_time2 in milliseconds. (the default is 2 1/2 minutes)
 */
public static void SkipForward2 () {
   sagex.SageAPI.call("SkipForward2", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a time seek forward in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/ff_time2 in milliseconds. (the default is 2 1/2 minutes)
 */
public static void SkipForward2 (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SkipForward2", (Object[])null);
}

/**
Performs a time seek in the MediaPlayer to the specified time. This time is relative to the
 start time of the metadata for the MediaFile unless a DVD is being played back. In the case of a DVD
 the time is absolute.

Parameters:
Time- the time to seek the MediaPlayer to in milliseconds
 */
public static void Seek (long Time) {
   sagex.SageAPI.call("Seek", new Object[] {Time});
}

/**
 * UI Context Aware Call<br>
Performs a time seek in the MediaPlayer to the specified time. This time is relative to the
 start time of the metadata for the MediaFile unless a DVD is being played back. In the case of a DVD
 the time is absolute.

Parameters:
Time- the time to seek the MediaPlayer to in milliseconds
 */
public static void Seek (UIContext _uicontext,long Time) {
   sagex.SageAPI.call(_uicontext, "Seek", new Object[] {Time});
}

/**
Pauses playback in the MediaPlayer. If the MediaPlayer is currently paused this will perform a frame step.
 */
public static void Pause () {
   sagex.SageAPI.call("Pause", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Pauses playback in the MediaPlayer. If the MediaPlayer is currently paused this will perform a frame step.
 */
public static void Pause (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "Pause", (Object[])null);
}

/**
Resumes playback in the MediaPlayer. If the MediaPlayer is playing at a speed other than x1, the playback speed will be
 reset to x1.
 */
public static void Play () {
   sagex.SageAPI.call("Play", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Resumes playback in the MediaPlayer. If the MediaPlayer is playing at a speed other than x1, the playback speed will be
 reset to x1.
 */
public static void Play (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "Play", (Object[])null);
}

/**
Sets the playback rate of the MediaPlayer to be half the current playback rate. Not supported
 on all platforms or with all media formats.
 */
public static void PlaySlower () {
   sagex.SageAPI.call("PlaySlower", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Sets the playback rate of the MediaPlayer to be half the current playback rate. Not supported
 on all platforms or with all media formats.
 */
public static void PlaySlower (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "PlaySlower", (Object[])null);
}

/**
Pauses playback of the MediaPlayer if it is currently playing or resumes playback of the MediaPlayer
 if it is currently paused.
 */
public static void PlayPause () {
   sagex.SageAPI.call("PlayPause", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Pauses playback of the MediaPlayer if it is currently playing or resumes playback of the MediaPlayer
 if it is currently paused.
 */
public static void PlayPause (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "PlayPause", (Object[])null);
}

/**
Performs a time seek backwards in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/rew_time in milliseconds. (the default is 10 seconds)
 */
public static void SkipBackwards () {
   sagex.SageAPI.call("SkipBackwards", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a time seek backwards in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/rew_time in milliseconds. (the default is 10 seconds)
 */
public static void SkipBackwards (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SkipBackwards", (Object[])null);
}

/**
Performs a time seek backwards in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/rew_time2 in milliseconds. (the default is 2 1/2 minutes)
 */
public static void SkipBackwards2 () {
   sagex.SageAPI.call("SkipBackwards2", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a time seek backwards in the MediaPlayer. The amount of time skipped will be equivalent
 to the value of the property videoframe/rew_time2 in milliseconds. (the default is 2 1/2 minutes)
 */
public static void SkipBackwards2 (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "SkipBackwards2", (Object[])null);
}

/**
Returns the current playback rate as a floating point number. 1.0 is normal speed forward playback.
 Negative numbers indicate reverse playback.

Returns:
the current playback rate of the MediaPlayer
 */
public static float GetPlaybackRate () {
  Object o = sagex.SageAPI.call("GetPlaybackRate", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the current playback rate as a floating point number. 1.0 is normal speed forward playback.
 Negative numbers indicate reverse playback.

Returns:
the current playback rate of the MediaPlayer
 */
public static float GetPlaybackRate (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetPlaybackRate", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Sets the playback rate of the MediaPlayer to the specified value. 1.0 is normal speed forward playback.
 Negative numbers indicate reverse playback. Not all values are supported on all platforms or for all formats.

Parameters:
PlaybackRate- the playback rate to set the MediaPlayer to
 */
public static void SetPlaybackRate (float PlaybackRate) {
   sagex.SageAPI.call("SetPlaybackRate", new Object[] {PlaybackRate});
}

/**
 * UI Context Aware Call<br>
Sets the playback rate of the MediaPlayer to the specified value. 1.0 is normal speed forward playback.
 Negative numbers indicate reverse playback. Not all values are supported on all platforms or for all formats.

Parameters:
PlaybackRate- the playback rate to set the MediaPlayer to
 */
public static void SetPlaybackRate (UIContext _uicontext,float PlaybackRate) {
   sagex.SageAPI.call(_uicontext, "SetPlaybackRate", new Object[] {PlaybackRate});
}

/**
Increases the volume in the MediaPlayer. This may also effect the 'system' volume depending upon the
 configuration of SageTV.
 */
public static void VolumeUp () {
   sagex.SageAPI.call("VolumeUp", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Increases the volume in the MediaPlayer. This may also effect the 'system' volume depending upon the
 configuration of SageTV.
 */
public static void VolumeUp (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "VolumeUp", (Object[])null);
}

/**
Decreases the volume in the MediaPlayer. This may also effect the 'system' volume depending upon the
 configuration of SageTV.
 */
public static void VolumeDown () {
   sagex.SageAPI.call("VolumeDown", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Decreases the volume in the MediaPlayer. This may also effect the 'system' volume depending upon the
 configuration of SageTV.
 */
public static void VolumeDown (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "VolumeDown", (Object[])null);
}

/**
Returns the current volume level of the MediaPlayer. If no MediaPlayer is loaded this will return
 the system volume.

Returns:
the current volume level of the MediaPlayer; if no MediaPlayer is loaded this will return
         the system volume. The value will be between 0.0 and 1.0
 */
public static float GetVolume () {
  Object o = sagex.SageAPI.call("GetVolume", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Returns the current volume level of the MediaPlayer. If no MediaPlayer is loaded this will return
 the system volume.

Returns:
the current volume level of the MediaPlayer; if no MediaPlayer is loaded this will return
         the system volume. The value will be between 0.0 and 1.0
 */
public static float GetVolume (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVolume", (Object[])null);
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
Performs a logical channel up in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.
 */
public static void ChannelUp () {
   sagex.SageAPI.call("ChannelUp", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a logical channel up in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.
 */
public static void ChannelUp (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ChannelUp", (Object[])null);
}

/**
Performs a logical channel down in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.
 */
public static void ChannelDown () {
   sagex.SageAPI.call("ChannelDown", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs a logical channel down in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.
 */
public static void ChannelDown (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ChannelDown", (Object[])null);
}

/**
Performs a logical channel set in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.

Parameters:
ChannelNumber- the new channel/track/chapter to playback
 */
public static void ChannelSet (java.lang.String ChannelNumber) {
   sagex.SageAPI.call("ChannelSet", new Object[] {ChannelNumber});
}

/**
 * UI Context Aware Call<br>
Performs a logical channel set in the MediaPlayer. This only has effect if the content that is
 currently being viewed has the concept of channels, tracks, chapters, etc.

Parameters:
ChannelNumber- the new channel/track/chapter to playback
 */
public static void ChannelSet (UIContext _uicontext,java.lang.String ChannelNumber) {
   sagex.SageAPI.call(_uicontext, "ChannelSet", new Object[] {ChannelNumber});
}

/**
Adjusts the volume in the MediaPlayer be the specified amount. The overall volume for the
 player is between 0.0 and 1.0. This may also effect the 'system' volume depending upon the
 configuration of SageTV.

Parameters:
Amount- the amount to adjust the volume by
 */
public static void VolumeAdjust (float Amount) {
   sagex.SageAPI.call("VolumeAdjust", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Adjusts the volume in the MediaPlayer be the specified amount. The overall volume for the
 player is between 0.0 and 1.0. This may also effect the 'system' volume depending upon the
 configuration of SageTV.

Parameters:
Amount- the amount to adjust the volume by
 */
public static void VolumeAdjust (UIContext _uicontext,float Amount) {
   sagex.SageAPI.call(_uicontext, "VolumeAdjust", new Object[] {Amount});
}

/**
Explicitly sets the volume in the MediaPlayer to be the specified amount. This should be between 0.0 and 1.0
 This may also effect the 'system' volume depending upon the configuration of SageTV.

Parameters:
Amount- the level to set the volume to
 */
public static void SetVolume (float Amount) {
   sagex.SageAPI.call("SetVolume", new Object[] {Amount});
}

/**
 * UI Context Aware Call<br>
Explicitly sets the volume in the MediaPlayer to be the specified amount. This should be between 0.0 and 1.0
 This may also effect the 'system' volume depending upon the configuration of SageTV.

Parameters:
Amount- the level to set the volume to
 */
public static void SetVolume (UIContext _uicontext,float Amount) {
   sagex.SageAPI.call(_uicontext, "SetVolume", new Object[] {Amount});
}

/**
Instructs SageTV to playback the specified media content. The argument can be either an
 Airing, a MediaFile or a file path.  For Airings, it can correspond to a MediaFile (which has the
 same effect as just calling this with the MediaFile itself) or it can correspond to a live
 television Airing. For live TV airings, the appropriate work will be done to tune, record and start
 playback of the requested content.  For MediaFiles or file paths, this will simply playback the specified content.

Parameters:
Content- the Airing, MediaFile or file path to being playback of
Returns:
true if the request was successful, a localized error message otherwise
 */
public static java.lang.Object Watch (java.lang.Object Content) {
  Object o = sagex.SageAPI.call("Watch", new Object[] {Content});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Instructs SageTV to playback the specified media content. The argument can be either an
 Airing, a MediaFile or a file path.  For Airings, it can correspond to a MediaFile (which has the
 same effect as just calling this with the MediaFile itself) or it can correspond to a live
 television Airing. For live TV airings, the appropriate work will be done to tune, record and start
 playback of the requested content.  For MediaFiles or file paths, this will simply playback the specified content.

Parameters:
Content- the Airing, MediaFile or file path to being playback of
Returns:
true if the request was successful, a localized error message otherwise
 */
public static java.lang.Object Watch (UIContext _uicontext,java.lang.Object Content) {
  Object o = sagex.SageAPI.call(_uicontext, "Watch", new Object[] {Content});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Instructs SageTV to begin playback of content streamed from the specified CaptureDeviceInput. The content
 may or may not be buffered to a file first depending upon the PauseBufferSize parameter as well as the
 capabilities of the capture hardware and the network configuration.  NOTE: This is NOT the same as jumping
 to live when playing back buffered TV content; to do that simply call Seek(Time())

Parameters:
CaptureDeviceInput- the capture input to playback content directly from
PauseBufferSize- the size in bytes of the buffer SageTV should use to buffer the content for playback, this will
         also allow pausing of this stream upto the size of the PauseBuffer; use 0 to request no buffering
         (although SageTV may still decide to use buffering if it deems it necessary)
Returns:
true if the request was successful, a localized error message otherwise
 */
public static java.lang.Object WatchLive (java.lang.String CaptureDeviceInput, long PauseBufferSize) {
  Object o = sagex.SageAPI.call("WatchLive", new Object[] {CaptureDeviceInput,PauseBufferSize});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Instructs SageTV to begin playback of content streamed from the specified CaptureDeviceInput. The content
 may or may not be buffered to a file first depending upon the PauseBufferSize parameter as well as the
 capabilities of the capture hardware and the network configuration.  NOTE: This is NOT the same as jumping
 to live when playing back buffered TV content; to do that simply call Seek(Time())

Parameters:
CaptureDeviceInput- the capture input to playback content directly from
PauseBufferSize- the size in bytes of the buffer SageTV should use to buffer the content for playback, this will
         also allow pausing of this stream upto the size of the PauseBuffer; use 0 to request no buffering
         (although SageTV may still decide to use buffering if it deems it necessary)
Returns:
true if the request was successful, a localized error message otherwise
 */
public static java.lang.Object WatchLive (UIContext _uicontext,java.lang.String CaptureDeviceInput, long PauseBufferSize) {
  Object o = sagex.SageAPI.call(_uicontext, "WatchLive", new Object[] {CaptureDeviceInput,PauseBufferSize});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Instructs SageTV to begin playback of content streamed from the specified CaptureDeviceInput. The content
 may or may not be buffered to a file first depending upon the PauseBufferSize parameter as well as the
 capabilities of the capture hardware and the network configuration.  The channel to view is also
 specified in this form of the call. NOTE: This is NOT the same as jumping
 to live when playing back buffered TV content; to do that simply call Seek(Time())

Parameters:
CaptureDeviceInput- the capture input to playback content directly from
PauseBufferSize- the size in bytes of the buffer SageTV should use to buffer the content for playback, this will
         also allow pausing of this stream upto the size of the PauseBuffer; use 0 to request no buffering
         (although SageTV may still decide to use buffering if it deems it necessary)
PhysicalChannel- the physical channel number that should be tuned to before starting viewing
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.6
 */
public static java.lang.Object WatchLive (java.lang.String CaptureDeviceInput, long PauseBufferSize, java.lang.String PhysicalChannel) {
  Object o = sagex.SageAPI.call("WatchLive", new Object[] {CaptureDeviceInput,PauseBufferSize,PhysicalChannel});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Instructs SageTV to begin playback of content streamed from the specified CaptureDeviceInput. The content
 may or may not be buffered to a file first depending upon the PauseBufferSize parameter as well as the
 capabilities of the capture hardware and the network configuration.  The channel to view is also
 specified in this form of the call. NOTE: This is NOT the same as jumping
 to live when playing back buffered TV content; to do that simply call Seek(Time())

Parameters:
CaptureDeviceInput- the capture input to playback content directly from
PauseBufferSize- the size in bytes of the buffer SageTV should use to buffer the content for playback, this will
         also allow pausing of this stream upto the size of the PauseBuffer; use 0 to request no buffering
         (although SageTV may still decide to use buffering if it deems it necessary)
PhysicalChannel- the physical channel number that should be tuned to before starting viewing
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.6
 */
public static java.lang.Object WatchLive (UIContext _uicontext,java.lang.String CaptureDeviceInput, long PauseBufferSize, java.lang.String PhysicalChannel) {
  Object o = sagex.SageAPI.call(_uicontext, "WatchLive", new Object[] {CaptureDeviceInput,PauseBufferSize,PhysicalChannel});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Instructs SageTV to take control of the specified CaptureDeviceInput. The device may then be used
 for channel scanning. This will cause any prompts to occur that are a result of taking control of the device.
 When done using it; CloseAndWaitUntilClosed() should be called.

Parameters:
CaptureDeviceInput- the capture input to control
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.6
 */
public static java.lang.Object LockTuner (java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call("LockTuner", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Instructs SageTV to take control of the specified CaptureDeviceInput. The device may then be used
 for channel scanning. This will cause any prompts to occur that are a result of taking control of the device.
 When done using it; CloseAndWaitUntilClosed() should be called.

Parameters:
CaptureDeviceInput- the capture input to control
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.6
 */
public static java.lang.Object LockTuner (UIContext _uicontext,java.lang.String CaptureDeviceInput) {
  Object o = sagex.SageAPI.call(_uicontext, "LockTuner", new Object[] {CaptureDeviceInput});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Instructs SageTV to playback the specified file path that's local to this client

Parameters:
file- path to playback
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.4
 */
public static java.lang.Object WatchLocalFile (java.io.File file) {
  Object o = sagex.SageAPI.call("WatchLocalFile", new Object[] {file});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Instructs SageTV to playback the specified file path that's local to this client

Parameters:
file- path to playback
Returns:
true if the request was successful, a localized error message otherwise
Since:
6.4
 */
public static java.lang.Object WatchLocalFile (UIContext _uicontext,java.io.File file) {
  Object o = sagex.SageAPI.call(_uicontext, "WatchLocalFile", new Object[] {file});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Starts playback of the specified Playlist. The MediaPlayer will playback everything in the Playlist
 sequentially until it is done.

Parameters:
Playlist- the Playlist to being playback of
Returns:
true if the request was successful, a localized error message otherwise (failure will only occur due to parental control issues)
 */
public static java.lang.Object StartPlaylist (Object Playlist) {
  Object o = sagex.SageAPI.call("StartPlaylist", new Object[] {Playlist});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Starts playback of the specified Playlist. The MediaPlayer will playback everything in the Playlist
 sequentially until it is done.

Parameters:
Playlist- the Playlist to being playback of
Returns:
true if the request was successful, a localized error message otherwise (failure will only occur due to parental control issues)
 */
public static java.lang.Object StartPlaylist (UIContext _uicontext,Object Playlist) {
  Object o = sagex.SageAPI.call(_uicontext, "StartPlaylist", new Object[] {Playlist});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Starts playback of the specified Playlist. The MediaPlayer will playback everything in the Playlist
 sequentially until it is done. Playback will begin at the item at the specified by the passed in index.

Parameters:
Playlist- the Playlist to being playback of
StartIndex- the index in the playlist to start playing at (1-based index)
Returns:
true if the request was successful, a localized error message otherwise (failure will only occur due to parental control issues)
 */
public static java.lang.Object StartPlaylistAt (Object Playlist, int StartIndex) {
  Object o = sagex.SageAPI.call("StartPlaylistAt", new Object[] {Playlist,StartIndex});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Starts playback of the specified Playlist. The MediaPlayer will playback everything in the Playlist
 sequentially until it is done. Playback will begin at the item at the specified by the passed in index.

Parameters:
Playlist- the Playlist to being playback of
StartIndex- the index in the playlist to start playing at (1-based index)
Returns:
true if the request was successful, a localized error message otherwise (failure will only occur due to parental control issues)
 */
public static java.lang.Object StartPlaylistAt (UIContext _uicontext,Object Playlist, int StartIndex) {
  Object o = sagex.SageAPI.call(_uicontext, "StartPlaylistAt", new Object[] {Playlist,StartIndex});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Closes the file that is currently loaded by the MediaPlayer and waits for the MediaPlayer to
 completely free all of its resources before returning.
 */
public static void CloseAndWaitUntilClosed () {
   sagex.SageAPI.call("CloseAndWaitUntilClosed", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Closes the file that is currently loaded by the MediaPlayer and waits for the MediaPlayer to
 completely free all of its resources before returning.
 */
public static void CloseAndWaitUntilClosed (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "CloseAndWaitUntilClosed", (Object[])null);
}

/**
Returns true if the MediaPlayer is currently in a muted state. This will not affect the system volume.

Returns:
true if the MediaPlayer is muted, false otherwise
 */
public static boolean IsMuted () {
  Object o = sagex.SageAPI.call("IsMuted", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer is currently in a muted state. This will not affect the system volume.

Returns:
true if the MediaPlayer is muted, false otherwise
 */
public static boolean IsMuted (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMuted", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the mute state for the MediaPlayer. This does not affect the system volume.

Parameters:
Muted- true if the MediaPlayer should be muted, false otherwise
 */
public static void SetMute (boolean Muted) {
   sagex.SageAPI.call("SetMute", new Object[] {Muted});
}

/**
 * UI Context Aware Call<br>
Sets the mute state for the MediaPlayer. This does not affect the system volume.

Parameters:
Muted- true if the MediaPlayer should be muted, false otherwise
 */
public static void SetMute (UIContext _uicontext,boolean Muted) {
   sagex.SageAPI.call(_uicontext, "SetMute", new Object[] {Muted});
}

/**
Returns the title of the content that is currently loaded by the MediaPlayer.

Returns:
the title of the content that is currently loaded by the MediaPlayer
 */
public static java.lang.String GetCurrentMediaTitle () {
  Object o = sagex.SageAPI.call("GetCurrentMediaTitle", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the title of the content that is currently loaded by the MediaPlayer.

Returns:
the title of the content that is currently loaded by the MediaPlayer
 */
public static java.lang.String GetCurrentMediaTitle (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentMediaTitle", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the current playback time of the MediaPlayer. For DVD content this time will return a value appropriate for
 a current time display (starting at zero). For all other content types, this value will be the time in java.lang.System.currentTimeMillis() units
 and is relative to the start time of the Airing metadata which represents the currently loaded file. So for a current time display you
 should subtract the airing start time of the current media file from the returned value.

Returns:
the current playback time of the MediaPlayer in milliseconds
 */
public static long GetMediaTime () {
  Object o = sagex.SageAPI.call("GetMediaTime", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the current playback time of the MediaPlayer. For DVD content this time will return a value appropriate for
 a current time display (starting at zero). For all other content types, this value will be the time in java.lang.System.currentTimeMillis() units
 and is relative to the start time of the Airing metadata which represents the currently loaded file. So for a current time display you
 should subtract the airing start time of the current media file from the returned value.

Returns:
the current playback time of the MediaPlayer in milliseconds
 */
public static long GetMediaTime (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaTime", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the current playback time of the MediaPlayer. This is the current playback time relative to the
 start of the current playing file. For multiple segment files; this will be relative to the start of the currently
 playing segment. This is intended to be used by plugin developers for linking events with the media time in the file.

Returns:
the current playback time of the MediaPlayer in milliseconds
Since:
7.0
 */
public static long GetRawMediaTime () {
  Object o = sagex.SageAPI.call("GetRawMediaTime", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the current playback time of the MediaPlayer. This is the current playback time relative to the
 start of the current playing file. For multiple segment files; this will be relative to the start of the currently
 playing segment. This is intended to be used by plugin developers for linking events with the media time in the file.

Returns:
the current playback time of the MediaPlayer in milliseconds
Since:
7.0
 */
public static long GetRawMediaTime (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetRawMediaTime", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the duration of the currently loaded MediaFile in milliseconds.

Returns:
the duration of the currently loaded MediaFile in milliseconds
 */
public static long GetMediaDuration () {
  Object o = sagex.SageAPI.call("GetMediaDuration", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the duration of the currently loaded MediaFile in milliseconds.

Returns:
the duration of the currently loaded MediaFile in milliseconds
 */
public static long GetMediaDuration (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaDuration", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the MediaFile object that is currently loaded (or loading) by the MediaPlayer

Returns:
the MediaFile object that is currently loaded (or loading) by the MediaPlayer
 */
public static Object GetCurrentMediaFile () {
  Object o = sagex.SageAPI.call("GetCurrentMediaFile", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the MediaFile object that is currently loaded (or loading) by the MediaPlayer

Returns:
the MediaFile object that is currently loaded (or loading) by the MediaPlayer
 */
public static Object GetCurrentMediaFile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentMediaFile", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the MediaPlayer currently has a file that is loading or loaded.

Returns:
true if the MediaPlayer currently has a file that is loading or loaded, false otherwise
 */
public static boolean HasMediaFile () {
  Object o = sagex.SageAPI.call("HasMediaFile", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer currently has a file that is loading or loaded.

Returns:
true if the MediaPlayer currently has a file that is loading or loaded, false otherwise
 */
public static boolean HasMediaFile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "HasMediaFile", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer has a file loading or loaded that has video content in it

Returns:
true if the MediaPlayer has a file loading or loaded that has video content in it, false otherwise
 */
public static boolean DoesCurrentMediaFileHaveVideo () {
  Object o = sagex.SageAPI.call("DoesCurrentMediaFileHaveVideo", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer has a file loading or loaded that has video content in it

Returns:
true if the MediaPlayer has a file loading or loaded that has video content in it, false otherwise
 */
public static boolean DoesCurrentMediaFileHaveVideo (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "DoesCurrentMediaFileHaveVideo", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer has a file loading or loaded, and that file is a music file

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is a music file
 */
public static boolean IsCurrentMediaFileMusic () {
  Object o = sagex.SageAPI.call("IsCurrentMediaFileMusic", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer has a file loading or loaded, and that file is a music file

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is a music file
 */
public static boolean IsCurrentMediaFileMusic (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCurrentMediaFileMusic", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer has a file loading or loaded, and that file is a DVD

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is a DVD
 */
public static boolean IsCurrentMediaFileDVD () {
  Object o = sagex.SageAPI.call("IsCurrentMediaFileDVD", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer has a file loading or loaded, and that file is a DVD

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is a DVD
 */
public static boolean IsCurrentMediaFileDVD (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCurrentMediaFileDVD", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer has a file loading or loaded, and that file is currently being recorded

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is currently being recorded
 */
public static boolean IsCurrentMediaFileRecording () {
  Object o = sagex.SageAPI.call("IsCurrentMediaFileRecording", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer has a file loading or loaded, and that file is currently being recorded

Returns:
true if the MediaPlayer has a file loading or loaded, and that file is currently being recorded
 */
public static boolean IsCurrentMediaFileRecording (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCurrentMediaFileRecording", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer is currently playing back content (i.e. content is fully loaded and not in the paused state)

Returns:
true if the MediaPlayer is currently playing back content, false otherwise
 */
public static boolean IsPlaying () {
  Object o = sagex.SageAPI.call("IsPlaying", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer is currently playing back content (i.e. content is fully loaded and not in the paused state)

Returns:
true if the MediaPlayer is currently playing back content, false otherwise
 */
public static boolean IsPlaying (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPlaying", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the MediaPlayer currently has DVD content loaded and that content is showing a DVD menu that can have user interaction

Returns:
true if the MediaPlayer currently has DVD content loaded and that content is showing a DVD menu that can have user interaction, false otherwise
 */
public static boolean IsShowingDVDMenu () {
  Object o = sagex.SageAPI.call("IsShowingDVDMenu", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the MediaPlayer currently has DVD content loaded and that content is showing a DVD menu that can have user interaction

Returns:
true if the MediaPlayer currently has DVD content loaded and that content is showing a DVD menu that can have user interaction, false otherwise
 */
public static boolean IsShowingDVDMenu (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsShowingDVDMenu", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the current Playlist that is being played back by the MediaPlayer. Playlists can be played back
 using the callStartPlaylist()


Returns:
the current Playlist that is being played back by the MediaPlayer, null otherwise
 */
public static Object GetCurrentPlaylist () {
  Object o = sagex.SageAPI.call("GetCurrentPlaylist", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the current Playlist that is being played back by the MediaPlayer. Playlists can be played back
 using the callStartPlaylist()


Returns:
the current Playlist that is being played back by the MediaPlayer, null otherwise
 */
public static Object GetCurrentPlaylist (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentPlaylist", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the 0-based index into the root Playlist that is currently being played back by the MediaPlayer. 0 is returned
 if no Playlist is currently being played back.

Returns:
the 0-based index into the root Playlist that is currently being played back by the MediaPlayer. 0 is returned
           if no Playlist is currently being played back.
 */
public static int GetCurrentPlaylistIndex () {
  Object o = sagex.SageAPI.call("GetCurrentPlaylistIndex", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the 0-based index into the root Playlist that is currently being played back by the MediaPlayer. 0 is returned
 if no Playlist is currently being played back.

Returns:
the 0-based index into the root Playlist that is currently being played back by the MediaPlayer. 0 is returned
           if no Playlist is currently being played back.
 */
public static int GetCurrentPlaylistIndex (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentPlaylistIndex", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the earliest time that the current media can be seeked to using theSeek()
call. This
 will be in absolute time.

Returns:
the earliest time that the current media can be seeked to in milliseconds
 */
public static long GetAvailableSeekingStart () {
  Object o = sagex.SageAPI.call("GetAvailableSeekingStart", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the earliest time that the current media can be seeked to using theSeek()
call. This
 will be in absolute time.

Returns:
the earliest time that the current media can be seeked to in milliseconds
 */
public static long GetAvailableSeekingStart (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAvailableSeekingStart", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the latest time that the current media can be seeked to using theSeek()
call. This
 will be in absolute time.

Returns:
the latest time that the current media can be seeked to in milliseconds
 */
public static long GetAvailableSeekingEnd () {
  Object o = sagex.SageAPI.call("GetAvailableSeekingEnd", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the latest time that the current media can be seeked to using theSeek()
call. This
 will be in absolute time.

Returns:
the latest time that the current media can be seeked to in milliseconds
 */
public static long GetAvailableSeekingEnd (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAvailableSeekingEnd", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns true if the argument passed in matches the parental lock code in the system

Parameters:
ParentalLockCode- the code to test
Returns:
true if the specified ParentalLockCode matches the parental lock code SageTV is configured to use
 */
public static boolean IsCorrectParentalLockCode (java.lang.String ParentalLockCode) {
  Object o = sagex.SageAPI.call("IsCorrectParentalLockCode", new Object[] {ParentalLockCode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the argument passed in matches the parental lock code in the system

Parameters:
ParentalLockCode- the code to test
Returns:
true if the specified ParentalLockCode matches the parental lock code SageTV is configured to use
 */
public static boolean IsCorrectParentalLockCode (UIContext _uicontext,java.lang.String ParentalLockCode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCorrectParentalLockCode", new Object[] {ParentalLockCode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the video portion of SageTV to always be on top of other windows in the desktop (Windows only).

Parameters:
OnTop- true if the video window of SageTV should be on top of all other windows in the system, false otherwise
 */
public static void SetVideoAlwaysOnTop (boolean OnTop) {
   sagex.SageAPI.call("SetVideoAlwaysOnTop", new Object[] {OnTop});
}

/**
 * UI Context Aware Call<br>
Sets the video portion of SageTV to always be on top of other windows in the desktop (Windows only).

Parameters:
OnTop- true if the video window of SageTV should be on top of all other windows in the system, false otherwise
 */
public static void SetVideoAlwaysOnTop (UIContext _uicontext,boolean OnTop) {
   sagex.SageAPI.call(_uicontext, "SetVideoAlwaysOnTop", new Object[] {OnTop});
}

/**
Informs the MediaPlayer to start playback of the next chapter in the current DVD content.
 */
public static void DVDChapterNext () {
   sagex.SageAPI.call("DVDChapterNext", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Informs the MediaPlayer to start playback of the next chapter in the current DVD content.
 */
public static void DVDChapterNext (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDChapterNext", (Object[])null);
}

/**
Informs the MediaPlayer to start playback of the previous chapter in the current DVD content.
 */
public static void DVDChapterPrevious () {
   sagex.SageAPI.call("DVDChapterPrevious", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Informs the MediaPlayer to start playback of the previous chapter in the current DVD content.
 */
public static void DVDChapterPrevious (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDChapterPrevious", (Object[])null);
}

/**
Informs the MediaPlayer to start playback of the specified chapter in the current DVD content.

Parameters:
ChapterNumber- the chapter number to start playback of in the current DVD
 */
public static void DVDChapterSet (int ChapterNumber) {
   sagex.SageAPI.call("DVDChapterSet", new Object[] {ChapterNumber});
}

/**
 * UI Context Aware Call<br>
Informs the MediaPlayer to start playback of the specified chapter in the current DVD content.

Parameters:
ChapterNumber- the chapter number to start playback of in the current DVD
 */
public static void DVDChapterSet (UIContext _uicontext,int ChapterNumber) {
   sagex.SageAPI.call(_uicontext, "DVDChapterSet", new Object[] {ChapterNumber});
}

/**
Performs the 'Enter' operation when using a menu system in DVD content.
 */
public static void DVDEnter () {
   sagex.SageAPI.call("DVDEnter", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs the 'Enter' operation when using a menu system in DVD content.
 */
public static void DVDEnter (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDEnter", (Object[])null);
}

/**
Performs the 'Menu' operation when playing back a DVD which should bring up the root menu of the DVD
 */
public static void DVDMenu () {
   sagex.SageAPI.call("DVDMenu", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs the 'Menu' operation when playing back a DVD which should bring up the root menu of the DVD
 */
public static void DVDMenu (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDMenu", (Object[])null);
}

/**
Performs the 'Menu' operation when playing back a DVD which should bring up the title menu of the DVD
 */
public static void DVDTitleMenu () {
   sagex.SageAPI.call("DVDTitleMenu", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs the 'Menu' operation when playing back a DVD which should bring up the title menu of the DVD
 */
public static void DVDTitleMenu (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDTitleMenu", (Object[])null);
}

/**
Performs the 'Return' operation when playing back a DVD which should bring the user back to the last DVD menu they were at
 */
public static void DVDReturn () {
   sagex.SageAPI.call("DVDReturn", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Performs the 'Return' operation when playing back a DVD which should bring the user back to the last DVD menu they were at
 */
public static void DVDReturn (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDReturn", (Object[])null);
}

/**
Informs the MediaPlayer to start playback of the next title in the current DVD content.
 */
public static void DVDTitleNext () {
   sagex.SageAPI.call("DVDTitleNext", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Informs the MediaPlayer to start playback of the next title in the current DVD content.
 */
public static void DVDTitleNext (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDTitleNext", (Object[])null);
}

/**
Informs the MediaPlayer to start playback of the previous title in the current DVD content.
 */
public static void DVDTitlePrevious () {
   sagex.SageAPI.call("DVDTitlePrevious", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Informs the MediaPlayer to start playback of the previous title in the current DVD content.
 */
public static void DVDTitlePrevious (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDTitlePrevious", (Object[])null);
}

/**
Toggles the state for subtitle display in the DVD content being played back.
 */
public static void DVDSubtitleToggle () {
   sagex.SageAPI.call("DVDSubtitleToggle", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Toggles the state for subtitle display in the DVD content being played back.
 */
public static void DVDSubtitleToggle (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "DVDSubtitleToggle", (Object[])null);
}

/**
Sets the subtitle that should be displayed in the current DVD content. The names of the languages for the
 corresponding subtitles are obtained from a call toGetDVDAvailableSubpictures()
.
 If no arguments are given to this function then the currently displayed subtitle will be changed to the next one

Parameters:
SubtitleNum- the 0-based index into the list of subtitles that should be displayed
 */
public static void DVDSubtitleChange (int SubtitleNum) {
   sagex.SageAPI.call("DVDSubtitleChange", new Object[] {SubtitleNum});
}

/**
 * UI Context Aware Call<br>
Sets the subtitle that should be displayed in the current DVD content. The names of the languages for the
 corresponding subtitles are obtained from a call toGetDVDAvailableSubpictures()
.
 If no arguments are given to this function then the currently displayed subtitle will be changed to the next one

Parameters:
SubtitleNum- the 0-based index into the list of subtitles that should be displayed
 */
public static void DVDSubtitleChange (UIContext _uicontext,int SubtitleNum) {
   sagex.SageAPI.call(_uicontext, "DVDSubtitleChange", new Object[] {SubtitleNum});
}

/**
Sets the audio language that should be used in the current DVD content. The names of the languages
 are obtained from a call toGetDVDAvailableLanguages()
.
 If no arguments are given to this function then the current audio language will be changed to the next available language

Parameters:
AudioNum- the 0-based index into the list of audio languages that should be used
 */
public static void DVDAudioChange (int AudioNum) {
   sagex.SageAPI.call("DVDAudioChange", new Object[] {AudioNum});
}

/**
 * UI Context Aware Call<br>
Sets the audio language that should be used in the current DVD content. The names of the languages
 are obtained from a call toGetDVDAvailableLanguages()
.
 If no arguments are given to this function then the current audio language will be changed to the next available language

Parameters:
AudioNum- the 0-based index into the list of audio languages that should be used
 */
public static void DVDAudioChange (UIContext _uicontext,int AudioNum) {
   sagex.SageAPI.call(_uicontext, "DVDAudioChange", new Object[] {AudioNum});
}

/**
Sets the 'Angle' for playback of the current DVD content. The number of angels
 are obtained from a call toGetDVDNumberOfAngles()
.
 If no arguments are given to this function then the current angle will be changed to the next available angle

Parameters:
AngleNum- the 1-based index that indicates which angle should be used for playback
 */
public static void DVDAngleChange (int AngleNum) {
   sagex.SageAPI.call("DVDAngleChange", new Object[] {AngleNum});
}

/**
 * UI Context Aware Call<br>
Sets the 'Angle' for playback of the current DVD content. The number of angels
 are obtained from a call toGetDVDNumberOfAngles()
.
 If no arguments are given to this function then the current angle will be changed to the next available angle

Parameters:
AngleNum- the 1-based index that indicates which angle should be used for playback
 */
public static void DVDAngleChange (UIContext _uicontext,int AngleNum) {
   sagex.SageAPI.call(_uicontext, "DVDAngleChange", new Object[] {AngleNum});
}

/**
Reloads the current file that is loaded by the MediaPlayer. This is useful when changing configuration options
 for the MediaPlayer and then showing playback with those changes.
 */
public static void ReloadCurrentFile () {
   sagex.SageAPI.call("ReloadCurrentFile", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Reloads the current file that is loaded by the MediaPlayer. This is useful when changing configuration options
 for the MediaPlayer and then showing playback with those changes.
 */
public static void ReloadCurrentFile (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ReloadCurrentFile", (Object[])null);
}

/**
Submits an explicit playback control request to the MediaPlayer if it supports it. (Only DVD-based media players support this call)

Parameters:
Code- this is the value of the control command to be sent to the player, must be one of the following:
        MENU = 201; Param1 should be 1 for title, 2 for root
        TITLE_SET = 202; Param1 should be the title number
        CHAPTER_SET = 205; Param1 should be the chapter number
        CHAPTER_NEXT = 206;
        CHAPTER_PREV = 207;
        ACTIVATE_CURRENT = 208;
        RETURN = 209;
        BUTTON_NAV = 210; Param1 should be 1(up), 2(right), 3(down) or 4(left)
        MOUSE_HOVER = 211; Param1 should be x and Param2 should be y
        MOUSE_CLICK = 212; Param1 should be x and Param2 should be y
        ANGLE_CHANGE = 213; Param1 should be the angle number (1-based)
        SUBTITLE_CHANGE = 214; Param1 should be the subtitle number (0-based)
        SUBTITLE_TOGGLE = 215;
        AUDIO_CHANGE = 216; Param1 should be the audio number (0-based)
Param1- the first parameter for the control command (see above)
Param2- the second parameter for the control command (see above)
 */
public static void DirectPlaybackControl (int Code, long Param1, long Param2) {
   sagex.SageAPI.call("DirectPlaybackControl", new Object[] {Code,Param1,Param2});
}

/**
 * UI Context Aware Call<br>
Submits an explicit playback control request to the MediaPlayer if it supports it. (Only DVD-based media players support this call)

Parameters:
Code- this is the value of the control command to be sent to the player, must be one of the following:
        MENU = 201; Param1 should be 1 for title, 2 for root
        TITLE_SET = 202; Param1 should be the title number
        CHAPTER_SET = 205; Param1 should be the chapter number
        CHAPTER_NEXT = 206;
        CHAPTER_PREV = 207;
        ACTIVATE_CURRENT = 208;
        RETURN = 209;
        BUTTON_NAV = 210; Param1 should be 1(up), 2(right), 3(down) or 4(left)
        MOUSE_HOVER = 211; Param1 should be x and Param2 should be y
        MOUSE_CLICK = 212; Param1 should be x and Param2 should be y
        ANGLE_CHANGE = 213; Param1 should be the angle number (1-based)
        SUBTITLE_CHANGE = 214; Param1 should be the subtitle number (0-based)
        SUBTITLE_TOGGLE = 215;
        AUDIO_CHANGE = 216; Param1 should be the audio number (0-based)
Param1- the first parameter for the control command (see above)
Param2- the second parameter for the control command (see above)
 */
public static void DirectPlaybackControl (UIContext _uicontext,int Code, long Param1, long Param2) {
   sagex.SageAPI.call(_uicontext, "DirectPlaybackControl", new Object[] {Code,Param1,Param2});
}

/**
Gets the current title number that is being played back for DVD content.

Returns:
the current title number that is being played back for DVD content, 0 otherwise
 */
public static int GetDVDCurrentTitle () {
  Object o = sagex.SageAPI.call("GetDVDCurrentTitle", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the current title number that is being played back for DVD content.

Returns:
the current title number that is being played back for DVD content, 0 otherwise
 */
public static int GetDVDCurrentTitle (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDCurrentTitle", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns a description of the specified title number if playing back a BluRay. This description will have
 the total unique duration of the specified title and an asterisk if it is considered to be the 'main' title.

Parameters:
TitleNum- the title number (1-based) to retrieve a description of
Returns:
a description of the specified title number if playing back a BluRay; the empty string otherwise
Since:
7.0
 */
public static java.lang.String GetBluRayTitleDescription (int TitleNum) {
  Object o = sagex.SageAPI.call("GetBluRayTitleDescription", new Object[] {TitleNum});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a description of the specified title number if playing back a BluRay. This description will have
 the total unique duration of the specified title and an asterisk if it is considered to be the 'main' title.

Parameters:
TitleNum- the title number (1-based) to retrieve a description of
Returns:
a description of the specified title number if playing back a BluRay; the empty string otherwise
Since:
7.0
 */
public static java.lang.String GetBluRayTitleDescription (UIContext _uicontext,int TitleNum) {
  Object o = sagex.SageAPI.call(_uicontext, "GetBluRayTitleDescription", new Object[] {TitleNum});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the total number of titles in the current DVD content

Returns:
the total number of titles in the current DVD content
 */
public static int GetDVDNumberOfTitles () {
  Object o = sagex.SageAPI.call("GetDVDNumberOfTitles", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the total number of titles in the current DVD content

Returns:
the total number of titles in the current DVD content
 */
public static int GetDVDNumberOfTitles (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDNumberOfTitles", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the current chapter number that is being played back for DVD content.

Returns:
the current chapter number that is being played back for DVD content
 */
public static int GetDVDCurrentChapter () {
  Object o = sagex.SageAPI.call("GetDVDCurrentChapter", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the current chapter number that is being played back for DVD content.

Returns:
the current chapter number that is being played back for DVD content
 */
public static int GetDVDCurrentChapter (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDCurrentChapter", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the total number of chapters in the current title in the current DVD content

Returns:
the total number of chapters in the current title in the current DVD content
 */
public static int GetDVDNumberOfChapters () {
  Object o = sagex.SageAPI.call("GetDVDNumberOfChapters", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the total number of chapters in the current title in the current DVD content

Returns:
the total number of chapters in the current title in the current DVD content
 */
public static int GetDVDNumberOfChapters (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDNumberOfChapters", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the current 'domain' that the DVD playback is in.

Returns:
the current 'domain' that the DVD playback is in, uses the following values:
         1 = DVD initialization, 2 = disc menus, 3 = title menus, 4 = playback, 5 = stopped
 */
public static int GetDVDCurrentDomain () {
  Object o = sagex.SageAPI.call("GetDVDCurrentDomain", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the current 'domain' that the DVD playback is in.

Returns:
the current 'domain' that the DVD playback is in, uses the following values:
         1 = DVD initialization, 2 = disc menus, 3 = title menus, 4 = playback, 5 = stopped
 */
public static int GetDVDCurrentDomain (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDCurrentDomain", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the current angle number that is being played back for DVD content

Returns:
the current angle number that is being played back for DVD content
 */
public static int GetDVDCurrentAngle () {
  Object o = sagex.SageAPI.call("GetDVDCurrentAngle", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the current angle number that is being played back for DVD content

Returns:
the current angle number that is being played back for DVD content
 */
public static int GetDVDCurrentAngle (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDCurrentAngle", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the total number of angles that are currently available to select from in the current DVD content

Returns:
the total number of angles that are currently available to select from in the current DVD content
 */
public static int GetDVDNumberOfAngles () {
  Object o = sagex.SageAPI.call("GetDVDNumberOfAngles", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the total number of angles that are currently available to select from in the current DVD content

Returns:
the total number of angles that are currently available to select from in the current DVD content
 */
public static int GetDVDNumberOfAngles (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDNumberOfAngles", (Object[])null);
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the current audio playback language that is being used for the current DVD content

Returns:
the current audio playback language that is being used for the current DVD content
 */
public static java.lang.String GetDVDCurrentLanguage () {
  Object o = sagex.SageAPI.call("GetDVDCurrentLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the current audio playback language that is being used for the current DVD content

Returns:
the current audio playback language that is being used for the current DVD content
 */
public static java.lang.String GetDVDCurrentLanguage (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDVDCurrentLanguage", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets a list of all of the audio languages that are currently available in the current DVD content

Returns:
a list of all of the audio languages that are currently available in the current DVD content
 */
public static java.lang.String[] GetDVDAvailableLanguages () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVDAvailableLanguages", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the audio languages that are currently available in the current DVD content

Returns:
a list of all of the audio languages that are currently available in the current DVD content
 */
public static java.lang.String[] GetDVDAvailableLanguages (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVDAvailableLanguages", (Object[])null);
}

/**
Gets the current subtitle that is being used for the current DVD content

Returns:
the current subtitle that is being used for the current DVD content, null if subtitles are currently disabled
 */
public static java.lang.String[] GetDVDCurrentSubpicture () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVDCurrentSubpicture", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the current subtitle that is being used for the current DVD content

Returns:
the current subtitle that is being used for the current DVD content, null if subtitles are currently disabled
 */
public static java.lang.String[] GetDVDCurrentSubpicture (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVDCurrentSubpicture", (Object[])null);
}

/**
Gets a list of all of the subtitles that are currently available in the current DVD content

Returns:
a list of all of the subtitles that are currently available in the current DVD content
 */
public static java.lang.String[] GetDVDAvailableSubpictures () {
  return (java.lang.String[]) sagex.SageAPI.call("GetDVDAvailableSubpictures", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of all of the subtitles that are currently available in the current DVD content

Returns:
a list of all of the subtitles that are currently available in the current DVD content
 */
public static java.lang.String[] GetDVDAvailableSubpictures (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetDVDAvailableSubpictures", (Object[])null);
}

/**
Gets the current state that MediaPlayer close captioning is set to use. This can be either a localized
 version of "Captions Off" or one of the strings: "CC1", "CC2", "Text1", "Text2"

Returns:
the current state that MediaPlayer close captioning is set to use
 */
public static java.lang.String GetMediaPlayerClosedCaptionState () {
  Object o = sagex.SageAPI.call("GetMediaPlayerClosedCaptionState", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the current state that MediaPlayer close captioning is set to use. This can be either a localized
 version of "Captions Off" or one of the strings: "CC1", "CC2", "Text1", "Text2"

Returns:
the current state that MediaPlayer close captioning is set to use
 */
public static java.lang.String GetMediaPlayerClosedCaptionState (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaPlayerClosedCaptionState", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the current state that MediaPlayer close captioning should use. This can be one of the strings: "CC1", "CC2", "Text1", "Text2".
 If any other value is used then closed captioning will be turned off.

Parameters:
CCType- the new state that MediaPlayer close captioning should use
 */
public static void SetMediaPlayerClosedCaptionState (java.lang.String CCType) {
   sagex.SageAPI.call("SetMediaPlayerClosedCaptionState", new Object[] {CCType});
}

/**
 * UI Context Aware Call<br>
Sets the current state that MediaPlayer close captioning should use. This can be one of the strings: "CC1", "CC2", "Text1", "Text2".
 If any other value is used then closed captioning will be turned off.

Parameters:
CCType- the new state that MediaPlayer close captioning should use
 */
public static void SetMediaPlayerClosedCaptionState (UIContext _uicontext,java.lang.String CCType) {
   sagex.SageAPI.call(_uicontext, "SetMediaPlayerClosedCaptionState", new Object[] {CCType});
}

/**
Returns true if the source the MediaPlayer is trying to playback from indicates a signal loss.
 This can happen when trying to watch digital TV stations.

Returns:
true if the MediaPlayer detects signal loss from the source it's playing back, false otherwise
 */
public static boolean IsMediaPlayerSignalLost () {
  Object o = sagex.SageAPI.call("IsMediaPlayerSignalLost", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the source the MediaPlayer is trying to playback from indicates a signal loss.
 This can happen when trying to watch digital TV stations.

Returns:
true if the MediaPlayer detects signal loss from the source it's playing back, false otherwise
 */
public static boolean IsMediaPlayerSignalLost (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMediaPlayerSignalLost", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the delay in milliseconds that is applied to external subtitle files when they are used during playback (can be positive or negative)

Returns:
the delay in milliseconds that is applied to external subtitle files when they are used during playback.
Since:
6.6
 */
public static long GetSubtitleDelay () {
  Object o = sagex.SageAPI.call("GetSubtitleDelay", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Gets the delay in milliseconds that is applied to external subtitle files when they are used during playback (can be positive or negative)

Returns:
the delay in milliseconds that is applied to external subtitle files when they are used during playback.
Since:
6.6
 */
public static long GetSubtitleDelay (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSubtitleDelay", (Object[])null);
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Sets the delay in milliseconds that is applied to external subtitle files when they are used during playback (can be positive or negative)

Parameters:
DelayMsec- the delay in milliseconds that is applied to external subtitle files when they are used during playback
Since:
6.6
 */
public static void SetSubtitleDelay (long DelayMsec) {
   sagex.SageAPI.call("SetSubtitleDelay", new Object[] {DelayMsec});
}

/**
 * UI Context Aware Call<br>
Sets the delay in milliseconds that is applied to external subtitle files when they are used during playback (can be positive or negative)

Parameters:
DelayMsec- the delay in milliseconds that is applied to external subtitle files when they are used during playback
Since:
6.6
 */
public static void SetSubtitleDelay (UIContext _uicontext,long DelayMsec) {
   sagex.SageAPI.call(_uicontext, "SetSubtitleDelay", new Object[] {DelayMsec});
}

/**
Returns true if the subtitles for the currently loaded file can have their timing adjusted. This is true for subtitles
 that come from external files

Returns:
true if the subtitles for the currently loaded file can have their timing adjusted; false otherwise
Since:
6.6
 */
public static boolean CanAdjustSubtitleTiming () {
  Object o = sagex.SageAPI.call("CanAdjustSubtitleTiming", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the subtitles for the currently loaded file can have their timing adjusted. This is true for subtitles
 that come from external files

Returns:
true if the subtitles for the currently loaded file can have their timing adjusted; false otherwise
Since:
6.6
 */
public static boolean CanAdjustSubtitleTiming (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "CanAdjustSubtitleTiming", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Adjusts the timing for subtitle display by increasing/decreasing the delay so that the sub at the relative SubCount position
 would be currently displayed.

Parameters:
SubCount- the relative position from the current sub of the sub that should be displayed now
Returns:
the value in milliseconds of the current subtitle delay (same as return from GetSubtitleDelay())
Since:
6.6
 */
public static long ApplyRelativeSubtitleAdjustment (int SubCount) {
  Object o = sagex.SageAPI.call("ApplyRelativeSubtitleAdjustment", new Object[] {SubCount});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Adjusts the timing for subtitle display by increasing/decreasing the delay so that the sub at the relative SubCount position
 would be currently displayed.

Parameters:
SubCount- the relative position from the current sub of the sub that should be displayed now
Returns:
the value in milliseconds of the current subtitle delay (same as return from GetSubtitleDelay())
Since:
6.6
 */
public static long ApplyRelativeSubtitleAdjustment (UIContext _uicontext,int SubCount) {
  Object o = sagex.SageAPI.call(_uicontext, "ApplyRelativeSubtitleAdjustment", new Object[] {SubCount});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns an array of recently viewed channels. This tracks channels viewed from any mechanism; live or DVR'd.

Returns:
an array of the most recently viewed channels, most recently viewed are at the head of the array
Since:
8.0
 */
public static Object[] GetRecentChannels () {
  return (Object[]) sagex.SageAPI.call("GetRecentChannels", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns an array of recently viewed channels. This tracks channels viewed from any mechanism; live or DVR'd.

Returns:
an array of the most recently viewed channels, most recently viewed are at the head of the array
Since:
8.0
 */
public static Object[] GetRecentChannels (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetRecentChannels", (Object[])null);
}

/**
Clears the list of recently viewed channels.

Since:
8.0
 */
public static void ClearRecentChannels () {
   sagex.SageAPI.call("ClearRecentChannels", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Clears the list of recently viewed channels.

Since:
8.0
 */
public static void ClearRecentChannels (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ClearRecentChannels", (Object[])null);
}

/**
Returns an image which is a frame grab of the currently rendered video frame. This is currently only
 supported on Windows when using VMR9 with 3D acceleration

Returns:
a java.awt.image.BufferedImage which holds the last rendered video frame, or null if the call cannot be completed
 */
public static java.awt.image.BufferedImage GetVideoSnapshot () {
  Object o = sagex.SageAPI.call("GetVideoSnapshot", (Object[])null);
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns an image which is a frame grab of the currently rendered video frame. This is currently only
 supported on Windows when using VMR9 with 3D acceleration

Returns:
a java.awt.image.BufferedImage which holds the last rendered video frame, or null if the call cannot be completed
 */
public static java.awt.image.BufferedImage GetVideoSnapshot (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetVideoSnapshot", (Object[])null);
  if (o!=null) return (java.awt.image.BufferedImage) o;
  return null;
}

}
