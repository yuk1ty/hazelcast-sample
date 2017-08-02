package server.server.impl;

import java.util.Map;

import com.hazelcast.core.HazelcastInstance;

import server.manager.HazelcastManager;
import server.server.HazelcastServer;

public class HazelcastServer2 implements HazelcastServer {

	private final HazelcastInstance instance;
	
	public HazelcastServer2(HazelcastManager hazelcastManager) {
		this.instance = hazelcastManager.serverInstance();
	}
	
	@Override
	public void serve() {
		Map<String, Integer> map = instance.getMap("server2");
		map.put("fib1", 0);
		map.put("fib2", 1);
		map.put("fib3", 1);
		map.put("fib4", 2);
		map.put("fib5", 3);
		map.put("fib6", 5);
	}

}
