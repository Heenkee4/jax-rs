package se.heen.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import resource.IssueResource;
import se.heen.repository.impl.InMemoryIssueRepository;

@Component
public final class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(IssueResource.class);
		register(InMemoryIssueRepository.class);
		}
	}
