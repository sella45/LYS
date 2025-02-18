// 자바스크립트 : 객체를 생성하는 것이 매우 편리하다 

/*
    객체 : 키(key)와 값(value)로 구성된 속성들의 집합 
    - 함수를 가지는 객체
*/

/*
    객체 리터럴 : 자바스크립트에서 가장 일반적인 객체 생성 방법
    - {}를 사용하여 객체를 생성 
*/
var emptyObj = {};

var honfGingdong = {
    name: '홍길동',
    age: 26,
    address: '부산광역시',
    greeting : function () {
        console.log(`안녕하세요. ${this.name}입니다`);
    }
};
console.log(honfGingdong);
console.log(honfGingdong.name);
honfGingdong.greeting();

var name = '이방원';
var age = 18;
var ho = '태종';
// 객체 생성자
var taejong = {
    name,
    age , 
    ho
};
console.log(taejong);

console.log('==============================');
/*
    Object 생성자 : Object 클래스의 생성자로 빈 객체 생성 
*/
// 존재하면 변경, 존재하지 않으면 추가 
var emptyObject = new Object();
console.log(emptyObject);
emptyObject.name = '이재황';
console.log(emptyObject);
emptyObject.name = '이척';
console.log(emptyObject);


console.log('==============================');
/*
    생성자 함수 : 생성자 함수를 사용하여 클래스처럼 사용 가능 
*/
function King(name, start, end, ho) {
    this.name = name;
    this.start = start;
    this.end = end;
    this.ho = ho;
}
var saejo = new King('이유', 1455, 1468, '세조');
console.log(saejo); 

console.log('==============================');

/*
    속성 이름 (속성 키) : 
    - 일반적으로 문자열로 표기함 
    - 자바스크립트에서는 유효한 변수명일 경우 따옴표 생략 가능 
    - 유효한 변수명이 아니면 반드시 따옴표를 사용해야함 
*/



console.log('==============================');

/*
    속성 값 읽기 : 
    - 
    - 
    - 
    - 
*/



console.log('==============================');

/*
    속성 값 변경 :
    - 
*/



console.log('==============================');

/*
    속성 삭제 :
    - 
*/


console.log('==============================');

/*
    for-in 문 : 
    - 
    - 
*/



console.log('==============================');
