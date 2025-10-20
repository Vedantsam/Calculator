# Java Console Calculator

A simple yet robust console-based calculator application built with Java, featuring basic arithmetic operations and user-friendly interaction.

## 📋 Project Overview

This project is a command-line calculator that performs basic arithmetic operations (addition, subtraction, multiplication, and division). It demonstrates fundamental Java programming concepts including methods, loops, conditional statements, and user input handling.

## ✨ Features

- **Four Basic Operations:**
  - Addition (+)
  - Subtraction (-)
  - Multiplication (*)
  - Division (/)

- **User-Friendly Interface:**
  - Interactive menu system
  - Clear prompts and instructions
  - Formatted output display

- **Robust Error Handling:**
  - Input validation for menu choices
  - Protection against non-numeric inputs
  - Division by zero prevention
  - Graceful error messages

- **Continuous Operation:**
  - Multiple calculations without restarting
  - Two exit options for user convenience
  - Loop-based execution

## 🛠️ Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA Community Edition
- **Java Version:** Compatible with Java 8 and above
- **Input Handling:** Scanner class

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA Community Edition (or any Java IDE)

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/java-console-calculator.git
   cd java-console-calculator
   ```

2. **Open in IntelliJ IDEA:**
   - Launch IntelliJ IDEA
   - Select `File > Open`
   - Navigate to the project folder and open it

3. **Run the application:**
   - Open `Calculator.java`
   - Click the green play button or press `Shift + F10`
   - The calculator will start in the console

### Alternative: Command Line Execution

1. **Compile the program:**
   ```bash
   javac Calculator.java
   ```

2. **Run the program:**
   ```bash
   java Calculator
   ```

## 💻 How to Use

1. **Start the program** - The welcome message and menu will appear

2. **Select an operation** - Enter a number (1-5):
   - 1 for Addition
   - 2 for Subtraction
   - 3 for Multiplication
   - 4 for Division
   - 5 to Exit

3. **Enter numbers** - Input two numbers when prompted

4. **View result** - The calculation result will be displayed

5. **Continue or exit** - Choose whether to perform another calculation

### Example Usage

```
Welcome to Java Console Calculator!

===== CALCULATOR MENU =====
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
===========================
Choose an operation (1-5): 1
Enter first number: 15
Enter second number: 7

Result: 15.0 + 7.0 = 22.0

Do you want to perform another calculation? (y/n): n

Thank you for using the calculator. Goodbye!
```

## 🔍 Code Structure

### Main Methods

- `add(double a, double b)` - Performs addition
- `subtract(double a, double b)` - Performs subtraction
- `multiply(double a, double b)` - Performs multiplication
- `divide(double a, double b)` - Performs division with zero-check
- `displayMenu()` - Shows the operation menu
- `main(String[] args)` - Program entry point and main logic

### Key Programming Concepts

- **Object-Oriented Programming:** Static methods for calculator operations
- **Input/Output:** Scanner class for user input, System.out for output
- **Control Flow:** while loops, switch statements, if-else conditions
- **Error Handling:** Input validation and exception prevention
- **Data Types:** Use of double for decimal calculations

## 🎯 Learning Objectives

This project demonstrates:
- Console input/output operations in Java
- Method creation and invocation
- Loop implementation for continuous execution
- Conditional logic with switch and if statements
- Input validation techniques
- Error handling best practices

## 🐛 Known Limitations

- Supports only two operands per calculation
- Limited to basic arithmetic operations
- Console-based interface only (no GUI)
- Results displayed in decimal format

## 👤 Author

**Your Name**
- GitHub: [@Vedantsam](https://github.com/Vedantsam)
- Email: vedantvtst@gmail.com


