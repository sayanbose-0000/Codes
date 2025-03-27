// Types of loops- loop, while, for
fn main() {
    let mut counter: i32 = 0;

    // runs infinitely until stopped with break
    let res: i32 = loop {
        counter += 1;

        if counter == 10 {
            break counter * 100; // the thing given after break gets 'returned'
        }
    };

    println!("{}", res);

    let mut val2: i32 = 1;

    let res2: i32 = 'outer: loop {
        val2 += 1;

        if val2 == 10 {
            break 'outer val2;
        }
    };

    println!("Res2: {:?}", res2);

    // let mut _val3: i32 = 0;

    // let res3: i32 = 'outer: loop {
    //     // _val3 = 1;

    //     let x: i32 = 'inner: loop {
    //         _val3 += 1;
    //         if _val3 >= 10 {
    //             break 'inner _val3;
    //         }
    //     };

    //     println!("{}", x);

    //     _val3 *= 2;

    //     if _val3 == 40 {
    //         break 'outer _val3;
    //     }

    // };

    // println!("res3: {:?}", res3);

    let mut i: i32 = 0;
    while i < 10 {
        println!("Hi");
        i += 2;
    }

    println!();

    for i in 1..10 {
        print!("{} ", i)
    }

    println!();
    println!();
    
    for i in (1..10).step_by(2) {
        print!("{} ", i)
    }
    
    println!();
    println!();

    let arr: [i32; 5] = [95, 8415, 263, 49, 95]; // [data_type; size_of_arr]
    for i in arr {
        print!("{} ", i);
    }
}
