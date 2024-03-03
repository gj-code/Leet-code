var lengthOfLastWord = function(s) {
    const arr = [...s]
    let count = 0

    while(/\s/.test(arr[arr.length-1])){
        arr.splice(arr.length-1, 1)
    }

    for(let i = arr.length-1; i >= 0; i--){
        if(/\s/.test(arr[i])){
            return count
        }
        count++
    }
    return count

};

lengthOfLastWord("   fly me   to   the moon  ")