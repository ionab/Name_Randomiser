import java.util.ArrayList;
import java.util.Collections;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        names.add("name5");
        names.add("name6");
        names.add("name7");
        names.add("name8");
        names.add("name9");
        names.add("name10");
        names.add("name11");
        names.add("name12");
        names.add("name13");
        names.add("name14");
        names.add("name15");
        names.add("name16");
        names.add("name17");
        names.add("name18");
        names.add("name19");
        names.add("name20");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String returnOneRandomName() {
        Collections.shuffle(this.names);
        return names.get(0);
    }

    public ArrayList<String> returnTwoRandomNames() {
        Collections.shuffle(this.names);

        ArrayList<String> results = new ArrayList<>();
        results.add(this.names.get(0));
        results.add(this.names.get(1));

        this.names.remove(0);
        this.names.remove(1);

        return results;
    }


}

