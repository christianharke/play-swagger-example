package controllers.api;

import javax.inject.*;
import play.mvc.*;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    public Result api() {
        return redirect("/api/docs/index.html?url=/assets/openapi.json");
    }

}
