function rotateLeft(d, arr) {
  const chunk1 = arr.slice(d);
  const chunk2 = arr.slice(0, d);
  
  return chunk1.concat(chunk2);

}