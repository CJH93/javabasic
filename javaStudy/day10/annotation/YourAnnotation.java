package javaStudy.day10.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

@Target({ FIELD, METHOD })
public @interface YourAnnotation {

}
