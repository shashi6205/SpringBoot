#SpringBoot Notes
- SpringBoot makes it easy to use Spring or Spring MVC by use of auto-configurations and starter projects.
- SpringBoot looks at
    - a) Frameworks available in the classpath
    - b) Existing configurations for the application. Based on these, Spring boot provides the basic configuration needed to configure the application with these frameworks.
    - `@SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration`

    ##1. Dependency Injection
    - Dependency Injection is the ability of an object to supply dependencies of another object. It is a fundamental aspect of the Spring framework, through which the Spring container "injects" objects into other objects or "dependencies".
    - This allows for loose coupling of components and moves the responsibility of managing components onto the container.
    

    ##References
    - https://docs.spring.io/spring-framework/docs/current/reference/html/core.html
    - https://www.baeldung.com/spring-dependency-injection
    