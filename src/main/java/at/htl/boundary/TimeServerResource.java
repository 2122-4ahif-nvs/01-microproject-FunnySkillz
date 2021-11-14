package at.htl.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path("time")
public class TimeServerResource {

    @GET
    public String getTime() {
        return "Time: " + LocalDateTime.now();
    }
}
