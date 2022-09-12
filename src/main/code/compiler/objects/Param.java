package compiler.objects;

public class Param {
    private String id;
    private String type;

    private String visibility;

    public Param(String id, String visibility, String type) {
        this.id = id;
        this.type = type;
        this.visibility = visibility;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
