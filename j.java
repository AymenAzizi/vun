import java.sql.*;
import java.io.*;

public class VulnerableApp {
    public static void main(String[] args) {
        // SQL Injection Vulnerability
        String userInput = args[0];
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            Sanitize user input before rendering it as HTML:

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Instead of:
out.println(userInput);

Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);

// Use a whitelist approach:
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
}
Runtime.getRuntime().exec(userInput);
```\nout.println(ESAPI.encoder().encodeForHTML(userInput));
```\n// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

        }

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Instead of:
out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);


        Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
