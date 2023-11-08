package Com.examen.fs.validator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ArtWorkValidation implements  ConstraintValidator<ArtWorkValidatior, String> {

    @Override
    public void initialize(ArtWorkValidatior constraintAnnotation) {
    }


    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {
        if (valor == null || valor.trim().isEmpty()) {

            return false;

            }

            String[] palabras = valor.trim().split("\s+");

            return palabras.length >= 5;
    }
}
