package helpers.utils;

/**
 * Defines the type of options available in script configuration.
 * This enum is used to specify the data type of a configuration parameter.
 * They return their respective values as a String.
 */
public enum OptionType {

        /**
         * Represents a configuration option of type String.
         */
        STRING,

        /**
         * Represents a configuration option of type Integer.
         */
        INTEGER,

        /**
         * Represents a configuration option of type Boolean.
         */
        BOOLEAN,
        /**
         * Represents a configuration option of type Slider.
         */
        PERCENTAGE,

        /**
         * Represents a configuration option related to banking functionality.
         */
        BANKTABS
}
