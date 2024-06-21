function solution(strArr) {
    var answer = [];
    
    for(var i = 0; i < strArr.length; i++) {
        if(strArr[i].indexOf("ad") === -1) {
            answer.push(strArr[i]);
        }
    }
    
    return answer;
}