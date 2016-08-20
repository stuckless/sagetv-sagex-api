package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/TranscodeAPI.html'>TranscodeAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class TranscodeAPI {
/**
Gets the names of the different transcode formats

Returns:
a list of the names of the different transcode formats
Since:
5.1
 */
public static java.lang.String[] GetTranscodeFormats () {
  return (java.lang.String[]) sagex.SageAPI.call("GetTranscodeFormats", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets the names of the different transcode formats

Returns:
a list of the names of the different transcode formats
Since:
5.1
 */
public static java.lang.String[] GetTranscodeFormats (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetTranscodeFormats", (Object[])null);
}

/**
Gets the format details for the specified format name

Parameters:
FormatName- the name of the transcode format to get the parameter details for
Returns:
the full detail string that describes the specified transcode format
Since:
5.1
 */
public static java.lang.String GetTranscodeFormatDetails (java.lang.String FormatName) {
  Object o = sagex.SageAPI.call("GetTranscodeFormatDetails", new Object[] {FormatName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the format details for the specified format name

Parameters:
FormatName- the name of the transcode format to get the parameter details for
Returns:
the full detail string that describes the specified transcode format
Since:
5.1
 */
public static java.lang.String GetTranscodeFormatDetails (UIContext _uicontext,java.lang.String FormatName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeFormatDetails", new Object[] {FormatName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Adds the specified transcode format to the list of available formats

Parameters:
FormatName- the name of the new transcode format
FormatDetails- the detailed property string for the new format
Since:
5.1
 */
public static void AddTranscodeFormat (java.lang.String FormatName, java.lang.String FormatDetails) {
   sagex.SageAPI.call("AddTranscodeFormat", new Object[] {FormatName,FormatDetails});
}

/**
 * UI Context Aware Call<br>
Adds the specified transcode format to the list of available formats

Parameters:
FormatName- the name of the new transcode format
FormatDetails- the detailed property string for the new format
Since:
5.1
 */
public static void AddTranscodeFormat (UIContext _uicontext,java.lang.String FormatName, java.lang.String FormatDetails) {
   sagex.SageAPI.call(_uicontext, "AddTranscodeFormat", new Object[] {FormatName,FormatDetails});
}

/**
Removed the specified transcode format to the list of available formats

Parameters:
FormatName- the name of the transcode format to remove
Since:
5.1
 */
public static void RemoveTranscodeFormat (java.lang.String FormatName) {
   sagex.SageAPI.call("RemoveTranscodeFormat", new Object[] {FormatName});
}

/**
 * UI Context Aware Call<br>
Removed the specified transcode format to the list of available formats

Parameters:
FormatName- the name of the transcode format to remove
Since:
5.1
 */
public static void RemoveTranscodeFormat (UIContext _uicontext,java.lang.String FormatName) {
   sagex.SageAPI.call(_uicontext, "RemoveTranscodeFormat", new Object[] {FormatName});
}

/**
Adds the specified job to the transcoder's queue. Returns a Job ID# for future reference of it.

Parameters:
SourceMediaFile- the source file that is to be transcoded, if it consists of multiple segments, all segments will be transcoded
FormatName- the name of the transcode format to use for this conversion
DestinationFile- the target file path for the conversion or null if SageTV should automatically determine the filename of the target files, if a directory is given then SageTV auto-generates the filename in that directory
DeleteSourceAfterTranscode- if true then the source media files are deleted when the transcoding is done, if false the source files are kept
Returns:
the job ID number to reference this transcode job
Since:
5.1
 */
public static int AddTranscodeJob (Object SourceMediaFile, java.lang.String FormatName, java.io.File DestinationFile, boolean DeleteSourceAfterTranscode) {
  Object o = sagex.SageAPI.call("AddTranscodeJob", new Object[] {SourceMediaFile,FormatName,DestinationFile,DeleteSourceAfterTranscode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Adds the specified job to the transcoder's queue. Returns a Job ID# for future reference of it.

Parameters:
SourceMediaFile- the source file that is to be transcoded, if it consists of multiple segments, all segments will be transcoded
FormatName- the name of the transcode format to use for this conversion
DestinationFile- the target file path for the conversion or null if SageTV should automatically determine the filename of the target files, if a directory is given then SageTV auto-generates the filename in that directory
DeleteSourceAfterTranscode- if true then the source media files are deleted when the transcoding is done, if false the source files are kept
Returns:
the job ID number to reference this transcode job
Since:
5.1
 */
public static int AddTranscodeJob (UIContext _uicontext,Object SourceMediaFile, java.lang.String FormatName, java.io.File DestinationFile, boolean DeleteSourceAfterTranscode) {
  Object o = sagex.SageAPI.call(_uicontext, "AddTranscodeJob", new Object[] {SourceMediaFile,FormatName,DestinationFile,DeleteSourceAfterTranscode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Adds the specified job to the transcoder's queue. Returns a Job ID# for future reference of it. This allows specification of the
 start time and duration for the media which allows extracting a 'clip' from a file.

Parameters:
SourceMediaFile- the source file that is to be transcoded, if it consists of multiple segments, all segments will be transcoded
FormatName- the name of the transcode format to use for this conversion
DestinationFile- the target file path for the conversion or null if SageTV should automatically determine the filename of the target files, if a directory is given then SageTV auto-generates the filename in that directory
DeleteSourceAfterTranscode- if true then the source media files are deleted when the transcoding is done, if false the source files are kept
ClipTimeStart- specifies the time in the file in seconds that the clip starts at (this number is relative to the beginning of the actual file)
ClipDuration- specifies the duration of the clip in seconds to extract from the file (0 to convert until the end of the file)
Returns:
the job ID number to reference this transcode job
Since:
5.1
 */
public static int AddTranscodeJob (Object SourceMediaFile, java.lang.String FormatName, java.io.File DestinationFile, boolean DeleteSourceAfterTranscode, long ClipTimeStart, long ClipDuration) {
  Object o = sagex.SageAPI.call("AddTranscodeJob", new Object[] {SourceMediaFile,FormatName,DestinationFile,DeleteSourceAfterTranscode,ClipTimeStart,ClipDuration});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Adds the specified job to the transcoder's queue. Returns a Job ID# for future reference of it. This allows specification of the
 start time and duration for the media which allows extracting a 'clip' from a file.

Parameters:
SourceMediaFile- the source file that is to be transcoded, if it consists of multiple segments, all segments will be transcoded
FormatName- the name of the transcode format to use for this conversion
DestinationFile- the target file path for the conversion or null if SageTV should automatically determine the filename of the target files, if a directory is given then SageTV auto-generates the filename in that directory
DeleteSourceAfterTranscode- if true then the source media files are deleted when the transcoding is done, if false the source files are kept
ClipTimeStart- specifies the time in the file in seconds that the clip starts at (this number is relative to the beginning of the actual file)
ClipDuration- specifies the duration of the clip in seconds to extract from the file (0 to convert until the end of the file)
Returns:
the job ID number to reference this transcode job
Since:
5.1
 */
public static int AddTranscodeJob (UIContext _uicontext,Object SourceMediaFile, java.lang.String FormatName, java.io.File DestinationFile, boolean DeleteSourceAfterTranscode, long ClipTimeStart, long ClipDuration) {
  Object o = sagex.SageAPI.call(_uicontext, "AddTranscodeJob", new Object[] {SourceMediaFile,FormatName,DestinationFile,DeleteSourceAfterTranscode,ClipTimeStart,ClipDuration});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Gets the status of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the status of
Returns:
the status information for the specified transcoding job, will be one of: COMPLETED, TRANSCODING, WAITING TO START, or FAILED
Since:
5.1
 */
public static java.lang.String GetTranscodeJobStatus (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobStatus", new Object[] {JobID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the status of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the status of
Returns:
the status information for the specified transcoding job, will be one of: COMPLETED, TRANSCODING, WAITING TO START, or FAILED
Since:
5.1
 */
public static java.lang.String GetTranscodeJobStatus (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobStatus", new Object[] {JobID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Cancels the specified transcoding ob

Parameters:
JobID- the Job ID of the transcoding job to cancel
Returns:
true if the job exists and was cancelled, false otherwise
Since:
5.1
 */
public static boolean CancelTranscodeJob (int JobID) {
  Object o = sagex.SageAPI.call("CancelTranscodeJob", new Object[] {JobID});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Cancels the specified transcoding ob

Parameters:
JobID- the Job ID of the transcoding job to cancel
Returns:
true if the job exists and was cancelled, false otherwise
Since:
5.1
 */
public static boolean CancelTranscodeJob (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "CancelTranscodeJob", new Object[] {JobID});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the source file of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the source file for
Returns:
the source file of the specified transcoding job
Since:
5.1
 */
public static Object GetTranscodeJobSourceFile (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobSourceFile", new Object[] {JobID});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the source file of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the source file for
Returns:
the source file of the specified transcoding job
Since:
5.1
 */
public static Object GetTranscodeJobSourceFile (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobSourceFile", new Object[] {JobID});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets the destination file of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the destination file of the specified transcoding job, or null if no destination file was specified
Since:
5.1
 */
public static java.io.File GetTranscodeJobDestFile (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobDestFile", new Object[] {JobID});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the destination file of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the destination file of the specified transcoding job, or null if no destination file was specified
Since:
5.1
 */
public static java.io.File GetTranscodeJobDestFile (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobDestFile", new Object[] {JobID});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns whether or not the specified transcoding job retains the original source file

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
true if the specified transcoding job keeps its original file when done, false otherwise
Since:
5.1
 */
public static boolean GetTranscodeJobShouldKeepOriginal (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobShouldKeepOriginal", new Object[] {JobID});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns whether or not the specified transcoding job retains the original source file

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
true if the specified transcoding job keeps its original file when done, false otherwise
Since:
5.1
 */
public static boolean GetTranscodeJobShouldKeepOriginal (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobShouldKeepOriginal", new Object[] {JobID});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the clip start time for the specified transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the clip start time for the specified transcode job, 0 if the start time is unspecified
Since:
5.1
 */
public static long GetTranscodeJobClipStart (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobClipStart", new Object[] {JobID});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the clip start time for the specified transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the clip start time for the specified transcode job, 0 if the start time is unspecified
Since:
5.1
 */
public static long GetTranscodeJobClipStart (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobClipStart", new Object[] {JobID});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the clip duration for the specified transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the clip duration for the specified transcode job, 0 if the entire file will be trancoded
Since:
5.1
 */
public static long GetTranscodeJobClipDuration (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobClipDuration", new Object[] {JobID});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br>
Returns the clip duration for the specified transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the destination file for
Returns:
the clip duration for the specified transcode job, 0 if the entire file will be trancoded
Since:
5.1
 */
public static long GetTranscodeJobClipDuration (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobClipDuration", new Object[] {JobID});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the target format of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the target format file for
Returns:
the target format of the specified transcoding job
Since:
5.1
 */
public static java.lang.String GetTranscodeJobFormat (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobFormat", new Object[] {JobID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the target format of the specified transcoding job

Parameters:
JobID- the Job ID of the transcoding job to get the target format file for
Returns:
the target format of the specified transcoding job
Since:
5.1
 */
public static java.lang.String GetTranscodeJobFormat (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobFormat", new Object[] {JobID});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Removes all of the completed transcode jobs from the transcoder queue

Since:
5.1
 */
public static void ClearTranscodedJobs () {
   sagex.SageAPI.call("ClearTranscodedJobs", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Removes all of the completed transcode jobs from the transcoder queue

Since:
5.1
 */
public static void ClearTranscodedJobs (UIContext _uicontext) {
   sagex.SageAPI.call(_uicontext, "ClearTranscodedJobs", (Object[])null);
}

/**
Returns a list of the job IDs for all the current jobs in the transcode queue.

Returns:
the list of job IDs for all the current jobs in the transcode queue
Since:
5.1
 */
public static java.lang.Integer[] GetTranscodeJobs () {
  return (java.lang.Integer[]) sagex.SageAPI.call("GetTranscodeJobs", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Returns a list of the job IDs for all the current jobs in the transcode queue.

Returns:
the list of job IDs for all the current jobs in the transcode queue
Since:
5.1
 */
public static java.lang.Integer[] GetTranscodeJobs (UIContext _uicontext) {
  return (java.lang.Integer[]) sagex.SageAPI.call(_uicontext, "GetTranscodeJobs", (Object[])null);
}

/**
Returns true if the specified MediaFile can be transcoded, false otherwise. Transcoding may be restricted
 by certain formats and also by DRM.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile can be transcoded, false otherwise
Since:
5.1
 */
public static boolean CanFileBeTranscoded (Object MediaFile) {
  Object o = sagex.SageAPI.call("CanFileBeTranscoded", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified MediaFile can be transcoded, false otherwise. Transcoding may be restricted
 by certain formats and also by DRM.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile can be transcoded, false otherwise
Since:
5.1
 */
public static boolean CanFileBeTranscoded (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "CanFileBeTranscoded", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the percent complete (between 0 and 1 as a float) for a transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the percent complete of
Returns:
the percent complete for the specified transcoding job
Since:
5.1
 */
public static float GetTranscodeJobCompletePercent (int JobID) {
  Object o = sagex.SageAPI.call("GetTranscodeJobCompletePercent", new Object[] {JobID});
  if (o!=null) return (Float) o;
  return 0.0f;
}

/**
 * UI Context Aware Call<br>
Gets the percent complete (between 0 and 1 as a float) for a transcode job

Parameters:
JobID- the Job ID of the transcoding job to get the percent complete of
Returns:
the percent complete for the specified transcoding job
Since:
5.1
 */
public static float GetTranscodeJobCompletePercent (UIContext _uicontext,int JobID) {
  Object o = sagex.SageAPI.call(_uicontext, "GetTranscodeJobCompletePercent", new Object[] {JobID});
  if (o!=null) return (Float) o;
  return 0.0f;
}

}
