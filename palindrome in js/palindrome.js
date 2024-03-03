const isPalindrome = function(s) {
    const cleanStr = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    return cleanStr === cleanStr.split('').reverse().join('');
};

isPalindrome("A man, a plan, a canal: Panama")