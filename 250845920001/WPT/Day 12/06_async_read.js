const fs = require('fs');

fs.readFile('asyncData.txt', 'utf8', (err, data) => {
  if (err)
  {
    console.log("error occured " + err)
  }
  else
  {
    console.log('Asynchronous read:', data);
  }
});
