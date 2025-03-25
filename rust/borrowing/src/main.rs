fn main() {
    let mut m: i32 = 10;
    let n: &mut i32 = &mut m;

    *n = 50;

    println!("{}", n);
}