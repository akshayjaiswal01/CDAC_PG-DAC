import React, { Component } from "react";

class TestError extends Component {
  constructor(props) {
    super(props);
    this.state = { throwError: false };
  }

  handleClick = () => {
    this.setState({ throwError: true });
  };

  render() {
    if (this.state.throwError) {
      throw new Error("Simulated crash!");
    }

    return <button onClick={this.handleClick}>Trigger Error</button>;
  }
}

export default TestError;
