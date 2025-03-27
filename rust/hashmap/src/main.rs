use std::collections::HashMap;

fn main() {
    let mut x: HashMap<String, i32> = HashMap::new();

    x.insert(String::from("Hello"), 2);
    x.insert(String::from("Hi"), 5);

    println!("{:#?}", x);
    
    let str = String::from("Hi");
    let res= x.get(&str);

    match res {
        Some(val) => println!("{}", val),
        None => println!("Error in finding val")
    }

}
