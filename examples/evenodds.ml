# Load the vector with user input.
load("Entre com o tamanho do vetor: ") : s;
0 : i;
array.apply(n -> i + 1 : i; load("Valor " . i . ": ") : n;);
# Count the odds and even.
0 : par, impar;
array.each(n -> if n % 2 == 0 {

# Print the result.