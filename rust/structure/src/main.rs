struct BankAccount {
    owner: String,
    balance: f64
}

impl BankAccount {
    fn withdraw(&mut self, amount: f64) {
        println!("withdrawing {} from account owned by {}", amount, self.owner);
        self.balance -= amount;
    }

    fn check_balance(&self) {
        println!("Account owned by {} has a balance of {}", self.owner, self.balance);
    }
}

fn main() {
    let mut account = BankAccount{
        owner: String::from("Alice"),
        balance: 9595.57
    };

    account.check_balance();
    
    account.withdraw(50.89);

    account.check_balance();
}