package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/WidgetAPIFactory.html'>WidgetAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class WidgetAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("LoadSTVFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LoadSTVFile",parameters,java.io.File.class);
   }
   if (command.equals("ImportSTVFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ImportSTVFile",parameters,java.io.File.class);
   }
   if (command.equals("IsSTVModified")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsSTVModified",parameters,(Class[])null);
   }
   if (command.equals("GetAllWidgets")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllWidgets",parameters,(Class[])null);
   }
   if (command.equals("GetWidgetsByType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetsByType",parameters,java.lang.String.class);
   }
   if (command.equals("AddWidget")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddWidget",parameters,java.lang.String.class);
   }
   if (command.equals("AddWidgetWithSymbol")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddWidgetWithSymbol",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("RemoveWidget")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveWidget",parameters,Object.class);
   }
   if (command.equals("AddWidgetChild")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddWidgetChild",parameters,Object.class,Object.class);
   }
   if (command.equals("InsertWidgetChild")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"InsertWidgetChild",parameters,Object.class,Object.class,int.class);
   }
   if (command.equals("RemoveWidgetChild")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemoveWidgetChild",parameters,Object.class,Object.class);
   }
   if (command.equals("IsWidgetParentOf")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsWidgetParentOf",parameters,Object.class,Object.class);
   }
   if (command.equals("GetWidgetType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetType",parameters,Object.class);
   }
   if (command.equals("HasWidgetProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasWidgetProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetWidgetProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWidgetProperty",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetWidgetProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetWidgetName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetName",parameters,Object.class);
   }
   if (command.equals("SetWidgetName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetWidgetName",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetWidgetParents")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetParents",parameters,Object.class);
   }
   if (command.equals("GetWidgetChildren")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetChildren",parameters,Object.class);
   }
   if (command.equals("ExecuteWidgetChain")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ExecuteWidgetChain",parameters,Object.class);
   }
   if (command.equals("ExecuteWidgetChainInCurrentMenuContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ExecuteWidgetChainInCurrentMenuContext",parameters,Object.class);
   }
   if (command.equals("LaunchMenuWidget")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"LaunchMenuWidget",parameters,Object.class);
   }
   if (command.equals("GetCurrentSTVFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentSTVFile",parameters,(Class[])null);
   }
   if (command.equals("GetWidgetChild")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetChild",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetWidgetParent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetParent",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetCurrentMenuWidget")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCurrentMenuWidget",parameters,(Class[])null);
   }
   if (command.equals("GetWidgetMenuHistory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetMenuHistory",parameters,(Class[])null);
   }
   if (command.equals("GetWidgetMenuBackHistory")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetMenuBackHistory",parameters,(Class[])null);
   }
   if (command.equals("EvaluateExpression")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"EvaluateExpression",parameters,java.lang.String.class);
   }
   if (command.equals("SaveWidgetsAsXML")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SaveWidgetsAsXML",parameters,java.io.File.class,boolean.class);
   }
   if (command.equals("GetWidgetSymbol")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetWidgetSymbol",parameters,Object.class);
   }
   if (command.equals("FindWidgetBySymbol")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"FindWidgetBySymbol",parameters,java.lang.String.class);
   }
   if (command.equals("GetDefaultSTVFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetDefaultSTVFile",parameters,(Class[])null);
   }
   if (command.equals("GetUIWidgetContext")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetUIWidgetContext",parameters,(Class[])null);
   }
   if (command.equals("GetSTVName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSTVName",parameters,(Class[])null);
   }
   if (command.equals("GetSTVVersion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSTVVersion",parameters,(Class[])null);
   }
   throw new RuntimeException("Invalid WidgetAPIFactory Command: "+command);
   }


}
