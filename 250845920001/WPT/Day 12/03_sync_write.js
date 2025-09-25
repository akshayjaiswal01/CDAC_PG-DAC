const fs = require('fs');

try {
  const content = 'This is written using synchronous method.';
  fs.writeFileSync('syncData.txt', content, 'utf8');
  
} 
catch (err) {
  console.error('Error writing file:', err.message);
}
