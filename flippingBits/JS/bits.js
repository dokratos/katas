function flippingBits(n) {
  const binary = n.toString(2).padStart(32, "0").split('');
  let notBit = '';
  
  for (const num of binary) {
      if (num === '1') {
          notBit += '0';
      }
      if (num === '0') {
          notBit += '1';
      }
  }

  return parseInt(notBit, 2);
}