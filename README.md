# Number Conversions in Java with GUI

This Java application provides a stylish and interactive GUI for users to enter decimal, binary, and hexadecimal numbers and perform various operations on them, such as conversions and calculating one's complement. The application ensures input validation and offers a smooth user experience with gradient colors, bubble-like buttons, and sub-windows for each operation.

## Features

1. **Input Validation**:

   - The user is prompted to enter a decimal, binary, and hexadecimal number.
   - If any input is invalid, an error window will appear indicating which input failed.
   - The error window provides an option to return to the input screen.

2. **Operations**:

   - **Option 1: Conversions**:
     - Convert between binary, decimal, and hexadecimal.
     - Available conversions: Binary to Decimal, Binary to Hex, Decimal to Binary, Decimal to Hex, Hex to Decimal, and Hex to Binary.
   - **Option 2: One's Complement**:
     - Calculate the one's complement of the provided binary, decimal, or hexadecimal number.
     - Options include calculating one's complement for each of the three input formats (binary, decimal, hexadecimal).

3. **Navigation**:
   - The user can navigate between options using a **Back** button or return to the main page using a **Home** button.

## User Interface Design

- The GUI features creative styling with:
  - **Gradient colors** for backgrounds.
  - **Bubble-like buttons** that respond to clicks and hover events.
  - **Slow line-by-line output** to enhance readability and user experience.

## How to Compile

### Prerequisites:

- Ensure you have **Java JDK** installed (version 8 or higher).
- You can download the latest version of the JDK [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Compilation Steps:

1. Clone or download the repository containing the project files.
2. Open a terminal (or command prompt) in the directory where the project files are located.
3. Use the following command to compile the Java files:
   ```
   javac MainApp.java
   ```
   Ensure that all the necessary .java files are in the same directory or appropriately referenced.

### Running the Application:

After compilation, use the following command to run the application:

```
java MainApp
```

This will launch the GUI where you can enter the decimal, binary, and hexadecimal numbers and choose the operations to perform.
