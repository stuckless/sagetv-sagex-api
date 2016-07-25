package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 24/07/16 7:30 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/ChannelAPIFactory.html'>ChannelAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class ChannelAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetChannelDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelDescription",parameters,Object.class);
   }
   if (command.equals("GetChannelName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelName",parameters,Object.class);
   }
   if (command.equals("GetChannelNetwork")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelNetwork",parameters,Object.class);
   }
   if (command.equals("GetChannelNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelNumber",parameters,Object.class);
   }
   if (command.equals("GetChannelNumberForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelNumberForLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPhysicalChannelNumberForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPhysicalChannelNumberForLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsChannelViewable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelViewable",parameters,Object.class);
   }
   if (command.equals("IsChannelViewableOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelViewableOnLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsChannelViewableOnNumberOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelViewableOnNumberOnLineup",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetChannelNumbersForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelNumbersForLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("ClearChannelMappingOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearChannelMappingOnLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsChannelRemappedOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelRemappedOnLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetChannelMappingForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetChannelMappingForLineup",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetChannelMappingsForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetChannelMappingsForLineup",parameters,Object.class,java.lang.String.class,java.lang.String[].class);
   }
   if (command.equals("ClearPhysicalChannelMappingsOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ClearPhysicalChannelMappingsOnLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsPhysicalChannelRemappedOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPhysicalChannelRemappedOnLineup",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetPhysicalChannelMappingForLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPhysicalChannelMappingForLineup",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetStationID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetStationID",parameters,Object.class);
   }
   if (command.equals("GetChannelLogo")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogo", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogo", parameters, Object.class,java.lang.String.class,int.class,boolean.class);
      }
   }
   if (command.equals("GetChannelLogo")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogo", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogo", parameters, Object.class,java.lang.String.class,int.class,boolean.class);
      }
   }
   if (command.equals("IsChannelObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsChannelObject",parameters,Object.class);
   }
   if (command.equals("SetChannelViewabilityForChannelNumberOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetChannelViewabilityForChannelNumberOnLineup",parameters,Object.class,java.lang.String.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("SetChannelViewabilityForChannelOnLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetChannelViewabilityForChannelOnLineup",parameters,Object.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("GetChannelForStationID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelForStationID",parameters,int.class);
   }
   if (command.equals("AddChannel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddChannel",parameters,java.lang.String.class,java.lang.String.class,java.lang.String.class,int.class);
   }
   if (command.equals("GetAllChannels")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllChannels",parameters,(Class)null);
   }
   if (command.equals("GetChannelLogoCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChannelLogoCount",parameters,Object.class);
   }
   if (command.equals("GetChannelLogoURL")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogoURL", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogoURL", parameters, Object.class,java.lang.String.class,int.class,boolean.class);
      }
   }
   if (command.equals("GetChannelLogoURL")) {
      if (parameters!=null && parameters.length == 1) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogoURL", parameters, Object.class);
      }
      if (parameters!=null && parameters.length == 4) {
         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, "GetChannelLogoURL", parameters, Object.class,java.lang.String.class,int.class,boolean.class);
      }
   }
   throw new RuntimeException("Invalid ChannelAPIFactory Command: "+command);
   }


}
