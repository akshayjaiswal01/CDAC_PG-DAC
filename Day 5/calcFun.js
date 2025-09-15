function calculate(...a)
{
    let sum = 0;
    for(let i=0; i<a.length; i++)
    {
        sum = sum + a[i];
    }

    console.log("Addition: ",sum);

    let oddNumbers = a.filter(num => num % 2 !==0);
    console.log("Odd Numbers: ",oddNumbers);

    let evenNumbers = a.filter(num => num % 2 ==0);
    console.log("Even Numbers: ",evenNumbers);

    
}

calculate(10, 21);
calculate(10, 20, 31);
calculate(1,2,3,41);