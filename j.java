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

java
java
String sanitizedInput = HtmlSanitizer.sanitize(userInput);
out.println(sanitizedInput);\nout.println(sanitizedInput);
out.println(sanitizedInput);

java
java
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
String[] command = allowedCommands.stream()
                                .filter(cmd -> cmd.equals(userInput))
                                .toArray(String[]::new);

if (command.length > 0) {
    Runtime.getRuntime().exec(command);
}\nString[] command = allowedCommands.stream()
                                .filter(cmd -> cmd.equals(userInput))
                                .filter(cmd -> cmd.equals(userInput))                                .toArray(String[]::new);

if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
Runtime.getRuntime().exec(ESAPI.encoder().encodeForHTML(userInput));
Runtime.getRuntime().exec(ESAPI.encoder().encodeForHTML(userInput));\n



        }

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

java
java
java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "echo", userInput);
pb.redirectErrorStream(true);
Process process = pb.start();

ByteArrayOutputStream os = new ByteArrayOutputStream();
byte[] buffer = new byte[1024];
int length;

while ((length = process.getInputStream().read(buffer)) > 0) {
    os.write(buffer, 0, length);
}

String output = os.toString(StandardCharsets.UTF_8);
// Now you can use the output as needed
```

This code uses a `ProcessBuilder` to execute the command, which is safer than using `Runtime.getRuntime().exec()`. It also sanitizes the user input by only allowing alphanumeric characters, spaces, and the characters `"&()<>@,;:\\\"'` using regular expressions.

```java
String sanitizedInput = userInput.replaceAll("[^a-zA-Z0-9 \\&()<>@,;:\\\"'-]+", "");\n
java
String sanitizedUserInput = ESAPI.encoder().encodeForHTML(userInput);
ProcessBuilder pb = new ProcessBuilder("cmd", "/c", sanitizedUserInput);
pb.redirectErrorStream(true);
Process p = pb.start();
InputStream is = p.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(is));
String line;
while ((line = br.readLine()) != null) {
    // Process the output as needed
}\n
out.println(ESAPI.encoder().encodeForHTML(userInput));\n
// ...
java
String sanitizedUserInput = ESAPI.encoder().encodeForHTML(userInput);
ProcessBuilder pb = new ProcessBuilder("cmd", "/c", sanitizedUserInput);
pb.redirectErrorStream(true);
Process p = pb.start();
java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "echo", userInput);
pb.redirectErrorStream(true);
Process process = pb.start();

ByteArrayOutputStream os = new ByteArrayOutputStream();
byte[] buffer = new byte[1024];
int length;

while ((length = process.getInputStream().read(buffer)) > 0) {
    os.write(buffer, 0, length);
}

String output = os.toString(StandardCharsets.UTF_8);
// Now you can use the output as needed
```

This code uses a `ProcessBuilder` to execute the command, which is safer than using `Runtime.getRuntime().exec()`. It also sanitizes the user input by only allowing alphanumeric characters, spaces, and the characters `"&()<>@,;:\\\"'` using regular expressions.

```java
String sanitizedInput = userInput.replaceAll("[^a-zA-Z0-9 \\&()<>@,;:\\\"'-]+", "");
BufferedReader br = new BufferedReader(new InputStreamReader(is));
String line;
while ((line = br.readLine()) != null) {
    // Process the output as needed
}
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);


        Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
