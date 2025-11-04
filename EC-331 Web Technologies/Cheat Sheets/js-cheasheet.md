## ⚡ **JavaScript Cheatsheet (ES6+)**

---

### 🧠 **1. What is JavaScript?**

* **Definition:** JavaScript is a dynamic, high-level programming language used to make web pages interactive.
  *Example:* Changing text, validating forms, or adding animations dynamically.*

---

### 🧩 **2. JavaScript Basics**

| Concept         | Example                                        | Description           |
| --------------- | ---------------------------------------------- | --------------------- |
| **Inline JS**   | `<button onclick="alert('Hi')">Click</button>` | Runs JS inside HTML   |
| **Internal JS** | `<script>console.log('Hello');</script>`       | Inside `<script>` tag |
| **External JS** | `<script src="app.js"></script>`               | Linked `.js` file     |

---

### ✍️ **3. Variables**

```js
var name = "Talha";   // function-scoped
let age = 19;         // block-scoped
const PI = 3.1416;    // constant
```

✅ Use `let` and `const` in modern JS (avoid `var`).

---

### 🔢 **4. Data Types**

| Type      | Example                  |
| --------- | ------------------------ |
| String    | `"Hello"`                |
| Number    | `10`, `3.14`             |
| Boolean   | `true`, `false`          |
| Array     | `[1, 2, 3]`              |
| Object    | `{name:"Talha", age:19}` |
| Null      | `let x = null;`          |
| Undefined | `let y;`                 |
| Symbol    | `Symbol('id')`           |

---

### ⚙️ **5. Operators**

| Type       | Example                       | Meaning           |        |                    |
| ---------- | ----------------------------- | ----------------- | ------ | ------------------ |
| Arithmetic | `+`, `-`, `*`, `/`, `%`, `**` | Basic math        |        |                    |
| Assignment | `=`, `+=`, `-=`, `*=`         | Assign values     |        |                    |
| Comparison | `==`, `===`, `!=`, `<`, `>`   | Compare values    |        |                    |
| Logical    | `&&`, `                       |                   | `, `!` | Combine conditions |
| Ternary    | `cond ? A : B`                | Shorthand if-else |        |                    |

*Example:*

```js
let result = (age >= 18) ? "Adult" : "Minor";
```

---

### 🧭 **6. Conditional Statements**

```js
if (score >= 50) {
  console.log("Pass");
} else if (score >= 40) {
  console.log("Retake");
} else {
  console.log("Fail");
}
```

**Switch Example:**

```js
switch(day){
  case 1: console.log("Mon"); break;
  default: console.log("Other");
}
```

---

### 🔁 **7. Loops**

| Loop           | Example                                      |
| -------------- | -------------------------------------------- |
| **for**        | `for(let i=0;i<5;i++){...}`                  |
| **while**      | `while(i<5){i++;}`                           |
| **do...while** | `do{i++;}while(i<5);`                        |
| **for...of**   | Iterates arrays → `for(let x of arr){}`      |
| **for...in**   | Iterates object keys → `for(let k in obj){}` |

---

### 🧩 **8. Functions**

```js
// Function declaration
function greet(name) {
  return "Hello " + name;
}

// Arrow function
const add = (a, b) => a + b;

// Default parameters
function say(msg="Hi"){ console.log(msg); }
```

✅ Arrow functions are concise and preserve `this`.

---

### 📦 **9. Arrays**

| Operation    | Example                                   |
| ------------ | ----------------------------------------- |
| Create       | `let nums = [1,2,3];`                     |
| Access       | `nums[0];`                                |
| Add/Remove   | `push()`, `pop()`, `shift()`, `unshift()` |
| Slice/Splice | `slice(1,3)`, `splice(2,1)`               |
| Iterate      | `nums.forEach(n=>console.log(n));`        |
| Transform    | `nums.map(x=>x*2);`                       |
| Filter       | `nums.filter(x=>x>5);`                    |
| Reduce       | `nums.reduce((a,b)=>a+b);`                |

---

### 🧱 **10. Objects**

```js
let person = {
  name: "Talha",
  age: 19,
  greet() {
    console.log(`Hi, I'm ${this.name}`);
  }
};

