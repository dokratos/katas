const pangram = string => {
const alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
const check = string.toLowerCase();

for (const letter of alphabet) {
  if (check.includes(letter)) continue;
  else return "not pangram";
}
return "pangram";
}

module.exports = pangram;