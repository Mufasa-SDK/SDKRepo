package helpers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation defines a configuration tab for scripts.
 * It groups multiple {@link ScriptConfiguration} annotations under a single tab.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Applies to classes or interfaces
public @interface ScriptTabConfiguration {
    /**
     * The name of the tab.
     * @return The name of the tab.
     */
    String name();

    /**
     * The configurations within this tab.
     * @return An array of {@link ScriptConfiguration} annotations.
     */
    ScriptConfiguration[] configurations();
}
