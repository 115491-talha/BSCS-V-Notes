## 🎨 **CSS Cheatsheet (CSS3)**

---

### 🧩 **1. What is CSS?**

* **Definition:** CSS (Cascading Style Sheets) is used to style and layout web pages — colors, fonts, spacing, and responsiveness.
  *Example:* Styling a button with rounded corners and hover effects.*

---

### 🧱 **2. Basic Syntax**

```css
selector {
  property: value;
}
```

*Example:*

```css
h1 {
  color: blue;
  text-align: center;
}
```

---

### 🎯 **3. Ways to Add CSS**

| Method       | Description                  | Example                                    |
| ------------ | ---------------------------- | ------------------------------------------ |
| **Inline**   | Inside HTML tag              | `<p style="color:red;">Text</p>`           |
| **Internal** | Inside `<style>` in `<head>` | `<style>p{color:red;}</style>`             |
| **External** | Linked `.css` file           | `<link rel="stylesheet" href="style.css">` |

---

### 🧠 **4. Selectors**

| Selector               | Description                  | Example                            |
| ---------------------- | ---------------------------- | ---------------------------------- |
| `*`                    | Universal selector           | `* {margin:0;}`                    |
| `element`              | Selects all elements of type | `p {color:gray;}`                  |
| `.class`               | Selects elements with class  | `.box {border:1px solid;}`         |
| `#id`                  | Selects element with id      | `#header {background:blue;}`       |
| `element1, element2`   | Selects multiple elements    | `h1, h2 {color:red;}`              |
| `element element`      | Descendant selector          | `div p {color:green;}`             |
| `element > element`    | Direct child selector        | `ul > li {list-style:none;}`       |
| `element + element`    | Next sibling selector        | `h1 + p {color:blue;}`             |
| `[attribute]`          | Attribute selector           | `input[type="text"] {width:100%;}` |
| `:hover`               | Pseudo-class for hover state | `button:hover {background:red;}`   |
| `:focus`               | Focused input element        | `input:focus {outline:none;}`      |
| `::before` / `::after` | Insert content before/after  | `p::after {content:"✓";}`          |

---

### ✍️ **5. Text & Font Properties**

| Property          | Description           | Example                           |
| ----------------- | --------------------- | --------------------------------- |
| `color`           | Text color            | `color: red;`                     |
| `font-family`     | Font type             | `font-family: Arial, sans-serif;` |
| `font-size`       | Font size             | `font-size: 18px;`                |
| `font-weight`     | Boldness              | `font-weight: bold;`              |
| `text-align`      | Text alignment        | `text-align: center;`             |
| `text-decoration` | Underline/none        | `text-decoration: none;`          |
| `text-transform`  | Uppercase/lowercase   | `text-transform: uppercase;`      |
| `line-height`     | Spacing between lines | `line-height: 1.5;`               |
| `letter-spacing`  | Space between letters | `letter-spacing: 2px;`            |
| `word-spacing`    | Space between words   | `word-spacing: 10px;`             |

---

### 🧍 **6. Color & Background**

| Property              | Description               | Example                            |
| --------------------- | ------------------------- | ---------------------------------- |
| `background-color`    | Sets background color     | `background-color: lightblue;`     |
| `background-image`    | Adds image as background  | `background-image: url('bg.jpg');` |
| `background-repeat`   | Controls image repetition | `background-repeat: no-repeat;`    |
| `background-size`     | Adjusts image size        | `background-size: cover;`          |
| `background-position` | Image placement           | `background-position: center;`     |
| `opacity`             | Transparency (0–1)        | `opacity: 0.8;`                    |

---

### 🧱 **7. Box Model**

Each element has:
🟩 *content* → 🟨 *padding* → 🟥 *border* → 🩶 *margin*

| Property          | Description                      | Example                    |
| ----------------- | -------------------------------- | -------------------------- |
| `width`, `height` | Content size                     | `width: 200px;`            |
| `margin`          | Outer spacing                    | `margin: 10px;`            |
| `padding`         | Inner spacing                    | `padding: 5px;`            |
| `border`          | Border style                     | `border: 2px solid black;` |
| `box-sizing`      | Includes padding/border in width | `box-sizing: border-box;`  |

---

### 🧩 **8. Display & Positioning**

| Property                         | Description               | Example                                                    |
| -------------------------------- | ------------------------- | ---------------------------------------------------------- |
| `display`                        | Defines element type      | `display: block;` / `inline;` / `flex;`                    |
| `position`                       | Sets positioning method   | `position: relative;` / `absolute;` / `fixed;` / `sticky;` |
| `top`, `bottom`, `left`, `right` | Offset positions          | `top: 10px; left: 20px;`                                   |
| `z-index`                        | Stack order               | `z-index: 5;`                                              |
| `overflow`                       | Scroll or hide overflow   | `overflow: hidden;`                                        |
| `float`                          | Aligns element left/right | `float: left;`                                             |
| `clear`                          | Prevents floating overlap | `clear: both;`                                             |

