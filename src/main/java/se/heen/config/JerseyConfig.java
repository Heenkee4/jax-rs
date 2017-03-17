package se.heen.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import resource.IssueResource;

@Component
public final class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(IssueResource.class);
		}
	}
