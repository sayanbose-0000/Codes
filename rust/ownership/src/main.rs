// THREE IMPORTANT RULES OF OWNERSHIP SHOWN

fn main() {
    // RULE 1: EACH VALUE IN RUST HAS ITS OWN OWNER
    let s1: String = String::from("Hello"); // s1 owner of string "Hello"
    let len: usize = calculate_size(&s1); // Just a reference is passed, s1 is still the owner
    println!("s1: {}, len s1: {} ", s1, len);

    // RULE 2: THERE CAN ONLY BE ONE OWNER AT A TIME
    let s2: String = s1;
    // println!("{}", s1); // causes error since s1 no longer has ownership over the string
    println!("{}", s2);

    // RULE 3: WHEN OWNER GOES OUT OF SCOPE, VALUE IS DROPPED
    {
        let s3: String = String::from("Hi");
        println!("{}", s3);
    }
    // println!("{}", s3); // cannot be accessed here
}

fn calculate_size(s: &str) -> usize {
    s.len()
}
