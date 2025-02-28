use std::io;

fn main() {
    let mut str = String::new();

    println!("Enter string: ");

    io::stdin()
        .read_line(&mut str)
        .expect("Error in taking input");

    str = str.trim().to_string();

    println!("{}", get_string_length(&str));
}

fn get_string_length(str: &str) -> usize {
    // implicit return -> returns the last statement if it is without 'return' and ';'
    str.chars().count()
}
