/**
 * Note about import java classes.
 * Use Packages.packageName to refer to a java packages.
 * ie, Packages.sagex.api.Global.GetOS();
 * 
 * You can create local vars for these, such as,
 * var global = Packages.sagex.api.Global;
 * global.GetOS();
 *
 * From the Sagex Web Services, you can invoke these services by calling
 * /sagex/api?c=sagex:Echo&1=Bill
 *
 * or if you wanted a JSON reply
 * /sagex/api?c=sagex:Echo&1=Bill&encoder=json
 *
 * So the 'c' argument accepts fileName:functionName.
 * ie, if you had a myservice.js file with a function called getItems(), then that file
 * would be placed in SAGE_HOME/sagex/services/
 * and you would call that service from the sagex web apis as
 * /sagex/api?c=myservice:getItems
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
 * Simple Service to return the Server's OS
 
 * @return
 */
function GetOS() {
	return Packages.sagex.api.Global.GetOS();
}