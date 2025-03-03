// MOVING AND CLONING IS GENERALLY BAD CODE

fn print_string(c2: String) {
    println!("{}", c2);
}

fn main() {
    let a1 = String::from("Hello");
    let a2 = a1; // now s2 becomes the owner of s1, s1 is no longer a valid thing, and using it will give error
    println!("{}", a2);

    let b1 = String::from("Hello World");
    let b2 = b1.clone(); // clones b1 to b2. Now in heap, there is are 2 values of "Hello World" owned by 2 variables, independently
    println!("{} and {}", b1, b2);

    let c1 = String::from("Hi");
    print_string(c1); // ownership moved to c2, c1 no longer valid
    // println!("{}", c1); // c1 gives error
}
