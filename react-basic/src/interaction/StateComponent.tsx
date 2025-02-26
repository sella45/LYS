import React, { useState } from 'react'

// 상태(state):
// - 각 컴포넌트가 독립적으로 가지고 있는 데이터 기억 공간 
// - 상태는 컴포넌트가 렌더링되는 기준이 됨
// - 상태가 변경되면 컴포넌트는 리렌더링 됨 

export default function StateComponent() {

    let letCount: number = 0;
    // state 선언 방법 
    // - useState hook 함수로 상태를 선언 , hook함수를 쓰면 use를 앞에 쓴다 (컴포넌트 생명주기와 관련이 있음)
    // const [상태변수, 상태변경함수] = useState<상태변수타입> (초기값);
    const [count, setCount] = useState<number>(0);
    let[num, setNumber] = useState<number>(0);

    const onClickHandler = () => {
        letCount++;
        console.log(letCount);
        setCount(count + 1);
        console.log(count);

        // 상태변수는 반드시 상태변경함수를 이용해서 변경해야 변경값이 적용됨.
        // 직접 바꾸게되면 일반 변수와 동일한 취급을 함 
        num++;
        console.log(num);
        console.log('------------');
    }


    return (
        <div>
            <h2>일반변수 : {letCount}</h2>
            <h2>상태변수 : {count}</h2>
            <h2>let 상태변수: {count} </h2>
            <button onClick={onClickHandler}>증가</button>
        </div>
    )
}
