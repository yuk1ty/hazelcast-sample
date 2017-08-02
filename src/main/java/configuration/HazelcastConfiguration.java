package configuration;

import com.hazelcast.client.ClientConfig;
import com.hazelcast.config.Config;

public class HazelcastConfiguration {

	private final Config config;
	
	private final ClientConfig clientConfig;
	
	private HazelcastConfiguration() {
		this.config = new Config();
		this.clientConfig = initClientConfig();
	}
	
	private ClientConfig initClientConfig() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("localhost:1234");
		return clientConfig;
	}
	
	public static HazelcastConfiguration newInstance() {
		return new HazelcastConfiguration();
	}
	
	public Config getConfig() {
		return config;
	}
	
	public ClientConfig getClientConfig() {
		return clientConfig;
	}
}
