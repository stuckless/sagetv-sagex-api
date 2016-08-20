package sagex.api;

/**
 * Unofficial SageTV Generated File - Never Edit
 * Generated Date/Time: 19/08/16 9:14 PM
 * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/WidgetAPI.html'>WidgetAPI</a>
 * This Generated API is not Affiliated with SageTV.  It is user contributed.
 */
import sagex.UIContext;
public class WidgetAPI {
/**
Loads a new SageTV Application Definition file that defines the entire user interface for SageTV

Parameters:
STVFile- the new .stv file that should be loaded for the UI
Returns:
true if it was succesful, otherwise an error string
 */
public static java.lang.Object LoadSTVFile (java.io.File STVFile) {
  Object o = sagex.SageAPI.call("LoadSTVFile", new Object[] {STVFile});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Loads a new SageTV Application Definition file that defines the entire user interface for SageTV

Parameters:
STVFile- the new .stv file that should be loaded for the UI
Returns:
true if it was succesful, otherwise an error string
 */
public static java.lang.Object LoadSTVFile (UIContext _uicontext,java.io.File STVFile) {
  Object o = sagex.SageAPI.call(_uicontext, "LoadSTVFile", new Object[] {STVFile});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Imports a SageTV Application Definition file into the current STV file that is loaded. This will essentially merge the two together.

Parameters:
STVFile- the .stv file that should be imported into the currently loaded one
Returns:
true if it was succesful, otherwise an error string
 */
public static java.lang.Object ImportSTVFile (java.io.File STVFile) {
  Object o = sagex.SageAPI.call("ImportSTVFile", new Object[] {STVFile});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Imports a SageTV Application Definition file into the current STV file that is loaded. This will essentially merge the two together.

Parameters:
STVFile- the .stv file that should be imported into the currently loaded one
Returns:
true if it was succesful, otherwise an error string
 */
public static java.lang.Object ImportSTVFile (UIContext _uicontext,java.io.File STVFile) {
  Object o = sagex.SageAPI.call(_uicontext, "ImportSTVFile", new Object[] {STVFile});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Returns true if the currently loaded STV has been modified at all since its last save

Returns:
true if the currently loaded STV has been modified at all since its last save
Since:
6.1
 */
public static boolean IsSTVModified () {
  Object o = sagex.SageAPI.call("IsSTVModified", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the currently loaded STV has been modified at all since its last save

Returns:
true if the currently loaded STV has been modified at all since its last save
Since:
6.1
 */
public static boolean IsSTVModified (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "IsSTVModified", (Object[])null);
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Gets all of the Widgets that are in the currently loaded STV

Returns:
all of the Widgets that are in the currently loaded STV
 */
public static Object[] GetAllWidgets () {
  return (Object[]) sagex.SageAPI.call("GetAllWidgets", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets all of the Widgets that are in the currently loaded STV

Returns:
all of the Widgets that are in the currently loaded STV
 */
public static Object[] GetAllWidgets (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetAllWidgets", (Object[])null);
}

/**
Gets all of the Widgets that are in the currently loaded STV that are of the specified type

Parameters:
WidgetType- the name of the widget type
Returns:
all of the Widgets that are in the currently loaded STV that are of the specified type
 */
public static Object[] GetWidgetsByType (java.lang.String WidgetType) {
  return (Object[]) sagex.SageAPI.call("GetWidgetsByType", new Object[] {WidgetType});
}

/**
 * UI Context Aware Call<br>
Gets all of the Widgets that are in the currently loaded STV that are of the specified type

Parameters:
WidgetType- the name of the widget type
Returns:
all of the Widgets that are in the currently loaded STV that are of the specified type
 */
public static Object[] GetWidgetsByType (UIContext _uicontext,java.lang.String WidgetType) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetWidgetsByType", new Object[] {WidgetType});
}

/**
Creates a new Widget of the specified type and adds it to the STV

Parameters:
WidgetType- the type of the new Widget
Returns:
the newly created Widget
 */
public static Object AddWidget (java.lang.String WidgetType) {
  Object o = sagex.SageAPI.call("AddWidget", new Object[] {WidgetType});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a new Widget of the specified type and adds it to the STV

Parameters:
WidgetType- the type of the new Widget
Returns:
the newly created Widget
 */
public static Object AddWidget (UIContext _uicontext,java.lang.String WidgetType) {
  Object o = sagex.SageAPI.call(_uicontext, "AddWidget", new Object[] {WidgetType});
  if (o!=null) return (Object) o;
  return null;
}

/**
Creates a new Widget of the specified type and adds it to the STV. This also allows specifying the desired symbol to use for the Widget.
 If the symbol is already in use; then a new symbol will automatically be assigned to this Widget instead.

Parameters:
WidgetType- the type of the new Widget
Symbol- the symbol name for the new widget (UID)
Returns:
the newly created Widget
Since:
7.0
 */
public static Object AddWidgetWithSymbol (java.lang.String WidgetType, java.lang.String Symbol) {
  Object o = sagex.SageAPI.call("AddWidgetWithSymbol", new Object[] {WidgetType,Symbol});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Creates a new Widget of the specified type and adds it to the STV. This also allows specifying the desired symbol to use for the Widget.
 If the symbol is already in use; then a new symbol will automatically be assigned to this Widget instead.

Parameters:
WidgetType- the type of the new Widget
Symbol- the symbol name for the new widget (UID)
Returns:
the newly created Widget
Since:
7.0
 */
public static Object AddWidgetWithSymbol (UIContext _uicontext,java.lang.String WidgetType, java.lang.String Symbol) {
  Object o = sagex.SageAPI.call(_uicontext, "AddWidgetWithSymbol", new Object[] {WidgetType,Symbol});
  if (o!=null) return (Object) o;
  return null;
}

/**
Removes a Widget from the STV

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) to remove
 */
public static void RemoveWidget (Object Widget) {
   sagex.SageAPI.call("RemoveWidget", new Object[] {Widget});
}

/**
 * UI Context Aware Call<br>
Removes a Widget from the STV

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) to remove
 */
public static void RemoveWidget (UIContext _uicontext,Object Widget) {
   sagex.SageAPI.call(_uicontext, "RemoveWidget", new Object[] {Widget});
}

/**
Creates a parent-child relationship between two Widgets. If the relationship already exists, this call has no effect.
 This new child will be the last child of the parent.

Parameters:
WidgetParent- the Widget (or a String which represents the symbol for that Widget) that should be the parent in the relationship
WidgetChild- the Widget (or a String which represents the symbol for that Widget) that should be the child in the relationship
 */
public static void AddWidgetChild (Object WidgetParent, Object WidgetChild) {
   sagex.SageAPI.call("AddWidgetChild", new Object[] {WidgetParent,WidgetChild});
}

/**
 * UI Context Aware Call<br>
Creates a parent-child relationship between two Widgets. If the relationship already exists, this call has no effect.
 This new child will be the last child of the parent.

Parameters:
WidgetParent- the Widget (or a String which represents the symbol for that Widget) that should be the parent in the relationship
WidgetChild- the Widget (or a String which represents the symbol for that Widget) that should be the child in the relationship
 */
public static void AddWidgetChild (UIContext _uicontext,Object WidgetParent, Object WidgetChild) {
   sagex.SageAPI.call(_uicontext, "AddWidgetChild", new Object[] {WidgetParent,WidgetChild});
}

/**
Creates a parent-child relationship between two Widgets. Since parent-child relationships are ordered, this allows
 specifying where in that order this relationship should be.

Parameters:
WidgetParent- the Widget (or a String which represents the symbol for that Widget) that should be the parent in the relationship
WidgetChild- the Widget (or a String which represents the symbol for that Widget) that should be the child in the relationship
ChildIndex- the 0-based index in the parent's child relationships list that the new relationship should occupy
 */
public static void InsertWidgetChild (Object WidgetParent, Object WidgetChild, int ChildIndex) {
   sagex.SageAPI.call("InsertWidgetChild", new Object[] {WidgetParent,WidgetChild,ChildIndex});
}

/**
 * UI Context Aware Call<br>
Creates a parent-child relationship between two Widgets. Since parent-child relationships are ordered, this allows
 specifying where in that order this relationship should be.

Parameters:
WidgetParent- the Widget (or a String which represents the symbol for that Widget) that should be the parent in the relationship
WidgetChild- the Widget (or a String which represents the symbol for that Widget) that should be the child in the relationship
ChildIndex- the 0-based index in the parent's child relationships list that the new relationship should occupy
 */
public static void InsertWidgetChild (UIContext _uicontext,Object WidgetParent, Object WidgetChild, int ChildIndex) {
   sagex.SageAPI.call(_uicontext, "InsertWidgetChild", new Object[] {WidgetParent,WidgetChild,ChildIndex});
}

/**
Breaks a parent-child relationships between two Widgets. If the Widgets do not have the specified parent-child relationship
 then there is no effect.

Parameters:
WidgetParent- the parent of the Widget (or a String which represents the symbol for that Widget) relationship to break
WidgetChild- the child of the Widget (or a String which represents the symbol for that Widget) relationship to break
 */
public static void RemoveWidgetChild (Object WidgetParent, Object WidgetChild) {
   sagex.SageAPI.call("RemoveWidgetChild", new Object[] {WidgetParent,WidgetChild});
}

/**
 * UI Context Aware Call<br>
Breaks a parent-child relationships between two Widgets. If the Widgets do not have the specified parent-child relationship
 then there is no effect.

Parameters:
WidgetParent- the parent of the Widget (or a String which represents the symbol for that Widget) relationship to break
WidgetChild- the child of the Widget (or a String which represents the symbol for that Widget) relationship to break
 */
public static void RemoveWidgetChild (UIContext _uicontext,Object WidgetParent, Object WidgetChild) {
   sagex.SageAPI.call(_uicontext, "RemoveWidgetChild", new Object[] {WidgetParent,WidgetChild});
}

/**
Returns true if the specified Widgets have a parent-child relationship.

Parameters:
WidgetParent- the parent Widget (or a String which represents the symbol for that Widget) to test
WidgetChild- the child Widget (or a String which represents the symbol for that Widget) to test
Returns:
true if the specified parent has a parent-child relationship with the specified child, false otherwise
 */
public static boolean IsWidgetParentOf (Object WidgetParent, Object WidgetChild) {
  Object o = sagex.SageAPI.call("IsWidgetParentOf", new Object[] {WidgetParent,WidgetChild});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Widgets have a parent-child relationship.

Parameters:
WidgetParent- the parent Widget (or a String which represents the symbol for that Widget) to test
WidgetChild- the child Widget (or a String which represents the symbol for that Widget) to test
Returns:
true if the specified parent has a parent-child relationship with the specified child, false otherwise
 */
public static boolean IsWidgetParentOf (UIContext _uicontext,Object WidgetParent, Object WidgetChild) {
  Object o = sagex.SageAPI.call(_uicontext, "IsWidgetParentOf", new Object[] {WidgetParent,WidgetChild});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the type of a Widget

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) object
Returns:
the type name of the specified Widget
 */
public static java.lang.String GetWidgetType (Object Widget) {
  Object o = sagex.SageAPI.call("GetWidgetType", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the type of a Widget

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) object
Returns:
the type name of the specified Widget
 */
public static java.lang.String GetWidgetType (UIContext _uicontext,Object Widget) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetType", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns true if the specified Widget has a property defined with the specified name

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to check existence of
Returns:
true if the specified Widget has a property defined with the specified name, false otherwise
 */
public static boolean HasWidgetProperty (Object Widget, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("HasWidgetProperty", new Object[] {Widget,PropertyName});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Returns true if the specified Widget has a property defined with the specified name

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to check existence of
Returns:
true if the specified Widget has a property defined with the specified name, false otherwise
 */
public static boolean HasWidgetProperty (UIContext _uicontext,Object Widget, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "HasWidgetProperty", new Object[] {Widget,PropertyName});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Sets a property in a Widget to a specified value. If that property is already defined, this will overwrite it.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to set in the Widget
PropertyValue- the value to set the property to
 */
public static void SetWidgetProperty (Object Widget, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call("SetWidgetProperty", new Object[] {Widget,PropertyName,PropertyValue});
}

/**
 * UI Context Aware Call<br>
Sets a property in a Widget to a specified value. If that property is already defined, this will overwrite it.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to set in the Widget
PropertyValue- the value to set the property to
 */
public static void SetWidgetProperty (UIContext _uicontext,Object Widget, java.lang.String PropertyName, java.lang.String PropertyValue) {
   sagex.SageAPI.call(_uicontext, "SetWidgetProperty", new Object[] {Widget,PropertyName,PropertyValue});
}

/**
Returns the value for a specified property in a Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to get
Returns:
the value for a specified property in a Widget
 */
public static java.lang.String GetWidgetProperty (Object Widget, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call("GetWidgetProperty", new Object[] {Widget,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the value for a specified property in a Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
PropertyName- the name of the property to get
Returns:
the value for a specified property in a Widget
 */
public static java.lang.String GetWidgetProperty (UIContext _uicontext,Object Widget, java.lang.String PropertyName) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetProperty", new Object[] {Widget,PropertyName});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the name of the specified Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
the name of the specified Widget
 */
public static java.lang.String GetWidgetName (Object Widget) {
  Object o = sagex.SageAPI.call("GetWidgetName", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the name of the specified Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
the name of the specified Widget
 */
public static java.lang.String GetWidgetName (UIContext _uicontext,Object Widget) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetName", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Sets the name for a Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Name- the value to set the name to for this Widget
 */
public static void SetWidgetName (Object Widget, java.lang.String Name) {
   sagex.SageAPI.call("SetWidgetName", new Object[] {Widget,Name});
}

/**
 * UI Context Aware Call<br>
Sets the name for a Widget

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Name- the value to set the name to for this Widget
 */
public static void SetWidgetName (UIContext _uicontext,Object Widget, java.lang.String Name) {
   sagex.SageAPI.call(_uicontext, "SetWidgetName", new Object[] {Widget,Name});
}

/**
Gets the list of Widgets that are parents of the specified Widget. The ordering of this list has no effect.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
a list of Widgets which are all parents of the specified Widget
 */
public static Object[] GetWidgetParents (Object Widget) {
  return (Object[]) sagex.SageAPI.call("GetWidgetParents", new Object[] {Widget});
}

/**
 * UI Context Aware Call<br>
Gets the list of Widgets that are parents of the specified Widget. The ordering of this list has no effect.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
a list of Widgets which are all parents of the specified Widget
 */
public static Object[] GetWidgetParents (UIContext _uicontext,Object Widget) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetWidgetParents", new Object[] {Widget});
}

/**
Gets the list of Widgets that are children of the specified Widget. The ordering of this list does have an effect.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
a list of Widgets which are all children of the specified Widget
 */
public static Object[] GetWidgetChildren (Object Widget) {
  return (Object[]) sagex.SageAPI.call("GetWidgetChildren", new Object[] {Widget});
}

/**
 * UI Context Aware Call<br>
Gets the list of Widgets that are children of the specified Widget. The ordering of this list does have an effect.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget)
Returns:
a list of Widgets which are all children of the specified Widget
 */
public static Object[] GetWidgetChildren (UIContext _uicontext,Object Widget) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetWidgetChildren", new Object[] {Widget});
}

/**
Executes a Widget and the chain of child Widgets underneath it

Parameters:
Widget- the root of the Widget (or a String which represents the symbol for that Widget) action chain to execute
Returns:
the value returned by the last executed Widget in the chain
 */
public static java.lang.Object ExecuteWidgetChain (Object Widget) {
  Object o = sagex.SageAPI.call("ExecuteWidgetChain", new Object[] {Widget});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Executes a Widget and the chain of child Widgets underneath it

Parameters:
Widget- the root of the Widget (or a String which represents the symbol for that Widget) action chain to execute
Returns:
the value returned by the last executed Widget in the chain
 */
public static java.lang.Object ExecuteWidgetChain (UIContext _uicontext,Object Widget) {
  Object o = sagex.SageAPI.call(_uicontext, "ExecuteWidgetChain", new Object[] {Widget});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Executes a Widget and the chain of child Widgets underneath it. This will use the context of the currently loaded menu to do this which
 is useful if you want to launch an OptionsMenu programatically w/ the proper parent context. NOTE: If this does launch an OptionsMenu then the
 value returned from this function will not be usable and this call will return once the OptionsMenu is launched. Once it is closed the core
 will resume execution of the widget chain using one of its own internal threads at that point.

Parameters:
Widget- the root of the Widget (or a String which represents the symbol for that Widget) action chain to execute
Returns:
the value returned by the last executed Widget in the chain
Since:
7.0
 */
public static java.lang.Object ExecuteWidgetChainInCurrentMenuContext (Object Widget) {
  Object o = sagex.SageAPI.call("ExecuteWidgetChainInCurrentMenuContext", new Object[] {Widget});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Executes a Widget and the chain of child Widgets underneath it. This will use the context of the currently loaded menu to do this which
 is useful if you want to launch an OptionsMenu programatically w/ the proper parent context. NOTE: If this does launch an OptionsMenu then the
 value returned from this function will not be usable and this call will return once the OptionsMenu is launched. Once it is closed the core
 will resume execution of the widget chain using one of its own internal threads at that point.

Parameters:
Widget- the root of the Widget (or a String which represents the symbol for that Widget) action chain to execute
Returns:
the value returned by the last executed Widget in the chain
Since:
7.0
 */
public static java.lang.Object ExecuteWidgetChainInCurrentMenuContext (UIContext _uicontext,Object Widget) {
  Object o = sagex.SageAPI.call(_uicontext, "ExecuteWidgetChainInCurrentMenuContext", new Object[] {Widget});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Launches a new menu in SageTV with the specified Widget as the menu's definition.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget) to use for the launched menu, this must be a Menu type Widget
 */
public static void LaunchMenuWidget (Object Widget) {
   sagex.SageAPI.call("LaunchMenuWidget", new Object[] {Widget});
}

/**
 * UI Context Aware Call<br>
Launches a new menu in SageTV with the specified Widget as the menu's definition.

Parameters:
Widget- the Widget object (or a String which represents the symbol for that Widget) to use for the launched menu, this must be a Menu type Widget
 */
public static void LaunchMenuWidget (UIContext _uicontext,Object Widget) {
   sagex.SageAPI.call(_uicontext, "LaunchMenuWidget", new Object[] {Widget});
}

/**
Gets the STV file that is currently loaded by the system

Returns:
the STV file that is currently loaded by the system
 */
public static java.lang.String GetCurrentSTVFile () {
  Object o = sagex.SageAPI.call("GetCurrentSTVFile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the STV file that is currently loaded by the system

Returns:
the STV file that is currently loaded by the system
 */
public static java.lang.String GetCurrentSTVFile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentSTVFile", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Searches the children of the specified Widget for one with the specified type and name. If no match
 is found then null is returned. If there are multiple matches then the first one is returned.

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) who's children should be searched
Type- the type of the Widget to search for, if null than any type will match
Name- the name that the Widget to search for must match, if null than any name will match
Returns:
the Widget child of the specified Widget of the specified type and name
 */
public static Object GetWidgetChild (Object Widget, java.lang.String Type, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetWidgetChild", new Object[] {Widget,Type,Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Searches the children of the specified Widget for one with the specified type and name. If no match
 is found then null is returned. If there are multiple matches then the first one is returned.

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) who's children should be searched
Type- the type of the Widget to search for, if null than any type will match
Name- the name that the Widget to search for must match, if null than any name will match
Returns:
the Widget child of the specified Widget of the specified type and name
 */
public static Object GetWidgetChild (UIContext _uicontext,Object Widget, java.lang.String Type, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetChild", new Object[] {Widget,Type,Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
Searches the parents of the specified Widget for one with the specified type and name. If no match
 is found then null is returned. If there are multiple matches then the first one is returned.

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) who's parents should be searched
Type- the type of the Widget to search for, if null than any type will match
Name- the name that the Widget to search for must match, if null than any name will match
Returns:
the Widget parent of the specified Widget of the specified type and name
 */
public static Object GetWidgetParent (Object Widget, java.lang.String Type, java.lang.String Name) {
  Object o = sagex.SageAPI.call("GetWidgetParent", new Object[] {Widget,Type,Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Searches the parents of the specified Widget for one with the specified type and name. If no match
 is found then null is returned. If there are multiple matches then the first one is returned.

Parameters:
Widget- the Widget (or a String which represents the symbol for that Widget) who's parents should be searched
Type- the type of the Widget to search for, if null than any type will match
Name- the name that the Widget to search for must match, if null than any name will match
Returns:
the Widget parent of the specified Widget of the specified type and name
 */
public static Object GetWidgetParent (UIContext _uicontext,Object Widget, java.lang.String Type, java.lang.String Name) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetParent", new Object[] {Widget,Type,Name});
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets the Widget the defines the menu that is currently loaded by the system

Returns:
the Widget the defines the menu that is currently loaded by the system
 */
public static Object GetCurrentMenuWidget () {
  Object o = sagex.SageAPI.call("GetCurrentMenuWidget", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Gets the Widget the defines the menu that is currently loaded by the system

Returns:
the Widget the defines the menu that is currently loaded by the system
 */
public static Object GetCurrentMenuWidget (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetCurrentMenuWidget", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Gets a list of the Widgets that have defined the menus that were recently displayed in the UI

Returns:
a list of the Widgets that have defined the menus that were recently displayed in the UI
 */
public static Object[] GetWidgetMenuHistory () {
  return (Object[]) sagex.SageAPI.call("GetWidgetMenuHistory", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of the Widgets that have defined the menus that were recently displayed in the UI

Returns:
a list of the Widgets that have defined the menus that were recently displayed in the UI
 */
public static Object[] GetWidgetMenuHistory (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetWidgetMenuHistory", (Object[])null);
}

/**
Gets a list of the Widgets that have defined the menus that were recently displayed in the UI.
 UnlikeGetWidgetMenuHistory()
this only returns Menus that are
 'Back' (not Forward) in the navigations the user has performed. Similar to getting only the 'Back'
 history in a web browser.

Returns:
a list of the Widgets that have defined the menus that were recently displayed in the UI
Since:
5.1
 */
public static Object[] GetWidgetMenuBackHistory () {
  return (Object[]) sagex.SageAPI.call("GetWidgetMenuBackHistory", (Object[])null);
}

/**
 * UI Context Aware Call<br>
Gets a list of the Widgets that have defined the menus that were recently displayed in the UI.
 UnlikeGetWidgetMenuHistory()
this only returns Menus that are
 'Back' (not Forward) in the navigations the user has performed. Similar to getting only the 'Back'
 history in a web browser.

Returns:
a list of the Widgets that have defined the menus that were recently displayed in the UI
Since:
5.1
 */
public static Object[] GetWidgetMenuBackHistory (UIContext _uicontext) {
  return (Object[]) sagex.SageAPI.call(_uicontext, "GetWidgetMenuBackHistory", (Object[])null);
}

/**
Evaluates the passed in expression and returns the result. This is executed in a new variable context w/out any
 user interface context.

Parameters:
Expression- the expression string to evaluate
Returns:
the result of evaluating the specified expression
 */
public static java.lang.Object EvaluateExpression (java.lang.String Expression) {
  Object o = sagex.SageAPI.call("EvaluateExpression", new Object[] {Expression});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Evaluates the passed in expression and returns the result. This is executed in a new variable context w/out any
 user interface context.

Parameters:
Expression- the expression string to evaluate
Returns:
the result of evaluating the specified expression
 */
public static java.lang.Object EvaluateExpression (UIContext _uicontext,java.lang.String Expression) {
  Object o = sagex.SageAPI.call(_uicontext, "EvaluateExpression", new Object[] {Expression});
  if (o!=null) return (java.lang.Object) o;
  return null;
}

/**
Saves all of the current Widgets as an XML file. Same as the "Save a Copy as XML..." in the Studio.

Parameters:
File- the file to write to
Overwrite- if true then if the File exists it will be overwritten
Returns:
true if successful, false if not
 */
public static boolean SaveWidgetsAsXML (java.io.File File, boolean Overwrite) {
  Object o = sagex.SageAPI.call("SaveWidgetsAsXML", new Object[] {File,Overwrite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
 * UI Context Aware Call<br>
Saves all of the current Widgets as an XML file. Same as the "Save a Copy as XML..." in the Studio.

Parameters:
File- the file to write to
Overwrite- if true then if the File exists it will be overwritten
Returns:
true if successful, false if not
 */
public static boolean SaveWidgetsAsXML (UIContext _uicontext,java.io.File File, boolean Overwrite) {
  Object o = sagex.SageAPI.call(_uicontext, "SaveWidgetsAsXML", new Object[] {File,Overwrite});
  if (o!=null) return (Boolean) o;
  return false;
}

/**
Returns the UID symbol for the specified Widget

Parameters:
Widget- the Widget object
Returns:
the UID symbol which is used to represent this widget uniquely
Since:
6.4
 */
public static java.lang.String GetWidgetSymbol (Object Widget) {
  Object o = sagex.SageAPI.call("GetWidgetSymbol", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the UID symbol for the specified Widget

Parameters:
Widget- the Widget object
Returns:
the UID symbol which is used to represent this widget uniquely
Since:
6.4
 */
public static java.lang.String GetWidgetSymbol (UIContext _uicontext,Object Widget) {
  Object o = sagex.SageAPI.call(_uicontext, "GetWidgetSymbol", new Object[] {Widget});
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the Widget represented by the specified UID symbol

Parameters:
Symbol- the UID symbol to lookup the Widget for
Returns:
the Widget who's symbol matches the argument, null if it cannot be found
Since:
6.4
 */
public static Object FindWidgetBySymbol (java.lang.String Symbol) {
  Object o = sagex.SageAPI.call("FindWidgetBySymbol", new Object[] {Symbol});
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Widget represented by the specified UID symbol

Parameters:
Symbol- the UID symbol to lookup the Widget for
Returns:
the Widget who's symbol matches the argument, null if it cannot be found
Since:
6.4
 */
public static Object FindWidgetBySymbol (UIContext _uicontext,java.lang.String Symbol) {
  Object o = sagex.SageAPI.call(_uicontext, "FindWidgetBySymbol", new Object[] {Symbol});
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the file path for the default STV file

Returns:
the file path for the default STV file
Since:
6.4
 */
public static java.io.File GetDefaultSTVFile () {
  Object o = sagex.SageAPI.call("GetDefaultSTVFile", (Object[])null);
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the file path for the default STV file

Returns:
the file path for the default STV file
Since:
6.4
 */
public static java.io.File GetDefaultSTVFile (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetDefaultSTVFile", (Object[])null);
  if (o!=null) return (java.io.File) o;
  return null;
}

/**
Returns the Widget for the corresponding UI component that this execution originated from. For
 'green' process chains; this will correspond to the UI component that received the event. For 'blue'
 UI chains; this will correspond to the UI component who's conditionality is being determined or who's data
 is being evaluated. This will be null if there is no UI context; such as for non-UI hooks and calls made from
 Java directly.

Returns:
the Widget that corresponds to the UI context used for the current evaluation, null if there is no context
Since:
6.6
 */
public static Object GetUIWidgetContext () {
  Object o = sagex.SageAPI.call("GetUIWidgetContext", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the Widget for the corresponding UI component that this execution originated from. For
 'green' process chains; this will correspond to the UI component that received the event. For 'blue'
 UI chains; this will correspond to the UI component who's conditionality is being determined or who's data
 is being evaluated. This will be null if there is no UI context; such as for non-UI hooks and calls made from
 Java directly.

Returns:
the Widget that corresponds to the UI context used for the current evaluation, null if there is no context
Since:
6.6
 */
public static Object GetUIWidgetContext (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetUIWidgetContext", (Object[])null);
  if (o!=null) return (Object) o;
  return null;
}

/**
Returns the value of the 'STVName' Attribute under the Global Theme Widget. This is used for dependencies relating to plugins.

Returns:
the value of the 'STVName' Attribute under the Global Theme Widget
Since:
7.0
 */
public static java.lang.String GetSTVName () {
  Object o = sagex.SageAPI.call("GetSTVName", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the value of the 'STVName' Attribute under the Global Theme Widget. This is used for dependencies relating to plugins.

Returns:
the value of the 'STVName' Attribute under the Global Theme Widget
Since:
7.0
 */
public static java.lang.String GetSTVName (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSTVName", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
Returns the value of the 'STVVersion' Attribute under the Global Theme Widget. This is used for dependencies relating to plugins.

Returns:
the value of the 'STVVersion' Attribute under the Global Theme Widget
Since:
7.0
 */
public static java.lang.String GetSTVVersion () {
  Object o = sagex.SageAPI.call("GetSTVVersion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

/**
 * UI Context Aware Call<br>
Returns the value of the 'STVVersion' Attribute under the Global Theme Widget. This is used for dependencies relating to plugins.

Returns:
the value of the 'STVVersion' Attribute under the Global Theme Widget
Since:
7.0
 */
public static java.lang.String GetSTVVersion (UIContext _uicontext) {
  Object o = sagex.SageAPI.call(_uicontext, "GetSTVVersion", (Object[])null);
  if (o!=null) return (java.lang.String) o;
  return null;
}

}
