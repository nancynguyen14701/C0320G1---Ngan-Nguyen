// practice 1
// function main() {
//     var x = 5;
//     console.log(x);
//     var x = 10;
//     console.log(x);
//     let y = 53;
//     console.log(y);
//   }
//   main();
//practice 2
// let count: number = 50;
// if(count>0){
//     count--;
// } else{
//     count = 0;
// }
// console.log(count);
// console.log("loop");
// const keys="abkdf";
// for(let idx=0; idx<keys.length; ++idx){
//     console.log(keys[idx]);    
// }
// console.log("while loop");
// let idx =0;
// while(idx<keys.length){
//     console.log(keys[idx]);
//     ++idx;
// }
// console.log("do-while loop");
// idx =0;
// do{
//     console.log(keys[idx]);
//     ++idx;
// }while(idx<keys.length);
// console.log("for-of loop");
// for(const item of keys){
//     console.log(item);
// }
// console.log("for-in loop");
// const user={
//     name: 'nancy',
//     age: 55
// };
// for (const key in user){
//     console.log(`${key}: ${user[key]}`);
// }
//practice 3
// const list: number[]=[1,2,3];
// const categories: Array<string>=['sport','blabl','car'];
// console.log(list);
// list.forEach(function(abc){
//     console.log(abc);
// })
// console.log('categories');
// categories.forEach((index)=>{
//     console.log(index);
// });
// const listSquare = list.map(num => num*num)
// console.log(listSquare);
// const result = categories.filter(str => str.length > 2)
// console.log(result);
function square(num) {
    return num * num;
}
console.log(square(5));
// Output: 25
// Function expression
let squareFE = function (num) {
    return num * num;
};
console.log(squareFE);
// Higher-order function
function add(a) {
    return function (b) {
        return a + b;
    };
}
const addWith5 = add(5);
console.log(addWith5(3));
console.log(addWith5(15));
