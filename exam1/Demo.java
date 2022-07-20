package exam1;

public class Demo {

    public static void main(String[] args) {
        StudentManager stm = new StudentManager();
        Student s1 = new Student("1", "Max", "max.maxi@gmail.com");
        Student s2 = new Student("2", "Susi", "Susi@gmail.com");
        Student s3 = new Student("3", "Mimi", "maxi@gmail.com");
        Student s4 = new Student("4", "Max", "max.maxi@gmail.com");


        stm.add(s1);
        stm.add(s2);
        stm.add(s3);
        stm.add(s4);
        System.out.println(stm);
        stm.exportToCsv();
    }

}
