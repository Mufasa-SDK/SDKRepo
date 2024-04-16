package helpers.annotations;

import helpers.ScriptCategory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for script metadata, defining essential information about a script.
 * This annotation can be used on classes to specify script details.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ScriptManifest {

    /**
     * Specifies the name of the script.
     *
     * @return The script name.
     */
    String name();

    /**
     * Describes the purpose or functionality of the script.
     *
     * @return A description of the script.
     */
    String description();

    /**
     * Specifies the version of the script.
     *
     * @return The script version.
     */
    String version();

    /**
     * Specifies the link to the script guide on wiki for the script.
     *
     * @return The script guide.
     */
    String guideLink();

    /**
     * Indicates the category of the script based on predefined script types.
     *
     * @return The categories of the script from the {@link ScriptCategory} enumeration.
     */
    ScriptCategory[] categories();
}