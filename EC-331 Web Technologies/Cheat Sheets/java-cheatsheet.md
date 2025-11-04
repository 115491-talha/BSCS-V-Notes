## 🟩 **JAVA CHEATSHEET (EC-331L)**

### 🧠 **Basics**

* **JVM (Java Virtual Machine)** – Runs compiled bytecode.
* **JRE (Java Runtime Environment)** – Contains JVM + libraries.
* **JDK (Java Development Kit)** – Includes JRE + compiler (`javac`).

**Example:**

```bash
javac MyClass.java   # compile
java MyClass         # run
```

---

### 📦 **Syntax**

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, Java!");
  }
}
```

---

### 🔤 **Data Types**

| Type    | Example | Size    | Default  |
| ------- | ------- | ------- | -------- |
| byte    | 127     | 1 byte  | 0        |
| short   | 32000   | 2 bytes | 0        |
| int     | 10      | 4 bytes | 0        |
| long    | 100000L | 8 bytes | 0L       |
| float   | 10.5f   | 4 bytes | 0.0f     |
| double  | 20.99   | 8 bytes | 0.0d     |
| char    | 'A'     | 2 bytes | '\u0000' |
| boolean | true    | 1 bit   | false    |

---

### 🧩 **Operators**

`+ - * / % ++ --`
`< <= > >= == != && || !`
`=` (assignment), `+=`, `-=`, `*=`, `/=`

---

### 🔁 **Control Structures**

#### If-Else

```java
if (x > 0)
    System.out.println("Positive");
else
    System.out.println("Negative");
```

#### Switch

```java
switch(day){
  case 1:
    System.out.println("Mon");
    break;
  
  default:
    System.out.println("Invalid");
}
```

#### Loops

```java
for(int i=0;i<5;i++){}

while(i<5){}

do{}while(i<5);
```

---

### 🧱 **Methods**

```java
int add(int a, int b){ return a+b; }
```

* **Method Overloading:** Same name, different parameters.
* **Method Overriding:** Redefine inherited method.

---

### 🧭 **Classes & Objects**

```java
class Car {
  // Attribute
  String color;

  // Constructor
  Car(String c)
  {
    color=c; 
  }
  
  // Class Method
  void show()
  { 
    System.out.println(color); 
  }
}

public class Main{
  public static void main(String[] args){
    Car c = new Car("Red"); // Object Creation
    c.show();   // Calling method
  }
}
```

---

### ⚙️ **OOP Concepts**

* **Encapsulation:** Hide data using private variables & getters/setters.
* **Inheritance:** `class Dog extends Animal`
* **Polymorphism:** Many forms (overloading/overriding)
* **Abstraction:** Hide implementation using `abstract` or `interface`

---

### 🧱 **Interfaces**

```java
// Interface
interface Animal
{ 
  void sound(); 
}

// Class 1
class Dog implements Animal {
  public void sound()
  { 
    System.out.println("Bark");
  }
}

// Class 2
class Cat implements Animal {
  public void sound()
  { 
    System.out.println("Meow");
  }
}
```

---

### ⚡ **Exception Handling**

```java
try {   // Run the code-block till error
  int x = 5/0;
} catch(Exception e) {  // Catch an error
  System.out.println(e);
} finally { // In-case of no error occurred
  System.out.println("Done");
}
```

---

### 📂 **File Handling**

```java
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    // Create Object
    FileWriter f = new FileWriter("data.txt");
    
    // Write to the file
    f.write("Hello");
    
    // Close the file
    f.close();
  }
}
```

---

### 💬 **GUI & Event Handling (Swing/AWT)**

```java
import javax.swing.*;

public class GuiDemo {
  public static void main(String[] args){
    // Frame
    JFrame f = new JFrame("Demo");
    
    // Button
    JButton b = new JButton("Click");
    
    // Adding an event listener to the button
    b.addActionListener(e -> System.out.println("Clicked!"));
    
    // Insert button into the frame
    f.add(b);
    
    // Set size of the frame
    f.setSize(200,200);

    // Enable the frame's visiblity
    f.setVisible(true);
  }
}
```

---

### 🌐 **Database Connectivity (JDBC)**

```java
import java.sql.*;

class DB {
  public static void main(String[] args) throws Exception {
    // Adding a connection string
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost/test", "root", "password");
    
    // To pass queries
    Statement st = con.createStatement();
    
    // Passing a query
    st.executeUpdate("INSERT INTO users VALUES(1,'Talha')");
    
    // Close the connection
    con.close();
  }
}
```

---

### 🧰 **Servlets (Server-side Java)**

**Servlet Lifecycle:**
`init()` → `service()` → `destroy()`

```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  // GET endpoint
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
  
  // Sending a message in response
  throws IOException {
    res.getWriter().println("Hello from Servlet!");
  }
}
```

---

### 🧱 **MVC Pattern**

* **Model:** Business logic & DB (Java classes, JDBC)
* **View:** JSP/HTML/CSS
* **Controller:** Servlet handling requests

---

### 🫘 **JavaBeans**

Reusable components with:

```java
// Property
private String name;

// Setter
public void setName(String n)
{ 
    name = n; 
}

// Getter
public String getName()
{ 
    return name; 
}
```

---

### 💻 **Real-Life Example**

| Concept       | Example                            |
| ------------- | ---------------------------------- |
| Class         | `Car`, `Employee` objects          |
| Interface     | Payment gateways (PayPal, Stripe)  |
| Exception     | Divide-by-zero in calculator       |
| File Handling | Saving logs in a text file         |
| JDBC          | Connecting to MySQL for login data |
| Servlet       | Backend of a web form submission   |

---
