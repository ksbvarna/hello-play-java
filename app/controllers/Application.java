package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Hello Play Framework"));
    }
    
    
    public static Result hello(String input) {
    	return ok(views.html.index.render("Hello " + input + "!"));
    }
}
