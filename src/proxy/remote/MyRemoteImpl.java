package proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Server says, Hey";
    }

    public static void main(String[] args) {
        try {
            // Use this to "start" registry rather than rmiregistry in term
            LocateRegistry.createRegistry(1099);
            System.out.println("Try block");
            MyRemote service = new MyRemoteImpl();
            System.out.println("1");
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            System.out.println("2");
            Naming.rebind("RemoteHello", service);
            System.out.println("3");
        } catch (Exception ex) {
            System.out.println("Catch block");
            ex.printStackTrace();
        }
    }
}
