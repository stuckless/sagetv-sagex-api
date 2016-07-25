
function getOS_OLD1() {
    var global = Packages.sagex.api.Global;
    return global.GetOS();
}

function getOS_OLD2() {
    if (!Global) return "'Global' not defined";
    var val = Global.GetOS();
    log.warn("GETOS returned: " + val);
    return val;
}

function getOS_JAVA8() {
    var GlobalJava8 = Java.type('sagex.api.Global');
    return GlobalJava8.GetOS();
}
