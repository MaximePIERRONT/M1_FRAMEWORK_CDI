package fr.pantheonsorbonne.ufr27.miage;

import jakarta.inject.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
public @interface H2 {
}