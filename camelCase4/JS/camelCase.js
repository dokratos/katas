function processData(input) {
  const tests = input.split('\n');
  
  for (let sentence of tests) {
     if (sentence.startsWith('S')) {
          const letters = sentence.replace('()', '').substring(4).split('');
          let result = '';
          for (let l of letters) {
              const regex = new RegExp('[A-Z]');
              if (regex.test(l)) {
                  l = ' ' + l.toLowerCase();
                  result += l;
              } else {
                  result += l;
              }
              
          }
          console.log(result.trim());
      } else {
          const method = sentence[2];
          const words = sentence
                          .substring(4)
                          .split(' ')
                          .map(w => w.substring(0, 1).toUpperCase() + w.substring(1));
          const clas = words.join('').trim();
          const variable = clas.substring(0, 1).toLowerCase() + clas.substring(1);
          const meth = variable + "()";
          
          switch (method) {
              case 'C':
                  console.log(clas);
                  break;
              case 'V':
                  console.log(variable);
                  break;
              case 'M':
                  console.log(meth);
                  break;
              default:
                  console.log("no!");
          }
      }
   
  }

} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
  _input += input;
});

process.stdin.on("end", function () {
 processData(_input);
});
