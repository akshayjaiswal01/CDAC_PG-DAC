const express = require('express');
const app = express();
app.set('view engine', 'hbs');
app.use(express.urlencoded({ extended : true}));

app.get('/', (req, res)=>{
    res.render('calc');
});

app.post('/calculate', (req, res)=>{
    const a = parseInt(req.body.num1);
    const b = parseInt(req.body.num2);
    const result = a + b;
    res.render('calc', {result});
});

app.listen(4500, ()=>{
    console.log('server running on http://localhost:4500');
})