import java.io.*;

public class FilePatternCount {

    static void writeFile(String filename) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        bw.write("Peter Piper picked a peck of pickled peppers\n");
        bw.write("A peck of pickled peppers Peter Piper picked\n");
        bw.write("If Peter Piper picked a peck of pickled peppers?\n");
        bw.write("Where's the peck of pickled peppers Peter Piper picked?\n");

        bw.close();

        System.out.println("File written successfully.");
    }

    static int countPattern(String text, String pat) {
        int count = 0, idx = 0;

        while ((idx = text.indexOf(pat, idx)) != -1) {
            count++;
            idx += pat.length();
        }

        return count;
    }

    static void readAndCount(String filename, String[] patterns)
            throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }

        br.close();

        String text = sb.toString();

        for (String p : patterns) {
            System.out.println("'" + p + "' occurrences = "
                    + countPattern(text, p));
        }
    }

    public static void main(String[] args) throws IOException {

        writeFile("sample.txt");

        readAndCount("sample.txt", new String[]{"pe", "pi"});
    }
}