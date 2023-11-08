package Com.examen.fs.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy=ArtWorkValidation.class)
public @interface ArtWorkValidatior {
	String mensaje() default "la descripcion de la obra de arte debe contener al menos 5 palabras";
    Class<?>[] groups() default {};
    Class <? extends Payload>[] paylaod() default{};
}
