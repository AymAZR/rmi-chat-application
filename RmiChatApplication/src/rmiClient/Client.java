package rmiClient;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import rmiServer.ServerInt;

public class Client extends UnicastRemoteObject implements ClientInt, Runnable {
	private ServerInt server;
	private String name;
	private static final long serialVersionUID = 1L;

	protected Client(String name, ServerInt server) throws RemoteException {
		this.name = name;
		this.server = server;
		server.registerClient(this);
	}

	public void retrieveMessage(String message) throws RemoteException {
		System.out.println(message);
	}

	public void run() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String message;
		
		while (true) {
			message = scanner.nextLine();
			
			try {
				server.broadcastMessage(name +" : "+message);
			}
			catch(RemoteException e) {
				e.printStackTrace();
			}
		}
	}
	
}
