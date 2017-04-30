package com.gecko.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A constraint built up from simpler constraints,
 * ie an aggregate constraint. Since all its individual
 * constraints are built in, it does not need a
 * validatedBy class.
 *
 * All sub constraints must have the ANNOTATION_TYPE
 * element type to be used by an aggregate constraint.
 *
 * As best practice, your constraints should also add
 * ANNOTATION_TYPE as a @Target so that it can be used
 * in an aggregate annotation also.
 *
 * Created by hlieu on 04/30/17.
 */
//@NotNull
@Size (min=7)
@Pattern (regexp = "[a-z]+@[a-z]+.[a-z]+")
@Documented
@Target ({FIELD, ANNOTATION_TYPE, METHOD, PARAMETER, CONSTRUCTOR})
@Retention (RUNTIME)
@Constraint (validatedBy = {})
@ReportAsSingleViolation  // causes early termination
public @interface Email {
   String message () default "Email address is not valid";
   Class <?>[] groups () default {};
   Class <? extends Payload>[] payload () default {};
}
