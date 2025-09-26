import React from "react";

const Calculator = function({num1, num2, operation}){
    let result;

    switch(operation){
        case 'add':
            result = num1 + num2;
            break;
        
        case 'subtract':
            result = num1 - num2;
            break;

        case 'multiply':
            result = num1 * num2;
            break;

        case 'division':
            result = num1 / num2;
            break;

        default:
            result = 'Invalid Operation';
    }   

    return(
        <div>
            <h2>Calculator</h2>
            <h4>{`Operation: ${operation}`}</h4>
            <h4>{`num1 = ${num1} , num2 = ${num2}`}</h4>
            <h4>{`Result: ${result}`}</h4>
        </div>
    );



};

export default Calculator;