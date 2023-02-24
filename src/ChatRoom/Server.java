package ChatRoom;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	public static void main(String[] args) throws IOException, NotBoundException, AlreadyBoundException  {
		IPrinter printer = new Printer();
		Registry registry = LocateRegistry.createRegistry(8080);
		//registry.bind("Printer", printer);
		registry.rebind("Printer", printer);
	}

}
