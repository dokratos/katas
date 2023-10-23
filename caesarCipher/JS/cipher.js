const caesarCipher = (string, encoding) => {
  let result = '';
  const alpha = 'abcdefghijklmnopqrstuvwxyz';
  const k = encoding > 26 ? encoding % 26 : encoding;
  const upper = alpha.toUpperCase();

  const decoded = alpha.substring(k) + alpha.substring(0, k);
  const decodUpper = upper.substring(k) + upper.substring(0, k);

  for (let i = 0; i < string.length; i++) {
    if (alpha.includes(string[i])) {
      result += decoded[alpha.indexOf(string[i])];
    } else if (upper.includes(string[i])) {
      result += decodUpper[upper.indexOf(string[i])];
    } else {
      result += string[i];
    }
  }

  return result;
}

module.exports = caesarCipher;