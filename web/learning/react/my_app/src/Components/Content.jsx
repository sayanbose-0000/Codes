import React from "react";
import './Styles/style.css';

const Content = () => { // always use react hooks at top level of returning function (Component function)

    const [name, setName] = React.useState("World"); // "Sayan" is the default state when page loads

    const [items, setItems] = React.useState(
        [
            {
                id: 1,
                checked: false,
                item: "Potato",
            },
            {
                id: 2,
                checked: false,
                item: "Tomato",
            },
            {
                id: 3,
                checked: false,
                item: "Cauliflower",
            },
        ]
    )

    const handleChecked = (id) => {
        const listItems = items.map((item) => item.id === id ? { ...item, checked: !item.checked } : item);
        setItems(listItems);
    };

    const handleDelete = (id) => {
        const listItems = items.filter((item) => item.id !== id);
        setItems(listItems);
    };


    let handleNameChange = () => {
        let myNames = ["Emma", "Liam", "Olivia", "Noah", "Ava", "Sophia", "Isabella", "Jackson", "Lucas", "Logan", "Mia", "Ethan", "Harper", "Aiden", "Amelia", "Ella", "Camila", "Gianna", "Abigail", "Luna", "Evelyn", "Mason", "David", "Oliver", "Alexander", "Penelope", "Victoria", "Grace", "Avery", "Scarlett", "Chloe", "Riley", "Sofia", "Benjamin", "Lily", "Liam", "Nora", "Zoey", "Hazel", "Lucy", "Stella", "Aria", "Ellie", "Lillian", "Nathan", "Leo", "Natalie", "Levi", "Elijah", "Claire", "Anna", "Willow", "Maya", "Isla", "Aaliyah", "Daniel", "Max", "Emilia", "Owen", "Aurora", "Isaac", "Layla", "Ezra", "Xander", "Lyla", "Madison", "Ryder", "Nova", "Hudson", "Bella", "Savannah", "Peyton", "Zoe", "Nevaeh", "Elliot", "Autumn", "Eva", "Leo", "Isaac", "Caleb", "Nova", "Eliana", "Hannah", "Elena", "Leah", "Lucas", "Penelope", "Stella", "Zoe", "Scarlett", "Mateo", "Chloe", "Mila", "Joseph", "Violet", "Liam", "Zara", "Amelia", "Lily", "Layla", "Olivia", "Emma", "Ava", "Sophia", "Jackson", "Lucas", "Logan", "Benjamin", "Mason", "Elijah", "Oliver", "Daniel", "David", "Emma", "Liam", "Olivia", "Noah", "Ava", "Sophia", "Isabella", "Jackson", "Lucas", "Logan", "Mia", "Ethan", "Harper", "Aiden", "Amelia", "Ella", "Camila", "Gianna", "Abigail", "Luna", "Evelyn", "Mason", "David", "Oliver", "Alexander", "Penelope", "Victoria", "Grace", "Avery", "Scarlett", "Chloe", "Riley", "Sofia", "Benjamin", "Lily", "Liam", "Nora", "Zoey", "Hazel", "Lucy", "Stella", "Aria", "Ellie", "Lillian", "Nathan", "Leo", "Natalie", "Levi", "Elijah", "Claire", "Anna", "Willow", "Maya", "Isla", "Aaliyah", "Daniel", "Max", "Emilia", "Owen", "Aurora", "Isaac", "Layla", "Ezra", "Xander", "Lyla", "Madison", "Ryder", "Nova", "Hudson", "Bella", "Savannah", "Peyton", "Zoe", "Nevaeh", "Elliot", "Autumn", "Eva", "Leo", "Isaac", "Caleb", "Nova", "Eliana", "Hannah", "Elena", "Leah", "Lucas", "Penelope", "Stella", "Zoe", "Scarlett", "Mateo", "Chloe", "Mila", "Joseph", "Violet", "Liam", "Zara", "Amelia", "Lily", "Layla", "Olivia", "Emma", "Ava", "Sophia", "Jackson", "Lucas", "Logan", "Benjamin", "Mason", "Elijah", "Oliver", "Daniel", "David", "Emma", "Liam", "Olivia", "Noah", "Ava", "Sophia", "Isabella", "Jackson", "Lucas", "Logan", "Mia", "Ethan", "Harper", "Aiden", "Amelia", "Ella", "Camila", "Gianna", "Abigail", "Luna", "Evelyn", "Mason", "David", "Oliver", "Alexander", "Penelope", "Victoria", "Grace", "Avery", "Scarlett", "Chloe", "Riley", "Sofia", "Benjamin", "Lily", "Liam", "Nora", "Zoey", "Hazel", "Lucy", "Stella", "Aria", "Ellie", "Lillian", "Nathan", "Leo", "Natalie", "Levi", "Elijah", "Claire", "Anna", "Willow", "Maya", "Isla", "Aaliyah", "Daniel", "Max", "Emilia", "Owen", "Aurora", "Isaac", "Layla", "Ezra", "Xander", "Lyla", "Madison", "Ryder", "Nova", "Hudson", "Bella", "Savannah", "Peyton", "Zoe", "Nevaeh", "Elliot", "Autumn", "Eva", "Leo", "Isaac", "Caleb", "Nova", "Eliana", "Hannah", "Elena", "Leah", "Lucas", "Penelope", "Stella", "Zoe", "Scarlett", "Mateo", "Chloe", "Mila", "Joseph", "Violet", "Liam", "Zara", "Amelia", "Lily", "Layla", "Olivia", "Emma", "Ava", "Sophia", "Jackson", "Lucas", "Logan", "Benjamin", "Mason", "Elijah", "Oliver", "Daniel", "David"];
        let randomIdx = Math.floor(Math.random() * myNames.length);
        setName(myNames[randomIdx]);
    }

    return (
        <main className="Content">
            <ul>
                {items.map((item) => (
                    <li className="item" key={item.id}>
                        <input type="checkbox" checked={item.checked} onChange={() => { handleChecked(item.id) }} />
                        <label htmlFor="" style={item.checked ? { textDecoration: 'line-through' } : null}> {item.item} </label>
                        <button onClick={() => { handleDelete(item.id) }}>Del</button>
                    </li>
                ))}
            </ul>

            <p className="paragraph">
                Hello {name}
                <button onClick={handleNameChange}>Change Name</button>
            </p>
        </main>
    );
};

export default Content;