package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/SystemMessageAPIFactory.html'>SystemMessageAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class SystemMessageAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetSystemAlertLevel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemAlertLevel",parameters,(Class[])null);
   }
   if (command.equals("GetSystemMessages")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessages",parameters,(Class[])null);
   }
   if (command.equals("ResetSystemAlertLevel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ResetSystemAlertLevel",parameters,(Class[])null);
   }
   if (command.equals("DeleteAllSystemMessages")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteAllSystemMessages",parameters,(Class[])null);
   }
   if (command.equals("DeleteSystemMessage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DeleteSystemMessage",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageString")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageString",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageTime",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageEndTime")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageEndTime",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageRepeatCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageRepeatCount",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageTypeName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageTypeName",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageTypeCode")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageTypeCode",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageLevel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageLevel",parameters,Object.class);
   }
   if (command.equals("GetSystemMessageVariable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageVariable",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("PostSystemMessage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"PostSystemMessage",parameters,int.class,int.class,java.lang.String.class,java.util.Properties.class);
   }
   if (command.equals("IsSystemMessageObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsSystemMessageObject",parameters,java.lang.Object.class);
   }
   if (command.equals("GetSystemMessageVariableNames")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSystemMessageVariableNames",parameters,Object.class);
   }
   throw new RuntimeException("Invalid SystemMessageAPIFactory Command: "+command);
   }


}
