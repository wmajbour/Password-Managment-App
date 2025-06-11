Password Manager - Java Application
-----------------------------------

Overview:
---------
This is a simple password management tool written in Java. The application allows users to securely store, retrieve, and manage their passwords for various accounts and services.

Features:
---------
- Add new account credentials (site, username, password)
- Retrieve stored credentials
- Update existing entries
- Delete credentials
- Basic encryption for stored passwords
- Data saved to a local file for persistence

Requirements:
-------------
- Java 8 or later
- No external libraries required (unless using encryption features, see notes)

How to Run:
-----------
1. Compile the source code:
   > javac *.java

2. Run the application:
   > java passwordmanager

3. Follow the on-screen menu to add, retrieve, update, or delete credentials.

File Structure:
---------------
- `PasswordManager.java` - Main class with menu and user interaction
- `Credential.java` - Class representing a single account's credentials
- `PasswordStore.java` - Class responsible for storing, retrieving, and saving data
- `EncryptionUtil.java` (optional) - Class providing basic encryption/decryption functionality

Notes:
------
- This is a basic implementation meant for educational purposes.
- Passwords are stored using simple encryption or plain text (depending on implementation). For real-world use, consider using strong encryption libraries such as Java Cryptography Architecture (JCA) or external tools like Bouncy Castle.
- Always protect access to the local storage file where the credentials are saved.

Author:
-------
Waleed Majbour

