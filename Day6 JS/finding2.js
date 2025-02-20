const array = [1, 2, 3, 2, 4, 5, 2, 6, 7, 2, 8, 2];
//const count = array.filter(num => num === 2).length;
//console.log(count);
array.forEach(num=>console.log(num));
result=[35,67,89,65,94];
console.log(result.every(num=>num>=35)); //this for all
console.log(result.every(num=>num>=90)); // this for any

console.log([[1,2],2,[3,4,5]].flat())

console.log(array.includes(5));//check elements exists or not

console.log("Sonam soni".indexOf('s'));
console.log("Sonam soni".lastIndexOf('s'));

const myarray=[10,20,30,40,50];
console.log(myarray.slice(2));
console.log(myarray.slice(2,4));

//lets insert new element in between
//60 between 30 and 40
myarray.splice(3,0,60,70); //start index,delete count,no of elements
console.log(myarray);
//delete 60
myarray.splice(3,1);
console.log('after delete',myarray)
//replace 70 by 35
myarray.splice(43,1,35);
console.log('after replace',myarray)
