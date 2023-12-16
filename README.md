Lista 04 - Exercícios Lógica de Programação Java Ada + B3
Conteúdos: Array, ArrayList, Map.

1. Dado duas arrays A e B, escreva uma função que faça a concatenação das arrays de forma alternada. Obs: Ambas as arrays sempre serão do mesmo tamanho e não nulas.
Exemplo 01:
A: [1, 2, 3, 4]
B: [5, 6, 7, 8]
Output: [1, 5, 2, 6, 3, 7, 4, 8]
Exemplo 02:
A: [1, 3, 5, 7]
B: [2, 4, 6, 8]
Output: [1, 2, 3, 4, 5, 6, 7, 8]
2. Dado uma array turma onde cada um dos seus elementos é uma array com as notas de cada um dos alunos, calcule e mostre a média de cada aluno e a média da turma.
Exemplo:
Turma:
[
[9, 8, 7, 8],
[10, 9, 8, 9],
[9, 8, 7, 8]
]
Output:
Aluno 0 - Média 8,
Aluno 1 - Média 9,
Aluno 2 - Média 8
Média da turma: 8,33
3. (leetcode) Dado um array nums. Definimos uma soma acumulada de um array como nums[i] = soma(nums[0]…nums[i]), ou seja, cada elemento deve ser a soma de todos os elementos anteriores e o atual. Por fim,
retorne a array com as somas.
Exemplo 01:
nums = [1,2,3,4]
Output: [1,3,6,10]
Explicação: A soma acumulada é obtida da seguinte forma: [1, 1+2, 1+2+3, 1+2+3+4].
Exemplo 02:
nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explicação: A soma acumulada é obtida da seguinte forma: [1,
1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]
