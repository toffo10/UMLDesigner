package compiler.util;

import java.util.ArrayList;
import java.util.List;

public class Method {
    private String visibility;
    private String id;
    private String type;
    private List<MethodParam> mp;

    public Method(String visibility, String id, String type) {
        this.id = id;
        this.visibility = visibility;
        this.type = type;
        mp = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MethodParam> getMp() {
        return mp;
    }

    public void setMp(List<MethodParam> mp) {
        this.mp = mp;
    }

    public String toString() {
        return " " + visibility + id + "(" + getMethodParameters() + "): " + type;
    }

    public String getMethodParameters() {
        StringBuilder sb = new StringBuilder();

        if(mp != null) {
            for (MethodParam methodParam : mp) {
                sb.append(String.format("%s: %s,", methodParam.getId(), methodParam.getType()));
            }

            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
