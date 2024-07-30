function add(a: number, b: number): number {
    return a + b;
}

console.log(add(20,66));
//Another Type 1

var add1Demo: (x: number, y: number) => number;
add1Demo=(x,y)=>x+y;
console.log(add1Demo(66,66));




//Another Type 2
let add2Demo: (a: number, b: number) => number =
    function (x: number, y: number) {
        return x + y;
    };
console.log(add2Demo(50,60));



var add3Demo=(x: number, y: number):number => {
    return x+y;
 } ;
console.log(add1Demo(66,66));


