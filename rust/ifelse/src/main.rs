fn main() {
    let age: u32 = 25;

    if age >= 21 {
        println!("You can drive");
    } else if age >= 18 && age < 21 {
        println!("You can drive but be careful");
    } else {
        println!("You cannot drive");
    }

    // Ternary operator
    let number: i32 = 10;
    let res = if number > 20 { 500 } else { 600 }; // types need to be same in both if and else block
    println!("{}", res);
}
