# Adapter Design Pattern - Email Client Example

## Overview

This project demonstrates the **Adapter Design Pattern**, one of the **Structural Design Patterns** from the Gang of Four (GoF).

The Adapter Pattern allows incompatible interfaces to work together by converting the interface of an existing class into another interface that the client expects.

---

## Project Structure

```
structur_patterns.adapter/
│
├── EmailClient.java          (Client)
├── EmailProvider.java        (Target Interface)
├── GmailProvider.java        (Adapter)
└── Gmail/
    └── GmailClient.java      (Adaptee)
```

---

## Components Explanation

### 1. **Target Interface: `EmailProvider`**
```java
package structur_patterns.adapter;

public interface EmailProvider {
    void downloadEmails();
}
```
- The interface that the **client** expects to work with.
- Defines the standard method `downloadEmails()`.

### 2. **Adaptee: `GmailClient`**
```java
package structur_patterns.adapter.Gmail;

public class GmailClient {
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    public void getEmails() {
        System.out.println("Downloading emails from Gmail");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
```
- An existing class from a **third-party library**.
- Has its own interface (`connect`, `getEmails`, `disconnect`) that is **incompatible** with `EmailProvider`.

### 3. **Adapter: `GmailProvider`**
```java
package structur_patterns.adapter;

import structur_patterns.adapter.Gmail.GmailClient;

public class GmailProvider implements EmailProvider {
    private GmailClient gmailClient;

    public GmailProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
```
- **Bridges** the gap between `EmailProvider` and `GmailClient`.
- Implements the `EmailProvider` interface.
- Delegates calls to the `GmailClient` with the correct sequence.

### 4. **Client: `EmailClient`**
```java
package structur_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
    private List<EmailProvider> providers = new ArrayList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
```
- Works only with the `EmailProvider` interface.
- Doesn't know about `GmailClient` or its methods.
- Can easily switch between different providers (Gmail, Outlook, Yahoo, etc.)

---

## Usage Example

```java
package structur_patterns.adapter;

import structur_patterns.adapter.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        // Create the adaptee (third-party library)
        GmailClient gmailClient = new GmailClient();
        
        // Wrap it with the adapter
        EmailProvider gmailProvider = new GmailProvider(gmailClient);
        
        // Use it in the client system
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(gmailProvider);
        emailClient.downloadEmails();
    }
}
```

**Output:**
```
Connecting to Gmail
Downloading emails from Gmail
Disconnecting from Gmail
```

---

## Class Diagram

```
┌─────────────────┐          ┌─────────────────────┐
│   EmailClient   │          │   <<interface>>     │
│                 │──────────│   EmailProvider     │
│ - providers     │          │ + downloadEmails()  │
│ + addProvider() │          └──────────┬──────────┘
│ + downloadEmails│                     ▲
└─────────────────┘                     │
                                        │
                                ┌───────┴──────────┐
                                │   GmailProvider  │
                                │                  │
                                │ - gmailClient    │
                                │ + downloadEmails │
                                └───────┬──────────┘
                                        │
                                        ▼
                                ┌─────────────────┐
                                │   GmailClient   │
                                │  (Adaptee)      │
                                │ + connect()     │
                                │ + getEmails()   │
                                │ + disconnect()  │
                                └─────────────────┘
```

---

## Why Use the Adapter Pattern Here?

| Without Adapter | With Adapter |
|----------------|--------------|
| `EmailClient` must know about `GmailClient` directly | `EmailClient` only knows `EmailProvider` |
| Adding a new provider (e.g., Outlook) requires changing `EmailClient` | Adding a new provider only requires creating a new adapter |
| Violates **Open/Closed Principle** | Follows **Open/Closed Principle** |
| Tightly coupled code | Loosely coupled code |

---

## When to Use This Pattern

✅ **Use the Adapter Pattern when:**
- You need to integrate a third-party library with an incompatible interface.
- You have legacy code that needs to work with a new system.
- You want to create a uniform interface for different providers (email, payment, etc.)
- You want to follow the **Open/Closed Principle** (open for extension, closed for modification).

---

## Advantages

 **Code Reusability** - Reuse existing classes without modification.
 **Loose Coupling** - Client code remains independent of implementation details.
 **Flexibility** - Easy to switch between different providers.
 **Open/Closed Principle** - Add new providers without changing existing code.

---

## Real-World Applications

- **Email Providers**: Gmail, Outlook, Yahoo (as shown in this project)
- **Payment Gateways**: Stripe, PayPal, Paymob
- **Database Drivers**: JDBC, ODBC
- **Legacy System Integration**
- **Cloud Service Wrappers**: AWS, Azure, GCP

---

## Technologies Used

- **Java** (Object-Oriented Programming)
- **Adapter Design Pattern** (Structural Pattern)

---

## Design Pattern Category

**Structural Design Pattern** - Focuses on how classes and objects are composed to form larger structures.

---

## References

- *Design Patterns: Elements of Reusable Object-Oriented Software* — Gang of Four (GoF)
- *Head First Design Patterns*
- [Adapter Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/adapter)

---

## Author

**Yassen Abdelaziz**