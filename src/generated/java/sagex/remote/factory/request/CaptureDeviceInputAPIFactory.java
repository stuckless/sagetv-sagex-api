package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 15/08/16 6:16 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/CaptureDeviceInputAPIFactory.html'>CaptureDeviceInputAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class CaptureDeviceInputAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetInfraredTuningPlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInfraredTuningPlugin",parameters,java.lang.String.class);
   }
   if (command.equals("GetInfraredTuningPluginPortNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInfraredTuningPluginPortNumber",parameters,java.lang.String.class);
   }
   if (command.equals("SetInfraredTuningPluginAndPort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetInfraredTuningPluginAndPort",parameters,java.lang.String.class,java.lang.String.class,int.class);
   }
   if (command.equals("AutoTuneChannelTest")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AutoTuneChannelTest",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("AutoScanChannelInfo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AutoScanChannelInfo",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetInputMinimumChannelNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInputMinimumChannelNumber",parameters,java.lang.String.class);
   }
   if (command.equals("GetInputMaximumChannelNumber")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInputMaximumChannelNumber",parameters,java.lang.String.class);
   }
   if (command.equals("SetCaptureBrightness")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureBrightness",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("SetCaptureSaturation")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureSaturation",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("SetCaptureHue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureHue",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("SetCaptureContrast")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureContrast",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("SetCaptureSharpness")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetCaptureSharpness",parameters,java.lang.String.class,int.class);
   }
   if (command.equals("GetCaptureBrightness")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureBrightness",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureSaturation")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureSaturation",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureHue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureHue",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureContrast")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureContrast",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureSharpness")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureSharpness",parameters,java.lang.String.class);
   }
   if (command.equals("SetInfraredTunerRemoteName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetInfraredTunerRemoteName",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetInfraredTunerRemoteName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInfraredTunerRemoteName",parameters,java.lang.String.class);
   }
   if (command.equals("SetRFSignalIsCableTV")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetRFSignalIsCableTV",parameters,java.lang.String.class,boolean.class);
   }
   if (command.equals("IsRFSignalCableTV")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsRFSignalCableTV",parameters,java.lang.String.class);
   }
   if (command.equals("IsExternallyTunedRFInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsExternallyTunedRFInput",parameters,java.lang.String.class);
   }
   if (command.equals("GetConstantRFChannelInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetConstantRFChannelInput",parameters,java.lang.String.class);
   }
   if (command.equals("IsCaptureDeviceInputAudioVideo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsCaptureDeviceInputAudioVideo",parameters,java.lang.String.class);
   }
   if (command.equals("GetPhysicalInputType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPhysicalInputType",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceInputName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceInputName",parameters,java.lang.String.class);
   }
   if (command.equals("ConfigureInputForEPGDataLineup")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ConfigureInputForEPGDataLineup",parameters,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("ConfigureInputWithoutEPGData")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ConfigureInputWithoutEPGData",parameters,java.lang.String.class);
   }
   if (command.equals("ReleaseCaptureDeviceInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ReleaseCaptureDeviceInput",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceInputBeingViewed")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceInputBeingViewed",parameters,(Class[])null);
   }
   if (command.equals("GetCaptureDeviceInputRecordingMediaFile")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceInputRecordingMediaFile",parameters,Object.class);
   }
   if (command.equals("GetLineupForCaptureDeviceInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetLineupForCaptureDeviceInput",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceForInput")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceForInput",parameters,java.lang.String.class);
   }
   if (command.equals("GetSignalStrength")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSignalStrength",parameters,java.lang.String.class);
   }
   if (command.equals("GetCaptureDeviceInputBroadcastStandard")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetCaptureDeviceInputBroadcastStandard",parameters,java.lang.String.class);
   }
   throw new RuntimeException("Invalid CaptureDeviceInputAPIFactory Command: "+command);
   }


}