---

### 📐 **9. Flexbox (Modern Layout)**

| Property          | Description               | Example                           |
| ----------------- | ------------------------- | --------------------------------- |
| `display: flex`   | Enables flex layout       | `display: flex;`                  |
| `flex-direction`  | Row or column layout      | `flex-direction: row;`            |
| `justify-content` | Aligns items horizontally | `justify-content: space-between;` |
| `align-items`     | Aligns items vertically   | `align-items: center;`            |
| `flex-wrap`       | Allows wrapping           | `flex-wrap: wrap;`                |
| `gap`             | Space between items       | `gap: 10px;`                      |

---

### 🧱 **10. Grid Layout**

| Property                | Description              | Example                           |
| ----------------------- | ------------------------ | --------------------------------- |
| `display: grid`         | Enables grid layout      | `display: grid;`                  |
| `grid-template-columns` | Define columns           | `grid-template-columns: 1fr 2fr;` |
| `grid-template-rows`    | Define rows              | `grid-template-rows: 100px auto;` |
| `grid-gap`              | Space between grid cells | `grid-gap: 20px;`                 |
| `justify-items`         | Horizontal alignment     | `justify-items: center;`          |
| `align-items`           | Vertical alignment       | `align-items: center;`            |

---

### 💡 **11. Borders, Outlines & Shadows**

| Property        | Description          | Example                           |
| --------------- | -------------------- | --------------------------------- |
| `border-radius` | Rounded corners      | `border-radius: 10px;`            |
| `border-style`  | Type of border       | `border-style: dashed;`           |
| `outline`       | External border line | `outline: 2px solid red;`         |
| `box-shadow`    | Adds shadow          | `box-shadow: 2px 2px 5px gray;`   |
| `text-shadow`   | Shadow for text      | `text-shadow: 1px 1px 2px black;` |

---

### 🧍‍♀️ **12. Lists, Tables & Cursors**

| Property           | Description        | Example                              |
| ------------------ | ------------------ | ------------------------------------ |
| `list-style-type`  | Bullets style      | `list-style-type: square;`           |
| `list-style-image` | Custom list icon   | `list-style-image: url('icon.png');` |
| `border-collapse`  | Table border merge | `border-collapse: collapse;`         |
| `cursor`           | Mouse cursor type  | `cursor: pointer;`                   |

---

### 📱 **13. Responsive Design**

| Property / Rule | Description                 | Example                                            |
| --------------- | --------------------------- | -------------------------------------------------- |
| `@media`        | Adds responsive breakpoints | `@media (max-width: 600px){body{font-size:14px;}}` |
| `max-width`     | Limits element width        | `max-width: 100%;`                                 |
| `min-width`     | Sets minimum width          | `min-width: 300px;`                                |
| `vw`, `vh`      | Viewport units              | `width: 50vw; height: 50vh;`                       |
| `rem`, `em`     | Relative font units         | `font-size: 1.2rem;`                               |

---

### ✨ **14. Transitions & Animations**

| Property     | Description                  | Example                                         |
| ------------ | ---------------------------- | ----------------------------------------------- |
| `transition` | Smooth change between states | `transition: all 0.3s ease;`                    |
| `@keyframes` | Defines animation sequence   | `@keyframes move{0%{left:0;}100%{left:100px;}}` |
| `animation`  | Applies animation            | `animation: move 2s infinite;`                  |
| `transform`  | Rotate, scale, move elements | `transform: rotate(45deg);`                     |
| `filter`     | Apply visual effects         | `filter: blur(2px);`                            |

---

### 💾 **15. Units**

| Type         | Example                            | Description                 |
| ------------ | ---------------------------------- | --------------------------- |
| **Absolute** | `px`, `cm`, `mm`, `pt`             | Fixed size                  |
| **Relative** | `%`, `em`, `rem`, `vh`, `vw`       | Adjusts to screen or parent |
| **Color**    | `rgb()`, `rgba()`, `#hex`, `hsl()` | Various color formats       |

---

### 💡 **16. Common Shortcuts**

| Shorthand                                          | Expands To                      | Example             |
| -------------------------------------------------- | ------------------------------- | ------------------- |
| `margin: 10px 5px;`                                | top/bottom 10px, left/right 5px | `margin: 10px 5px;` |
| `padding: 10px;`                                   | All sides equal                 | `padding: 10px;`    |
| `border: 2px solid red;`                           | width + style + color           |                     |
| `background: #000 url('bg.jpg') no-repeat center;` | Combines multiple properties    |                     |
| `font: bold 16px Arial;`                           | Combines weight, size, font     |                     |

---

### 🧠 **17. Best Practices**

* Always use **external CSS** for maintainability.
* Use **semantic HTML** and **class selectors** instead of inline styles.
* Use **relative units (em, rem, %) for responsive layouts**.
* Organize CSS with comments and sections.
* Minimize code using **CSS variables and shorthand**.

---
