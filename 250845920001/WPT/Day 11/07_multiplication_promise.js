const args = process.argv.slice(2);
const num1 = parseFloat(args[0])
const num2 = parseFloat(args[1])

function multiplication(num1, num2)
{
    return new Promise( (resolve, reject) => {
        if(num1>0 && num2>0)
        {
            resolve(num1 * num2);
        }
        else
        {
            reject("Both the number must be positive");
        }
    } );
}

multiplication(num1, num2)
        .then( (result) =>{
            console.log(`Multiplication: ${num1} x ${num2} = ${result}`);
        } )
        .catch( (error) => {
            console.error(error);
        })