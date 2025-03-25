fn main() {
    // String vs string_slice

    // String -> Growable, &str -> Not growable
    // String -> Owned, &str -> Borrowed

    let mut val: String = String::from("Hello");
    val.push_str(" World");

    println!("{}", val);

    let val2: String = String::from("On a Trip");
    let sl2: &str = &val2;

    println!("{}", sl2);
}
