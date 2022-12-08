# Getting Started

### Reference Documentation, GitHub

* [Spring Boot - Starters](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.build-systems.starters)
* [Creating Your Own Starter](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.developing-auto-configuration.custom-starter)
* [Spring Boot Autoconfigure source code](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure)
* [Spring Boot Starters source code](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-starters)
* [Building a Starter for Event Messaging](https://reflectoring.io/spring-boot-starter/)

# HLD
### Concept
#### What is Starter (Auto-configuration)
```
A typical Spring Boot starter contains code to auto-configure and customize the infrastructure of a given technology
```

### Maven structure:
```
poi-spring-boot-starter-parent
+ - poi-common
+ - poi-autoconfigure 
+ - poi-spring-boot-starter
```
