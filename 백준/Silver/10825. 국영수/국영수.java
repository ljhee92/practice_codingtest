import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        StringTokenizer st;
        String name;
        int koreanScore, englishScore, mathScore;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            koreanScore = Integer.parseInt(st.nextToken());
            englishScore = Integer.parseInt(st.nextToken());
            mathScore = Integer.parseInt(st.nextToken());
            
            students.add(new Student(name, koreanScore, englishScore, mathScore));
        }

        students.sort(
            Comparator.comparing(Student::getKoreanScore, Collections.reverseOrder())
            .thenComparing(Student::getEnglishScore)
            .thenComparing(Student::getMathScore, Collections.reverseOrder())
            .thenComparing(Student::getName)
        );

        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.getName()).append("\n");
        }

        System.out.println(sb);
    }

    private static class Student {
        private final String name;
        private final int koreanScore;
        private final int englishScore;
        private final int mathScore;

        public Student(String name, int koreanScore, int englishScore, int mathScore) {
            this.name = name;
            this.koreanScore = koreanScore;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return this.name;
        }

        public int getKoreanScore() {
            return this.koreanScore;
        }

        public int getEnglishScore() {
            return this.englishScore;
        }

        public int getMathScore() {
            return this.mathScore;
        }
    }
}
