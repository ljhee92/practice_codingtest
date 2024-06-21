function solution(arr, n) {
    var answer = [];
    
    var length = arr.length;
    
    if(length % 2 == 0) {
        for(var i = 0; i < length; i++) {
            if(i % 2 == 0) {
                answer[i] = arr[i];
            } else {
                answer[i] = arr[i] + n;
            }
        }
    } else {
        for(var i = 0; i < length; i++) {
            if(i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
    }
    
    return answer;
}