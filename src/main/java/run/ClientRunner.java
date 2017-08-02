package run;

import client.HazelcastClient;
import client.impl.HazelcastClient1;
import server.manager.HazelcastManager;
import server.manager.impl.HazelcastManagerImpl;

public class ClientRunner {

	public static void main(String[] args) {
		HazelcastManager hazelcastManager = new HazelcastManagerImpl();
		HazelcastClient hazelcastClient = new HazelcastClient1(hazelcastManager);
		hazelcastClient.view();
	}
}
