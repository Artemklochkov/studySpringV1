package org.example.aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.aspects.model.Comment;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    //@Around("execution(* org.example.aspects.service.*.*(..))")
    @Around("@annotation(org.example.aspects.anotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint){
        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] args = joinPoint.getArgs();

            logger.info("Method " + methodName+ " with arguments " + Arrays.asList(args)+ " will execute");
            Comment comment = new Comment();
            comment.setText("new text");
            Object[] newArgs = {comment};
            Object returnByMethod = joinPoint.proceed(newArgs);
            logger.info("method executed and returned "+ returnByMethod);
            return  "FALSE";

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
