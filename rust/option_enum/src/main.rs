// Option enum helps us return null value

fn main() {
    let res = find_first_a(String::from("rh"));

    match res {
        Some(val) => println!("{}", val),
        None => println!("Not Found!"),
    };
}

fn find_first_a(s: String) -> Option<usize> {
    // If value returned MAY be a null, 'options' are better to use than using -1
    for (idx, val) in s.chars().enumerate() {
        if val == 'a' {
           return Some(idx); // In Rust, Some is used with Option<T> to represent a value that might be missing.
        }
    }

    None
}
