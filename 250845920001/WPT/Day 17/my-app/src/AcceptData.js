import { useState } from "react";

function TextList() {
  const [inputValue, setInputValue] = useState("");
  const [listItems, setListItems] = useState([]);

  const handleBlur = () => {
    if (inputValue.trim() !== "") {
      setListItems(prev => [...prev, inputValue.trim()]);
      setInputValue(""); 
    }
  };

  return (
    <>
      <h2>Enter Item</h2>
      <input
        type="text" value={inputValue} onChange={e => setInputValue(e.target.value)}
        onBlur={handleBlur}
        placeholder="Type something"
      />

      <h3>Your List</h3>
      {listItems.length > 0 ? (
        <ol>
          {listItems.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ol>
      ) : (
        <p>No items yet.</p>
      )}
    </>
  );
}

export default TextList;
