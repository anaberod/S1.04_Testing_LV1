# ❗ Array Index Exception Test - Java + JUnit

## 📄 Description - Exercise Statement

This project includes a simple Java class with a method that intentionally throws an `ArrayIndexOutOfBoundsException` when accessing an invalid index in an array.

The objective is to:
- Understand how Java handles array bounds errors.
- Verify that the exception is thrown correctly using a JUnit test.

---

## 💻 Technologies Used

- Java 17
- JUnit 5
- Maven (optional, if using build automation)
- Git & GitHub
- IntelliJ IDEA (or any Java-compatible IDE)

---

## 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 17 or higher
- JUnit 5 library
- Git installed
- IntelliJ IDEA or a similar Java IDE

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

3. **Open the project in IntelliJ IDEA or your IDE of choice.**

4. **If using Maven, build the project**:
   ```bash
   mvn clean install
   ```

---

## ▶️ Execution

### 💡 To run the main logic manually (optional):

Create a simple `Main` class and call the method with an invalid index to see the exception:

```java
public class Main {
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        int[] data = {1, 2, 3};
        System.out.println(example.getElementAt(data, 5)); // Will throw exception
    }
}
```

### ✅ To run the JUnit test:

Run `ArrayTest` from your IDE or use Maven:

```bash
mvn test
```

The test verifies that the exception is properly thrown when accessing an out-of-bounds index.

---

## 🌐 Deployment

This project is purely educational and intended for local testing only. Deployment is not required.

---

## 🤝 Contributions

To contribute to this repository:

1. Fork the repo.
2. Create a new feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add: your change"
   ```
4. Push and create a Pull Request.

---
