import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
import java.util.stream.*;

class Solution {
    private Map<String, List<String>> inRecords = new HashMap<>();
    private Map<String, List<String>> outRecords = new HashMap<>();
    private Map<String, Integer> parkingFares = new HashMap<>();
    
    public int[] solution(int[] fees, String[] records) {
        findRecords(records);
        calculateParkingFares(fees);
        
        Map<String, Integer> sorted = new TreeMap<>(parkingFares);
        int[] answer = sorted.values().stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
    
    private void findRecords(String[] records) {      
        // 차량번호 추가
        for (String record : records) {
            String[] element = record.split(" ");
            String carNumber = element[1];
            
            inRecords.put(carNumber, new ArrayList<>());
            outRecords.put(carNumber, new ArrayList<>());
        }
        
        // 차량별 입출차 내역 추가
        for (String car : inRecords.keySet()) {
            List<String> in = new ArrayList<>();
            List<String> out = new ArrayList<>();
            
            for (String record : records) {
                String[] element = record.split(" ");
                String time = element[0];
                String carNumber = element[1];
                String history = element[2];

                if (car.equals(carNumber) && history.equals("IN")) {
                    in.add(time);
                } else if (car.equals(carNumber) && history.equals("OUT")) {
                    out.add(time);
                }
            }
            
            if (in.size() != out.size()) {
                out.add("23:59");
            }
            
            inRecords.put(car, in);
            outRecords.put(car, out);
        }
    } 
    
    private void calculateParkingFares(int[] fees) {
        int basicTime = fees[0];
        int basicFare = fees[1];
        int unitTime = fees[2];
        int unitFare = fees[3];
        
        for (String car : inRecords.keySet()) {
            List<String> inTimes = inRecords.get(car);
            List<String> outTimes = outRecords.get(car);
            int parkingFare = basicFare;
            double accumulatedTime = 0.0;
            
            for (int i = 0; i < inTimes.size(); i++) {
                String inTime = inTimes.get(i);
                String outTime = outTimes.get(i);

                LocalTime in = LocalTime.parse(inTime, DateTimeFormatter.ofPattern("HH:mm"));
                LocalTime out = LocalTime.parse(outTime, DateTimeFormatter.ofPattern("HH:mm"));
                
                long between = ChronoUnit.MINUTES.between(in, out);
                accumulatedTime += between;
            }
            
            if (accumulatedTime > basicTime) {
                double calculated = Math.ceil((accumulatedTime - basicTime) / unitTime);
                parkingFare += (calculated * unitFare);
            }
            
            parkingFares.put(car, parkingFare);
        }
    }
}