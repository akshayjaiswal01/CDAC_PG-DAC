const fs = require('fs');

const content = 'This is written using asynchronous method.';

fs.writeFile('asyncData.txt', content, 'utf8', (err) => {
  if (err) {
    console.error('Error writing file:', err.message);
    return;
  }
  console.log('Asynchronous write complete.');
});
