import { createRoot  } from "react-dom/client";


const calculateFactorial = function(num){
    let fact = 1;
    for(let i=1; i<=num; i++){
        fact = fact * i;
    }
    return fact;
};


const Factorial = function({num}){
    const factorial = calculateFactorial(num);

    return (
            <h2>Factorial of {num}: {factorial}</h2>
    );
}

export default Factorial;