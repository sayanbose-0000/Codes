fn main() {
    let v1: Vec<i32> = vec![14, 32, 21, 15, 51]; // Vector with some initial values
    // let val_zeroth = v1[0];              // not recommened as we donot want to take ownership
    let val_zeroth = &v1[0];
    println!("{}", val_zeroth);
    
    let mut v2: Vec<i32> = Vec::new(); // Empty vector initialize
    v2.push(1);
    v2.push(2);
    v2.push(3);
    v2.push(4);
    v2.push(5);
    
    let res= v2.get(88); // we can error handle with arr.get(0) which we cant do with arr[0]
    match res {
        Some(val) => println!("{}",val),
        None => println!("No such element")
    }
}
