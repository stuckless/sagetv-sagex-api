package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 7:30 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/SeriesInfoAPIFactory.html'>SeriesInfoAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class SeriesInfoAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetAllSeriesInfo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllSeriesInfo",parameters,(Class)null);
   }
   if (command.equals("GetSeriesTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesTitle",parameters,Object.class);
   }
   if (command.equals("GetSeriesDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesDescription",parameters,Object.class);
   }
   if (command.equals("GetSeriesCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesCategory",parameters,Object.class);
   }
   if (command.equals("GetSeriesSubCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesSubCategory",parameters,Object.class);
   }
   if (command.equals("GetSeriesHistory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesHistory",parameters,Object.class);
   }
   if (command.equals("GetSeriesPremiereDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesPremiereDate",parameters,Object.class);
   }
   if (command.equals("GetSeriesFinaleDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesFinaleDate",parameters,Object.class);
   }
   if (command.equals("GetSeriesNetwork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesNetwork",parameters,Object.class);
   }
   if (command.equals("GetSeriesDayOfWeek")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesDayOfWeek",parameters,Object.class);
   }
   if (command.equals("GetSeriesHourAndMinuteTimeslot")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesHourAndMinuteTimeslot",parameters,Object.class);
   }
   if (command.equals("HasSeriesImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasSeriesImage",parameters,Object.class);
   }
   if (command.equals("GetSeriesImage")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImage", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImage", parameters, Object.class,boolean.class);
      }
   }
   if (command.equals("GetSeriesImage")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImage", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImage", parameters, Object.class,boolean.class);
      }
   }
   if (command.equals("GetSeriesImageURL")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImageURL", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImageURL", parameters, Object.class,boolean.class);
      }
   }
   if (command.equals("GetSeriesImageURL")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImageURL", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetSeriesImageURL", parameters, Object.class,boolean.class);
      }
   }
   if (command.equals("GetSeriesImageCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesImageCount",parameters,Object.class);
   }
   if (command.equals("GetSeriesImageAtIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesImageAtIndex",parameters,Object.class,int.class,boolean.class);
   }
   if (command.equals("GetSeriesImageURLAtIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesImageURLAtIndex",parameters,Object.class,int.class,boolean.class);
   }
   if (command.equals("HasSeriesActorImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasSeriesActorImage",parameters,Object.class,Object.class);
   }
   if (command.equals("GetSeriesActorImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesActorImage",parameters,Object.class,Object.class,boolean.class);
   }
   if (command.equals("GetSeriesActorImageURL")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesActorImageURL",parameters,Object.class,Object.class,boolean.class);
   }
   if (command.equals("GetNumberOfCharactersInSeries")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNumberOfCharactersInSeries",parameters,Object.class);
   }
   if (command.equals("GetSeriesActor")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesActor",parameters,Object.class,int.class);
   }
   if (command.equals("GetSeriesActorList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesActorList",parameters,Object.class);
   }
   if (command.equals("GetSeriesCharacter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesCharacter",parameters,Object.class,int.class);
   }
   if (command.equals("GetSeriesCharacterList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesCharacterList",parameters,Object.class);
   }
   if (command.equals("GetSeriesCharacterForActor")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesCharacterForActor",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetSeriesID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesID",parameters,Object.class);
   }
   if (command.equals("GetSeriesInfoForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesInfoForID",parameters,java.lang.String.class);
   }
   if (command.equals("AddSeriesInfo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddSeriesInfo",parameters,int.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String[].class);
   }
   if (command.equals("GetSeriesInfoProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSeriesInfoProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetSeriesInfoProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetSeriesInfoProperty",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("IsSeriesInfoObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsSeriesInfoObject",parameters,java.lang.Object.class);
   }
   throw new RuntimeException("Invalid SeriesInfoAPIFactory Command: "+command);
   }


}
