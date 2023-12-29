package helpers;

public class ScriptMetadata {
    private String name;
    private String description;
    private String version;
    private ScriptCategory category;

    public ScriptMetadata(String name, String description, String version, ScriptCategory category) {
        this.name = name;
        this.description = description;
        this.version = version;
        this.category = category;
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

    public ScriptCategory getCategory() {
        return category;
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

    public void setCategory(ScriptCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ScriptMetadata{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", category=" + category +
                '}';
    }

}
