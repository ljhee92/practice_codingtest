function solution(arr1, arr2) {
    var answer = 0;
    
    // 1. arr1과 arr2의 배열의 길이 확인
    if(arr1.length > arr2.length) {
        answer = 1;
    } else if(arr1.length < arr2.length) {
        answer = -1;
    } else {
        // 2. 두 배열의 길이가 같다면 각 요소의 합 확인
        var sumOfArr1 = arr1.reduce((total, e) => total+e, 0);
        var sumOfArr2 = arr2.reduce((total, e) => total+e, 0);
        
        if(sumOfArr1 > sumOfArr2) {
            answer = 1;
        } else if(sumOfArr1 < sumOfArr2) {
            answer = -1;
        } else {
            answer = 0;
        }
    }    
    
    return answer;
}