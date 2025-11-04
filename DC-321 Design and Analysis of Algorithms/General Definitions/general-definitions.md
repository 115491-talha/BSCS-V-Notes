## **DC-321 — Design & Analysis of Algorithms (General Definitions with Examples)**

### **1. Introduction to Algorithms**

* **Algorithm:** A finite sequence of steps to solve a specific problem.
  *Example:* Steps to find the maximum number in a list.*

* **Program:** An implementation of one or more algorithms in a programming language.

* **Role of Algorithms:** Provide efficient solutions and optimize computing performance.
  *Example:* Sorting millions of records quickly.*

* **Input & Output:** Data given to an algorithm and the result it produces.

---

### **2. Algorithm Analysis**

* **Time Complexity:** Amount of time an algorithm takes to run as input size grows.
  *Example:* Linear search takes O(n) time.*

* **Space Complexity:** Amount of memory required by an algorithm.

* **Asymptotic Analysis:** Study of algorithm efficiency for large inputs.

* **Asymptotic Notations:** Mathematical symbols to represent algorithm performance.

* **Big O (O):** Upper bound — worst-case time complexity.
  *Example:* Bubble Sort → O(n²).*

* **Big Omega (Ω):** Lower bound — best-case performance.
  *Example:* Insertion Sort → Ω(n).*

* **Big Theta (Θ):** Tight bound — when upper and lower bounds are equal.
  *Example:* Merge Sort → Θ(n log n).*

* **Little o & Little ω:** Represent non-tight upper and lower bounds.

* **Best, Average, Worst Case:** Describe performance variations depending on input.
  *Example:* Searching for an item at start vs end of a list.*

---

### **3. Recursion and Recurrence Relations**

* **Recursion:** Function calling itself to solve smaller subproblems.
  *Example:* Factorial: n! = n × (n−1)!*

* **Base Case:** Condition that stops recursion.

* **Recurrence Relation:** Equation defining running time recursively.
  *Example:* T(n) = 2T(n/2) + n (Merge Sort).*

* **Master Theorem:** Formula to determine time complexity of divide-and-conquer algorithms.

---

### **4. Sorting Algorithms**

* **Sorting:** Arranging data in ascending or descending order.
  *Example:* Sorting names alphabetically.*

* **Stable Sort:** Maintains the order of equal elements.
  *Example:* Merge Sort is stable.*

* **Unstable Sort:** May change order of equal elements.
  *Example:* Quick Sort is unstable.*

* **Bubble Sort:** Repeatedly swaps adjacent elements if they’re in wrong order.
  *Example:* O(n²) — simple but slow.*

* **Selection Sort:** Selects the smallest element and places it in order.

* **Insertion Sort:** Inserts elements into their correct position in a sorted list.

* **Merge Sort:** Divides array into halves, sorts them, and merges results.

* **Quick Sort:** Divides data using a pivot and sorts partitions recursively.

* **Heap Sort:** Uses heap data structure to extract elements in sorted order.

* **Loop Invariant:** Condition that remains true during every iteration of a loop.

---

### **5. Algorithm Design Techniques**

#### **A. Brute Force**

* **Definition:** Tries all possible solutions to find the correct one.
  *Example:* Checking every password combination.*

* **Example Algorithms:** Linear Search, Selection Sort.

---

#### **B. Divide and Conquer**

* **Definition:** Breaks a problem into smaller subproblems, solves, and combines results.
  *Example:* Merge Sort and Quick Sort.*

* **Steps:** Divide → Conquer → Combine.

---

#### **C. Greedy Approach**

* **Definition:** Builds solution step-by-step choosing the best option at each step.
  *Example:* Fractional Knapsack Problem.*

* **Property:** Local optimum leads to global optimum.

* **Example Algorithms:**

  * Prim’s Algorithm (Minimum Spanning Tree)
  * Kruskal’s Algorithm
  * Huffman Coding

---

#### **D. Dynamic Programming (DP)**

* **Definition:** Solves complex problems by breaking them into overlapping subproblems and storing results.
  *Example:* Fibonacci using memoization.*

* **Properties:**

  * **Optimal Substructure** — Solution built from smaller optimal solutions.
  * **Overlapping Subproblems** — Same subproblems solved multiple times.

* **Example Algorithms:**

  * 0/1 Knapsack Problem
  * Matrix Chain Multiplication
  * Longest Common Subsequence

---

### **6. Data Structures for Algorithms**

* **Search Tree:** Tree data structure for efficient searching and sorting.
  *Example:* Binary Search Tree (BST).*

* **AVL Tree:** Self-balancing binary search tree.

* **Heap:** Binary tree-based structure for priority operations.
  *Example:* Used in Heap Sort.*

* **Hashing:** Converts keys into array indexes using a hash function.
  *Example:* Using ID numbers as hash keys.*

* **Collision:** When two keys map to same location.

* **Collision Resolution:** Techniques like chaining or open addressing to handle collisions.

---

### **7. Graph Algorithms**

* **Graph:** A set of vertices (nodes) and edges (connections).
  *Example:* Social media users connected as friends.*

* **Adjacency Matrix:** 2D array representing graph connections.

* **Adjacency List:** Stores vertices and their neighbors as lists.

* **BFS (Breadth-First Search):** Explores neighbors level by level.
  *Example:* Finding shortest path in an unweighted graph.*

* **DFS (Depth-First Search):** Explores as far as possible along each branch before backtracking.

* **Shortest Path Algorithm:** Finds minimum distance between two nodes.
  *Example:* Dijkstra’s Algorithm.*

* **Bellman-Ford Algorithm:** Finds shortest paths with possible negative weights.

* **Minimum Spanning Tree (MST):** Connects all vertices with minimum total edge weight.
  *Example:* Designing road networks using Prim’s or Kruskal’s algorithm.*

* **Topological Sorting:** Linear ordering of vertices in a Directed Acyclic Graph (DAG).
  *Example:* Task scheduling with dependencies.*

---

### **8. String Matching Algorithms**

* **String Matching:** Searching a pattern within a text.
  *Example:* Finding a word in a paragraph.*

* **Naive Algorithm:** Checks pattern at every position.

* **KMP Algorithm:** Uses preprocessing to skip unnecessary comparisons.

* **Rabin-Karp Algorithm:** Uses hashing for pattern matching.

* **Finite Automata Matching:** Uses state transitions for searching patterns efficiently.

---

### **9. Complexity Classes**

* **Computational Complexity:** Study of resources (time, memory) needed to solve problems.

* **Class P:** Problems solvable in polynomial time.
  *Example:* Sorting algorithms.*

* **Class NP:** Problems verifiable (but not necessarily solvable) in polynomial time.
  *Example:* Sudoku puzzle validation.*

* **NP-Complete:** Hardest problems in NP; if one is solved efficiently, all can be.
  *Example:* Traveling Salesman Problem.*

* **NP-Hard:** Problems as hard as NP-Complete but not necessarily in NP.

* **Tractable Problem:** Can be solved in reasonable time.

* **Intractable Problem:** Cannot be solved efficiently for large inputs.

---
