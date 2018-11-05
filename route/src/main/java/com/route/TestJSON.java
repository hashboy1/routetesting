package com.route;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class TestJSON {
public static void main(String[] args) throws IOException {
Person obj = new Person(123, "lisi");
File file = new File("f:/object.txt");
ObjectOutputStream oos = null;
OutputStream os = new FileOutputStream(file);
oos = new ObjectOutputStream(os);
oos.writeObject(obj);
oos.writeObject(obj.toString());


}
}