# BlockChain
- Distributed database
- No central authority
- Transparent
- Everyone can make payments
- No one can tamper with existing payments or reverse it (aka Censorship Resistant)
- Transactions Irreversible
- Blockchain is like a ledger that records this transactions
- Uses digital signatures to let people transact without having to fully trust each other

# Smart Contracts
- Computer programs that run on blockchain
- Instead of running the program on a cloud provider, we can run it in the blockchain itself
- Similar to APIs, but they are invoked by 'instructions' rather than requests, and instead of sending responses, they send it to the blockchain where anyone can read it
- In solana, smart contracts can store additional data known as Program Derived Addresses(PDAs)
- PDAs are made from a seed the programer gives

# Cryptography
- Everone has a key pair- A Private and a Public Key

## Public Key
- Shown to everyone
- Used as an address people can use to transact with others
- People can verify that we made the transaction using the public key

## Private Key
- Kept private
- Used to sign transactions which proves that we made them

# Process
- Alice wants to send Bob some SOL (currency in solana)
- Alice uses her private key to sign a tranaction
- Alice uses system program's transfer function to send SOL to Bob
- Alice uses memo program's memo function to write a note to Bob about the transaction
- Bob recieves a token in his address
- If somewhere trasaction fails, no SOL is send