package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 03/02/18 8:59 AM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/MediaNodeAPI.html'>MediaNodeAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class MediaNodeAPI {
/**
Retrieves a MediaNode which is the root of the specified 'Media Source'. All names are case insensitive.
 Valid names are:
 Filesystem - provides a view of the native filesystem
 VideoNavigator - provides various views of the imported videos
 MusicNavigator - provides various views of the imported music
 MusicVideosNavigator - provides various views of the imported videos with the 'music videos' category
 MoviesNavigator - provides various views of all content with the 'Movie' category or that are DVDs or BluRays
 TVNavigator - provides various views of recorded TV contentYou can also use names that are "ContentByGrouping" or just "Content".
 Valid values for "Content" are:
 Clips - all video files with a duration under 10 mins (controlled by the property max_duration_to_be_a_clip)
 Music or ImportedMusic - all imported music files
 Videos or ImportedVideso - all imported video files
 Picture or Photos or ImportedPictures or ImportedPhotos - all imported picture files
 DVDs or ImportedDVDs - all imported DVDs
 BluRays or ImportedBluRays - all imported BluRays
 Movies - all videos or TV recordings with the 'Movie' category or that are DVDs or BluRays
 MusicVideos - all imported videos with the 'Music Video' category
 TV - all recorded TV content
 MediaFiles - all files in SageTV
 Compilations - all music files that are by 'Various Artist'
 MusicPlaylists - all music playlists
 VideoPlaylists - all video playlistsValid values for "Grouping" are:
 Folder - grouped according to their relative import path
 Category or Genre - grouped by category, for music files they are then subgrouped by Artist and then Album
 Year - grouped by year, for music files they are subgrouped by Album
 Director - grouped by Director
 Actor - grouped by actors/actress
 Studio - grouped by the studio that produced the content if known
 Title - grouped by title
 Series - grouped by television series if known (SeriesInfo object)
 Album - grouped by album
 Artist - grouped by artist and then subgrouped by album
 Channel - grouped by channel

Parameters:
Name- the name of the media source
Returns:
a MediaNode which contains the hierarchy for the specified media source
Since:
7.0
 */
