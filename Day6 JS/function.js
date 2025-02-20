console.log(greeting('john doe'));
function greeting(name){
    return 'Welcome '+name;
}
function print(){
    console.log('HEllo World');
}

function cube(n){
    return n*n*n;
}
//function Expression
const data=function(){
    console.log('Data fetched successfully');
}
print();
const result=greeting('Sonam soni');  //store result in variable
console.log(result);
console.log('Cube of 5',cube(5)); //call function directly in console
