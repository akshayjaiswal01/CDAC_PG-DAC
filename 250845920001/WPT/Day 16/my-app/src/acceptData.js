import React, { Component } from 'react';

class AcceptData extends Component {
  render() {
    return (
      <div>
        <input type="text"
          onChange={(e) => this.props.onTextChange(e.target.value)}
          placeholder="Enter text"
        />
        <div>
          <label>
            <input type="radio"
              value="uppercase"
              name="format"
              onChange={(e) => this.props.onFormatChange(e.target.value)}
            />
            Uppercase
          </label>
          <label>
            <input type="radio"
              value="lowercase"
              name="format"
              onChange={(e) => this.props.onFormatChange(e.target.value)}
            />
            Lowercase
          </label>
          <label>
            <input type="radio"
              value="titlecase"
              name="format"
              onChange={(e) => this.props.onFormatChange(e.target.value)}
            />
            Title Case
          </label>
        </div>
      </div>
    );
  }
}

export default AcceptData;
