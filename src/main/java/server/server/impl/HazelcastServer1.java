package server.server.impl;

import java.util.Map;

import com.hazelcast.core.HazelcastInstance;

import server.manager.HazelcastManager;
import server.server.HazelcastServer;

public class HazelcastServer1 implements HazelcastServer {

	private final HazelcastInstance instance;
	
	public HazelcastServer1(HazelcastManager hazelcastManager) {
		this.instance = hazelcastManager.serverInstance();
	}
	
	@Override
	public void serve() {
		Map<String, Integer> map = instance.getMap("server1");
		map.put("fizz", 3);
		map.put("buzz", 5);
		map.put("fizzbuzz", 15);
	}
}
