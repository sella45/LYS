/*
    화살표 함수 : 
    - function 키워드 대신 화살표(=>)를 사용해서 함수를 생성하는 방법 (기본적으로 일회성, 익명 함수)
*/
const func1 = function (arg1, arg2) {
    return arg1 + arg2;
};

const func2 = (arg1, arg2) => {
    return arg1 + arg2;
};

/* 
    매개변수 지정 방법 
*/
let func;

// 1. 매개변수가 없는 경우 
func = () => { };

// 2. 매개변수가 하나인 경우, 매개변수 위치의 소괄호를 제거할 수 있음
func = (arg) => { };
func = arg => { };
;
// 3. 매개변수가 여러 개 일 경우, 매개변수 위치의 소괄호를 제거할 수 없음 
func = (arg1, arg2) => { };
// func = arg1, arg2 => { };   // 1. func = arg1; / 2. arg2 => {}; 한줄에 연결되어 있는 것



/*
    구현부 지정 방법
*/

// sigle line block
func = (arg) => {
    return arg * arg;           // 구현부가 1줄일 떄 
};

func = (arg) => {
    console.log(arg);
};

func = () => {
    return {
        name: '홀길동', 
        age: 30
    };
}

// 구현부가 구문 하나면 중괄호를 생략 가능, 만약 코드가 return 작업이라면 return키워드를 제거해야함.
func = (arg) => console.log(arg);
func = (arg) => arg * arg;


// 구현부가 구문 하나이면서 객체 리터럴을 반환할 때는 함수의 코드블럭을 제거했을 때 객체 리터럴을 소괄괄호로 묶어줘야 함 
func = () => ({
    name: '홀길동', 
    age: 30
});


/*
    화살표 함수의 호출 : 
    - 화살표 함수는 익명 함수로만 선언되기 떄문에 함수 표현식을 이용해서 변수에 저장하여 호출할 수 있음
    - 콜백 함수에서 많이 사용됨 
*/

const pow = x => x * x;

console.log(pow(10));

const numbers = [10, 9, 8, 7, 6, 5];
numbers.forEach(function (element, index){
    console.log(`index : ${index} / element : ${element}`);
});

numbers.forEach((element, index) => console.log(`index : ${index} / element : ${element}`));

const forEachFunc = (element, index) => console.log(`index : ${index} / element : ${element}`);

