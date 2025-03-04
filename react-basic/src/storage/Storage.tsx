import React, { ChangeEvent, useState } from 'react'

// 브라우저 storage 
// - 변수등을 사용해서 프로그램에서 메모리로 데이터를 관리하는 것이 아니라 브라우저 저장 공간에서 관리하는 방법(반영구적)
// - storage: 브라우저(클라이언트)에 데이터를 저장하고 관리하는 방법 
//            요청과는 무관한 특성을 가지고 있음 
//            쿠키와 비교했을 때 저장할 수 있는 용량이 큼 
//            데이터를 key - value 형태로 저장
//            사용자가 삭제하지 않는한 영구적으로도 유지할 수 있음 
//   - local stotage : 브라우저를 닫아도 영구적으로 유지됨 
//   - session storage : 현재 세션이 유지(브라우저가 켜져있는)되는 동안 영구적으로 유지됨 
//   - indexedDB : 브라우저를 닫아도 영구적으로 유지됨 (많은 데이터를 저장하고자 할 떄 사용, JSON 형태)


// - cookie: 클라이언트(브라우저) 혹은 서버에 데이터를 저장하고자 할 떄 사용 
//           용량이 상대적으로 작음 (local storage: 5MB, cookie: 4KB)
//           요청으로 데이터를 다룰 수 있음 
//           만료 날짜를 지정할 수 있음 

// - session : 현재 작업중인 클라이언트의 정보를 서버에서 유지하기위해 사용하는 데이터 저장 방법 
//             서버에서만 데이터를 저장하는 방법 
//             매 요청마다 세션을 확인
//             브라우저를 닫거나 시간이 지나면 만료됨 
//             보안이 우수하지만 서버의 메모리를 사용하여 서버에 부담이 됨 
//             사용자의 로그인 정보를 유지하기 위해 많이 사용됨 
export default function Storage() {
    
    const [storageKey, setStorageKey] = useState<string>('');
    const [storageValue, setStorageValue] = useState<string>('');


    // local storage 사용방법
    // localStorage 내장 객체를 이용하여 local storage에 접근 가능 
    const onStorageKeyChange = (event:ChangeEvent<HTMLInputElement>) => {
        const { value } = event.target;
        setStorageKey(value.trimEnd()); // 마지막 공백 제거
        setStorageKey(value);
    };

    const onStorageValueChange = (event:ChangeEvent<HTMLInputElement>) => {
        const { value } = event.target;
        setStorageValue(value.trimEnd()); // 마지막 공백 제거
        setStorageValue(value);
    };

    const onStorageSave = () => {
        // 스토리지 데이터 저장하는 방법
        // localStorage.setItem(key, value);
        localStorage.setItem(storageKey.trimEnd(), storageValue.trimEnd());
    };
    
    const onGetStorageValue = () => {
        // 스토리지 데이터 불러오기 
        // localStorage.getItem(key);
        const value = localStorage.getItem(storageKey.trimEnd());
        setStorageValue(value ? value : '');
    };

    const onRemoveStorage = () => {
        // 스토리지 데이터 삭제하기 
        // localStorage.removeItem(key)
        localStorage.removeItem(storageKey.trimEnd());
        setStorageValue(''); // UI에서도 값 초기화
    };

    const onClearStorage = () => {
        // 스토리지 데이터 모두 삭제하기
        // localStorage.clear();
        localStorage.clear();
    };

    const onSessionStorageSave = () => {
        // 세션 스토리지에 작업을 하려면 sessionStorage 내장 객체 이용 
        sessionStorage.setItem(storageKey.trimEnd(), storageValue.trimEnd());
    };

    return (
        <div>
            스토리지 키: <input value={storageKey} onChange={onStorageKeyChange} />
            스토리지 값: <input value={storageValue} onChange={onStorageValueChange} />
            <button style={{ cursor: 'pointer' }} onClick={onStorageSave}>저장</button>
            <button style={{ cursor: 'pointer' }} onClick={onGetStorageValue}>검색</button>
            <button style={{ cursor: 'pointer' }} onClick={onRemoveStorage}>삭제</button>
            <button style={{ cursor: 'pointer' }} onClick={onClearStorage}>모두 삭제</button>
            <button style={{ cursor: 'pointer' }} onClick={onSessionStorageSave}>세션 스토리지로 저장</button>
        </div>
    )
}
