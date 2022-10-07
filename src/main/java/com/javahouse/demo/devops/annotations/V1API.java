package com.javahouse.demo.devops.annotations;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@RequestMapping("/rest/api/v1")
public @interface V1API
{
}
