const fs = require('fs');

try {
  fs.accessSync('syncData.txt', fs.constants.F_OK); 

  const data = fs.readFileSync('syncData.txt', 'utf8');

  console.log('File content:', data);

} catch (err) {
  console.error('Error:', err.message);
}
