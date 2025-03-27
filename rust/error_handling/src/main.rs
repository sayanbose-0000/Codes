// Two ways: Option and Result

// definition of Option
// enum Option<T> { // T is some datatype say i32 or f64
//     Some(T), // Represents a value
//     None,    // Represents no value
// }

// definition of Result
// enum Result<T, E> {
//     Ok(T),  // Represents value
//     Err(E), // Represents Error
// }

fn divide_option(num: f64, den: f64) -> Option<f64> {
    if den == 0.0 {
        return None;
    } else {
        return Some(num / den);
    }
}

fn divide_result(num: f64, den: f64) -> Result<f64, String> {
    if den == 0.0 {
        return Err(String::from("Cannot div by 0 :("));
    } else {
        return Ok(num / den);
    }
}

fn main() {
    let res = divide_option(10.55, 0.00);
    match res {
        Some(val) => println!("{}", val),
        None => println!("Can't divide by 0 :)"),
    }

    let res = divide_result(10.55, 0.00);
    match res {
        Ok(val) => println!("{}", val),
        Err(val) => println!("{}", val),
    }
}
