import React from 'react';
import { ClassComponent, FunctionalComponent } from './component/Component';
import Component from './component/Component';
import './App.css';
import CurlyBraces from './component/CurlyBraces';


function App() {
  return (
    <div>
      {/* <ClassComponent/>
      <FunctionalComponent />
      <Component /> */}
      <CurlyBraces/>
    </div>
  );
}

export default App;