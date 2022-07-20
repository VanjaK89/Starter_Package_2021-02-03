package exam1;

import java.io.*;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;
    private Object StudentExportException;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }

    public void exportToCsv() {
        File file = new File("test.csv");
        if (!file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String separator = ";";

                for (Student s : students) {
                    bufferedWriter.write(s.getId());
                    bufferedWriter.write(separator);
                    bufferedWriter.write(s.getName());
                    bufferedWriter.write(separator);
                    bufferedWriter.write(s.getEmail());
                    System.out.println("Student with ID: " + s.getId() + "has been written to CSV");
                    bufferedWriter.newLine();
                }

                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else{
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                throw (Throwable) StudentExportException;
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}