public class StudentMarksCalculator {
    public static void main(String[] args) {

        String studentName = "John";
        int math = 85;
        int science = 78;
        int english = 92;

        int total = math + science + english;
        double average = total / 3.0;
        boolean passed = average >= 50;

        System.out.println("Student Name: " + studentName);
        System.out.println("Math Marks: " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("English Marks: " + english);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Passed: " + passed);
    }
}