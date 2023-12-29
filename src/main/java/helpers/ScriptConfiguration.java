package helpers;

import helpers.utils.OptionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface ScriptConfiguration {
    String name();
    String description();
    String defaultValue();
    AllowedValue[] allowedValues() default {}; // For STRING type
    int[] minMaxIntValues() default {};       // For INTEGER type
    OptionType optionType();

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface List {
        ScriptConfiguration[] value();
    }
}