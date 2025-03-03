fn returning_ownership(s2: String) -> String{
    println!("Inside Function: {}", s2);
    s2
}

fn main() {
    let mut s1 = String::from("Hello World");
    s1 = returning_ownership(s1);
    println!("Main Function: {}", s1);
}