person.greet();
```

* Access: `person.name` or `person["age"]`
* Add new: `person.city = "Karachi"`

---

### 🧠 **11. Strings**

| Method            | Example                        | Output     |
| ----------------- | ------------------------------ | ---------- |
| `length`          | `"Code".length`                | 4          |
| `toUpperCase()`   | `"hi".toUpperCase()`           | "HI"       |
| `toLowerCase()`   | `"HI".toLowerCase()`           | "hi"       |
| `includes()`      | `"hello".includes("he")`       | true       |
| `slice(0,3)`      | `"coding".slice(0,3)`          | "cod"      |
| `replace()`       | `"blue".replace("blue","red")` | "red"      |
| Template literals | `` `Hi ${name}` ``             | "Hi Talha" |

---

### 🔢 **12. Numbers & Math**

```js
let x = Math.round(4.6); // 5
Math.max(10, 20); // 20
Math.random(); // 0-1 random
parseInt("42"); // 42
parseFloat("3.14"); // 3.14
```

---

### 📅 **13. Date**

```js
let now = new Date();
now.getFullYear(); // 2025
now.getMonth(); // 0-11
now.toDateString(); // "Tue Nov 04 2025"
```

---

### 🌐 **14. DOM Manipulation**

| Action          | Example                            |
| --------------- | ---------------------------------- |
| Select Element  | `document.getElementById("id")`    |
| Select by Class | `document.querySelector(".class")` |
| Change Text     | `el.textContent = "Updated";`      |
| Change HTML     | `el.innerHTML = "<b>Bold</b>";`    |
| Change Style    | `el.style.color = "red";`          |
| Create Element  | `document.createElement("p");`     |
| Append Element  | `parent.appendChild(child);`       |

*Example:*

```js
document.getElementById("btn").addEventListener("click", ()=> {
  alert("Clicked!");
});
```

---

### 🖱️ **15. Events**

| Event                | Description  | Example                              |
| -------------------- | ------------ | ------------------------------------ |
| `onclick`            | Click event  | `element.onclick = fn;`              |
| `onchange`           | Input change | `input.onchange = fn;`               |
| `onkeyup`            | Key release  | `input.onkeyup = fn;`                |
| `onmouseover`        | Hover over   | `div.onmouseover = fn;`              |
| `addEventListener()` | Adds event   | `btn.addEventListener("click", fn);` |

---

### ⚡ **16. ES6+ Features**

| Feature               | Example                    | Description           |
| --------------------- | -------------------------- | --------------------- |
| **let / const**       | `let x=1; const y=2;`      | Block scope variables |
| **Arrow Functions**   | `(a,b)=>a+b`               | Shorter syntax        |
| **Template Literals** | `` `Hi ${name}` ``         | String interpolation  |
| **Destructuring**     | `const {name, age} = obj;` | Extract values        |
| **Spread Operator**   | `let arr2 = [...arr1];`    | Copy arrays           |
| **Rest Parameter**    | `function sum(...nums){}`  | Variable args         |
| **Default Params**    | `function greet(n="User")` | Default values        |
| **Modules**           | `export` / `import`        | Code reusability      |
| **Promises**          | `fetch().then().catch()`   | Async handling        |

---

### ⏳ **17. Asynchronous JS**

| Concept           | Example                                      |
| ----------------- | -------------------------------------------- |
| **setTimeout()**  | `setTimeout(()=>console.log("Delay"),1000);` |
| **setInterval()** | `setInterval(()=>console.log("Loop"),2000);` |
| **Callback**      | Function passed as argument                  |
| **Promise**       | Handles async results                        |

```js
fetch("data.json")
  .then(res=>res.json())
  .then(data=>console.log(data))
  .catch(err=>console.error(err));
```

| **Async / Await** |

```js
async function loadData(){
  let res = await fetch("data.json");
  let data = await res.json();
  console.log(data);
}
```

---

### 🧮 **18. JSON**

| Action                  | Example                 |
| ----------------------- | ----------------------- |
| Parse JSON → Object     | `JSON.parse('{"a":1}')` |
| Stringify Object → JSON | `JSON.stringify({a:1})` |

---

### 🧍 **19. Classes (OOP in JS)**

```js
class Student {
  constructor(name, age){
    this.name = name;
    this.age = age;
  }
  greet(){
    console.log(`Hi, I'm ${this.name}`);
  }
}
let s1 = new Student("Talha", 19);
s1.greet();
```

Supports **inheritance:**

```js
class Coder extends Student {
  code() { console.log("Coding..."); }
}
```

---

### 🧰 **20. Error Handling**

```js
try {
  let result = riskyFunction();
} catch (error) {
  console.error("Error:", error);
} finally {
  console.log("Done");
}
```

---

### 💡 **21. Browser Storage**

| Type             | Description                   | Example                                 |
| ---------------- | ----------------------------- | --------------------------------------- |
| `localStorage`   | Stores data permanently       | `localStorage.setItem("name","Talha");` |
| `sessionStorage` | Stores until tab closes       | `sessionStorage.getItem("name");`       |
| `Cookies`        | Small data sent with requests | `document.cookie`                       |

---

### 🧭 **22. Useful Console Commands**

| Command                                | Description                    |
| -------------------------------------- | ------------------------------ |
| `console.log()`                        | Prints message                 |
| `console.error()`                      | Prints error                   |
| `console.table()`                      | Displays array/object as table |
| `console.time()` / `console.timeEnd()` | Measure execution time         |

---

### 🧠 **23. Best Practices**

✅ Use `const` for constants, `let` for variables
✅ Use arrow functions and template literals
✅ Avoid global variables
✅ Keep DOM access minimal
✅ Use strict equality `===`
✅ Comment and format code properly

---

### ⚡ **24. Quick Summary**

1. Variables → `let`, `const`
2. Functions → `() => {}`
3. DOM → `getElementById`, `addEventListener`
4. Async → `Promises`, `async/await`
5. OOP → `class`, `constructor`, `extends`

---
