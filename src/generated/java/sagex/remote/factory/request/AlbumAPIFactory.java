package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 12/6/21 7:46 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/AlbumAPIFactory.html'>AlbumAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class AlbumAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetAllMusicArtists")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllMusicArtists",parameters,(Class[])null);
   }
   if (command.equals("GetAllMusicGenres")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllMusicGenres",parameters,(Class[])null);
   }
   if (command.equals("GetAlbums")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbums",parameters,(Class[])null);
   }
   if (command.equals("GetAllMusicForArtist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllMusicForArtist",parameters,java.lang.String.class);
   }
   if (command.equals("GetAllMusicForGenre")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllMusicForGenre",parameters,java.lang.String.class);
   }
   if (command.equals("GetAlbumTracks")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumTracks",parameters,Object.class);
   }
   if (command.equals("GetNumberOfTracks")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNumberOfTracks",parameters,Object.class);
   }
   if (command.equals("GetAlbumArtist")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumArtist",parameters,Object.class);
   }
   if (command.equals("GetAlbumArt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumArt",parameters,Object.class);
   }
   if (command.equals("GetAlbumName")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumName",parameters,Object.class);
   }
   if (command.equals("HasAlbumArt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"HasAlbumArt",parameters,Object.class);
   }
   if (command.equals("IsAlbumObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsAlbumObject",parameters,java.lang.Object.class);
   }
   if (command.equals("GetAlbumGenre")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumGenre",parameters,Object.class);
   }
   if (command.equals("GetAlbumYear")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAlbumYear",parameters,Object.class);
   }
   throw new RuntimeException("Invalid AlbumAPIFactory Command: "+command);
   }


}
