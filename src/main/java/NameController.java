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

    }
}
