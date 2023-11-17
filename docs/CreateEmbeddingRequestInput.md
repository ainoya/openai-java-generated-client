

# Interface CreateEmbeddingRequestInput

Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`) and cannot be an empty string. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
## Implementing Classes

* List<Integer>
* List<List<Integer>>
* List<String>
* String


