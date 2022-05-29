package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 5/27/22 7:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/PlaylistAPIFactory.html'>PlaylistAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class PlaylistAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("AddToPlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddToPlaylist",parameters,Object.class,java.lang.Object.class);
   }
   if (command.equals("GetName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetName",parameters,Object.class);
   }
   if (command.equals("GetNumberOfPlaylistItems")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNumberOfPlaylistItems",parameters,Object.class);
   }
   if (command.equals("GetPlaylistItemAt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylistItemAt",parameters,Object.class,int.class);
   }
   if (command.equals("GetPlaylistItemTypeAt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylistItemTypeAt",parameters,Object.class,int.class);
   }
   if (command.equals("GetPlaylistItems")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylistItems",parameters,Object.class);
   }
   if (command.equals("InsertIntoPlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"InsertIntoPlaylist",parameters,Object.class,int.class,java.lang.Object.class);
   }
   if (command.equals("MovePlaylistItemUp")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"MovePlaylistItemUp",parameters,Object.class,int.class);
   }
   if (command.equals("MovePlaylistItemDown")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"MovePlaylistItemDown",parameters,Object.class,int.class);
   }
   if (command.equals("RemovePlaylistItem")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemovePlaylistItem",parameters,Object.class,java.lang.Object.class);
   }
   if (command.equals("RemovePlaylistItemAt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemovePlaylistItemAt",parameters,Object.class,int.class);
   }
   if (command.equals("SetName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetName",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("IsPlaylistObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsPlaylistObject",parameters,java.lang.Object.class);
   }
   if (command.equals("GetPlaylists")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylists",parameters,(Class[])null);
   }
   if (command.equals("RemovePlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RemovePlaylist",parameters,Object.class);
   }
   if (command.equals("DoesPlaylistHaveVideo")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"DoesPlaylistHaveVideo",parameters,Object.class);
   }
   if (command.equals("AddPlaylist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AddPlaylist",parameters,java.lang.String.class);
   }
   if (command.equals("GetNowPlayingList")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNowPlayingList",parameters,(Class[])null);
   }
   if (command.equals("GetPlaylistProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylistProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("SetPlaylistProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetPlaylistProperty",parameters,Object.class,java.lang.String.class,java.lang.String.class);
   }
   if (command.equals("GetPlaylistProperties")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetPlaylistProperties",parameters,Object.class);
   }
   throw new RuntimeException("Invalid PlaylistAPIFactory Command: "+command);
   }


}
