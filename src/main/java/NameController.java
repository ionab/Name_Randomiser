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

        Name name = new Name("Name1");
        Name name2 = new Name("Name2");
        Name name3 = new Name("Name3");
        Name name4 = new Name("Name4");
        Name name5 = new Name("Name5");
        Name name6 = new Name("Name6");
        Name name7 = new Name("Name7");
        Name name8 = new Name("Name8");
        Name name9 = new Name("Name9");
        Name name10 = new Name("Name10");
        Name name11 = new Name("Name11");
        Name name12 = new Name("Name12");
        Name name13 = new Name("Name13");
        Name name14 = new Name("Name14");
        Name name15 = new Name("Name15");
        Name name16 = new Name("Name16");
        Name name17 = new Name("Name17");
        Name name18 = new Name("Name18");
        Name name19 = new Name("Name19");
        Name name20 = new Name("Name20");



        get("/randomiser", (req, res) -> {
            ArrayList<Name> names = new ArrayList<Name>();
            names.add(name);
            names.add(name2);
            names.add(name3);
            names.add(name4);
            names.add(name5);
            names.add(name6);
            names.add(name7);
            names.add(name8);
            names.add(name9);
            names.add(name10);
            names.add(name11);
            names.add(name12);
            names.add(name13);
            names.add(name14);
            names.add(name15);
            names.add(name16);
            names.add(name17);
            names.add(name18);
            names.add(name19);
            names.add(name20);

            Collections.shuffle(names);
            Name result_name_1 = names.get(0);
            Name result_name_2 = names.get(1);
            Name result_name_3 = names.get(2);
            Name result_name_4 = names.get(3);
            Name result_name_5 = names.get(4);
            Name result_name_6 = names.get(5);
            Name result_name_7 = names.get(6);
            Name result_name_8 = names.get(7);
            Name result_name_9 = names.get(8);
            Name result_name_10 = names.get(9);
            Name result_name_11 = names.get(10);
            Name result_name_12 = names.get(11);
            Name result_name_13 = names.get(12);
            Name result_name_14 = names.get(13);
            Name result_name_15 = names.get(14);
            Name result_name_16 = names.get(15);
            Name result_name_17 = names.get(16);
            Name result_name_18 = names.get(17);
            Name result_name_19 = names.get(18);
            Name result_name_20 = names.get(19);

            HashMap<String, Object> model = new HashMap<>();
            model.put("result_name_1", result_name_1.getName());
            model.put("result_name_2", result_name_2.getName());
            model.put("result_name_3", result_name_3.getName());
            model.put("result_name_4", result_name_4.getName());
            model.put("result_name_5", result_name_5.getName());
            model.put("result_name_6", result_name_6.getName());
            model.put("result_name_7", result_name_7.getName());
            model.put("result_name_8", result_name_8.getName());
            model.put("result_name_9", result_name_9.getName());
            model.put("result_name_10", result_name_10.getName());
            model.put("result_name_11", result_name_11.getName());
            model.put("result_name_12", result_name_12.getName());
            model.put("result_name_13", result_name_13.getName());
            model.put("result_name_14", result_name_14.getName());
            model.put("result_name_15", result_name_15.getName());
            model.put("result_name_16", result_name_16.getName());
            model.put("result_name_17", result_name_17.getName());
            model.put("result_name_18", result_name_18.getName());
            model.put("result_name_19", result_name_19.getName());
            model.put("result_name_20", result_name_20.getName());

            return new ModelAndView(model, "results.vtl");

        }, velocityTemplateEngine);

    }
}
