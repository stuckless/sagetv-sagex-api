package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 15/08/16 6:16 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/TVEditorialAPIFactory.html'>TVEditorialAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class TVEditorialAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetAllTVEditorials")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllTVEditorials",parameters,(Class[])null);
   }
   if (command.equals("GetEditorialTitle")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialTitle",parameters,Object.class);
   }
   if (command.equals("GetEditorialShow")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialShow",parameters,Object.class);
   }
   if (command.equals("GetEditorialText")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialText",parameters,Object.class);
   }
   if (command.equals("GetEditorialAirDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialAirDate",parameters,Object.class);
   }
   if (command.equals("GetEditorialNetwork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialNetwork",parameters,Object.class);
   }
   if (command.equals("HasEditorialImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasEditorialImage",parameters,Object.class);
   }
   if (command.equals("GetEditorialImage")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetEditorialImage",parameters,Object.class);
   }
   throw new RuntimeException("Invalid TVEditorialAPIFactory Command: "+command);
   }


}
