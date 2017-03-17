package resource;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Component;

import se.heen.model.Issue;


@Component
@Path("/IssueResource")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class IssueResource {
	
	private static final Map<String, Issue> issues = new HashMap<>();

	@Context
	private UriInfo uriInfo;
	
	@POST
	public Response createIssue(String name, String number) {
		Issue issue = new Issue(name, number);
		issues.put(issue.getNumber(), issue);
		
		URI location = uriInfo.getAbsolutePathBuilder().path(issue.getNumber()).build();
		return Response.created(location).build();		
	}
	
	@GET
	@Path("{number}")
	public Response getIssue(@PathParam("number") String number) {
		if (issues.containsKey(number)) {
			return Response.ok(issues.get(number).toString()).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	@PUT
	@Path("{number}")
	public Response updateIssue(@PathParam("number") String number, String name) {
		if (issues.containsKey(number)) {
			issues.put(number, new Issue(number, name));
			return Response.noContent().build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	@DELETE
	@Path("{number}")
	public Response deleteIssue(@PathParam("number") String number) {
		if (issues.containsKey(number)) {
			issues.remove(number);
			return Response.noContent().build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

}
