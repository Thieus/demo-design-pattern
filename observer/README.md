# observer Design Pattern

This module demonstrates the implementation of the observer design pattern in Java 25 and Spring Boot.

## Intent
(To be detailed based on the pattern)

## Implementation Details
This module contains the codebase for com.mla.designpattern.observer package.

### Class Diagram

```mermaid
classDiagram
    class Subject {
        <<interface>>
        +attach(o: Observer)
        +detach(o: Observer)
        +notifyObservers()
    }
    class NewsAgency {
        -String news
        -List~Observer~ channels
        +setNews(news: String)
    }
    class Observer {
        <<interface>>
        +update(message: String)
    }
    class NewsChannel {
        -String name
        +update(message: String)
    }

    Subject <|.. NewsAgency
    Observer <|.. NewsChannel
    Subject o-- Observer : notifies
```
