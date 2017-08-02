package server.manager.impl;

import com.hazelcast.client.ClientConfig;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import configuration.HazelcastConfiguration;
import server.manager.HazelcastManager;

public class HazelcastManagerImpl implements HazelcastManager {

	private final Config config;
	
	private final ClientConfig clientConfig;
	
	public HazelcastManagerImpl() {
		HazelcastConfiguration hazelcastConfig = HazelcastConfiguration.newInstance();
		this.config = hazelcastConfig.getConfig();
		this.clientConfig = hazelcastConfig.getClientConfig();
	}
	
	@Override
	public HazelcastInstance serverInstance() {
		return Hazelcast.newHazelcastInstance(config);
	}

	@Override
	public HazelcastInstance clientInstance() {
		return HazelcastClient.newHazelcastClient(clientConfig);
	}

}
