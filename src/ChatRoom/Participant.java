package ChatRoom;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Participant extends UnicastRemoteObject implements IParticipant  {
	String name;
	
	protected Participant(String name) throws RemoteException {
		this.name = name;
	}

	@Override
	public String name() throws RemoteException{
		return name;
	}

	@Override
	public void receive(String name, String msg) throws RemoteException {
		if (!name.equals(this.name)) {
			System.out.println(name+": "+msg);
		}
	}

}
