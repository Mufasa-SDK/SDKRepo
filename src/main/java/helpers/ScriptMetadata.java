package helpers;

import java.util.List;

public class ScriptMetadata {
    private String name;
    private String description;
    private String version;
    private String guideLink;
    private List<ScriptCategory> categories;

    public ScriptMetadata(String name, String description, String version, String guideLink, List<ScriptCategory> categories) {
        this.name = name;
        this.description = description;
        this.version = version;
        this.guideLink = guideLink;
        this.categories = categories;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getGuideLink() {return guideLink;}

    public List<ScriptCategory> getCategories() {
        return categories;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCategories(List<ScriptCategory> categories) {
        this.categories = categories;
    }

    public void setGuideLink(String guideLink) {this.guideLink = guideLink;}

    @Override
    public String toString() {
        return "ScriptMetadata{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", guideLink='" + guideLink + '\'' +
                ", category=" + categories +
                '}';
    }
}
