function calculate(...a)
{
    let sum = 0;
    for(let i=0; i<a.length; i++)
    {
        sum = sum + a[i];
    }

    console.log("Addition: ",sum);

    console.log("Maximum: ",Math.max(...a));

    
}

calculate(10, 21);
calculate(10, 20, 31);
calculate(11,2,3,4);