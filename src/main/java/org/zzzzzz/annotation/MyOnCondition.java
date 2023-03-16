package org.zzzzzz.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.io.File;
import java.io.IOException;

public class MyOnCondition implements Condition {

    private static final String CONFIG_FILE_NAME = "classpath:studentInfos.properties";

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ResourceLoader resourceLoader = context.getResourceLoader();
        Resource resource = resourceLoader.getResource(CONFIG_FILE_NAME);
        try {
            File file = resource.getFile();
            if (file.exists()) {
                return true;
            }
        } catch (IOException e) {
            throw new RuntimeException("找不到指定的配置文件！");
        }

        return false;
    }
}
