package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 5:40 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaFileAPI.html'>MediaFileAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class MediaFileAPI {
/**
Returns all of the MediaFile objects in the database.

Returns:
a list of all of the MediaFile objects in the database
 */
public static Object[] GetMediaFiles () {
  return (Object[]) sagex.SageAPI.call("GetMediaFiles", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Returns all of the MediaFile objects in the database.

Returns:
a list of all of the MediaFile objects in the database
 */
public static Object[] GetMediaFiles (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetMediaFiles", (Object[])null);
}

/**
Returns all of the MediaFile objects in the database
 The content it references must also match one of the media types specified in the MediaMask.
 There's also an additional supported type of 'L' which indicates files that pass IsLibraryFile()

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV  Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the MediaFile objects in the database that match the mask
Since:
6.4
 */
public static Object[] GetMediaFiles (java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call("GetMediaFiles", new Object[] {MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns all of the MediaFile objects in the database
 The content it references must also match one of the media types specified in the MediaMask.
 There's also an additional supported type of 'L' which indicates files that pass IsLibraryFile()

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV  Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the MediaFile objects in the database that match the mask
Since:
6.4
 */
public static Object[] GetMediaFiles (UIContext _uicontext,java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetMediaFiles", new Object[] {MediaMask});
}

/**
Adds a new MediaFile to the database. This file will remain in the database until it is manually removed by the
 user or when the file no longer exists.

Parameters:
File- the file path for the new MediaFile
NamePrefix- the 'prefix' to prepend to the name of this media file for hierarchical purposes (i.e. the subdirectory that the file is in relative to the import root)
Returns:
the newly added MediaFile object
 */
public static Object AddMediaFile (java.io.File File, java.lang.String NamePrefix) {
  Object o = sagex.SageAPI.call("AddMediaFile", new Object[] {File,NamePrefix});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Adds a new MediaFile to the database. This file will remain in the database until it is manually removed by the
 user or when the file no longer exists.

Parameters:
File- the file path for the new MediaFile
NamePrefix- the 'prefix' to prepend to the name of this media file for hierarchical purposes (i.e. the subdirectory that the file is in relative to the import root)
Returns:
the newly added MediaFile object
 */
public static Object AddMediaFile (UIContext _uicontext,java.io.File File, java.lang.String NamePrefix) {
  Object o = sagex.SageAPI.call(_uicontext, "AddMediaFile", new Object[] {File,NamePrefix});
  if (o!=null) return (Object) o;
  return null;
}

/**
Creates a temporary MediaFile object which can be used for playback later. This will not be added into the database;
 but any metadata that is attached to this MediaFile object will be put in the database until the next cleanup process occurs.

Parameters:
FilePath- the file path for the temporary MediaFile (can also be an smb:// URL)
Returns:
the newly created temporary MediaFile object or null if it can't properly resolve the path to a file
Since:
6.6
 */
public static Object CreateTempMediaFile (java.lang.String FilePath) {
  Object o = sagex.SageAPI.call("CreateTempMediaFile", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Creates a temporary MediaFile object which can be used for playback later. This will not be added into the database;
 but any metadata that is attached to this MediaFile object will be put in the database until the next cleanup process occurs.

Parameters:
FilePath- the file path for the temporary MediaFile (can also be an smb:// URL)
Returns:
the newly created temporary MediaFile object or null if it can't properly resolve the path to a file
Since:
6.6
 */
public static Object CreateTempMediaFile (UIContext _uicontext,java.lang.String FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "CreateTempMediaFile", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
Sets a link between a MediaFile object which represents a file(s) on disk and an Airing object which
 represents metadata about the content. This is a way to link content information with media.

Parameters:
MediaFile- the MediaFile object to set the content information for
Airing- the Airing object that should be the content metadata pointer for this MediaFile
Returns:
true if the operation succeeded, false otherwise; this operation will fail if the Airing is already linked to another MediaFile
 */
public static boolean SetMediaFileAiring (Object MediaFile, Object Airing) {
  Object o = sagex.SageAPI.call("SetMediaFileAiring", new Object[] {MediaFile,Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Sets a link between a MediaFile object which represents a file(s) on disk and an Airing object which
 represents metadata about the content. This is a way to link content information with media.

Parameters:
MediaFile- the MediaFile object to set the content information for
Airing- the Airing object that should be the content metadata pointer for this MediaFile
Returns:
true if the operation succeeded, false otherwise; this operation will fail if the Airing is already linked to another MediaFile
 */
public static boolean SetMediaFileAiring (UIContext _uicontext,Object MediaFile, Object Airing) {
  Object o = sagex.SageAPI.call(_uicontext, "SetMediaFileAiring", new Object[] {MediaFile,Airing});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets a link between a MediaFile object which represents a file(s) on disk and a Show object which
 represents metadata about the content. This is a way to link content information with media.
 This will create a new Airing representing this Show and add it to the database. Then that new Airing is
 linked with this MediaFile (just like it is inSetMediaFileAiring()


Parameters:
MediaFile- the MediaFile object to set the content information for
Show- the Show object that should be the content information for this MediaFile
Returns:
true if the operation succeeded, false otherwise; this operation will fail only if one of the arguments is null
 */
public static boolean SetMediaFileShow (Object MediaFile, Object Show) {
  Object o = sagex.SageAPI.call("SetMediaFileShow", new Object[] {MediaFile,Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Sets a link between a MediaFile object which represents a file(s) on disk and a Show object which
 represents metadata about the content. This is a way to link content information with media.
 This will create a new Airing representing this Show and add it to the database. Then that new Airing is
 linked with this MediaFile (just like it is inSetMediaFileAiring()


Parameters:
MediaFile- the MediaFile object to set the content information for
Show- the Show object that should be the content information for this MediaFile
Returns:
true if the operation succeeded, false otherwise; this operation will fail only if one of the arguments is null
 */
public static boolean SetMediaFileShow (UIContext _uicontext,Object MediaFile, Object Show) {
  Object o = sagex.SageAPI.call(_uicontext, "SetMediaFileShow", new Object[] {MediaFile,Show});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the MediaFile from the database that corresponds to a specified file on disk

Parameters:
FilePath- the file path to find the corresponding MediaFile for
Returns:
the MediaFile for the corresponding file path, or null if there is no corresponding MediaFile
 */
public static Object GetMediaFileForFilePath (java.io.File FilePath) {
  Object o = sagex.SageAPI.call("GetMediaFileForFilePath", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the MediaFile from the database that corresponds to a specified file on disk

Parameters:
FilePath- the file path to find the corresponding MediaFile for
Returns:
the MediaFile for the corresponding file path, or null if there is no corresponding MediaFile
 */
public static Object GetMediaFileForFilePath (UIContext _uicontext,java.io.File FilePath) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileForFilePath", new Object[] {FilePath});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the specified MediaFile is local to this system (i.e. doesn't need to be streamed from a server)

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile is local to this system (i.e. doesn't need to be streamed from a server), false otherwise
 */
public static boolean IsLocalFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsLocalFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified MediaFile is local to this system (i.e. doesn't need to be streamed from a server)

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile is local to this system (i.e. doesn't need to be streamed from a server), false otherwise
 */
public static boolean IsLocalFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLocalFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified MediaFile has been either imported using a library path or if this is a television
 recording that has had the 'Move to Library' operation performed on it.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile has been either imported using a library path or if this is a television recording that has had the 'Move to Library' operation performed on it; false otherwise
 */
public static boolean IsLibraryFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsLibraryFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified MediaFile has been either imported using a library path or if this is a television
 recording that has had the 'Move to Library' operation performed on it.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified MediaFile has been either imported using a library path or if this is a television recording that has had the 'Move to Library' operation performed on it; false otherwise
 */
public static boolean IsLibraryFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsLibraryFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if SageTV considers this MediaFile a 'complete' recording. The rules behind this are somewhat complex,
 but the intended purpose is that a 'complete' recording is one that should be presented in the list of recordings to a user.

Parameters:
MediaFile- the MediaFile object
Returns:
true if SageTV considers this MediaFile a 'complete' recording
 */
public static boolean IsCompleteRecording (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsCompleteRecording", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if SageTV considers this MediaFile a 'complete' recording. The rules behind this are somewhat complex,
 but the intended purpose is that a 'complete' recording is one that should be presented in the list of recordings to a user.

Parameters:
MediaFile- the MediaFile object
Returns:
true if SageTV considers this MediaFile a 'complete' recording
 */
public static boolean IsCompleteRecording (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsCompleteRecording", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile represents DVD content. This can be either a DVD drive or a ripped DVD.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents DVD content, false otherwise
 */
public static boolean IsDVD (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsDVD", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile represents DVD content. This can be either a DVD drive or a ripped DVD.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents DVD content, false otherwise
 */
public static boolean IsDVD (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDVD", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile represents BluRay content.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents BluRay content, false otherwise
Since:
6.6
 */
public static boolean IsBluRay (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsBluRay", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile represents BluRay content.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents BluRay content, false otherwise
Since:
6.6
 */
public static boolean IsBluRay (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsBluRay", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile represents the physical DVD drive in the system. Use this MediaFile to playback DVDs from an optical drive.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents the physical DVD drive in the system, false otherwise
 */
public static boolean IsDVDDrive (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsDVDDrive", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile represents the physical DVD drive in the system. Use this MediaFile to playback DVDs from an optical drive.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents the physical DVD drive in the system, false otherwise
 */
public static boolean IsDVDDrive (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDVDDrive", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile's content is audio only.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content is audio only, false otherwise
 */
public static boolean IsMusicFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsMusicFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile's content is audio only.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content is audio only, false otherwise
 */
public static boolean IsMusicFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMusicFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile's content is an audio/video or video file (this will be false for DVD/BluRay content)

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content is an audio/video or video file (this will be false for DVD/BluRay content), false otherwise
 */
public static boolean IsVideoFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsVideoFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile's content is an audio/video or video file (this will be false for DVD/BluRay content)

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content is an audio/video or video file (this will be false for DVD/BluRay content), false otherwise
 */
public static boolean IsVideoFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsVideoFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile's content represents a picture file

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content represents a picture file, false otherwise
 */
public static boolean IsPictureFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsPictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile's content represents a picture file

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile's content represents a picture file, false otherwise
 */
public static boolean IsPictureFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsPictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile represents recorded television content

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents recorded television content, false otherwise
 */
public static boolean IsTVFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsTVFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile represents recorded television content

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile represents recorded television content, false otherwise
 */
public static boolean IsTVFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsTVFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the list of files that make up the specified MediaFile object. A MediaFile object can represent more than
 one physical file on disk. This occurs when a recording of a television show is not contiguous; this can happen for various
 reasons including the user changing the channel or restarting the system.

Parameters:
MediaFile- the MediaFile object
Returns:
the list of files that make up this MediaFile object
 */
public static java.io.File[] GetSegmentFiles (Object MediaFile) {
  return (java.io.File[]) sagex.SageAPI.call("GetSegmentFiles", new Object[] {MediaFile});
}

/**
 * UI Context Aware Call<br/>
Returns the list of files that make up the specified MediaFile object. A MediaFile object can represent more than
 one physical file on disk. This occurs when a recording of a television show is not contiguous; this can happen for various
 reasons including the user changing the channel or restarting the system.

Parameters:
MediaFile- the MediaFile object
Returns:
the list of files that make up this MediaFile object
 */
public static java.io.File[] GetSegmentFiles (UIContext _uicontext,Object MediaFile) {
  return (java.io.File[]) sagex.SageAPI.call(_uicontext, "GetSegmentFiles", new Object[] {MediaFile});
}

/**
Returns the title for the specified MediaFile object

Parameters:
MediaFile- the MediaFile object
Returns:
the title for the specified MediaFile object
 */
public static java.lang.String GetMediaTitle (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaTitle", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the title for the specified MediaFile object

Parameters:
MediaFile- the MediaFile object
Returns:
the title for the specified MediaFile object
 */
public static java.lang.String GetMediaTitle (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaTitle", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the path of this MediaFile object relative to the root of the import directory it is in.

Parameters:
MediaFile- the MediaFile object
Returns:
the path of this MediaFile object relative to the root of the import directory it is in
Since:
7.0
 */
public static java.lang.String GetMediaFileRelativePath (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileRelativePath", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the path of this MediaFile object relative to the root of the import directory it is in.

Parameters:
MediaFile- the MediaFile object
Returns:
the path of this MediaFile object relative to the root of the import directory it is in
Since:
7.0
 */
public static java.lang.String GetMediaFileRelativePath (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileRelativePath", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the directory that the files for this MediaFile are in.

Parameters:
MediaFile- the MediaFile object
Returns:
the directory that the files for this MediaFile are in
 */
public static java.io.File GetParentDirectory (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetParentDirectory", new Object[] {MediaFile});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the directory that the files for this MediaFile are in.

Parameters:
MediaFile- the MediaFile object
Returns:
the directory that the files for this MediaFile are in
 */
public static java.io.File GetParentDirectory (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetParentDirectory", new Object[] {MediaFile});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Gets the total size in bytes of the files on disk that represent this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the total size in bytes of the files on disk that represent this MediaFile
 */
public static long GetSize (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetSize", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the total size in bytes of the files on disk that represent this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the total size in bytes of the files on disk that represent this MediaFile
 */
public static long GetSize (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSize", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the MetaImage object which represents the picture file for this MediaFile. If the specified MediaFile
 is not a picture file, then null is returned

Parameters:
MediaFile- the MediaFile object
Returns:
the MetaImage object which represents the picture file for this MediaFile. If the specified MediaFile
           is not a picture file, then null is returned
 */
public static Object GetFullImage (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetFullImage", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the MetaImage object which represents the picture file for this MediaFile. If the specified MediaFile
 is not a picture file, then null is returned

Parameters:
MediaFile- the MediaFile object
Returns:
the MetaImage object which represents the picture file for this MediaFile. If the specified MediaFile
           is not a picture file, then null is returned
 */
public static Object GetFullImage (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFullImage", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
Generates a thumbnail for the specified MediaFile at the requested offset time in the file using the desired width  height.
 The resulting thumbnail will be saved to the specified file. This call DOES NOT need to be used for GetThumbnail to work properly; this
 API call is intended as an extra for developers who want additional thumbnails beyond the one that is normally auto-generated for MediaFiles.
 This API call will not return until the generation of the thumbnail is complete. If both width  height are zero, then the size will be determined
 automatically to match the aspect ratio of the video (the largest dimension will match what SageTV uses internally for thumbnail sizes). If only one
 of width or height is zero, then the other dimension will be determined automatically to match the aspect ratio of the video.

Parameters:
MediaFile- the MediaFile object, must be a Video file (no BluRays or DVDs)
Time- the offset time in seconds at which the thumbnail should be generated (relative to the start of the file), while fractional seconds are supported, accuracy cannot be guaranteed
Width- the width in pixels of the desired thumbnail
Height- the height in pixels of the desired thumbnail
File- the file path to save the thumbnail to
Returns:
true if the generation succeeded, false if it failed
Since:
7.1
 */
public static boolean GenerateThumbnail (Object MediaFile, float Time, int Width, int Height, java.io.File File) {
  Object o = sagex.SageAPI.call("GenerateThumbnail", new Object[] {MediaFile,Time,Width,Height,File});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Generates a thumbnail for the specified MediaFile at the requested offset time in the file using the desired width  height.
 The resulting thumbnail will be saved to the specified file. This call DOES NOT need to be used for GetThumbnail to work properly; this
 API call is intended as an extra for developers who want additional thumbnails beyond the one that is normally auto-generated for MediaFiles.
 This API call will not return until the generation of the thumbnail is complete. If both width  height are zero, then the size will be determined
 automatically to match the aspect ratio of the video (the largest dimension will match what SageTV uses internally for thumbnail sizes). If only one
 of width or height is zero, then the other dimension will be determined automatically to match the aspect ratio of the video.

Parameters:
MediaFile- the MediaFile object, must be a Video file (no BluRays or DVDs)
Time- the offset time in seconds at which the thumbnail should be generated (relative to the start of the file), while fractional seconds are supported, accuracy cannot be guaranteed
Width- the width in pixels of the desired thumbnail
Height- the height in pixels of the desired thumbnail
File- the file path to save the thumbnail to
Returns:
true if the generation succeeded, false if it failed
Since:
7.1
 */
public static boolean GenerateThumbnail (UIContext _uicontext,Object MediaFile, float Time, int Width, int Height, java.io.File File) {
  Object o = sagex.SageAPI.call(_uicontext, "GenerateThumbnail", new Object[] {MediaFile,Time,Width,Height,File});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the representative thumbnail image which should be used for iconic display of this MediaFile. For picture files,
 this will be a thumbnail image. For music files it will be the album art. For any other files it'll be the thumbnail for
 the file if one exists, otherwise it'll be the channel logo for the file. If none of those exist then null is returned.

Parameters:
MediaFile- the MediaFile object
Returns:
the representative thumbnail image which should be used for iconic display of this MediaFile
 */
public static Object GetThumbnail (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the representative thumbnail image which should be used for iconic display of this MediaFile. For picture files,
 this will be a thumbnail image. For music files it will be the album art. For any other files it'll be the thumbnail for
 the file if one exists, otherwise it'll be the channel logo for the file. If none of those exist then null is returned.

Parameters:
MediaFile- the MediaFile object
Returns:
the representative thumbnail image which should be used for iconic display of this MediaFile
 */
public static Object GetThumbnail (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
Checks whether the passed thumbnail for the specified MediaFile is loaded
 into system memory or into the VRAM cache of the corresponding UI making the call.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the thumbnail image for the specified MediaFile is loaded into system memory or the calling UI's VRAM, false otherwise
Since:
6.1
 */
public static boolean IsThumbnailLoaded (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsThumbnailLoaded", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Checks whether the passed thumbnail for the specified MediaFile is loaded
 into system memory or into the VRAM cache of the corresponding UI making the call.

Parameters:
MediaFile- the MediaFile object
Returns:
true if the thumbnail image for the specified MediaFile is loaded into system memory or the calling UI's VRAM, false otherwise
Since:
6.1
 */
public static boolean IsThumbnailLoaded (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsThumbnailLoaded", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile object has a thumbnail for it that is unique to the content itself. This is true
 for any music file with album art or any other MediaFile that has another file on disk which contains the representative thumbnail.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile object has a thumbnail for it that is unique to the content itself, false otherwise
 */
public static boolean HasSpecificThumbnail (Object MediaFile) {
  Object o = sagex.SageAPI.call("HasSpecificThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile object has a thumbnail for it that is unique to the content itself. This is true
 for any music file with album art or any other MediaFile that has another file on disk which contains the representative thumbnail.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile object has a thumbnail for it that is unique to the content itself, false otherwise
 */
public static boolean HasSpecificThumbnail (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "HasSpecificThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile object has a thumbnail representation of it. If this is true, thenGetThumbnail()
will not return null.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile object has a thumbnail representation of it, false otherwise
 */
public static boolean HasAnyThumbnail (Object MediaFile) {
  Object o = sagex.SageAPI.call("HasAnyThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile object has a thumbnail representation of it. If this is true, thenGetThumbnail()
will not return null.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile object has a thumbnail representation of it, false otherwise
 */
public static boolean HasAnyThumbnail (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "HasAnyThumbnail", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if this MediaFile is currently in the process of recording.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile is currently in the process of recording, false otherwise
 */
public static boolean IsFileCurrentlyRecording (Object MediaFile) {
  Object o = sagex.SageAPI.call("IsFileCurrentlyRecording", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if this MediaFile is currently in the process of recording.

Parameters:
MediaFile- the MediaFile object
Returns:
true if this MediaFile is currently in the process of recording, false otherwise
 */
public static boolean IsFileCurrentlyRecording (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "IsFileCurrentlyRecording", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Deletes the files that correspond to this MediaFile from disk and also deletes the MediaFile object from the database.
 NOTE: This actually delete the files from the disk.
 This has a slightly different effect on Intelligent Recording versus theDeleteFileWithoutPrejudice()


Parameters:
MediaFile- the MediaFile object to delete
Returns:
true if the deletion succeeded, false otherwise. A deletion can fail because the file is currently being recorded or watched or because the native filesystem is unable to delete the file.
 */
public static boolean DeleteFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("DeleteFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Deletes the files that correspond to this MediaFile from disk and also deletes the MediaFile object from the database.
 NOTE: This actually delete the files from the disk.
 This has a slightly different effect on Intelligent Recording versus theDeleteFileWithoutPrejudice()


Parameters:
MediaFile- the MediaFile object to delete
Returns:
true if the deletion succeeded, false otherwise. A deletion can fail because the file is currently being recorded or watched or because the native filesystem is unable to delete the file.
 */
public static boolean DeleteFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "DeleteFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Deletes the files that correspond to this MediaFile from disk and also deletes the MediaFile object from the database.
 NOTE: This actually delete the files from the disk.
 This has a slightly different effect on Intelligent Recording versusDeleteFile()
. DeleteFileWithoutPrejudice should
 be used when the file was incorrectly recorded or in other cases where this deletion decision should have no effect on intelligent recording.

Parameters:
MediaFile- the MediaFile object to delete
Returns:
true if the deletion succeeded, false otherwise. A deletion can fail because the file is currently being recorded or watched or because the native filesystem is unable to delete the file.
 */
public static boolean DeleteFileWithoutPrejudice (Object MediaFile) {
  Object o = sagex.SageAPI.call("DeleteFileWithoutPrejudice", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Deletes the files that correspond to this MediaFile from disk and also deletes the MediaFile object from the database.
 NOTE: This actually delete the files from the disk.
 This has a slightly different effect on Intelligent Recording versusDeleteFile()
. DeleteFileWithoutPrejudice should
 be used when the file was incorrectly recorded or in other cases where this deletion decision should have no effect on intelligent recording.

Parameters:
MediaFile- the MediaFile object to delete
Returns:
true if the deletion succeeded, false otherwise. A deletion can fail because the file is currently being recorded or watched or because the native filesystem is unable to delete the file.
 */
public static boolean DeleteFileWithoutPrejudice (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "DeleteFileWithoutPrejudice", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the total duration of the content in this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the total duration in milliseconds of the content in the specified MediaFile
 */
public static long GetFileDuration (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetFileDuration", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the total duration of the content in this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the total duration in milliseconds of the content in the specified MediaFile
 */
public static long GetFileDuration (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileDuration", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the starting time for the content in ths specified MediaFile. This corresponds to when the file's recording started or the
 timestamp on the file itself. See java.lang.System.currentTimeMillis() for information on the time units.

Parameters:
MediaFile- the MediaFile object
Returns:
the starting time for the content in the specified MediaFile
 */
public static long GetFileStartTime (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetFileStartTime", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the starting time for the content in ths specified MediaFile. This corresponds to when the file's recording started or the
 timestamp on the file itself. See java.lang.System.currentTimeMillis() for information on the time units.

Parameters:
MediaFile- the MediaFile object
Returns:
the starting time for the content in the specified MediaFile
 */
public static long GetFileStartTime (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileStartTime", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns the ending time for the content in ths specified MediaFile. This corresponds to when the file's recording ended or the
 timestamp on the file itself plus the file's duration. See java.lang.System.currentTimeMillis() for information on the time units.

Parameters:
MediaFile- the MediaFile object
Returns:
the ending time for the content in the specified MediaFile
 */
public static long GetFileEndTime (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetFileEndTime", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the ending time for the content in ths specified MediaFile. This corresponds to when the file's recording ended or the
 timestamp on the file itself plus the file's duration. See java.lang.System.currentTimeMillis() for information on the time units.

Parameters:
MediaFile- the MediaFile object
Returns:
the ending time for the content in the specified MediaFile
 */
public static long GetFileEndTime (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileEndTime", new Object[] {MediaFile});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Downloads the specified MediaFile from the SageTV server and saves it as the specified LocalFile. This call should
 only be made by SageTV Client.

Parameters:
MediaFile- the MediaFile object to download a copy of
LocalFile- the destination file to store the MediaFile as on the local filesystem
 */
public static void CopyToLocalFile (Object MediaFile, java.io.File LocalFile) {
   sagex.SageAPI.call("CopyToLocalFile", new Object[] {MediaFile,LocalFile});
}

/**
 * UI Context Aware Call<br/>
Downloads the specified MediaFile from the SageTV server and saves it as the specified LocalFile. This call should
 only be made by SageTV Client.

Parameters:
MediaFile- the MediaFile object to download a copy of
LocalFile- the destination file to store the MediaFile as on the local filesystem
 */
public static void CopyToLocalFile (UIContext _uicontext,Object MediaFile, java.io.File LocalFile) {
   sagex.SageAPI.call(_uicontext, "CopyToLocalFile", new Object[] {MediaFile,LocalFile});
}

/**
Returns the duration in milliseconds for the specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the duration of
Returns:
the duration in milliseconds for the specified segment number in this MediaFile
 */
public static long GetDurationForSegment (Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call("GetDurationForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the duration in milliseconds for the specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the duration of
Returns:
the duration in milliseconds for the specified segment number in this MediaFile
 */
public static long GetDurationForSegment (UIContext _uicontext,Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDurationForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the ending time for a specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the end time of
Returns:
the ending time for a specified segment number in this MediaFile
 */
public static long GetEndForSegment (Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call("GetEndForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the ending time for a specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the end time of
Returns:
the ending time for a specified segment number in this MediaFile
 */
public static long GetEndForSegment (UIContext _uicontext,Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "GetEndForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the starting time for a specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the start time of
Returns:
the starting time for a specified segment number in this MediaFile
 */
public static long GetStartForSegment (Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call("GetStartForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Gets the starting time for a specified segment number in this MediaFile.

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the start time of
Returns:
the starting time for a specified segment number in this MediaFile
 */
public static long GetStartForSegment (UIContext _uicontext,Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "GetStartForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Gets the file that represents the specified segment number in this MediaFile

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the file for
Returns:
the file that represents the specified segment number in this MediaFile
 */
public static java.io.File GetFileForSegment (Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call("GetFileForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the file that represents the specified segment number in this MediaFile

Parameters:
MediaFile- the MediaFile object
SegmentNumber- the 0-based segment number to get the file for
Returns:
the file that represents the specified segment number in this MediaFile
 */
public static java.io.File GetFileForSegment (UIContext _uicontext,Object MediaFile, int SegmentNumber) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFileForSegment", new Object[] {MediaFile,SegmentNumber});
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns the number of segments in ths specified MediaFile. Each segment corresponds to a different physical file on disk.

Parameters:
MediaFile- the MediaFile object
Returns:
the number of segments in ths specified MediaFile
 */
public static int GetNumberOfSegments (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetNumberOfSegments", new Object[] {MediaFile});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the number of segments in ths specified MediaFile. Each segment corresponds to a different physical file on disk.

Parameters:
MediaFile- the MediaFile object
Returns:
the number of segments in ths specified MediaFile
 */
public static int GetNumberOfSegments (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNumberOfSegments", new Object[] {MediaFile});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns a list of all of the start times of the segments in the specified MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
a list of all of the start times of the segments in the specified MediaFile
 */
public static long[][] GetStartTimesForSegments (Object MediaFile) {
  return (long[][]) sagex.SageAPI.call("GetStartTimesForSegments", new Object[] {MediaFile});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the start times of the segments in the specified MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
a list of all of the start times of the segments in the specified MediaFile
 */
public static long[][] GetStartTimesForSegments (UIContext _uicontext,Object MediaFile) {
  return (long[][]) sagex.SageAPI.call(_uicontext, "GetStartTimesForSegments", new Object[] {MediaFile});
}

/**
Marks a MediaFile object as being 'Moved to Library' which means theIsLibraryFile()
call will
 now return true. This can be used to help organize the recorded television files.

Parameters:
MediaFile- the MediaFile ojbect
 */
public static void MoveFileToLibrary (Object MediaFile) {
   sagex.SageAPI.call("MoveFileToLibrary", new Object[] {MediaFile});
}

/**
 * UI Context Aware Call<br/>
Marks a MediaFile object as being 'Moved to Library' which means theIsLibraryFile()
call will
 now return true. This can be used to help organize the recorded television files.

Parameters:
MediaFile- the MediaFile ojbect
 */
public static void MoveFileToLibrary (UIContext _uicontext,Object MediaFile) {
   sagex.SageAPI.call(_uicontext, "MoveFileToLibrary", new Object[] {MediaFile});
}

/**
Un-marks a MediaFile object as being 'Moved to Library' which means theIsLibraryFile()
call will
 no longer return true. This can only be used on recorded television files and has the opposite effect ofMoveFileToLibrary()


Parameters:
MediaFile- the MediaFile ojbect
 */
public static void MoveTVFileOutOfLibrary (Object MediaFile) {
   sagex.SageAPI.call("MoveTVFileOutOfLibrary", new Object[] {MediaFile});
}

/**
 * UI Context Aware Call<br/>
Un-marks a MediaFile object as being 'Moved to Library' which means theIsLibraryFile()
call will
 no longer return true. This can only be used on recorded television files and has the opposite effect ofMoveFileToLibrary()


Parameters:
MediaFile- the MediaFile ojbect
 */
public static void MoveTVFileOutOfLibrary (UIContext _uicontext,Object MediaFile) {
   sagex.SageAPI.call(_uicontext, "MoveTVFileOutOfLibrary", new Object[] {MediaFile});
}

/**
Returns true if the specified object is a MediaFile object. No automatic type conversion will be performed on the argument.
 This will return false if the argument is a MediaFile object, BUT that object no longer exists in the SageTV database.

Parameters:
Object- the object to test to see if it is a MediaFile object
Returns:
true if the argument is a MediaFile object, false otherwise
 */
public static boolean IsMediaFileObject (java.lang.Object Object) {
  Object o = sagex.SageAPI.call("IsMediaFileObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified object is a MediaFile object. No automatic type conversion will be performed on the argument.
 This will return false if the argument is a MediaFile object, BUT that object no longer exists in the SageTV database.

Parameters:
Object- the object to test to see if it is a MediaFile object
Returns:
true if the argument is a MediaFile object, false otherwise
 */
public static boolean IsMediaFileObject (UIContext _uicontext,java.lang.Object Object) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMediaFileObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets the Album object that corresponds to this MediaFile. This only returns a useful object if the argument is a music file.

Parameters:
MediaFile- the MediaFile object
Returns:
the Album object that corresponds to this MediaFile
 */
public static Object GetAlbumForFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetAlbumForFile", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the Album object that corresponds to this MediaFile. This only returns a useful object if the argument is a music file.

Parameters:
MediaFile- the MediaFile object
Returns:
the Album object that corresponds to this MediaFile
 */
public static Object GetAlbumForFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAlbumForFile", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets the encoding that was used to record this file. This will only return something useful for recorded television files.

Parameters:
MediaFile- the MediaFile object
Returns:
the encoding that was used to record this file
 */
public static java.lang.String GetMediaFileEncoding (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileEncoding", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the encoding that was used to record this file. This will only return something useful for recorded television files.

Parameters:
MediaFile- the MediaFile object
Returns:
the encoding that was used to record this file
 */
public static java.lang.String GetMediaFileEncoding (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileEncoding", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Gets the Airing object that represents the content metadata for this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the Airing object that represents the content metadata for this MediaFile
 */
public static Object GetMediaFileAiring (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileAiring", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Gets the Airing object that represents the content metadata for this MediaFile

Parameters:
MediaFile- the MediaFile object
Returns:
the Airing object that represents the content metadata for this MediaFile
 */
public static Object GetMediaFileAiring (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileAiring", new Object[] {MediaFile});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the unique ID used to identify this MediaFile. Can get used later on a call toGetMediaFileForID()


Parameters:
MediaFile- the MediaFileobject
Returns:
the unique ID used to identify this MediaFile
 */
public static int GetMediaFileID (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileID", new Object[] {MediaFile});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br/>
Returns the unique ID used to identify this MediaFile. Can get used later on a call toGetMediaFileForID()


Parameters:
MediaFile- the MediaFileobject
Returns:
the unique ID used to identify this MediaFile
 */
public static int GetMediaFileID (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileID", new Object[] {MediaFile});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the MediaFile object that corresponds to the passed in ID. The ID should have been obtained from a call toGetMediaFileID()


Parameters:
id- the id of the MediaFile object to get
Returns:
the MediaFile object that corresponds to the passed in ID
 */
public static Object GetMediaFileForID (int id) {
  Object o = sagex.SageAPI.call("GetMediaFileForID", new Object[] {id});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns the MediaFile object that corresponds to the passed in ID. The ID should have been obtained from a call toGetMediaFileID()


Parameters:
id- the id of the MediaFile object to get
Returns:
the MediaFile object that corresponds to the passed in ID
 */
public static Object GetMediaFileForID (UIContext _uicontext,int id) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileForID", new Object[] {id});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a string that provides a description of this MediaFile's format, i.e. MPEG2-PS[MPEG2-Video/2.0Mbps 4:3 480i@30fps, MP2/192kbps@48kHz]

Parameters:
MediaFile- the MediaFile object
Returns:
a string that provides a description of this MediaFile's format
Since:
5.1
 */
public static java.lang.String GetMediaFileFormatDescription (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileFormatDescription", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a string that provides a description of this MediaFile's format, i.e. MPEG2-PS[MPEG2-Video/2.0Mbps 4:3 480i@30fps, MP2/192kbps@48kHz]

Parameters:
MediaFile- the MediaFile object
Returns:
a string that provides a description of this MediaFile's format
Since:
5.1
 */
public static java.lang.String GetMediaFileFormatDescription (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileFormatDescription", new Object[] {MediaFile});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a string for the corresponding metadata property in the MediaFile's format. These are set during format detection/import.
 Names set in the property "custom_metadata_properties" (which is a semicolon/comma delimited list) will be available; as well
 as all standard SageTV metadata fields and details on format information.
 These include Title, Description, EpisodeName, Track, Duration, Genre, Language, RunningTime,
 Rated, ParentalRating, PartNumber, TotalParts, HDTV, CC, Stereo, SAP, Subtitled, 3D, DD5.1, Dolby, Letterbox, Live, New, Widescreen, Surround,
 Dubbed, Taped, Premiere, SeasonPremiere, SeriesPremiere, ChannelPremiere, SeasonFinale, SeriesFinale,  SeasonNumber, EpisodeNumber,
 ExternalID, Album, Year, OriginalAirDate, ExtendedRatings, Misc, All "Role" Names, Format.Video.Codec,
 Format.Video.Resolution, Format.Video.Aspect, Format.Video.Bitrate, Format.Video.Width, Format.Video.Height, Format.Video.FPS,
 Format.Video.Interlaced, Format.Video.Progressive, Format.Video.Index, Format.Video.ID, Format.Audio.NumStreams, Format.Audio[.#].Codec, Format.Audio[.#].Channels,
 Format.Audio[.#].Language, Format.Audio[.#].SampleRate, Format.Audio[.#].BitsPerSample, Format.Audio[.#].Index, Format.Audio[.#].ID, Format.Subtitle.NumStreams,
 Format.Subtitle[.#].Codec, Format.Subtitle[.#].Language, Format.Subtitle[.#].Index, Format.Subtitle[.#].ID, Format.Container and Picture.Resolution

Parameters:
MediaFile- the MediaFile object
Name- the name of the property to get
Returns:
a string corresponding to the metadata property value, or the emptry string if it is undefined
Since:
6.6
 */
public static java.lang.String GetMediaFileMetadata (Object MediaFile, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetMediaFileMetadata", new Object[] {MediaFile,Name});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a string for the corresponding metadata property in the MediaFile's format. These are set during format detection/import.
 Names set in the property "custom_metadata_properties" (which is a semicolon/comma delimited list) will be available; as well
 as all standard SageTV metadata fields and details on format information.
 These include Title, Description, EpisodeName, Track, Duration, Genre, Language, RunningTime,
 Rated, ParentalRating, PartNumber, TotalParts, HDTV, CC, Stereo, SAP, Subtitled, 3D, DD5.1, Dolby, Letterbox, Live, New, Widescreen, Surround,
 Dubbed, Taped, Premiere, SeasonPremiere, SeriesPremiere, ChannelPremiere, SeasonFinale, SeriesFinale,  SeasonNumber, EpisodeNumber,
 ExternalID, Album, Year, OriginalAirDate, ExtendedRatings, Misc, All "Role" Names, Format.Video.Codec,
 Format.Video.Resolution, Format.Video.Aspect, Format.Video.Bitrate, Format.Video.Width, Format.Video.Height, Format.Video.FPS,
 Format.Video.Interlaced, Format.Video.Progressive, Format.Video.Index, Format.Video.ID, Format.Audio.NumStreams, Format.Audio[.#].Codec, Format.Audio[.#].Channels,
 Format.Audio[.#].Language, Format.Audio[.#].SampleRate, Format.Audio[.#].BitsPerSample, Format.Audio[.#].Index, Format.Audio[.#].ID, Format.Subtitle.NumStreams,
 Format.Subtitle[.#].Codec, Format.Subtitle[.#].Language, Format.Subtitle[.#].Index, Format.Subtitle[.#].ID, Format.Container and Picture.Resolution

Parameters:
MediaFile- the MediaFile object
Name- the name of the property to get
Returns:
a string corresponding to the metadata property value, or the emptry string if it is undefined
Since:
6.6
 */
public static java.lang.String GetMediaFileMetadata (UIContext _uicontext,Object MediaFile, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileMetadata", new Object[] {MediaFile,Name});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a java.util.Properties object that contains all of the metadata properties for a MediaFile object.
 This will only include properties that can be modified (i.e. no format information is included). These properties will include all
 the standard database fields, as well as any custom metadata properties that were set for this MediaFile object.
 SeeSetMediaFileMetadata()
andGetMediaFileMetadata()
for more details on those properties.

Parameters:
MediaFile- the MediaFile object
Returns:
a java.util.Properties object with all the metadata properties for this MediaFile, this is a copy and is safe to modify
Since:
7.1
 */
public static java.util.Properties GetMediaFileMetadataProperties (Object MediaFile) {
  Object o = sagex.SageAPI.call("GetMediaFileMetadataProperties", new Object[] {MediaFile});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a java.util.Properties object that contains all of the metadata properties for a MediaFile object.
 This will only include properties that can be modified (i.e. no format information is included). These properties will include all
 the standard database fields, as well as any custom metadata properties that were set for this MediaFile object.
 SeeSetMediaFileMetadata()
andGetMediaFileMetadata()
for more details on those properties.

Parameters:
MediaFile- the MediaFile object
Returns:
a java.util.Properties object with all the metadata properties for this MediaFile, this is a copy and is safe to modify
Since:
7.1
 */
public static java.util.Properties GetMediaFileMetadataProperties (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFileMetadataProperties", new Object[] {MediaFile});
  if (o!=null) return (java.util.Properties) o;
  return null;
}

/**
Sets the corresponding metadata property in the MediaFile's format. These are set in the database and are also exported
 to the corresponding .properties file for that MediaFile. When it exports it will append these updates to the .properties file.
 It will also update the property "custom_metadata_properties" (which is a semicolon/comma delimited list) which tracks the extra
 metadata properties that should be retained. Usage of any of the following names will update the corresponding Airing/Show object
 for the MediaFile as well: Title, Description, EpisodeName, Track, Duration, Genre, Language, RunningTime,
 Rated, ParentalRating, PartNumber, TotalParts, HDTV, CC, Stereo, SAP, Subtitled, 3D, DD5.1, Dolby, Letterbox, Live, New,
 Widescreen, Surround, Dubbed, Taped, SeasonNumber, EpisodeNumber Premiere, SeasonPremiere, SeriesPremiere, ChannelPremiere,
 SeasonFinale, SeriesFinale, ExternalID, Album, Year, OriginalAirDate, ExtendedRatings, Misc and All "Role" Names

Parameters:
MediaFile- the MediaFile object
Name- the name of the property to set
Value- the value of the property to set
Since:
6.6
 */
public static void SetMediaFileMetadata (Object MediaFile, java.lang.String Name, java.lang.String Value) {
   sagex.SageAPI.call("SetMediaFileMetadata", new Object[] {MediaFile,Name,Value});
}

/**
 * UI Context Aware Call<br/>
Sets the corresponding metadata property in the MediaFile's format. These are set in the database and are also exported
 to the corresponding .properties file for that MediaFile. When it exports it will append these updates to the .properties file.
 It will also update the property "custom_metadata_properties" (which is a semicolon/comma delimited list) which tracks the extra
 metadata properties that should be retained. Usage of any of the following names will update the corresponding Airing/Show object
 for the MediaFile as well: Title, Description, EpisodeName, Track, Duration, Genre, Language, RunningTime,
 Rated, ParentalRating, PartNumber, TotalParts, HDTV, CC, Stereo, SAP, Subtitled, 3D, DD5.1, Dolby, Letterbox, Live, New,
 Widescreen, Surround, Dubbed, Taped, SeasonNumber, EpisodeNumber Premiere, SeasonPremiere, SeriesPremiere, ChannelPremiere,
 SeasonFinale, SeriesFinale, ExternalID, Album, Year, OriginalAirDate, ExtendedRatings, Misc and All "Role" Names

Parameters:
MediaFile- the MediaFile object
Name- the name of the property to set
Value- the value of the property to set
Since:
6.6
 */
public static void SetMediaFileMetadata (UIContext _uicontext,Object MediaFile, java.lang.String Name, java.lang.String Value) {
   sagex.SageAPI.call(_uicontext, "SetMediaFileMetadata", new Object[] {MediaFile,Name,Value});
}

/**
Performs a lossless rotation of the specified JPEG picture file (90, 180 or 270 degrees). This will modify the file that is
 stored on disk.

Parameters:
MediaFile- the MediaFile object
Degrees- the number of degress to rotate the picture in the clockwise direction, can be a positive or negative value and must be a multiple of 90
Returns:
true if the rotation was successful, false otherwise
Since:
5.1
 */
public static boolean RotatePictureFile (Object MediaFile, int Degrees) {
  Object o = sagex.SageAPI.call("RotatePictureFile", new Object[] {MediaFile,Degrees});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Performs a lossless rotation of the specified JPEG picture file (90, 180 or 270 degrees). This will modify the file that is
 stored on disk.

Parameters:
MediaFile- the MediaFile object
Degrees- the number of degress to rotate the picture in the clockwise direction, can be a positive or negative value and must be a multiple of 90
Returns:
true if the rotation was successful, false otherwise
Since:
5.1
 */
public static boolean RotatePictureFile (UIContext _uicontext,Object MediaFile, int Degrees) {
  Object o = sagex.SageAPI.call(_uicontext, "RotatePictureFile", new Object[] {MediaFile,Degrees});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Performs a lossless flip of the specified JPEG picture file. This will modify the file that is
 stored on disk.

Parameters:
MediaFile- the MediaFile object
Horizontal- true if it should be flipped horizontally (i.e. around a vertical axis), false if it should be flipped vertically (i.e. around a horizontal axis)
Returns:
true if the flip was successful, false otherwise
Since:
5.1
 */
public static boolean FlipPictureFile (Object MediaFile, boolean Horizontal) {
  Object o = sagex.SageAPI.call("FlipPictureFile", new Object[] {MediaFile,Horizontal});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Performs a lossless flip of the specified JPEG picture file. This will modify the file that is
 stored on disk.

Parameters:
MediaFile- the MediaFile object
Horizontal- true if it should be flipped horizontally (i.e. around a vertical axis), false if it should be flipped vertically (i.e. around a horizontal axis)
Returns:
true if the flip was successful, false otherwise
Since:
5.1
 */
public static boolean FlipPictureFile (UIContext _uicontext,Object MediaFile, boolean Horizontal) {
  Object o = sagex.SageAPI.call(_uicontext, "FlipPictureFile", new Object[] {MediaFile,Horizontal});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified picture file can be autorotated and is currently not in that autorotated position

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified picture file can be autorotated and is currently not in that autorotated position
Since:
6.4
 */
public static boolean CanAutorotatePictureFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("CanAutorotatePictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the specified picture file can be autorotated and is currently not in that autorotated position

Parameters:
MediaFile- the MediaFile object
Returns:
true if the specified picture file can be autorotated and is currently not in that autorotated position
Since:
6.4
 */
public static boolean CanAutorotatePictureFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "CanAutorotatePictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Automatically rotates the specified picture file according to the orientation set in the EXIF data.

Parameters:
MediaFile- the MediaFile object that represents the picture
Returns:
true if the automatic rotation succeeded, false otherwise
Since:
6.4
 */
public static boolean AutorotatePictureFile (Object MediaFile) {
  Object o = sagex.SageAPI.call("AutorotatePictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Automatically rotates the specified picture file according to the orientation set in the EXIF data.

Parameters:
MediaFile- the MediaFile object that represents the picture
Returns:
true if the automatic rotation succeeded, false otherwise
Since:
6.4
 */
public static boolean AutorotatePictureFile (UIContext _uicontext,Object MediaFile) {
  Object o = sagex.SageAPI.call(_uicontext, "AutorotatePictureFile", new Object[] {MediaFile});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Regenerates the thumbnail associated with the specified picture file. Sometimes the rotation may be mis-aligned from
 the thumbnail and this allows a way to repair that.

Parameters:
MediaFile- the MediaFile object
Since:
6.4
 */
public static void RegeneratePictureThumbnail (Object MediaFile) {
   sagex.SageAPI.call("RegeneratePictureThumbnail", new Object[] {MediaFile});
}

/**
 * UI Context Aware Call<br/>
Regenerates the thumbnail associated with the specified picture file. Sometimes the rotation may be mis-aligned from
 the thumbnail and this allows a way to repair that.

Parameters:
MediaFile- the MediaFile object
Since:
6.4
 */
public static void RegeneratePictureThumbnail (UIContext _uicontext,Object MediaFile) {
   sagex.SageAPI.call(_uicontext, "RegeneratePictureThumbnail", new Object[] {MediaFile});
}

}
