function solution(myString, pat) {
    var answer = 0;
    
    myString = myString.split("");
    var newString = [];
    
    myString.forEach((e) => {
       if(e === 'A') {
           newString.push('B');
       } else {
           newString.push('A');
       }
    });
    
    newString = newString.join('');
    
    if(newString.indexOf(pat) !== -1) {
        answer = 1;
    }
    
    return answer;
}