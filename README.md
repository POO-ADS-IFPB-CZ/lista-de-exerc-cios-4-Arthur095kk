[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

1.a) Verdadeiro. A subclasse precisa criar seus próprios construtores, e se quiser, pode chamar o construtor da superclasse usando super().
b) Falso. "Tem um" não é feito com herança, a herança é usada para "é um"
c) Falso. Quando usamos a mesma assinatura para redefinir um método da superclasse, isso é sobrescrita "override", não sobrecarga "overload". A sobrecarga acontece quando criamos vários métodos com o mesmo nome, mas com parâmetros diferentes.

2. Alguns programadores evitam protected porque ele permite que subclasses acessem diretamente atributos da superclasse, o que quebra o encapsulamento. Com private, apenas a própria classe pode acessar o atributo, o que força o uso de getters e setters para controlar o acesso e proteger os dados.

3. Em uma hierarquia de classes, o construtor da superclasse é sempre chamado antes do da subclasse.Se a subclasse não chamar explicitamente com super(), o Java chama o construtor padrão da superclasse automaticamente.Mas se a superclasse não tiver construtor padrão (sem parâmetros), a subclasse é obrigada a chamar um construtor válido da superclasse com super(parametros).

4. 
