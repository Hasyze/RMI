package ChatRoom;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	
	public static void main(String[] args) throws IOException, NotBoundException  {
		Registry registry = LocateRegistry.getRegistry("localhost",8080);
		IPrinter printer = (IPrinter) registry.lookup("Printer");
		printer.print("Hello");
	}

}
