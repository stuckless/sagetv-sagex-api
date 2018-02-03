package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/DatabaseFactory.html'>DatabaseFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class DatabaseFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("FilterByBoolMethod")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FilterByBoolMethod",parameters,java.lang.Object.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("FilterByMethod")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FilterByMethod",parameters,java.lang.Object.class,java.lang.String.class,java.lang.Object.class,boolean.class);
   }
   if (command.equals("FilterByMethodRegex")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FilterByMethodRegex",parameters,java.lang.Object.class,java.lang.String.class,java.util.regex.Pattern.class,boolean.class,boolean.class);
   }
   if (command.equals("FilterByRange")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FilterByRange",parameters,java.lang.Object.class,java.lang.String.class,java.lang.Comparable.class,java.lang.Comparable.class,boolean.class);
   }
   if (command.equals("GroupByMethod")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GroupByMethod",parameters,java.lang.Object.class,java.lang.String.class);
   }
   if (command.equals("GroupByArrayMethod")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GroupByArrayMethod",parameters,java.lang.Object.class,java.lang.String.class);
   }
   if (command.equals("Sort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"Sort",parameters,java.lang.Object.class,boolean.class,java.lang.Object.class);
   }
   if (command.equals("SortLexical")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SortLexical",parameters,java.lang.Object.class,boolean.class,java.lang.String.class);
   }
   if (command.equals("GetAiringsOnChannelAtTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringsOnChannelAtTime",parameters,Object.class,long.class,long.class,boolean.class);
   }
   if (command.equals("GetAiringsOnViewableChannelsAtTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAiringsOnViewableChannelsAtTime",parameters,long.class,long.class,boolean.class);
   }
   if (command.equals("GetAllNonMusicWithPerson")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllNonMusicWithPerson",parameters,java.lang.String.class);
   }
   if (command.equals("GetAllNonMusicWithTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllNonMusicWithTitle",parameters,java.lang.String.class);
   }
   if (command.equals("SearchByPerson")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByPerson", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByPerson", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchByPerson")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByPerson", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByPerson", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchByText")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByText", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByText", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchByText")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByText", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByText", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchByTitle")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByTitle", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByTitle", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchByTitle")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByTitle", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchByTitle", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeople")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeople", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeople", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeople")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeople", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeople", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitles")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitles", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitles", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitles")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitles", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitles", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeopleRegex")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleRegex", parameters, java.util.regex.Pattern.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleRegex", parameters, java.util.regex.Pattern.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeopleRegex")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleRegex", parameters, java.util.regex.Pattern.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleRegex", parameters, java.util.regex.Pattern.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeopleNTE")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleNTE", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleNTE", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForPeopleNTE")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleNTE", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForPeopleNTE", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitlesRegex")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesRegex", parameters, java.util.regex.Pattern.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesRegex", parameters, java.util.regex.Pattern.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitlesRegex")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesRegex", parameters, java.util.regex.Pattern.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesRegex", parameters, java.util.regex.Pattern.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitlesNTE")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesNTE", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesNTE", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchForTitlesNTE")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesNTE", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForTitlesNTE", parameters, java.lang.String.class,java.lang.String.class);
      }
   }
   if (command.equals("DataUnion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DataUnion",parameters,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("DataIntersection")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DataIntersection",parameters,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("SearchSelectedFields")) {
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 12) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedFields")) {
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 12) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedExactFields")) {
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedExactFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 12) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedExactFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedExactFields")) {
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedExactFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 12) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedExactFields", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedFieldsRegex")) {
      if (parameters!=null && parameters.length == 10) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsRegex", parameters, java.util.regex.Pattern.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsRegex", parameters, java.util.regex.Pattern.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedFieldsRegex")) {
      if (parameters!=null && parameters.length == 10) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsRegex", parameters, java.util.regex.Pattern.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsRegex", parameters, java.util.regex.Pattern.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedFieldsNTE")) {
      if (parameters!=null && parameters.length == 10) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsNTE", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsNTE", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("SearchSelectedFieldsNTE")) {
      if (parameters!=null && parameters.length == 10) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsNTE", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 11) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchSelectedFieldsNTE", parameters, java.lang.String.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,boolean.class,java.lang.String.class);
      }
   }
   if (command.equals("GetChannelsOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelsOnLineup",parameters,java.lang.String.class);
   }
   if (command.equals("GetAllTitles")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllTitles", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllTitles", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllTitles")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllTitles", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllTitles", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllPeople")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllPeople", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllPeople", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllPeople")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllPeople", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllPeople", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllCategories")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllCategories", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllCategories", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllCategories")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllCategories", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllCategories", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllGroupingCategories")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllGroupingCategories", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllGroupingCategories", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetAllGroupingCategories")) {
      if (parameters!=null && parameters.length == 0) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllGroupingCategories", parameters, (Class[])null);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetAllGroupingCategories", parameters, java.lang.String.class);
      }
   }
   if (command.equals("GetDatabaseLastModifiedTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDatabaseLastModifiedTime",parameters,java.lang.String.class);
   }
   if (command.equals("GetFilesWithImportPrefix")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetFilesWithImportPrefix",parameters,java.lang.Object.class,java.lang.String.class,boolean.class,boolean.class,boolean.class);
   }
   if (command.equals("GetMediaFilesWithImportPrefix")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaFilesWithImportPrefix",parameters,java.lang.Object.class,java.lang.String.class,boolean.class,boolean.class,boolean.class);
   }
   if (command.equals("IsDatabaseMemoryMaxed")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsDatabaseMemoryMaxed",parameters,(Class[])null);
   }
   if (command.equals("StripLeadingArticles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"StripLeadingArticles",parameters,java.lang.String.class);
   }
   if (command.equals("GetMediaMask")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaMask",parameters,Object.class);
   }
   if (command.equals("HasMediaMask")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasMediaMask",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SearchForChannel")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForChannel", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForChannel", parameters, java.lang.String.class,java.lang.Boolean.class);
      }
   }
   if (command.equals("SearchForChannel")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForChannel", parameters, java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "SearchForChannel", parameters, java.lang.String.class,java.lang.Boolean.class);
      }
   }
   throw new RuntimeException("Invalid DatabaseFactory Command: "+command);
   }


}
