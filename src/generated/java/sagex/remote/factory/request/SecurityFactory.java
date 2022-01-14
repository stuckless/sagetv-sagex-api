package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 12/6/21 7:46 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/SecurityFactory.html'>SecurityFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class SecurityFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetActiveSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetActiveSecurityProfile",parameters,(Class[])null);
   }
   if (command.equals("GetDefaultSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDefaultSecurityProfile",parameters,(Class[])null);
   }
   if (command.equals("SetActiveSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetActiveSecurityProfile",parameters,java.lang.String.class);
   }
   if (command.equals("SetDefaultSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetDefaultSecurityProfile",parameters,java.lang.String.class);
   }
   if (command.equals("GetSecurityProfiles")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSecurityProfiles",parameters,(Class[])null);
   }
   if (command.equals("AddSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddSecurityProfile",parameters,java.lang.String.class);
   }
   if (command.equals("RemoveSecurityProfile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveSecurityProfile",parameters,java.lang.String.class);
   }
   if (command.equals("GetPredefinedPermissions")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPredefinedPermissions",parameters,(Class[])null);
   }
   if (command.equals("SetPermission")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPermission",parameters,java.lang.String.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("HasPermission")) {
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "HasPermission", parameters, java.lang.String.class,java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "HasPermission", parameters, java.lang.String.class);
      }
   }
   if (command.equals("HasPermission")) {
      if (parameters!=null && parameters.length == 2) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "HasPermission", parameters, java.lang.String.class,java.lang.String.class);
      }
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "HasPermission", parameters, java.lang.String.class);
      }
   }
   throw new RuntimeException("Invalid SecurityFactory Command: "+command);
   }


}
