package controllers.api;

import play.mvc.Controller;
import play.mvc.Result;

public class ApiController extends Controller {

    public Result get() {
        return ok("get all that things");
    }

    public Result add(String s) {
        return created("added " + s);
    }

    public Result delete(String id) {
        return ok("deleted " + id);
    }

}
