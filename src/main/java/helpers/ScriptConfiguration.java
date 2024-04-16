package helpers;

import helpers.utils.OptionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to define a configuration for a script.
 * It allows specifying various parameters such as name, description,
 * default values, and the type of the option.
 */
public @interface ScriptConfiguration {
    /**
     * The name of the configuration option.
     * @return The configuration option name.
     */
    String name();

    /**
     * A brief description of the configuration option.
     * @return The configuration option description.
     */
    String description();

    /**
     * The default value for the configuration option.
     * @return The default value as a String.
     */
    String defaultValue();

    /**
     * Defines the allowed values for a STRING type option.
     * @return An array of allowed values.
     */
    AllowedValue[] allowedValues() default {};

    /**
     * Defines the minimum and maximum values for an INTEGER type option.
     * @return An array of two integers, where the first is the minimum and the second is the maximum.
     */
    int[] minMaxIntValues() default {};

    /**
     * The type of the configuration option.
     * @return The type of the option as defined in {@link OptionType}.
     */
    OptionType optionType();

    /**
     * Optional attribute that specifies another configuration option
     * that this one depends on. It could be used to enable/disable or show/hide
     * this configuration option based on the value or presence of another.
     * @return The name of the dependent configuration option.
     */
    String dependsOn() default "";

    /**
     * Container annotation for repeating {@link ScriptConfiguration}.
     * This allows multiple {@link ScriptConfiguration} annotations on the same element.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface List {
        /**
         * An array of {@link ScriptConfiguration} annotations.
         * @return The array of configurations.
         */
        ScriptConfiguration[] value();
    }
}