public static Object GetMediaSource (java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetMediaSource", new Object[] {Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Retrieves a MediaNode which is the root of the specified 'Media Source'. All names are case insensitive.
 Valid names are:
 Filesystem - provides a view of the native filesystem
 VideoNavigator - provides various views of the imported videos
 MusicNavigator - provides various views of the imported music
 MusicVideosNavigator - provides various views of the imported videos with the 'music videos' category
 MoviesNavigator - provides various views of all content with the 'Movie' category or that are DVDs or BluRays
 TVNavigator - provides various views of recorded TV contentYou can also use names that are "ContentByGrouping" or just "Content".
 Valid values for "Content" are:
 Clips - all video files with a duration under 10 mins (controlled by the property max_duration_to_be_a_clip)
 Music or ImportedMusic - all imported music files
 Videos or ImportedVideso - all imported video files
 Picture or Photos or ImportedPictures or ImportedPhotos - all imported picture files
 DVDs or ImportedDVDs - all imported DVDs
 BluRays or ImportedBluRays - all imported BluRays
 Movies - all videos or TV recordings with the 'Movie' category or that are DVDs or BluRays
 MusicVideos - all imported videos with the 'Music Video' category
 TV - all recorded TV content
 MediaFiles - all files in SageTV
 Compilations - all music files that are by 'Various Artist'
 MusicPlaylists - all music playlists
 VideoPlaylists - all video playlistsValid values for "Grouping" are:
 Folder - grouped according to their relative import path
 Category or Genre - grouped by category, for music files they are then subgrouped by Artist and then Album
 Year - grouped by year, for music files they are subgrouped by Album
 Director - grouped by Director
 Actor - grouped by actors/actress
 Studio - grouped by the studio that produced the content if known
 Title - grouped by title
 Series - grouped by television series if known (SeriesInfo object)
 Album - grouped by album
 Artist - grouped by artist and then subgrouped by album
 Channel - grouped by channel

Parameters:
Name- the name of the media source
Returns:
a MediaNode which contains the hierarchy for the specified media source
Since:
7.0
 */
public static Object GetMediaSource (UIContext _uicontext,java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaSource", new Object[] {Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
Similar to the GetMediaSource API call; but the second argument allows specifying the actual data set to
 be used for the view. The name describes the type of content or grouping just like in GetMediaSource. Can be used for
 presenting a subset of another view or for creating a MediaNode view of a fixed list of data such as a list of MediaFiles or Actors.

Parameters:
Name- the view name to use
Data- the dataset that defines the content in the view, can be a Collection, Object[] or a single object
Returns:
a MediaNode that represents the specified Data using the specified view Name
Since:
7.0
 */
public static Object GetMediaView (java.lang.String Name, java.lang.Object Data) {
  Object o = sagex.SageAPI.call("GetMediaView", new Object[] {Name,Data});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Similar to the GetMediaSource API call; but the second argument allows specifying the actual data set to
 be used for the view. The name describes the type of content or grouping just like in GetMediaSource. Can be used for
 presenting a subset of another view or for creating a MediaNode view of a fixed list of data such as a list of MediaFiles or Actors.

Parameters:
Name- the view name to use
Data- the dataset that defines the content in the view, can be a Collection, Object[] or a single object
Returns:
a MediaNode that represents the specified Data using the specified view Name
Since:
7.0
 */
public static Object GetMediaView (UIContext _uicontext,java.lang.String Name, java.lang.Object Data) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaView", new Object[] {Name,Data});
  if (o!=null) return (Object) o;
  return null;
}

/**
Creates a MediaNode view with a relative root for a specified media source. This is currently only useable
 with the 'Filesystem' media source

Parameters:
Name- should be Filesystem; anything else will behave like the GetMediaSource API call
RelativeRoot- the subdirectory which should be the root of this view
Returns:
a MediaNode that represents the relative view of the specified media source
Since:
7.0
 */
public static Object GetRelativeMediaSource (java.lang.String Name, java.lang.Object RelativeRoot) {
  Object o = sagex.SageAPI.call("GetRelativeMediaSource", new Object[] {Name,RelativeRoot});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a MediaNode view with a relative root for a specified media source. This is currently only useable
 with the 'Filesystem' media source

Parameters:
Name- should be Filesystem; anything else will behave like the GetMediaSource API call
RelativeRoot- the subdirectory which should be the root of this view
Returns:
a MediaNode that represents the relative view of the specified media source
Since:
7.0
 */
public static Object GetRelativeMediaSource (UIContext _uicontext,java.lang.String Name, java.lang.Object RelativeRoot) {
  Object o = sagex.SageAPI.call(_uicontext, "GetRelativeMediaSource", new Object[] {Name,RelativeRoot});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns true if the specified MediaNode has children

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the specified MediaNode has children, false otherwise
Since:
7.0
 */
public static boolean IsNodeFolder (Object MediaNode) {
  Object o = sagex.SageAPI.call("IsNodeFolder", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified MediaNode has children

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the specified MediaNode has children, false otherwise
Since:
7.0
 */
public static boolean IsNodeFolder (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodeFolder", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns an array of the children of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
an array of the children of the specified MediaNode
Since:
7.0
 */
public static Object[] GetNodeChildren (Object MediaNode) {
  return (Object[]) sagex.SageAPI.call("GetNodeChildren", new Object[] {MediaNode});
}

/**
 * UI Context Aware Call<br>
Returns an array of the children of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
an array of the children of the specified MediaNode
Since:
7.0
 */
public static Object[] GetNodeChildren (UIContext _uicontext,Object MediaNode) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetNodeChildren", new Object[] {MediaNode});
}

/**
Returns the number of children of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the number of children of the specified MediaNode
Since:
7.0
 */
public static int GetNodeNumChildren (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeNumChildren", new Object[] {MediaNode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of children of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the number of children of the specified MediaNode
Since:
7.0
 */
public static int GetNodeNumChildren (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeNumChildren", new Object[] {MediaNode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the child of the specified MediaNode at the given index

Parameters:
MediaNode- the specified MediaNode
Index- the index of the child to return (0-based)
Returns:
the child of the specified MediaNode at the given index
Since:
7.0
 */
public static Object GetNodeChildAt (Object MediaNode, int Index) {
  Object o = sagex.SageAPI.call("GetNodeChildAt", new Object[] {MediaNode,Index});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the child of the specified MediaNode at the given index

Parameters:
MediaNode- the specified MediaNode
Index- the index of the child to return (0-based)
Returns:
the child of the specified MediaNode at the given index
Since:
7.0
 */
public static Object GetNodeChildAt (UIContext _uicontext,Object MediaNode, int Index) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeChildAt", new Object[] {MediaNode,Index});
  if (o!=null) return (Object) o;
  return null;
}

/**
Sets the sorting technique used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 MediaNodes that are folders are always listed first when sorting. Some of the sorting techniques
 can also ignore 'the' as a prefix; this is controlled by the property "ui/ignore_the_when_sorting" which defaults to true.
 Valid sorting technique names are: Date, Size, Name (can ignore the), Filename, Track, Duration, Title (can ignore the),
 Artist (can ignore the), Album (can ignore the), Category, Year, Rating, Count, EpisodeName, EpisodeID, Rated, Runtime,
 Studio (can ignore the), Fullpath, OriginalAirDate, ChannelName, Intelligent

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the sorting technique to use, case insensitive
Ascending- true if the sorting should occur in ascending order, false otherwise
Since:
7.0
 */
public static void SetNodeSort (Object MediaNode, java.lang.String Technique, boolean Ascending) {
   sagex.SageAPI.call("SetNodeSort", new Object[] {MediaNode,Technique,Ascending});
}

/**
 * UI Context Aware Call<br>
Sets the sorting technique used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 MediaNodes that are folders are always listed first when sorting. Some of the sorting techniques
 can also ignore 'the' as a prefix; this is controlled by the property "ui/ignore_the_when_sorting" which defaults to true.
 Valid sorting technique names are: Date, Size, Name (can ignore the), Filename, Track, Duration, Title (can ignore the),
 Artist (can ignore the), Album (can ignore the), Category, Year, Rating, Count, EpisodeName, EpisodeID, Rated, Runtime,
 Studio (can ignore the), Fullpath, OriginalAirDate, ChannelName, Intelligent

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the sorting technique to use, case insensitive
Ascending- true if the sorting should occur in ascending order, false otherwise
Since:
7.0
 */
public static void SetNodeSort (UIContext _uicontext,Object MediaNode, java.lang.String Technique, boolean Ascending) {
   sagex.SageAPI.call(_uicontext, "SetNodeSort", new Object[] {MediaNode,Technique,Ascending});
}

/**
Returns the name of the current sorting technique used by the specified MediaNode hierarchy.

Parameters:
MediaNode- the specified MediaNode
Returns:
the name of the current sorting technique used by the specified MediaNode hierarchy.
Since:
7.0
 */
public static java.lang.String GetNodeSortTechnique (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeSortTechnique", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the current sorting technique used by the specified MediaNode hierarchy.

Parameters:
MediaNode- the specified MediaNode
Returns:
the name of the current sorting technique used by the specified MediaNode hierarchy.
Since:
7.0
 */
public static java.lang.String GetNodeSortTechnique (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeSortTechnique", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the current sorting technique used by the specified MediaNode hierarchy is in ascending order, false otherwise

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the current sorting technique used by the specified MediaNode hierarchy is in ascending order, false otherwise
Since:
7.0
 */
public static boolean IsNodeSortAscending (Object MediaNode) {
  Object o = sagex.SageAPI.call("IsNodeSortAscending", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the current sorting technique used by the specified MediaNode hierarchy is in ascending order, false otherwise

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the current sorting technique used by the specified MediaNode hierarchy is in ascending order, false otherwise
Since:
7.0
 */
public static boolean IsNodeSortAscending (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodeSortAscending", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets the filtering techniques used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 Filters can either be inclusive or exclusive. This method will clear all other filters and set this as the only filter.
 Valid filtering technique names are: Directories, Pictures, Videos, Music, DVD, BluRay, TV, Watched, Archived, DontLike, Favorite,
 HDTV, ManualRecord, FirstRun, CompleteRecording

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the filtering technique to use, case insensitive
MatchPasses- true if the items matching the filter should be retained, false if matching items should be removed
Since:
7.0
 */
public static void SetNodeFilter (Object MediaNode, java.lang.String Technique, boolean MatchPasses) {
   sagex.SageAPI.call("SetNodeFilter", new Object[] {MediaNode,Technique,MatchPasses});
}

/**
 * UI Context Aware Call<br>
Sets the filtering techniques used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 Filters can either be inclusive or exclusive. This method will clear all other filters and set this as the only filter.
 Valid filtering technique names are: Directories, Pictures, Videos, Music, DVD, BluRay, TV, Watched, Archived, DontLike, Favorite,
 HDTV, ManualRecord, FirstRun, CompleteRecording

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the filtering technique to use, case insensitive
MatchPasses- true if the items matching the filter should be retained, false if matching items should be removed
Since:
7.0
 */
public static void SetNodeFilter (UIContext _uicontext,Object MediaNode, java.lang.String Technique, boolean MatchPasses) {
   sagex.SageAPI.call(_uicontext, "SetNodeFilter", new Object[] {MediaNode,Technique,MatchPasses});
}

/**
Gets the number of filters that are currently set for the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Returns:
the number of filters that are currently set for the specified MediaNode.
Since:
7.0
 */
public static int GetNodeNumFilters (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeNumFilters", new Object[] {MediaNode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Gets the number of filters that are currently set for the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Returns:
the number of filters that are currently set for the specified MediaNode.
Since:
7.0
 */
public static int GetNodeNumFilters (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeNumFilters", new Object[] {MediaNode});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the name of the current filtering technique used by the specified MediaNode hierarchy. Since
 multiple filters can be set; an index must be specified to determine which one to get the technique of

Parameters:
MediaNode- the specified MediaNode
FilterIndex- the 0-based index of the filtering technique to retrieve
Returns:
the name of the current filtering technique used by the specified MediaNode hierarchy at the specified index, null if the index is out of bounds
Since:
7.0
 */
public static java.lang.String GetNodeFilterTechnique (Object MediaNode, int FilterIndex) {
  Object o = sagex.SageAPI.call("GetNodeFilterTechnique", new Object[] {MediaNode,FilterIndex});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the current filtering technique used by the specified MediaNode hierarchy. Since
 multiple filters can be set; an index must be specified to determine which one to get the technique of

Parameters:
MediaNode- the specified MediaNode
FilterIndex- the 0-based index of the filtering technique to retrieve
Returns:
the name of the current filtering technique used by the specified MediaNode hierarchy at the specified index, null if the index is out of bounds
Since:
7.0
 */
public static java.lang.String GetNodeFilterTechnique (UIContext _uicontext,Object MediaNode, int FilterIndex) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeFilterTechnique", new Object[] {MediaNode,FilterIndex});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the match state of the current filtering technique used by the specified MediaNode hierarchy. Since
 multiple filters can be set; an index must be specified to determine which one to get the matching state of

Parameters:
MediaNode- the specified MediaNode
FilterIndex- the 0-based index of the filtering match state to retrieve
Returns:
true if the current filtering technique used by the specified MediaNode hierarchy at the specified index is MatchPasses, false otherwise or if the index is out of bounds
Since:
7.0
 */
public static boolean IsNodeFilterMatching (Object MediaNode, int FilterIndex) {
  Object o = sagex.SageAPI.call("IsNodeFilterMatching", new Object[] {MediaNode,FilterIndex});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns the match state of the current filtering technique used by the specified MediaNode hierarchy. Since
 multiple filters can be set; an index must be specified to determine which one to get the matching state of

Parameters:
MediaNode- the specified MediaNode
FilterIndex- the 0-based index of the filtering match state to retrieve
Returns:
true if the current filtering technique used by the specified MediaNode hierarchy at the specified index is MatchPasses, false otherwise or if the index is out of bounds
Since:
7.0
 */
public static boolean IsNodeFilterMatching (UIContext _uicontext,Object MediaNode, int FilterIndex) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodeFilterMatching", new Object[] {MediaNode,FilterIndex});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Adds a filtering technique to used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 Filters can either be inclusive or exclusive. This method will not clear other filters that have been set.
 Valid filtering technique names are: Directories, Pictures, Videos, Music, DVD, BluRay, TV, Watched, Archived, DontLike, Favorite,
 HDTV, ManualRecord, FirstRun, CompleteRecording

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the filtering technique to use, case insensitive
MatchPasses- true if the items matching the filter should be retained, false if matching items should be removed
Since:
7.0
 */
public static void AppendNodeFilter (Object MediaNode, java.lang.String Technique, boolean MatchPasses) {
   sagex.SageAPI.call("AppendNodeFilter", new Object[] {MediaNode,Technique,MatchPasses});
}

/**
 * UI Context Aware Call<br>
Adds a filtering technique to used by the specified MediaNode hierarchy. This effects all levels of the hierarchy.
 Filters can either be inclusive or exclusive. This method will not clear other filters that have been set.
 Valid filtering technique names are: Directories, Pictures, Videos, Music, DVD, BluRay, TV, Watched, Archived, DontLike, Favorite,
 HDTV, ManualRecord, FirstRun, CompleteRecording

Parameters:
MediaNode- the specified MediaNode
Technique- the name of the filtering technique to use, case insensitive
MatchPasses- true if the items matching the filter should be retained, false if matching items should be removed
Since:
7.0
 */
public static void AppendNodeFilter (UIContext _uicontext,Object MediaNode, java.lang.String Technique, boolean MatchPasses) {
   sagex.SageAPI.call(_uicontext, "AppendNodeFilter", new Object[] {MediaNode,Technique,MatchPasses});
}

/**
Returns true if the entire set of data objects that back this MediaNode hierarchy has already been realized.
 This will be true for fixed sets of data; but false for abstractions like the filesystem. When this is true the
 API call GetAllNodeDescendants will return a valid result.

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the entire set of data objects that back this MediaNode hierarchy has already been realized, false otherwise
Since:
7.0
 */
public static boolean IsNodeHierarchyRealized (Object MediaNode) {
  Object o = sagex.SageAPI.call("IsNodeHierarchyRealized", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the entire set of data objects that back this MediaNode hierarchy has already been realized.
 This will be true for fixed sets of data; but false for abstractions like the filesystem. When this is true the
 API call GetAllNodeDescendants will return a valid result.

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the entire set of data objects that back this MediaNode hierarchy has already been realized, false otherwise
Since:
7.0
 */
public static boolean IsNodeHierarchyRealized (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodeHierarchyRealized", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the data set that represents all the children under the specified MediaNode if that
 data set has already been realized.

Parameters:
MediaNode- the specified MediaNode
Returns:
a Collection which holds all of the resulting descendants of the specified Media Node; this Collection should NOT be modified
Since:
7.0
 */
public static java.util.Collection GetAllNodeDescendants (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetAllNodeDescendants", new Object[] {MediaNode});
  if (o!=null) return (java.util.Collection) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the data set that represents all the children under the specified MediaNode if that
 data set has already been realized.

Parameters:
MediaNode- the specified MediaNode
Returns:
a Collection which holds all of the resulting descendants of the specified Media Node; this Collection should NOT be modified
Since:
7.0
 */
public static java.util.Collection GetAllNodeDescendants (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetAllNodeDescendants", new Object[] {MediaNode});
  if (o!=null) return (java.util.Collection) o;
  return null;
}

/**
Returns the icon image associated with the specified MediaNode. This is currently the same as GetNodeThumbnail.

Parameters:
MediaNode- the specified MediaNode
Returns:
an Object which represents the icon for this MediaNode; this may be a MetaImage or a resource path that can be used to load an image
Since:
7.0
 */
public static java.lang.Object GetNodeIcon (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeIcon", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the icon image associated with the specified MediaNode. This is currently the same as GetNodeThumbnail.

Parameters:
MediaNode- the specified MediaNode
Returns:
an Object which represents the icon for this MediaNode; this may be a MetaImage or a resource path that can be used to load an image
Since:
7.0
 */
public static java.lang.Object GetNodeIcon (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeIcon", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns the thumbnail image associated with the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Returns:
an Object which represents the thumbnail for this MediaNode; this may be a MetaImage or a resource path that can be used to load an image
Since:
7.0
 */
public static java.lang.Object GetNodeThumbnail (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeThumbnail", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the thumbnail image associated with the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Returns:
an Object which represents the thumbnail for this MediaNode; this may be a MetaImage or a resource path that can be used to load an image
Since:
7.0
 */
public static java.lang.Object GetNodeThumbnail (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeThumbnail", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns a string representation of the primary data associated with the specified MediaNode suitable for display in the UI.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string representation of the primary data associated with the specified MediaNode suitable for display in the UI
Since:
7.0
 */
public static java.lang.String GetNodePrimaryLabel (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodePrimaryLabel", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string representation of the primary data associated with the specified MediaNode suitable for display in the UI.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string representation of the primary data associated with the specified MediaNode suitable for display in the UI
Since:
7.0
 */
public static java.lang.String GetNodePrimaryLabel (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodePrimaryLabel", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a string representation of the secondary data associated with the specified MediaNode suitable for display in the UI.
 This will usually relate to whatever the current sorting technique is.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string representation of the secondary data associated with the specified MediaNode suitable for display in the UI
Since:
7.0
 */
public static java.lang.String GetNodeSecondaryLabel (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeSecondaryLabel", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string representation of the secondary data associated with the specified MediaNode suitable for display in the UI.
 This will usually relate to whatever the current sorting technique is.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string representation of the secondary data associated with the specified MediaNode suitable for display in the UI
Since:
7.0
 */
public static java.lang.String GetNodeSecondaryLabel (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeSecondaryLabel", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the Object that this MediaNode wraps is suitable for passing to the Watch API call.

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the Object that this MediaNode wraps is suitable for passing to the Watch API call
Since:
7.0
 */
public static boolean IsNodePlayable (Object MediaNode) {
  Object o = sagex.SageAPI.call("IsNodePlayable", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the Object that this MediaNode wraps is suitable for passing to the Watch API call.

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the Object that this MediaNode wraps is suitable for passing to the Watch API call
Since:
7.0
 */
public static boolean IsNodePlayable (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodePlayable", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns true if the specified MediaNode doesn't wrap an actual data object; but just an abstraction of a hierarchy

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the specified MediaNode doesn't wrap an actual data object; but just an abstraction of a hierarchy
Since:
7.0
 */
public static boolean IsNodeVirtual (Object MediaNode) {
  Object o = sagex.SageAPI.call("IsNodeVirtual", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified MediaNode doesn't wrap an actual data object; but just an abstraction of a hierarchy

Parameters:
MediaNode- the specified MediaNode
Returns:
true if the specified MediaNode doesn't wrap an actual data object; but just an abstraction of a hierarchy
Since:
7.0
 */
public static boolean IsNodeVirtual (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "IsNodeVirtual", new Object[] {MediaNode});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the Object that is wrapped by the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the Object that is wrapped by the specified MediaNode
Since:
7.0
 */
public static java.lang.Object GetNodeDataObject (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeDataObject", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Object that is wrapped by the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the Object that is wrapped by the specified MediaNode
Since:
7.0
 */
public static java.lang.Object GetNodeDataObject (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeDataObject", new Object[] {MediaNode});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns the type of the Object that is wrapped by the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the type of the Object that is wrapped by the specified MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeDataType (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeDataType", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the type of the Object that is wrapped by the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the type of the Object that is wrapped by the specified MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeDataType (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeDataType", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a specific property associated with this MediaNode. This varies depending upon the data type of the
 MediaNode. For MediaFile based nodes this will end up calling GetMediaFileMetadata.

Parameters:
MediaNode- the specified MediaNode
PropertyName- the name of the property
Returns:
the value of the specified property for the specified MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeProperty (Object MediaNode, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("GetNodeProperty", new Object[] {MediaNode,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a specific property associated with this MediaNode. This varies depending upon the data type of the
 MediaNode. For MediaFile based nodes this will end up calling GetMediaFileMetadata.

Parameters:
MediaNode- the specified MediaNode
PropertyName- the name of the property
Returns:
the value of the specified property for the specified MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeProperty (UIContext _uicontext,Object MediaNode, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeProperty", new Object[] {MediaNode,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the MediaNode parent of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the MediaNode parent of the specified MediaNode or null if it doesn't have a parent
Since:
7.0
 */
public static Object GetNodeParent (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeParent", new Object[] {MediaNode});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the MediaNode parent of the specified MediaNode

Parameters:
MediaNode- the specified MediaNode
Returns:
the MediaNode parent of the specified MediaNode or null if it doesn't have a parent
Since:
7.0
 */
public static Object GetNodeParent (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeParent", new Object[] {MediaNode});
  if (o!=null) return (Object) o;
  return null;
}

/**
Refreshes the hierarchy associated with the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Since:
7.0
 */
public static void RefreshNode (Object MediaNode) {
   sagex.SageAPI.call("RefreshNode", new Object[] {MediaNode});
}

/**
 * UI Context Aware Call<br>
Refreshes the hierarchy associated with the specified MediaNode.

Parameters:
MediaNode- the specified MediaNode
Since:
7.0
 */
public static void RefreshNode (UIContext _uicontext,Object MediaNode) {
   sagex.SageAPI.call(_uicontext, "RefreshNode", new Object[] {MediaNode});
}

/**
Sets a flag on this MediaNode to indicate it is in the checked state. Useful for tracking multi-selection of
 child MediaNodes.

Parameters:
MediaNode- the specified MediaNode
State- true if the MediaNode should be marked as being in the checked state, false otherwise
Since:
7.0
 */
public static void SetNodeChecked (Object MediaNode, boolean State) {
   sagex.SageAPI.call("SetNodeChecked", new Object[] {MediaNode,State});
}

/**
 * UI Context Aware Call<br>
Sets a flag on this MediaNode to indicate it is in the checked state. Useful for tracking multi-selection of
 child MediaNodes.

Parameters:
MediaNode- the specified MediaNode
State- true if the MediaNode should be marked as being in the checked state, false otherwise
Since:
7.0
 */
public static void SetNodeChecked (UIContext _uicontext,Object MediaNode, boolean State) {
   sagex.SageAPI.call(_uicontext, "SetNodeChecked", new Object[] {MediaNode,State});
}

/**
Sets a flag on all the children of this MediaNode to indicate they are in the checked state. Useful for tracking multi-selection of
 child MediaNodes.

Parameters:
MediaNode- the specified MediaNode
State- true if all the children of the MediaNode should be marked as being in the checked state, false if they should be marked as unchecked
Since:
7.0
 */
public static void SetAllChildrenChecked (Object MediaNode, boolean State) {
   sagex.SageAPI.call("SetAllChildrenChecked", new Object[] {MediaNode,State});
}

/**
 * UI Context Aware Call<br>
Sets a flag on all the children of this MediaNode to indicate they are in the checked state. Useful for tracking multi-selection of
 child MediaNodes.

Parameters:
MediaNode- the specified MediaNode
State- true if all the children of the MediaNode should be marked as being in the checked state, false if they should be marked as unchecked
Since:
7.0
 */
public static void SetAllChildrenChecked (UIContext _uicontext,Object MediaNode, boolean State) {
   sagex.SageAPI.call(_uicontext, "SetAllChildrenChecked", new Object[] {MediaNode,State});
}

/**
Returns the number of children of the specified MediaNode that are in the specified checked state.

Parameters:
MediaNode- the specified MediaNode
State- true if the returned count should be for checked children, false if it should be for unchecked children
Returns:
the number of children of the specified MediaNode that are in the specified checked state
Since:
7.0
 */
public static int GetChildrenCheckedCount (Object MediaNode, boolean State) {
  Object o = sagex.SageAPI.call("GetChildrenCheckedCount", new Object[] {MediaNode,State});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
 * UI Context Aware Call<br>
Returns the number of children of the specified MediaNode that are in the specified checked state.

Parameters:
MediaNode- the specified MediaNode
State- true if the returned count should be for checked children, false if it should be for unchecked children
Returns:
the number of children of the specified MediaNode that are in the specified checked state
Since:
7.0
 */
public static int GetChildrenCheckedCount (UIContext _uicontext,Object MediaNode, boolean State) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChildrenCheckedCount", new Object[] {MediaNode,State});
  if (o!=null) return (Integer) o;
  return 0;
}

/**
Returns the children of the specified MediaNode that are in the specified checked state.

Parameters:
MediaNode- the specified MediaNode
State- true if the returned list should be for checked children, false if it should be for unchecked children
Returns:
an array of children of the specified MediaNode that are in the specified checked state
Since:
7.0
 */
public static java.util.Vector GetChildrenCheckedNodes (Object MediaNode, boolean State) {
  Object o = sagex.SageAPI.call("GetChildrenCheckedNodes", new Object[] {MediaNode,State});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the children of the specified MediaNode that are in the specified checked state.

Parameters:
MediaNode- the specified MediaNode
State- true if the returned list should be for checked children, false if it should be for unchecked children
Returns:
an array of children of the specified MediaNode that are in the specified checked state
Since:
7.0
 */
public static java.util.Vector GetChildrenCheckedNodes (UIContext _uicontext,Object MediaNode, boolean State) {
  Object o = sagex.SageAPI.call(_uicontext, "GetChildrenCheckedNodes", new Object[] {MediaNode,State});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Creates a static MediaNode that has no parents and no children. Can be used to add arbitrary items to MediaNode lists for display in
 the UI. The data type for the node will be Virtual.

Parameters:
PrimaryLabel- the value to set as the primary label for the MediaNode
SecondaryLabel- the value to set as the secondary label for the MediaNode
Thumbnail- the Object to use as the thumbnail for the MediaNode
Icon- the Object to use as the icon for the MediaNode
DataObject- the Object that should be the data object for the MediaNode
Returns:
a new MediaNode object that has the specified attributes
Since:
7.0
 */
public static Object CreateMediaNode (java.lang.String PrimaryLabel, java.lang.String SecondaryLabel, java.lang.Object Thumbnail, java.lang.Object Icon, java.lang.Object DataObject) {
  Object o = sagex.SageAPI.call("CreateMediaNode", new Object[] {PrimaryLabel,SecondaryLabel,Thumbnail,Icon,DataObject});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a static MediaNode that has no parents and no children. Can be used to add arbitrary items to MediaNode lists for display in
 the UI. The data type for the node will be Virtual.

Parameters:
PrimaryLabel- the value to set as the primary label for the MediaNode
SecondaryLabel- the value to set as the secondary label for the MediaNode
Thumbnail- the Object to use as the thumbnail for the MediaNode
Icon- the Object to use as the icon for the MediaNode
DataObject- the Object that should be the data object for the MediaNode
Returns:
a new MediaNode object that has the specified attributes
Since:
7.0
 */
public static Object CreateMediaNode (UIContext _uicontext,java.lang.String PrimaryLabel, java.lang.String SecondaryLabel, java.lang.Object Thumbnail, java.lang.Object Icon, java.lang.Object DataObject) {
  Object o = sagex.SageAPI.call(_uicontext, "CreateMediaNode", new Object[] {PrimaryLabel,SecondaryLabel,Thumbnail,Icon,DataObject});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns a string which represents the hierarchical path to this MediaNode. This is created by appending the primary labels
 of all the parents up to the root of the hierarchy. The forward slash is used as a separator.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string which represents the hierarchical path to this MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeFullPath (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeFullPath", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string which represents the hierarchical path to this MediaNode. This is created by appending the primary labels
 of all the parents up to the root of the hierarchy. The forward slash is used as a separator.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string which represents the hierarchical path to this MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeFullPath (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeFullPath", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns a string which represents the hierarchical path to this MediaNode with type information only. This is created by appending the data types
 of all the parents up to the root of the hierarchy. The forward slash is used as a separator. For Virtual nodes, it will use F if it represents
 a folder in the import hierarchy; otherwise it'll use the primary label unless that is null, in which case it'll use V.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string which represents the hierarchical type path to this MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeTypePath (Object MediaNode) {
  Object o = sagex.SageAPI.call("GetNodeTypePath", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns a string which represents the hierarchical path to this MediaNode with type information only. This is created by appending the data types
 of all the parents up to the root of the hierarchy. The forward slash is used as a separator. For Virtual nodes, it will use F if it represents
 a folder in the import hierarchy; otherwise it'll use the primary label unless that is null, in which case it'll use V.

Parameters:
MediaNode- the specified MediaNode
Returns:
a string which represents the hierarchical type path to this MediaNode
Since:
7.0
 */
public static java.lang.String GetNodeTypePath (UIContext _uicontext,Object MediaNode) {
  Object o = sagex.SageAPI.call(_uicontext, "GetNodeTypePath", new Object[] {MediaNode});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified object is a MediaNode object. No automatic type conversion will be performed on the argument.

Parameters:
Object- the object to test to see if it is a MediaNode object
Returns:
true if the argument is a MediaNode object, false otherwise
Since:
7.1
 */
public static boolean IsMediaNodeObject (java.lang.Object Object) {
  Object o = sagex.SageAPI.call("IsMediaNodeObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified object is a MediaNode object. No automatic type conversion will be performed on the argument.

Parameters:
Object- the object to test to see if it is a MediaNode object
Returns:
true if the argument is a MediaNode object, false otherwise
Since:
7.1
 */
public static boolean IsMediaNodeObject (UIContext _uicontext,java.lang.Object Object) {
  Object o = sagex.SageAPI.call(_uicontext, "IsMediaNodeObject", new Object[] {Object});
  if (o!=null) return (Boolean) o;
  return false;
}

}
