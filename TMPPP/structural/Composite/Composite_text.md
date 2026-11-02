====================
[тип] Компоновщик
====================

===============
--Определения--
===============

    > Компоновщик - это структурный паттерн, который объядиняет объекты в древовидные структурный
    формируя "часть/целое". Он позволяет работать с отдельными объектами и группами объектов одинаковым образом

====================
--Основные понятия--
====================

    > Client

    > Component<<interface>> - интерфейс который реализует [Composite] и [Leaf]

    > Composite - соддержит группу состоящие из [Leaf]

    > Leaf - элемент [Composite]

==================
--Принципы Солид--
==================

    (Не нарушает)
        > SRP - [Leaf] и [Composite] имеют одну ответсвенность: представлять объект в
            древовидной структуре и выполнять над ней операции.
        > OCP - можно добавить новый composite/leaf без модификации
        > LSP - объекты [Leaf] и [Composite] могут использоваться вместо [Component] без нарушения поведения программы
        > DIP - клиент работает через абстракцию

    (Нарушает)
        > ISP - общий интерфейс может заставить Leaf реализовывать ненужные методы

================
--Плюсы Минусы--
================

    Плюсы:
        - древовидная структура, которая позволяет работать с группами объектов как с одним целым
        - практически полностью удволетворяет принципы SOLID
        - 


•Ex 1, 2 (2 punct fiecare):
-Explicare sablon:
Intent
Cazuri de utilizare
Diagrame UML
Explicarea claselor componente 
Descrierea claselor
-Exemplificați:
Exemplu unei probleme in care se poate aplica, fiecare clasa din exemplu trebuie sa corespundă diagramei din explicație. Mereu trebuie sa fie un main. Comentarii la fiecare clasa cu corelația la diagrama de pattern si motivare de ce exemplu asta e bun 

•Ex 3(4 punct)  SOLID (2 principii):
definiția 
Exemplu înainte si dupa