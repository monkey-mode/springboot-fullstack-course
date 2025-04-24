# Understanding Spring Ecosystem

## 1. Spring Framework (Core)
- Foundation of Spring Ecosystem
- Primary Feature: Dependency Injection
  - @Component, @Autowired
  - Component Scan
- Provides integration with other frameworks:
  - Hibernate/JPA
  - JUnit & Mockito for Unit Testing
- Note: Dependency Injection alone is not sufficient for building complete applications

## 2. Spring MVC (Spring Module)
- Purpose: Simplifies building web applications and REST APIs
- Key improvement over previous solutions (e.g., Struts was complex)
- Key Annotations:
  - @Controller
  - @RestController
  - @RequestMapping("/courses")

## 3. Spring Boot (Spring Project)
- Purpose: Build production-ready applications quickly
- Key Features:
  1. Starter Projects
     - Simplifies building various types of applications
  2. Auto Configuration
     - Eliminates manual configuration for Spring, Spring MVC, and other frameworks

  3. Built-in Non-Functional Requirements (NFRs):
     - Actuator: Advanced application monitoring
     - Embedded Server: No separate application server needed
     - Logging and Error Handling
     - Profiles and ConfigurationProperties
