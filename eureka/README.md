Eureka

Server



Client Config [org.springframework.cloud.netflix.eureka.EurekaClientConfigBean]

registryFetchIntervalSeconds = 30 // Indicates how often(in seconds) to fetch the registry information from the eureka 
instanceInfoReplicationIntervalSeconds = 30 // Indicates how often(in seconds) to replicate instance changes to be replicated to the eureka server
initialInstanceInfoReplicationIntervalSeconds = 40 // Indicates how long initially (in seconds) to replicate instance info to the eureka server
eurekaServiceUrlPollIntervalSeconds = 300 
//Indicates how often(in seconds) to poll for changes to eureka server information. Eureka servers could be added or removed and this setting controls how soon the eureka clients should know about it.