package rmiServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmiClient.ClientInt;

public interface ServerInt extends Remote {
	void registerClient(ClientInt client) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
}
