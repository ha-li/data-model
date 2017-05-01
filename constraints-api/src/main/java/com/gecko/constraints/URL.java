package com.gecko.constraints;

import com.gecko.constraints.validator.UrlValidationStr;
import com.gecko.constraints.validator.UrlValidationUrl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by hlieu on 04/30/17.
 */
@Documented
@Target ({FIELD, ANNOTATION_TYPE, PARAMETER, METHOD, CONSTRUCTOR})
@Retention (RUNTIME)
@Constraint (validatedBy={UrlValidationStr.class, UrlValidationUrl.class})
public @interface URL {
   String message () default "Invalid Url";
   Class <?>[] groups () default {};
   Class <? extends Payload>[] payload () default {};

   // define 3 additional annotation attributes to set
   String protocol () default "";
   String host () default "";
   int port () default -1;
}
