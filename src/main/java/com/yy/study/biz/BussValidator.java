package com.yy.study.biz;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by zy48461 on 2017/9/1.
 */
public class BussValidator {

    private Validator validator;

    public BussValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public Map<String, String> valid(Object obj) {
        Map<String, String> message = new HashMap<String, String>();
           Set<ConstraintViolation<Object>> set = validator.validate(obj);
        for (ConstraintViolation<Object> mes : set) {
            message.put(mes.getPropertyPath().toString(), mes.getMessage());
        }
        return message;
    }
}
