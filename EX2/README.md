# 🧪 S1.04 Testing - DNI Letter Calculation (JUnit)

## 📄 Description - Exercise Statement

This exercise involves creating a Java program that calculates the letter of a Spanish DNI (National Identification Number) based on a well-known algorithm. The program includes:

- A `DNICalculation` class that calculates the letter from a given DNI number.
- A `DNItest` test class that uses parameterized tests to validate the logic against predefined cases.

The goal is to ensure correct test coverage and practice unit testing in Java.

---

## 💻 Technologies Used

- Java 17
- JUnit 5
- Maven (or any standard Java build system)
- Git & GitHub

---

## 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 17 or higher
- Maven (recommended) or any Java-compatible build tool
- IDE like IntelliJ IDEA, Eclipse, or VS Code
- Git installed

---

## 🛠️ Installation

Follow these steps to set up the project locally:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/anaberod/S1.04_Testing_LV1.git
   ```
2. **Navigate to the project folder**:
   ```bash
   cd S1.04_Testing_LV1
   ```
3. **Open the project in your IDE** (e.g., IntelliJ or Eclipse)
4. **Build the project** (if using Maven):
   ```bash
   mvn clean install
   ```

---

## ▶️ Execution

### 💡 Running the application:

You can run the `Main.java` file located in `src/main/java`:

```bash
# From your IDE, right-click Main.java and select "Run"
```

### ✅ Running the tests:

Execute the parameterized tests from `DniTest.java`:

```bash
# If using Maven
mvn test
```

---

## 🌐 Deployment

This is a local-only educational project and is **not intended for deployment** in a production environment. However, if needed, you could:

- Package it using Maven:
  ```bash
  mvn package
  ```
- Distribute the JAR or run it with:
  ```bash
  java -jar target/S1.04_Testing_LV1.jar
  ```

---

## 🤝 Contributions

Contributions are welcome! If you'd like to contribute:

1. Fork the repository
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add: your feature"
   ```
4. Push and create a Pull Request

---

### 📁 Folder Structure

```text
S1.04_Testing_LV1/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── DNICalculation.java
│   │       └── Main.java
│   └── test/
│       └── java/
│           └── DniTest.java
│
├── pom.xml
└── README.md
```