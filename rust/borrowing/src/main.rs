fn borrowing(s2: &String) {
    println!("Borrowing function: {}", s2);
}

fn main() {
    let s3: String = String::from("Hi");
    let s4: &String = &s3;
    println!("Function main: {}", s4);



    let s1: String = String::from("Hello World");
    borrowing(&s1);
    println!("Function main: {}", s1);

}
