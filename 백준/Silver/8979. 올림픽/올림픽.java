import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int name, gold, silver, bronze;
        List<Country> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = Integer.parseInt(st.nextToken());
            gold = Integer.parseInt(st.nextToken());
            silver = Integer.parseInt(st.nextToken());
            bronze = Integer.parseInt(st.nextToken());
            list.add(new Country(name, gold, silver, bronze));
        }

        list.sort(
            Comparator.comparing(Country::getGold, Collections.reverseOrder())
            .thenComparing(Country::getSilver, Collections.reverseOrder())
            .thenComparing(Country::getBronze, Collections.reverseOrder())
        );

        int rank = 1;
        Country prev = list.get(0);

        if (prev.equalToName(k)) {
            System.out.println(rank);
            return;
        }

        for (int i = 1; i < n; i++) {
            Country current = list.get(i);
            if (current.getGold() != prev.getGold() || current.getSilver() != prev.getSilver() || current.getBronze() != prev.getBronze()) {
                rank = i+1;
            }
            if (current.equalToName(k)) {
                System.out.println(rank);
                return;
            }
            prev = current;
        }
    }

    private static class Country {
        
        private final int name;
        private final int gold;
        private final int silver;
        private final int bronze;

        public Country(int name, int gold, int silver, int bronze) {
            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        public boolean equalToName(int name) {
            return this.name == name;
        }

        public int getGold() {
            return this.gold;
        }

        public int getSilver() {
            return this.silver;
        }

        public int getBronze() {
            return this.bronze;
        }
    }
}
