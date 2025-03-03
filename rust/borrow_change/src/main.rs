fn borrow_change(s2: &mut String) {
    s2.push_str(" Hi");
    println!("{}", s2);
}

fn main() {
    let mut s1: String = String::from("Hello World");
    borrow_change(&mut s1);
}
