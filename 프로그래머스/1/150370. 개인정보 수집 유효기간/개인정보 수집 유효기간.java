import java.time.*;
import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // today : YYYY.MM.DD
        // terms : 약관종류(A~Z) 유효기간(1~100)
        // privacies : 수집일자(YYYY.MM.DD) 약관종류(A~Z)
        // 한 달은 28일까지
        
        // today LocalDate으로 파싱
        LocalDate parsedToday = parseDate(today);
        
        // 약관종류 Map 생성
        Map<String, Integer> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String type = terms[i].split(" ")[0];
            String period = terms[i].split(" ")[1];
            termsMap.put(type, Integer.parseInt(period));
        }
        
        // 수집일자 + 약관유효기간 -> 보관가능일자 계산
        // 오늘날짜와 보관가능일자 비교
        // 수집일자별 보관가능여부 확인
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String getDate = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];
            
            LocalDate parsedGetDate = parseDate(getDate);
            int canSaveMonth = termsMap.get(type);
            LocalDate canSaveDate = parsedGetDate.plusMonths(canSaveMonth).minusDays(1);
            
            if (parsedToday.isAfter(canSaveDate)) {
                answer.add(i+1);
            }
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    private LocalDate parseDate(String date) {
        String[] arr = date.split("\\.");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        
        return LocalDate.of(year, month, day);
    } 
}