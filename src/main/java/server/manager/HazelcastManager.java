package server.manager;

import com.hazelcast.core.HazelcastInstance;

public interface HazelcastManager {

	HazelcastInstance serverInstance();
	
	HazelcastInstance clientInstance();
}
