# builder Design Pattern

This module demonstrates the implementation of the builder design pattern in Java 25 and Spring Boot.

## Intent
(To be detailed based on the pattern)

## Implementation Details
This module contains the codebase for com.mla.designpattern.builder package.

### Class Diagram

```mermaid
classDiagram
    class User {
        -String firstName
        -String lastName
        -int age
        +builder() UserBuilder$
    }
    class UserBuilder {
        -String firstName
        -String lastName
        -int age
        +firstName(firstName: String) UserBuilder
        +lastName(lastName: String) UserBuilder
        +age(age: int) UserBuilder
        +build() User
    }
    User ..> UserBuilder : uses
    UserBuilder ..> User : creates
```
