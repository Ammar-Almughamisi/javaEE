import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/endPoint")
@Produces("application/json")
@Consumes("application/json")
public class EndPoint {

    @GET
    public void test(){
        System.out.println("rest end point");
    }
}
