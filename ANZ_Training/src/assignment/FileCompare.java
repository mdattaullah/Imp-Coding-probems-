package assignment;
import java.util.*;
import java.io.*;
public class FileCompare {
public static void main(String[]ar) {
try {
List<String> l1 = new ArrayList<>();
List<String> l2 = new ArrayList<>();
BufferedReader r1 = new BufferedReader(new FileReader("C:/Users/mninadde/Downloads/file1.txt"));
String line;
while ((line = r1.readLine()) != null) {

l1.add(line.toLowerCase());
}

BufferedReader r2 = new BufferedReader(new FileReader(("C:/Users/mninadde/Downloads/file2.txt")));
String line1;
while ((line1 = r2.readLine()) != null) {

l2.add(line1.toLowerCase());
}

Set<String> s1 = new HashSet<>(l1);
Set<String> s2 = new HashSet<>(l2);

List<String> commonLines = new ArrayList<>();
List<String> difference = new ArrayList<>();

for (String lines : s1) {
if (s2.contains(lines.toLowerCase())) {
commonLines.add(lines);
} else {
difference.add(lines);
}
}
for (String lines : s2) {
if (!commonLines.contains(lines.toLowerCase())) {
difference.add(lines);
}

}
BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/mninadde/Downloads/Common.txt"));
for (String lines : commonLines) {
writer.write(lines);
writer.newLine();
}
writer.close();

BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:/Users/mninadde/Downloads/differences.txt"));
for (String lines2 : difference) {
writer1.write(lines2);
writer1.newLine();
}

writer1.close();
}catch (Exception e){
System.out.println(e);
}
}
}
