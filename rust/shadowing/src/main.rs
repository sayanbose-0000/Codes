// Process in which a variable can be declared multiple types and the 2nd one overshadows the first one. For scope shadowing, the new variable has
// scope in the block only, after that it reverts back to original value

// 'Not' same as mut

// Shadowing can change types too, normal 'mut' cannot

fn main() {
    let x: i32 = 10;
    println!("{}", x);

    {
        let x: i32 = 50; // shadowing
        println!("{}", x);
    }

    println!("{}", x);

    let x: i32 = 20; // shadowing
    println!("{}", x);

    // IMPORTANT!!!!!!!!!!!! -> SHADOWING CAN CHANGE DATATYPES, THIS CANNOT BE DONE USING SIMPLE MUT
    let s: String = String::from("Hello");
    let s: usize = s.len(); // very useful in these situations where giving var names a thousand times can be avoidable

    println!("{}", s);
}
