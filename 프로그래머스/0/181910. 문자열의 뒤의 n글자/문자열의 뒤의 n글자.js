function solution(my_string, n) {
    var length = my_string.length;
    var answer = my_string.substr(length - n);
    return answer;
}