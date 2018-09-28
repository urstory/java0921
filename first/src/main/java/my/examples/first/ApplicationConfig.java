package my.examples.first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 해당 애노테이션이 붙어있으면 Java Config파일이다.
@ComponentScan // @Controller, @Serivce, @Repository, @Component 라고 붙은 클래스를 찾아서 Bean으로 등록한다.
@Import({DBConfig.class})
public class ApplicationConfig {

}
