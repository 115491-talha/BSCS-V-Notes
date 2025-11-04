## **DC-322 — Compiler Construction (General Definitions with Examples)**

### **1. Introduction**

* **Compiler:** A program that translates source code into machine code.
  *Example:* C++ compiler converts `.cpp` files to `.exe`.*

* **Interpreter:** Executes code line-by-line without generating machine code.
  *Example:* Python interpreter runs `.py` scripts directly.*

* **Assembler:** Converts assembly language to machine code.

* **Cross Compiler:** Compiles code for a different target platform.
  *Example:* Compiling Windows code on Linux.*

* **Compilation Process:** Sequence of steps converting high-level code into executable form.

---

### **2. Phases of Compiler Design**

* **Lexical Analysis:** Converts character stream into tokens.
  *Example:* Recognizing keywords like `int` or `for`.*

* **Syntax Analysis (Parsing):** Checks code structure according to grammar rules.
  *Example:* Detecting missing brackets in an expression.*

* **Semantic Analysis:** Ensures the meaning of statements is valid.
  *Example:* Preventing assignment of a string to an integer.*

* **Intermediate Code Generation:** Produces machine-independent code.

* **Code Optimization:** Improves intermediate code for efficiency.
  *Example:* Removing unnecessary calculations.*

* **Code Generation:** Converts optimized code into target machine instructions.

* **Error Handling:** Detects and recovers from errors during compilation.

---

### **3. Compiler Techniques and Methodology**

* **Front-End:** Handles lexical, syntax, and semantic analysis.

* **Back-End:** Handles optimization and code generation.

* **Pass:** A single traversal of the compiler over the source code.
  *Example:* Two-pass compiler first analyzes, then generates code.*

* **Single-Pass Compiler:** Completes compilation in one go.
  *Example:* Used in small embedded systems.*

---

### **4. Organization of Compilers**

* **Symbol Table:** Data structure storing information about identifiers (variables, functions).
  *Example:* Stores variable name, type, and scope.*

* **Error Detector:** Reports errors in syntax, semantics, or type.

* **Intermediate Representation (IR):** Abstract code used between front-end and back-end.

* **Loader and Linker:** Combine object files and prepare program for execution.

---

### **5. Lexical Analysis**

* **Token:** Smallest unit of meaning (keyword, identifier, literal, etc.).
  *Example:* In `int x = 5;`, `int`, `x`, `=`, `5` are tokens.*

* **Lexeme:** Actual character sequence forming a token.

* **Pattern:** Description of a set of lexemes.

* **Lexical Analyzer (Scanner):** Recognizes tokens and ignores white spaces/comments.

* **Regular Expression:** Defines patterns for tokens.
  *Example:* `[A-Za-z][A-Za-z0-9_]*` for variable names.*

* **Finite Automata:** Mathematical model used to recognize tokens.
  *Example:* DFA used to detect numbers or identifiers.*

* **Lexical Error:** Error in token formation.
  *Example:* Invalid variable name `3num`.*

---

### **6. Syntax Analysis (Parsing)**

* **Parser:** Analyzes token sequence to build parse trees.

* **Grammar:** Set of production rules defining valid syntax.
  *Example:* `<expr> → <expr> + <term> | <term>`.*

* **Context-Free Grammar (CFG):** Grammar where each production has one non-terminal on the left-hand side.

* **Parse Tree:** Hierarchical structure showing how input conforms to grammar.

* **Ambiguity:** When a grammar produces more than one parse tree for the same string.

* **Top-Down Parsing:** Starts from the root and expands non-terminals.
  *Example:* Recursive Descent Parser.*

* **Bottom-Up Parsing:** Starts from input and reduces to start symbol.
  *Example:* Shift-Reduce Parser.*

* **LL(1) Parser:** Predictive parser using one lookahead symbol.

* **LR Parser:** Bottom-up parser using left-to-right scanning.

* **Error Recovery:** Correcting syntax errors during parsing (panic mode, phrase-level).

---

### **7. Semantic Analysis**

* **Semantic Analyzer:** Ensures correctness of meaning (type, scope, function usage).

* **Type Checking:** Ensures compatible types in operations.
  *Example:* Disallow adding an integer to a string.*

* **Attribute Grammar:** Associates information (attributes) with grammar symbols.

* **Scope:** Region where a variable or identifier is valid.

* **Binding:** Association between variable names and values or types.

---

### **8. Intermediate Code Generation**

* **Intermediate Code:** Machine-independent representation of the program.
  *Example:* Three-address code `t1 = a + b`.*

* **Three-Address Code (TAC):** Each instruction has at most three operands.

* **Syntax Tree:** Hierarchical representation of program structure.

* **Directed Acyclic Graph (DAG):** Represents expressions to eliminate redundancy.

* **Translation Scheme:** Rules for converting source code constructs into intermediate form.

---

### **9. Code Optimization**

* **Optimization:** Process of improving code performance or reducing resource usage.

* **Machine-Independent Optimization:** Optimizations not dependent on hardware.
  *Example:* Removing unused variables.*

* **Machine-Dependent Optimization:** Hardware-specific improvements.
  *Example:* Using CPU registers efficiently.*

* **Loop Optimization:** Improves performance of loops (unrolling, invariant code motion).

* **Constant Folding:** Replacing constant expressions with their results.
  *Example:* `3+5` replaced by `8`.*

* **Dead Code Elimination:** Removing statements that don’t affect output.

* **Basic Block:** A sequence of statements with single entry and exit points.

---

### **10. Code Generation**

* **Code Generator:** Converts intermediate code into target machine code.

* **Instruction Selection:** Choosing suitable machine instructions.

* **Register Allocation:** Assigning variables to CPU registers efficiently.

* **Instruction Scheduling:** Reordering instructions to improve pipeline performance.

* **Target Code:** Final machine or assembly code produced by compiler.

---

### **11. Error Detection and Recovery**

* **Lexical Error:** Invalid token formation.
* **Syntax Error:** Structural or grammatical mistake.
* **Semantic Error:** Logical or meaning-related mistake.
* **Runtime Error:** Error during program execution (e.g., division by zero).
* **Error Recovery:** Strategy to handle and continue after an error.

---
