struct BankAccount {
    owner: String,
    balance: f64
}

impl BankAccount {
    fn withdraw(&mut self, amount: f64) {
        println!("withdrawing {} from account owned by {}", amount, self.owner);
    }
}

fn main() {
    println!("Hello, world!");
}