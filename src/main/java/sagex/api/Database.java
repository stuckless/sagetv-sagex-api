package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 25/03/13 8:50 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/Database.html'>Database</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class Database {
/**
Filters data by a boolean method. Each element in the 'Data' has the 'Method' executed on it.
 If the result is the same as the 'MatchValue' parameter then that element will be in the
 returned data. For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument. This can be a list of methods to test against separated by the '|' character.
MatchValue- the Method must return this value to be in the returned data
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByBoolMethod (java.lang.Object Data, java.lang.String Method, boolean MatchValue) {
  Object o = sagex.SageAPI.call("FilterByBoolMethod", new Object[] {Data,Method,MatchValue});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Filters data by a boolean method. Each element in the 'Data' has the 'Method' executed on it.
 If the result is the same as the 'MatchValue' parameter then that element will be in the
 returned data. For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument. This can be a list of methods to test against separated by the '|' character.
MatchValue- the Method must return this value to be in the returned data
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByBoolMethod (UIContext _uicontext,java.lang.Object Data, java.lang.String Method, boolean MatchValue) {
  Object o = sagex.SageAPI.call(_uicontext, "FilterByBoolMethod", new Object[] {Data,Method,MatchValue});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Filters data by a method. Each element in the 'Data' has the 'Method' executed on it.
 If the result is the same as the 'MatchValue' parameter then that element will be in the
 returned data if MatchedPasses is true. If MatchedPasses is false then non-matching elements will be in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE. For Maps the keys are used for the filtering.
Method- This is what is evaluated with an element as the only argument. This can be a list of methods to test against separated by the '|' character. There is also a special 'UserCategories' option which will check the ManualRecord, Favorite and MediaFile "UserCategory" property as well as the Show Category & SubCategory for any matches against a comma-delimited list in the MatchValue parameter.
MatchValue- the value to test the return value of Method against
MatchedPasses- if true then matches are included in the return data, if false then everything that doesn't match is returned
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByMethod (java.lang.Object Data, java.lang.String Method, java.lang.Object MatchValue, boolean MatchedPasses) {
  Object o = sagex.SageAPI.call("FilterByMethod", new Object[] {Data,Method,MatchValue,MatchedPasses});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Filters data by a method. Each element in the 'Data' has the 'Method' executed on it.
 If the result is the same as the 'MatchValue' parameter then that element will be in the
 returned data if MatchedPasses is true. If MatchedPasses is false then non-matching elements will be in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE. For Maps the keys are used for the filtering.
Method- This is what is evaluated with an element as the only argument. This can be a list of methods to test against separated by the '|' character. There is also a special 'UserCategories' option which will check the ManualRecord, Favorite and MediaFile "UserCategory" property as well as the Show Category & SubCategory for any matches against a comma-delimited list in the MatchValue parameter.
MatchValue- the value to test the return value of Method against
MatchedPasses- if true then matches are included in the return data, if false then everything that doesn't match is returned
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByMethod (UIContext _uicontext,java.lang.Object Data, java.lang.String Method, java.lang.Object MatchValue, boolean MatchedPasses) {
  Object o = sagex.SageAPI.call(_uicontext, "FilterByMethod", new Object[] {Data,Method,MatchValue,MatchedPasses});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Filters data by a method. Each element in the 'Data' has the 'Method' executed on it.
 The result is then converted to a String and RegexPattern is applied to it.
 If the regular expression matches the String value and MatchedPasses is true, then the element
 will be in the returned data. If MatchedPasses is false then non-matching elements will be in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created. 
 NOTE: If you pass more than 5 arguments to this function then the extra arguments will
 be passed along to the Method that should be executed.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument (and additional arguments if passed in).
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MatchedPasses- if true then matches are included in the return data, if false then everything that doesn't match is returned
CompleteMatch- if true then the entire string must match the regular expression, if false then the regular expression only needs to match a substring of it
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
Since:
5.1
 */
