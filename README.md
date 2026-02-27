# 📚 Book Management Hibernate – One-to-One Mapping Example

This repository demonstrates how to implement **One-to-One entity mapping** in a **Java project using Hibernate and JPA**.  
The goal of this example is to show how two related entities — like **Book** and **BookDetail** — can be linked with a **one-to-one association** so each book has one detail object associated with it, and vice-versa.:contentReference[oaicite:1]{index=1}

---

## 🧠 What Is One-to-One Mapping?

In a **one-to-one relationship**, one record in a table is associated with only one record in another table — for example, one Book with one Detail entry.  
Hibernate provides the `@OneToOne` annotation to define this relationship using JPA.:contentReference[oaicite:2]{index=2}

This type of mapping is useful when:

- You want to split large entity information across tables
- Each entity has exactly one related entity
- You want to avoid data duplication across tables

---

## 🛠️ Technologies Used

| Category | Tools / Libraries |
|----------|------------------|
| **Language** | Java |
| **ORM** | Hibernate (JPA implementation) |
| **Build Tool** | Maven |
| **Database** | (MySQL / H2 / PostgreSQL – update based on your config) |

---

## 📦 Project Structure

Typical project layout:

```text
src/
├── main/
│   ├── java/
│   │   ├── com/yourpackage/
│   │   │   ├── entity/
│   │   │   │   ├── Book.java
│   │   │   │   └── BookDetail.java
│   │   │   ├── service/ ...
│   │   │   └── App.java
│   ├── resources/
│   │   └── application.properties

Book.java — primary entity (main table)

BookDetail.java — related entity (one-to-one with Book)

Config file defines your database connection

🚀 How It Works

The Book entity contains a @OneToOne reference to BookDetail

The mapping can be unidirectional (one side knows the other) or bidirectional (both know each other) depending on your setup

Using JPA annotations like @OneToOne and @JoinColumn, Hibernate manages the foreign key relationship automatically when you persist objects to the database

💻 Getting Started
📌 Prerequisites

Make sure you have:

JDK 11 or higher

Maven installed

A running database (MySQL, PostgreSQL) OR an embedded database (H2)

🏃 Run Locally

Clone the repository:

git clone https://github.com/Abhijeeth0010/one-to-one-mapping-BookManagemet-Hibernate.git
cd one-to-one-mapping-BookManagemet-Hibernate

Build and run:

mvn clean install
mvn spring-boot:run

Your application will create the related tables and manage book + detail rows automatically if your application.properties is correctly set up.

📊 What You Can Learn From This

How to map one-to-one relationships using JPA/Hibernate

How to use @OneToOne with @JoinColumn

How the relationship affects database schema generation

How to save and fetch linked entities with a simple Java application

🧪 Next Enhancements

Here are some ideas to expand the project:

Add REST endpoints to create and fetch Book + Detail objects

Add bidirectional mapping so both entities know each other

Add tests demonstrating CRUD with one-to-one relationships

Enable Swagger UI or Postman examples for API testing

📄 License

This project is open-source — feel free to use, modify, or share!


---

