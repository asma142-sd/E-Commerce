# ORDIFY - E-Commerce Desktop Application

ORDIFY is a complete, feature-rich Java Swing desktop application designed to streamline the online retail shopping experience. Built using robust Object-Oriented Programming (OOP) paradigms, the system provides separate tailored views and workflows for customers looking to buy products and managers aiming to streamline inventory operations.

##  Features

### Customer Features
* **Authentication:** Secure Login and Sign Up systems with input validation.
* **Dynamic Dashboard:** Categorized product listings (Home Appliances, Beauty Products, Food Items, Books) using an elegant `CardLayout` architecture.
* **Shopping Cart System:** Add/remove items dynamically, live-update quantity pickers (`JSpinner`), and see real-time subtotal math.
* **Sleek Checkout Workflow:** Interactive shipping entries, toggleable billing preferences, multiple payment channel integrations, and automated order placement.

##  Key Object-Oriented Design Principles (OOP)
* **Encapsulation:** Product parameters, prices, and customer data are fully wrapped inside distinct data objects using precise getter/setter validation structures.
* **Inheritance & Polymorphism:** Component frames share base definitions for user profiles and specific checkout steps to avoid code duplication.
* **Abstraction:** Database connection operations and data fetches are separated safely from front-end layout elements.

##  Technology Stack

* **Language:** Java (JDK 17+)
* **GUI Framework:** Java Swing & AWT (Designed via Apache NetBeans GUI Builder)
* **Database:** Microsoft Access (`.accdb`)
* **Database Connectivity:** JDBC API with **UCanAccess Driver** (Pure Java JDBC driver implementation for Access files)
* **Development IDE:** Apache NetBeans
