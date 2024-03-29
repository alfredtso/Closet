package proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    Stuff stuff;

    public OwnerInvocationHandler(Stuff stuff) { this.stuff = stuff; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(stuff, args);
            } else if (method.getName().startsWith("set")) {
                return method.invoke(stuff, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
