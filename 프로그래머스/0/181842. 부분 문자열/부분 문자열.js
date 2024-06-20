function solution(str1, str2) {
    let answer = 0;
    
    if(str2.indexOf(str1) >= 0) {
        answer = 1;
    }
    
    return answer;
}