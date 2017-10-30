function iQTest(testArray){
    var testArray;
    if(testArray[0] === undefined){
        return 0;
    }
    if((testArray[1]%2 == 0 && testArray[2] % 2 == 0) ||
    (testArray[2]%2 == 0 && testArray[3] % 2 == 0) ||
    (testArray[1]%2 == 0 && testArray[3] % 2 == 0)){
        for(var i = 1; i <= testArray.length; i++){
            if(testArray[i]%2 != 0){
                return i;
            }
        }
    }else {
        for(var j = 1; j <= testArray.length; j++){
            if(testArray[j]%2 == 0){
                return j;
    }
}
    }
}