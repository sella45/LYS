import React from 'react';
import Component, { ClassComponent, FunctionalComponent } from './component/Component'
import './App.css';
import CurlyBraces from './component/CurlyBraces';
import Properties from './component-manage/Properties';
import Gallery from './component-manage/example/Exmaple1';
import Profile from './component-manage/example/Example2';
import ConditionRender from './component-manage/ConditionRender';
import ListRender from './component-manage/ListRender';
import EventComponent from './interaction/EventComponent';
import StateComponent from './interaction/StateComponent';
import ForwardingComponent from './interaction/ForwardingComponent';
import HookComponent1 from './hook/HookComponent1';
import HookComponent2 from './hook/HookComponent2';
import CustomHookComponent from './hook/CustomHookComponent';
import { Route, Routes } from 'react-router';

// react-router 패키지 : 
// - React의 SP(Single Page Application)에서 라ㅇ팅을 구현하기 위한 라이브러리 
// - 웹 페이지에서 다양한 경로에 따른 뷰를 관리할 수 있도록 도움을 줌 
// - 웹 앱플리케이션 내에서 URL 이동이 있을 떄 서버에 요청을 새로 보내지 않음 
// - 웹 애플리케이션에서 네비게이션 역할을 수행함 

// npm i react-router

// root 경로에 있는 index.tsx의 root.render()안의 <App /> 컴포넌트를 <BrowserRouter> 컴포넌트로 감싸야함 
// <BrowserRouter> : URL을 사용해서 브라우저 주소 표지줄에 현재 위치를 저장하고 탐색할 수 있도록 하는 컴포넌트 

// <Routes> : <Route> 컴포넌트로 URL에 따른 컴포넌트를 렌더링 할 수 있도록 하는 컴포넌트 
// <Route> : URL 패턴에 따라서 렌더링하고자 하는 컴포넌트를 지정하는 컴포넌트 
// - Path 속성 : URL 패턴 지정 
// - element 속성 : 렌더링할 컴포넌트를 지정 
// - index 속성 : 현재 경로의 기본 라우터로 지정 
function App() {
  return (
      <Routes>
        <Route index element={<h1>기본 페이지</h1>} />
        <Route path={'/class'} element={<ClassComponent />} />
        <Route path={'/function'} element= {<FunctionalComponent />} />

        <Route path={'/interaction'}>
          <Route index element={<StateComponent />} />
          <Route path={'event-component'} element={<EventComponent />} />
          <Route path={'ForwardingComponent'} element={<ForwardingComponent />} />

        </Route>


      </Routes>
  );
}

export default App;