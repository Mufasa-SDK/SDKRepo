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
     * Specifies if the preSetup should skip setting the zoom level for the script
     *
     * @return True if we should skip, false if not
     */
    boolean skipZoomSetup() default false;

    /**
     * Specifies if the client should skip the pre-setup entirely. This will then require the script to set up everything.
     *
     * @return True if we should skip, false if not
     */
    boolean skipClientSetup() default false;

    /**
     * Indicates the category of the script based on predefined script types.
     *
     * @return The categories of the script from the {@link ScriptCategory} enumeration.
     */
    ScriptCategory[] categories();
}