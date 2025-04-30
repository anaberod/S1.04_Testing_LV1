# 📚 Library Book Manager - Java Collection Project

## 📄 Description - Exercise Statement

This project consists of creating a Java application that manages a collection of books in a library. It includes the following classes:

- `Book`: Represents a single book.
- `Library`: Manages the internal book collection.
- `LibraryManager`: Handles interaction logic.
- `Main`: Entry point to demonstrate features.

The application allows:

- Adding books to the collection.
- Retrieving the full list of books.
- Getting a specific book title by its position.
- Inserting a book at a specific position.
- Removing a book by its title.

A JUnit test class named `LibraryManagerTest` verifies the correct behavior of all operations.

---

## 💻 Technologies Used

- Java 17
- JUnit 5
- Maven (or a Java-compatible build tool)
- Git & GitHub

---

## 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 17 or higher
- Maven (recommended)
- IDE such as IntelliJ IDEA, Eclipse, or VS Code
- Git installed

---

## 🛠️ Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/anaberod/S1.04_Testing_LV1.git
   ```

2. **Navigate to the project folder**:
   ```bash
   cd S1.04_Testing_LV1
   ```

3. **Open the project in your IDE**.

4. **Build the project using Maven**:
   ```bash
   mvn clean install
   ```

---

## ▶️ Execution

### 🚀 Run the main application

Run the `Main` class located in `src/main/java`:

```bash
# From your IDE: Right-click Main.java > Run
```

### ✅ Run the tests

Run `LibraryManagerTest` using Maven or your IDE:

```bash
mvn test
```

---

## 🌐 Deployment

This project is intended for local learning and testing. Deployment is not required.

To create a deployable JAR:

```bash
mvn package
```

Then run:

```bash
java -jar target/S1.04_Testing_LV1.jar
```

---

## 🤝 Contributions

To contribute:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add: your message"
   ```
4. Push and open a Pull Request.

---

## 🧪 Test Cases Overview (JUnit)

The unit tests in `LibraryManagerTest` verify the following behaviors:

- The book list is not null upon instantiation.
- The list size is correct after adding multiple books.
- A specific book exists at the expected position.
- No duplicate titles exist in the list.
- A book title can be retrieved by a given position.
- Adding a book updates the list correctly.
- Removing a book decreases the list size.
- The list remains alphabetically ordered after additions or deletions.

---

## 📁 Project Structure

```text
S1.04_Testing_LV1/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Book.java
│   │       ├── Library.java
│   │       ├── LibraryManager.java
│   │       └── Main.java
│   └── test/
│       └── java/
│           └── LibraryManagerTest.java
│
├── pom.xml
└── README.md
```
