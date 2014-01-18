package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/GlobalFactory.html'>GlobalFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class GlobalFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("Refresh")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Refresh",parameters,null);
   }
   if (command.equals("RefreshArea")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RefreshArea",parameters,java.lang.String.class);
   }
   if (command.equals("RefreshAreaForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RefreshAreaForVariable",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("Repaint")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Repaint",parameters,null);
   }
   if (command.equals("RepaintArea")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RepaintArea",parameters,java.lang.String.class);
   }
   if (command.equals("AddStaticContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddStaticContext",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("AddGlobalContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddGlobalContext",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("AreThereUnresolvedConflicts")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AreThereUnresolvedConflicts",parameters,null);
   }
   if (command.equals("IsAsleep")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAsleep",parameters,null);
   }
   if (command.equals("GetTotalDiskspaceAvailable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTotalDiskspaceAvailable",parameters,null);
   }
   if (command.equals("GetTotalLibraryDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTotalLibraryDuration",parameters,null);
   }
   if (command.equals("GetTotalVideoDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTotalVideoDuration",parameters,null);
   }
   if (command.equals("GetUsedLibraryDiskspace")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUsedLibraryDiskspace",parameters,null);
   }
   if (command.equals("GetUsedVideoDiskspace")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUsedVideoDiskspace",parameters,null);
   }
   if (command.equals("AreAiringsSameShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AreAiringsSameShow",parameters,Object.class,Object.class);
   }
   if (command.equals("GetLastEPGDownloadTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLastEPGDownloadTime",parameters,null);
   }
   if (command.equals("GetLogo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLogo",parameters,java.lang.String.class);
   }
   if (command.equals("GetTimeUntilNextEPGDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTimeUntilNextEPGDownload",parameters,null);
   }
   if (command.equals("GetAllLineups")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllLineups",parameters,null);
   }
   if (command.equals("IsChannelDownloadComplete")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelDownloadComplete",parameters,java.lang.String.class);
   }
   if (command.equals("GetLocalMarketsFromEPGServer")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLocalMarketsFromEPGServer",parameters,null);
   }
   if (command.equals("GetLineupsForZipCodeFromEPGServer")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLineupsForZipCodeFromEPGServer",parameters,java.lang.String.class);
   }
   if (command.equals("GetCurrentlyRecordingMediaFiles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentlyRecordingMediaFiles",parameters,null);
   }
   if (command.equals("GetSuggestedIntelligentRecordings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSuggestedIntelligentRecordings",parameters,null);
   }
   if (command.equals("GetScheduledRecordings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduledRecordings",parameters,null);
   }
   if (command.equals("GetScheduledRecordingsForDevice")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduledRecordingsForDevice",parameters,java.lang.String.class);
   }
   if (command.equals("GetScheduledRecordingsForTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduledRecordingsForTime",parameters,long.class,long.class);
   }
   if (command.equals("GetScheduledRecordingsForDeviceForTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduledRecordingsForDeviceForTime",parameters,java.lang.String.class,long.class,long.class);
   }
   if (command.equals("GetRecentlyWatched")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRecentlyWatched",parameters,long.class);
   }
   if (command.equals("RunLibraryImportScan")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RunLibraryImportScan",parameters,boolean.class);
   }
   if (command.equals("Exit")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Exit",parameters,null);
   }
   if (command.equals("SageCommand")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SageCommand",parameters,java.lang.String.class);
   }
   if (command.equals("RemoveUnusedLineups")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveUnusedLineups",parameters,null);
   }
   if (command.equals("GetApplicationLaunchTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetApplicationLaunchTime",parameters,null);
   }
   if (command.equals("GetFocusContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFocusContext",parameters,null);
   }
   if (command.equals("Fork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Fork",parameters,null);
   }
   if (command.equals("TransmitCommandUsingInfraredTuningPlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TransmitCommandUsingInfraredTuningPlugin",parameters,java.lang.String.class,int.class,java.lang.String.class,java.lang.String.class,int.class);
   }
   if (command.equals("DebugLog")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DebugLog",parameters,java.lang.String.class);
   }
   if (command.equals("CloseOptionsMenu")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "CloseOptionsMenu", parameters, null);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "CloseOptionsMenu", parameters, java.lang.String.class,boolean.class);
      }
   }
   if (command.equals("CloseOptionsMenu")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "CloseOptionsMenu", parameters, null);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "CloseOptionsMenu", parameters, java.lang.String.class,boolean.class);
      }
   }
   if (command.equals("IsOptionsMenuOpen")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsOptionsMenuOpen",parameters,null);
   }
   if (command.equals("GetSageCommandNames")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSageCommandNames",parameters,null);
   }
   if (command.equals("ApplyServiceLevelToLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ApplyServiceLevelToLineup",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("SetFocusForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFocusForVariable",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("EnsureVisibilityForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"EnsureVisibilityForVariable",parameters,java.lang.String.class,java.lang.Object.class,int.class);
   }
   if (command.equals("GetVariableFromContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetVariableFromContext",parameters,java.lang.String.class,java.lang.Object.class,java.lang.String.class);
   }
   if (command.equals("GetVisibilityForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetVisibilityForVariable",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentForVariable",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentContext",parameters,null);
   }
   if (command.equals("SetFocusToUIComponent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFocusToUIComponent",parameters,java.lang.Object.class);
   }
   if (command.equals("GetTableFocusedVisibleRow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTableFocusedVisibleRow",parameters,java.lang.Object.class);
   }
   if (command.equals("GetTableFocusedVisibleColumn")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTableFocusedVisibleColumn",parameters,java.lang.Object.class);
   }
   if (command.equals("GetTableFocusedVisiblePosition")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTableFocusedVisiblePosition",parameters,java.lang.Object.class);
   }
   if (command.equals("GetTableFocusedPosition")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTableFocusedPosition",parameters,java.lang.Object.class);
   }
   if (command.equals("GetDataFromTableFocusedOffset")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDataFromTableFocusedOffset",parameters,java.lang.Object.class,int.class,boolean.class);
   }
   if (command.equals("GetDataFromTableVisiblePosition")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDataFromTableVisiblePosition",parameters,java.lang.Object.class,int.class,boolean.class);
   }
   if (command.equals("IsTableTransitionToNext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsTableTransitionToNext",parameters,java.lang.Object.class);
   }
   if (command.equals("IsTableTransitionToPrevious")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsTableTransitionToPrevious",parameters,java.lang.Object.class);
   }
   if (command.equals("IsTransitioningToMenu")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsTransitioningToMenu",parameters,java.lang.String.class);
   }
   if (command.equals("IsTransitioningFromMenu")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsTransitioningFromMenu",parameters,java.lang.String.class);
   }
   if (command.equals("GetTextForUIComponent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTextForUIComponent",parameters,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentLastFocusedChild")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentLastFocusedChild",parameters,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentPositionX")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentPositionX",parameters,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentPositionY")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentPositionY",parameters,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentWidth")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentWidth",parameters,java.lang.Object.class);
   }
   if (command.equals("GetUIComponentHeight")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIComponentHeight",parameters,java.lang.Object.class);
   }
   if (command.equals("SendEventToUIComponent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SendEventToUIComponent",parameters,java.lang.Object.class,java.lang.String.class,int.class);
   }
   if (command.equals("GetChildUIComponentForVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChildUIComponentForVariable",parameters,java.lang.Object.class,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("GetVariableFromUIComponent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetVariableFromUIComponent",parameters,java.lang.Object.class,java.lang.String.class);
   }
   if (command.equals("SetVariableForUIComponent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetVariableForUIComponent",parameters,java.lang.Object.class,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("PassiveListen")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PassiveListen",parameters,null);
   }
   if (command.equals("GetAiringsThatWontBeRecorded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringsThatWontBeRecorded",parameters,boolean.class);
   }
   if (command.equals("IsClient")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsClient",parameters,null);
   }
   if (command.equals("IsRemoteUI")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsRemoteUI",parameters,null);
   }
   if (command.equals("IsDesktopUI")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDesktopUI",parameters,null);
   }
   if (command.equals("IsServerUI")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsServerUI",parameters,null);
   }
   if (command.equals("GetConnectedClients")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetConnectedClients",parameters,null);
   }
   if (command.equals("GetUIContextNames")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIContextNames",parameters,null);
   }
   if (command.equals("GetUIContextName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIContextName",parameters,null);
   }
   if (command.equals("GetRemoteClientVersion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRemoteClientVersion",parameters,null);
   }
   if (command.equals("GetRemoteUIType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRemoteUIType",parameters,null);
   }
   if (command.equals("CreateTimedRecording")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateTimedRecording",parameters,Object.class,long.class,long.class,java.lang.String.class);
   }
   if (command.equals("IsFullScreen")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFullScreen",parameters,null);
   }
   if (command.equals("SetFullScreen")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFullScreen",parameters,boolean.class);
   }
   if (command.equals("GetServerAddress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetServerAddress",parameters,null);
   }
   if (command.equals("GetOS")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetOS",parameters,null);
   }
   if (command.equals("IsWindowsOS")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsWindowsOS",parameters,null);
   }
   if (command.equals("IsLinuxOS")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsLinuxOS",parameters,null);
   }
   if (command.equals("IsMacOS")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMacOS",parameters,null);
   }
   if (command.equals("DVDBurnTheBurnList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDBurnTheBurnList",parameters,Object.class);
   }
   if (command.equals("DVDCancelBurn")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDCancelBurn",parameters,null);
   }
   if (command.equals("DVDGetCurrentBurnStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDGetCurrentBurnStatus",parameters,null);
   }
   if (command.equals("CDBurnTheBurnList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDBurnTheBurnList",parameters,Object.class);
   }
   if (command.equals("CDCancelBurn")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDCancelBurn",parameters,null);
   }
   if (command.equals("CDGetCurrentBurnStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDGetCurrentBurnStatus",parameters,null);
   }
   if (command.equals("CDRipToLibrary")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDRipToLibrary",parameters,java.io.File.class,java.lang.String.class);
   }
   if (command.equals("CDCancelRip")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDCancelRip",parameters,null);
   }
   if (command.equals("CDGetCurrentRipStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CDGetCurrentRipStatus",parameters,null);
   }
   if (command.equals("StartFileCopy")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartFileCopy",parameters,java.lang.String.class,java.lang.String.class,java.io.File.class);
   }
   if (command.equals("CancelFileCopy")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CancelFileCopy",parameters,null);
   }
   if (command.equals("GetFileCopyStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileCopyStatus",parameters,null);
   }
   if (command.equals("StartFileDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartFileDownload",parameters,java.lang.String.class,java.lang.String.class,java.io.File.class);
   }
   if (command.equals("StartBackgroundFileDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartBackgroundFileDownload",parameters,java.lang.String.class,java.lang.String.class,java.io.File.class,java.util.Properties.class);
   }
   if (command.equals("StartCircularFileDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartCircularFileDownload",parameters,java.lang.String.class,java.lang.String.class,java.io.File.class);
   }
   if (command.equals("CancelFileDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CancelFileDownload",parameters,null);
   }
   if (command.equals("CancelBackgroundFileDownload")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CancelBackgroundFileDownload",parameters,java.io.File.class);
   }
   if (command.equals("GetFileDownloadStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileDownloadStatus",parameters,null);
   }
   if (command.equals("GetBackgroundFileDownloadStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetBackgroundFileDownloadStatus",parameters,java.io.File.class);
   }
   if (command.equals("GetFileDownloadStreamTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFileDownloadStreamTime",parameters,null);
   }
   if (command.equals("IsFileDownloadProgressivePlay")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFileDownloadProgressivePlay",parameters,null);
   }
   if (command.equals("GetBackgroundFileDownloadStreamTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetBackgroundFileDownloadStreamTime",parameters,java.io.File.class);
   }
   if (command.equals("IsBackgroundFileDownloadProgressivePlay")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsBackgroundFileDownloadProgressivePlay",parameters,java.io.File.class);
   }
   if (command.equals("GetBackgroundFileDownloadTotalSize")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetBackgroundFileDownloadTotalSize",parameters,java.io.File.class);
   }
   if (command.equals("SetRemoteEventEncryptionEnabled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRemoteEventEncryptionEnabled",parameters,boolean.class);
   }
   if (command.equals("CachePlaceshifterLogin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CachePlaceshifterLogin",parameters,null);
   }
   if (command.equals("CanCachePlaceshifterLogin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CanCachePlaceshifterLogin",parameters,null);
   }
   if (command.equals("ReloadSystemHooks")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReloadSystemHooks",parameters,null);
   }
   if (command.equals("UpdateLocatorServer")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"UpdateLocatorServer",parameters,null);
   }
   if (command.equals("GetFullUIWidth")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFullUIWidth",parameters,null);
   }
   if (command.equals("GetFullUIHeight")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFullUIHeight",parameters,null);
   }
   if (command.equals("GetDisplayResolutionWidth")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDisplayResolutionWidth",parameters,null);
   }
   if (command.equals("GetDisplayResolutionHeight")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDisplayResolutionHeight",parameters,null);
   }
   if (command.equals("GetDisplayResolution")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDisplayResolution",parameters,null);
   }
   if (command.equals("GetDisplayResolutionOptions")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDisplayResolutionOptions",parameters,null);
   }
   if (command.equals("GetDisplayResolutionDetails")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDisplayResolutionDetails",parameters,java.lang.String.class);
   }
   if (command.equals("GetPreferredDisplayResolutions")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPreferredDisplayResolutions",parameters,null);
   }
   if (command.equals("SetDisplayResolution")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetDisplayResolution",parameters,java.lang.String.class);
   }
   if (command.equals("DiscoverSageTVServers")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DiscoverSageTVServers",parameters,long.class);
   }
   if (command.equals("IsEmbeddedSystem")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsEmbeddedSystem",parameters,null);
   }
   if (command.equals("IsEmbeddedServer")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsEmbeddedServer",parameters,null);
   }
   if (command.equals("IsPVR")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPVR",parameters,null);
   }
   if (command.equals("GetHotplugStorageMap")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetHotplugStorageMap",parameters,null);
   }
   if (command.equals("IsDoingLibraryImportScan")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDoingLibraryImportScan",parameters,null);
   }
   if (command.equals("PrepareForFirmwareLoad")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrepareForFirmwareLoad",parameters,null);
   }
   if (command.equals("GetEmbeddedPanel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEmbeddedPanel",parameters,null);
   }
   if (command.equals("SetEmbeddedPanelBounds")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetEmbeddedPanelBounds",parameters,float.class,float.class,float.class,float.class);
   }
   if (command.equals("GetAvailableUpdate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAvailableUpdate",parameters,null);
   }
   if (command.equals("DeployAvailableUpdate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeployAvailableUpdate",parameters,java.lang.String.class);
   }
   if (command.equals("GetLineupsForTvtv")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLineupsForTvtv",parameters,java.lang.String.class);
   }
   if (command.equals("TvtvGetHost")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvGetHost",parameters,null);
   }
   if (command.equals("TvtvGetHostList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvGetHostList",parameters,null);
   }
   if (command.equals("TvtvCreateNewAccount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvCreateNewAccount",parameters,null);
   }
   if (command.equals("TvtvGetUser")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvGetUser",parameters,null);
   }
   if (command.equals("TvtvConfigureUser")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvConfigureUser",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("TvtvGetAccountStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvGetAccountStatus",parameters,null);
   }
   if (command.equals("TvtvGetAccountStatusMessage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvGetAccountStatusMessage",parameters,null);
   }
   if (command.equals("TvtvMessage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvMessage",parameters,java.lang.String.class);
   }
   if (command.equals("TvtvLogoLink")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvLogoLink",parameters,null);
   }
   if (command.equals("TvtvCreateSpecificAccount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvCreateSpecificAccount",parameters,null);
   }
   if (command.equals("TvtvActivateTrial")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvActivateTrial",parameters,null);
   }
   if (command.equals("TvtvDownloadStations")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvDownloadStations",parameters,java.lang.String.class);
   }
   if (command.equals("TvtvConfigureInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"TvtvConfigureInput",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   throw new RuntimeException("Invalid GlobalFactory Command: "+command);
   }


}
