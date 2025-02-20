const person={
    firstname:"John",
    lastname:"Doe",
    email:"john@gmail.com",
    age:45,
    address:{
        street:"XYZ",
        city:"NewYork",
        zipcode:"678954",
        country:"US"
    },
    greeting:function(){
        console.log('Welcome $(this.firstName} $(this.lastName}')
    }
}
console.log("Address",person.address);
person.greeting()
console.log(person['email']);
for(let key in person){
    console.log(person[key]);
}