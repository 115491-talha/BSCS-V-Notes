## 🧠 **HTML Cheatsheet (HTML5)**

---

### ⚙️ **1. Basic Structure (Boilerplate)**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>My Webpage</title>
</head>
<body>
  <h1>Hello, World!</h1>
</body>
</html>
```

---

### 📄 **2. Document Metadata Tags**

| Tag               | Description                       | Example                                    |
| ----------------- | --------------------------------- | ------------------------------------------ |
| `<!DOCTYPE html>` | Defines HTML5 document type       | `<!DOCTYPE html>`                          |
| `<html>`          | Root of the HTML document         | `<html lang="en">`                         |
| `<head>`          | Contains metadata, links, scripts | `<head> ... </head>`                       |
| `<meta>`          | Defines meta-information          | `<meta charset="UTF-8">`                   |
| `<title>`         | Title shown on browser tab        | `<title>My Site</title>`                   |
| `<link>`          | Links external resources          | `<link rel="stylesheet" href="style.css">` |
| `<script>`        | Embeds/external JS code           | `<script src="app.js"></script>`           |

---

### 🧍‍♂️ **3. Basic Text Formatting**

| Tag                | Description                    | Example                     |
| ------------------ | ------------------------------ | --------------------------- |
| `<h1>` → `<h6>`    | Headings (largest to smallest) | `<h2>Subheading</h2>`       |
| `<p>`              | Paragraph                      | `<p>Hello world!</p>`       |
| `<b>` / `<strong>` | Bold text / Important text     | `<strong>Warning!</strong>` |
| `<i>` / `<em>`     | Italic text / Emphasized text  | `<em>Important note</em>`   |
| `<u>`              | Underline text                 | `<u>Underlined</u>`         |
| `<br>`             | Line break                     | `<br>`                      |
| `<hr>`             | Horizontal line                | `<hr>`                      |
| `<small>`          | Smaller text                   | `<small>© 2025</small>`     |
| `<mark>`           | Highlights text                | `<mark>Important</mark>`    |
| `<del>`            | Deleted (strike-through) text  | `<del>Old Price</del>`      |
| `<ins>`            | Inserted text                  | `<ins>New Price</ins>`      |

---

### 🧩 **4. Lists**

| Tag    | Description               | Example                                          |
| ------ | ------------------------- | ------------------------------------------------ |
| `<ul>` | Unordered (bulleted) list | `<ul><li>HTML</li></ul>`                         |
| `<ol>` | Ordered (numbered) list   | `<ol><li>CSS</li></ol>`                          |
| `<li>` | List item                 | `<li>JavaScript</li>`                            |
| `<dl>` | Definition list           | `<dl><dt>HTML</dt><dd>Markup language</dd></dl>` |

---

### 🔗 **5. Links & Navigation**

| Tag               | Description           | Example                                       |
| ----------------- | --------------------- | --------------------------------------------- |
| `<a>`             | Creates a hyperlink   | `<a href="https://google.com">Google</a>`     |
| `target="_blank"` | Opens link in new tab | `<a href="..." target="_blank">Open</a>`      |
| `mailto:`         | Opens email client    | `<a href="mailto:abc@gmail.com">Email Me</a>` |
| `tel:`            | Creates a phone link  | `<a href="tel:+123456">Call</a>`              |

---

### 🖼️ **6. Images & Multimedia**

| Tag        | Description                    | Example                                                                |
| ---------- | ------------------------------ | ---------------------------------------------------------------------- |
| `<img>`    | Displays image                 | `<img src="pic.jpg" alt="Photo">`                                      |
| `<figure>` | Groups media content           | `<figure><img src="pic.jpg"><figcaption>Caption</figcaption></figure>` |
| `<audio>`  | Embeds audio                   | `<audio controls src="sound.mp3"></audio>`                             |
| `<video>`  | Embeds video                   | `<video controls src="movie.mp4"></video>`                             |
| `<source>` | Defines multiple media sources | `<source src="file.mp4" type="video/mp4">`                             |
| `<iframe>` | Embeds another webpage         | `<iframe src="https://example.com"></iframe>`                          |

---

### 🧱 **7. Tables**

| Tag                             | Description        | Example                           |
| ------------------------------- | ------------------ | --------------------------------- |
| `<table>`                       | Defines a table    | `<table>...</table>`              |
| `<tr>`                          | Table row          | `<tr>...</tr>`                    |
| `<th>`                          | Table header cell  | `<th>Name</th>`                   |
| `<td>`                          | Table data cell    | `<td>Talha</td>`                  |
| `<caption>`                     | Table title        | `<caption>Student Data</caption>` |
| `<thead>`, `<tbody>`, `<tfoot>` | Groups table parts | `<thead><tr>...</tr></thead>`     |

---

### 🧍 **8. Forms & Input**

| Tag                       | Description           | Example                                           |
| ------------------------- | --------------------- | ------------------------------------------------- |
| `<form>`                  | Form container        | `<form action="submit.php" method="POST"></form>` |
| `<input>`                 | Input field           | `<input type="text" placeholder="Name">`          |
| `<label>`                 | Describes an input    | `<label for="name">Name:</label>`                 |
| `<textarea>`              | Multi-line text box   | `<textarea rows="4"></textarea>`                  |
| `<select>`                | Drop-down list        | `<select><option>Male</option></select>`          |
| `<option>`                | Option in drop-down   | `<option>Female</option>`                         |
| `<button>`                | Clickable button      | `<button type="submit">Send</button>`             |
| `<fieldset>`              | Groups related inputs | `<fieldset><legend>Login</legend></fieldset>`     |
| `<legend>`                | Title inside fieldset | `<legend>Personal Info</legend>`                  |
| `<input type="radio">`    | Radio button          | `<input type="radio" name="gender">`              |
| `<input type="checkbox">` | Checkbox              | `<input type="checkbox" checked>`                 |

---

### 🧍‍♀️ **9. Semantic HTML5 Tags**

| Tag         | Description                  | Example                                                                |
| ----------- | ---------------------------- | ---------------------------------------------------------------------- |
| `<header>`  | Top section of page          | `<header>Logo + Nav</header>`                                          |
| `<nav>`     | Navigation links             | `<nav><a href="#">Home</a></nav>`                                      |
| `<section>` | Thematic grouping of content | `<section><h2>About</h2></section>`                                    |
| `<article>` | Independent content block    | `<article><h3>Blog Post</h3></article>`                                |
| `<aside>`   | Side content or ads          | `<aside>Related Links</aside>`                                         |
| `<main>`    | Main content of document     | `<main>...</main>`                                                     |
| `<footer>`  | Bottom section               | `<footer>© 2025</footer>`                                              |
| `<figure>`  | Media with caption           | `<figure><img src="pic.jpg"><figcaption>Caption</figcaption></figure>` |

---

### ⚡ **10. Global Attributes (Common to All Tags)**

| Attribute         | Description                  | Example                                               |
| ----------------- | ---------------------------- | ----------------------------------------------------- |
| `id`              | Unique element identifier    | `<p id="intro">Text</p>`                              |
| `class`           | Grouping elements for CSS/JS | `<div class="container">`                             |
| `style`           | Inline CSS styling           | `<p style="color:red;">Error</p>`                     |
| `title`           | Tooltip text                 | `<abbr title="HyperText Markup Language">HTML</abbr>` |
| `hidden`          | Hides element                | `<p hidden>Hidden Text</p>`                           |
| `contenteditable` | Makes text editable          | `<div contenteditable="true">Edit me</div>`           |

---

### 🧠 **11. HTML Entities**

| Entity   | Symbol | Meaning              |
| -------- | ------ | -------------------- |
| `&lt;`   | <      | Less than            |
| `&gt;`   | >      | Greater than         |
| `&amp;`  | &      | Ampersand            |
| `&quot;` | "      | Double quote         |
| `&apos;` | '      | Single quote         |
| `&nbsp;` |        | Non-breaking space   |
| `&copy;` | ©      | Copyright            |
| `&reg;`  | ®      | Registered trademark |

---

### 🚀 **12. Comments and Best Practices**

* **Comment:**

  ```html
  <!-- This is a comment -->
  ```
* **Best Practices:**

  * Always use proper indentation.
  * Use semantic tags for clarity.
  * Always close opened tags.
  * Add `alt` to images for accessibility.
  * Use lowercase tag names in HTML5.

---
