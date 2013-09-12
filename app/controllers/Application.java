package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
		System.out.println("Yop");
        return ok(index.render("this is da bomb."));
    }
  
}
