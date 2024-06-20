function solution(my_string, target) {
    let answer = 0;
    
    if(my_string.indexOf(target) !== -1) {
        answer = 1;
    }
    
    return answer;
}