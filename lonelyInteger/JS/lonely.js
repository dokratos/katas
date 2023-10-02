function lonelyinteger(a) {
  if (a.length === 1) return a[0];
  
  a.sort();
  for (let i = 0; i < a.length; i += 2) {
      const j = i + 1;
      if (j === a.length) return a[i];
      
      if (a[i]===a[j]) {
          continue;
      } else {
          return a[i];
      }
  }

}