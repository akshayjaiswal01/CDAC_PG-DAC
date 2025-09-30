import React, { useState } from 'react';
import axios from 'axios';

const GetData = () => {
  const [posts, setPosts] = useState([]);
  const [error, setError] = useState("");
  
  const fetchPosts = () => {
    
    axios.get("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        setPosts(response.data);
        setError("");
      })
      .catch((err) => {
        setError("Error: " + err.message);
        setPosts([]);
      })
  };

  return (
    <div>
      <h2>Posts Table</h2>
      <button onClick={fetchPosts}>Show Posts</button>

      {error && <p>{error}</p>}

      {posts.length > 0 && (
        <table border="1">

          <thead>
            <tr>
              <th>ID</th>
              <th>Title</th>
              
            </tr>
          </thead>

          <tbody>
            {posts.map((post) => (
              <tr key={post.id}>
                <td>{post.id}</td>
                <td>{post.title}</td>
                
              </tr>
            ))}
          </tbody>

        </table>
      )}
    </div>
  );
};

export default GetData;
