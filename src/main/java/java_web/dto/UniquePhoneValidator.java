package java_web.dto;

import java_web.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniquePhoneValidator implements ConstraintValidator<UniquePhone, String>{
    @Autowired
    private CvService cvService;

    @Override
    public void initialize(UniquePhone constraintAnnotation){
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext){
        if(s == null || s.isEmpty()){
            return true;
        }
        return !cvService.uniquePhone(s);
    }
}
