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
String[] command = allowedCommands.stream().filter(c -> c.equals(userInput)).toArray(String[]::new);
if (command.length > 0) {
    Runtime.getRuntime().exec(command[0]);
}\nString[] command = allowedCommands.stream().filter(c -> c.equals(userInput)).toArray(String[]::new);
if (command.length > 0) {
if (command.length > 0) {    Runtime.getRuntime().exec(command[0]);
}
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
import com.owasp.esapi.ESAPI;

java
java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

String sanitizedInput = sanitize(userInput);
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
Process process = Runtime.getRuntime().exec("cmd.exe /c " + sanitizedInput, null, null);
process.getErrorStream().pipeTo(outputStream);
process.getInputStream().pipeTo(outputStream);
process.waitFor();
String output = outputStream.toString(StandardCharsets.UTF_8);
// Use the sanitized output as needed

private static String sanitize(String input) {
    // Implement a simple sanitization method here, such as removing special characters or using a library like OWASP ESAPI
    // For the sake of brevity, I'll just remove single quotes and double quotes in this example
    return input.replaceAll("['\"]", "");
}\nProcessBuilder pb = new ProcessBuilder("cmd", "/c", sanitizedUserInput);
pb.redirectErrorStream(true);
Process p = pb.start();
BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
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

String sanitizedInput = sanitize(userInput);
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
Process process = Runtime.getRuntime().exec("cmd.exe /c " + sanitizedInput, null, null);
process.getErrorStream().pipeTo(outputStream);
process.getInputStream().pipeTo(outputStream);
process.waitFor();
String output = outputStream.toString(StandardCharsets.UTF_8);
// Use the sanitized output as needed

private static String sanitize(String input) {
    // Implement a simple sanitization method here, such as removing special characters or using a library like OWASP ESAPI
    // For the sake of brevity, I'll just remove single quotes and double quotes in this example
    return input.replaceAll("['\"]", "");
}
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);


        Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
