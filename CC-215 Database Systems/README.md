### **CC-215 Database Systems — Complete Topic Breakdown**

#### **1. Introduction to Databases**

* **Basic Database Concepts**

  * What is a database
  * Advantages of databases over traditional systems
* **Database Approach vs File-Based System**

  * Drawbacks of file systems (redundancy, inconsistency)
  * Benefits of database approach (centralization, security)

---

#### **2. Database Architecture**

* **Database System Architecture Overview**

  * Components: DBMS, Database, Users, and Applications
* **Three-Level Schema Architecture**

  * **External Level:** User views
  * **Conceptual Level:** Logical schema
  * **Internal Level:** Physical storage structures
* **Data Independence**

  * Logical and Physical data independence

---

#### **3. Relational Data Model**

* **Core Concepts**

  * Attributes, Schemas, Tuples, and Domains
  * Relation Instances and Keys
* **Types of Keys**

  * Candidate key, Primary key, Alternate key, Foreign key, Composite key
* **Integrity Constraints**

  * Entity Integrity
  * Referential Integrity
  * Domain Constraints
  * Key Constraints

---

#### **4. Relational Algebra**

* **Basic Operations**

  * Selection (σ)
  * Projection (π)
  * Cartesian Product (×)
  * Union (∪)
  * Set Difference (−)
* **Join Operations**

  * Theta Join
  * Equi-Join
  * Natural Join
  * Outer Joins (Left, Right, Full)
* **Division and Rename Operations**

---

#### **5. Normalization and Functional Dependencies**

* **Functional Dependencies (FDs)**

  * Definition and examples
  * Closure of attributes
* **Normalization**

  * Purpose of normalization
  * **Normal Forms:**

    * 1NF (Eliminate repeating groups)
    * 2NF (Eliminate partial dependencies)
    * 3NF (Eliminate transitive dependencies)
    * BCNF (Boyce-Codd Normal Form)
    * Higher normal forms (4NF, 5NF — conceptually)
  * **Decomposition:**

    * Lossless and dependency-preserving decomposition

---

#### **6. Entity-Relationship (ER) Model**

* **Entity Sets and Attributes**

  * Strong and Weak entities
  * Simple, Composite, and Multivalued attributes
* **Relationships**

  * One-to-One, One-to-Many, Many-to-Many
  * Relationship degree and participation
* **ER Diagrams**

  * Symbols and conventions
  * Mapping ER diagram to relational schema

---

#### **7. Structured Query Language (SQL)**

* **SQL Basics**

  * Data Definition Language (DDL): CREATE, ALTER, DROP
  * Data Manipulation Language (DML): SELECT, INSERT, UPDATE, DELETE
  * Data Control Language (DCL): GRANT, REVOKE
* **Joins and Sub-Queries**

  * INNER, LEFT, RIGHT, FULL JOINs
  * Nested Queries and Correlated Sub-queries
* **Grouping and Aggregation**

  * GROUP BY and HAVING clauses
  * Aggregate Functions: COUNT, SUM, AVG, MIN, MAX

---

#### **8. Database Concurrency Control**

* **Concept of Concurrency**

  * Multi-user environment issues
* **Problems in Concurrency**

  * Lost update, dirty read, uncommitted dependency, inconsistent retrieval
* **Concurrency Control Techniques**

  * Lock-based protocols (shared/exclusive locks)
  * Timestamp ordering
  * Two-phase locking (2PL)

---

#### **9. Database Backup and Recovery**

* **Types of Failures**

  * Transaction failure, System crash, Disk failure
* **Backup Techniques**

  * Full, Incremental, Differential backups
* **Recovery Techniques**

  * Log-based recovery, Shadow paging

---

#### **10. Indexes**

* **Purpose of Indexing**

  * Speeding up data retrieval
* **Types of Indexes**

  * Primary, Secondary, Clustered, Non-clustered
* **Index Structures**

  * B-tree, B+ tree, Hash-based indexes

---

#### **11. NoSQL Systems**

* **Introduction to NoSQL**

  * Difference between SQL and NoSQL
  * CAP theorem (Consistency, Availability, Partition tolerance)
* **Types of NoSQL Databases**

  * Document-oriented (MongoDB)
  * Key-value (Redis)
  * Column-oriented (Cassandra)
  * Graph-based (Neo4j)

---

✅ **Summary of Major Domains:**

1. Database fundamentals and architecture
2. Relational model and algebra
3. Normalization and ER modeling
4. SQL (queries, joins, aggregation)
5. Concurrency, backup, and recovery
6. Indexing and performance
7. Modern NoSQL systems

---