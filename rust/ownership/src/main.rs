// Stack contains variable, that may point to a dynamic variable in heap
// Ownership-  The variable in stack owns the data in heap, if the variable in  stack goes out of scope, the heap is cleaned automatically

// So say let s = String::from("Hello"); -> Here 's' variable is stored in stack and the actual string is stored in heap. When 's' goes out of scope in 
// stack, the corresponding string in heap is auto deleted, as 's' is the owner and owner goes out of scope

fn create_string() -> String {
    let str = String::from("Hello"); // "Hello" stored in heap, str variable stored in stack and points to heap where "Hello is stored", str is owner
    return str; // str goes out of scope, as str is owner of "Hello", "Hello" also gets dropped from memory
}

fn main() {
    println!("{:?}", create_string());
}