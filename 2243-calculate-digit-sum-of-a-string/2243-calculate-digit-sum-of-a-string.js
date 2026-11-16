/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var digitSum = function (s, k) {
    if (k>=s.length) return s;
    let ns = "";
    for (let i = 0; i < s.length; i += k) {
        let sub = s.slice(i, i + k);
        let sum = 0;
        for (let h = 0; h < sub.length; h++) {
            sum += Number(sub.charAt(h));
        }
        ns = ns + `${sum}`;
    }
    return ns.length > k ? digitSum(ns, k) : ns;
};