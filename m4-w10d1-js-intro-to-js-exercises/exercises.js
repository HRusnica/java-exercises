function sumDouble(x, y) {
if(x === y) {
    return 2 * (x + y);
} else {
    return x + y;
}

}

function hasTeen(a, b, c){
    if((13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19)){
        return true;
    } return false;
}

function lastDigit(d, e){
    if((d%10) === (e%10)){
        return true;
    } return false;
}

function seeColor(str){
    var str;
    if(str.substring(0,3) === "red" ){
        return "red";
    } else if(str.substring(0,4) === "blue"){
        return "blue";
    }return "";
}

function middleThree(word){
    var word;
    return word.substring((word.length/2)-1, (word.length/2)+2)
}

function frontAgain(str){
    var str;
    if(str.substring(0,2) === str.substring(str.length-2, str.length)){
        return true;
    } return false;
}

function alarmClock(day, vacation){
    var day;
    var vacation;
    if (day == 0) {
        var day = 'Sunday';
    } else if (day == 1) {
        var day = 'Monday';
    } else if (day == 2){
        var day = 'Tuesday';
    } else if (day == 3){
        var day = 'Wednesday'
    } else if (day == 4) {
        var day = 'Thursday';
    } else if (day == 5){
       var day = 'Friday';
    } else if (day == 6){
        var day = 'Saturday'
    }    
    if(vacation == true && (day == 'Saturday' || day == 'Sunday')){
        return 'off';
    } else if (vacation == true && (day != 'Saturday' && day != 'Sunday')){
        return '10:00';
    } else if (day == 'Saturday' || day == 'Sunday') {
        return '10:00'
    } return '7:00'
}

function makeMiddle(nums){
    if(nums.length < 2 || nums.length % 2 != 0){
        return [];
    } var nums2 = new Array;
    nums2[0] = nums[nums.length/2 -1];
    nums2[1] = nums[nums.length/2];
    return nums2;
}

function oddOnly(mixedArray){
    var mixedArray;
    var oddArray = new Array;
    for (var i = 0; i < mixedArray.length; i++){
        if(mixedArray[i] % 2 === 1){
            oddArray.push(mixedArray[i]);
        }
    } return oddArray;
}

function weave(ar1, ar2){
    var wovenArray = new Array;
    if(ar1.length > ar2.length){
    for(var i = 0; i < ar1.length; i++){
       wovenArray.push(ar1[i]);
       if(ar2[i] != undefined) wovenArray.push(ar2[i]); 
    } 
} else {
    for(var i = 0; i < ar2.length; i++){
        if(ar1[i] != undefined) wovenArray.push(ar1[i]);
        wovenArray.push(ar2[i]); 
}
}return wovenArray;
}

function cigarParty(cigars, isWeekend){
    if((40 <= cigars && cigars <= 60) || (cigars >= 40 && isWeekend)){
        return true;
    } return false;
}

function stringSplosion(code){
    var newCode = "";
    for(var i = 0; i < code.length; i++){
    newCode += code.substring(0, i+1);
    } return newCode;
}

function fizzBuzz(num){
    if(num % 15 == 0){
        return 'FizzBuzz';
    } if(num % 3 == 0){
        return 'Fizz';
    } if(num % 5 == 0){
        return 'Buzz';
    } return num;
}

function countValues(numArray){
    var count = {};
    for(var i = 0; i < numArray.length; i++){
        if(count[numArray[i]] === undefined){
            count[numArray[i]] = 0;
        } count[numArray[i]]++;
    }return count;
}

function reverseArray(intArray){
    return intArray.reverse();
}

function blackJack(g, h){
   if(g > 21 && h > 21){
    return 0;
   } else if (g > 21){
       return h;
   } return g;
}

