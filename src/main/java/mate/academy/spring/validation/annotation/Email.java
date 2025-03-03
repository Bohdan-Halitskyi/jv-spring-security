package mate.academy.spring.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import mate.academy.spring.validation.EmailValidator;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String message () default "Provided email must look like \\john.doe@domain.name\\033[0m";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
