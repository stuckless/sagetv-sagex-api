package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 5:40 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/UtilityFactory.html'>UtilityFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class UtilityFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetSubgroup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSubgroup",parameters,java.util.Map.class,java.lang.Object.class);
   }
   if (command.equals("Keystroke")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Keystroke",parameters,java.lang.String.class,boolean.class);
   }
   if (command.equals("Size")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Size",parameters,java.lang.Object.class);
   }
   if (command.equals("IsEmpty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsEmpty",parameters,java.lang.Object.class);
   }
   if (command.equals("DateFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DateFormat",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("NumberFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"NumberFormat",parameters,java.lang.String.class,float.class);
   }
   if (command.equals("DurFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DurFormat",parameters,java.lang.String.class,long.class);
   }
   if (command.equals("CreateTimeSpan")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateTimeSpan",parameters,long.class,long.class);
   }
   if (command.equals("GetElement")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetElement",parameters,java.lang.Object.class,int.class);
   }
   if (command.equals("SetElement")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetElement",parameters,java.lang.Object.class,int.class,java.lang.Object.class);
   }
   if (command.equals("RemoveElementAtIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveElementAtIndex",parameters,java.util.List.class,int.class);
   }
   if (command.equals("RemoveElement")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveElement",parameters,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("AddElement")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddElement",parameters,java.util.Collection.class,java.lang.Object.class);
   }
   if (command.equals("FindElementIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FindElementIndex",parameters,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("FindComparativeElement")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FindComparativeElement",parameters,java.lang.Object.class,java.lang.Comparable.class,java.lang.String.class);
   }
   if (command.equals("Substring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Substring",parameters,java.lang.String.class,int.class,int.class);
   }
   if (command.equals("SubstringBegin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SubstringBegin",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("Round")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Round",parameters,java.lang.Object.class);
   }
   if (command.equals("Time")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Time",parameters,(Class)null);
   }
   if (command.equals("PrintCurrentTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintCurrentTime",parameters,(Class)null);
   }
   if (command.equals("PrintDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDate",parameters,long.class);
   }
   if (command.equals("PrintDateLong")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDateLong",parameters,long.class);
   }
   if (command.equals("PrintDateShort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDateShort",parameters,long.class);
   }
   if (command.equals("PrintDateFull")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDateFull",parameters,long.class);
   }
   if (command.equals("PrintTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintTime",parameters,long.class);
   }
   if (command.equals("PrintTimeLong")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintTimeLong",parameters,long.class);
   }
   if (command.equals("PrintTimeShort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintTimeShort",parameters,long.class);
   }
   if (command.equals("PrintTimeFull")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintTimeFull",parameters,long.class);
   }
   if (command.equals("PrintDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDuration",parameters,long.class);
   }
   if (command.equals("PrintDurationWithSeconds")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDurationWithSeconds",parameters,long.class);
   }
   if (command.equals("PrintDurationShort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintDurationShort",parameters,long.class);
   }
   if (command.equals("GetDiskFreeSpace")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDiskFreeSpace",parameters,java.lang.String.class);
   }
   if (command.equals("GetDiskTotalSpace")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDiskTotalSpace",parameters,java.lang.String.class);
   }
   if (command.equals("GetFileSystemType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileSystemType",parameters,java.lang.String.class);
   }
   if (command.equals("GetWindowsRegistryNames")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWindowsRegistryNames",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetWindowsRegistryDWORDValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWindowsRegistryDWORDValue",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetWindowsRegistryStringValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWindowsRegistryStringValue",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("RemoveWindowsRegistryValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveWindowsRegistryValue",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetWindowsRegistryDWORDValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWindowsRegistryDWORDValue",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,int.class);
   }
   if (command.equals("SetWindowsRegistryStringValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWindowsRegistryStringValue",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("PlaySound")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PlaySound",parameters,java.lang.String.class);
   }
   if (command.equals("If")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"If",parameters,boolean.class,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("GetFileNameFromPath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileNameFromPath",parameters,java.io.File.class);
   }
   if (command.equals("GetAbsoluteFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAbsoluteFilePath",parameters,java.io.File.class);
   }
   if (command.equals("GetFileExtensionFromPath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileExtensionFromPath",parameters,java.lang.String.class);
   }
   if (command.equals("Wait")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Wait",parameters,long.class);
   }
   if (command.equals("Max")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Max",parameters,java.lang.Number.class,java.lang.Number.class);
   }
   if (command.equals("Min")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Min",parameters,java.lang.Number.class,java.lang.Number.class);
   }
   if (command.equals("ExecuteProcess")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ExecuteProcess",parameters,java.lang.String.class,java.lang.Object.class,java.io.File.class,boolean.class);
   }
   if (command.equals("ExecuteProcessReturnOutput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ExecuteProcessReturnOutput",parameters,java.lang.String.class,java.lang.Object.class,java.io.File.class,boolean.class,boolean.class);
   }
   if (command.equals("LoadImageFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LoadImageFile",parameters,java.io.File.class);
   }
   if (command.equals("LoadImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LoadImage",parameters,java.lang.Object.class);
   }
   if (command.equals("SaveImageToFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SaveImageToFile",parameters,Object.class,java.io.File.class,int.class,int.class);
   }
   if (command.equals("GetMetaImageSourceFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMetaImageSourceFile",parameters,Object.class);
   }
   if (command.equals("GetMetaImageAspectRatio")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMetaImageAspectRatio",parameters,Object.class);
   }
   if (command.equals("IsMetaImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMetaImage",parameters,java.lang.Object.class);
   }
   if (command.equals("GetMetaImageBytes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMetaImageBytes",parameters,Object.class);
   }
   if (command.equals("GetImageAsBufferedImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetImageAsBufferedImage",parameters,java.lang.Object.class);
   }
   if (command.equals("GetScaledImageAsBufferedImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScaledImageAsBufferedImage",parameters,java.lang.Object.class,int.class,int.class);
   }
   if (command.equals("UnloadImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"UnloadImage",parameters,java.lang.String.class);
   }
   if (command.equals("IsImageLoaded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsImageLoaded",parameters,java.lang.Object.class);
   }
   if (command.equals("DidImageLoadFail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DidImageLoadFail",parameters,java.lang.Object.class);
   }
   if (command.equals("DirectoryListing")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "DirectoryListing", parameters, java.io.File.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "DirectoryListing", parameters, java.io.File.class,java.lang.String.class);
      }
   }
   if (command.equals("DirectoryListing")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "DirectoryListing", parameters, java.io.File.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "DirectoryListing", parameters, java.io.File.class,java.lang.String.class);
      }
   }
   if (command.equals("LocalDirectoryListing")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LocalDirectoryListing",parameters,java.io.File.class);
   }
   if (command.equals("GetFileSystemRoots")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileSystemRoots",parameters,(Class)null);
   }
   if (command.equals("GetLocalFileSystemRoots")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalFileSystemRoots",parameters,(Class)null);
   }
   if (command.equals("StringEndsWith")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringEndsWith",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("StringStartsWith")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringStartsWith",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("StringIndexOf")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringIndexOf",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("StringLastIndexOf")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringLastIndexOf",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetWorkingDirectory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWorkingDirectory",parameters,(Class)null);
   }
   if (command.equals("HasLocalFilesystem")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasLocalFilesystem",parameters,(Class)null);
   }
   if (command.equals("CreateFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateFilePath",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("IsFilePathHidden")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFilePathHidden",parameters,java.lang.String.class);
   }
   if (command.equals("IsLocalFilePathHidden")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLocalFilePathHidden",parameters,java.lang.String.class);
   }
   if (command.equals("IsFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFilePath",parameters,java.lang.String.class);
   }
   if (command.equals("IsLocalFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLocalFilePath",parameters,java.lang.String.class);
   }
   if (command.equals("IsDirectoryPath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDirectoryPath",parameters,java.lang.String.class);
   }
   if (command.equals("IsLocalDirectoryPath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLocalDirectoryPath",parameters,java.lang.String.class);
   }
   if (command.equals("CreateNewDirectory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateNewDirectory",parameters,java.io.File.class);
   }
   if (command.equals("CreateNewLocalDirectory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateNewLocalDirectory",parameters,java.io.File.class);
   }
   if (command.equals("GetPathParentDirectory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPathParentDirectory",parameters,java.io.File.class);
   }
   if (command.equals("GetPathLastModifiedTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPathLastModifiedTime",parameters,java.io.File.class);
   }
   if (command.equals("GetLocalPathLastModifiedTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalPathLastModifiedTime",parameters,java.io.File.class);
   }
   if (command.equals("GetFilePathSize")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFilePathSize",parameters,java.io.File.class);
   }
   if (command.equals("GetLocalFilePathSize")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalFilePathSize",parameters,java.io.File.class);
   }
   if (command.equals("DeleteFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteFilePath",parameters,java.io.File.class);
   }
   if (command.equals("DeleteLocalFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteLocalFilePath",parameters,java.io.File.class);
   }
   if (command.equals("RenameFilePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RenameFilePath",parameters,java.io.File.class,java.io.File.class);
   }
   if (command.equals("AddToGrouping")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddToGrouping",parameters,java.util.Map.class,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("SendNetworkCommand")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SendNetworkCommand",parameters,java.lang.String.class,int.class,java.lang.Object.class);
   }
   if (command.equals("ScaleBufferedImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ScaleBufferedImage",parameters,java.awt.image.BufferedImage.class,int.class,int.class,boolean.class);
   }
   if (command.equals("LocalizeString")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LocalizeString",parameters,java.lang.String.class);
   }
   if (command.equals("GetLocalIPAddress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalIPAddress",parameters,(Class)null);
   }
   if (command.equals("IsImportableFileType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsImportableFileType",parameters,java.lang.String.class);
   }
   if (command.equals("GetSubnetMask")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSubnetMask",parameters,(Class)null);
   }
   if (command.equals("GetGatewayAddress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetGatewayAddress",parameters,(Class)null);
   }
   if (command.equals("GetDNSAddress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDNSAddress",parameters,(Class)null);
   }
   if (command.equals("GuessMajorFileType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GuessMajorFileType",parameters,java.lang.String.class);
   }
   if (command.equals("TestPlaceshifterConnectivity")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TestPlaceshifterConnectivity",parameters,java.lang.String.class);
   }
   if (command.equals("LookupIPForLocatorID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LookupIPForLocatorID",parameters,java.lang.String.class);
   }
   if (command.equals("CreateArray")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateArray",parameters,java.lang.Object.class);
   }
   if (command.equals("SetScrollPosition")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetScrollPosition",parameters,float.class,float.class);
   }
   if (command.equals("ClearMenuCache")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearMenuCache",parameters,(Class)null);
   }
   if (command.equals("Animate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Animate",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,long.class);
   }
   if (command.equals("AnimateVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AnimateVariable",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.Object.class,java.lang.String.class,long.class,long.class,boolean.class);
   }
   if (command.equals("AnimateTransition")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AnimateTransition",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,long.class,long.class,boolean.class);
   }
   if (command.equals("AnimateDelayed")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AnimateDelayed",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,long.class,long.class,boolean.class);
   }
   if (command.equals("SetCoreAnimationsEnabled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCoreAnimationsEnabled",parameters,boolean.class);
   }
   if (command.equals("AreCoreAnimationsEnabled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AreCoreAnimationsEnabled",parameters,(Class)null);
   }
   if (command.equals("AreCoreAnimationsSupported")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AreCoreAnimationsSupported",parameters,(Class)null);
   }
   if (command.equals("GetUIRefreshLock")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIRefreshLock",parameters,(Class)null);
   }
   if (command.equals("ReleaseUIRefreshLock")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReleaseUIRefreshLock",parameters,(Class)null);
   }
   if (command.equals("CalculateMD5Sum")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CalculateMD5Sum",parameters,java.io.File.class);
   }
   if (command.equals("ReloadNameserverCache")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReloadNameserverCache",parameters,(Class)null);
   }
   if (command.equals("GetTimeSinceLastInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTimeSinceLastInput",parameters,(Class)null);
   }
   if (command.equals("GetFileAsString")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileAsString",parameters,java.io.File.class);
   }
   if (command.equals("GetLocalFileAsString")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalFileAsString",parameters,java.io.File.class);
   }
   if (command.equals("IsLocalRestartNeeded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLocalRestartNeeded",parameters,(Class)null);
   }
   if (command.equals("IsServerRestartNeeded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsServerRestartNeeded",parameters,(Class)null);
   }
   if (command.equals("Restart")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Restart",parameters,(Class)null);
   }
   if (command.equals("ServerRestart")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ServerRestart",parameters,(Class)null);
   }
   if (command.equals("QueryServerMacAddress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"QueryServerMacAddress",parameters,java.lang.String.class);
   }
   if (command.equals("ScanWirelessAPs")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ScanWirelessAPs",parameters,(Class)null);
   }
   if (command.equals("ReformatDeviceAtPathAsEXT3")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReformatDeviceAtPathAsEXT3",parameters,java.lang.String.class);
   }
   if (command.equals("ConvertNteChars")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ConvertNteChars",parameters,java.lang.String.class);
   }
   if (command.equals("StringIndexOfNTE")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringIndexOfNTE",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("StringStartsWithNTE")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StringStartsWithNTE",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("DumpServerThreadStates")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DumpServerThreadStates",parameters,(Class)null);
   }
   throw new RuntimeException("Invalid UtilityFactory Command: "+command);
   }


}
