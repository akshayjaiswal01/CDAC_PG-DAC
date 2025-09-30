import { useState,useEffect } from "react";

function Counter(){
    const [count, setCount] = useState(0)

    const addCounter = ()=>{
        setCount(count + 1);
    }

    const removeCounter = ()=>{
        setCount(count - 1);
    }

    const resetCounter = ()=>{
        setCount(0);
    }
      useEffect(() => {
    console.log(`Counter updated: ${count}`);
    }, [count]);
    return(
        <>
        <h2>Counter {count} </h2>
        <button onClick={addCounter}>Add Counter</button>
        <br/>
        <button onClick={removeCounter}>Remove Counter</button>
        <br/>
        <button onClick={resetCounter}>Reset Counter</button>
        </>
    )
}

export default Counter;