package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/TranscodeAPIFactory.html'>TranscodeAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class TranscodeAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetTranscodeFormats")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeFormats",parameters,(Class[])null);
   }
   if (command.equals("GetTranscodeFormatDetails")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeFormatDetails",parameters,java.lang.String.class);
   }
   if (command.equals("AddTranscodeFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddTranscodeFormat",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("RemoveTranscodeFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveTranscodeFormat",parameters,java.lang.String.class);
   }
   if (command.equals("AddTranscodeJob")) {
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddTranscodeJob", parameters, Object.class,java.lang.String.class,java.io.File.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 6) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddTranscodeJob", parameters, Object.class,java.lang.String.class,java.io.File.class,boolean.class,long.class,long.class);
      }
   }
   if (command.equals("AddTranscodeJob")) {
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddTranscodeJob", parameters, Object.class,java.lang.String.class,java.io.File.class,boolean.class);
      }
      if (parameters!=null && parameters.length == 6) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "AddTranscodeJob", parameters, Object.class,java.lang.String.class,java.io.File.class,boolean.class,long.class,long.class);
      }
   }
   if (command.equals("GetTranscodeJobStatus")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobStatus",parameters,int.class);
   }
   if (command.equals("CancelTranscodeJob")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CancelTranscodeJob",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobSourceFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobSourceFile",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobDestFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobDestFile",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobShouldKeepOriginal")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobShouldKeepOriginal",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobClipStart")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobClipStart",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobClipDuration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobClipDuration",parameters,int.class);
   }
   if (command.equals("GetTranscodeJobFormat")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobFormat",parameters,int.class);
   }
   if (command.equals("ClearTranscodedJobs")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearTranscodedJobs",parameters,(Class[])null);
   }
   if (command.equals("GetTranscodeJobs")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobs",parameters,(Class[])null);
   }
   if (command.equals("CanFileBeTranscoded")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CanFileBeTranscoded",parameters,Object.class);
   }
   if (command.equals("GetTranscodeJobCompletePercent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetTranscodeJobCompletePercent",parameters,int.class);
   }
   throw new RuntimeException("Invalid TranscodeAPIFactory Command: "+command);
   }


}
