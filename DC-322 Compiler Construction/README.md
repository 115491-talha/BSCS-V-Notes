### **DC-322 Compiler Construction — Complete Topic Breakdown**

#### **1. Introduction to Compilers**

* **Definition and Purpose of a Compiler**

  * What a compiler does
  * Phases of compilation (overview)
* **Interpreter vs Compiler**

  * Differences and similarities
  * When to use an interpreter vs a compiler
* **Role of Compiler in Programming Language Implementation**

---

#### **2. Compiler Techniques and Methodology**

* **Phases of Compiler Design**

  * Lexical Analysis
  * Syntax Analysis
  * Semantic Analysis
  * Intermediate Code Generation
  * Code Optimization
  * Code Generation
  * Error Handling
* **Compiler Structure**

  * Front-end (analysis)
  * Back-end (synthesis)
* **Compilation Process Example**

  * From Source Code → Target Code

---

#### **3. Organization of Compilers**

* **Major Components**

  * Scanner, Parser, Semantic Analyzer, Code Generator, Optimizer
* **Symbol Table Management**

  * Symbol entries, scope, and lifetime
* **Error Handling & Recovery**

  * Lexical, syntactic, and semantic errors
  * Panic mode, phrase-level, error productions

---

#### **4. Lexical Analysis (Scanner Phase)**

* **Purpose and Function**

  * Converting character stream into tokens
* **Tokens, Patterns, and Lexemes**
* **Regular Expressions and Languages**

  * Definition and use in lexical analysis
* **Finite Automata**

  * DFA (Deterministic Finite Automata)
  * NFA (Non-Deterministic Finite Automata)
  * Conversion of NFA → DFA
* **Lexical Errors**

  * Detection and recovery
* **Lexical Analyzer Generators**

  * e.g., Lex / Flex tools (conceptual understanding)

---

#### **5. Syntax Analysis (Parsing Phase)**

* **Purpose**

  * To analyze token sequence according to grammar
* **Context-Free Grammar (CFG)**

  * Terminals, non-terminals, productions, and start symbol
* **Derivations and Parse Trees**
* **Ambiguity in Grammar**
* **Left Recursion and Left Factoring**
* **Parsing Techniques**

  * **Top-Down Parsing**

    * Recursive descent parser
    * Predictive parser (LL(1))
  * **Bottom-Up Parsing**

    * Shift-reduce parsing
    * Operator precedence parsing
    * LR parsers (SLR, LALR, Canonical LR)
* **Error Recovery in Parsing**

  * Panic-mode, phrase-level recovery

---

#### **6. Semantic Analysis**

* **Purpose**

  * Ensuring program semantics are correct
* **Type Checking**

  * Static vs Dynamic type checking
  * Type compatibility and conversions
* **Attribute Grammar**

  * Synthesized and inherited attributes
* **Scope and Binding**

  * Static and dynamic scoping rules
* **Symbol Table Handling**

  * Structure, operations, and maintenance

---

#### **7. Intermediate Code Generation**

* **Purpose of Intermediate Code**

  * Machine-independent representation
* **Types of Intermediate Code**

  * Three-address code (TAC)
  * Polish notation (prefix/postfix)
  * Syntax trees and DAGs (Directed Acyclic Graphs)
* **Translation Schemes**

  * Translating expressions, control flow, and function calls

---

#### **8. Code Optimization**

* **Objective**

  * Improve performance and reduce resource use
* **Types of Optimization**

  * Machine-independent optimization
  * Machine-dependent optimization
* **Optimization Techniques**

  * Constant folding, dead code elimination, loop optimization, strength reduction
* **Basic Blocks and Flow Graphs**

  * Control flow analysis

---

#### **9. Code Generation**

* **Purpose**

  * Convert intermediate code to target machine code
* **Register Allocation**

  * Register spilling, graph coloring
* **Instruction Selection**

  * Mapping IR to assembly instructions
* **Instruction Scheduling**

  * Reordering for pipeline efficiency

---

#### **10. Error Detection and Recovery**

* **Types of Errors**

  * Lexical, Syntax, Semantic, Logical, Runtime
* **Error Handling in Compiler Phases**

  * Reporting and recovering from errors
* **Error Recovery Techniques**

  * Panic-mode recovery
  * Phrase-level recovery
  * Error productions
  * Global correction

---

✅ **Summary of Major Domains:**

1. Introduction and structure of compilers
2. Lexical and syntax analysis (scanning & parsing)
3. Semantic analysis and type checking
4. Intermediate code generation
5. Code optimization and generation
6. Error detection and recovery

---
