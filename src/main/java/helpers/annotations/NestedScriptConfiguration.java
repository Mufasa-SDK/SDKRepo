package helpers.annotations;

import helpers.utils.OptionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NestedScriptConfiguration {
    String name();
    String description();
    String defaultValue();
    NestedAllowedValue[] allowedValues() default {};
    int[] minMaxIntValues() default {};
    OptionType optionType();
}