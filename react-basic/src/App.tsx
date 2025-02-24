import React from 'react';
import { ClassComponent, FunctionalComponent } from './component/Component';
import Component from './component/Component';
import './App.css';


function App() {
  return (
    <div>
      <ClassComponent/>
      <FunctionalComponent />
      <Component />
    </div>
  );
}

export default App;