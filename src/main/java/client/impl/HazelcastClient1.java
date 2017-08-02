package client.impl;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import client.HazelcastClient;
import server.manager.HazelcastManager;

public class HazelcastClient1 implements HazelcastClient {

	private final HazelcastInstance instance;
	
	public HazelcastClient1(HazelcastManager hazelcastManager) {
		this.instance = hazelcastManager.serverInstance();
	}
	
	@Override
	public void view() {
		IMap<String, Integer> map = instance.getMap("server1");
		System.out.println("is fizz?: " + map.get("fizz"));
		System.out.println("is buzz?: " + map.get("buzz"));
		System.out.println("is fizzbuzz?: " + map.get("fizzbuzz"));
	}

}