public static java.lang.Object FilterByMethodRegex (java.lang.Object Data, java.lang.String Method, java.util.regex.Pattern RegexPattern, boolean MatchedPasses, boolean CompleteMatch) {
  Object o = sagex.SageAPI.call("FilterByMethodRegex", new Object[] {Data,Method,RegexPattern,MatchedPasses,CompleteMatch});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Filters data by a method. Each element in the 'Data' has the 'Method' executed on it.
 The result is then converted to a String and RegexPattern is applied to it.
 If the regular expression matches the String value and MatchedPasses is true, then the element
 will be in the returned data. If MatchedPasses is false then non-matching elements will be in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created. 
 NOTE: If you pass more than 5 arguments to this function then the extra arguments will
 be passed along to the Method that should be executed.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument (and additional arguments if passed in).
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MatchedPasses- if true then matches are included in the return data, if false then everything that doesn't match is returned
CompleteMatch- if true then the entire string must match the regular expression, if false then the regular expression only needs to match a substring of it
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
Since:
5.1
 */
public static java.lang.Object FilterByMethodRegex (UIContext _uicontext,java.lang.Object Data, java.lang.String Method, java.util.regex.Pattern RegexPattern, boolean MatchedPasses, boolean CompleteMatch) {
  Object o = sagex.SageAPI.call(_uicontext, "FilterByMethodRegex", new Object[] {Data,Method,RegexPattern,MatchedPasses,CompleteMatch});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Filters data by a comparable range. Each element in the 'Data' has the 'Method' executed on it.
 If KeepWithinBounds is true, then results that are within the specified range are included in the returned data; otherwise
 if KeepWithinBounds is false then results that are outside of the specified range are included in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument
LowerBoundInclusive- a java.lang.Comparable which specifies the INCLUSIVE lower bound for the range
UpperBoundExclusive- a java.lang.Comparable which specified the EXCLUSIVE upper bound for the range
KeepWithinBounds- if true then values within the range are returned, if false then values outside the range are returned
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByRange (java.lang.Object Data, java.lang.String Method, java.lang.Comparable LowerBoundInclusive, java.lang.Comparable UpperBoundExclusive, boolean KeepWithinBounds) {
  Object o = sagex.SageAPI.call("FilterByRange", new Object[] {Data,Method,LowerBoundInclusive,UpperBoundExclusive,KeepWithinBounds});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Filters data by a comparable range. Each element in the 'Data' has the 'Method' executed on it.
 If KeepWithinBounds is true, then results that are within the specified range are included in the returned data; otherwise
 if KeepWithinBounds is false then results that are outside of the specified range are included in the returned data.
 For Maps & Collections this is done in place. For Arrays a new Array is created.

Parameters:
Data- the data that is to be filtered; this can be a java.util.Collection, java.util.Map or an Array. For Maps & Collections the filtering is done IN-PLACE.
Method- This is what is evaluated with an element as the only argument
LowerBoundInclusive- a java.lang.Comparable which specifies the INCLUSIVE lower bound for the range
UpperBoundExclusive- a java.lang.Comparable which specified the EXCLUSIVE upper bound for the range
KeepWithinBounds- if true then values within the range are returned, if false then values outside the range are returned
Returns:
The elements that passed the filter. The type is the same type as the passed in Data.
 */
public static java.lang.Object FilterByRange (UIContext _uicontext,java.lang.Object Data, java.lang.String Method, java.lang.Comparable LowerBoundInclusive, java.lang.Comparable UpperBoundExclusive, boolean KeepWithinBounds) {
  Object o = sagex.SageAPI.call(_uicontext, "FilterByRange", new Object[] {Data,Method,LowerBoundInclusive,UpperBoundExclusive,KeepWithinBounds});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Grouping method for data lists/maps. This will return a Map that uses a key->value mapping to group the data. 
 The order of the grouping is stable, which means the order of the elements within a subgroup will be the same 
 order as in the pased in data. Use the GetSubgroup method to get the corresponding value for a key. 
 The key for each data element is determined by calling the specified 'Method' with that data element as the sole parameter.
 Each value in the map will be a java.util.Vector that contains the elements in the group.
 There is a special Method called "Categories" which will allow items to fall into possibly more than one group. This will
 group by Category and also by SubCategory all at the same level (if SubCategory is not defined, then it will not be used for an alternate grouping).
 "Categories" grouping will also break up any category names that have comma or semicolon delimited lists and put the item into each of those.

Parameters:
Data- the data to perform the grouping on, must be a java.util.Collection, java.util.Map or an Array
Method- the name of the Method to execute on each element to retrieve the key used for grouping, see the note above regarding "Categories" as a special option
Returns:
a java.util.Map keyed with the values obtained from executing Method on the Data and with values that are Vectors of elements who's keys match
 */
public static java.util.Map GroupByMethod (java.lang.Object Data, java.lang.String Method) {
  Object o = sagex.SageAPI.call("GroupByMethod", new Object[] {Data,Method});
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Grouping method for data lists/maps. This will return a Map that uses a key->value mapping to group the data. 
 The order of the grouping is stable, which means the order of the elements within a subgroup will be the same 
 order as in the pased in data. Use the GetSubgroup method to get the corresponding value for a key. 
 The key for each data element is determined by calling the specified 'Method' with that data element as the sole parameter.
 Each value in the map will be a java.util.Vector that contains the elements in the group.
 There is a special Method called "Categories" which will allow items to fall into possibly more than one group. This will
 group by Category and also by SubCategory all at the same level (if SubCategory is not defined, then it will not be used for an alternate grouping).
 "Categories" grouping will also break up any category names that have comma or semicolon delimited lists and put the item into each of those.

Parameters:
Data- the data to perform the grouping on, must be a java.util.Collection, java.util.Map or an Array
Method- the name of the Method to execute on each element to retrieve the key used for grouping, see the note above regarding "Categories" as a special option
Returns:
a java.util.Map keyed with the values obtained from executing Method on the Data and with values that are Vectors of elements who's keys match
 */
public static java.util.Map GroupByMethod (UIContext _uicontext,java.lang.Object Data, java.lang.String Method) {
  Object o = sagex.SageAPI.call(_uicontext, "GroupByMethod", new Object[] {Data,Method});
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
Grouping method for data lists/maps. This will return a Map that uses a key->value mapping to group the data. 
 The order of the grouping is stable, which means the order of the elements within a subgroup will be the same 
 order as in the pased in data. Use the GetSubgroup method to get the corresponding value for a key. 
 The keys for each data element is determined by calling the specified 'Method' with that data element as the sole parameter.
 The Method should return an array or list, each element of which will be a key that the data element will be grouped by.
 Each value in the map will be a java.util.Vector that contains the elements in the group.
 NOTE: If you pass more than 2 arguments to this function then the extra arguments will
 be passed along to the Method that should be executed.

Parameters:
Data- the data to perform the grouping on, must be a java.util.Collection, java.util.Map or an Array
Method- the name of the Method to execute on each element to retrieve the keys used for grouping
Returns:
a java.util.Map keyed with the values obtained from executing Method on the Data and with values that are Vectors of elements who's keys match
Since:
5.1
 */
public static java.util.Map GroupByArrayMethod (java.lang.Object Data, java.lang.String Method) {
  Object o = sagex.SageAPI.call("GroupByArrayMethod", new Object[] {Data,Method});
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Grouping method for data lists/maps. This will return a Map that uses a key->value mapping to group the data. 
 The order of the grouping is stable, which means the order of the elements within a subgroup will be the same 
 order as in the pased in data. Use the GetSubgroup method to get the corresponding value for a key. 
 The keys for each data element is determined by calling the specified 'Method' with that data element as the sole parameter.
 The Method should return an array or list, each element of which will be a key that the data element will be grouped by.
 Each value in the map will be a java.util.Vector that contains the elements in the group.
 NOTE: If you pass more than 2 arguments to this function then the extra arguments will
 be passed along to the Method that should be executed.

Parameters:
Data- the data to perform the grouping on, must be a java.util.Collection, java.util.Map or an Array
Method- the name of the Method to execute on each element to retrieve the keys used for grouping
Returns:
a java.util.Map keyed with the values obtained from executing Method on the Data and with values that are Vectors of elements who's keys match
Since:
5.1
 */
public static java.util.Map GroupByArrayMethod (UIContext _uicontext,java.lang.Object Data, java.lang.String Method) {
  Object o = sagex.SageAPI.call(_uicontext, "GroupByArrayMethod", new Object[] {Data,Method});
  if (o!=null) return (java.util.Map) o;
  return null;
}

/**
Sorts a list of data according to the specified sorting technique. The order of the sort can be reversed using
 the Descending parameter. If you use a method name for the SortTechnique, then the data will be sorted by the natural
 ordering of the values returned from that mehod call. If that data type does not implement java.lang.Comparable then they
 will be converted to Strings and those Strings will be compared. NOTE: If you pass more than 3 arguments to this function then the extra arguments will
 be passed along to the SortTechnique if it refers to a Method that should be executed.

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array; for Collections all the elements must be the same Class
Descending- if true then the data will be sorted in descending order, if false then the order will be reversed
SortTechnique- the technique to sort the data by; this can be a java.util.Comparator 
         which then explicitly controls the sort, or it can be one of the named sorting techniques of: 
         Intelligent, ChannelNumber, CaseInsensitive, FavoritePriority, Natural or a method name. If null is passed then the elements "natural" sorting is used.
Returns:
the sorted data, for passed in Maps this'll be a sorted Map; for Collections or arrays this will be an Object[] array
 */
public static java.lang.Object Sort (java.lang.Object Data, boolean Descending, java.lang.Object SortTechnique) {
  Object o = sagex.SageAPI.call("Sort", new Object[] {Data,Descending,SortTechnique});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Sorts a list of data according to the specified sorting technique. The order of the sort can be reversed using
 the Descending parameter. If you use a method name for the SortTechnique, then the data will be sorted by the natural
 ordering of the values returned from that mehod call. If that data type does not implement java.lang.Comparable then they
 will be converted to Strings and those Strings will be compared. NOTE: If you pass more than 3 arguments to this function then the extra arguments will
 be passed along to the SortTechnique if it refers to a Method that should be executed.

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array; for Collections all the elements must be the same Class
Descending- if true then the data will be sorted in descending order, if false then the order will be reversed
SortTechnique- the technique to sort the data by; this can be a java.util.Comparator 
         which then explicitly controls the sort, or it can be one of the named sorting techniques of: 
         Intelligent, ChannelNumber, CaseInsensitive, FavoritePriority, Natural or a method name. If null is passed then the elements "natural" sorting is used.
Returns:
the sorted data, for passed in Maps this'll be a sorted Map; for Collections or arrays this will be an Object[] array
 */
public static java.lang.Object Sort (UIContext _uicontext,java.lang.Object Data, boolean Descending, java.lang.Object SortTechnique) {
  Object o = sagex.SageAPI.call(_uicontext, "Sort", new Object[] {Data,Descending,SortTechnique});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Sorts a list of data based on the result of calling the "SortByMethod" on each item and using toString on the return value of that method. 
 The order of the sort can be reversed using the Descending parameter. There are many cases where this will return the same thing as a call toSort()
SortLexical should be used when sorting text if possible, as it uses more advanced language-specific sorting techniques to determine a proper order.
 This sort is performed case-insensitive.
 NOTE: If you pass more than 3 arguments to this function then the extra arguments will be passed along to the SortByMethod.

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array; for Collections all the elements must be the same Class
Descending- if true then the data will be sorted in descending order, if false then the order will be reversed
SortByMethod- the method to call on each data item to get the value it should be sorted by, if this is null then the data elements are converted to Strings directly and then compared
Returns:
the sorted data, for passed in Maps this'll be a sorted Map; for Collections or arrays this will be an Object[] array
Since:
5.1
 */
public static java.lang.Object SortLexical (java.lang.Object Data, boolean Descending, java.lang.String SortByMethod) {
  Object o = sagex.SageAPI.call("SortLexical", new Object[] {Data,Descending,SortByMethod});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Sorts a list of data based on the result of calling the "SortByMethod" on each item and using toString on the return value of that method. 
 The order of the sort can be reversed using the Descending parameter. There are many cases where this will return the same thing as a call toSort()
SortLexical should be used when sorting text if possible, as it uses more advanced language-specific sorting techniques to determine a proper order.
 This sort is performed case-insensitive.
 NOTE: If you pass more than 3 arguments to this function then the extra arguments will be passed along to the SortByMethod.

Parameters:
Data- the data to sort, this must be a java.util.Collection, a java.util.Map, or an array; for Collections all the elements must be the same Class
Descending- if true then the data will be sorted in descending order, if false then the order will be reversed
SortByMethod- the method to call on each data item to get the value it should be sorted by, if this is null then the data elements are converted to Strings directly and then compared
Returns:
the sorted data, for passed in Maps this'll be a sorted Map; for Collections or arrays this will be an Object[] array
Since:
5.1
 */
public static java.lang.Object SortLexical (UIContext _uicontext,java.lang.Object Data, boolean Descending, java.lang.String SortByMethod) {
  Object o = sagex.SageAPI.call(_uicontext, "SortLexical", new Object[] {Data,Descending,SortByMethod});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns all of the Airing objects in the database that are on the specified channel during the specified time span.

Parameters:
Channel- the Channel that the Airings need to be one
StartTime- the start of the time window to search for Airings in
EndTime- the end of the time window to search for Airings in
MustStartDuringTime- if true, then only Airings that start during the time window will be returned, if false
         then any Airing that overlaps with the time window will be returned
Returns:
the Airings on the specified channel within the specified time window
 */
public static Object[] GetAiringsOnChannelAtTime (Object Channel, long StartTime, long EndTime, boolean MustStartDuringTime) {
  return (Object[]) sagex.SageAPI.call("GetAiringsOnChannelAtTime", new Object[] {Channel,StartTime,EndTime,MustStartDuringTime});
}

/**
 * UI Context Aware Call<br/>
Returns all of the Airing objects in the database that are on the specified channel during the specified time span.

Parameters:
Channel- the Channel that the Airings need to be one
StartTime- the start of the time window to search for Airings in
EndTime- the end of the time window to search for Airings in
MustStartDuringTime- if true, then only Airings that start during the time window will be returned, if false
         then any Airing that overlaps with the time window will be returned
Returns:
the Airings on the specified channel within the specified time window
 */
public static Object[] GetAiringsOnChannelAtTime (UIContext _uicontext,Object Channel, long StartTime, long EndTime, boolean MustStartDuringTime) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAiringsOnChannelAtTime", new Object[] {Channel,StartTime,EndTime,MustStartDuringTime});
}

/**
Returns all of the Airing objects in the database on all of the channels that are viewable during the specified time span.

Parameters:
StartTime- the start of the time window to search for Airings in
EndTime- the end of the time window to search for Airings in
MustStartDuringTime- if true, then only Airings that start during the time window will be returned, if false
         then any Airing that overlaps with the time window will be returned
Returns:
the Airings on all the viewable channels within the specified time window
 */
public static Object[] GetAiringsOnViewableChannelsAtTime (long StartTime, long EndTime, boolean MustStartDuringTime) {
  return (Object[]) sagex.SageAPI.call("GetAiringsOnViewableChannelsAtTime", new Object[] {StartTime,EndTime,MustStartDuringTime});
}

/**
 * UI Context Aware Call<br/>
Returns all of the Airing objects in the database on all of the channels that are viewable during the specified time span.

Parameters:
StartTime- the start of the time window to search for Airings in
EndTime- the end of the time window to search for Airings in
MustStartDuringTime- if true, then only Airings that start during the time window will be returned, if false
         then any Airing that overlaps with the time window will be returned
Returns:
the Airings on all the viewable channels within the specified time window
 */
public static Object[] GetAiringsOnViewableChannelsAtTime (UIContext _uicontext,long StartTime, long EndTime, boolean MustStartDuringTime) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAiringsOnViewableChannelsAtTime", new Object[] {StartTime,EndTime,MustStartDuringTime});
}

/**
Deprecated. 

Returns all Airings in the database that refer to content that is NOT a music file and includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.)

Parameters:
Person- the name of the person to search for matching content on
Returns:
an array of Airing objects that reference content that includes the specified person, music is not returned
 */
public static Object[] GetAllNonMusicWithPerson (java.lang.String Person) {
  return (Object[]) sagex.SageAPI.call("GetAllNonMusicWithPerson", new Object[] {Person});
}

/**
 * UI Context Aware Call<br/>
Deprecated. 

Returns all Airings in the database that refer to content that is NOT a music file and includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.)

Parameters:
Person- the name of the person to search for matching content on
Returns:
an array of Airing objects that reference content that includes the specified person, music is not returned
 */
public static Object[] GetAllNonMusicWithPerson (UIContext _uicontext,java.lang.String Person) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllNonMusicWithPerson", new Object[] {Person});
}

/**
Deprecated. 

Returns all Airings in the database that refer to content that is NOT a music file and has the specified title.

Parameters:
Title- the title of the content must match this exactly
Returns:
an array of Airing objects that reference content with the specified title, music is not returned
 */
public static Object[] GetAllNonMusicWithTitle (java.lang.String Title) {
  return (Object[]) sagex.SageAPI.call("GetAllNonMusicWithTitle", new Object[] {Title});
}

/**
 * UI Context Aware Call<br/>
Deprecated. 

Returns all Airings in the database that refer to content that is NOT a music file and has the specified title.

Parameters:
Title- the title of the content must match this exactly
Returns:
an array of Airing objects that reference content with the specified title, music is not returned
 */
public static Object[] GetAllNonMusicWithTitle (UIContext _uicontext,java.lang.String Title) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllNonMusicWithTitle", new Object[] {Title});
}

/**
Returns all Airings in the database that refer to content that is NOT a music file and includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.)
 This is the same asGetAllNonMusicWithPerson()


Parameters:
SearchString- the name of the person to search for matching content on
Returns:
an array of Airing objects that reference content that includes the specified person, music is not returned
 */
public static Object[] SearchByPerson (java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call("SearchByPerson", new Object[] {SearchString});
}

/**
 * UI Context Aware Call<br/>
Returns all Airings in the database that refer to content that is NOT a music file and includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.)
 This is the same asGetAllNonMusicWithPerson()


Parameters:
SearchString- the name of the person to search for matching content on
Returns:
an array of Airing objects that reference content that includes the specified person, music is not returned
 */
public static Object[] SearchByPerson (UIContext _uicontext,java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByPerson", new Object[] {SearchString});
}

/**
Returns all Airings in the database that refer to content that includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.). The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the name of the person to search for matching content on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airing objects that reference content that includes the specified person and matches the media mask
Since:
5.1
 */
public static Object[] SearchByPerson (java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call("SearchByPerson", new Object[] {SearchString,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns all Airings in the database that refer to content that includes the specified person
 in the list of people involved (i.e. actors, directors, producers, etc.). The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the name of the person to search for matching content on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airing objects that reference content that includes the specified person and matches the media mask
Since:
5.1
 */
public static Object[] SearchByPerson (UIContext _uicontext,java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByPerson", new Object[] {SearchString,MediaMask});
}

/**
Searches the descriptions and episode names of all of the content in the database for the
 specified search string. This search is case insensitive.

Parameters:
SearchString- the string to search for
Returns:
an array of Airings who's content has the specified search string in its description or episode name
 */
public static Object[] SearchByText (java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call("SearchByText", new Object[] {SearchString});
}

/**
 * UI Context Aware Call<br/>
Searches the descriptions and episode names of all of the content in the database for the
 specified search string. This search is case insensitive.

Parameters:
SearchString- the string to search for
Returns:
an array of Airings who's content has the specified search string in its description or episode name
 */
public static Object[] SearchByText (UIContext _uicontext,java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByText", new Object[] {SearchString});
}

/**
Searches the descriptions and episode names of all of the content in the database for the
 specified search string. This search is case insensitive. The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the string to search for
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings who's content has the specified search string in its description or episode name and matches the media mask
Since:
5.1
 */
public static Object[] SearchByText (java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call("SearchByText", new Object[] {SearchString,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Searches the descriptions and episode names of all of the content in the database for the
 specified search string. This search is case insensitive. The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the string to search for
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings who's content has the specified search string in its description or episode name and matches the media mask
Since:
5.1
 */
public static Object[] SearchByText (UIContext _uicontext,java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByText", new Object[] {SearchString,MediaMask});
}

/**
Returns all Airings in the database that refer to content that is NOT a music file and has the specified title.
 This is the same asGetAllNonMusicWithTitle()


Parameters:
SearchString- the title of the content must match this exactly
Returns:
an array of Airing objects that reference content with the specified title, music is not returned
 */
public static Object[] SearchByTitle (java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call("SearchByTitle", new Object[] {SearchString});
}

/**
 * UI Context Aware Call<br/>
Returns all Airings in the database that refer to content that is NOT a music file and has the specified title.
 This is the same asGetAllNonMusicWithTitle()


Parameters:
SearchString- the title of the content must match this exactly
Returns:
an array of Airing objects that reference content with the specified title, music is not returned
 */
public static Object[] SearchByTitle (UIContext _uicontext,java.lang.String SearchString) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByTitle", new Object[] {SearchString});
}

/**
Returns all Airings in the database that refer to content that has the specified title. The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the title of the content must match this exactly
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airing objects that reference content with the specified title and matches the media mask
Since:
5.1
 */
public static Object[] SearchByTitle (java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call("SearchByTitle", new Object[] {SearchString,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns all Airings in the database that refer to content that has the specified title. The content must also match
 one of the media types specified in the MediaMask

Parameters:
SearchString- the title of the content must match this exactly
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airing objects that reference content with the specified title and matches the media mask
Since:
5.1
 */
public static Object[] SearchByTitle (UIContext _uicontext,java.lang.String SearchString, java.lang.String MediaMask) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "SearchByTitle", new Object[] {SearchString,MediaMask});
}

/**
Returns a list of all of the people in the database that include the search string in their name.
 This search is case insensitive.

Parameters:
SearchString- the string to search on
Returns:
an array of Strings which represent all of the people in the database that matched the search
 */
public static java.lang.String[] SearchForPeople (java.lang.String SearchString) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForPeople", new Object[] {SearchString});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the people in the database that include the search string in their name.
 This search is case insensitive.

Parameters:
SearchString- the string to search on
Returns:
an array of Strings which represent all of the people in the database that matched the search
 */
public static java.lang.String[] SearchForPeople (UIContext _uicontext,java.lang.String SearchString) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForPeople", new Object[] {SearchString});
}

/**
Returns a list of all of the people in the database that include the search string in their name.
 This search is case insensitive. The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the people in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForPeople (java.lang.String SearchString, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForPeople", new Object[] {SearchString,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the people in the database that include the search string in their name.
 This search is case insensitive. The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the people in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForPeople (UIContext _uicontext,java.lang.String SearchString, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForPeople", new Object[] {SearchString,MediaMask});
}

/**
Returns a list of all of the titles in the database that include the search string in them.
 This search is case insensitive.

Parameters:
SearchString- the string to search on
Returns:
an array of Strings which represent all of the titles in the database that matched the search
 */
public static java.lang.String[] SearchForTitles (java.lang.String SearchString) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForTitles", new Object[] {SearchString});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the titles in the database that include the search string in them.
 This search is case insensitive.

Parameters:
SearchString- the string to search on
Returns:
an array of Strings which represent all of the titles in the database that matched the search
 */
public static java.lang.String[] SearchForTitles (UIContext _uicontext,java.lang.String SearchString) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForTitles", new Object[] {SearchString});
}

/**
Returns a list of all of the titles in the database that include the search string in them.
 This search is case insensitive. The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the titles in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForTitles (java.lang.String SearchString, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForTitles", new Object[] {SearchString,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the titles in the database that include the search string in them.
 This search is case insensitive. The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search on
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the titles in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForTitles (UIContext _uicontext,java.lang.String SearchString, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForTitles", new Object[] {SearchString,MediaMask});
}

/**
Returns a list of all of the people in the database that match the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Returns:
an array of Strings which represent all of the people in the database that matched the search
Since:
5.1
 */
public static java.lang.String[] SearchForPeopleRegex (java.util.regex.Pattern RegexPattern) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForPeopleRegex", new Object[] {RegexPattern});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the people in the database that match the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Returns:
an array of Strings which represent all of the people in the database that matched the search
Since:
5.1
 */
public static java.lang.String[] SearchForPeopleRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForPeopleRegex", new Object[] {RegexPattern});
}

/**
Returns a list of all of the people in the database that match the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the people in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForPeopleRegex (java.util.regex.Pattern RegexPattern, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForPeopleRegex", new Object[] {RegexPattern,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the people in the database that match the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the people in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForPeopleRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForPeopleRegex", new Object[] {RegexPattern,MediaMask});
}

/**
Returns a list of all of the titles in the database that match the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Returns:
an array of Strings which represent all of the titles in the database that matched the search
Since:
5.1
 */
public static java.lang.String[] SearchForTitlesRegex (java.util.regex.Pattern RegexPattern) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForTitlesRegex", new Object[] {RegexPattern});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the titles in the database that match the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Returns:
an array of Strings which represent all of the titles in the database that matched the search
Since:
5.1
 */
public static java.lang.String[] SearchForTitlesRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForTitlesRegex", new Object[] {RegexPattern});
}

/**
Returns a list of all of the titles in the database that match the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the titles in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForTitlesRegex (java.util.regex.Pattern RegexPattern, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("SearchForTitlesRegex", new Object[] {RegexPattern,MediaMask});
}

/**
 * UI Context Aware Call<br/>
Returns a list of all of the titles in the database that match the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Strings which represent all of the titles in the database that matched the search that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] SearchForTitlesRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern, java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "SearchForTitlesRegex", new Object[] {RegexPattern,MediaMask});
}

/**
Creates a Union of one or more sets of data. This method can have zero or more arguments.
 The ordering of the elements is stable. Any element that is in any data set that is passed in will
 be included in the returned set. Any duplicate items will be removed.
 If the arguments are a java.util.Collection, java.util.Map or an array then each element in them will
 be processed in the Union. If the argument is any other type then the argument itself will be processed in the Union.

Parameters:
DataSet1- one of the data sets to include in the union
DataSet2- another one of the data sets to include in the union
Returns:
a java.util.Vector which is a union of all of the elements in the passed in arguments
 */
public static java.util.Vector DataUnion (java.lang.Object DataSet1, java.lang.Object DataSet2) {
  Object o = sagex.SageAPI.call("DataUnion", new Object[] {DataSet1,DataSet2});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Creates a Union of one or more sets of data. This method can have zero or more arguments.
 The ordering of the elements is stable. Any element that is in any data set that is passed in will
 be included in the returned set. Any duplicate items will be removed.
 If the arguments are a java.util.Collection, java.util.Map or an array then each element in them will
 be processed in the Union. If the argument is any other type then the argument itself will be processed in the Union.

Parameters:
DataSet1- one of the data sets to include in the union
DataSet2- another one of the data sets to include in the union
Returns:
a java.util.Vector which is a union of all of the elements in the passed in arguments
 */
public static java.util.Vector DataUnion (UIContext _uicontext,java.lang.Object DataSet1, java.lang.Object DataSet2) {
  Object o = sagex.SageAPI.call(_uicontext, "DataUnion", new Object[] {DataSet1,DataSet2});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Creates an intersection of two sets of data.
 The ordering of the elements is stable. Any element that is in both of the data sets that are passed in will
 be included in the returned set. 
 If the arguments are a java.util.Collection or an array then each element in them will
 be processed in the intersection. If the argument is any other type then the argument itself will be processed in the intersection.

Parameters:
DataSet1- one of the data sets to include in the intersection
DataSet2- the other data set to include in the intersection
Returns:
a java.util.Vector which is an intersection of all of the elements in the passed in arguments
 */
public static java.util.Vector DataIntersection (java.lang.Object DataSet1, java.lang.Object DataSet2) {
  Object o = sagex.SageAPI.call("DataIntersection", new Object[] {DataSet1,DataSet2});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Creates an intersection of two sets of data.
 The ordering of the elements is stable. Any element that is in both of the data sets that are passed in will
 be included in the returned set. 
 If the arguments are a java.util.Collection or an array then each element in them will
 be processed in the intersection. If the argument is any other type then the argument itself will be processed in the intersection.

Parameters:
DataSet1- one of the data sets to include in the intersection
DataSet2- the other data set to include in the intersection
Returns:
a java.util.Vector which is an intersection of all of the elements in the passed in arguments
 */
public static java.util.Vector DataIntersection (UIContext _uicontext,java.lang.Object DataSet1, java.lang.Object DataSet2) {
  Object o = sagex.SageAPI.call(_uicontext, "DataIntersection", new Object[] {DataSet1,DataSet2});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database for the specified search string.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
 */
public static java.util.Vector SearchSelectedFields (java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call("SearchSelectedFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database for the specified search string.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
 */
public static java.util.Vector SearchSelectedFields (UIContext _uicontext,java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database for the specified search string. 
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFields (java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call("SearchSelectedFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database for the specified search string. 
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFields (UIContext _uicontext,java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database for the specified search string. This requires
 that the SearchString matches the specified field's value exactly. UnlikeSearchSelectedFields
which only requires that the SearchString exist within the field's value somewhere (i.e. a substring)

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
Since:
4.1
 */
public static java.util.Vector SearchSelectedExactFields (java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call("SearchSelectedExactFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database for the specified search string. This requires
 that the SearchString matches the specified field's value exactly. UnlikeSearchSelectedFields
which only requires that the SearchString exist within the field's value somewhere (i.e. a substring)

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
Since:
4.1
 */
public static java.util.Vector SearchSelectedExactFields (UIContext _uicontext,java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedExactFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database for the specified search string. This requires
 that the SearchString matches the specified field's value exactly. UnlikeSearchSelectedFields
which only requires that the SearchString exist within the field's value somewhere (i.e. a substring)
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedExactFields (java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call("SearchSelectedExactFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database for the specified search string. This requires
 that the SearchString matches the specified field's value exactly. UnlikeSearchSelectedFields
which only requires that the SearchString exist within the field's value somewhere (i.e. a substring)
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
SearchString- the string to search with
CaseSensitive- if true then the search is case senstive, if false then it's case insensitive
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedExactFields (UIContext _uicontext,java.lang.String SearchString, boolean CaseSensitive, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedExactFields", new Object[] {SearchString,CaseSensitive,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database and tries to match them against
 the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFieldsRegex (java.util.regex.Pattern RegexPattern, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call("SearchSelectedFieldsRegex", new Object[] {RegexPattern,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database and tries to match them against
 the passed in regular expression.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFieldsRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedFieldsRegex", new Object[] {RegexPattern,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Searches the specified fields of all the Airings in the database and tries to match them against
 the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFieldsRegex (java.util.regex.Pattern RegexPattern, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call("SearchSelectedFieldsRegex", new Object[] {RegexPattern,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Searches the specified fields of all the Airings in the database and tries to match them against
 the passed in regular expression.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
RegexPattern- The compiled regular expression used for matching (if it's not compiled, then it will be converted to a compiled regular expression)
Titles- if true then the title fields will be searched, if false then they will not be
Episode- if true then the episode fields will be searched, if false then they will be not be
Description- if true then the description fields will be searched, if false then they will not be
People- if true then the people fields will be searched, if false then they will not be
Category- if true then the category fields will be searched, if false then they will not be
Rated- if true then the rated fields will be searched, if false then they will not be
ExtendedRatings- if true then the extended ratings fields will be searched, if false then they will not be
Year- if true then the year fields will be searched, if false then they will not be
Misc- if true then the miscellaneous fields will be searched, if false then they will not be
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
an array of Airings which matches the search criteria
Since:
5.1
 */
public static java.util.Vector SearchSelectedFieldsRegex (UIContext _uicontext,java.util.regex.Pattern RegexPattern, boolean Titles, boolean Episode, boolean Description, boolean People, boolean Category, boolean Rated, boolean ExtendedRatings, boolean Year, boolean Misc, java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call(_uicontext, "SearchSelectedFieldsRegex", new Object[] {RegexPattern,Titles,Episode,Description,People,Category,Rated,ExtendedRatings,Year,Misc,MediaMask});
  if (o!=null) return (java.util.Vector) o;
  return null;
}

/**
Returns all of the Channel objects in the database that are on the specified Lineup.

Parameters:
Lineup- the name of the EPG lineup to get the channels for
Returns:
an array of Channel objects that are on the specified Lineup
 */
public static Object[] GetChannelsOnLineup (java.lang.String Lineup) {
  return (Object[]) sagex.SageAPI.call("GetChannelsOnLineup", new Object[] {Lineup});
}

/**
 * UI Context Aware Call<br/>
Returns all of the Channel objects in the database that are on the specified Lineup.

Parameters:
Lineup- the name of the EPG lineup to get the channels for
Returns:
an array of Channel objects that are on the specified Lineup
 */
public static Object[] GetChannelsOnLineup (UIContext _uicontext,java.lang.String Lineup) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetChannelsOnLineup", new Object[] {Lineup});
}

/**
Gets all of the titles that are in the database.

Returns:
a list of all of the titles that are in the database
 */
public static java.lang.String[] GetAllTitles () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllTitles", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Gets all of the titles that are in the database.

Returns:
a list of all of the titles that are in the database
 */
public static java.lang.String[] GetAllTitles (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllTitles", (Object[])null);
}

/**
Gets all of the titles that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the titles that are in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllTitles (java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllTitles", new Object[] {MediaMask});
}

/**
 * UI Context Aware Call<br/>
Gets all of the titles that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the titles that are in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllTitles (UIContext _uicontext,java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllTitles", new Object[] {MediaMask});
}

/**
Gets all of the people that are in the database.

Returns:
a list of all of the names of people in the database
 */
public static java.lang.String[] GetAllPeople () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllPeople", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Gets all of the people that are in the database.

Returns:
a list of all of the names of people in the database
 */
public static java.lang.String[] GetAllPeople (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllPeople", (Object[])null);
}

/**
Gets all of the people that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the names of people in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllPeople (java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllPeople", new Object[] {MediaMask});
}

/**
 * UI Context Aware Call<br/>
Gets all of the people that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
a list of all of the names of people in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllPeople (UIContext _uicontext,java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllPeople", new Object[] {MediaMask});
}

/**
Gets all of the categories that are in the database.

Returns:
all of the names of categories that are in the database
 */
public static java.lang.String[] GetAllCategories () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllCategories", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Gets all of the categories that are in the database.

Returns:
all of the names of categories that are in the database
 */
public static java.lang.String[] GetAllCategories (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllCategories", (Object[])null);
}

/**
Gets all of the categories that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
all of the names of categories that are in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllCategories (java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllCategories", new Object[] {MediaMask});
}

/**
 * UI Context Aware Call<br/>
Gets all of the categories that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
all of the names of categories that are in the database that also have content that matches the MediaMask
Since:
5.1
 */
public static java.lang.String[] GetAllCategories (UIContext _uicontext,java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllCategories", new Object[] {MediaMask});
}

/**
Gets all of the categories that are in the database. This is different than GetAllCategories because this one will break apart
 any comma or semicolon delimited category lists into multiple different categories. i.e. if you have "Comedy; Horror" as a category
 this API call will break it up into Comedy and Horror as two separate categories. This call will also coalesce any case-sensitive differences in category names.

Returns:
all of the names of categories that are in the database with multi-categories broken apart
Since:
7.0
 */
public static java.lang.String[] GetAllGroupingCategories () {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllGroupingCategories", (Object[])null);
}

/**
 * UI Context Aware Call<br/>
Gets all of the categories that are in the database. This is different than GetAllCategories because this one will break apart
 any comma or semicolon delimited category lists into multiple different categories. i.e. if you have "Comedy; Horror" as a category
 this API call will break it up into Comedy and Horror as two separate categories. This call will also coalesce any case-sensitive differences in category names.

Returns:
all of the names of categories that are in the database with multi-categories broken apart
Since:
7.0
 */
public static java.lang.String[] GetAllGroupingCategories (UIContext _uicontext) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllGroupingCategories", (Object[])null);
}

/**
Gets all of the categories that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.
 This is different than GetAllCategories because this one will break apart
 any comma or semicolon delimited category lists into multiple different categories. i.e. if you have "Comedy; Horror" as a category
 this API call will break it up into Comedy and Horror as two separate categories. This call will also coalesce any case-sensitive differences in category names.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
all of the names of categories that are in the database that also have content that matches the MediaMask with multi-categories broken apart
Since:
7.0
 */
public static java.lang.String[] GetAllGroupingCategories (java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call("GetAllGroupingCategories", new Object[] {MediaMask});
}

/**
 * UI Context Aware Call<br/>
Gets all of the categories that are in the database.
 The content it references must also match one of the media types specified in the MediaMask.
 This is different than GetAllCategories because this one will break apart
 any comma or semicolon delimited category lists into multiple different categories. i.e. if you have "Comedy; Horror" as a category
 this API call will break it up into Comedy and Horror as two separate categories. This call will also coalesce any case-sensitive differences in category names.

Parameters:
MediaMask- string specifying what content types to search (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
all of the names of categories that are in the database that also have content that matches the MediaMask with multi-categories broken apart
Since:
7.0
 */
public static java.lang.String[] GetAllGroupingCategories (UIContext _uicontext,java.lang.String MediaMask) {
  return (java.lang.String[]) sagex.SageAPI.call(_uicontext, "GetAllGroupingCategories", new Object[] {MediaMask});
}

/**
Returns the last modification time for objects that match anything in the specified MediaMask. This is useful
 for knowing when to clear caches that are used to optimize UI rendering.

Parameters:
MediaMask- string specifying what content types  (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
the last modification time of anything in the DB that matches anything in the specified MediaMask
Since:
5.1
 */
public static long GetDatabaseLastModifiedTime (java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call("GetDatabaseLastModifiedTime", new Object[] {MediaMask});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
 * UI Context Aware Call<br/>
Returns the last modification time for objects that match anything in the specified MediaMask. This is useful
 for knowing when to clear caches that are used to optimize UI rendering.

Parameters:
MediaMask- string specifying what content types  (i.e. "TM" for TV & Music, 'T'=TV, 'M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay)
Returns:
the last modification time of anything in the DB that matches anything in the specified MediaMask
Since:
5.1
 */
public static long GetDatabaseLastModifiedTime (UIContext _uicontext,java.lang.String MediaMask) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDatabaseLastModifiedTime", new Object[] {MediaMask});
  if (o!=null) return (Long) o;
  return 0l;
}

/**
Returns a list of java.io.File objects w/ the specified MediaMask whos import prefix matches that of the argument

Parameters:
MediaData- can either by a MediaMask string specifying what content types  ('M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay) or it can be an array/collection of the specific MediaFile objects to analyze
ImportPrefix- a string specifying a subpath that must match the start of the import files path relative to its import root
IncludeFiles- if true, then MediaFile objects with a complete prefix match will be returned
IncludeFolders- if true, then MediaFile objects with a partial prefix match will be returned
GroupFolders- if true, then MediaFile objects with partial prefixes that match will be grouped by their next path section; extract the 'null' keyed value to get the list of the files
Returns:
a Vector or Map of java.io.File objects w/ the specified MediaMask whos import prefix matches that of the argument; a Map will be returned if GroupFolders is set to true
Since:
6.4
 */
public static java.lang.Object GetFilesWithImportPrefix (java.lang.Object MediaData, java.lang.String ImportPrefix, boolean IncludeFiles, boolean IncludeFolders, boolean GroupFolders) {
  Object o = sagex.SageAPI.call("GetFilesWithImportPrefix", new Object[] {MediaData,ImportPrefix,IncludeFiles,IncludeFolders,GroupFolders});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a list of java.io.File objects w/ the specified MediaMask whos import prefix matches that of the argument

Parameters:
MediaData- can either by a MediaMask string specifying what content types  ('M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay) or it can be an array/collection of the specific MediaFile objects to analyze
ImportPrefix- a string specifying a subpath that must match the start of the import files path relative to its import root
IncludeFiles- if true, then MediaFile objects with a complete prefix match will be returned
IncludeFolders- if true, then MediaFile objects with a partial prefix match will be returned
GroupFolders- if true, then MediaFile objects with partial prefixes that match will be grouped by their next path section; extract the 'null' keyed value to get the list of the files
Returns:
a Vector or Map of java.io.File objects w/ the specified MediaMask whos import prefix matches that of the argument; a Map will be returned if GroupFolders is set to true
Since:
6.4
 */
public static java.lang.Object GetFilesWithImportPrefix (UIContext _uicontext,java.lang.Object MediaData, java.lang.String ImportPrefix, boolean IncludeFiles, boolean IncludeFolders, boolean GroupFolders) {
  Object o = sagex.SageAPI.call(_uicontext, "GetFilesWithImportPrefix", new Object[] {MediaData,ImportPrefix,IncludeFiles,IncludeFolders,GroupFolders});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns a list or map of MediaFile objects w/ the specified MediaMask whos import prefix matches that of the argument

Parameters:
MediaData- can either by a MediaMask string specifying what content types  ('M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay) or it can be an array/collection of the specific MediaFile objects to analyze
ImportPrefix- a string specifying a subpath that must match the start of the import files path relative to its import root
IncludeFiles- if true, then MediaFile objects with a complete prefix match will be returned
IncludeFolders- if true, then MediaFile objects with a partial prefix match will be returned
GroupFolders- if true, then MediaFile objects with partial prefixes that match will be grouped by their next path section; extract the 'null' keyed value to get the list of the files
Returns:
a Vector or Map of MediaFile objects w/ the specified MediaMask whos import prefix matches that of the argument; a Map will be returned if GroupFolders is set to true
Since:
6.4
 */
public static java.lang.Object GetMediaFilesWithImportPrefix (java.lang.Object MediaData, java.lang.String ImportPrefix, boolean IncludeFiles, boolean IncludeFolders, boolean GroupFolders) {
  Object o = sagex.SageAPI.call("GetMediaFilesWithImportPrefix", new Object[] {MediaData,ImportPrefix,IncludeFiles,IncludeFolders,GroupFolders});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Returns a list or map of MediaFile objects w/ the specified MediaMask whos import prefix matches that of the argument

Parameters:
MediaData- can either by a MediaMask string specifying what content types  ('M'=Music, 'V'=Video, 'D'=DVD, 'P'=Pictures, 'B'=BluRay) or it can be an array/collection of the specific MediaFile objects to analyze
ImportPrefix- a string specifying a subpath that must match the start of the import files path relative to its import root
IncludeFiles- if true, then MediaFile objects with a complete prefix match will be returned
IncludeFolders- if true, then MediaFile objects with a partial prefix match will be returned
GroupFolders- if true, then MediaFile objects with partial prefixes that match will be grouped by their next path section; extract the 'null' keyed value to get the list of the files
Returns:
a Vector or Map of MediaFile objects w/ the specified MediaMask whos import prefix matches that of the argument; a Map will be returned if GroupFolders is set to true
Since:
6.4
 */
public static java.lang.Object GetMediaFilesWithImportPrefix (UIContext _uicontext,java.lang.Object MediaData, java.lang.String ImportPrefix, boolean IncludeFiles, boolean IncludeFolders, boolean GroupFolders) {
  Object o = sagex.SageAPI.call(_uicontext, "GetMediaFilesWithImportPrefix", new Object[] {MediaData,ImportPrefix,IncludeFiles,IncludeFolders,GroupFolders});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns true if the database has maxed out its memory usage and cannot add more content

Returns:
true if the database has maxed out its memory usage and cannot add more content
Since:
6.5
 */
public static boolean IsDatabaseMemoryMaxed () {
  Object o = sagex.SageAPI.call("IsDatabaseMemoryMaxed", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br/>
Returns true if the database has maxed out its memory usage and cannot add more content

Returns:
true if the database has maxed out its memory usage and cannot add more content
Since:
6.5
 */
public static boolean IsDatabaseMemoryMaxed (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsDatabaseMemoryMaxed", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Strips any leading 'a, an or the' prefixes from the passed in string and returns the resulting string.
 If the property "ui/ignore_the_when_sorting" is set to false, this method will do nothing. The articles stripped
 by this method can be defined with the property "ui/prefixes_to_ignore_on_sort".

Parameters:
Text- the string to strip the leading articles from
Returns:
the String after the leading articles have been stripped from the past in string
Since:
7.0
 */
public static java.lang.String StripLeadingArticles (java.lang.String Text) {
  Object o = sagex.SageAPI.call("StripLeadingArticles", new Object[] {Text});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br/>
Strips any leading 'a, an or the' prefixes from the passed in string and returns the resulting string.
 If the property "ui/ignore_the_when_sorting" is set to false, this method will do nothing. The articles stripped
 by this method can be defined with the property "ui/prefixes_to_ignore_on_sort".

Parameters:
Text- the string to strip the leading articles from
Returns:
the String after the leading articles have been stripped from the past in string
Since:
7.0
 */
public static java.lang.String StripLeadingArticles (UIContext _uicontext,java.lang.String Text) {
  Object o = sagex.SageAPI.call(_uicontext, "StripLeadingArticles", new Object[] {Text});
  if (o!=null) return (java.lang.String) o;
  return null;
}

}
