package sagex.stub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import sagex.api.enums.WidgetAPIEnum;

public class WidgetAPIProxy implements StubAPIProxy {
    private class Widget {
        public Map<String, Object> properties;
        public List<Widget> children = new ArrayList<Widget>();
    }
    
    private Widget parent = new Widget();
    
    public WidgetAPIProxy() {
    }
    
    public Object call(String cmd, Object[] args) {
        if (cmd.equals(WidgetAPIEnum.AddWidget)) {
            Widget w = new Widget();
            w.properties.put("Name", args[0]);
            return w;
        } else if (cmd.equals(WidgetAPIEnum.AddWidgetChild)) {
            ((Widget)args[0]).children.add((Widget) args[1]);
        } else if (cmd.equals(WidgetAPIEnum.FindWidgetBySymbol)) {
            return findWidget(parent, (String)args[0]);
        } else if (cmd.equals(WidgetAPIEnum.InsertWidgetChild)) {
            Widget p = (Widget) args[0];
            Widget c = (Widget) args[1];
            int i = (Integer) args[2];
            p.children.add(i, c);
        } else {
            System.out.println("WidgetAPIProxy: Unhandled: " + cmd);
        }
        return null;
    }
    
    private Widget findWidget(Widget p, String id) {
        if (p==null) {
            p = parent;
        }
        
        if (id.equals(p.properties.get("Name"))) {
            return p;
        }
        
        for (Widget w : p.children) {
            Widget x =findWidget(w, id);
            if (x!=null) return x;
        }
        return null;
    }

    public void attach(StubSageAPI api) {
        for (WidgetAPIEnum e : WidgetAPIEnum.values()) {
            api.addProxy(e.name(), this);
        }
    }
    
    public Widget newWidget(String name) {
        Widget w = new Widget();
        w.properties.put("Name", name);
        parent.children.add(w);
        return w;
    }
}
