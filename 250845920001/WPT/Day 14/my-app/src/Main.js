
import React from 'react';

// Component 1: Car
export function Car() {
  return <h2>I am a Car!</h2>;
}

// Component 2: Garage
export function Garage() {
  return (
    <>
      <h1>Who lives in my Garage?</h1>
      <Car />
      <Car />
    </>
  );
}
