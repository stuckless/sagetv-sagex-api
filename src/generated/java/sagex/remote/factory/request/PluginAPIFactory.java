package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PluginAPIFactory.html'>PluginAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class PluginAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetSageTVPluginRegistry")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetSageTVPluginRegistry",parameters,(Class[])null);
   }
   if (command.equals("GetAllAvailablePlugins")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllAvailablePlugins",parameters,(Class[])null);
   }
   if (command.equals("GetInstalledPlugins")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInstalledPlugins",parameters,(Class[])null);
   }
   if (command.equals("GetInstalledClientPlugins")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetInstalledClientPlugins",parameters,(Class[])null);
   }
   if (command.equals("GetAllPluginVersions")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllPluginVersions",parameters,java.lang.Object.class);
   }
   if (command.equals("GetAvailablePluginForID")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAvailablePluginForID",parameters,java.lang.String.class);
   }
   if (command.equals("IsPluginInstalled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginInstalled",parameters,Object.class);
   }
   if (command.equals("IsClientPluginInstalled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsClientPluginInstalled",parameters,Object.class);
   }
   if (command.equals("IsPluginInstalledSameVersion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginInstalledSameVersion",parameters,Object.class);
   }
   if (command.equals("IsClientPluginInstalledSameVersion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsClientPluginInstalledSameVersion",parameters,Object.class);
   }
   if (command.equals("IsPluginEnabled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginEnabled",parameters,Object.class);
   }
   if (command.equals("IsPluginFailed")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginFailed",parameters,Object.class);
   }
   if (command.equals("IsPluginDesktopOnly")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginDesktopOnly",parameters,Object.class);
   }
   if (command.equals("IsPluginBeta")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginBeta",parameters,Object.class);
   }
   if (command.equals("RefreshAvailablePlugins")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RefreshAvailablePlugins",parameters,(Class[])null);
   }
   if (command.equals("CanPluginBeDisabled")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CanPluginBeDisabled",parameters,Object.class);
   }
   if (command.equals("GetPluginName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginName",parameters,Object.class);
   }
   if (command.equals("GetPluginIdentifier")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginIdentifier",parameters,Object.class);
   }
   if (command.equals("GetPluginAuthor")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginAuthor",parameters,Object.class);
   }
   if (command.equals("GetPluginReleaseNotes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginReleaseNotes",parameters,Object.class);
   }
   if (command.equals("GetPluginModificationDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginModificationDate",parameters,Object.class);
   }
   if (command.equals("GetPluginCreationDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginCreationDate",parameters,Object.class);
   }
   if (command.equals("GetPluginInstallDate")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginInstallDate",parameters,Object.class);
   }
   if (command.equals("GetPluginDescription")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginDescription",parameters,Object.class);
   }
   if (command.equals("GetPluginVersion")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginVersion",parameters,Object.class);
   }
   if (command.equals("GetPluginResourcePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginResourcePath",parameters,Object.class);
   }
   if (command.equals("GetPluginScreenshots")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginScreenshots",parameters,Object.class);
   }
   if (command.equals("GetPluginDemoVideos")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginDemoVideos",parameters,Object.class);
   }
   if (command.equals("GetPluginWebsites")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginWebsites",parameters,Object.class);
   }
   if (command.equals("GetPluginType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginType",parameters,Object.class);
   }
   if (command.equals("GetPluginDependencies")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginDependencies",parameters,Object.class);
   }
   if (command.equals("IsPluginObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginObject",parameters,java.lang.Object.class);
   }
   if (command.equals("DisablePlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DisablePlugin",parameters,Object.class);
   }
   if (command.equals("EnablePlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"EnablePlugin",parameters,Object.class);
   }
   if (command.equals("GetPluginIncompatabilityReason")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginIncompatabilityReason",parameters,Object.class);
   }
   if (command.equals("GetClientPluginIncompatabilityReason")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetClientPluginIncompatabilityReason",parameters,Object.class);
   }
   if (command.equals("IsPluginCompatible")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginCompatible",parameters,Object.class);
   }
   if (command.equals("IsClientPluginCompatible")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsClientPluginCompatible",parameters,Object.class);
   }
   if (command.equals("InstallPlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"InstallPlugin",parameters,Object.class);
   }
   if (command.equals("InstallClientPlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"InstallClientPlugin",parameters,Object.class);
   }
   if (command.equals("UninstallPlugin")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"UninstallPlugin",parameters,Object.class);
   }
   if (command.equals("GetPluginProgress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginProgress",parameters,(Class[])null);
   }
   if (command.equals("GetClientPluginProgress")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetClientPluginProgress",parameters,(Class[])null);
   }
   if (command.equals("AreClientPluginsSupported")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AreClientPluginsSupported",parameters,(Class[])null);
   }
   if (command.equals("GetPluginConfigSettings")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigSettings",parameters,Object.class);
   }
   if (command.equals("GetPluginConfigValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigValue",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPluginConfigValues")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigValues",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPluginConfigType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigType",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetPluginConfigValue")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPluginConfigValue",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("SetPluginConfigValues")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPluginConfigValues",parameters,Object.class,java.lang.String.class,java.lang.String[].class);
   }
   if (command.equals("GetPluginConfigOptions")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigOptions",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPluginConfigHelpText")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigHelpText",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetPluginConfigLabel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginConfigLabel",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("ResetPluginConfiguration")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"ResetPluginConfiguration",parameters,Object.class);
   }
   if (command.equals("IsPluginConfigurable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginConfigurable",parameters,Object.class);
   }
   if (command.equals("GetPluginImplementation")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPluginImplementation",parameters,Object.class);
   }
   if (command.equals("IsPluginStartupComplete")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPluginStartupComplete",parameters,(Class[])null);
   }
   throw new RuntimeException("Invalid PluginAPIFactory Command: "+command);
   }


}
