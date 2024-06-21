function solution(num_str) {
    var answer = 0;
    
    var num_char = num_str.split("");
    
    num_char.forEach((e) => {
        answer += Math.floor(e);
    })
    
    return answer;
}