
---

## 1. Java Development Environment Setup

### 1.1 Java Development Kit (JDK)

#### Definition

The **Java Development Kit (JDK)** is a software development package required to **develop, compile, and run Java programs**. It includes tools necessary for Java development.

#### Key Components of JDK

| Component | Purpose                             |
| --------- | ----------------------------------- |
| `javac`   | Java compiler (source → bytecode)   |
| `java`    | Java Virtual Machine (JVM) launcher |
| `javadoc` | Generates API documentation         |
| `jar`     | Packages Java classes into archives |
| JVM       | Executes Java bytecode              |

#### JDK vs JRE vs JVM

* **JVM**: Executes bytecode
* **JRE**: JVM + libraries (run only)
* **JDK**: JRE + development tools (develop + run)

#### Example

You **cannot compile** Java code without JDK, but you **can run** compiled `.class` files with just JRE.

---

### 1.2 Integrated Development Environment (IDE)

#### Definition

An **IDE** is a software application that provides tools to **write, compile, debug, and run** programs in one place.

#### Common Java IDEs

* IntelliJ IDEA
* Eclipse
* NetBeans
* VS Code (with Java extensions)

#### Why IDEs are Used

* Syntax highlighting
* Auto-completion
* Built-in compiler
* Debugging tools
* Project management

#### Real-World Analogy

IDE = Workshop
JDK tools = Individual machines inside the workshop

---

## 2. Basic Java Program Structure

### Minimal Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Explanation (Line-by-Line)

| Line                      | Description                 |
| ------------------------- | --------------------------- |
| `public class Main`       | Defines a class             |
| `public static void main` | Entry point of Java program |
| `String[] args`           | Command-line arguments      |
| `System.out.println()`    | Output to console           |

#### Important Rules

* Class name **must match file name**
* Execution always starts from `main()`
* Java is **case-sensitive**

---

### Program Execution Flow

1. Write `.java` file
2. Compile → `.class`
3. JVM loads bytecode
4. Executes `main()`

---

## 3. Variables and Constants

### 3.1 Variables

#### Definition

A **variable** is a named memory location used to store data that can change during program execution.

#### Syntax

```java
dataType variableName = value;
```

#### Example

```java
int age = 20;
double marks = 89.5;
char grade = 'A';
```

#### Naming Rules

* Must start with letter, `_`, or `$`
* Cannot start with number
* No spaces
* Cannot be Java keywords

---

### 3.2 Constants

#### Definition

A **constant** is a variable whose value **cannot be changed** after initialization.

#### Syntax

```java
final dataType CONSTANT_NAME = value;
```

#### Example

```java
final double PI = 3.14159;
final int MAX_STUDENTS = 50;
```

#### Real-World Example

* PI value never changes
* Maximum seats in a class

---

## 4. Data Types in Java

### 4.1 Primitive Data Types

| Type      | Size    | Example                  |
| --------- | ------- | ------------------------ |
| `byte`    | 1 byte  | `byte b = 10;`           |
| `short`   | 2 bytes | `short s = 200;`         |
| `int`     | 4 bytes | `int x = 1000;`          |
| `long`    | 8 bytes | `long l = 100000L;`      |
| `float`   | 4 bytes | `float f = 3.14f;`       |
| `double`  | 8 bytes | `double d = 99.99;`      |
| `char`    | 2 bytes | `char c = 'A';`          |
| `boolean` | 1 bit   | `boolean isPass = true;` |

---

### 4.2 Non-Primitive Data Types

* `String`
* Arrays
* Classes
* Interfaces

#### Example

```java
String name = "Talha";
int[] numbers = {1, 2, 3};
```

---

## 5. Type Casting in Java

### 5.1 Implicit Type Casting (Widening)

Automatically done when **smaller type → larger type**

```java
int x = 10;
double y = x;
```

✔ Safe
✔ No data loss

---

### 5.2 Explicit Type Casting (Narrowing)

Manual conversion when **larger → smaller**

```java
double d = 9.8;
int x = (int) d;
```

⚠ Possible data loss

---

### Example Scenario

```java
int totalMarks = 95;
int subjects = 2;
double average = (double) totalMarks / subjects;
```

---

## 6. Input / Output in Java

### 6.1 Output using `System.out`

```java
System.out.print("Hello ");
System.out.println("World");
```

* `print()` → same line
* `println()` → new line

---

### 6.2 Input using `Scanner`

#### Steps

1. Import Scanner
2. Create object
3. Read input

```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Age is: " + age);
    }
}
```

---

### Common Scanner Methods

| Method          | Reads       |
| --------------- | ----------- |
| `nextInt()`     | Integer     |
| `nextDouble()`  | Double      |
| `next()`        | Single word |
| `nextLine()`    | Full line   |
| `nextBoolean()` | Boolean     |

---

## Practice Questions | [Solution](https://github.com/115491-talha/BSCS-V-Notes/tree/main/EC-331%20Web%20Technologies/Topics/Java/1.%20Fundamentals/Code/Solution/src)

### Q1

Write a Java program that:

* Takes name and age as input
* Displays them in one sentence

---

### Q2

Write a program to:

* Declare a constant `PI`
* Calculate area of a circle using user input

---

### Q3

Demonstrate **explicit type casting** by converting:

* `double → int`
* Print both values

---

### Q4

Write a Java program that:

* Reads three integers
* Prints their average (ensure correct type casting)

---

### Q5 (Concept + Code)

Explain why this program prints `0` and fix it:

```java
int a = 5;
int b = 2;
double result = a / b;
```

---
