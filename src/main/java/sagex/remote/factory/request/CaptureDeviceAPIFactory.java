package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/CaptureDeviceAPIFactory.html'>CaptureDeviceAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class CaptureDeviceAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetCaptureDevices")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDevices",parameters,null);
   }
   if (command.equals("GetCaptureDeviceInputs")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceInputs",parameters,java.lang.String.class);
   }
   if (command.equals("GetConfiguredCaptureDeviceInputs")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetConfiguredCaptureDeviceInputs",parameters,null);
   }
   if (command.equals("IsCaptureDeviceFunctioning")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCaptureDeviceFunctioning",parameters,java.lang.String.class);
   }
   if (command.equals("IsCaptureDeviceANetworkEncoder")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCaptureDeviceANetworkEncoder",parameters,java.lang.String.class);
   }
   if (command.equals("GetActiveCaptureDevices")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetActiveCaptureDevices",parameters,null);
   }
   if (command.equals("IsCaptureDeviceInUseByALiveClient")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCaptureDeviceInUseByALiveClient",parameters,java.lang.String.class);
   }
   if (command.equals("AddInputForRFChannel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddInputForRFChannel",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("GetLastUsedCaptureDevice")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLastUsedCaptureDevice",parameters,null);
   }
   if (command.equals("GetLastUsedCaptureDeviceInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLastUsedCaptureDeviceInput",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceCurrentRecordFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceCurrentRecordFile",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceQualities")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceQualities",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceDefaultQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceDefaultQuality",parameters,java.lang.String.class);
   }
   if (command.equals("SetCaptureDeviceDefaultQuality")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureDeviceDefaultQuality",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetCaptureDeviceAudioSource")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureDeviceAudioSource",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceAudioSource")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceAudioSource",parameters,java.lang.String.class);
   }
   if (command.equals("GetAudioCaptureSources")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAudioCaptureSources",parameters,null);
   }
   if (command.equals("IsCaptureDeviceHardwareEncoder")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCaptureDeviceHardwareEncoder",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceBroadcastStandard")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceBroadcastStandard",parameters,java.lang.String.class);
   }
   if (command.equals("SetCaptureDeviceDTVStandard")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureDeviceDTVStandard",parameters,java.lang.String.class,java.lang.String.class);
   }
   throw new RuntimeException("Invalid CaptureDeviceAPIFactory Command: "+command);
   }


}
