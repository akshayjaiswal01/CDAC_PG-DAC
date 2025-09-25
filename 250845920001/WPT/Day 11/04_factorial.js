function factorial()
{
    const args = process.argv;
    //console.log(args);
    const a = Number(args[2]);
    let fact = 1;
    for(let i=1; i<=a; i++)
    {
        fact = fact * i;
    }

    console.log(`Factorial of ${a} = ${fact}`);
}
factorial();