package proxy.protection;

import java.lang.reflect.Proxy;

public class StuffTestDrive {

    public static void main(String[] args) {
        StuffTestDrive test = new StuffTestDrive();
        test.drive();
    }

    public void drive() {
        Stuff owner = new StuffImpl();
        Stuff ownerProxy = getOwnerProxy(owner);
        try {
            ownerProxy.setDescription("Owner can do whatever");
            System.out.println("Owner set description");
        } catch (Exception e) {
            System.out.println("Cannot do whatever");
        }

        System.out.println(ownerProxy.getDescription());
        Stuff nonOwnerProxy = getNonOwnerProxy(owner);
        try {
            nonOwnerProxy.setDescription("Nonowner can do whatever?");
        } catch (Exception e) {
            System.out.println("Nononwer cannot do whatever");
        }
    }

    Stuff getNonOwnerProxy(Stuff stuff) {
        return (Stuff) Proxy.newProxyInstance(
                stuff.getClass().getClassLoader(),
                stuff.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(stuff));
    }

    Stuff getOwnerProxy(Stuff stuff) {
        return (Stuff) Proxy.newProxyInstance(
                stuff.getClass().getClassLoader(),
                stuff.getClass().getInterfaces(),
                new OwnerInvocationHandler(stuff));
    }
}
