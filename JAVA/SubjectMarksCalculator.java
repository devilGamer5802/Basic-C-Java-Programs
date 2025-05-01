import javax.swing.JOptionPane;

public class SubjectMarksCalculator {
    public static void main(String[] args) {
        // Input dialog to get marks for each subject
        String inputSubject1 = JOptionPane.showInputDialog("Enter marks for Subject 1:");
        String inputSubject2 = JOptionPane.showInputDialog("Enter marks for Subject 2:");
        String inputSubject3 = JOptionPane.showInputDialog("Enter marks for Subject 3:");

        // Convert input strings to integers
        int marksSubject1 = Integer.parseInt(inputSubject1);
        int marksSubject2 = Integer.parseInt(inputSubject2);
        int marksSubject3 = Integer.parseInt(inputSubject3);

        // Calculate the sum of marks
        int totalMarks = marksSubject1 + marksSubject2 + marksSubject3;

        // Display the result using a message dialog
        String resultMessage = "Marks in Subject 1: " + marksSubject1 + "\n"
                             + "Marks in Subject 2: " + marksSubject2 + "\n"
                             + "Marks in Subject 3: " + marksSubject3 + "\n\n"
                             + "Total Marks: " + totalMarks;

        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
