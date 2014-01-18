package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaPlayerAPIFactory.html'>MediaPlayerAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class MediaPlayerAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("IsMediaPlayerFullyLoaded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMediaPlayerFullyLoaded",parameters,null);
   }
   if (command.equals("IsMediaPlayerLoading")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMediaPlayerLoading",parameters,null);
   }
   if (command.equals("PlayFaster")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PlayFaster",parameters,null);
   }
   if (command.equals("SkipForward")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SkipForward",parameters,null);
   }
   if (command.equals("SkipForward2")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SkipForward2",parameters,null);
   }
   if (command.equals("Seek")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Seek",parameters,long.class);
   }
   if (command.equals("Pause")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Pause",parameters,null);
   }
   if (command.equals("Play")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Play",parameters,null);
   }
   if (command.equals("PlaySlower")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PlaySlower",parameters,null);
   }
   if (command.equals("PlayPause")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PlayPause",parameters,null);
   }
   if (command.equals("SkipBackwards")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SkipBackwards",parameters,null);
   }
   if (command.equals("SkipBackwards2")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SkipBackwards2",parameters,null);
   }
   if (command.equals("GetPlaybackRate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaybackRate",parameters,null);
   }
   if (command.equals("SetPlaybackRate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPlaybackRate",parameters,float.class);
   }
   if (command.equals("VolumeUp")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"VolumeUp",parameters,null);
   }
   if (command.equals("VolumeDown")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"VolumeDown",parameters,null);
   }
   if (command.equals("GetVolume")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetVolume",parameters,null);
   }
   if (command.equals("ChannelUp")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ChannelUp",parameters,null);
   }
   if (command.equals("ChannelDown")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ChannelDown",parameters,null);
   }
   if (command.equals("ChannelSet")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ChannelSet",parameters,java.lang.String.class);
   }
   if (command.equals("VolumeAdjust")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"VolumeAdjust",parameters,float.class);
   }
   if (command.equals("SetVolume")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetVolume",parameters,float.class);
   }
   if (command.equals("Watch")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Watch",parameters,java.lang.Object.class);
   }
   if (command.equals("WatchLive")) {
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "WatchLive", parameters, java.lang.String.class,long.class);
      }
      if (parameters!=null && parameters.length == 3) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "WatchLive", parameters, java.lang.String.class,long.class,java.lang.String.class);
      }
   }
   if (command.equals("WatchLive")) {
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "WatchLive", parameters, java.lang.String.class,long.class);
      }
      if (parameters!=null && parameters.length == 3) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "WatchLive", parameters, java.lang.String.class,long.class,java.lang.String.class);
      }
   }
   if (command.equals("LockTuner")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LockTuner",parameters,java.lang.String.class);
   }
   if (command.equals("WatchLocalFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"WatchLocalFile",parameters,java.io.File.class);
   }
   if (command.equals("StartPlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartPlaylist",parameters,Object.class);
   }
   if (command.equals("StartPlaylistAt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StartPlaylistAt",parameters,Object.class,int.class);
   }
   if (command.equals("CloseAndWaitUntilClosed")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CloseAndWaitUntilClosed",parameters,null);
   }
   if (command.equals("IsMuted")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMuted",parameters,null);
   }
   if (command.equals("SetMute")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetMute",parameters,boolean.class);
   }
   if (command.equals("GetCurrentMediaTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentMediaTitle",parameters,null);
   }
   if (command.equals("GetMediaTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaTime",parameters,null);
   }
   if (command.equals("GetRawMediaTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRawMediaTime",parameters,null);
   }
   if (command.equals("GetMediaDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaDuration",parameters,null);
   }
   if (command.equals("GetCurrentMediaFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentMediaFile",parameters,null);
   }
   if (command.equals("HasMediaFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasMediaFile",parameters,null);
   }
   if (command.equals("DoesCurrentMediaFileHaveVideo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DoesCurrentMediaFileHaveVideo",parameters,null);
   }
   if (command.equals("IsCurrentMediaFileMusic")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCurrentMediaFileMusic",parameters,null);
   }
   if (command.equals("IsCurrentMediaFileDVD")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCurrentMediaFileDVD",parameters,null);
   }
   if (command.equals("IsCurrentMediaFileRecording")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCurrentMediaFileRecording",parameters,null);
   }
   if (command.equals("IsPlaying")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPlaying",parameters,null);
   }
   if (command.equals("IsShowingDVDMenu")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsShowingDVDMenu",parameters,null);
   }
   if (command.equals("GetCurrentPlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentPlaylist",parameters,null);
   }
   if (command.equals("GetCurrentPlaylistIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentPlaylistIndex",parameters,null);
   }
   if (command.equals("GetAvailableSeekingStart")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAvailableSeekingStart",parameters,null);
   }
   if (command.equals("GetAvailableSeekingEnd")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAvailableSeekingEnd",parameters,null);
   }
   if (command.equals("IsCorrectParentalLockCode")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCorrectParentalLockCode",parameters,java.lang.String.class);
   }
   if (command.equals("SetVideoAlwaysOnTop")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetVideoAlwaysOnTop",parameters,boolean.class);
   }
   if (command.equals("DVDChapterNext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDChapterNext",parameters,null);
   }
   if (command.equals("DVDChapterPrevious")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDChapterPrevious",parameters,null);
   }
   if (command.equals("DVDChapterSet")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDChapterSet",parameters,int.class);
   }
   if (command.equals("DVDEnter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDEnter",parameters,null);
   }
   if (command.equals("DVDMenu")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDMenu",parameters,null);
   }
   if (command.equals("DVDTitleMenu")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDTitleMenu",parameters,null);
   }
   if (command.equals("DVDReturn")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDReturn",parameters,null);
   }
   if (command.equals("DVDTitleNext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDTitleNext",parameters,null);
   }
   if (command.equals("DVDTitlePrevious")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDTitlePrevious",parameters,null);
   }
   if (command.equals("DVDSubtitleToggle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDSubtitleToggle",parameters,null);
   }
   if (command.equals("DVDSubtitleChange")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDSubtitleChange",parameters,int.class);
   }
   if (command.equals("DVDAudioChange")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDAudioChange",parameters,int.class);
   }
   if (command.equals("DVDAngleChange")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DVDAngleChange",parameters,int.class);
   }
   if (command.equals("ReloadCurrentFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReloadCurrentFile",parameters,null);
   }
   if (command.equals("DirectPlaybackControl")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DirectPlaybackControl",parameters,int.class,long.class,long.class);
   }
   if (command.equals("GetDVDCurrentTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentTitle",parameters,null);
   }
   if (command.equals("GetBluRayTitleDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetBluRayTitleDescription",parameters,int.class);
   }
   if (command.equals("GetDVDNumberOfTitles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDNumberOfTitles",parameters,null);
   }
   if (command.equals("GetDVDCurrentChapter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentChapter",parameters,null);
   }
   if (command.equals("GetDVDNumberOfChapters")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDNumberOfChapters",parameters,null);
   }
   if (command.equals("GetDVDCurrentDomain")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentDomain",parameters,null);
   }
   if (command.equals("GetDVDCurrentAngle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentAngle",parameters,null);
   }
   if (command.equals("GetDVDNumberOfAngles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDNumberOfAngles",parameters,null);
   }
   if (command.equals("GetDVDCurrentLanguage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentLanguage",parameters,null);
   }
   if (command.equals("GetDVDAvailableLanguages")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDAvailableLanguages",parameters,null);
   }
   if (command.equals("GetDVDCurrentSubpicture")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDCurrentSubpicture",parameters,null);
   }
   if (command.equals("GetDVDAvailableSubpictures")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDVDAvailableSubpictures",parameters,null);
   }
   if (command.equals("GetMediaPlayerClosedCaptionState")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaPlayerClosedCaptionState",parameters,null);
   }
   if (command.equals("SetMediaPlayerClosedCaptionState")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetMediaPlayerClosedCaptionState",parameters,java.lang.String.class);
   }
   if (command.equals("IsMediaPlayerSignalLost")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMediaPlayerSignalLost",parameters,null);
   }
   if (command.equals("GetSubtitleDelay")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSubtitleDelay",parameters,null);
   }
   if (command.equals("SetSubtitleDelay")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetSubtitleDelay",parameters,long.class);
   }
   if (command.equals("CanAdjustSubtitleTiming")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CanAdjustSubtitleTiming",parameters,null);
   }
   if (command.equals("ApplyRelativeSubtitleAdjustment")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ApplyRelativeSubtitleAdjustment",parameters,int.class);
   }
   if (command.equals("GetVideoSnapshot")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetVideoSnapshot",parameters,null);
   }
   throw new RuntimeException("Invalid MediaPlayerAPIFactory Command: "+command);
   }


}
