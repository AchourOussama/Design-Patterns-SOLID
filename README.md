
# SOLID Principles in Java

This repository provides practical implementations of the **SOLID principles** in Java. Each principle is demonstrated through a **poor code** (Noncompliant with SOLID) and a **refactored code** (SOLID-compliant)

![solid](https://github.com/user-attachments/assets/1c881840-16f2-45fc-bd24-5d7718c2af44)

## Table of Contents

1. [Overview](#overview)
2. [SOLID Principles](#solid-principles)
   - [Single Responsibility Principle](/single-responsibility-principle/src/com/directi/training/srp/)
   - [Open/Closed Principle](/openclosed-principle/src/com/directi/training/ocp/)
   - [Liskov Substitution Principle](/liskov-substitution-principle/src/com/directi/training/lsp/)
   - [Interface Segregation Principle](/interface-segregation-principle/src/com/directi/training/isp/)
   - [Dependency Inversion Principle](/dependency-inversion-principle/src/com/directi/training/dip/)

---

## Overview

The **SOLID** principles are five design principles that help developers build well-structured, understandable, and extendable code. This repository includes examples for each principle, demonstrating how to refactor code to follow SOLID practices.

**SOLID Principles:**
- **S**: Single Responsibility Principle
- **O**: Open/Closed Principle
- **L**: Liskov Substitution Principle
- **I**: Interface Segregation Principle
- **D**: Dependency Inversion Principle

## SOLID Principles

### 1. Single Responsibility Principle (SRP)
- **Definition**: A class should have only one reason to change, meaning it should have only one job.

### 2. Open/Closed Principle (OCP)
- **Definition**: Classes should be open for extension but closed for modification.

### 3. Liskov Substitution Principle (LSP)
- **Definition**: Subtypes must be substitutable for their base types.

### 4. Interface Segregation Principle (ISP)
- **Definition**: A class should not be forced to implement interfaces it doesn’t use.

### 5. Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.

## How this is organized .. 

For each design principle, we present an example demonstrating a version of the code that violates the principle, followed by a refactored version that adheres to the principle.

In addition to these examples, an exercise is provided to help the learner practice identifying issues related to the lack of adherence to the principle. A solution is then provided following the exercise.

*Note:* the solution are a personal try for solving the problem . Other solutions could exist ! 