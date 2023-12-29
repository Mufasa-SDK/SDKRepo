package helpers;

import helpers.ScriptCategory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // Can only be applied to classes
@Retention(RetentionPolicy.RUNTIME)  // Can be accessed at runtime
public @interface ScriptManifest {
    String name();
    String description();
    String version();
    ScriptCategory category();
}

