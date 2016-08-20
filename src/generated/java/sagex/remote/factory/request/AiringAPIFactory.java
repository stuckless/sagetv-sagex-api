package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/AiringAPIFactory.html'>AiringAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class AiringAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("SetRecordingName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRecordingName",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetRecordingName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRecordingName",parameters,Object.class);
   }
   if (command.equals("GetChannel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannel",parameters,Object.class);
   }
   if (command.equals("GetAiringChannelName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringChannelName",parameters,Object.class);
   }
   if (command.equals("GetAiringChannelNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringChannelNumber",parameters,Object.class);
   }
   if (command.equals("GetAiringDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringDuration",parameters,Object.class);
   }
   if (command.equals("GetAiringStartTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringStartTime",parameters,Object.class);
   }
   if (command.equals("GetAiringEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringEndTime",parameters,Object.class);
   }
   if (command.equals("GetShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShow",parameters,Object.class);
   }
   if (command.equals("GetAiringRatings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringRatings",parameters,Object.class);
   }
   if (command.equals("GetScheduleStartTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduleStartTime",parameters,Object.class);
   }
   if (command.equals("GetScheduleEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduleEndTime",parameters,Object.class);
   }
   if (command.equals("GetScheduleDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduleDuration",parameters,Object.class);
   }
   if (command.equals("GetScheduleRecordingRecurrence")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetScheduleRecordingRecurrence",parameters,Object.class);
   }
   if (command.equals("PrintAiringLong")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintAiringLong",parameters,Object.class);
   }
   if (command.equals("PrintAiringMedium")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintAiringMedium",parameters,Object.class);
   }
   if (command.equals("PrintAiringShort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PrintAiringShort",parameters,Object.class);
   }
   if (command.equals("GetAiringTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringTitle",parameters,Object.class);
   }
   if (command.equals("IsWatched")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsWatched",parameters,Object.class);
   }
   if (command.equals("GetWatchedDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWatchedDuration",parameters,Object.class);
   }
   if (command.equals("GetWatchedStartTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWatchedStartTime",parameters,Object.class);
   }
   if (command.equals("GetWatchedEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWatchedEndTime",parameters,Object.class);
   }
   if (command.equals("GetRealWatchedStartTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRealWatchedStartTime",parameters,Object.class);
   }
   if (command.equals("GetRealWatchedEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRealWatchedEndTime",parameters,Object.class);
   }
   if (command.equals("SetWatched")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWatched",parameters,Object.class);
   }
   if (command.equals("SetWatchedTimes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWatchedTimes",parameters,Object.class,long.class,long.class);
   }
   if (command.equals("ClearWatched")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearWatched",parameters,Object.class);
   }
   if (command.equals("GetLatestWatchedTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLatestWatchedTime",parameters,Object.class);
   }
   if (command.equals("IsWatchedCompletely")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsWatchedCompletely",parameters,Object.class);
   }
   if (command.equals("IsDontLike")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDontLike",parameters,Object.class);
   }
   if (command.equals("SetDontLike")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetDontLike",parameters,Object.class);
   }
   if (command.equals("ClearDontLike")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearDontLike",parameters,Object.class);
   }
   if (command.equals("IsManualRecord")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsManualRecord",parameters,Object.class);
   }
   if (command.equals("IsNotManualOrFavorite")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNotManualOrFavorite",parameters,Object.class);
   }
   if (command.equals("IsAiringHDTV")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAiringHDTV",parameters,Object.class);
   }
   if (command.equals("GetTrackNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTrackNumber",parameters,Object.class);
   }
   if (command.equals("GetRecordingQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRecordingQuality",parameters,Object.class);
   }
   if (command.equals("SetRecordingQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRecordingQuality",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsFavorite")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFavorite",parameters,Object.class);
   }
   if (command.equals("SetRecordingTimes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRecordingTimes",parameters,Object.class,long.class,long.class);
   }
   if (command.equals("Record")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Record",parameters,Object.class);
   }
   if (command.equals("CancelRecord")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CancelRecord",parameters,Object.class);
   }
   if (command.equals("IsAiringObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAiringObject",parameters,Object.class);
   }
   if (command.equals("GetParentalRating")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetParentalRating",parameters,Object.class);
   }
   if (command.equals("GetExtraAiringDetails")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetExtraAiringDetails",parameters,Object.class);
   }
   if (command.equals("GetAiringID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringID",parameters,Object.class);
   }
   if (command.equals("GetAiringForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringForID",parameters,int.class);
   }
   if (command.equals("AddAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddAiring",parameters,java.lang.String.class,int.class,long.class,long.class);
   }
   if (command.equals("AddAiringDetailed")) {
      if (parameters!=null && parameters.length == 13) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddAiringDetailed", parameters, java.lang.String.class,int.class,long.class,long.class,int.class,int.class,java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 9) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddAiringDetailed", parameters, java.lang.String.class,int.class,long.class,long.class,int.class,int.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class);
      }
   }
   if (command.equals("AddAiringDetailed")) {
      if (parameters!=null && parameters.length == 13) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddAiringDetailed", parameters, java.lang.String.class,int.class,long.class,long.class,int.class,int.class,java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 9) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddAiringDetailed", parameters, java.lang.String.class,int.class,long.class,long.class,int.class,int.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class);
      }
   }
   if (command.equals("IsAiringAttributeSet")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAiringAttributeSet",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetAiringAttributeList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringAttributeList",parameters,Object.class);
   }
   if (command.equals("GetAiringPartNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringPartNumber",parameters,Object.class);
   }
   if (command.equals("GetAiringTotalParts")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringTotalParts",parameters,Object.class);
   }
   if (command.equals("GetAiringPremiereFinaleInfo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringPremiereFinaleInfo",parameters,Object.class);
   }
   if (command.equals("GetMediaFileForAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFileForAiring",parameters,Object.class);
   }
   if (command.equals("GetAiringOnAfter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringOnAfter",parameters,Object.class);
   }
   if (command.equals("GetAiringOnBefore")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringOnBefore",parameters,Object.class);
   }
   if (command.equals("GetManualRecordProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetManualRecordProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetManualRecordProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetManualRecordProperty",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetPlayableAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlayableAiring",parameters,Object.class);
   }
   if (command.equals("GetParentalLimitsExceeded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetParentalLimitsExceeded",parameters,Object.class);
   }
   throw new RuntimeException("Invalid AiringAPIFactory Command: "+command);
   }


}
