import axios from 'axios'
import React from 'react'

// axios 패키지 : 
// - JavaScirpt에서 사용하는 HTTP 클라이언트 라이브러리
// - Node.js 환경과 브라으저 환경에서 모두 동작 
// - Fetch API, AJAX 보다 간편함 
// - axios는 기본적으로 비동기 처리를 수행함 

// npm install axios
export default function Axios() {

    // axios 객체
    // - http method에 해당하는 메서드를 포함하고 있음 
    // - 각각의 http method 메서드는 매개변수로 URL, requestBody, option을 받을 수 있음
    // - get, delete : URL, option[선택]
    // - post, patch, put: URL, requestBody[산택], option[선택]

    const onBasicGet = () => {
        axios.get('http://127.0.0.1:8080/basic')
            .then((response) => {
                console.log(response.data)
            })
    }

  return (
    <div>
        <button onClick={onBasicGet}>Basic Get 요청 보내기</button>
    </div>
  )
}
