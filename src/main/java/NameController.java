import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;

public class NameController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Name name = new Name();

        get("/one", (req, res) -> {
            String result = name.returnOneRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("one", result);
            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            ArrayList<String> results = name.returnTwoRandomNames();
            String person1 = results.get(0);
            String person2 = results.get(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("person1", person1);
            model.put("person2", person2);
            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);
    }
}
