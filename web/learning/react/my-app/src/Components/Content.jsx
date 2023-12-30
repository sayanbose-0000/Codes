import { useState } from "react";
import Template from "./Template";

const Content = () => {
  const [show, setShow1] = useState(false);

  return (
    <>
      <h1>Artificial Intelligence</h1>

      <Template>
        <h3>Artificial Intelligence 1</h3>

        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Rerum eum a eligendi necessitatibus inventore quibusdam modi facilis eaque explicabo iure quia, dicta voluptates hic accusantium ipsa beatae dolores! Dolores porro accusantium in nisi cupiditate, consequuntur quibusdam nobis iste, minima quis suscipit sunt. Numquam, eum commodi eaque nemo minus delectus nostrum quis maiores, ullam architecto qui id, minima obcaecati dolorem deleniti quod doloribus! Ab quasi, id blanditiis iure iste laudantium rerum unde ducimus eligendi, adipisci dolorem dolores. Eos praesentium ea eius minima, exercitationem nesciunt eveniet doloremque voluptatum. Atque, ex animi! Cupiditate vero odio dolores, reprehenderit porro mollitia hic ex provident voluptates?</p>
      </Template>

      <Template>
        <h3>Artificial Intelligence 2</h3>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora qui eum blanditiis quae ipsam illum quibusdam voluptas quis quam. Quas aperiam modi vero ipsa. Aliquam corporis est magni magnam quo nulla similique facere dolor exercitationem, sapiente pariatur officiis dolorem voluptatum quia id, sed blanditiis harum a optio. Modi veritatis sed eveniet vitae quos odio, autem amet necessitatibus ullam dolore nihil ad quasi! Explicabo debitis deleniti ad, voluptate nisi magni, est sequi ducimus magnam eaque illo quas reprehenderit perspiciatis aliquid possimus natus nesciunt tempore voluptas aliquam? Exercitationem nostrum, aperiam magnam repellendus temporibus, voluptatum iusto dolorem velit ex recusandae accusantium, assumenda eos!</p>
      </Template>
    </>
  );
};

export default Content;