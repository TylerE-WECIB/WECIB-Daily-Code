// Find and fix the bug in each of these regex lines:
String text1 = "file.txt";
boolean result1 = text1.matches("file.txt");  // Should match "file.txt" exactly
 
String[] parts2 = "apple,banana;orange".split("{,;}"); // Should split on commas and semicolons
 
String result3 = "abbbbbc".replaceAll("a+bc", "X"); // Should replace "abbbbbc" with "X"
 
String result4 = "abc123def456".replaceAll("\\d+", "[\\d+]"); // Should wrap digits in brackets
 
String result5 = "C:\\Program Files\\Java".replaceAll("\\", "/"); // Should replace backslashes with forward slashes