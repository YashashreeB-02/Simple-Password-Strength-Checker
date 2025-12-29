🔐 Simple Password Strength Checker
📌 Project Overview

The Simple Password Strength Checker is a command-line Java application that evaluates the strength of a user-entered password based on predefined security rules. The system educates users about strong password guidelines, identifies weak or medium passwords, provides improvement suggestions, and enforces strong password creation by repeatedly prompting the user until a secure password is entered.

This project demonstrates the practical application of Data Structures and Algorithms (DSA) concepts such as strings, linear traversal, loops, and conditional logic.

🎯 Objectives

To analyze password strength using standard security rules

To guide users in creating strong passwords

To repeatedly prompt the user until a strong password is entered

To demonstrate DSA concepts in a real-world cybersecurity problem

To build a lightweight and easy-to-use command-line application


✅ Password Strength Rules

A password is considered strong if it satisfies all the following:

Minimum 8 characters

At least one uppercase letter (A–Z)

At least one lowercase letter (a–z)

At least one digit (0–9)

At least one special character (e.g., @ # $ !)

🧠 DSA Concepts Used

Data Structures: String, ArrayList

Algorithms: Linear traversal, counting technique

Control Structures: if–else, loops (do–while)

Complexity Analysis:

Time Complexity: O(n)

Space Complexity: O(1)

📁 Project Structure
Simple-Password-Strength-Checker/
│
├── AutoPasswordRunner.java   // Main execution file
├── PasswordAnalyzer.java    // Password validation logic
├── PasswordResult.java      // Strength classification & suggestions
├── DummyDatabase.java       // Dummy password examples
└── README.md                // Project documentation

▶️ How to Run the Project
1️⃣ Compile all Java files
javac *.java

2️⃣ Run the application
java AutoPasswordRunner

🖥️ Sample Output
Guidelines for a Strong Password:
- Minimum 8 characters
- At least one uppercase letter
- At least one lowercase letter
- At least one digit
- At least one special character

Enter password: Password1

Strength: Medium
To make your password stronger:
- Add at least one special character

Enter password: Strong@123

Strength: Strong
Strong password accepted. Access granted.

📚 Dummy Password Examples

Weak:

abc123

password

Medium:

Password1

Test@123

Strong:

Strong@123

MyPass#2024

⚠️ Limitations

Console-based application only

Uses static password rules

No password encryption or storage

Designed for academic and learning purposes

🚀 Future Enhancements

Password encryption and hashing

Database or file-based storage

Graphical User Interface (GUI)

Web-based implementation

Password strength meter

📖 Bibliography

Oracle Java Documentation

GeeksforGeeks – Password Strength Algorithms

Java Official Tutorials

Class Notes

🏁 Conclusion

The Simple Password Strength Checker successfully demonstrates how basic DSA concepts can be applied to a real-world cybersecurity problem. It promotes strong password practices while maintaining simplicity, efficiency, and clarity.
