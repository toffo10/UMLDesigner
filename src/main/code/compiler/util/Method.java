package compiler.util;

import java.util.ArrayList;
import java.util.List;

public class Method {
    private String visiblity;
    private String id;
    private String type;
    private List<MethodParam> mp;

    public Method(String visiblity, String id, String type) {
        this.id = id;
        this.visiblity = visiblity;
        this.type = type;
        mp = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisiblity() {
        return visiblity;
    }

    public void setVisiblity(String visiblity) {
        this.visiblity = visiblity;
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
}
