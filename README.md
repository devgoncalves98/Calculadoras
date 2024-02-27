Calculadora Lógica    
  Funcionalidade  
A calculadora lógica é uma aplicação simples em Java que permite aos usuários realizar operações lógicas entre dois operandos, representados pelos valores 0 e 1.  
- A aplicação suporta as seguintes operações lógicas:  
1.	OU (∨) – Disjunção: Retorna 1 se pelo menos um dos operandos for 1.
2.	E (∧) – Conjunção: Retorna 1 apenas se ambos os operandos forem 1.
3.	NÃO (~) – Negação: Inverte o valor do operando.
4.	Se-então (→) – Condicional: Retorna 1 apenas se o primeiro operando for 0 ou o segundo operando for 1.
5.	Se somente se (↔) – Bicondicional: Retorna 1 apenas se ambos os operandos tiverem o mesmo valor.    
- Instruções de Uso    
1.	Execute o programa.
2.	Insira o primeiro operando quando solicitado. Certifique-se de inserir apenas 0 ou 1.
3.	Insira o segundo operando quando solicitado. Novamente, insira apenas 0 ou 1.
4.	Escolha a operação desejada digitando o número correspondente:  
  o	1: OU (∨) – Disjunção  
  o	2: E (∧) – Conjunção  
  o	3: NÃO (~) – Negação  
  o	4: Se-então (→) – Condicional  
  o	5: Se somente se (↔) – Bicondicional  
5.	O resultado da operação será exibido.
6.	Se desejar realizar outra operação, digite 1 para continuar ou 0 para encerrar o programa.    
- Explicação das Operações Lógicas  
•	Disjunção (∨): Retorna 1 se pelo menos um dos operandos for 1. Utiliza o operador |.  
•	Conjunção (∧): Retorna 1 apenas se ambos os operandos forem 1. Utiliza o operador &.  
•	Negação (~): Inverte o valor do operando. Utiliza o operador ~ e & 1 para garantir que o resultado seja 0 ou 1.  
•	Condicional (→): Retorna 1 apenas se o primeiro operando for 0 ou o segundo operando for 1. Utiliza a operação condicional (~p & 1) | q.  
•	Bicondicional (↔): Retorna 1 apenas se ambos os operandos tiverem o mesmo valor. Utiliza duas chamadas da operação condicional para garantir que ambas as condições sejam satisfeitas.
