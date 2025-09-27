import React, { useState } from 'react';
import Graduate from './graduate';
import PostGraduate from './postGraduate';
import UnderGraduate from './underGraduate';

function UserForm() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [education, setEducation] = useState('');

  return (
    <div>
      <h2>User Details</h2>

      <input
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      /><br />

      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      /><br />

      <select value={education} onChange={(e) => setEducation(e.target.value)}>
        <option value="">Select Education</option>
        <option value="Graduate">Graduate</option>
        <option value="PG">PG</option>
        <option value="UnderGrad">UnderGrad</option>
      </select>

      {education === 'Graduate' && <Graduate />}
      {education === 'PG' && <PostGraduate />}
      {education === 'UnderGrad' && <UnderGraduate />}
    </div>
  );
}

export default UserForm;
