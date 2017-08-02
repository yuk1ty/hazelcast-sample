package run;

import server.manager.HazelcastManager;
import server.manager.impl.HazelcastManagerImpl;
import server.server.HazelcastServer;
import server.server.impl.HazelcastServer1;


public class ServerRunner {

	public static void main(String[] args) {
		HazelcastManager hazelcastManager = new HazelcastManagerImpl();
		HazelcastServer hazelcastServer = new HazelcastServer1(hazelcastManager);
		hazelcastServer.serve();
	}
}
