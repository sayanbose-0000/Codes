fn main() {
    let s1 = String::from("Hello");
    let s2 = &s1;
    let s3 = &s2;

    println!("{} {} {}", s1, s2, s3);


    let mut z1 = String::from("Hello World");
    let z2 = &mut z1;
    // let z3 = &z2; // This would cause a compile-time error because z1 is borrowed mutably by z2
    // let z3 = &mut z2; // This is not possible because z2 is already a mutable reference

    

    println!("{}", z2);
    println!("{}", z1);
    println!("{}", z3);
}