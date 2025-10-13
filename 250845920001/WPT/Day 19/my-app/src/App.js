import PasswordGenerator from "./passwordGenerator";
import ErrorBoundary from "./ErrorBoundry";
import TestError from "./TestError";
import Counter from "./Counter";

function App()
{
  return(
    <>
    <PasswordGenerator></PasswordGenerator>

    <h2>React Error Boundary Demo</h2>
      <ErrorBoundary>
        <TestError />
      </ErrorBoundary>


      <Counter></Counter>
    </>
  )
}

export default App;