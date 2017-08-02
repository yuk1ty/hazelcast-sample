package client.impl;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import client.HazelcastClient;
import server.manager.HazelcastManager;

public class HazelcastClient2 implements HazelcastClient {

	private final HazelcastInstance instance;
	
	public HazelcastClient2(HazelcastManager hazelcastManager) {
		this.instance = hazelcastManager.serverInstance();
	}
	
	@Override
	public void view() {
		IMap<String, Integer> map = instance.getMap("server2");
		map.values().forEach(System.out::println);
	}
}
