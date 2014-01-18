package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/FavoriteAPIFactory.html'>FavoriteAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class FavoriteAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("IsFirstRunsAndReRuns")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFirstRunsAndReRuns",parameters,Object.class);
   }
   if (command.equals("IsFirstRunsOnly")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFirstRunsOnly",parameters,Object.class);
   }
   if (command.equals("IsReRunsOnly")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsReRunsOnly",parameters,Object.class);
   }
   if (command.equals("IsFirstRuns")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFirstRuns",parameters,Object.class);
   }
   if (command.equals("IsReRuns")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsReRuns",parameters,Object.class);
   }
   if (command.equals("IsAutoDelete")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAutoDelete",parameters,Object.class);
   }
   if (command.equals("IsDeleteAfterAutomaticConversion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDeleteAfterAutomaticConversion",parameters,Object.class);
   }
   if (command.equals("GetKeepAtMost")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetKeepAtMost",parameters,Object.class);
   }
   if (command.equals("GetFavoriteDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteDescription",parameters,Object.class);
   }
   if (command.equals("GetFavoriteTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteTitle",parameters,Object.class);
   }
   if (command.equals("GetFavoriteCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteCategory",parameters,Object.class);
   }
   if (command.equals("GetFavoriteSubCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteSubCategory",parameters,Object.class);
   }
   if (command.equals("GetFavoritePerson")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoritePerson",parameters,Object.class);
   }
   if (command.equals("GetFavoriteRated")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteRated",parameters,Object.class);
   }
   if (command.equals("GetFavoritePersonRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoritePersonRole",parameters,Object.class);
   }
   if (command.equals("GetFavoriteYear")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteYear",parameters,Object.class);
   }
   if (command.equals("GetFavoriteParentalRating")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteParentalRating",parameters,Object.class);
   }
   if (command.equals("GetFavoriteChannel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteChannel",parameters,Object.class);
   }
   if (command.equals("GetFavoriteKeyword")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteKeyword",parameters,Object.class);
   }
   if (command.equals("GetFavoriteNetwork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteNetwork",parameters,Object.class);
   }
   if (command.equals("GetFavoriteTimeslot")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteTimeslot",parameters,Object.class);
   }
   if (command.equals("GetStartPadding")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetStartPadding",parameters,Object.class);
   }
   if (command.equals("GetStopPadding")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetStopPadding",parameters,Object.class);
   }
   if (command.equals("GetFavoriteQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteQuality",parameters,Object.class);
   }
   if (command.equals("GetFavoriteAutomaticConversionFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteAutomaticConversionFormat",parameters,Object.class);
   }
   if (command.equals("GetFavoriteAutomaticConversionDestination")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteAutomaticConversionDestination",parameters,Object.class);
   }
   if (command.equals("SetStartPadding")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetStartPadding",parameters,Object.class,long.class);
   }
   if (command.equals("SetStopPadding")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetStopPadding",parameters,Object.class,long.class);
   }
   if (command.equals("SetFavoriteQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteQuality",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteAutomaticConversionFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteAutomaticConversionFormat",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteAutomaticConversionDestination")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteAutomaticConversionDestination",parameters,Object.class,java.io.File.class);
   }
   if (command.equals("CreateFavoritePriority")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateFavoritePriority",parameters,Object.class,Object.class);
   }
   if (command.equals("ConfirmManualRecordOverFavoritePriority")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ConfirmManualRecordOverFavoritePriority",parameters,Object.class,Object.class);
   }
   if (command.equals("SetDontAutodelete")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetDontAutodelete",parameters,Object.class,boolean.class);
   }
   if (command.equals("SetDeleteAfterAutomaticConversion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetDeleteAfterAutomaticConversion",parameters,Object.class,boolean.class);
   }
   if (command.equals("SetKeepAtMost")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetKeepAtMost",parameters,Object.class,int.class);
   }
   if (command.equals("SetRunStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRunStatus",parameters,Object.class,boolean.class,boolean.class);
   }
   if (command.equals("SetFavoriteTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteTitle",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteCategories")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteCategories",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetFavoritePerson")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoritePerson",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteRated")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteRated",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteYear")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteYear",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteParentalRating")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteParentalRating",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteKeyword")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteKeyword",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteChannel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteChannel",parameters,Object.class,java.lang.Object.class);
   }
   if (command.equals("SetFavoriteNetwork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteNetwork",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteTimeslot")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteTimeslot",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetFavoriteForAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteForAiring",parameters,Object.class);
   }
   if (command.equals("DoesFavoriteMatchAiring")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DoesFavoriteMatchAiring",parameters,Object.class,Object.class);
   }
   if (command.equals("IsFavoriteObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsFavoriteObject",parameters,java.lang.Object.class);
   }
   if (command.equals("UpdateFavorite")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"UpdateFavorite",parameters,Object.class,java.lang.String.class,boolean.class,boolean.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetFavoriteAirings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteAirings",parameters,Object.class);
   }
   if (command.equals("GetFavoriteID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteID",parameters,Object.class);
   }
   if (command.equals("GetFavoriteForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteForID",parameters,int.class);
   }
   if (command.equals("GetFavorites")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavorites",parameters,null);
   }
   if (command.equals("RemoveFavorite")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveFavorite",parameters,Object.class);
   }
   if (command.equals("AddFavorite")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddFavorite",parameters,java.lang.String.class,boolean.class,boolean.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetFavoriteProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetFavoriteProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetFavoriteProperty",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetFavoriteProperties")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFavoriteProperties",parameters,Object.class);
   }
   throw new RuntimeException("Invalid FavoriteAPIFactory Command: "+command);
   }


}
