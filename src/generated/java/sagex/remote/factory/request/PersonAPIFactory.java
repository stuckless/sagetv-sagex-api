package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PersonAPIFactory.html'>PersonAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class PersonAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
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
   if (command.equals("IsPersonObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPersonObject",parameters,java.lang.Object.class);
   }
   throw new RuntimeException("Invalid PersonAPIFactory Command: "+command);
   }


}
