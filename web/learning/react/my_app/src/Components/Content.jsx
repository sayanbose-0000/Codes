import List from "./List";

const Content = (props) => {
  return (
    <>
      <ul>
        <List title={"Potato"} bought={false} />
        <List title={"Tomato"} bought={true} />
        <List title={"Cauliflower"} bought={false} />
        <List title={"Pizza"} bought={true} />
      </ul>
    </>
  );
};
export default Content;