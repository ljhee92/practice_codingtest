function solution(n_str) {
    var answer = '';
    
    var arr = n_str.split("");
    
    for(var i = 0; i < arr.length; i++) {
        if(arr[i] === '0') {
            continue;
        } else {
            answer = n_str.substr(n_str.indexOf(arr[i]));
            break;
        }
    }
    
    return answer;
}