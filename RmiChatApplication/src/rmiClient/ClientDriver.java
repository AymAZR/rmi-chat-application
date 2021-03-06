package rmiClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiServer.ServerInt;

public class ClientDriver {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String serverURL = "rmi://localhost/RMIServer";
		ServerInt server = (ServerInt) Naming.lookup(serverURL);
		new Thread(new Client(args[0], server)).start();
	}

}
