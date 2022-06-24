package org.springframework.context.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Value("${pageRowCnt}")
    private String pageRowCnt;

    @Override
    public void addArgumentResolvers(
            List<HandlerMethodArgumentResolver> argumentResolvers) {
        PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
        // １ページの表示件数の設定
        resolver.setMaxPageSize(Integer.parseInt(pageRowCnt));
        argumentResolvers.add(resolver);
    }
}
