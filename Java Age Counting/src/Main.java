/*
Java Age Counting

In the Java file, write a program to perform a GET request on the route
https://coderbyte.com/api/challenges/json/age-counting
which contains a data key and the value is a string which contains items in the format:
key=STRING, age=INTEGER. Your goal is to count how many items exist that have an age equal to or greater than 50, and print this final value.

Example Input
{"data":"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47"}

Example Output
2




*/




import java.util.*;
import java.io.*;
import java.net.*;
import java.util.regex.*;

class Main {
    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new  BufferedReader(inputStreamReader);
                String thisLine;
                while ((thisLine = bufferedReader.readLine()) != null) {
                    String[] strings = thisLine.split(":");
                    String parsedString = strings[1].replaceAll("\"}","").replace("\"","");
                    String[] keyValues = parsedString.split(",");
                    System.out.println(Arrays.stream(keyValues).filter(s -> s.contains("age") && Integer.parseInt(s.split("=")[1]) >= 50).count());
                }
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}