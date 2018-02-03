package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/ShowAPIFactory.html'>ShowAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class ShowAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("IsShowEPGDataUnique")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsShowEPGDataUnique",parameters,Object.class);
   }
   if (command.equals("GetShowMisc")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowMisc",parameters,Object.class);
   }
   if (command.equals("GetShowCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowCategory",parameters,Object.class);
   }
   if (command.equals("GetShowSubCategory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowSubCategory",parameters,Object.class);
   }
   if (command.equals("GetShowCategoriesString")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetShowCategoriesString", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetShowCategoriesString", parameters, Object.class,java.lang.String.class);
      }
   }
   if (command.equals("GetShowCategoriesString")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetShowCategoriesString", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetShowCategoriesString", parameters, Object.class,java.lang.String.class);
      }
   }
   if (command.equals("GetShowCategoriesList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowCategoriesList",parameters,Object.class);
   }
   if (command.equals("GetShowDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowDescription",parameters,Object.class);
   }
   if (command.equals("GetShowEpisode")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowEpisode",parameters,Object.class);
   }
   if (command.equals("GetShowExpandedRatings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowExpandedRatings",parameters,Object.class);
   }
   if (command.equals("GetShowParentalRating")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowParentalRating",parameters,Object.class);
   }
   if (command.equals("GetShowRated")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowRated",parameters,Object.class);
   }
   if (command.equals("GetShowDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowDuration",parameters,Object.class);
   }
   if (command.equals("GetShowTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowTitle",parameters,Object.class);
   }
   if (command.equals("GetShowYear")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowYear",parameters,Object.class);
   }
   if (command.equals("GetShowExternalID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowExternalID",parameters,Object.class);
   }
   if (command.equals("GetOriginalAiringDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetOriginalAiringDate",parameters,Object.class);
   }
   if (command.equals("GetRoleTypes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRoleTypes",parameters,(Class[])null);
   }
   if (command.equals("GetPeopleInShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleInShow",parameters,Object.class);
   }
   if (command.equals("GetPersonListInShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonListInShow",parameters,Object.class);
   }
   if (command.equals("GetPeopleListInShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleListInShow",parameters,Object.class);
   }
   if (command.equals("GetPeopleAndCharacterListInShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleAndCharacterListInShow",parameters,Object.class);
   }
   if (command.equals("GetRolesInShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRolesInShow",parameters,Object.class);
   }
   if (command.equals("GetPeopleInShowInRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleInShowInRole",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPeopleInShowInRoles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleInShowInRoles",parameters,Object.class,java.lang.String[].class);
   }
   if (command.equals("GetPeopleAndCharacterInShowInRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleAndCharacterInShowInRole",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPeopleAndCharacterInShowInRoles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleAndCharacterInShowInRoles",parameters,Object.class,java.lang.String[].class);
   }
   if (command.equals("GetPeopleListInShowInRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleListInShowInRole",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPersonListInShowInRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonListInShowInRole",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPeopleListInShowInRoles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleListInShowInRoles",parameters,Object.class,java.lang.String[].class);
   }
   if (command.equals("GetPersonListInShowInRoles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonListInShowInRoles",parameters,Object.class,java.lang.String[].class);
   }
   if (command.equals("GetPeopleAndCharacterListInShowInRole")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleAndCharacterListInShowInRole",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPeopleAndCharacterListInShowInRoles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPeopleAndCharacterListInShowInRoles",parameters,Object.class,java.lang.String[].class);
   }
   if (command.equals("IsShowObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsShowObject",parameters,java.lang.Object.class);
   }
   if (command.equals("IsShowFirstRun")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsShowFirstRun",parameters,Object.class);
   }
   if (command.equals("IsShowReRun")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsShowReRun",parameters,Object.class);
   }
   if (command.equals("GetShowLanguage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowLanguage",parameters,Object.class);
   }
   if (command.equals("AddShow")) {
      if (parameters!=null && parameters.length == 17) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddShow", parameters, java.lang.String.class,boolean.class,java.lang.String.class,java.lang.String.class,long.class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String[].class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,long.class);
      }
      if (parameters!=null && parameters.length == 18) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddShow", parameters, java.lang.String.class,boolean.class,java.lang.String.class,java.lang.String.class,long.class,java.lang.String[].class,java.lang.String[].class,java.lang.String[].class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,long.class,int.class,int.class);
      }
   }
   if (command.equals("AddShow")) {
      if (parameters!=null && parameters.length == 17) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddShow", parameters, java.lang.String.class,boolean.class,java.lang.String.class,java.lang.String.class,long.class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String[].class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,long.class);
      }
      if (parameters!=null && parameters.length == 18) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddShow", parameters, java.lang.String.class,boolean.class,java.lang.String.class,java.lang.String.class,long.class,java.lang.String[].class,java.lang.String[].class,java.lang.String[].class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,java.lang.String[].class,java.lang.String.class,java.lang.String.class,long.class,int.class,int.class);
      }
   }
   if (command.equals("GetAiringsForShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringsForShow",parameters,Object.class,long.class);
   }
   if (command.equals("GetShowForExternalID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowForExternalID",parameters,java.lang.String.class);
   }
   if (command.equals("IsMovie")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMovie",parameters,Object.class);
   }
   if (command.equals("GetShowSeriesInfo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowSeriesInfo",parameters,Object.class);
   }
   if (command.equals("GetShowSeasonNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowSeasonNumber",parameters,Object.class);
   }
   if (command.equals("GetShowEpisodeNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowEpisodeNumber",parameters,Object.class);
   }
   if (command.equals("GetShowImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowImage",parameters,Object.class,java.lang.String.class,int.class,int.class);
   }
   if (command.equals("GetShowImageCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetShowImageCount",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("HasMovieImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasMovieImage",parameters,Object.class);
   }
   if (command.equals("GetMovieImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieImage",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetMovieImageURL")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieImageURL",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetMovieImageCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieImageCount",parameters,Object.class);
   }
   if (command.equals("GetMovieImageAtIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieImageAtIndex",parameters,Object.class,int.class,boolean.class);
   }
   if (command.equals("GetMovieImageURLAtIndex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieImageURLAtIndex",parameters,Object.class,int.class,boolean.class);
   }
   if (command.equals("HasPersonImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasPersonImage",parameters,Object.class);
   }
   if (command.equals("GetPersonImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonImage",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetPersonImageURL")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonImageURL",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetPersonDateOfBirth")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonDateOfBirth",parameters,Object.class);
   }
   if (command.equals("GetPersonDateOfDeath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonDateOfDeath",parameters,Object.class);
   }
   if (command.equals("GetPersonBirthplace")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonBirthplace",parameters,Object.class);
   }
   if (command.equals("GetPersonID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonID",parameters,Object.class);
   }
   if (command.equals("GetPersonForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPersonForID",parameters,int.class);
   }
   if (command.equals("GetMovieStarRating")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMovieStarRating",parameters,Object.class);
   }
   throw new RuntimeException("Invalid ShowAPIFactory Command: "+command);
   }


}
