/**
 * @param {string[]} words
 * @param {character} separator
 * @return {string[]}
 */
var splitWordsBySeparator = function (words, separator) {
    let a = [];
    words.forEach((val) => {
        let arr = val.split(`${separator}`);
        arr.forEach((v) => {
            if (v !== "") {
                a.push(v);
            }
        })
    })
    return a;
};