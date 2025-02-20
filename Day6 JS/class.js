class Account{
    constructor(accno,holderName,balance){
        this.accNo=accno;
        this.holderName=holderName;
        this.balance=balance;
    }
    getBalance(){
        return this.balance;

    }
    deposit(amount){
        this.balance+=amount;
        console.log(`${amount} is credited to the account No ******${this.accNo.slice(5)} Availabel Balance ${this.balance}`)

    }
    withdraw(amount){
        if(this.balance > amount){
            this.balance-=amount;
            console.log(`${amount} is debited to the account No *****${this.accNo.slice(5)}Availabel Balance ${this.balance}`)
        }
        else{
            console.log('No sufficient Balance availabel')
        }
    }
}

const acc1=new Account('14276754','Sonam soni',98000);
acc1.deposit(10000);
acc1.withdraw(80000);