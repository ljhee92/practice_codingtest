function solution(arr, k) {
    var answer = [];
    
    if(k % 2 == 0) {
        arr.forEach((e) => {
            answer.push(Math.floor(e + k));
        });
    } else {
        arr.forEach((e) => {
           answer.push(Math.floor(e * k)); 
        });
    }
    
    return answer;
}