//Assign - 2

// import React, { useState } from 'react';
// import Lifecycle from './lifecycle';

// function App() {

// 
//   const [show, setShow] = useState(true);

//   return (
//     <div className="App">
//       <button onClick={() => setShow(!show)}>
//         Toggle Component
//       </button>
//       {show && <Lifecycle />}
//     </div>
//   );

// }

// export default App;





// // Assignment - 3

// import React, { Component } from 'react';
// import AcceptData from './acceptData';

// class App extends Component {
//   state = {
//     text: '',
//     format: '',
//   };

//   handleTextChange = (text) => {
//     this.setState({ text });
//   };

//   handleFormatChange = (format) => {
//     this.setState({ format });
//   };

//   formatText = () => {
//     const { text, format } = this.state;
//     if (format === 'uppercase') return text.toUpperCase();
//     if (format === 'lowercase') return text.toLowerCase();
//     if (format === 'titlecase')
//       return text
//         .toLowerCase()
//         .split(' ')
//         .map((word) => word.charAt(0).toUpperCase() + word.slice(1))
//         .join(' ');
//     return text;
//   };

//   render() {
//     return (
//       <div>
//         <AcceptData
//           onTextChange={this.handleTextChange}
//           onFormatChange={this.handleFormatChange}
//         />
//         <p>Output: {this.formatText()}</p>
//       </div>
//     );
//   }
// }

// export default App;




// Assigmnment = 4
import React from 'react';
import UserForm from './userForm'; 

function App() {
  return (
    <div>
      <UserForm />
    </div>
  );
}

export default App;
