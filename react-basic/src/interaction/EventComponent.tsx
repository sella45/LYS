import React, { ChangeEvent, KeyboardEvent, MouseEvent } from 'react';

// 이벤트 처리:
// - 웹 페이지(컴포넌트)가 사용자와의 상호작용을 받아드려 그것에 대해 처리하는 것
// - React에서는 addEventListener 함수를 사용하지 않고 인라인 방식을 사용
// - 인라인에 이벤트 핸들러 속성은 전부 lowerCamelCase를 따름
// - 이벤트 핸들러에는 콜백 함수를 전달

export default function EventComponent() {

    // onClick: 클릭이 발생했을 때
    // onKeyDown: 키보드를 눌렀을 때
    // onChange: 요소의 값을 변경했을 때
    const onClickHandler = (event: MouseEvent<HTMLButtonElement>) => {
    alert('클릭!');
};

    const onKeyDownHandler = (event: KeyboardEvent<HTMLInputElement>) => {
    const { key } = event;
    alert(`누른 키 : ${key}`);
};

  // onChange는 HTML에서는 oninput + onchange를 합해 놓은것
    const onChangeHandler = (event: ChangeEvent<HTMLInputElement>) => {
    const { value } = event.target;
    alert(`입력한 내용 : ${value}`);
};

    return (
    <div>
        <button onClick={onClickHandler}>클릭</button>
        <input placeholder='키보드' onKeyDown={onKeyDownHandler}/>
        <input placeholder='변경' onChange={onChangeHandler}/>
    </div>
    )
}