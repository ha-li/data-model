package com.gecko.constraints;

import com.gecko.constraints.validator.ChronologicalOrderValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by hlieu on 04/29/17.
 */
@Target (value={TYPE})
@Retention (RUNTIME)
@Documented
@Constraint (validatedBy = ChronologicalOrderValidator.class)
public @interface ChronologicalOrder {
   String message () default "The dates are not in chronological order.";
   Class <?> [] groups () default {};
   Class <? extends Payload>[] payload () default {};
}
