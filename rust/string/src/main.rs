fn main() {
    let s1 = String::from("Hello");
    let s2 = String::from(" World!");

    let s3 = s1 + &s2; // s3 owns s1's value now but borrows s2's value
    println!("{}", s3);

    // println!("{}", s1); // not allowed
    println!("{}", s2); // allowed
}
