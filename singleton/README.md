# singleton Design Pattern

This module demonstrates the implementation of the singleton design pattern in Java 25 and Spring Boot.

## Intent
(To be detailed based on the pattern)

## Implementation Details
This module contains the codebase for com.mla.designpattern.singleton package.

### Class Diagram

```mermaid
classDiagram
    class DatabaseConnection {
        -static DatabaseConnection instance
        -DatabaseConnection()
        +static getInstance() DatabaseConnection
    }
    
    class SpringSingletonService {
        <<@Service / Singleton Scope>>
        +doSomething()
    }
```
