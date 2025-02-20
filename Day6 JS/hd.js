const array=[1,2,3,4,5,6,7,8,9,10];
// I Want to create new array by multiplying all elements using 3

//const resultArray=[];
//for(let num of array){
  //  resultArray.push(num*3);

//}
//console.log(resultArray)
const newArray=array.map((num)=>num*3);
console.log(newArray);
const evenarray=array.filter((num)=>num%2==0);
console.log(evenarray);
//if first match found it will return that number if no match found it will return undefined
const found=array.find((num)=>num===90)
console.log(found?'found'+found:'not found');
const foundindex=array.findIndex((num)=>num===9);
console.log(foundindex?'found'+foundindex:'not found');