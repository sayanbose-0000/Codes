import { Schema, model } from "mongoose";

const PostSchema = new Schema({
  title: {
    type: String,
    required: true,
  },
  summary: {
    type: String,
    required: true,
  },
  content: {
    type: String,
    required: true,
  },
  image: {
    type: String, // since we will just include path, which is a string
    required: true,
  },
  author: {
    type: Schema.Types.ObjectId,
    ref: 'User'
  }

},
  {
    timestamps: true  // use it in options
  }
)

const postModel = model('post', PostSchema);

export default postModel;