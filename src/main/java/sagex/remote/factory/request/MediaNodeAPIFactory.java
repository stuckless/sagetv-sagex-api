package sagex.remote.factory.request;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaNodeAPIFactory.html'>MediaNodeAPIFactory</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */

import java.util.Map;
import sagex.remote.RemoteRequest;
import sagex.remote.xmlrpc.RequestHelper;

public class MediaNodeAPIFactory {
   public static RemoteRequest createRequest(String context, String command, String[] parameters) {
   if (command.equals("GetMediaSource")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaSource",parameters,java.lang.String.class);
   }
   if (command.equals("GetMediaView")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetMediaView",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("GetRelativeMediaSource")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetRelativeMediaSource",parameters,java.lang.String.class,java.lang.Object.class);
   }
   if (command.equals("IsNodeFolder")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodeFolder",parameters,Object.class);
   }
   if (command.equals("GetNodeChildren")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeChildren",parameters,Object.class);
   }
   if (command.equals("GetNodeNumChildren")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeNumChildren",parameters,Object.class);
   }
   if (command.equals("GetNodeChildAt")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeChildAt",parameters,Object.class,int.class);
   }
   if (command.equals("SetNodeSort")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetNodeSort",parameters,Object.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("GetNodeSortTechnique")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeSortTechnique",parameters,Object.class);
   }
   if (command.equals("IsNodeSortAscending")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodeSortAscending",parameters,Object.class);
   }
   if (command.equals("SetNodeFilter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetNodeFilter",parameters,Object.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("GetNodeNumFilters")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeNumFilters",parameters,Object.class);
   }
   if (command.equals("GetNodeFilterTechnique")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeFilterTechnique",parameters,Object.class,int.class);
   }
   if (command.equals("IsNodeFilterMatching")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodeFilterMatching",parameters,Object.class,int.class);
   }
   if (command.equals("AppendNodeFilter")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"AppendNodeFilter",parameters,Object.class,java.lang.String.class,boolean.class);
   }
   if (command.equals("IsNodeHierarchyRealized")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodeHierarchyRealized",parameters,Object.class);
   }
   if (command.equals("GetAllNodeDescendants")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetAllNodeDescendants",parameters,Object.class);
   }
   if (command.equals("GetNodeIcon")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeIcon",parameters,Object.class);
   }
   if (command.equals("GetNodeThumbnail")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeThumbnail",parameters,Object.class);
   }
   if (command.equals("GetNodePrimaryLabel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodePrimaryLabel",parameters,Object.class);
   }
   if (command.equals("GetNodeSecondaryLabel")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeSecondaryLabel",parameters,Object.class);
   }
   if (command.equals("IsNodePlayable")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodePlayable",parameters,Object.class);
   }
   if (command.equals("IsNodeVirtual")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsNodeVirtual",parameters,Object.class);
   }
   if (command.equals("GetNodeDataObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeDataObject",parameters,Object.class);
   }
   if (command.equals("GetNodeDataType")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeDataType",parameters,Object.class);
   }
   if (command.equals("GetNodeProperty")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeProperty",parameters,Object.class,java.lang.String.class);
   }
   if (command.equals("GetNodeParent")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeParent",parameters,Object.class);
   }
   if (command.equals("RefreshNode")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"RefreshNode",parameters,Object.class);
   }
   if (command.equals("SetNodeChecked")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetNodeChecked",parameters,Object.class,boolean.class);
   }
   if (command.equals("SetAllChildrenChecked")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"SetAllChildrenChecked",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetChildrenCheckedCount")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChildrenCheckedCount",parameters,Object.class,boolean.class);
   }
   if (command.equals("GetChildrenCheckedNodes")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetChildrenCheckedNodes",parameters,Object.class,boolean.class);
   }
   if (command.equals("CreateMediaNode")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"CreateMediaNode",parameters,java.lang.String.class,java.lang.String.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class);
   }
   if (command.equals("GetNodeFullPath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeFullPath",parameters,Object.class);
   }
   if (command.equals("GetNodeTypePath")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"GetNodeTypePath",parameters,Object.class);
   }
   if (command.equals("IsMediaNodeObject")) {
      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,"IsMediaNodeObject",parameters,java.lang.Object.class);
   }
   throw new RuntimeException("Invalid MediaNodeAPIFactory Command: "+command);
   }


}
