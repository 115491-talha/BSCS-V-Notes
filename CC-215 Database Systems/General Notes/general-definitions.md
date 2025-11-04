### **CC-215 — Database Systems (General Definitions with Examples)**

#### **1. Database Concepts**

* **Database:** A structured collection of related data stored electronically.
  *Example:* A student record system storing names, roll numbers, and grades.

* **DBMS (Database Management System):** Software that allows users to create, manage, and access databases.
  *Example:* MySQL, Oracle, or SQL Server.

* **Data:** Raw facts and figures without context.
  *Example:* “Ali”, “92”, and “CS-101”.

* **Information:** Processed data that has meaning.
  *Example:* “Ali scored 92 in CS-101.”

* **Metadata:** Data that describes other data.
  *Example:* Column names, data types, and constraints in a table.

* **File-based System:** A system where data is stored in separate files without a central management.
  *Example:* Multiple Excel files used to store student results.

* **Database Approach:** A unified system to store, manage, and control access to data.
  *Example:* A university database accessed by different departments.

---

#### **2. Database Architecture**

* **Three-Level Architecture:** Divides the database into external, conceptual, and internal levels to provide abstraction.

* **External Schema:** Describes how each user views the data.
  *Example:* A teacher can only see student grades, not financial details.*

* **Conceptual Schema:** Describes the overall logical structure of the data.

* **Internal Schema:** Describes how data is physically stored on the hardware.

* **Data Independence:** Ability to change schema at one level without affecting others.
  *Example:* Changing file storage format without affecting user queries.*

---

#### **3. Relational Data Model**

* **Relation:** A table consisting of rows and columns.
  *Example:* Student(Name, RollNo, GPA)*

* **Tuple:** A single row in a table.
  *Example:* (Ali, 01, 3.7)*

* **Attribute:** A column representing a property of an entity.
  *Example:* Name or GPA.*

* **Schema:** The structure or design of a database.

* **Domain:** The allowed set of values for an attribute.
  *Example:* GPA can range from 0.0 to 4.0.*

* **Primary Key:** A unique identifier for a record.
  *Example:* RollNo in a student table.*

* **Foreign Key:** A key that links two tables.
  *Example:* CourseID in Enrollment table refers to Course table.*

* **Candidate Key:** An attribute that can uniquely identify tuples.

* **Composite Key:** A combination of two or more attributes used as a key.
  *Example:* (StudentID, CourseID).*

* **Entity Integrity:** Ensures each table has a unique primary key.

* **Referential Integrity:** Ensures foreign keys correctly reference existing data.

---

#### **4. Relational Algebra**

* **Selection (σ):** Extracts rows that meet a condition.
  *Example:* Students with GPA > 3.0.*

* **Projection (π):** Extracts specific columns from a table.
  *Example:* Display only names of students.*

* **Cartesian Product (×):** Combines all tuples from two relations.

* **Join:** Combines related tuples from two tables.
  *Example:* Joining Students and Courses by StudentID.*

* **Union (∪):** Combines results of two compatible relations.

* **Set Difference (−):** Finds tuples in one relation but not in another.

---

#### **5. Normalization and Dependencies**

* **Functional Dependency (FD):** One attribute uniquely determines another.
  *Example:* RollNo → Name.*

* **Normalization:** Process of organizing data to reduce redundancy.

* **1NF:** Removes repeating groups in tables.

* **2NF:** Removes partial dependencies.

* **3NF:** Removes transitive dependencies.

* **BCNF:** Ensures every determinant is a candidate key.

* **Decomposition:** Splitting a table into smaller ones without data loss.

---

#### **6. Entity-Relationship Model**

* **Entity:** A real-world object represented in a database.
  *Example:* Student, Course.*

* **Attribute:** Property of an entity.
  *Example:* Student’s name or age.*

* **Relationship:** Association between entities.
  *Example:* Student “enrolls in” Course.*

* **ER Diagram:** Graphical representation of entities and their relationships.

* **Weak Entity:** Depends on another entity for identification.
  *Example:* “Dependent” related to “Employee.”*

---

#### **7. Structured Query Language (SQL)**

* **DDL (Data Definition Language):** Defines database structure.
  *Example:* CREATE TABLE Students(...).*

* **DML (Data Manipulation Language):** Handles data operations.
  *Example:* INSERT, UPDATE, DELETE.*

* **DCL (Data Control Language):** Manages permissions.
  *Example:* GRANT or REVOKE access rights.*

* **Join:** Combines data from multiple tables.
  *Example:* SELECT * FROM Students JOIN Courses ON ID.*

* **Subquery:** Query within another query.

* **Grouping and Aggregation:** Summarizing data using GROUP BY and functions like COUNT or AVG.

---

#### **8. Concurrency Control**

* **Concurrency:** Multiple users accessing the database simultaneously.

* **Transaction:** A sequence of operations performed as a single unit.
  *Example:* Transferring money between two bank accounts.*

* **Locking:** Prevents conflicts between concurrent transactions.

* **Deadlock:** Two transactions waiting indefinitely for each other.

* **Two-Phase Locking (2PL):** Ensures serializability by growing and shrinking lock phases.

---

#### **9. Backup and Recovery**

* **Backup:** Copy of data to restore after a failure.
  *Example:* Cloud backup of customer data.*

* **Recovery:** Restoring data after a system crash or corruption.

* **Checkpoint:** A saved state of the system for recovery use.

---

#### **10. Indexing**

* **Index:** A data structure that speeds up data retrieval.
  *Example:* Index on “RollNo” for faster student search.*

* **Primary Index:** Based on the primary key.

* **Secondary Index:** Based on non-key attributes.

* **B-tree / B+ tree:** Common index structures used in databases.

---

#### **11. NoSQL Systems**

* **NoSQL Database:** Non-relational database for large-scale, unstructured data.
  *Example:* MongoDB or Cassandra.*

* **Document Database:** Stores data as documents (JSON/BSON).

* **Key-Value Store:** Uses unique keys to store values.
  *Example:* Redis.*

* **Column Store:** Stores data column-wise for fast analytics.
  *Example:* Cassandra.*

* **Graph Database:** Stores entities and their relationships as nodes and edges.
  *Example:* Neo4j.*

---
