package pl.net.bluesoft.rnd.processtool.ui.widgets.annotations;

import java.lang.annotation.*;

/**
 * @author tlipski@bluesoft.net.pl
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface AutoWiredProperty {
	public static final String DEFAULT = "!";
    String name() default DEFAULT;
}
