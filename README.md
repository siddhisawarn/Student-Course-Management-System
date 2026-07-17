# Student Course Management System

A Java-based console application that manages students, course enrollment, grades, and GPA calculation using object-oriented programming principles.

## Features

- Create and manage student information
- Add and view courses
- Track course credits and grades
- Calculate student GPA
- Interactive menu-driven system
- Save course data using file handling
- Load saved courses when the application starts

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- File I/O
- Git & GitHub

## OOP Concepts Implemented

### Encapsulation
Private variables are used with public getter methods to protect and control access to data.

### Inheritance
The `Student` class extends the `Person` class to reuse common attributes such as name and ID.

### Abstraction
Separate classes handle different responsibilities:

- `Student` - Manages student information and enrolled courses
- `Course` - Stores course name, credits, and grades
- `FileManager` - Handles saving and loading course data
- `StudentManager` - Controls the interactive menu system

## Project Structure
```text
src/
│
├── Main.java
├── Person.java
├── Student.java
├── Course.java
├── StudentManager.java
└── FileManager.java
```

## How It Works

1. The application starts from `Main.java`.
2. A student object is created using the `Student` class.
3. Users can view student information through an interactive menu.
4. Users can add courses with course name, credits, and grades.
5. The system calculates GPA based on course credits and grades.
6. Course data is saved when the user exits the application.
7. Previously saved courses are loaded when the application starts again.

## Example Output

```text
Student Course Management System

1. View Student Information
2. View Courses
3. Add Course
4. Calculate GPA
5. Exit

Choose an option:
```

## Future Improvements

- Add support for multiple students
- Add database integration
- Add user authentication
- Create a graphical user interface (GUI)
- Improve input validation
- Add search and update features

## Author

Siddhi Sawarn
