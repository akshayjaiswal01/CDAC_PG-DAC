function fact(a)
{
    let fact1 = 1;
    for(i=2; i<=a; i++)
    {
        fact1 = fact1 * i;
    }
    return fact1;
}


console.log("Factorial is: ",fact(5));