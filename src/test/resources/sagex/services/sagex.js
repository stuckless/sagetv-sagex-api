/**
 * Note about import java classes.
 * Use Packages.packageName to refer to a java packages.
 * ie, Packages.sagex.api.Global.GetOS();
 * 
 * You can create local vars for these, such as,
 * var global = Packages.sagex.api.Global;
 * global.GetOS();
 * 
 */

/**
 * Simple Echo Service.  Echos whatever is passed in.
 * @param name
 * @return
 */
function Echo(name) {
	return name;
}

/**
 * Simple Service to return the Current Context
 
 * @return
 */
function GetUIContext() {
	var ctx =  Packages.sagex.SageAPI.getUIContext();
	if (ctx!=null) return ctx.getName();
	return null;
}

 /**
  * Used for Junit testing the API
  * @return
  */
function TestSageAPI1() {
	return Packages.sagex.api.Global.GetOS();
}

/**
 * Used for Junit testing the API
 * @return
 */
function TestSageAPI2(cmd) {
	return Packages.sagex.SageAPI.call(cmd, null);
}

function GetMediaFileTitle(mfObj) {
	return Packages.sagex.api.MediaFileAPI.GetMediaTitle(mfObj);
}