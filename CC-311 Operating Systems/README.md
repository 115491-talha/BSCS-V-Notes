### **CC-311 Operating Systems — Complete Topic Breakdown**

#### **1. Introduction to Operating Systems**

* **Definition and Purpose**

  * What is an operating system (OS)
  * Role of OS as a resource manager and intermediary
* **Functions of an OS**

  * Process management
  * Memory management
  * File system management
  * I/O and device management
  * Protection and security
* **Types of Operating Systems**

  * Batch, Time-sharing, Real-time, Distributed, Multiprogramming, and Multiprocessing systems
* **System Components**

  * Kernel, shell, system programs, and utilities
* **System Calls**

  * Concept and role
  * Example system calls for process, file, and device management

---

#### **2. Process Management**

* **Process Concept**

  * Definition of process and program
  * Process states (New, Ready, Running, Waiting, Terminated)
  * Process Control Block (PCB)
* **Process Scheduling**

  * Scheduling queues and operations
  * CPU–I/O burst cycle
  * Context switching
* **Scheduling Criteria**

  * CPU utilization, throughput, turnaround time, waiting time, response time
* **Process Scheduling Algorithms**

  * **Preemptive and Non-preemptive scheduling**

    * FCFS (First Come First Serve)
    * SJF (Shortest Job First)
    * SRTF (Shortest Remaining Time First)
    * Priority Scheduling
    * Round Robin (concept only; usually avoided for assignments)
    * Multilevel Queue Scheduling
  * **Gantt Chart Construction** for visualizing execution order

---

#### **3. Threads and Multithreading**

* **Multithreaded Programming**

  * Concept of thread vs process
  * Advantages of multithreading
* **Multithreading Models**

  * Many-to-One
  * One-to-One
  * Many-to-Many
* **Threading Issues**

  * Thread creation, termination, synchronization, and communication
  * User-level and kernel-level threads
* **Thread Scheduling**

  * Cooperative vs preemptive scheduling in multithreaded systems
* **Multiple-Processor Scheduling**

  * Symmetric and asymmetric multiprocessing

---

#### **4. Process Synchronization**

* **Synchronization Concept**

  * Need for synchronization and critical section problem
* **Critical Section Problem**

  * Requirements: Mutual exclusion, progress, bounded waiting
* **Synchronization Hardware**

  * Atomic instructions: Test-and-set, compare-and-swap
* **Software Solutions**

  * Peterson’s solution
* **Synchronization Tools**

  * Semaphores (binary, counting)
  * Mutex locks
  * Monitors and condition variables
* **Classical Synchronization Problems**

  * Bounded-buffer (Producer–Consumer) problem
  * Readers–Writers problem
  * Dining Philosophers problem

---

#### **5. Deadlocks**

* **Deadlock Concept**

  * Definition and conditions (Mutual exclusion, Hold and wait, No preemption, Circular wait)
* **Deadlock Handling Methods**

  * **Prevention** (eliminating one or more conditions)
  * **Avoidance** (Banker’s algorithm)
  * **Detection and Recovery**

    * Deadlock detection algorithms
    * Recovery by process termination or resource preemption

---

#### **6. Memory Management**

* **Basics of Memory Management**

  * Address binding and relocation
  * Logical vs physical address space
  * Contiguous vs non-contiguous allocation
* **Memory Allocation Techniques**

  * Fixed and variable partitioning
  * Swapping
  * Contiguous memory allocation
  * Fragmentation (internal and external)
* **Segmentation**

  * Segment tables, advantages, and disadvantages
* **Paging**

  * Page tables, page size, and page replacement
* **Virtual Memory**

  * Concept and need for virtual memory
  * **Demand Paging**

    * Page fault handling
    * Page replacement algorithms (FIFO, LRU, Optimal)
  * **Thrashing**

    * Causes and prevention
  * **Memory-Mapped Files**

---

#### **7. File System Management**

* **File Concept**

  * Attributes, operations, and file types
* **Directory and Disk Structure**

  * Single-level, two-level, tree-structured, and acyclic graph directories
  * Disk structure and partitions
* **Directory Implementation**

  * Linear list and hash table methods
* **File System Implementation**

  * File allocation methods (Contiguous, Linked, Indexed)
  * Free-space management (bit vector, linked list, grouping)
* **Disk Scheduling**

  * FCFS, SSTF, SCAN, C-SCAN, LOOK, C-LOOK
* **Swap Space Management**

  * Allocation, swapping, and optimization

---

#### **8. System Protection and Security**

* **Protection Mechanisms**

  * Access matrix model
  * Domain of protection
  * Access control lists and capability lists
* **Security Goals**

  * Confidentiality, integrity, availability
* **Security Threats**

  * Malware, phishing, privilege escalation
* **Security Techniques**

  * Encryption, authentication, and auditing

---

#### **9. Virtual Machines**

* **Concept of Virtualization**

  * Definition and importance
* **Types of Virtual Machines**

  * System virtual machines (e.g., VMware, Hyper-V)
  * Process virtual machines (e.g., JVM)
* **Benefits and Challenges**

  * Isolation, resource sharing, performance overhead

---

#### **10. Operating System Security (Advanced)**

* **Operating System Security Measures**

  * User authentication and access control
  * File permissions
  * Intrusion detection and system monitoring
* **Secure OS Design**

  * Trusted OS and security kernel concepts
  * Secure boot and system integrity verification

---

✅ **Summary of Major Domains:**

1. OS fundamentals and system calls
2. Process, threads, and scheduling
3. Synchronization and deadlocks
4. Memory and storage management
5. File systems and disk scheduling
6. Protection, security, and virtual machines

---
