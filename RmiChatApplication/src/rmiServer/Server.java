package rmiServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import rmiClient.ClientInt;

public class Server extends UnicastRemoteObject implements ServerInt {
	private static final long serialVersionUID = 1L;
	private ArrayList<ClientInt> clients;
	protected Server() throws RemoteException {
		clients = new ArrayList<ClientInt>();
	}

	public synchronized void registerClient(ClientInt client) throws RemoteException {
		this.clients.add(client);
	}

	public synchronized void broadcastMessage(String message) throws RemoteException {
		int i = 0;
		while (i < clients.size()) {
			clients.get(i++).retrieveMessage(message);
		}
	}
	
}
