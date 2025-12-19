
---

## Operating Systems Lab (CC-311L) – Topics Checklist

---

## 1. Linux Environment & Virtualization

* ☐ Concept of Operating Systems (Linux focus)
* ☐ Virtualization basics
* ☐ Hypervisors (Type-1 vs Type-2)
* ☐ Linux distributions overview
* ☐ Installing Linux on VirtualBox
* ☐ Basic Linux terminal usage

---

## 2. Linux File Hierarchy Standard (FHS)

* ☐ Root directory (`/`)
* ☐ `/bin`, `/sbin`
* ☐ `/etc`
* ☐ `/home`
* ☐ `/var`
* ☐ `/usr`
* ☐ `/lib`, `/lib64`
* ☐ `/tmp`
* ☐ `/boot`
* ☐ `/dev`
* ☐ `/proc`

---

## 3. File System Architecture (UNIX)

* ☐ Overview of UNIX file system structure
* ☐ Boot block
* ☐ Superblock
* ☐ Inode block
* ☐ Data blocks
* ☐ Relationship between inode and files

---

## 4. File System Mounting

* ☐ Concept of mounting
* ☐ Mount points
* ☐ `/etc/fstab` configuration file
* ☐ `mount` command
* ☐ `umount` command
* ☐ `lsblk` command
* ☐ `blkid` command

---

## 5. File System Integrity & Maintenance

* ☐ File system consistency
* ☐ `fsck`
* ☐ `e2fsck`
* ☐ `fsck.fat`
* ☐ `fsck.nfs`

---

## 6. File Permissions (Standard)

* ☐ Read, Write, Execute permissions
* ☐ User, Group, Others
* ☐ Permission notation (rwx, octal)
* ☐ `chmod` command
* ☐ `chown` command
* ☐ Default permissions
* ☐ `umask` command

---

## 7. Special File Permissions

* ☐ SUID (Set User ID)
* ☐ SGID (Set Group ID)
* ☐ Sticky Bit
* ☐ Use cases of each
* ☐ Practical examples

---

## 8. Linux File Types & Device Files

* ☐ Regular files
* ☐ Directory files
* ☐ Character device files
* ☐ Block device files
* ☐ FIFO (named pipes)
* ☐ Socket files
* ☐ Symbolic links
* ☐ `/dev` directory contents

---

## 9. Terminal Devices & Attributes

* ☐ Disk files vs terminal files
* ☐ Terminal device drivers
* ☐ Viewing terminal attributes
* ☐ `stty` command
* ☐ Modifying terminal behavior

---

## 10. Hard Links & Soft Links

* ☐ Concept of links
* ☐ Hard links
* ☐ Soft (symbolic) links
* ☐ Differences between hard and soft links
* ☐ `ln` command
* ☐ Practical link creation

---

## 11. Managing Services with systemd

* ☐ Linux system daemons
* ☐ systemd overview
* ☐ Unit files concept
* ☐ Service unit files
* ☐ Target unit files
* ☐ `systemctl` commands
* ☐ Enabling/disabling services
* ☐ Writing a basic custom service
* ☐ Running and testing own service

---

## 12. Linux Booting Process

* ☐ BIOS / UEFI initialization
* ☐ Master Boot Record (MBR)
* ☐ Boot loader (GRUB)
* ☐ Kernel initialization
* ☐ init / systemd process
* ☐ Understanding boot sequence flow

---

## 13. Linux System Programming Basics

* ☐ Linux system call interface
* ☐ GNU `gcc` compiler usage
* ☐ Compilation process
* ☐ Structure of program file on disk
* ☐ ELF file format
* ☐ `objdump` command
* ☐ `readelf` command

---

## 14. Process Creation & Termination

* ☐ Process concept
* ☐ `getpid()`
* ☐ `getppid()`
* ☐ `fork()`
* ☐ `exit()`
* ☐ `wait()`
* ☐ `execl()`
* ☐ Parent-child relationship

---

## 15. File Management in Linux

* ☐ File descriptors
* ☐ Per-Process File Descriptor Table (PPFDT)
* ☐ Input redirection
* ☐ Output redirection
* ☐ Error redirection
* ☐ Standard input/output/error

---

## 16. Inter-Process Communication (IPC)

* ☐ IPC concepts
* ☐ Linux IPC tools
* ☐ Pipes
* ☐ FIFO (named pipes)
* ☐ Sockets (basic concept)
* ☐ Using pipes in terminal
* ☐ Using FIFO in terminal

---

## 17. Signals

* ☐ Signal concept
* ☐ Signal delivery
* ☐ Signal handlers
* ☐ Synchronous signals
* ☐ Asynchronous signals
* ☐ Standard signals
* ☐ Real-time signals
* ☐ `kill` command
* ☐ Signal handling in programs

### Important Signals

* ☐ SIGHUP
* ☐ SIGINT
* ☐ SIGKILL
* ☐ SIGPIPE
* ☐ SIGALARM
* ☐ SIGTERM
* ☐ SIGQUIT
* ☐ SIGILL
* ☐ SIGFPE
* ☐ SIGSEGV
* ☐ SIGSTOP
* ☐ SIGTSTP
* ☐ SIGCHLD
* ☐ SIGCONT

---

## 18. Threads & Scheduling

* ☐ Thread concept
* ☐ POSIX threads (pthreads)
* ☐ `pthread_create()`
* ☐ `pthread_join()`
* ☐ `pthread_exit()`

---

## 19. Thread Synchronization

* ☐ Race conditions
* ☐ Mutex concept
* ☐ `pthread_mutex_t`
* ☐ `pthread_mutex_lock()`
* ☐ `pthread_mutex_unlock()`

---

## 20. CPU Scheduling Tools

* ☐ Scheduling policies
* ☐ Nice value
* ☐ Static priority
* ☐ CPU affinity
* ☐ `schedtool` command

---

## 21. File System Creation Tools

* ☐ `mkfs`
* ☐ `mke2fs`
* ☐ `mkntfs`
* ☐ `mkfs.fat`
* ☐ `mkfs.minix`
* ☐ Creating file systems on partitions

---
