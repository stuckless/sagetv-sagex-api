package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaFileAPIFactory.html'>MediaFileAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class MediaFileAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetMediaFiles")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetMediaFiles", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetMediaFiles", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetMediaFiles")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetMediaFiles", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetMediaFiles", parameters, java.lang.String.class);
      }
   }
   if (command.equals("AddMediaFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddMediaFile",parameters,java.io.File.class,java.lang.String.class);
   }
   if (command.equals("CreateTempMediaFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateTempMediaFile",parameters,java.lang.String.class);
   }
   if (command.equals("SetMediaFileAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetMediaFileAiring",parameters,Object.class,Object.class);
   }
   if (command.equals("SetMediaFileShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetMediaFileShow",parameters,Object.class,Object.class);
   }
   if (command.equals("GetMediaFileForFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileForFilePath",parameters,java.io.File.class);
   }
   if (command.equals("IsLocalFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLocalFile",parameters,Object.class);
   }
   if (command.equals("IsLibraryFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLibraryFile",parameters,Object.class);
   }
   if (command.equals("IsCompleteRecording")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCompleteRecording",parameters,Object.class);
   }
   if (command.equals("IsDVD")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDVD",parameters,Object.class);
   }
   if (command.equals("IsBluRay")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsBluRay",parameters,Object.class);
   }
   if (command.equals("IsDVDDrive")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDVDDrive",parameters,Object.class);
   }
   if (command.equals("IsMusicFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMusicFile",parameters,Object.class);
   }
   if (command.equals("IsVideoFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsVideoFile",parameters,Object.class);
   }
   if (command.equals("IsPictureFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPictureFile",parameters,Object.class);
   }
   if (command.equals("IsTVFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsTVFile",parameters,Object.class);
   }
   if (command.equals("GetSegmentFiles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSegmentFiles",parameters,Object.class);
   }
   if (command.equals("GetMediaTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaTitle",parameters,Object.class);
   }
   if (command.equals("GetMediaFileRelativePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileRelativePath",parameters,Object.class);
   }
   if (command.equals("GetParentDirectory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetParentDirectory",parameters,Object.class);
   }
   if (command.equals("GetSize")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSize",parameters,Object.class);
   }
   if (command.equals("GetFullImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFullImage",parameters,Object.class);
   }
   if (command.equals("GenerateThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GenerateThumbnail",parameters,Object.class,float.class,int.class,int.class,java.io.File.class);
   }
   if (command.equals("GetThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetThumbnail",parameters,Object.class);
   }
   if (command.equals("IsThumbnailLoaded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsThumbnailLoaded",parameters,Object.class);
   }
   if (command.equals("HasSpecificThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasSpecificThumbnail",parameters,Object.class);
   }
   if (command.equals("HasAnyThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasAnyThumbnail",parameters,Object.class);
   }
   if (command.equals("IsFileCurrentlyRecording")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFileCurrentlyRecording",parameters,Object.class);
   }
   if (command.equals("DeleteFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteFile",parameters,Object.class);
   }
   if (command.equals("DeleteFileWithoutPrejudice")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteFileWithoutPrejudice",parameters,Object.class);
   }
   if (command.equals("GetFileDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileDuration",parameters,Object.class);
   }
   if (command.equals("GetFileStartTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileStartTime",parameters,Object.class);
   }
   if (command.equals("GetFileEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileEndTime",parameters,Object.class);
   }
   if (command.equals("CopyToLocalFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CopyToLocalFile",parameters,Object.class,java.io.File.class);
   }
   if (command.equals("GetDurationForSegment")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDurationForSegment",parameters,Object.class,int.class);
   }
   if (command.equals("GetEndForSegment")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEndForSegment",parameters,Object.class,int.class);
   }
   if (command.equals("GetStartForSegment")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetStartForSegment",parameters,Object.class,int.class);
   }
   if (command.equals("GetFileForSegment")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileForSegment",parameters,Object.class,int.class);
   }
   if (command.equals("GetNumberOfSegments")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNumberOfSegments",parameters,Object.class);
   }
   if (command.equals("GetStartTimesForSegments")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetStartTimesForSegments",parameters,Object.class);
   }
   if (command.equals("MoveFileToLibrary")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"MoveFileToLibrary",parameters,Object.class);
   }
   if (command.equals("MoveTVFileOutOfLibrary")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"MoveTVFileOutOfLibrary",parameters,Object.class);
   }
   if (command.equals("IsMediaFileObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMediaFileObject",parameters,java.lang.Object.class);
   }
   if (command.equals("GetAlbumForFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumForFile",parameters,Object.class);
   }
   if (command.equals("GetMediaFileEncoding")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileEncoding",parameters,Object.class);
   }
   if (command.equals("GetMediaFileAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileAiring",parameters,Object.class);
   }
   if (command.equals("GetMediaFileID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileID",parameters,Object.class);
   }
   if (command.equals("GetMediaFileForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileForID",parameters,int.class);
   }
   if (command.equals("GetMediaFileFormatDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileFormatDescription",parameters,Object.class);
   }
   if (command.equals("GetMediaFileMetadata")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileMetadata",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetMediaFileMetadataProperties")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileMetadataProperties",parameters,Object.class);
   }
   if (command.equals("SetMediaFileMetadata")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetMediaFileMetadata",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("RotatePictureFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RotatePictureFile",parameters,Object.class,int.class);
   }
   if (command.equals("FlipPictureFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FlipPictureFile",parameters,Object.class,boolean.class);
   }
   if (command.equals("CanAutorotatePictureFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CanAutorotatePictureFile",parameters,Object.class);
   }
   if (command.equals("AutorotatePictureFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AutorotatePictureFile",parameters,Object.class);
   }
   if (command.equals("RegeneratePictureThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RegeneratePictureThumbnail",parameters,Object.class);
   }
   throw new RuntimeException("Invalid MediaFileAPIFactory Command: "+command);
   }


}
