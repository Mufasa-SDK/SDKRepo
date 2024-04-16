package helpers.annotations;

/**
 * This annotation defines an allowed value for a script configuration option.
 * It can specify an icon and a name for each allowed value.
 */
public @interface AllowedValue {

    /**
     * The icon for the option. Default is "0".
     * This can be used to specify an itemID to use as icon in the configuration
     *
     * @return the icon identifier or path for this option value.
     */
    String optionIcon() default "0";

    /**
     * The name of the option. This should be a human-readable string
     * describing the option value.
     *
     * @return the name of the option.
     */
    String optionName();
}